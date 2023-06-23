package de.hybris.stttraining.storefront.controllers.cms;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.cms.AbstractCMSComponentController;
import de.hybris.stttraining.core.model.CustomPoliciesComponentModel;
import de.hybris.stttraining.storefront.controllers.ControllerConstants;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
@Controller("CustomPoliciesComponentController")
@RequestMapping(value = ControllerConstants.Actions.Cms.CustomPoliciesComponent)
public class CustomPoliciesComponentController extends AbstractCMSComponentController<CustomPoliciesComponentModel> {
    @Override
    protected void fillModel(HttpServletRequest request, Model model, CustomPoliciesComponentModel component) {
        model.addAttribute("policyImage", component.getPolicyImage());

        model.addAttribute("policyHeading", component.getPolicyHeading());

        model.addAttribute("policyContents", component.getPolicyContents());
    }

    @Override
    protected String getView(CustomPoliciesComponentModel component) {
        return ControllerConstants.Views.Cms.ComponentPrefix + StringUtils.lowerCase(getTypeCode(component));
    }
}
