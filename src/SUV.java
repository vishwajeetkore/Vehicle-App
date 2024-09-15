public class SUV extends car{
    public SUV(String name, boolean ismanual) {
        super(name, 4, 5, 6, ismanual, "SUV");
    }

    public void accelerate(int rate)
    {
        int newspeed = getCurrentspeed()+rate;

        if(newspeed == 0)
        {
            stop();
            changegear(1);
        }
        else if (newspeed >0 && newspeed <=10){
            changegear(1);
        } else if (newspeed >10 && newspeed <=20){
            changegear(2);
        } else if (newspeed >20 && newspeed <=30){
            changegear(3);
        } else if (newspeed >30 && newspeed <=50){
            changegear(4);
        } else if (newspeed >50 && newspeed <=70){
            changegear(5);
        }else {
            changegear(6);
        }

        if(newspeed >0)
        {
            changespeed(newspeed, getCurrentdirection());
        }

    }
}
