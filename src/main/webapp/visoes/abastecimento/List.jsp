<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>Listing Abastecimento Items</title>
            <link rel="stylesheet" type="text/css" href="/projeto-immobilly/" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>Listing Abastecimento Items</h1>
            <h:form styleClass="jsfcrud_list_form">
                <h:outputText escape="false" value="(No Abastecimento Items Found)<br />" rendered="#{abastecimento.pagingInfo.itemCount == 0}" />
                <h:panelGroup rendered="#{abastecimento.pagingInfo.itemCount > 0}">
                    <h:outputText value="Item #{abastecimento.pagingInfo.firstItem + 1}..#{abastecimento.pagingInfo.lastItem} of #{abastecimento.pagingInfo.itemCount}"/>&nbsp;
                    <h:commandLink action="#{abastecimento.prev}" value="Previous #{abastecimento.pagingInfo.batchSize}" rendered="#{abastecimento.pagingInfo.firstItem >= abastecimento.pagingInfo.batchSize}"/>&nbsp;
                    <h:commandLink action="#{abastecimento.next}" value="Next #{abastecimento.pagingInfo.batchSize}" rendered="#{abastecimento.pagingInfo.lastItem + abastecimento.pagingInfo.batchSize <= abastecimento.pagingInfo.itemCount}"/>&nbsp;
                    <h:commandLink action="#{abastecimento.next}" value="Remaining #{abastecimento.pagingInfo.itemCount - abastecimento.pagingInfo.lastItem}"
                                   rendered="#{abastecimento.pagingInfo.lastItem < abastecimento.pagingInfo.itemCount && abastecimento.pagingInfo.lastItem + abastecimento.pagingInfo.batchSize > abastecimento.pagingInfo.itemCount}"/>
                    <h:dataTable value="#{abastecimento.abastecimentoItems}" var="item" border="0" cellpadding="2" cellspacing="0" rowClasses="jsfcrud_odd_row,jsfcrud_even_row" rules="all" style="border:solid 1px">
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Abastecimentoid"/>
                            </f:facet>
                            <h:outputText value="#{item.abastecimentoid}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Horario"/>
                            </f:facet>
                            <h:outputText value="#{item.horario}">
                                <f:convertDateTime pattern="MM/dd/yyyy HH:mm:ss" />
                            </h:outputText>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Km"/>
                            </f:facet>
                            <h:outputText value="#{item.km}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Quantidade"/>
                            </f:facet>
                            <h:outputText value="#{item.quantidade}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Valorabastecimento"/>
                            </f:facet>
                            <h:outputText value="#{item.valorabastecimento}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Valorporlitro"/>
                            </f:facet>
                            <h:outputText value="#{item.valorporlitro}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="FornecedorCod"/>
                            </f:facet>
                            <h:outputText value="#{item.fornecedorCod}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="VeiculoCod"/>
                            </f:facet>
                            <h:outputText value="#{item.veiculoCod}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText escape="false" value="&nbsp;"/>
                            </f:facet>
                            <h:commandLink value="Show" action="#{abastecimento.detailSetup}">
                                <f:param name="jsfcrud.currentAbastecimento" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][abastecimento.converter].jsfcrud_invoke}"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Edit" action="#{abastecimento.editSetup}">
                                <f:param name="jsfcrud.currentAbastecimento" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][abastecimento.converter].jsfcrud_invoke}"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Destroy" action="#{abastecimento.remove}">
                                <f:param name="jsfcrud.currentAbastecimento" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][abastecimento.converter].jsfcrud_invoke}"/>
                            </h:commandLink>
                        </h:column>

                    </h:dataTable>
                </h:panelGroup>
                <br />
                <h:commandLink action="#{abastecimento.createSetup}" value="New Abastecimento"/>
                <br />


            </h:form>
        </body>
    </html>
</f:view>
