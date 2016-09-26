<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>Listing Fornecedor Items</title>
            <link rel="stylesheet" type="text/css" href="/projeto-immobilly/" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>Listing Fornecedor Items</h1>
            <h:form styleClass="jsfcrud_list_form">
                <h:outputText escape="false" value="(No Fornecedor Items Found)<br />" rendered="#{fornecedor.pagingInfo.itemCount == 0}" />
                <h:panelGroup rendered="#{fornecedor.pagingInfo.itemCount > 0}">
                    <h:outputText value="Item #{fornecedor.pagingInfo.firstItem + 1}..#{fornecedor.pagingInfo.lastItem} of #{fornecedor.pagingInfo.itemCount}"/>&nbsp;
                    <h:commandLink action="#{fornecedor.prev}" value="Previous #{fornecedor.pagingInfo.batchSize}" rendered="#{fornecedor.pagingInfo.firstItem >= fornecedor.pagingInfo.batchSize}"/>&nbsp;
                    <h:commandLink action="#{fornecedor.next}" value="Next #{fornecedor.pagingInfo.batchSize}" rendered="#{fornecedor.pagingInfo.lastItem + fornecedor.pagingInfo.batchSize <= fornecedor.pagingInfo.itemCount}"/>&nbsp;
                    <h:commandLink action="#{fornecedor.next}" value="Remaining #{fornecedor.pagingInfo.itemCount - fornecedor.pagingInfo.lastItem}"
                                   rendered="#{fornecedor.pagingInfo.lastItem < fornecedor.pagingInfo.itemCount && fornecedor.pagingInfo.lastItem + fornecedor.pagingInfo.batchSize > fornecedor.pagingInfo.itemCount}"/>
                    <h:dataTable value="#{fornecedor.fornecedorItems}" var="item" border="0" cellpadding="2" cellspacing="0" rowClasses="jsfcrud_odd_row,jsfcrud_even_row" rules="all" style="border:solid 1px">
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Cod"/>
                            </f:facet>
                            <h:outputText value="#{item.cod}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Email"/>
                            </f:facet>
                            <h:outputText value="#{item.email}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Nomefantasia"/>
                            </f:facet>
                            <h:outputText value="#{item.nomefantasia}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Razaosocial"/>
                            </f:facet>
                            <h:outputText value="#{item.razaosocial}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Telefone"/>
                            </f:facet>
                            <h:outputText value="#{item.telefone}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Bairro"/>
                            </f:facet>
                            <h:outputText value="#{item.bairro}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Cep"/>
                            </f:facet>
                            <h:outputText value="#{item.cep}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Cidade"/>
                            </f:facet>
                            <h:outputText value="#{item.cidade}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Numero"/>
                            </f:facet>
                            <h:outputText value="#{item.numero}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Rua"/>
                            </f:facet>
                            <h:outputText value="#{item.rua}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Uf"/>
                            </f:facet>
                            <h:outputText value="#{item.uf}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText escape="false" value="&nbsp;"/>
                            </f:facet>
                            <h:commandLink value="Show" action="#{fornecedor.detailSetup}">
                                <f:param name="jsfcrud.currentFornecedor" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][fornecedor.converter].jsfcrud_invoke}"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Edit" action="#{fornecedor.editSetup}">
                                <f:param name="jsfcrud.currentFornecedor" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][fornecedor.converter].jsfcrud_invoke}"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Destroy" action="#{fornecedor.remove}">
                                <f:param name="jsfcrud.currentFornecedor" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][fornecedor.converter].jsfcrud_invoke}"/>
                            </h:commandLink>
                        </h:column>

                    </h:dataTable>
                </h:panelGroup>
                <br />
                <h:commandLink action="#{fornecedor.createSetup}" value="New Fornecedor"/>
                <br />


            </h:form>
        </body>
    </html>
</f:view>
