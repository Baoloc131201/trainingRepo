<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<template:page pageTitle="${pageTitle}">
    <cms:pageSlot position="PolicyHeader" var="feature">
            <cms:component component="${feature}" />
    </cms:pageSlot>

    <cms:pageSlot position="Section1" var="feature" element="div" class="row no-margin" >
        <cms:component component="${feature}" element="div" class="no-space yComponentWrapper"/>
    </cms:pageSlot>

    <cms:pageSlot position="Section2" var="feature" element="div" class="row no-margin">
        <cms:component component="${feature}" element="div" class="yComponentWrapper"/>
    </cms:pageSlot>

    <cms:pageSlot position="Section3" var="feature" element="div">
        <cms:component component="${feature}" element="div" class="yComponentWrapper"/>
    </cms:pageSlot>

</template:page>