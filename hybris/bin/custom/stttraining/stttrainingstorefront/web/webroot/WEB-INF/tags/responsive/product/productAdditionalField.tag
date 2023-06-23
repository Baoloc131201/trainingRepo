<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url value="${product.url}" var="productUrl"/>
<div>
    <table>
        	    <tr style="height: 50px">
                            <td style="width:200px; height: 20px;">Color</th>
                            <td>${product.sstColor}</td>
                </tr>
                <tr style="height: 50px">
                    <td style="width:200px; height: 20px;">SKU</th>
                    <td>${product.skuName}</td>
                </tr>
                <tr style="height: 50px">
                    <td style="width:200px; height: 20px;">Additional Description</th>
                    <td>${product.additionalDescription}</td>
                </tr>
            </table>
            <br/>
            <c:set value="${ (param.stagedVersion != null) ? param.stagedVersion : 'false' }" var="condition"/>
            <c:if test="${condition}">
                <button type="button" class="btn btn-secondary" onclick="location.href='${fn:escapeXml(productUrl)}'" >Click here to back to the Online Version</button>
             </c:if>
             <c:if test="${!condition}">
                <button type="button" class="btn btn-secondary" onclick="location.href='${fn:escapeXml(productUrl)}?stagedVersion=true'" >Click here to view the staged version of this product</button>
             </c:if>
</div>