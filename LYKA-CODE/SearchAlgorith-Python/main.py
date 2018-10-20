"""
    A -> B
    A -> C
    B -> C
    B -> D
    C -> D
    D -> C
    E -> F
    F -> C
"""


from library import *
graph = {'A': ['B', 'C'],
             'B': ['C', 'D'],
             'C': ['D'],
             'D': ['C','F'],
             'E': ['F'],
             'F': ['C','E']}

draw_connections(graph)
print("-----------------------------")

print(find_path(graph, 'A', 'D'))

print("-----------------------------")

print(find_all_paths(graph, 'A', 'D'))

print("-----------------------------")

print(hamilton(graph,len(graph),"A"))