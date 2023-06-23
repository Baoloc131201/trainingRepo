<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<div class="policy_container">
    <img alt="Policy Image" src="${policyImage.url}" class="policy_image">
    <div class="policyComponent_content">
        <p class="policyComponent_header_text">${policyHeading}</p>
        <div class="policyComponent_body_content">
            <c:forEach items="${policyContents}" var="policyContent">
            <p class="policy_list_element">${policyContent.content}</p>
            </c:forEach>
        </div>
    </div>
</div>