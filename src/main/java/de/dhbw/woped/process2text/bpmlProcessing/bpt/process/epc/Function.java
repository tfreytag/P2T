package de.dhbw.woped.process2text.bpmlProcessing.bpt.process.epc;

import de.hpi.bpt.process.epc.FlowObject;
import de.hpi.bpt.process.epc.FlowObjectType;
import de.hpi.bpt.process.epc.IFunction;

/**
 * EPC function implementation
 * @author Artem Polyvyanyy
 *
 */
public class Function extends FlowObject implements IFunction {

	private long duration = 0;
	
	public Function() {
		super();
	}

	public Function(String name, String desc) {
		super(name, desc);
	}

	public Function(String name) {
		super(name);
	}

	/*
	 * (non-Javadoc)
	 * @see de.hpi.bpt.process.epc.flow.IFunction#getDuration()
	 */
	public long getDuration() {
		return this.duration;
	}

	/*
	 * (non-Javadoc)
	 * @see de.hpi.bpt.process.epc.flow.IFunction#setDuration(long)
	 */
	public void setDuration(long d) {
		this.duration = d;
	}

	/*
	 * (non-Javadoc)
	 * @see de.hpi.bpt.process.epc.flow.FlowObject#getType()
	 */
	@Override
	public FlowObjectType getType() {
		return FlowObjectType.FUNCTION;
	}

}
