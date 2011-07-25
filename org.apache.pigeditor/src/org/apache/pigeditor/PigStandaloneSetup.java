
package org.apache.pigeditor;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PigStandaloneSetup extends PigStandaloneSetupGenerated{

	public static void doSetup() {
		new PigStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

