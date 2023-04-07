package com.junge.GraphAPI;
/*
Graph API设计
* */

import java.util.LinkedList;
import java.util.PrimitiveIterator;
import java.util.Queue;
import java.util.concurrent.RecursiveTask;

public class Graph {
    //顶点数量
    private  int V;
    //边的数量
    private int E;
    //邻接表
    private Queue<Integer>[] adj;

    public  Graph(){}

    public Graph(int V){
        //初始化顶点的数量
        this.V=V;
        //初始化边
        this.E=0;
        //初始化邻接表
        this.adj=new Queue[V];
        //
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    //添加一条边
    public void addEdge(int v,int w){
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }

    public int getV(){
        return V;
    }

    public int getE(){
        return E;
    }

    //获取和v相邻的所有顶点
    public Queue<Integer> getAdj(int v){
        return adj[v];
    }




}
