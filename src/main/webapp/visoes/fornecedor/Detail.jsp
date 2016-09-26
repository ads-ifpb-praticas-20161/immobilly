<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>Fornecedor Detail</title>
            <link rel="stylesheet" type="text/css" href="/projeto-immobilly/" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>Fornecedor Detail</h1>
            <h:form>
                <h:panelGrid columns="2">
                    <h:outputText value="Cod:"/>
                    <h:outputText value="#{fornecedor.fornecedor.cod}" title="Cod" />
                    <h:outputText value="Email:"/>
                    <h:outputText value="#{fornecedor.fornecedor.email}" title="Email" />
                    <h:outputText value="Nomefantasia:"/>
                    <h:outputText value="#{fornecedor.fornecedor.nomefantasia}" title="Nomefantasia" />
                    <h:outputText value="Razaosocial:"/>
                    <h:outputText value="#{fornecedor.fornecedor.razaosocial}" title="Razaosocial" />
                    <h:outputText value="Telefone:"/>
                    <h:outputText value="#{fornecedor.fornecedor.telefone}" title="Telefone" />
                    <h:outputText value="Bairro:"/>
                    <h:outputText value="#{fornecedor.fornecedor.bairro}" title="Bairro" />
                    <h:outputText value="Cep:"/>
                    <h:outputText value="#{fornecedor.fornecedor.cep}" title="Cep" />
                    <h:outputText value="Cidade:"/>
                    <h:outputText value="#{fornecedor.fornecedor.cidade}" title="Cidade" />
                    <h:outputText value="Numero:"/>
                    <h:outputText value="#{fornecedor.fornecedor.numero}" title="Numero" />
                    <h:outputText value="Rua:"/>
                    <h:outputText value="#{fornecedor.fornecedor.rua}" title="Rua" />
                    <h:outputText value="Uf:"/>
                    <h:outputText value="#{fornecedor.fornecedor.uf}" title="Uf" />

                    <h:outputText value="AbastecimentoCollection:" />
                    <h:panelGroup>
                        <h:outputText rendered="#{empty fornecedor.fornecedor.abastecimentoCollection}" value="(No Items)"/>
                        <h:dataTable value="#{fornecedor.fornecedor.abastecimentoCollection}" var="item" 
                                     border="0" cellpadding="2" cellspacing="0" rowClasses="jsfcrud_odd_row,jsfcrud_even_row" rules="all" style="border:solid 1px" 
                                     rendered="#{not empty fornecedor.fornecedor.abastecimentoCollection}">
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
                                    <f:param name="jsfcrud.currentFornecedor" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][fornecedor.fornecedor][fornecedor.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.currentAbastecimento" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][abastecimento.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.relatedController" value="fornecedor" />
                                    <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.FornecedorController" />
                                </h:commandLink>
                                <h:outputText value=" "/>
                                <h:commandLink value="Edit" action="#{abastecimento.editSetup}">
                                    <f:param name="jsfcrud.currentFornecedor" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][fornecedor.fornecedor][fornecedor.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.currentAbastecimento" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][abastecimento.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.relatedController" value="fornecedor" />
                                    <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.FornecedorController" />
                                </h:commandLink>
                                <h:outputText value=" "/>
                                <h:commandLink value="Destroy" action="#{abastecimento.destroy}">
                                    <f:param name="jsfcrud.currentFornecedor" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][fornecedor.fornecedor][fornecedor.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.currentAbastecimento" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][abastecimento.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.relatedController" value="fornecedor" />
                                    <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.FornecedorController" />
                                </h:commandLink>
                            </h:column>
                        </h:dataTable>
                    </h:panelGroup>

                </h:panelGrid>
                <br />
                <h:commandLink action="#{fornecedor.remove}" value="Destroy">
                    <f:param name="jsfcrud.currentFornecedor" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][fornecedor.fornecedor][fornecedor.converter].jsfcrud_invoke}" />
                </h:commandLink>
                <br />
                <br />
                <h:commandLink action="#{fornecedor.editSetup}" value="Edit">
                    <f:param name="jsfcrud.currentFornecedor" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][fornecedor.fornecedor][fornecedor.converter].jsfcrud_invoke}" />
                </h:commandLink>
                <br />
                <h:commandLink action="#{fornecedor.createSetup}" value="New Fornecedor" />
                <br />
                <h:commandLink action="#{fornecedor.listSetup}" value="Show All Fornecedor Items"/>
                <br />

            </h:form>
        </body>
    </html>
</f:view>
