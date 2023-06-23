package de.hybris.stttraining.storefront.controllers.cms;

import de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel;
import de.hybris.stttraining.core.model.PolicySectionContentComponentModel;
import de.hybris.stttraining.storefront.controllers.ControllerConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller("PolicySectionContentComponentController")
@RequestMapping(value = ControllerConstants.Actions.Cms.PolicySectionContentComponent)
public class PolicySectionContentComponentController extends AbstractAcceleratorCMSComponentController<PolicySectionContentComponentModel>{
    @Override
    protected void fillModel(HttpServletRequest request, Model model, PolicySectionContentComponentModel component) {
        model.addAttribute("policyContentImage", component.getPolicyContentImage());

        model.addAttribute("policySectionHeading", component.getPolicySectionHeading());

        model.addAttribute("policySectionBody", component.getPolicySectionBody());
    }
}
