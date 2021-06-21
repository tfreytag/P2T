package de.dhbw.woped.process2text.bpmnProcessing.bpt.process.epc;

import de.dhbw.woped.process2text.bpmnProcessing.bpt.process.epc.IOrganizationType;
import de.dhbw.woped.process2text.bpmnProcessing.bpt.process.epc.NonFlowObject;
import de.dhbw.woped.process2text.bpmnProcessing.bpt.process.epc.NonFlowObjectType;

/**
 * EPC organization type implementation
 * @author Artem Polyvyanyy
 *
 */
public class OrganizationType extends NonFlowObject implements IOrganizationType {

	public OrganizationType() {
		super();
	}

	public OrganizationType(String name, String desc) {
		super(name, desc);
	}

	public OrganizationType(String name) {
		super(name);
	}

	/*
	 * (non-Javadoc)
	 * @see de.hpi.bpt.process.epc.meta.NonFlowObject#getType()
	 */
	@Override
	public NonFlowObjectType getType() {
		return NonFlowObjectType.ORGANIZATION_TYPE;
	}
}