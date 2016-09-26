<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>New Fornecedor</title>
            <link rel="stylesheet" type="text/css" href="/projeto-immobilly/" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>New Fornecedor</h1>
            <h:form>
                <h:inputHidden id="validateCreateField" validator="#{fornecedor.validateCreate}" value="value"/>
                <h:panelGrid columns="2">
                    <h:outputText value="Cod:"/>
                    <h:inputText id="cod" value="#{fornecedor.fornecedor.cod}" title="Cod" required="true" requiredMessage="The cod field is required." />
                    <h:outputText value="Email:"/>
                    <h:inputText id="email" value="#{fornecedor.fornecedor.email}" title="Email" />
                    <h:outputText value="Nomefantasia:"/>
                    <h:inputText id="nomefantasia" value="#{fornecedor.fornecedor.nomefantasia}" title="Nomefantasia" />
                    <h:outputText value="Razaosocial:"/>
                    <h:inputText id="razaosocial" value="#{fornecedor.fornecedor.razaosocial}" title="Razaosocial" />
                    <h:outputText value="Telefone:"/>
                    <h:inputText id="telefone" value="#{fornecedor.fornecedor.telefone}" title="Telefone" />
                    <h:outputText value="Bairro:"/>
                    <h:inputText id="bairro" value="#{fornecedor.fornecedor.bairro}" title="Bairro" />
                    <h:outputText value="Cep:"/>
                    <h:inputText id="cep" value="#{fornecedor.fornecedor.cep}" title="Cep" />
                    <h:outputText value="Cidade:"/>
                    <h:inputText id="cidade" value="#{fornecedor.fornecedor.cidade}" title="Cidade" />
                    <h:outputText value="Numero:"/>
                    <h:inputText id="numero" value="#{fornecedor.fornecedor.numero}" title="Numero" />
                    <h:outputText value="Rua:"/>
                    <h:inputText id="rua" value="#{fornecedor.fornecedor.rua}" title="Rua" />
                    <h:outputText value="Uf:"/>
                    <h:inputText id="uf" value="#{fornecedor.fornecedor.uf}" title="Uf" />
                    <h:outputText value="AbastecimentoCollection:"/>
                    <h:selectManyListbox id="abastecimentoCollection" value="#{fornecedor.fornecedor.jsfcrud_transform[jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method.collectionToArray][jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method.arrayToList].abastecimentoCollection}" title="AbastecimentoCollection" size="6" converter="#{abastecimento.converter}" >
                        <f:selectItems value="#{abastecimento.abastecimentoItemsAvailableSelectMany}"/>
                    </h:selectManyListbox>

                </h:panelGrid>
                <br />
                <h:commandLink action="#{fornecedor.create}" value="Create"/>
                <br />
                <br />
                <h:commandLink action="#{fornecedor.listSetup}" value="Show All Fornecedor Items" immediate="true"/>
                <br />

            </h:form>
        </body>
    </html>
</f:view>
