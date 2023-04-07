package com.Test;


import com.junge.GraphAPI.BreadSearch;
import com.junge.GraphAPI.DepthFirstSearch;
import com.junge.GraphAPI.Graph;


public class TestGraph {
    public static void main(String[] args) {
        Graph graph = new Graph(13);


        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,5);
        graph.addEdge(0,6);
        graph.addEdge(4,6);
        graph.addEdge(3,4);
        graph.addEdge(5,3);
        graph.addEdge(4,5);

        graph.addEdge(7,8);

        graph.addEdge(9,10);
        graph.addEdge(9,12);
        graph.addEdge(9,11);
        graph.addEdge(12,11);

       /* Queue<Integer> adj = graph.getAdj(2);
        for (Integer integer : adj) {
            System.out.println(integer);
        }


        System.out.println(graph.getE());
        System.out.println(graph.getV());*/


       /* DepthFirstSearch depthFirstSearch = new DepthFirstSearch(graph,9);


        System.out.println(depthFirstSearch.getPatency(11));
        System.out.println(depthFirstSearch.getCount());*/

        BreadSearch breadSearch = new BreadSearch(graph,0);
        System.out.println(breadSearch.getPatency(7));
        System.out.println(breadSearch.getCount());




    }
}
