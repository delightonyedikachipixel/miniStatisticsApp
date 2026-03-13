public class AirConditioner {

    boolean isOn;
    int temperature = 16;

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
        temperature = 0;
    }

    public boolean isOn(){
        return isOn;
    }

    public void increaseTemperature(){
        if (temperature < 30){
            temperature++;
        }
    }

    public void decreaseTemperature(){
        if (temperature > 16){
            temperature--;
        }
    }

    public int getTemperature(){
        return temperature;
    }
}
