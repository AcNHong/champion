package com.junge.GraphAPI;

import java.util.Queue;

/*
深度搜索图
 */
public class DepthFirstSearch {
    //索引表示每个顶点 布尔值代表是否被搜索过
    private boolean[] marked;

    //有多少与顶点s相通
    private int count;

    public DepthFirstSearch(Graph graph, int s) {
        this.marked = new boolean[graph.getV()];
        this.count = 0;
        getPatencyVertex(graph, s);
    }

    //顶点
    private void getPatencyVertex(Graph graph, int v) {
        //索引表示顶点 值代表是否被搜索
        marked[v] = true;
        //获取对应的邻接表
        Queue<Integer> adj = graph.getAdj(v);
        //遍历邻接表找出相邻的顶点
        for (Integer integer : adj) {
            //首先判断该顶点是否已经被搜索过
            //找到相邻的顶点 标识为以搜索过
            /*if(!marked[integer]){
                getPatencyVertex(graph,integer);
            }*/
            if(!marked[integer]){
                marked[integer]=true;
                count++;
            }

        }
        getPatencyVertex(graph,v);
        //顶到递归到最后一个顶点，就会回溯

        count++;
    }

    //获取此顶点与起点是否相通
    public boolean getPatency(int w) {
        return marked[w];
    }


    //获取与起点相通的顶点个数
    public int getCount() {
        return count;
    }

}



