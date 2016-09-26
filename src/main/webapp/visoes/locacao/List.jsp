<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>Listing Locacao Items</title>
            <link rel="stylesheet" type="text/css" href="/projeto-immobilly/" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>Listing Locacao Items</h1>
            <h:form styleClass="jsfcrud_list_form">
                <h:outputText escape="false" value="(No Locacao Items Found)<br />" rendered="#{locacao.pagingInfo.itemCount == 0}" />
                <h:panelGroup rendered="#{locacao.pagingInfo.itemCount > 0}">
                    <h:outputText value="Item #{locacao.pagingInfo.firstItem + 1}..#{locacao.pagingInfo.lastItem} of #{locacao.pagingInfo.itemCount}"/>&nbsp;
                    <h:commandLink action="#{locacao.prev}" value="Previous #{locacao.pagingInfo.batchSize}" rendered="#{locacao.pagingInfo.firstItem >= locacao.pagingInfo.batchSize}"/>&nbsp;
                    <h:commandLink action="#{locacao.next}" value="Next #{locacao.pagingInfo.batchSize}" rendered="#{locacao.pagingInfo.lastItem + locacao.pagingInfo.batchSize <= locacao.pagingInfo.itemCount}"/>&nbsp;
                    <h:commandLink action="#{locacao.next}" value="Remaining #{locacao.pagingInfo.itemCount - locacao.pagingInfo.lastItem}"
                                   rendered="#{locacao.pagingInfo.lastItem < locacao.pagingInfo.itemCount && locacao.pagingInfo.lastItem + locacao.pagingInfo.batchSize > locacao.pagingInfo.itemCount}"/>
                    <h:dataTable value="#{locacao.locacaoItems}" var="item" border="0" cellpadding="2" cellspacing="0" rowClasses="jsfcrud_odd_row,jsfcrud_even_row" rules="all" style="border:solid 1px">
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Id"/>
                            </f:facet>
                            <h:outputText value="#{item.id}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Horarioretorno"/>
                            </f:facet>
                            <h:outputText value="#{item.horarioretorno}">
                                <f:convertDateTime pattern="MM/dd/yyyy HH:mm:ss" />
                            </h:outputText>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Horariosaida"/>
                            </f:facet>
                            <h:outputText value="#{item.horariosaida}">
                                <f:convertDateTime pattern="MM/dd/yyyy HH:mm:ss" />
                            </h:outputText>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Kmretorno"/>
                            </f:facet>
                            <h:outputText value="#{item.kmretorno}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Kmsaida"/>
                            </f:facet>
                            <h:outputText value="#{item.kmsaida}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="ColaboradorCod"/>
                            </f:facet>
                            <h:outputText value="#{item.colaboradorCod}"/>
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
                            <h:commandLink value="Show" action="#{locacao.detailSetup}">
                                <f:param name="jsfcrud.currentLocacao" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][locacao.converter].jsfcrud_invoke}"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Edit" action="#{locacao.editSetup}">
                                <f:param name="jsfcrud.currentLocacao" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][locacao.converter].jsfcrud_invoke}"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Destroy" action="#{locacao.remove}">
                                <f:param name="jsfcrud.currentLocacao" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][locacao.converter].jsfcrud_invoke}"/>
                            </h:commandLink>
                        </h:column>

                    </h:dataTable>
                </h:panelGroup>
                <br />
                <h:commandLink action="#{locacao.createSetup}" value="New Locacao"/>
                <br />


            </h:form>
        </body>
    </html>
</f:view>
