<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>Listing Veiculo Items</title>
            <link rel="stylesheet" type="text/css" href="/projeto-immobilly/" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>Listing Veiculo Items</h1>
            <h:form styleClass="jsfcrud_list_form">
                <h:outputText escape="false" value="(No Veiculo Items Found)<br />" rendered="#{veiculo.pagingInfo.itemCount == 0}" />
                <h:panelGroup rendered="#{veiculo.pagingInfo.itemCount > 0}">
                    <h:outputText value="Item #{veiculo.pagingInfo.firstItem + 1}..#{veiculo.pagingInfo.lastItem} of #{veiculo.pagingInfo.itemCount}"/>&nbsp;
                    <h:commandLink action="#{veiculo.prev}" value="Previous #{veiculo.pagingInfo.batchSize}" rendered="#{veiculo.pagingInfo.firstItem >= veiculo.pagingInfo.batchSize}"/>&nbsp;
                    <h:commandLink action="#{veiculo.next}" value="Next #{veiculo.pagingInfo.batchSize}" rendered="#{veiculo.pagingInfo.lastItem + veiculo.pagingInfo.batchSize <= veiculo.pagingInfo.itemCount}"/>&nbsp;
                    <h:commandLink action="#{veiculo.next}" value="Remaining #{veiculo.pagingInfo.itemCount - veiculo.pagingInfo.lastItem}"
                                   rendered="#{veiculo.pagingInfo.lastItem < veiculo.pagingInfo.itemCount && veiculo.pagingInfo.lastItem + veiculo.pagingInfo.batchSize > veiculo.pagingInfo.itemCount}"/>
                    <h:dataTable value="#{veiculo.veiculoItems}" var="item" border="0" cellpadding="2" cellspacing="0" rowClasses="jsfcrud_odd_row,jsfcrud_even_row" rules="all" style="border:solid 1px">
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Cod"/>
                            </f:facet>
                            <h:outputText value="#{item.cod}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Anofabricacao"/>
                            </f:facet>
                            <h:outputText value="#{item.anofabricacao}">
                                <f:convertDateTime pattern="MM/dd/yyyy" />
                            </h:outputText>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Categoria"/>
                            </f:facet>
                            <h:outputText value="#{item.categoria}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Chassi"/>
                            </f:facet>
                            <h:outputText value="#{item.chassi}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Combustivel"/>
                            </f:facet>
                            <h:outputText value="#{item.combustivel}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Cor"/>
                            </f:facet>
                            <h:outputText value="#{item.cor}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Fabricante"/>
                            </f:facet>
                            <h:outputText value="#{item.fabricante}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Km"/>
                            </f:facet>
                            <h:outputText value="#{item.km}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Modelo"/>
                            </f:facet>
                            <h:outputText value="#{item.modelo}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Renavan"/>
                            </f:facet>
                            <h:outputText value="#{item.renavan}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Status"/>
                            </f:facet>
                            <h:outputText value="#{item.status}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText escape="false" value="&nbsp;"/>
                            </f:facet>
                            <h:commandLink value="Show" action="#{veiculo.detailSetup}">
                                <f:param name="jsfcrud.currentVeiculo" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][veiculo.converter].jsfcrud_invoke}"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Edit" action="#{veiculo.editSetup}">
                                <f:param name="jsfcrud.currentVeiculo" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][veiculo.converter].jsfcrud_invoke}"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Destroy" action="#{veiculo.remove}">
                                <f:param name="jsfcrud.currentVeiculo" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][veiculo.converter].jsfcrud_invoke}"/>
                            </h:commandLink>
                        </h:column>

                    </h:dataTable>
                </h:panelGroup>
                <br />
                <h:commandLink action="#{veiculo.createSetup}" value="New Veiculo"/>
                <br />


            </h:form>
        </body>
    </html>
</f:view>
