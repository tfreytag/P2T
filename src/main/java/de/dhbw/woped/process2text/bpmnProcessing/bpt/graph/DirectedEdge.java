package de.dhbw.woped.process2text.bpmnProcessing.bpt.graph;

import de.dhbw.woped.process2text.bpmnProcessing.bpt.graph.abs.AbstractDirectedEdge;
import de.dhbw.woped.process2text.bpmnProcessing.bpt.graph.abs.AbstractMultiDirectedGraph;
import de.dhbw.woped.process2text.bpmnProcessing.bpt.hypergraph.abs.Vertex;

/**
 * Directed edge implementation
 * 
 * @author Artem Polyvyanyy
 */
public class DirectedEdge extends AbstractDirectedEdge<Vertex>
{
	@SuppressWarnings("unchecked")
	protected DirectedEdge(AbstractMultiDirectedGraph g, Vertex source, Vertex target) {
		super(g, source, target);
	}
}
