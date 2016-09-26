<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>Locacao Detail</title>
            <link rel="stylesheet" type="text/css" href="/projeto-immobilly/" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>Locacao Detail</h1>
            <h:form>
                <h:panelGrid columns="2">
                    <h:outputText value="Id:"/>
                    <h:outputText value="#{locacao.locacao.id}" title="Id" />
                    <h:outputText value="Horarioretorno:"/>
                    <h:outputText value="#{locacao.locacao.horarioretorno}" title="Horarioretorno" >
                        <f:convertDateTime pattern="MM/dd/yyyy HH:mm:ss" />
                    </h:outputText>
                    <h:outputText value="Horariosaida:"/>
                    <h:outputText value="#{locacao.locacao.horariosaida}" title="Horariosaida" >
                        <f:convertDateTime pattern="MM/dd/yyyy HH:mm:ss" />
                    </h:outputText>
                    <h:outputText value="Kmretorno:"/>
                    <h:outputText value="#{locacao.locacao.kmretorno}" title="Kmretorno" />
                    <h:outputText value="Kmsaida:"/>
                    <h:outputText value="#{locacao.locacao.kmsaida}" title="Kmsaida" />
                    <h:outputText value="ColaboradorCod:"/>
                    <h:panelGroup>
                        <h:outputText value="#{locacao.locacao.colaboradorCod}"/>
                        <h:panelGroup rendered="#{locacao.locacao.colaboradorCod != null}">
                            <h:outputText value=" ("/>
                            <h:commandLink value="Show" action="#{colaborador.detailSetup}">
                                <f:param name="jsfcrud.currentLocacao" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][locacao.locacao][locacao.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.currentColaborador" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][locacao.locacao.colaboradorCod][colaborador.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.relatedController" value="locacao"/>
                                <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.LocacaoController"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Edit" action="#{colaborador.editSetup}">
                                <f:param name="jsfcrud.currentLocacao" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][locacao.locacao][locacao.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.currentColaborador" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][locacao.locacao.colaboradorCod][colaborador.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.relatedController" value="locacao"/>
                                <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.LocacaoController"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Destroy" action="#{colaborador.destroy}">
                                <f:param name="jsfcrud.currentLocacao" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][locacao.locacao][locacao.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.currentColaborador" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][locacao.locacao.colaboradorCod][colaborador.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.relatedController" value="locacao"/>
                                <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.LocacaoController"/>
                            </h:commandLink>
                            <h:outputText value=" )"/>
                        </h:panelGroup>
                    </h:panelGroup>
                    <h:outputText value="VeiculoCod:"/>
                    <h:panelGroup>
                        <h:outputText value="#{locacao.locacao.veiculoCod}"/>
                        <h:panelGroup rendered="#{locacao.locacao.veiculoCod != null}">
                            <h:outputText value=" ("/>
                            <h:commandLink value="Show" action="#{veiculo.detailSetup}">
                                <f:param name="jsfcrud.currentLocacao" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][locacao.locacao][locacao.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.currentVeiculo" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][locacao.locacao.veiculoCod][veiculo.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.relatedController" value="locacao"/>
                                <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.LocacaoController"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Edit" action="#{veiculo.editSetup}">
                                <f:param name="jsfcrud.currentLocacao" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][locacao.locacao][locacao.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.currentVeiculo" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][locacao.locacao.veiculoCod][veiculo.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.relatedController" value="locacao"/>
                                <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.LocacaoController"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Destroy" action="#{veiculo.destroy}">
                                <f:param name="jsfcrud.currentLocacao" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][locacao.locacao][locacao.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.currentVeiculo" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][locacao.locacao.veiculoCod][veiculo.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.relatedController" value="locacao"/>
                                <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.LocacaoController"/>
                            </h:commandLink>
                            <h:outputText value=" )"/>
                        </h:panelGroup>
                    </h:panelGroup>


                </h:panelGrid>
                <br />
                <h:commandLink action="#{locacao.remove}" value="Destroy">
                    <f:param name="jsfcrud.currentLocacao" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][locacao.locacao][locacao.converter].jsfcrud_invoke}" />
                </h:commandLink>
                <br />
                <br />
                <h:commandLink action="#{locacao.editSetup}" value="Edit">
                    <f:param name="jsfcrud.currentLocacao" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][locacao.locacao][locacao.converter].jsfcrud_invoke}" />
                </h:commandLink>
                <br />
                <h:commandLink action="#{locacao.createSetup}" value="New Locacao" />
                <br />
                <h:commandLink action="#{locacao.listSetup}" value="Show All Locacao Items"/>
                <br />

            </h:form>
        </body>
    </html>
</f:view>
