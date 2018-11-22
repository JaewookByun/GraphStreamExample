package org.chronograph.gstest;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.ui.spriteManager.Sprite;
import org.graphstream.ui.spriteManager.SpriteManager;
import org.graphstream.ui.view.Viewer;

/**
 * Hello world!
 *
 */
public class P1ShowGraph {
	public static void main(String[] args) {
		System.setProperty("gs.ui.renderer",  "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
		Graph graph = new MultiGraph("Tutorial 1");
		Node a = graph.addNode("A");
		Node b = graph.addNode("B");
		Node c = graph.addNode("C");
		graph.addEdge("AB", "A", "B");
		graph.addEdge("BC", "B", "C");
		graph.addEdge("CA", "C", "A");
		
		// coordinate xyz
		
		a.setAttribute("xyz", -2, -2, -2);
		b.setAttribute("xyz", 1, 1, 1);
		c.setAttribute("xyz", 1, 0, -1);
		
		SpriteManager sman = new SpriteManager(graph);
		Sprite as = sman.addSprite("A");
		as.setPosition(-2, -2, -2);
		as.attachToNode("A");
		
		
		Viewer viewer = graph.display();
		viewer.disableAutoLayout();
	}
}
