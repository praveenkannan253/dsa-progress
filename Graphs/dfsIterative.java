import java.util.*;

public class dfsIterative{
    static void DFS(int s,ArrayList<ArrayList<Integer>>adj,int n){
        boolean[] vis=new boolean[n];
        Stack<Integer>st=new Stack<>();
        st.push(s);
        
        while(!st.isEmpty()){
            int node=st.pop();
            if(!vis[node]){
                vis[node]=true;
                System.out.print(node+ " ");
            
                for(Integer neighbor:adj.get(node)){
                    if(!vis[neighbor]){
                         st.push(neighbor);
                    }
                }
             }
        }
    }
    public static void main(String[] args){
        int n=7;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(2).add(5);
        adj.get(2).add(6);        
        
        DFS(0,adj,n);
    }
}