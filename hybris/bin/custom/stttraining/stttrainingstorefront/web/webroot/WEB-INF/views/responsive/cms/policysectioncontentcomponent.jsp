<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<div class="policy_section_content_container">
    <div class="policySectionComponent_content">
        <p class="policySectionComponent_header_text">${policySectionHeading}</p>
        <img alt="Policy Image" src="${policyContentImage.url}" class="policy_section_image">
        <div class="policySectionComponent_body_content">
            <c:forEach items="${policySectionBody}" var="policySection">
                 <p class="policy_list_element">${policySection.content}</p>
            </c:forEach>
        </div>
    </div>
</div>