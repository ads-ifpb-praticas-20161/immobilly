# SISTEMA IMMOBILLY
## DOCUMENTO DE REQUISITOS e MANUAL DE IMPLANTAÇÃO DO SISTEMA
## Versão 1.0


### Revisões deste documento e lançamentos
A entrega do sistema será feita seguindo preceitos como MVP (Minimum Viable Product), e assim melhorada a cada etapa do projeto.
Serão descritos as versões seguindo Semantic Versioning.

#### Versões do documento
Versão      |       Alteração               |  Data
----------- | ----------------------------- | ------------
1.0.0       | Primeria versão do documento  | 21/06/2016

#### Histórico de revisão
Data          |   Versão    |               Descrição                  |  Autor(es)
------------- | ----------- | ---------------------------------------- | --------------------------------
21/06/2016    |  1.0.0      | Especificação dos requisitos funcionais  | [Aluísio](https://github.com/AluisioPereira) / [Jéderson](https://github.com/jedersongm) 

# 1 <a name="coninicial">CONSIDERAÇÕES INICIAIS</a>
Em vista a cumprir a primeira etapa da elaboração do projeto para a disciplina de Práticas de Programação, do curso de Análise e Desenvolvimento de Sistema (ADS), IFPB - Cajazeiras, temos a construção desta documentação como forma de descrevermos os requisitos dos sistemas, assim como características para implantação do sistema de controle de frota de veículos da NetLineTelecom.

## 1.1 <a name="d">Descrição</a>
A NetLineTelecom - não possui modelo ou ferramenta para o adequado gerenciamento dos veículos da sua frota. Não existe um adequado controle das revisões dos veículos, assim como a definição por meio de ferramentas confiáveis que descrevam quais dos funcionários, se encontro em posse de dado automóvel, como também não se tem controle das atividades corriqueiras a serem desenvolvidas, tomando como base suas características, se manutenção em instalações, se vistorias de rede, entre outras., e o uso das ferramentas adequadas para cada atividade, deste modo direcionar os veículos que melhor se adeque a está atividade.  Pensando assim os funcionários responsáveis por realizar a administração dos veículos disporão de um modulo no sistema em que serão capazes de descrever atividades características para cada automóvel (se disponíveis e/ou ocupados, realizar consultas e realizar a locação de veículo), além de um modulo administrativo para gerenciar processos necessários ao sistema como cadastro de funcionários, de motoristas, sendo os mesmo com suas adequadas permissões de acessos personalizadas conforme cada perfil ao qual pertence. Ainda como característica do sistema no mesmo será possível realizar a supervisão/acompanhamento dos recursos e dos veículos  permitidos o a liberação ou bloqueio dos mesmos para uso tendo em vista está em processo de revisão, manutenção, entre outras. 

## 1.2 <a name="ost">O sistema Immobilly</a>
O sistema será independente necessitando de certa forma apenas de acesso à internet e por meio de browser se autenticar e ter conhecimento conforme a permissão para uso das ferramentas adequadas a resolução de suas atividades.
O sistema possuirá uma arquitetura adequada, capaz de isolar as regras de negócios a sua interface gráfica, em outras palavras, por meio do uso de sua estrutura de negócio será capaz de elabora uma nova interface gráfica sem a devida necessidade de altera o código do modelo de negócio. Deste modo para isso o sistema seguirá o padrão MVC, dividindo-o em três camadas: apresentação/visão, modelo e controle.

![https://github.com/ads-ifpb-praticas-20161/immobilly/blob/master/img/mvc.png][MVC]
 
[MVC]: https://github.com/ads-ifpb-praticas-20161/immobilly/blob/master/img/mvc.png
## 1.3 <a name="o">Objetivo</a>
Este documento tem por objetivo principal apontar os requisitos do sistema de gerenciamento de veículos da empresa NetLineTelecom, fornecendo ao desenvolvimento do projeto as orientações necessárias para a adequada implementação do sistema.

#<a href="https://github.com/ads-ifpb-praticas-20161/immobilly/wiki/2-REQUISITOS">2 REQUISITOS</a>

# <a name="mer">3 MODELO ENTIDADE-RELACIONAMENTO</a>
Deste modo teremos as especificações dos requistios apresentados descrevendo de melhor modo os objetos (entidades) envolvidos no domínio de negócio, assim como suas características (atributos) assim como elas se relacionam entre si (relacionamentos) conforme modelo entidade-relacionamento que se segue.  

![https://github.com/ads-ifpb-praticas-20161/immobilly/blob/master/img/MER.jpg][Modelo Entidade-Relacionamento]

[Modelo Entidade-Relacionamento]:https://github.com/ads-ifpb-praticas-20161/immobilly/blob/master/img/MER.jpg

# <a name="mis">4 MANUAL DE IMPLANTAÇÃO DO SISTEMA</a>
* clone esse [repositório](https://github.com/ads-ifpb-praticas-20161/immobilly.git);
* extrai e abra o mesmo com uma [IDE](https://pt.wikipedia.org/wiki/Ambiente_de_desenvolvimento_integrado);
* crie um banco de dado (ex.: immobilly), em um ambiente [postgresSQL](https://www.postgresql.org/);
* execute o escript .sql para constração das tabelas;
* no arquivo de .properties mude o usuário e a senha para respectivos valores correspondentes as especificações do seu banco de dados, assim como descreva a url seguido do nome do banco que você atribuiu na hora da construção supracitada;
* limpe e construa a execução deste projeto fazendo uso de recurso da sua IDE;
* copile o projeto; 
* identifique o arquivo .war dentro do diretório target gerado pós copilado projeto;
* copie o citado arquivo .war e cole na pasta webapps de dado Apache Software (recomenda-se o [tomcat 8.0](https://tomcat.apache.org/download-80.cgi)), **caso não use o recomendado procure identificar a pasta de destino no apache de sua escolha**;
* Inicialize o servidor (executando o start servisse) Apache citado;
* abra um navegador browser a seu critério ([Google Chrome](https://support.google.com/chrome/answer/95346?hl=pt-BR) ou [Mozilla Firefox](https://www.mozilla.org/pt-BR/firefox/new/), [Internet Explorer](http://windows.microsoft.com/pt-br/internet-explorer/download-ie)), procure sempre se precaver de usar as versões mais recentes;
* acesse através do http:// seu endereço local (ex.: localhost) : a porta de acesso (ex.: 8080) / o nome do sistema possível de identificar como o mesmo nome do arquivo .war (http://localhost:8080/nomeDoSistema);
* se autentique com seu nome de usuário e senha e acesse as funcionalidades do sistema.
