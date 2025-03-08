public class ZombiePlant {
    private int potency;
    private int cure;
    public ZombiePlant(int maxpotency,int cureneeded){
        potency=maxpotency;
        cure=cureneeded;
    }
    public int getPotency(){
        return potency;
    }
    public int treatmentsNeeded(){
        return cure;
    }
    public boolean isDangerous(){
        if(cure!=0){
            return true;
        }
        else{
            return false;
        }
    }
    public void treat(int num){
        if(cure>0){
            if(num<=potency&&num>0){
                cure--;
            }
            else if(num>potency){
                cure++;
            }
            else{
                ;
            }
        }
        else if(cure==0){
            if (num > potency){
                cure++;
            }
        }
        else{
            ;
        }
    }
}

