package interfacing.challenges;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }

    public static void saveObject(ISavable objectToSave){
        for(int i=0; i<objectToSave.write().size(); i++ ){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISavable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
