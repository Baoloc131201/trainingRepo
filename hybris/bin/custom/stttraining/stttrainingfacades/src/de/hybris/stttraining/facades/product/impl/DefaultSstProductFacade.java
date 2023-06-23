package de.hybris.stttraining.facades.product.impl;

import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.ConfigurablePopulator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.search.restriction.SearchRestrictionService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.stttraining.facades.product.SstProductFacade;
import org.springframework.beans.factory.annotation.Required;

import java.util.Collection;
import de.hybris.stttraining.core.constants.StttrainingCoreConstants;
/**
 * Facade to provide custom product
 */
public class DefaultSstProductFacade implements SstProductFacade{
   private ProductService productService;
   private UserService userService;
   private Converter<ProductModel, ProductData> productConverter;
   private CatalogVersionService catalogVersionService;
   private SearchRestrictionService searchRestrictionService;

   private ConfigurablePopulator<ProductModel, ProductData, ProductOption> productConfiguredPopulator;
   @Override
   public ProductData getStagedProductForCodeAndOptions(final String code, final Collection<ProductOption> options) {

      final CatalogVersionModel catalogVersionModel = getCatalogVersionService().
              getCatalogVersion(StttrainingCoreConstants.CATALOG_VERSION_POWERTOOLS_PRODUCT_CATALOG_ID,
                              StttrainingCoreConstants.CATALOG_VERSION_STAGED_NAME);

      searchRestrictionService.disableSearchRestrictions();
      final ProductModel productModel = getProductService().getProductForCode(catalogVersionModel, code);
      searchRestrictionService.enableSearchRestrictions();

      final ProductData productData = getProductConverter().convert(productModel);

      if (options != null)
      {
         getProductConfiguredPopulator().populate(productModel, productData, options);
      }

      return productData;
   }

   public ProductService getProductService() {
      return productService;
   }

   @Required
   public void setProductService(ProductService productService) {
      this.productService = productService;
   }

   public Converter<ProductModel, ProductData> getProductConverter() {
      return productConverter;
   }

   public CatalogVersionService getCatalogVersionService() {
      return catalogVersionService;
   }

   @Required
   public void setCatalogVersionService(CatalogVersionService catalogVersionService) {
      this.catalogVersionService = catalogVersionService;
   }

   @Required
   public void setProductConverter(final Converter<ProductModel, ProductData> productConverter)
   {
      this.productConverter = productConverter;
   }

   public UserService getUserService() {
      return userService;
   }

   @Required
   public void setUserService(UserService userService) {
      this.userService = userService;
   }

   public SearchRestrictionService getSearchRestrictionService() {
      return searchRestrictionService;
   }
   @Required
   public void setSearchRestrictionService(SearchRestrictionService searchRestrictionService) {
      this.searchRestrictionService = searchRestrictionService;
   }

   public ConfigurablePopulator<ProductModel, ProductData, ProductOption> getProductConfiguredPopulator() {
      return productConfiguredPopulator;
   }

   @Required
   public void setProductConfiguredPopulator(ConfigurablePopulator<ProductModel, ProductData, ProductOption> productConfiguredPopulator) {
      this.productConfiguredPopulator = productConfiguredPopulator;
   }
}
