package de.hybris.stttraining.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.apache.commons.lang.StringUtils;

import java.util.Objects;

/**
 * Populates {@link ProductData} with sstColor, additionalDescription and skuName
 */
public class SstProductDataPopulator implements Populator<ProductModel, ProductData> {
    @Override
    public void populate(ProductModel source, ProductData target) throws ConversionException {
        target.setSstColor(Objects.requireNonNullElse(source.getSstColor(), new StringBuilder()).toString());
        target.setAdditionalDescription(StringUtils.defaultIfEmpty(source.getAdditionalDescription(), StringUtils.EMPTY));
        target.setSkuName(StringUtils.defaultIfEmpty(source.getSkuName(), StringUtils.EMPTY));
    }
}
