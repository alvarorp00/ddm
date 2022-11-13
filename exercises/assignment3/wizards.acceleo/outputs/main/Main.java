/**
 * Main
 */

package main;

import wizard.Wizard;

public class Main {
	public static void main(String[] args) {
		System.out.println("[Running] wizard instance");
		Wizard wizard = new Wizard();
		wizard.showWizard();
	}
}

