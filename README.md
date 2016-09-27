# SISTEMA IMMOBILLY
[![Build Status](https://travis-ci.org/ads-ifpb-praticas-20161/immobilly.svg?branch=bWeb)](https://travis-ci.org/ads-ifpb-praticas-20161/immobilly)

## DOCUMENTO DE REQUISITOS e MANUAL DE IMPLANTAÇÃO DO SISTEMA
## Versão 1.1


### Revisões deste documento e lançamentos
A entrega do sistema será feita seguindo preceitos como MVP (Minimum Viable Product), e assim melhorada a cada etapa do projeto.
Serão descritos as versões seguindo Semantic Versioning.

#### Versões do documento
Versão      |       Alteração               |  Data
----------- | ----------------------------- | ------------
1.0.0       | Primeria versão do documento  | 21/06/2016
1.0.1       | segunda versão do documento   | 06/08/2016
1.0.2       | terceira versão do documento  | 06/08/2016

#### Histórico de revisão
Data          |   Versão    |               Descrição                  |  Autor(es)
------------- | ----------- | ---------------------------------------- | --------------------------------
27/09/2016    |  1.1.0      |          3 versão do projeto             | [Aluísio](https://github.com/AluisioPereira) 

# 1 <a name="coninicial">CONSIDERAÇÕES INICIAIS</a>
Em vista a cumprir a primeira etapa da elaboração do projeto para a disciplina de Práticas de Programação, do curso de Análise e Desenvolvimento de Sistema (ADS), IFPB - Cajazeiras, temos a construção desta documentação como forma de descrevermos os requisitos dos sistemas, assim como características para implantação do sistema de controle de frota de veículos da NetLineTelecom.

## 1.1 <a name="d">Descrição</a>
A NetLineTelecom - não possui modelo ou ferramenta para o adequado gerenciamento dos veículos da sua frota. Não existe um adequado controle das revisões dos veículos, assim como a definição por meio de ferramentas confiáveis que descrevam quais dos funcionários, se encontro em posse de dado automóvel, como também não se tem controle das atividades corriqueiras a serem desenvolvidas, tomando como base suas características, se manutenção em instalações, se vistorias de rede, entre outras., e o uso das ferramentas adequadas para cada atividade, deste modo direcionar os veículos que melhor se adeque a está atividade.  Pensando assim os funcionários responsáveis por realizar a administração dos veículos disporão de um modulo no sistema em que serão capazes de descrever atividades características para cada automóvel (se disponíveis e/ou ocupados, realizar consultas e realizar a locação de veículo), além de um modulo administrativo para gerenciar processos necessários ao sistema como cadastro de funcionários, de motoristas, sendo os mesmo com suas adequadas permissões de acessos personalizadas conforme cada perfil ao qual pertence. Ainda como característica do sistema no mesmo será possível realizar a supervisão/acompanhamento dos recursos e dos veículos  permitidos o a liberação ou bloqueio dos mesmos para uso tendo em vista está em processo de revisão, manutenção, entre outras. 

## 1.2 <a name="ost">O sistema Immobilly</a>
O sistema será independente necessitando de certa forma apenas de acesso à internet e por meio de browser se autenticar e ter conhecimento conforme a permissão para uso das ferramentas adequadas a resolução de suas atividades.
O sistema possuirá uma arquitetura adequada, capaz de isolar as regras de negócios a sua interface gráfica, em outras palavras, por meio do uso de sua estrutura de negócio será capaz de elabora uma nova interface gráfica sem a devida necessidade de altera o código do modelo de negócio. Deste modo para isso o sistema seguirá o padrão MVC, dividindo-o em três camadas: apresentação/visão, modelo e controle.

## 1.3 <a name="o">Objetivo</a>
Este documento tem por objetivo principal apontar os requisitos do sistema de gerenciamento de veículos da empresa NetLineTelecom, fornecendo ao desenvolvimento do projeto as orientações necessárias para a adequada implementação do sistema.

#<a href="https://github.com/ads-ifpb-praticas-20161/immobilly/wiki/2-REQUISITOS">2 REQUISITOS</a>

# <a name="mer">3 MODELO ENTIDADE-RELACIONAMENTO</a>
Deste modo teremos as especificações dos requistios apresentados descrevendo de melhor modo os objetos (entidades) envolvidos no domínio de negócio, assim como suas características (atributos) assim como elas se relacionam entre si (relacionamentos) conforme modelo entidade-relacionamento que se segue.  

![https://github.com/ads-ifpb-praticas-20161/immobilly/blob/bWeb/src/main/java/br/edu/ifpb/ads/praticas/immobilly/diagrama/MERaposCorrecao.jpa.png][Modelo Entidade-Relacionamento]

[Modelo Entidade-Relacionamento]:https://github.com/ads-ifpb-praticas-20161/immobilly/blob/bWeb/src/main/java/br/edu/ifpb/ads/praticas/immobilly/diagrama/MERaposCorrecao.jpa.png

# <a name="mis">4 MANUAL DE IMPLANTAÇÃO DO SISTEMA</a>
* crie um banco de dado (ex.: immobilly), em um ambiente postgresSQL ou outro de sua preferência;
* execute o script sql no referedio banco criado (arquivo banco.sql) que se encontra em src/main/setup;
* configure o arquivo glassfish-resources.xml (projeto-immobilly\src\main\setups) (com as configurações do banco que você especificou, nome do banco, usuário, senha, caminho do banco - url);
* limpe e construa a execução deste projeto com o comando Maven apropriado (mvn clean install), estando dentro da pasta raiz de cada modolo;
* identifique o arquivo projeto-immobilly-1.0.2.war dentro do diretório target gerado dentro do módolo do projeto;
* copie o citado arquivo .war e cole na pasta webapps de dado servidor web (recomenda-se o GlassFish Server 4.1.1), caso não use o recomendado procure identificar a pasta de destino no apache de sua escolha;
* Inicialize o servidor (executando o start servisse);
* abra um navegador browser a seu critério (Google Chrome ou Mozilla Firefox, Internet Explorer), procure sempre se precaver de usar as versões mais recentes;
* acesse através do http:// seu endereço local (ex.: localhost) : a porta de acesso (ex.: 8080) / o nome do sistema possível de identificar como o mesmo nome do arquivo .war (http://localhost:8080/nomeDoSistema);
* se autentique com seu nome de usuário e senha e acesse as funcionalidades do sistema.