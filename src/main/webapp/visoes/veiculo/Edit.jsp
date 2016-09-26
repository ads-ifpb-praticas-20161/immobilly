<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>Editing Veiculo</title>
            <link rel="stylesheet" type="text/css" href="/projeto-immobilly/" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>Editing Veiculo</h1>
            <h:form>
                <h:panelGrid columns="2">
                    <h:outputText value="Cod:"/>
                    <h:outputText value="#{veiculo.veiculo.cod}" title="Cod" />
                    <h:outputText value="Anofabricacao (MM/dd/yyyy):"/>
                    <h:inputText id="anofabricacao" value="#{veiculo.veiculo.anofabricacao}" title="Anofabricacao" >
                        <f:convertDateTime pattern="MM/dd/yyyy" />
                    </h:inputText>
                    <h:outputText value="Categoria:"/>
                    <h:inputText id="categoria" value="#{veiculo.veiculo.categoria}" title="Categoria" />
                    <h:outputText value="Chassi:"/>
                    <h:inputText id="chassi" value="#{veiculo.veiculo.chassi}" title="Chassi" />
                    <h:outputText value="Combustivel:"/>
                    <h:inputText id="combustivel" value="#{veiculo.veiculo.combustivel}" title="Combustivel" />
                    <h:outputText value="Cor:"/>
                    <h:inputText id="cor" value="#{veiculo.veiculo.cor}" title="Cor" />
                    <h:outputText value="Fabricante:"/>
                    <h:inputText id="fabricante" value="#{veiculo.veiculo.fabricante}" title="Fabricante" />
                    <h:outputText value="Km:"/>
                    <h:inputText id="km" value="#{veiculo.veiculo.km}" title="Km" />
                    <h:outputText value="Modelo:"/>
                    <h:inputText id="modelo" value="#{veiculo.veiculo.modelo}" title="Modelo" />
                    <h:outputText value="Renavan:"/>
                    <h:inputText id="renavan" value="#{veiculo.veiculo.renavan}" title="Renavan" />
                    <h:outputText value="Status:"/>
                    <h:inputText id="status" value="#{veiculo.veiculo.status}" title="Status" />
                    <h:outputText value="LocacaoCollection:"/>
                    <h:selectManyListbox id="locacaoCollection" value="#{veiculo.veiculo.jsfcrud_transform[jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method.collectionToArray][jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method.arrayToList].locacaoCollection}" title="LocacaoCollection" size="6" converter="#{locacao.converter}" >
                        <f:selectItems value="#{locacao.locacaoItemsAvailableSelectMany}"/>
                    </h:selectManyListbox>
                    <h:outputText value="ReservaCollection:"/>
                    <h:selectManyListbox id="reservaCollection" value="#{veiculo.veiculo.jsfcrud_transform[jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method.collectionToArray][jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method.arrayToList].reservaCollection}" title="ReservaCollection" size="6" converter="#{reserva.converter}" >
                        <f:selectItems value="#{reserva.reservaItemsAvailableSelectMany}"/>
                    </h:selectManyListbox>
                    <h:outputText value="AbastecimentoCollection:"/>
                    <h:selectManyListbox id="abastecimentoCollection" value="#{veiculo.veiculo.jsfcrud_transform[jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method.collectionToArray][jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method.arrayToList].abastecimentoCollection}" title="AbastecimentoCollection" size="6" converter="#{abastecimento.converter}" >
                        <f:selectItems value="#{abastecimento.abastecimentoItemsAvailableSelectMany}"/>
                    </h:selectManyListbox>

                </h:panelGrid>
                <br />
                <h:commandLink action="#{veiculo.edit}" value="Save">
                    <f:param name="jsfcrud.currentVeiculo" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][veiculo.veiculo][veiculo.converter].jsfcrud_invoke}"/>
                </h:commandLink>
                <br />
                <br />
                <h:commandLink action="#{veiculo.detailSetup}" value="Show" immediate="true">
                    <f:param name="jsfcrud.currentVeiculo" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][veiculo.veiculo][veiculo.converter].jsfcrud_invoke}"/>
                </h:commandLink>
                <br />
                <h:commandLink action="#{veiculo.listSetup}" value="Show All Veiculo Items" immediate="true"/>
                <br />

            </h:form>
        </body>
    </html>
</f:view>
