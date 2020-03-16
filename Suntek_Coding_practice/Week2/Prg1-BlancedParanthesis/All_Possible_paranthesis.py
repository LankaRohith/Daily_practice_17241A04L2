class Node:
    def __init__(self,data,opn,cls):
        self.data=data
        self.opn=opn
        self.cls=cls
        self.right=None
        self.left=None
    def insert(self):
        if self.data:
            if self.opn==self.cls and self.opn!=0:
                if self.left is None:
                    m=self.data+"("
                    self.left=Node(m,self.opn-1,self.cls)
                    self.left.insert()
                
            elif self.opn<self.cls:
                if self.opn!=0:
                    m=self.data+"("
                    self.left=Node(m,self.opn-1,self.cls)
                    self.left.insert()
                    m=self.data+")"
                    self.right=Node(m,self.opn,self.cls-1)
                    self.right.insert()
                else:
                    m=self.data+")"
                    self.right=Node(m,self.opn,self.cls-1)
                    self.right.insert()
                    
            elif self.opn==self.cls and self.opn==0:
                return
                
                
        else:
            self.left=Node("(",self.opn-1,self.cls)
            self.left.insert()            
    def printTree(self):
        if self.left:
            self.left.printTree()
        if not self.left and not self.right:
            print(self.data)
        if self.right:
            self.right.printTree()
n=int(input())
root=Node("",n,n)
root.insert()
root.printTree()
