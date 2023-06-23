/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.stttraining.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.stttraining.fulfilmentprocess.constants.StttrainingFulfilmentProcessConstants;

public class StttrainingFulfilmentProcessManager extends GeneratedStttrainingFulfilmentProcessManager
{
	public static final StttrainingFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (StttrainingFulfilmentProcessManager) em.getExtension(StttrainingFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
