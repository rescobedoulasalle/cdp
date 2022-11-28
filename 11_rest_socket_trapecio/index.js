var express = require("express");
var bodyParser = require('body-parser');
var app = express();
app.use(bodyParser.json());

const udp = require('dgram')
const conf = require('./config/config')

// creating a client socket
const client = udp.createSocket('udp4')

app.get('/', function (req, res) {
  console.log("¡Alguien ingreso a la raiz de nuestra WebApp!");
  res.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
  res.write("<h2>Bienvenido a nuestra WebApp</h2>");
  res.end();
});

app.get('/trapecio', function (req, res) {
  console.log("¡Alguien conoce la URL del método del trapecio!");
  res.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
  res.write("<h2>Método del trapecio</h2>");
  res.end();
});

app.post('/trapecio', function (req, res) {
    console.log(req.body);      // your JSON
    var jsonRequest = req.body;
    var a = jsonRequest.a;
    var b = jsonRequest.b;
    var f = jsonRequest.function;
    var jsonResponse = {};
    var x = a;
    var base = eval(f);    
    x = b;
    var BASE = eval(f);
    
    const data = Buffer.from(f)
    //sending msg
    client.send(data, conf.port, conf.host, error => {
        if (error) {
            console.log(error)
            client.close()
        } else {
            console.log('Data sent !!!')
        }
    })
    setTimeout( () => {
        client.close()
    },conf.timeout)
    
    //jsonResponse.area = b;
    jsonResponse.area = ((base+BASE)/2)*(b-a);
    res.send(jsonResponse);
    //buffer msg
    
    
});

app.listen(3000, () => {
 console.log("El servidor está inicializado en el puerto 3000");
});
