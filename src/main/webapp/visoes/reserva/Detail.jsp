<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>Reserva Detail</title>
            <link rel="stylesheet" type="text/css" href="/projeto-immobilly/" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>Reserva Detail</h1>
            <h:form>
                <h:panelGrid columns="2">
                    <h:outputText value="Id:"/>
                    <h:outputText value="#{reserva.reserva.id}" title="Id" />
                    <h:outputText value="Horarioretorno:"/>
                    <h:outputText value="#{reserva.reserva.horarioretorno}" title="Horarioretorno" >
                        <f:convertDateTime pattern="MM/dd/yyyy HH:mm:ss" />
                    </h:outputText>
                    <h:outputText value="Horariosaida:"/>
                    <h:outputText value="#{reserva.reserva.horariosaida}" title="Horariosaida" >
                        <f:convertDateTime pattern="MM/dd/yyyy HH:mm:ss" />
                    </h:outputText>
                    <h:outputText value="Status:"/>
                    <h:outputText value="#{reserva.reserva.status}" title="Status" />
                    <h:outputText value="ColaboradorCod:"/>
                    <h:panelGroup>
                        <h:outputText value="#{reserva.reserva.colaboradorCod}"/>
                        <h:panelGroup rendered="#{reserva.reserva.colaboradorCod != null}">
                            <h:outputText value=" ("/>
                            <h:commandLink value="Show" action="#{colaborador.detailSetup}">
                                <f:param name="jsfcrud.currentReserva" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][reserva.reserva][reserva.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.currentColaborador" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][reserva.reserva.colaboradorCod][colaborador.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.relatedController" value="reserva"/>
                                <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.ReservaController"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Edit" action="#{colaborador.editSetup}">
                                <f:param name="jsfcrud.currentReserva" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][reserva.reserva][reserva.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.currentColaborador" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][reserva.reserva.colaboradorCod][colaborador.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.relatedController" value="reserva"/>
                                <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.ReservaController"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Destroy" action="#{colaborador.destroy}">
                                <f:param name="jsfcrud.currentReserva" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][reserva.reserva][reserva.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.currentColaborador" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][reserva.reserva.colaboradorCod][colaborador.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.relatedController" value="reserva"/>
                                <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.ReservaController"/>
                            </h:commandLink>
                            <h:outputText value=" )"/>
                        </h:panelGroup>
                    </h:panelGroup>
                    <h:outputText value="VeiculoCod:"/>
                    <h:panelGroup>
                        <h:outputText value="#{reserva.reserva.veiculoCod}"/>
                        <h:panelGroup rendered="#{reserva.reserva.veiculoCod != null}">
                            <h:outputText value=" ("/>
                            <h:commandLink value="Show" action="#{veiculo.detailSetup}">
                                <f:param name="jsfcrud.currentReserva" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][reserva.reserva][reserva.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.currentVeiculo" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][reserva.reserva.veiculoCod][veiculo.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.relatedController" value="reserva"/>
                                <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.ReservaController"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Edit" action="#{veiculo.editSetup}">
                                <f:param name="jsfcrud.currentReserva" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][reserva.reserva][reserva.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.currentVeiculo" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][reserva.reserva.veiculoCod][veiculo.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.relatedController" value="reserva"/>
                                <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.ReservaController"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Destroy" action="#{veiculo.destroy}">
                                <f:param name="jsfcrud.currentReserva" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][reserva.reserva][reserva.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.currentVeiculo" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][reserva.reserva.veiculoCod][veiculo.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.relatedController" value="reserva"/>
                                <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.ReservaController"/>
                            </h:commandLink>
                            <h:outputText value=" )"/>
                        </h:panelGroup>
                    </h:panelGroup>


                </h:panelGrid>
                <br />
                <h:commandLink action="#{reserva.remove}" value="Destroy">
                    <f:param name="jsfcrud.currentReserva" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][reserva.reserva][reserva.converter].jsfcrud_invoke}" />
                </h:commandLink>
                <br />
                <br />
                <h:commandLink action="#{reserva.editSetup}" value="Edit">
                    <f:param name="jsfcrud.currentReserva" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][reserva.reserva][reserva.converter].jsfcrud_invoke}" />
                </h:commandLink>
                <br />
                <h:commandLink action="#{reserva.createSetup}" value="New Reserva" />
                <br />
                <h:commandLink action="#{reserva.listSetup}" value="Show All Reserva Items"/>
                <br />

            </h:form>
        </body>
    </html>
</f:view>
