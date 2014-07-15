/*
 * KlassViz - Kieler Class Diagram Visualization
 * 
 * A part of OpenKieler
 * https://github.com/OpenKieler
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.klassviz.text;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ClassDataStandaloneSetup extends ClassDataStandaloneSetupGenerated{

	public static void doSetup() {
		new ClassDataStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

