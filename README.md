# Geração de Logs para o ELK Stack

ELK é um acrônimo para três diferentes projetos de código aberto: _Elasticsearch_, _Logstash_ e _Kibana_. _Elasticsearch_ é  uma  ferramenta  de  busca  e _analytics_. _Logstash_ é definido como um _server-side pipeline_ de processamento de dados que os coleta de várias fontes  simultaneamente,  aplica transformações  e  depois  envia  para  o _Elasticsearch_. O _Kibana_ é a ferramenta que permite a visualização dos dados do _Elasticsearch_ em gráficos e _dashboards_.
Fonte: https://www.elastic.co/what-is/elk-stack

A aplicação criada gera logs simples que são coletados pelo _Filebeat_. Os _logs_ são gerados no diretório /tmp/elk-log-test.
