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


### ÍNDICE

[1. CONSIDERAÇÕES INICIAIS](#user-content-coninicial)<br>
   [1.1 Descrição](#user-content-d)<br>
   [1.2 O sistema Immobilly](#user-content-ost)<br>
   [1.3 Objetivo](#user-content-o)<br>
[2. REQUISITOS](#user-content-requisito)<br>
   [2.1 Autenticação no sistema](#user-content-as)<br>
   [2.2 Manter usuários](#user-content-mu)<br>
   [2.3 Manter veículos](#user-content-mv)<br>
   [2.4 Manter fornecedor](#user-content-mf)<br>
   [2.5 Manter locação de veículo](#user-content-mlv)<br>
   [2.6 Manter manutenção de veículo](#user-content-mmv)<br>
   [2.7 Manter abastecimento do veículo](#user-content-mav)<br>
   [2.8 Manter licenciamento dos veículos](#user-content-mldv)<br>
[3. MODELO ENTIDADE-RELACIONAMENTO](#user-content-mer)<br>
[4. MANUAL DE IMPLANTAÇÃO DO SISTEMA](#user-content-mis)<br>

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

# 2 <a name="requisito">REQUISITOS</a>
Nesta seção descreveremos os requisitos levantados para a implementação do sistema de gerenciamento de veículos da NetLineTelecom.  Deste modo o levantemnto de requisitos fará-se explicado por meio de caso de uso para melhor ilustrar as funcionalidades e atores do sistema, conforme diagram de caso de uso seguinte. 

![https://github.com/ads-ifpb-praticas-20161/immobilly/blob/master/img/UseCase%20Diagram0.jpg?raw=true][Diagrama de caso de uso]

[Diagrama de caso de uso]: https://github.com/ads-ifpb-praticas-20161/immobilly/blob/master/img/UseCase%20Diagram0.jpg?raw=true

## 2.1 <a name="as">Autenticação no sistema</a>
Tal caso de uso permitirá aos usuários em cada especificidade se autenticarem no sistema e desta forma será apresentado as funcionalidades disponíveis para cada usuário conforme o papel.

### Atores envolvidos
Todos os atores usuários do sistema estão envolvidos neste caso de uso.

### Pré-condições
Para a realização deste caso de uso é necessário a existência de pelo menos um administrador do sistema, deste modo no ato da instalação do sistema este deve ser cadastrado. 

### Pós-condições 
Exibição das funcionalidades adequadas para cada papel exercido pelo usuário. 

### Fluxo principal
Passo     |                    Descrição
--------- | -------------------------------------------------------------------------------
1.        | Inicia-se o fluxo quando o usuário deseja acessar as funcionalidades do sistema.
2.        | O sistema solicita a autenticação, em que o usuário deve fornecer a autenticação do seu (usuário e senha).
3.        | O usuário entra com os dados de usuário e senha (A01).
4.        | É apresentado a tela do sistema com as funcionalidades adequada ao papel de usuários autenticado. 
5.        | O caso de uso é encerrado.

### Fluxo alternativo
Passo     |                    Descrição
--------- | --------------------------------------------------------------------------------------------------------------------
1.        |    Inicia-se o fluxo se o usuário entra com dados incorretos de usuário e senha no sistema.
2.        |  O sistema informará que os dados estão incorretos nome de usuário ou senha.

## 2.2 <a name="mu">Manter usuários</a>
Tal caso de uso possibilitará ao administrador e o supervisor gerenciar os usuários de variados papéis além de promover funcionalidade para inserir, alterar, consultar e excluir os mesmos. 

### Atores envolvidos
Administrador, Supervisor.

### Pré-condições
Para a realização deste caso de uso é necessário a existência de pelo menos um administrador do sistema, deste modo no ato da instalação do sistema este deve ser cadastrado. Assim como se faz necessário que o usuário se autentique no sistema, conforme caso de uso anterior.

### Pós-condições 
Nenhuma. 

### Fluxo principal
Passo      |                    Descrição
---------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------
1.         | Inicia-se o fluxo quando dado usuário tipo com papel de administrador ou supervisor se autentica no sistema e seleciona a opção de gerenciar usuários.
2.         | O sistema apresenta um ambiente para o adequado gerenciamento de usuários listando todos os usuários já cadastrados 

### Fluxo alternativo – cadastrar usuário colaborador
Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | Administrador ou supervisor clica na opção de cadastrar novo usuário colaborador.
2.         | O sistema apresentar uma tela de formulário para inserção dos dados de (CPF, nome, data nascimento, sexo, e-mail, cargo, telefone_celular, endereço (rua, nº, bairro, cep, cidade, estado), cnh(renach, categoria,  validade).
3.         | O sistema verifica se os dados estão válidos 
4.         | O sistema cadastra o usuário na base de dados 
5.         | O caso de uso é encerrado

### Fluxo alternativo – editar usuário colaborador
Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | Administrador ou supervisor seleciona um usuário da lista de usuários já cadastrados.
2.         | O administrador ou supervisor clica na opção editar usuário
3.         | O sistema exibi um ambiente de formulário para as devidas edições dos ados do usuário. 
4.         | O administrador ou supervisor editar os dados desejados
5.         | O administrador ou supervisor clica na opção salvar
6.         | O sistema altera as informações editadas na base de dados
7.         | O caso de uso é encerrado.

### Fluxo alternativo – excluir usuário colaborador
Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | Administrador ou supervisor seleciona um usuário da lista de usuários já cadastrados.
2.         | O administrador ou supervisor clica na opção excluir usuário
3.         | O sistema exibi uma mensagem de confirmação da exclusão 
4.         | O usuário confirma a operação
5.         | O sistema remove o registro desejado da base de dados.
6.         | O caso de uso é encerrado.

### Fluxo alternativo – buscar usuário colaborador

Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | Administrador ou supervisor seleciona a caixa de texto de pesquisa de usuários 
2.         | Administrador ou supervisor digita o texto desejado para a realização da busca 
3.         | O sistema exibi uma lista de usuários correspondentes ao texto digitado.
4.         | O caso de uso é encerrado.

## 2.3 <a name="mv">Manter veículos</a>
Tal caso de uso possibilitará ao administrador e o supervisor gerenciar os veículos da frota além de promover funcionalidade para inserir, alterar, consultar e excluir os mesmos. 

### Atores envolvidos
Administrador, Supervisor.

### Pré-condições
Para a realização deste caso de uso é necessário a existência de pelo menos um administrador do sistema, deste modo no ato da instalação do sistema este deve ser cadastrado. Assim como se faz necessário que o usuário se autentique no sistema, conforme caso de uso anterior.

### Pós-condições 
Nenhuma. 

### Fluxo principal
Passo      |                    Descrição
---------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------
1.         | Inicia-se o fluxo quando dado usuário com papel de administrador ou supervisor se autentica no sistema e seleciona a opção de gerenciar veículos.
2.         | O sistema apresenta um ambiente para o adequado gerenciamento de veículos listando todos os automóveis já cadastrados 

### Fluxo alternativo – cadastrar veículo
Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | Administrador ou supervisor clica na opção de cadastrar novo veículo.
2.         | O sistema apresentar uma tela de formulário para inserção dos dados de modelo, fabricante, ano fabricação, cor, chassi, km rodados, (placa, cidade, estado), categoria, combustível e status (disponível, reservado, locado, manutenção).
3.         | O sistema verifica se os dados estão válidos 
4.         | O sistema cadastra o veículo na base de dados 
5.         | O caso de uso é encerrado

### Fluxo alternativo – editar veículo
Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | Administrador ou supervisor seleciona um veículo da lista de automóveis já cadastrados.
2.         | O administrador ou supervisor clica na opção editar veículo
3.         | O sistema exibi um ambiente de formulário para as devidas edições dos dados do veículo. 
4.         | O administrador ou supervisor editar os dados desejados
5.         | O administrador ou supervisor clica na opção salvar
6.         | O sistema altera as informações editadas na base de dados
7.         | O caso de uso é encerrado.

### Fluxo alternativo – excluir veículo
Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | Administrador ou supervisor seleciona um veículo da lista de automóveis já cadastrados.
2.         | O administrador ou supervisor clica na opção excluir veículo
3.         | O sistema exibi uma mensagem de confirmação da exclusão 
4.         | O usuário confirma a operação
5.         | O sistema remove o registro desejado da base de dados.
6.         | O caso de uso é encerrado.

### Fluxo alternativo – buscar veículo

Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | Administrador ou supervisor seleciona a caixa de texto de pesquisa de veículo 
2.         | Administrador ou supervisor digita o texto desejado para a realização da busca 
3.         | O sistema exibi uma lista de automóveis correspondentes ao texto digitado.
4.         | O caso de uso é encerrado.


## 2.4 <a name="mf">Manter fornecedor</a>
Tal caso de uso possibilitará ao administrador e o supervisor gerenciar os fornecedores de recursos a serem usados nas atividades com os veículos além de promover funcionalidade para inserir, alterar, consultar e excluir os fornecedores. 

### Atores envolvidos
Administrador, Supervisor.

### Pré-condições
Para a realização deste caso de uso é necessário a existência de pelo menos um administrador do sistema, deste modo no ato da instalação do sistema este deve ser cadastrado. Assim como se faz necessário que o usuário se autentique no sistema, conforme caso de uso anterior.

### Pós-condições 
Nenhuma. 

### Fluxo principal
Passo      |                    Descrição
---------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------
1.         | Inicia-se o fluxo quando dado usuário com papel de administrador ou supervisor se autentica no sistema e seleciona a opção de gerenciar fornecedores.
2.         | O sistema apresenta um ambiente para o adequado gerenciamento de fornecedores listando todos os fornecedores já devidamente cadastrados 

### Fluxo alternativo – cadastrar novo fornecedor
Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | Administrador ou supervisor clica na opção de cadastrar novo fornecedor.
2.         | O sistema apresentar uma tela de formulário para inserção dos dados razão social, nome fantasia, CNPJ, categoria, endereço (rua, nº, bairro, cep, cidade, estado), serviço/recurso prestado.
3.         | O sistema verifica se os dados estão válidos 
4.         | O sistema cadastra o fornecedor na base de dados 
5.         | O caso de uso é encerrado

### Fluxo alternativo – editar fornecedor
Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | Administrador ou supervisor seleciona um fornecedor da lista de fornecedores devidamente já cadastrados.
2.         | O administrador ou supervisor clica na opção editar fornecedor
3.         | O sistema exibi um ambiente de formulário para as devidas edições dos dados do fornecedor. 
4.         | O administrador ou supervisor editar os dados desejados
5.         | O administrador ou supervisor clica na opção salvar
6.         | O sistema altera as informações editadas na base de dados
7.         | O caso de uso é encerrado.

### Fluxo alternativo – excluir fornecedor
Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | Administrador ou supervisor seleciona um fornecedor da lista dos já cadastrados.
2.         | O administrador ou supervisor clica na opção excluir fornecedor
3.         | O sistema exibi uma mensagem de confirmação da exclusão 
4.         | O usuário confirma a operação
5.         | O sistema remove o registro desejado da base de dados.
6.         | O caso de uso é encerrado.

### Fluxo alternativo – buscar fornecedor

Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | Administrador ou supervisor seleciona a caixa de texto de pesquisa de fornecedor 
2.         | Administrador ou supervisor digita o texto desejado para a realização da busca 
3.         | O sistema exibi uma lista de fornecedores correspondentes ao texto digitado.
4.         | O caso de uso é encerrado.


## 2.5 <a name="mlv">Manter locação de veículo</a>
Tal caso de uso possibilitará ao colaborador alocar um veículo para a realização das atividades a serem desenvolvidas em dado tempo além de promover funcionalidade para inserir, alterar, consultar e excluir suas alocações. 

### Atores envolvidos
Colaborador.

### Pré-condições
Para a realização deste caso de uso é necessário o usuário do tipo colaborador esteja devidamente cadastrado no sistema assim como o mesmo se autentique conforme caso de uso anterior. 

### Pós-condições 
Nenhuma. 

### Fluxo principal
Passo      |                    Descrição
---------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------
1.         | Inicia-se o fluxo quando dado usuário do tipo colaborador se autentica no sistema e seleciona a opção de gerenciar minhas locações de veículo.
2.         | O sistema apresenta um ambiente para o adequado gerenciamento das alocações de veículos listando todas as alocações do usuário.

### Fluxo alternativo – realizar nova locação de veículo
Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | O colaborador clica na opção de realizar nova colação de veículo.
2.         | O sistema apresentar uma tela de formulário para inserção dos dados de data e horário de início e data e horário de término da locação, assim como selecionar um veículo para a realização da alocação. 
3.         | O sistema verifica se colaborador tem autorização para realizar a locação e se os dados estão válidos, assim como se o veículo está disponível ou ocupado para o horário descrito. 
4.         | O sistema cadastra a realização da nova locação de veículo 
5.         | O caso de uso é encerrado

### Fluxo alternativo – editar locação de veículo
Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | O colaborador clica em uma de suas alocações de veículo da lista de alocações devidamente já registradas.
2.         | O colaborador clica na opção editar locação de veículo.
3.         | O sistema exibi um ambiente de formulário para as devidas edições dos dados da locação de veículo. 
4.         | O colaborador editar os dados desejados
5.         | O colaborador clica na opção salvar
6.         | O sistema altera as informações editadas na base de dados
7.         | O caso de uso é encerrado.

### Fluxo alternativo – excluir locação de veículo
Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | O colaborador seleciona uma locação de veículo da lista das já cadastradas.
2.         | O colaborador clica na opção locação de veículo.
3.         | O sistema exibi uma mensagem de confirmação da exclusão 
4.         | O usuário confirma a operação.
5.         | O sistema remove o registro desejado da base de dados.
6.         | O caso de uso é encerrado.

### Fluxo alternativo – buscar locação de veículo

Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | O Colaborador seleciona a caixa de texto de pesquisa de locação de veículo
2.         | O Colaborador digita o texto desejado para a realização da busca 
3.         | O sistema exibi uma lista de locação de veículo correspondentes ao texto digitado.
4.         | O caso de uso é encerrado.


## 2.6 <a name="mmv">Manter manutenção de veículo</a>
Tal caso de uso possibilitará ao supervisor gerenciar as manutenções dos veículos da frota da empresa além de promover funcionalidade para inserir, alterar, consultar e excluir as devidas manutenções. 

### Atores envolvidos
Supervisor.

### Pré-condições
Para a realização deste caso de uso é necessário o usuário do tipo supervisor esteja devidamente cadastrado no sistema assim como o mesmo se autentique conforme caso de uso anterior. 

### Pós-condições 
Nenhuma. 

### Fluxo principal
Passo      |                    Descrição
---------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------
1.         | Inicia-se o fluxo quando dado usuário do tipo supervisor se autentica no sistema e seleciona a opção de gerenciar manutenção dos veículos.
2.         | O sistema apresenta um ambiente para o adequado gerenciamento das manutenções dos veículos listando.


### Fluxo alternativo – cadastrar nova manutenção de veículo
Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | O supervisor clica na opção de cadastrar nova manutenção de veículo
2.         | O sistema apresentar uma tela de formulário para seleção do veículo a ser levado para manutenção inserção dos dados de data e horário para retirada do veículo para manutenção, quilômetros (km) rodados, assim como o motivo da manutenção e a empresa responsável pelo serviço. 
3.         | O sistema verifica se os dados estão válidos, assim como se o veículo tem alocações para o horário descrito. 
4.         | O sistema cadastra a realização da nova manutenção de veículo
5.         | O caso de uso é encerrado

### Fluxo alternativo – finalizar manutenção de veículo
Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | O supervisor clica em uma manutenção de veículo da lista de manutenção devidamente registradas.
2.         | O supervisor clica na opção finalizar manutenção de veículo.
3.         | O sistema exibi um ambiente de formulário descrição da manutenção (peças trocadas, entre outras características) valor, data e horário, assim como quilometragem da chegado do veículo.
4.         | O supervisor informa os dados solicitados.
5.         | O supervisor clica na opção salvar
6.         | O sistema salva as informações preenchidas na base de dados
7.         | O caso de uso é encerrado.


### Fluxo alternativo – editar manutenção de veículo
Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | O supervisor clica em uma manutenção de veículo da lista de manutenção devidamente registradas.
2.         | O supervisor clica na opção editar manutenção de veículo.
3.         | O sistema exibi um ambiente de formulário para as devidas edições dos dados da manutenção de veículo.
4.         | O supervisor edita os dados desejados
5.         | O supervisor clica na opção salvar
6.         | O sistema altera as informações editadas na base de dados
7.         | O caso de uso é encerrado.

### Fluxo alternativo – excluir manutenção de veículo
Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | O supervisor seleciona uma manutenção de veículo da lista das já cadastradas.
2.         | O supervisor clica na opção excluir manutenção de veículo
3.         | O sistema exibi uma mensagem de confirmação da exclusão 
4.         | O usuário confirma a operação.
5.         | O sistema remove o registro desejado da base de dados.
6.         | O caso de uso é encerrado.

### Fluxo alternativo – buscar manutenção de veículo

Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | O supervisor seleciona a caixa de texto de pesquisa de manutenção de veículo
2.         | O supervisor digita o texto desejado para a realização da busca 
3.         | O sistema exibi uma lista de manutenção de veículo correspondentes ao texto digitado.
4.         | O caso de uso é encerrado.

## 2.7 <a name="mav">Manter abastecimento do veículo</a>
Tal caso de uso possibilitará ao supervisor gerenciar os abastecimentos dos veículos da frota da empresa além de promover funcionalidade para inserir, alterar, consultar e excluir os devidos abastecimentos. 

### Atores envolvidos
Supervisor.

### Pré-condições
Para a realização deste caso de uso é necessário o usuário do tipo supervisor esteja devidamente cadastrado no sistema assim como o mesmo se autentique conforme caso de uso anterior. 

### Pós-condições 
Nenhuma. 

### Fluxo principal
Passo      |                    Descrição
---------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------
1.         | Inicia-se o fluxo quando dado usuário do tipo supervisor se autentica no sistema e seleciona a opção de gerenciar abastecimentos dos veículos.
2.         | O sistema apresenta um ambiente para o adequado gerenciamento dos abastecimentos dos veículos listado.


### Fluxo alternativo – cadastrar novo abastecimento do veículo
Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | O supervisor clica na opção de cadastrar novo abastecimento de veículo
2.         | O sistema apresentar uma tela de formulário para seleção do veículo a ser abastecido, inserção dos dados do posto onde realizou o abastecimento, a data e hora, quantidade de combustível, valor por litro, valor do abastecimento. 
3.         | O sistema verifica se os dados são válidos. 
4.         | O sistema cadastra a realização do novo abastecimento do veículo.
5.         | O caso de uso é encerrado


### Fluxo alternativo – editar abastecimento do veículo
Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | O supervisor clica em um abastecimento dos veículos da lista de abastecimentos devidamente registrados.
2.         | O supervisor clica na opção editar abastecimentos dos veículos.
3.         | O sistema exibi um ambiente de formulário para as devidas edições dos dados do abastecimento do veículo.
4.         | O supervisor edita os dados desejados
5.         | O supervisor clica na opção salvar
6.         | O sistema altera as informações editadas na base de dados
7.         | O caso de uso é encerrado.

### Fluxo alternativo – excluir abastecimento do veículo
Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | O supervisor seleciona um abastecimento do veículo da lista dos já cadastrados.
2.         | O supervisor clica na opção excluir abastecimento do veículo
3.         | O sistema exibi uma mensagem de confirmação da exclusão 
4.         | O usuário confirma a operação.
5.         | O sistema remove o registro desejado da base de dados.
6.         | O caso de uso é encerrado.

### Fluxo alternativo – buscar abastecimento do veículo

Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | O supervisor seleciona a caixa de texto de pesquisa de abastecimento do veículo
2.         | O supervisor digita o texto desejado para a realização da busca 
3.         | O sistema exibi uma lista de abastecimento do veículo correspondentes ao texto digitado.
4.         | O caso de uso é encerrado.

## 2.8 <a name="mldv">Manter licenciamento dos veículos</a>
Tal caso de uso possibilitará ao supervisor gerenciar os licenciamento dos veículos da frota da empresa além de promover funcionalidade para inserir, alterar, consultar e excluir os devidos licenciamento dos veículos. 

### Atores envolvidos
Supervisor.

### Pré-condições
Para a realização deste caso de uso é necessário o usuário do tipo supervisor esteja devidamente cadastrado no sistema assim como o mesmo se autentique conforme caso de uso anterior. 

### Pós-condições 
Nenhuma. 

### Fluxo principal
Passo      |                    Descrição
---------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------
1.         | Inicia-se o fluxo quando dado usuário do tipo supervisor se autentica no sistema e seleciona a opção de gerenciar licenciamento dos veículos.
2.         | O sistema apresenta um ambiente para o adequado gerenciamento do licenciamento dos veículos listado.


### Fluxo alternativo – cadastrar novo licenciamento de veículo
Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | O supervisor clica na opção de cadastrar novo licenciamento para veículo
2.         | O sistema apresentar uma tela de formulário para seleção do veículo e a inserção dos dados do ano, data de referência do licenciamento e do valor pago.
3.         | O sistema verifica se os dados são válidos. 
4.         | O sistema cadastra a realização do novo licenciamento do veículo.
5.         | O caso de uso é encerrado


### Fluxo alternativo – editar licenciamento de veículo.
Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | O supervisor clica em um licenciamento de veículo da lista de licenciamentos devidamente registrados.
2.         | O supervisor clica na opção editar licenciamento do veículo.
3.         | O sistema exibi um ambiente de formulário para as devidas edições dos dados do licenciamento do veículo..
4.         | O supervisor edita os dados desejados
5.         | O supervisor clica na opção salvar
6.         | O sistema altera as informações editadas na base de dados
7.         | O caso de uso é encerrado.

### Fluxo alternativo – excluir licenciamento de veículo.
Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | O supervisor seleciona um licenciamento de veículo da lista dos já cadastrados.
2.         | O supervisor clica na opção excluir licenciamento do veículo.
3.         | O sistema exibi uma mensagem de confirmação da exclusão 
4.         | O usuário confirma a operação.
5.         | O sistema remove o registro desejado da base de dados.
6.         | O caso de uso é encerrado.

### Fluxo alternativo – buscar licenciamento de veículo.

Passo      |                    Descrição
---------- | --------------------------------------------------------------------------------------------------------------------------------------------------
1.         | O supervisor seleciona a caixa de texto de pesquisa de licenciamento de veículo.
2.         | O supervisor digita o texto desejado para a realização da busca do licenciamento.
3.         | O sistema exibi uma lista de licenciamento do veículo correspondentes ao texto digitado.
4.         | O caso de uso é encerrado.

# <a name="mer">3 MODELO ENTIDADE-RELACIONAMENTO</a>
Deste modo teremos as especificações dos requistios apresentados descrevendo de melhor modo os objetos (entidades) envolvidos no domínio de negócio, assim como suas características (atributos) assim como elas se relacionam entre si (relacionamentos) conforme modelo entidade-relacionamento que se segue.  

![https://github.com/ads-ifpb-praticas-20161/immobilly/blob/master/img/MER.jpg?][Modelo Entidade-Relacionamento]

[Diagrama de caso de uso]: https://github.com/ads-ifpb-praticas-20161/immobilly/blob/master/img/MER.jpg?

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