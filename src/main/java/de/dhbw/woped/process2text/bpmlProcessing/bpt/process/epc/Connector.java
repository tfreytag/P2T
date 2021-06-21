package de.dhbw.woped.process2text.bpmlProcessing.bpt.process.epc;

import de.hpi.bpt.process.epc.ConnectorType;
import de.hpi.bpt.process.epc.FlowObject;
import de.hpi.bpt.process.epc.FlowObjectType;
import de.hpi.bpt.process.epc.IConnector;

/**
 * EPC connector implementation
 * 
 * @author Artem Polyvyanyy
 */
public class Connector extends FlowObject implements IConnector {
	private ConnectorType type = ConnectorType.UNDEFINED;
	
	public Connector(ConnectorType type) {
		super();
		this.setConnectorType(type);
	}

	/*
	 * (non-Javadoc)
	 * @see de.hpi.bpt.process.epc.flow.IConnector#getConnectorType()
	 */
	public ConnectorType getConnectorType() {
		return type;
	}

	/*
	 * (non-Javadoc)
	 * @see de.hpi.bpt.process.epc.flow.IConnector#setConnectorType(de.hpi.bpt.process.epc.flow.ConnectorType)
	 */
	public void setConnectorType(ConnectorType type) {
		this.type = type;
	}

	/*
	 * (non-Javadoc)
	 * @see de.hpi.bpt.process.epc.flow.FlowObject#getType()
	 */
	@Override
	public FlowObjectType getType() {
		return FlowObjectType.CONNECTOR;
	}

	/*
	 * (non-Javadoc)
	 * @see de.hpi.bpt.hypergraph.abs.GObject#toString()
	 */
	@Override
	public String toString() {
		return this.type.name();
	}

	public boolean isAND() {
		return this.getConnectorType()==ConnectorType.AND;
	}

	public boolean isOR() {
		return this.getConnectorType()==ConnectorType.OR;
	}

	public boolean isXOR() {
		return this.getConnectorType()==ConnectorType.XOR;
	}	
}
