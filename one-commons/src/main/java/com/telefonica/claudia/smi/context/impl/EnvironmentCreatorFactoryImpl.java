/*

  (c) Copyright 2011 Telefonica, I+D. Printed in Spain (Europe). All Rights
  Reserved.

  The copyright to the software program(s) is property of Telefonica I+D.
  The program(s) may be used and or copied only with the express written
  consent of Telefonica I+D or in accordance with the terms and conditions
  stipulated in the agreement/contract under which the program(s) have
  been supplied.

  */
package com.telefonica.claudia.smi.context.impl;

import com.telefonica.claudia.smi.context.EnvironmentCreator;
import com.telefonica.claudia.smi.context.EnvironmentCreatorFactory;

/**
 * Creates the Environment Creator Implementation
 * 
 * @author luismarcos.ayllon
 *
 */
public class EnvironmentCreatorFactoryImpl implements EnvironmentCreatorFactory {

	private EnvironmentCreator ovfCreator;
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public EnvironmentCreator getInstance(String type) {
		if (ovfCreator == null)
			ovfCreator = new EnvironmentCreatorImpl();
		
		if (type.equals("ovf"))
			return ovfCreator;
		else 
			return ovfCreator;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EnvironmentCreator getInstance() {
		return getInstance("");
	}

    
}
