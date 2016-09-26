<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>New Colaborador</title>
            <link rel="stylesheet" type="text/css" href="/projeto-immobilly/" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>New Colaborador</h1>
            <h:form>
                <h:inputHidden id="validateCreateField" validator="#{colaborador.validateCreate}" value="value"/>
                <h:panelGrid columns="2">
                    <h:outputText value="Cod:"/>
                    <h:inputText id="cod" value="#{colaborador.colaborador.cod}" title="Cod" required="true" requiredMessage="The cod field is required." />
                    <h:outputText value="Cargo:"/>
                    <h:inputText id="cargo" value="#{colaborador.colaborador.cargo}" title="Cargo" />
                    <h:outputText value="Celular:"/>
                    <h:inputText id="celular" value="#{colaborador.colaborador.celular}" title="Celular" />
                    <h:outputText value="Datanascimento (MM/dd/yyyy):"/>
                    <h:inputText id="datanascimento" value="#{colaborador.colaborador.datanascimento}" title="Datanascimento" >
                        <f:convertDateTime pattern="MM/dd/yyyy" />
                    </h:inputText>
                    <h:outputText value="Email:"/>
                    <h:inputText id="email" value="#{colaborador.colaborador.email}" title="Email" />
                    <h:outputText value="Nome:"/>
                    <h:inputText id="nome" value="#{colaborador.colaborador.nome}" title="Nome" />
                    <h:outputText value="Senha:"/>
                    <h:inputText id="senha" value="#{colaborador.colaborador.senha}" title="Senha" />
                    <h:outputText value="Sexo:"/>
                    <h:inputText id="sexo" value="#{colaborador.colaborador.sexo}" title="Sexo" />
                    <h:outputText value="Categoria:"/>
                    <h:inputText id="categoria" value="#{colaborador.colaborador.categoria}" title="Categoria" />
                    <h:outputText value="Renach:"/>
                    <h:inputText id="renach" value="#{colaborador.colaborador.renach}" title="Renach" />
                    <h:outputText value="Validade (MM/dd/yyyy):"/>
                    <h:inputText id="validade" value="#{colaborador.colaborador.validade}" title="Validade" >
                        <f:convertDateTime pattern="MM/dd/yyyy" />
                    </h:inputText>
                    <h:outputText value="Bairro:"/>
                    <h:inputText id="bairro" value="#{colaborador.colaborador.bairro}" title="Bairro" />
                    <h:outputText value="Cep:"/>
                    <h:inputText id="cep" value="#{colaborador.colaborador.cep}" title="Cep" />
                    <h:outputText value="Cidade:"/>
                    <h:inputText id="cidade" value="#{colaborador.colaborador.cidade}" title="Cidade" />
                    <h:outputText value="Numero:"/>
                    <h:inputText id="numero" value="#{colaborador.colaborador.numero}" title="Numero" />
                    <h:outputText value="Rua:"/>
                    <h:inputText id="rua" value="#{colaborador.colaborador.rua}" title="Rua" />
                    <h:outputText value="Uf:"/>
                    <h:inputText id="uf" value="#{colaborador.colaborador.uf}" title="Uf" />
                    <h:outputText value="LocacaoCollection:"/>
                    <h:selectManyListbox id="locacaoCollection" value="#{colaborador.colaborador.jsfcrud_transform[jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method.collectionToArray][jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method.arrayToList].locacaoCollection}" title="LocacaoCollection" size="6" converter="#{locacao.converter}" >
                        <f:selectItems value="#{locacao.locacaoItemsAvailableSelectMany}"/>
                    </h:selectManyListbox>
                    <h:outputText value="ReservaCollection:"/>
                    <h:selectManyListbox id="reservaCollection" value="#{colaborador.colaborador.jsfcrud_transform[jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method.collectionToArray][jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method.arrayToList].reservaCollection}" title="ReservaCollection" size="6" converter="#{reserva.converter}" >
                        <f:selectItems value="#{reserva.reservaItemsAvailableSelectMany}"/>
                    </h:selectManyListbox>

                </h:panelGrid>
                <br />
                <h:commandLink action="#{colaborador.create}" value="Create"/>
                <br />
                <br />
                <h:commandLink action="#{colaborador.listSetup}" value="Show All Colaborador Items" immediate="true"/>
                <br />

            </h:form>
        </body>
    </html>
</f:view>
