/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.stttraining.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.stttraining.core.constants.StttrainingCoreConstants;
import de.hybris.stttraining.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class StttrainingCoreManager extends GeneratedStttrainingCoreManager
{
	public static final StttrainingCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (StttrainingCoreManager) em.getExtension(StttrainingCoreConstants.EXTENSIONNAME);
	}
}
