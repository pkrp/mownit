package agh.mownit;

import java.awt.Dimension;

import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;

public class SimpleGraphView {

	private String fileName;
	private Graph<Integer, String> graph;

	public SimpleGraphView() {
		graph = new SparseMultigraph<Integer, String>();
		graph.addVertex((Integer) 1);
		graph.addVertex((Integer) 2);
		graph.addVertex((Integer) 4);
		graph.addEdge("Edge-A", 1, 2); // Note that Java 1.5 auto-boxes primitives
		graph.addEdge("Edge-B", 2, 4);
	}
	
	public static BasicVisualizationServer<Integer, String> setGraph(String fileName) {
		
		fileName = fileName;

		SimpleGraphView sgv = new SimpleGraphView(); // We create our graph in
														// here
		Layout<Integer, String> layout = new CircleLayout(sgv.graph);
		layout.setSize(new Dimension(300, 300));
		BasicVisualizationServer<Integer, String> vv = new BasicVisualizationServer<Integer, String>(layout);
		vv.setPreferredSize(new Dimension(350, 350));
		return vv;
	}

}
