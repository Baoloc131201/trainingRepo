package de.hybris.stttraining.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.constants.WebConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.AbstractPageModel;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.stttraining.storefront.controllers.ControllerConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PolicyPageController extends AbstractPageController {
    private static final String POLICY_ONE_CMS_PAGE = "policy1";
    private static final String POLICY_SECOND_CMS_PAGE = "policy2";
    @GetMapping(value = "/policy1")
    public String policy1(final Model model, final RedirectAttributes redirectModel) throws CMSItemNotFoundException
    {
        final ContentPageModel contentPage = getContentPageForLabelOrId(POLICY_ONE_CMS_PAGE);
        storeCmsPageInModel(model, contentPage);
        setUpMetaDataForContentPage(model, contentPage);
        updatePageTitle(model, contentPage);
        return getViewForPage(model);
    }

    @GetMapping (value = "/policy2")
    public String policy2(final Model model, final RedirectAttributes redirectModel) throws CMSItemNotFoundException
    {
        final ContentPageModel contentPage = getContentPageForLabelOrId(POLICY_SECOND_CMS_PAGE);
        storeCmsPageInModel(model, contentPage);
        setUpMetaDataForContentPage(model, contentPage);
        updatePageTitle(model, contentPage);
        return getViewForPage(model);
    }

        protected void updatePageTitle(final Model model, final AbstractPageModel cmsPage)
    {
        storeContentPageTitleInModel(model, getPageTitleResolver().resolveContentPageTitle(cmsPage.getTitle()));
    }
}
