<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>Listing Colaborador Items</title>
            <link rel="stylesheet" type="text/css" href="/projeto-immobilly/" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>Listing Colaborador Items</h1>
            <h:form styleClass="jsfcrud_list_form">
                <h:outputText escape="false" value="(No Colaborador Items Found)<br />" rendered="#{colaborador.pagingInfo.itemCount == 0}" />
                <h:panelGroup rendered="#{colaborador.pagingInfo.itemCount > 0}">
                    <h:outputText value="Item #{colaborador.pagingInfo.firstItem + 1}..#{colaborador.pagingInfo.lastItem} of #{colaborador.pagingInfo.itemCount}"/>&nbsp;
                    <h:commandLink action="#{colaborador.prev}" value="Previous #{colaborador.pagingInfo.batchSize}" rendered="#{colaborador.pagingInfo.firstItem >= colaborador.pagingInfo.batchSize}"/>&nbsp;
                    <h:commandLink action="#{colaborador.next}" value="Next #{colaborador.pagingInfo.batchSize}" rendered="#{colaborador.pagingInfo.lastItem + colaborador.pagingInfo.batchSize <= colaborador.pagingInfo.itemCount}"/>&nbsp;
                    <h:commandLink action="#{colaborador.next}" value="Remaining #{colaborador.pagingInfo.itemCount - colaborador.pagingInfo.lastItem}"
                                   rendered="#{colaborador.pagingInfo.lastItem < colaborador.pagingInfo.itemCount && colaborador.pagingInfo.lastItem + colaborador.pagingInfo.batchSize > colaborador.pagingInfo.itemCount}"/>
                    <h:dataTable value="#{colaborador.colaboradorItems}" var="item" border="0" cellpadding="2" cellspacing="0" rowClasses="jsfcrud_odd_row,jsfcrud_even_row" rules="all" style="border:solid 1px">
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Cod"/>
                            </f:facet>
                            <h:outputText value="#{item.cod}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Cargo"/>
                            </f:facet>
                            <h:outputText value="#{item.cargo}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Celular"/>
                            </f:facet>
                            <h:outputText value="#{item.celular}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Datanascimento"/>
                            </f:facet>
                            <h:outputText value="#{item.datanascimento}">
                                <f:convertDateTime pattern="MM/dd/yyyy" />
                            </h:outputText>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Email"/>
                            </f:facet>
                            <h:outputText value="#{item.email}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Nome"/>
                            </f:facet>
                            <h:outputText value="#{item.nome}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Senha"/>
                            </f:facet>
                            <h:outputText value="#{item.senha}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Sexo"/>
                            </f:facet>
                            <h:outputText value="#{item.sexo}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Categoria"/>
                            </f:facet>
                            <h:outputText value="#{item.categoria}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Renach"/>
                            </f:facet>
                            <h:outputText value="#{item.renach}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Validade"/>
                            </f:facet>
                            <h:outputText value="#{item.validade}">
                                <f:convertDateTime pattern="MM/dd/yyyy" />
                            </h:outputText>
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
                            <h:commandLink value="Show" action="#{colaborador.detailSetup}">
                                <f:param name="jsfcrud.currentColaborador" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][colaborador.converter].jsfcrud_invoke}"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Edit" action="#{colaborador.editSetup}">
                                <f:param name="jsfcrud.currentColaborador" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][colaborador.converter].jsfcrud_invoke}"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Destroy" action="#{colaborador.remove}">
                                <f:param name="jsfcrud.currentColaborador" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][colaborador.converter].jsfcrud_invoke}"/>
                            </h:commandLink>
                        </h:column>

                    </h:dataTable>
                </h:panelGroup>
                <br />
                <h:commandLink action="#{colaborador.createSetup}" value="New Colaborador"/>
                <br />


            </h:form>
        </body>
    </html>
</f:view>
