package de.hybris.stttraining.core.handler.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import java.util.Objects;

public class DefaultDynamicAttributeSkuHandler implements DynamicAttributeHandler<String, ProductModel> {
    public static final String VALUE_DELIMITER = "-";
    @Override
    public String get(final ProductModel model) {
        if (model == null)
        {
            throw new IllegalArgumentException("Item model is required");
        }
        return model.getCode() + VALUE_DELIMITER + Objects.requireNonNullElse(model.getSstColor(), new StringBuilder());
    }

    @Override
    public void set(final ProductModel model, String value) {
       throw new UnsupportedOperationException();
    }
}
