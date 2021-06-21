package de.dhbw.woped.process2text.bpmnProcessing.bpt.graph.algo.bctree;

import de.dhbw.woped.process2text.bpmnProcessing.bpt.graph.abs.IEdge;
import de.dhbw.woped.process2text.bpmnProcessing.bpt.hypergraph.abs.IVertex;

import java.util.Collection;
import java.util.Vector;

public class BCTreeNode<E extends IEdge<V>, V extends IVertex> {
	private BCType nodeType;
	
	private de.dhbw.woped.process2text.bpmnProcessing.bpt.graph.algo.bctree.BCTreeNode<E,V> parentNode;
	private Vector<de.dhbw.woped.process2text.bpmnProcessing.bpt.graph.algo.bctree.BCTreeNode<E,V>> childNodes;
	
	private BCTComponent<E,V> graph;
	private V point;
	
	
	public BCTreeNode(BCTComponent<E,V> g) {
		this.parentNode = null;
		this.childNodes = new Vector<de.dhbw.woped.process2text.bpmnProcessing.bpt.graph.algo.bctree.BCTreeNode<E,V>>();

		this.graph = g;
		this.point = null;
		
		this.nodeType = BCType.B;
	}
	
	public BCTreeNode(V p) {
		parentNode = null;
		childNodes = new Vector<de.dhbw.woped.process2text.bpmnProcessing.bpt.graph.algo.bctree.BCTreeNode<E,V>>();

		this.graph = null;
		this.point = p;
		
		this.nodeType = BCType.C;
	}
	
	public BCType getNodeType() {
		return nodeType;
	}
	
	public de.dhbw.woped.process2text.bpmnProcessing.bpt.graph.algo.bctree.BCTreeNode<E,V> getParentNode() {
		return this.parentNode;
	}
	
	public BCTComponent<E,V> getGraph() {
		return this.graph;
	}
	
	public V getPoint() {
		return this.point;
	}
	
	public Collection<de.dhbw.woped.process2text.bpmnProcessing.bpt.graph.algo.bctree.BCTreeNode<E,V>> getChildren() {
		return this.childNodes;
	}
	
	public void addChild(de.dhbw.woped.process2text.bpmnProcessing.bpt.graph.algo.bctree.BCTreeNode<E,V> node) {
		this.childNodes.add(node);
	}
	
	public void removeChild(de.dhbw.woped.process2text.bpmnProcessing.bpt.graph.algo.bctree.BCTreeNode<E,V> node) {
		this.childNodes.remove(node);
	}
	
	public void setParent(de.dhbw.woped.process2text.bpmnProcessing.bpt.graph.algo.bctree.BCTreeNode<E,V> node) {
		this.parentNode = node;
	}
}
