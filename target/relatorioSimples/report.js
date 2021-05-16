$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Post.feature");
formatter.feature({
  "line": 1,
  "name": "Consulta",
  "description": "",
  "id": "consulta",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7448327200,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Consulta pelo curso Mantis",
  "description": "",
  "id": "consulta;consulta-pelo-curso-mantis",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "que acesso o site da iterays",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "pesquiso por \"Mantis\"",
  "keyword": "When "
});
formatter.match({
  "location": "Post.que_acesso_o_site_da_iterays()"
});
formatter.result({
  "duration": 6789107700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mantis",
      "offset": 14
    }
  ],
  "location": "Post.pesquiso_por(String)"
});
formatter.result({
  "duration": 13894722600,
  "status": "passed"
});
formatter.after({
  "duration": 40540410100,
  "status": "passed"
});
});