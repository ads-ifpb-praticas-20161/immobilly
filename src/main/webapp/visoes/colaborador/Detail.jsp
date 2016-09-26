<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>Colaborador Detail</title>
            <link rel="stylesheet" type="text/css" href="/projeto-immobilly/" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>Colaborador Detail</h1>
            <h:form>
                <h:panelGrid columns="2">
                    <h:outputText value="Cod:"/>
                    <h:outputText value="#{colaborador.colaborador.cod}" title="Cod" />
                    <h:outputText value="Cargo:"/>
                    <h:outputText value="#{colaborador.colaborador.cargo}" title="Cargo" />
                    <h:outputText value="Celular:"/>
                    <h:outputText value="#{colaborador.colaborador.celular}" title="Celular" />
                    <h:outputText value="Datanascimento:"/>
                    <h:outputText value="#{colaborador.colaborador.datanascimento}" title="Datanascimento" >
                        <f:convertDateTime pattern="MM/dd/yyyy" />
                    </h:outputText>
                    <h:outputText value="Email:"/>
                    <h:outputText value="#{colaborador.colaborador.email}" title="Email" />
                    <h:outputText value="Nome:"/>
                    <h:outputText value="#{colaborador.colaborador.nome}" title="Nome" />
                    <h:outputText value="Senha:"/>
                    <h:outputText value="#{colaborador.colaborador.senha}" title="Senha" />
                    <h:outputText value="Sexo:"/>
                    <h:outputText value="#{colaborador.colaborador.sexo}" title="Sexo" />
                    <h:outputText value="Categoria:"/>
                    <h:outputText value="#{colaborador.colaborador.categoria}" title="Categoria" />
                    <h:outputText value="Renach:"/>
                    <h:outputText value="#{colaborador.colaborador.renach}" title="Renach" />
                    <h:outputText value="Validade:"/>
                    <h:outputText value="#{colaborador.colaborador.validade}" title="Validade" >
                        <f:convertDateTime pattern="MM/dd/yyyy" />
                    </h:outputText>
                    <h:outputText value="Bairro:"/>
                    <h:outputText value="#{colaborador.colaborador.bairro}" title="Bairro" />
                    <h:outputText value="Cep:"/>
                    <h:outputText value="#{colaborador.colaborador.cep}" title="Cep" />
                    <h:outputText value="Cidade:"/>
                    <h:outputText value="#{colaborador.colaborador.cidade}" title="Cidade" />
                    <h:outputText value="Numero:"/>
                    <h:outputText value="#{colaborador.colaborador.numero}" title="Numero" />
                    <h:outputText value="Rua:"/>
                    <h:outputText value="#{colaborador.colaborador.rua}" title="Rua" />
                    <h:outputText value="Uf:"/>
                    <h:outputText value="#{colaborador.colaborador.uf}" title="Uf" />

                    <h:outputText value="LocacaoCollection:" />
                    <h:panelGroup>
                        <h:outputText rendered="#{empty colaborador.colaborador.locacaoCollection}" value="(No Items)"/>
                        <h:dataTable value="#{colaborador.colaborador.locacaoCollection}" var="item" 
                                     border="0" cellpadding="2" cellspacing="0" rowClasses="jsfcrud_odd_row,jsfcrud_even_row" rules="all" style="border:solid 1px" 
                                     rendered="#{not empty colaborador.colaborador.locacaoCollection}">
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
                                    <f:param name="jsfcrud.currentColaborador" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][colaborador.colaborador][colaborador.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.currentLocacao" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][locacao.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.relatedController" value="colaborador" />
                                    <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.ColaboradorController" />
                                </h:commandLink>
                                <h:outputText value=" "/>
                                <h:commandLink value="Edit" action="#{locacao.editSetup}">
                                    <f:param name="jsfcrud.currentColaborador" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][colaborador.colaborador][colaborador.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.currentLocacao" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][locacao.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.relatedController" value="colaborador" />
                                    <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.ColaboradorController" />
                                </h:commandLink>
                                <h:outputText value=" "/>
                                <h:commandLink value="Destroy" action="#{locacao.destroy}">
                                    <f:param name="jsfcrud.currentColaborador" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][colaborador.colaborador][colaborador.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.currentLocacao" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][locacao.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.relatedController" value="colaborador" />
                                    <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.ColaboradorController" />
                                </h:commandLink>
                            </h:column>
                        </h:dataTable>
                    </h:panelGroup>
                    <h:outputText value="ReservaCollection:" />
                    <h:panelGroup>
                        <h:outputText rendered="#{empty colaborador.colaborador.reservaCollection}" value="(No Items)"/>
                        <h:dataTable value="#{colaborador.colaborador.reservaCollection}" var="item" 
                                     border="0" cellpadding="2" cellspacing="0" rowClasses="jsfcrud_odd_row,jsfcrud_even_row" rules="all" style="border:solid 1px" 
                                     rendered="#{not empty colaborador.colaborador.reservaCollection}">
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
                                    <f:param name="jsfcrud.currentColaborador" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][colaborador.colaborador][colaborador.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.currentReserva" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][reserva.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.relatedController" value="colaborador" />
                                    <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.ColaboradorController" />
                                </h:commandLink>
                                <h:outputText value=" "/>
                                <h:commandLink value="Edit" action="#{reserva.editSetup}">
                                    <f:param name="jsfcrud.currentColaborador" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][colaborador.colaborador][colaborador.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.currentReserva" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][reserva.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.relatedController" value="colaborador" />
                                    <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.ColaboradorController" />
                                </h:commandLink>
                                <h:outputText value=" "/>
                                <h:commandLink value="Destroy" action="#{reserva.destroy}">
                                    <f:param name="jsfcrud.currentColaborador" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][colaborador.colaborador][colaborador.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.currentReserva" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][reserva.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.relatedController" value="colaborador" />
                                    <f:param name="jsfcrud.relatedControllerType" value="br.edu.ifpb.ads.praticas.immobilly.controlador.ColaboradorController" />
                                </h:commandLink>
                            </h:column>
                        </h:dataTable>
                    </h:panelGroup>

                </h:panelGrid>
                <br />
                <h:commandLink action="#{colaborador.remove}" value="Destroy">
                    <f:param name="jsfcrud.currentColaborador" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][colaborador.colaborador][colaborador.converter].jsfcrud_invoke}" />
                </h:commandLink>
                <br />
                <br />
                <h:commandLink action="#{colaborador.editSetup}" value="Edit">
                    <f:param name="jsfcrud.currentColaborador" value="#{jsfcrud_class['br.edu.ifpb.ads.praticas.immobilly.controlador.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][colaborador.colaborador][colaborador.converter].jsfcrud_invoke}" />
                </h:commandLink>
                <br />
                <h:commandLink action="#{colaborador.createSetup}" value="New Colaborador" />
                <br />
                <h:commandLink action="#{colaborador.listSetup}" value="Show All Colaborador Items"/>
                <br />

            </h:form>
        </body>
    </html>
</f:view>
