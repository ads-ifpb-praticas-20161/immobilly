<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>New Abastecimento</title>
            <link rel="stylesheet" type="text/css" href="/projeto-immobilly/" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>New Abastecimento</h1>
            <h:form>
                <h:inputHidden id="validateCreateField" validator="#{abastecimento.validateCreate}" value="value"/>
                <h:panelGrid columns="2">
                    <h:outputText value="Abastecimentoid:"/>
                    <h:inputText id="abastecimentoid" value="#{abastecimento.abastecimento.abastecimentoid}" title="Abastecimentoid" required="true" requiredMessage="The abastecimentoid field is required." />
                    <h:outputText value="Horario (MM/dd/yyyy HH:mm:ss):"/>
                    <h:inputText id="horario" value="#{abastecimento.abastecimento.horario}" title="Horario" >
                        <f:convertDateTime pattern="MM/dd/yyyy HH:mm:ss" />
                    </h:inputText>
                    <h:outputText value="Km:"/>
                    <h:inputText id="km" value="#{abastecimento.abastecimento.km}" title="Km" />
                    <h:outputText value="Quantidade:"/>
                    <h:inputText id="quantidade" value="#{abastecimento.abastecimento.quantidade}" title="Quantidade" />
                    <h:outputText value="Valorabastecimento:"/>
                    <h:inputText id="valorabastecimento" value="#{abastecimento.abastecimento.valorabastecimento}" title="Valorabastecimento" />
                    <h:outputText value="Valorporlitro:"/>
                    <h:inputText id="valorporlitro" value="#{abastecimento.abastecimento.valorporlitro}" title="Valorporlitro" />
                    <h:outputText value="FornecedorCod:"/>
                    <h:selectOneMenu id="fornecedorCod" value="#{abastecimento.abastecimento.fornecedorCod}" title="FornecedorCod" >
                        <f:selectItems value="#{fornecedor.fornecedorItemsAvailableSelectOne}"/>
                    </h:selectOneMenu>
                    <h:outputText value="VeiculoCod:"/>
                    <h:selectOneMenu id="veiculoCod" value="#{abastecimento.abastecimento.veiculoCod}" title="VeiculoCod" >
                        <f:selectItems value="#{veiculo.veiculoItemsAvailableSelectOne}"/>
                    </h:selectOneMenu>

                </h:panelGrid>
                <br />
                <h:commandLink action="#{abastecimento.create}" value="Create"/>
                <br />
                <br />
                <h:commandLink action="#{abastecimento.listSetup}" value="Show All Abastecimento Items" immediate="true"/>
                <br />

            </h:form>
        </body>
    </html>
</f:view>
