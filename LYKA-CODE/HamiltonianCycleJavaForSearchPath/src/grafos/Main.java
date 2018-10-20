/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

/**
 *
 * @author koukin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         HamiltonianCycle hamiltonian = 
                                new HamiltonianCycle(); 
        /* Let us create the following graph 
           (0)--(1)--(2) 
            |   / \   | 
            |  /   \  | 
            | /     \ | 
           (3)-------(4)    */
        int graph1[][] = {{0, 1, 0, 1, 0}, 
            {1, 0, 1, 1, 1}, 
            {0, 1, 0, 0, 1}, 
            {1, 1, 0, 0, 1}, 
            {0, 1, 1, 1, 0}, 
        }; 
  
        // Print the solution 
        hamiltonian.hamCycle(graph1); 
  
        /* Let us create the following graph 
           (0)--(1)--(2) 
            |   / \   | 
            |  /   \  | 
            | /     \ | 
           (3)       (4)    */
        int graph2[][] = {{0, 1, 0, 1, 0}, 
            {1, 0, 1, 1, 1}, 
            {0, 1, 0, 0, 1}, 
            {1, 1, 0, 0, 0}, 
            {0, 1, 1, 0, 0}, 
        }; 
  
        // Print the solution 
        hamiltonian.hamCycle(graph2);
        
        int graph3[][] = {{1, 1, 1, 1, 1}, 
            {1, 1, 1, 1, 1}, 
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
        }; 
  
        // Print the solution 
        hamiltonian.hamCycle(graph3);
    } 
    
    
}
