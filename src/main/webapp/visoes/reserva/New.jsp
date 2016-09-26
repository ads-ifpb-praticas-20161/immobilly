<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>New Reserva</title>
            <link rel="stylesheet" type="text/css" href="/projeto-immobilly/" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>New Reserva</h1>
            <h:form>
                <h:inputHidden id="validateCreateField" validator="#{reserva.validateCreate}" value="value"/>
                <h:panelGrid columns="2">
                    <h:outputText value="Id:"/>
                    <h:inputText id="id" value="#{reserva.reserva.id}" title="Id" required="true" requiredMessage="The id field is required." />
                    <h:outputText value="Horarioretorno (MM/dd/yyyy HH:mm:ss):"/>
                    <h:inputText id="horarioretorno" value="#{reserva.reserva.horarioretorno}" title="Horarioretorno" >
                        <f:convertDateTime pattern="MM/dd/yyyy HH:mm:ss" />
                    </h:inputText>
                    <h:outputText value="Horariosaida (MM/dd/yyyy HH:mm:ss):"/>
                    <h:inputText id="horariosaida" value="#{reserva.reserva.horariosaida}" title="Horariosaida" >
                        <f:convertDateTime pattern="MM/dd/yyyy HH:mm:ss" />
                    </h:inputText>
                    <h:outputText value="Status:"/>
                    <h:inputText id="status" value="#{reserva.reserva.status}" title="Status" />
                    <h:outputText value="ColaboradorCod:"/>
                    <h:selectOneMenu id="colaboradorCod" value="#{reserva.reserva.colaboradorCod}" title="ColaboradorCod" >
                        <f:selectItems value="#{colaborador.colaboradorItemsAvailableSelectOne}"/>
                    </h:selectOneMenu>
                    <h:outputText value="VeiculoCod:"/>
                    <h:selectOneMenu id="veiculoCod" value="#{reserva.reserva.veiculoCod}" title="VeiculoCod" >
                        <f:selectItems value="#{veiculo.veiculoItemsAvailableSelectOne}"/>
                    </h:selectOneMenu>

                </h:panelGrid>
                <br />
                <h:commandLink action="#{reserva.create}" value="Create"/>
                <br />
                <br />
                <h:commandLink action="#{reserva.listSetup}" value="Show All Reserva Items" immediate="true"/>
                <br />

            </h:form>
        </body>
    </html>
</f:view>
