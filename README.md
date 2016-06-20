# SISTEMA IMMOBILLY
# DOCUMENTO DE REQUISITOS e MANUAL DE IMPLANTAÇÃO
# Versão 1.0


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
21/06/2016    |  1.0.0      | Especificação dos requisitos funcionais  | Jéderson / Aluísio

# 1 CONSIDERAÇÕES INICIAIS
Em vista a cumprir a primeira etapa da elaboração do projeto para a disciplina de Práticas de Programação, do curso de Analise e Desenvolvimento de Sistema (ADS), IFPB - Cajazeiras, temos a construção desta documentação como forma de descrevermos os requisitos dos sistemas, assim como características para implantação do sistema de controle de frota de veículos da NetLineTelecom.

## 1.1 Descrição
A NetLineTelecom - não possui modelo ou ferramenta para o adequado gerenciamento dos veículos da sua frota. Não existe um adequado controle das revisões dos veículos, assim como a definição por meio de ferramentas confiáveis que descrevam quais dos funcionários, se encontro em posse de dado automóvel, como também não se tem controle das atividades corriqueiras a serem desenvolvidas, tomando como base suas características, se manutenção em instalações, se vistorias de rede, entre outras., e o uso das ferramentas adequadas para cada atividade, deste modo direcionar os veículos que melhor se adeque a está atividade.  Pensando assim os funcionários responsáveis por realizar a administração dos veículos disporão de um modulo no sistema em que serão capazes de descrever atividades características para cada automóvel (se disponíveis e/ou ocupados, realizar consultas e realizar a locação de veículo), além de um modulo administrativo para gerenciar processos necessários ao sistema como cadastro de funcionários, de motoristas, sendo os mesmo com suas adequadas permissões de acessos personalizadas conforme cada perfil ao qual pertence. Ainda como característica do sistema no mesmo será possível realizar a supervisão/acompanhamento dos recursos e dos veículos  permitidos o a liberação ou bloqueio dos mesmos para uso tendo em vista está em processo de revisão, manutenção, entre outras. 

## 1.2 O sistema Immobilly
O sistema será independente necessitando de certa forma apenas de acesso à internet e por meio de browser se autenticar e ter conhecimento conforme a permissão para uso das ferramentas adequadas a resolução de suas atividades.
O sistema possuirá uma arquitetura adequada, capaz de isolar as regras de negócios a sua interface gráfica, em outras palavras, por meio do uso de sua estrutura de negócio será capaz de elabora uma nova interface gráfica sem a devida necessidade de altera o código do modelo de negócio. Deste modo para isso o sistema seguirá o padrão MVC, dividindo-o em três camadas: apresentação/visão, modelo e controle.

![https://github.com/ads-ifpb-praticas-20161/immobilly/blob/master/img/mvc.png][MVC]
 

## 1.3 Objetivo
Este documento tem por objetivo principal apontar os requisitos do sistema de gerenciamento de veículos da empresa NetLineTelecom, fornecendo ao desenvolvimento do projeto as orientações necessárias para a adequada implementação do sistema.

# 2 REQUISITOS
Nesta seção descreveremos os requisitos levantados para a implementação do sistema de gerenciamento de veículos da NetLineTelecom.  Deste modo o levantemnto de requisitos fará-se explicado por meio de caso de uso para melhor ilustrar as funcionalidades e atores do sistema. 

![https://github.com/ads-ifpb-praticas-20161/immobilly/blob/master/img/UseCase%20Diagram0.jpg][Diagrama de caso de uso]


## 2.1 Autenticação no sistema
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

## 2.2 Manter usuários
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

## 2.3 Manter veículos
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


## 2.4 Manter fornecedor
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


## 2.5 Manter locação de veículo
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


## 2.6 Manter manutenção de veículo
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

