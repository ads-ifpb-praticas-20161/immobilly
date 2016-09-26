<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>Abastecimento Detail</title>
            <link rel="stylesheet" type="text/css" href="/projeto-immobilly/" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>Abastecimento Detail</h1>
            <h:form>
                <h:panelGrid columns="2">
                    <h:outputText value="Abastecimentoid:"/>
                    <h:outputText value="#{abastecimento.abastecimento.abastecimentoid}" title="Abastecimentoid" />
                    <h:outputText value="Horario:"/>
                    <h:outputText value="#{abastecimento.abastecimento.horario}" title="Horario" >
                        <f:convertDateTime pattern="MM/dd/yyyy HH:mm:ss" />
                    </h:outputText>
                    <h:outputText value="Km:"/>
                    <h:outputText value="#{abastecimento.abastecimento.km}" title="Km" />
                    <h:outputText value="Quantidade:"/>
                    <h:outputText value="#{abastecimento.abastecimento.quantidade}" title="Quantidade" />
                    <h:outputText value="Valorabastecimento:"/>
                    <h:outputText value="#{abastecimento.abastecimento.valorabastecimento}" title="Valorabastecimento" />
                    <h:outputText value="Valorporlitro:"/>
                    <h:outputText value="#{abastecimento.abastecimento.valorporlitro}" title="Valorporlitro" />
                    <h:outputText value="FornecedorCod:"/>
                    <h:panelGroup>
                        <h:outputText value="#{abastecimento.abastecimento.fornecedorCod}"/>
                        <h:panelGroup rendered="#{abastecimento.abastecimento.fornecedorCod != null}">
                            <h:outputText value=" ("/>
                            <h:commandLink value="Show" action="#{fornecedor.detailSetup}">
                                <f:param name="jsfcrud.currentAbastecimento" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][abastecimento.abastecimento][abastecimento.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.currentFornecedor" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][abastecimento.abastecimento.fornecedorCod][fornecedor.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.relatedController" value="abastecimento"/>
                                <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.AbastecimentoController"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Edit" action="#{fornecedor.editSetup}">
                                <f:param name="jsfcrud.currentAbastecimento" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][abastecimento.abastecimento][abastecimento.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.currentFornecedor" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][abastecimento.abastecimento.fornecedorCod][fornecedor.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.relatedController" value="abastecimento"/>
                                <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.AbastecimentoController"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Destroy" action="#{fornecedor.destroy}">
                                <f:param name="jsfcrud.currentAbastecimento" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][abastecimento.abastecimento][abastecimento.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.currentFornecedor" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][abastecimento.abastecimento.fornecedorCod][fornecedor.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.relatedController" value="abastecimento"/>
                                <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.AbastecimentoController"/>
                            </h:commandLink>
                            <h:outputText value=" )"/>
                        </h:panelGroup>
                    </h:panelGroup>
                    <h:outputText value="VeiculoCod:"/>
                    <h:panelGroup>
                        <h:outputText value="#{abastecimento.abastecimento.veiculoCod}"/>
                        <h:panelGroup rendered="#{abastecimento.abastecimento.veiculoCod != null}">
                            <h:outputText value=" ("/>
                            <h:commandLink value="Show" action="#{veiculo.detailSetup}">
                                <f:param name="jsfcrud.currentAbastecimento" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][abastecimento.abastecimento][abastecimento.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.currentVeiculo" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][abastecimento.abastecimento.veiculoCod][veiculo.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.relatedController" value="abastecimento"/>
                                <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.AbastecimentoController"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Edit" action="#{veiculo.editSetup}">
                                <f:param name="jsfcrud.currentAbastecimento" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][abastecimento.abastecimento][abastecimento.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.currentVeiculo" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][abastecimento.abastecimento.veiculoCod][veiculo.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.relatedController" value="abastecimento"/>
                                <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.AbastecimentoController"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Destroy" action="#{veiculo.destroy}">
                                <f:param name="jsfcrud.currentAbastecimento" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][abastecimento.abastecimento][abastecimento.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.currentVeiculo" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][abastecimento.abastecimento.veiculoCod][veiculo.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.relatedController" value="abastecimento"/>
                                <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.AbastecimentoController"/>
                            </h:commandLink>
                            <h:outputText value=" )"/>
                        </h:panelGroup>
                    </h:panelGroup>


                </h:panelGrid>
                <br />
                <h:commandLink action="#{abastecimento.remove}" value="Destroy">
                    <f:param name="jsfcrud.currentAbastecimento" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][abastecimento.abastecimento][abastecimento.converter].jsfcrud_invoke}" />
                </h:commandLink>
                <br />
                <br />
                <h:commandLink action="#{abastecimento.editSetup}" value="Edit">
                    <f:param name="jsfcrud.currentAbastecimento" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][abastecimento.abastecimento][abastecimento.converter].jsfcrud_invoke}" />
                </h:commandLink>
                <br />
                <h:commandLink action="#{abastecimento.createSetup}" value="New Abastecimento" />
                <br />
                <h:commandLink action="#{abastecimento.listSetup}" value="Show All Abastecimento Items"/>
                <br />

            </h:form>
        </body>
    </html>
</f:view>
