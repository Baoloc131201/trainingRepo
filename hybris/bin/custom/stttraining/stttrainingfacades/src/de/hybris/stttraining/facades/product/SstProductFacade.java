package de.hybris.stttraining.facades.product;

import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commercefacades.product.data.ProductData;

import java.util.Collection;

public interface SstProductFacade {
    ProductData getStagedProductForCodeAndOptions(String code, Collection<ProductOption> options);
}
