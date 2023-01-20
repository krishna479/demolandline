public class Landline implements Phone {

    private boolean isringing;
    private boolean power;
    private String Phoneno;

    public Landline( String phoneno) {

        power = true;
        isringing = false;
        Phoneno = phoneno;
    }


    @Override
    public void powerOn() {
       this.power = true;

    }

    @Override
    public boolean isRinging() {
        return isringing;
    }

    @Override
    public void callNumber(String phoneNo) {
          if(power == true ){
              System.out.println("dialing the number");

        }
          else{
              System.out.println("power if off");
          }
    }

    @Override
    public boolean answerCall() {
        if(isringing == true){
            System.out.println("Call answered");
            isringing= false;
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public void receiveCall(String phoneNo) {
        if (power == true && phoneNo.equals(Phoneno)) {
            this.isringing = true;
            System.out.println("ringing the phone");

        } else {
            System.out.println("power off");
        }
    }

    public boolean isIsringing() {
        return isringing;
    }

    public void setIsringing(boolean isringing) {
        this.isringing = isringing;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public String getPhoneno() {
        return Phoneno;
    }

    public void setPhoneno(String phoneno) {
        Phoneno = phoneno;
    }


    }

