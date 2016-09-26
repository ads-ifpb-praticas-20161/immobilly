<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>Veiculo Detail</title>
            <link rel="stylesheet" type="text/css" href="/projeto-immobilly/" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>Veiculo Detail</h1>
            <h:form>
                <h:panelGrid columns="2">
                    <h:outputText value="Cod:"/>
                    <h:outputText value="#{veiculo.veiculo.cod}" title="Cod" />
                    <h:outputText value="Anofabricacao:"/>
                    <h:outputText value="#{veiculo.veiculo.anofabricacao}" title="Anofabricacao" >
                        <f:convertDateTime pattern="MM/dd/yyyy" />
                    </h:outputText>
                    <h:outputText value="Categoria:"/>
                    <h:outputText value="#{veiculo.veiculo.categoria}" title="Categoria" />
                    <h:outputText value="Chassi:"/>
                    <h:outputText value="#{veiculo.veiculo.chassi}" title="Chassi" />
                    <h:outputText value="Combustivel:"/>
                    <h:outputText value="#{veiculo.veiculo.combustivel}" title="Combustivel" />
                    <h:outputText value="Cor:"/>
                    <h:outputText value="#{veiculo.veiculo.cor}" title="Cor" />
                    <h:outputText value="Fabricante:"/>
                    <h:outputText value="#{veiculo.veiculo.fabricante}" title="Fabricante" />
                    <h:outputText value="Km:"/>
                    <h:outputText value="#{veiculo.veiculo.km}" title="Km" />
                    <h:outputText value="Modelo:"/>
                    <h:outputText value="#{veiculo.veiculo.modelo}" title="Modelo" />
                    <h:outputText value="Renavan:"/>
                    <h:outputText value="#{veiculo.veiculo.renavan}" title="Renavan" />
                    <h:outputText value="Status:"/>
                    <h:outputText value="#{veiculo.veiculo.status}" title="Status" />

                    <h:outputText value="LocacaoCollection:" />
                    <h:panelGroup>
                        <h:outputText rendered="#{empty veiculo.veiculo.locacaoCollection}" value="(No Items)"/>
                        <h:dataTable value="#{veiculo.veiculo.locacaoCollection}" var="item" 
                                     border="0" cellpadding="2" cellspacing="0" rowClasses="jsfcrud_odd_row,jsfcrud_even_row" rules="all" style="border:solid 1px" 
                                     rendered="#{not empty veiculo.veiculo.locacaoCollection}">
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
                                    <f:param name="jsfcrud.currentVeiculo" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][veiculo.veiculo][veiculo.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.currentLocacao" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][locacao.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.relatedController" value="veiculo" />
                                    <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.VeiculoController" />
                                </h:commandLink>
                                <h:outputText value=" "/>
                                <h:commandLink value="Edit" action="#{locacao.editSetup}">
                                    <f:param name="jsfcrud.currentVeiculo" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][veiculo.veiculo][veiculo.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.currentLocacao" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][locacao.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.relatedController" value="veiculo" />
                                    <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.VeiculoController" />
                                </h:commandLink>
                                <h:outputText value=" "/>
                                <h:commandLink value="Destroy" action="#{locacao.destroy}">
                                    <f:param name="jsfcrud.currentVeiculo" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][veiculo.veiculo][veiculo.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.currentLocacao" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][locacao.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.relatedController" value="veiculo" />
                                    <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.VeiculoController" />
                                </h:commandLink>
                            </h:column>
                        </h:dataTable>
                    </h:panelGroup>
                    <h:outputText value="ReservaCollection:" />
                    <h:panelGroup>
                        <h:outputText rendered="#{empty veiculo.veiculo.reservaCollection}" value="(No Items)"/>
                        <h:dataTable value="#{veiculo.veiculo.reservaCollection}" var="item" 
                                     border="0" cellpadding="2" cellspacing="0" rowClasses="jsfcrud_odd_row,jsfcrud_even_row" rules="all" style="border:solid 1px" 
                                     rendered="#{not empty veiculo.veiculo.reservaCollection}">
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
                                    <h:outputText value="Status"/>
                                </f:facet>
                                <h:outputText value="#{item.status}"/>
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
                                <h:commandLink value="Show" action="#{reserva.detailSetup}">
                                    <f:param name="jsfcrud.currentVeiculo" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][veiculo.veiculo][veiculo.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.currentReserva" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][reserva.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.relatedController" value="veiculo" />
                                    <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.VeiculoController" />
                                </h:commandLink>
                                <h:outputText value=" "/>
                                <h:commandLink value="Edit" action="#{reserva.editSetup}">
                                    <f:param name="jsfcrud.currentVeiculo" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][veiculo.veiculo][veiculo.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.currentReserva" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][reserva.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.relatedController" value="veiculo" />
                                    <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.VeiculoController" />
                                </h:commandLink>
                                <h:outputText value=" "/>
                                <h:commandLink value="Destroy" action="#{reserva.destroy}">
                                    <f:param name="jsfcrud.currentVeiculo" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][veiculo.veiculo][veiculo.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.currentReserva" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][reserva.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.relatedController" value="veiculo" />
                                    <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.VeiculoController" />
                                </h:commandLink>
                            </h:column>
                        </h:dataTable>
                    </h:panelGroup>
                    <h:outputText value="AbastecimentoCollection:" />
                    <h:panelGroup>
                        <h:outputText rendered="#{empty veiculo.veiculo.abastecimentoCollection}" value="(No Items)"/>
                        <h:dataTable value="#{veiculo.veiculo.abastecimentoCollection}" var="item" 
                                     border="0" cellpadding="2" cellspacing="0" rowClasses="jsfcrud_odd_row,jsfcrud_even_row" rules="all" style="border:solid 1px" 
                                     rendered="#{not empty veiculo.veiculo.abastecimentoCollection}">
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
                                    <f:param name="jsfcrud.currentVeiculo" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][veiculo.veiculo][veiculo.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.currentAbastecimento" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][abastecimento.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.relatedController" value="veiculo" />
                                    <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.VeiculoController" />
                                </h:commandLink>
                                <h:outputText value=" "/>
                                <h:commandLink value="Edit" action="#{abastecimento.editSetup}">
                                    <f:param name="jsfcrud.currentVeiculo" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][veiculo.veiculo][veiculo.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.currentAbastecimento" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][abastecimento.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.relatedController" value="veiculo" />
                                    <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.VeiculoController" />
                                </h:commandLink>
                                <h:outputText value=" "/>
                                <h:commandLink value="Destroy" action="#{abastecimento.destroy}">
                                    <f:param name="jsfcrud.currentVeiculo" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][veiculo.veiculo][veiculo.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.currentAbastecimento" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][abastecimento.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.relatedController" value="veiculo" />
                                    <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.VeiculoController" />
                                </h:commandLink>
                            </h:column>
                        </h:dataTable>
                    </h:panelGroup>

                </h:panelGrid>
                <br />
                <h:commandLink action="#{veiculo.remove}" value="Destroy">
                    <f:param name="jsfcrud.currentVeiculo" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][veiculo.veiculo][veiculo.converter].jsfcrud_invoke}" />
                </h:commandLink>
                <br />
                <br />
                <h:commandLink action="#{veiculo.editSetup}" value="Edit">
                    <f:param name="jsfcrud.currentVeiculo" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][veiculo.veiculo][veiculo.converter].jsfcrud_invoke}" />
                </h:commandLink>
                <br />
                <h:commandLink action="#{veiculo.createSetup}" value="New Veiculo" />
                <br />
                <h:commandLink action="#{veiculo.listSetup}" value="Show All Veiculo Items"/>
                <br />

            </h:form>
        </body>
    </html>
</f:view>
