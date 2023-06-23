/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.stttraining.fulfilmentprocess.test.actions.consignmentfulfilment;

import de.hybris.platform.ordersplitting.model.ConsignmentProcessModel;
import de.hybris.platform.processengine.model.BusinessProcessModel;
import de.hybris.stttraining.fulfilmentprocess.constants.StttrainingFulfilmentProcessConstants;

import org.apache.log4j.Logger;


/**
 *
 */
public class SubprocessEnd extends AbstractTestConsActionTemp
{
	private static final Logger LOG = Logger.getLogger(SubprocessEnd.class);

	@Override
	public String execute(final BusinessProcessModel process) throws Exception
	{
		super.execute(process);

		final ConsignmentProcessModel consProc = (ConsignmentProcessModel) process;
		getBusinessProcessService().triggerEvent(consProc.getParentProcess().getCode() + "_ConsignmentSubprocessEnd");
		LOG.info("Process: " + process.getCode() + " fire event "
				+ StttrainingFulfilmentProcessConstants.CONSIGNMENT_SUBPROCESS_END_EVENT_NAME);
		((ConsignmentProcessModel) process).setDone(true);
		modelService.save(process);
		return getResult();

	}
}
