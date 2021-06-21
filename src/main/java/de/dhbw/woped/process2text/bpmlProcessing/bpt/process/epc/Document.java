package de.dhbw.woped.process2text.bpmlProcessing.bpt.process.epc;

import de.hpi.bpt.process.epc.IDocument;
import de.hpi.bpt.process.epc.NonFlowObject;
import de.hpi.bpt.process.epc.NonFlowObjectType;

/**
 * EPC document implementation
 * 
 * @author Artem Polyvyanyy
 */
public class Document extends NonFlowObject implements IDocument {

	public Document() {
		super();
	}

	public Document(String name, String desc) {
		super(name, desc);
	}

	public Document(String name) {
		super(name);
	}

	/*
	 * (non-Javadoc)
	 * @see de.hpi.bpt.process.epc.meta.NonFlowObject#getType()
	 */
	@Override
	public NonFlowObjectType getType() {
		return NonFlowObjectType.DOCUMENT;
	}
}