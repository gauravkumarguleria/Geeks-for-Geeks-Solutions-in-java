
class Solution
{   
    class Student{
        int phy, chem, math;
        Student(int phy, int chem, int math){
            this.phy = phy;
            this.chem = chem;
            this.math = math;
            
        }
    }
    
    
    public void customSort (int phy[], int chem[], int math[], int N)
    {
        Student [] stud = new Student[N];
        for(int idx = 0; idx<N;  idx++){
            stud[idx] = new Student(phy[idx], chem[idx], math[idx]);
        }
        
        Arrays.sort(stud, (a,b)->{
            if(a.phy != b.phy) return a.phy - b.phy;
            
            if(a.chem != b.chem) return b.chem - a.chem;
            
            return a.math - b.math;
        });
        
        for(int idx = 0; idx<N; idx++){
            phy[idx] = stud[idx].phy;
            chem[idx] = stud[idx].chem;
            math[idx] = stud[idx].math;
        }
    }
}
