package com.junge.GraphAPI;

import java.util.LinkedList;
import java.util.Queue;
/*
广度搜索
* */
public class BreadSearch {

    //索引表示每个顶点 布尔值代表是否被搜索过
    private boolean[] marked;

    //有多少与顶点s相通
    private int count;

    private Queue<Integer> waitQueue;

    public BreadSearch(Graph graph, int s) {
        this.marked = new boolean[graph.getV()];
        this.count = 0;
        this.waitQueue=new LinkedList<>();
        getPatencyVertex(graph, s);
    }

    //顶点
    private void getPatencyVertex(Graph graph, int v) {
        marked[v] = true;
        waitQueue.add(v);//0

        while(!waitQueue.isEmpty()){
            //1
            Integer element = waitQueue.poll();
            count++;
            for (Integer integer : graph.getAdj(element)) {

                if(!marked[integer]){
                    marked[integer]=true;
                    waitQueue.add(integer);
                    //getPatencyVertex(graph,integer);
                }

                //waitQueue.add(integer);
                //2 3
                //这里直接将所有brother node 全部入队

            }

            //int peek =(int)waitQueue.peek();
           /* if(!marked[peek]){
               getPatencyVertex(graph,peek);
            }
*/
        }


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
