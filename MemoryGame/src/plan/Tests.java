package plan;


import javafx.scene.image.Image;

import java.util.Random;

public class Tests {
    public static void main(String[] args) {

    int numberOfTests = 10;
    int passedTests = 0;

        for (int i = 0; i < numberOfTests; i++)
        {
        if(testSettingAndGettingMethodsSceneOne())
            passedTests++;
        }

            System.out.println("Testy 'testSettingAndGettingMethodsSceneOne'");
            System.out.println("Liczba testów: " + numberOfTests);
            System.out.println("Liczba testów zakonczonych powodzeniem: " + passedTests);
            System.out.println("---------------------------------------------------------------------");
            passedTests = 0;

        for (int i = 0; i < numberOfTests; i++)
        {
            if(testEqualityScenes())
                passedTests++;
        }
            System.out.println("Testy 'testEqualityScenes'");
            System.out.println("Liczba testów: " + numberOfTests);
            System.out.println("Liczba testów zakonczonych powodzeniem: " + passedTests);
            System.out.println("---------------------------------------------------------------------");
            passedTests = 0;

        for (int i = 0; i < numberOfTests; i++)
        {
            if(checkingOfNumberOfPairs())
                passedTests++;
        }

        System.out.println("Testy 'checkingOfNumberOfPairs'");
        System.out.println("Liczba testów: " + numberOfTests);
        System.out.println("Liczba testów zakonczonych powodzeniem: " + passedTests);
        System.out.println("---------------------------------------------------------------------");
        passedTests = 0;

        for (int i = 0; i < numberOfTests; i++)
        {
            if(checkingDiffrencesBetweenScenes())
                passedTests++;
        }

        System.out.println("Testy 'checkingDiffrencesBetweenScenes'");
        System.out.println("Liczba testów: " + numberOfTests);
        System.out.println("Liczba testów zakonczonych powodzeniem: " + passedTests);
        System.out.println("---------------------------------------------------------------------");
        passedTests = 0;

        for (int i = 0; i < numberOfTests; i++)
        {
            if(testCorrectId())
                passedTests++;
        }

        System.out.println("Testy 'testCorrectId'");
        System.out.println("Liczba testów: " + numberOfTests);
        System.out.println("Liczba testów zakonczonych powodzeniem: " + passedTests);
        System.out.println("---------------------------------------------------------------------");
        passedTests = 0;

        for (int i = 0; i < numberOfTests; i++)
        {
            if(testHashCoding())
                passedTests++;
        }

        System.out.println("Testy 'testHashCoding'");
        System.out.println("Liczba testów: " + numberOfTests);
        System.out.println("Liczba testów zakonczonych powodzeniem: " + passedTests);
        System.out.println("---------------------------------------------------------------------");
        passedTests = 0;

        for (int i = 0; i < numberOfTests; i++)
        {
            if(testOfDimentions())
                passedTests++;
        }

        System.out.println("Testy 'testOfDimentions'");
        System.out.println("Liczba testów: " + numberOfTests);
        System.out.println("Liczba testów zakonczonych powodzeniem: " + passedTests);
        System.out.println("---------------------------------------------------------------------");
        passedTests = 0;

        for (int i = 0; i < numberOfTests; i++)
        {
            if(testOfEquality())
                passedTests++;
        }

        System.out.println("Testy 'testOfEquality'");
        System.out.println("Liczba testów: " + numberOfTests);
        System.out.println("Liczba testów zakonczonych powodzeniem: " + passedTests);
        System.out.println("---------------------------------------------------------------------");
        passedTests = 0;

    }




   public static boolean testSettingAndGettingMethodsSceneOne(){
       SceneOne testScene = new SceneOne();
       Random random = new Random();
       int testValue = random.nextInt();
       testScene.setId(testValue);
       if(testScene.getId()==testValue)
           return true;
       else
           return false;
    }

    public static boolean testEqualityScenes(){
        Random random = new Random();
        int testValue = random.nextInt();
        SceneOne testScene1 = new SceneOne();
        testScene1.setId(testValue);
        SceneOne testScene2 = new SceneOne();
        testScene2.setId(testValue);
        if(testScene1.getId()==testScene2.getId())
            return true;
        else
            return false;
    }

    public static boolean checkingOfNumberOfPairs(){
        Random random = new Random();
        int testValue = random.nextInt();
        SceneOne testScene1 = new SceneOne();
        int numberOfPairs = testScene1.getNumberOfPairs();
        testScene1.setNumberOfPairs(testValue);
        if(testScene1.getNumberOfPairs()!= numberOfPairs)
            return true;
        else
            return false;
    }

    public static boolean checkingDiffrencesBetweenScenes(){
        SceneOne testScene1 = new SceneOne();
        SceneOne testScene2 = new SceneOne();
        if(testScene1.hashCode()!= testScene2.hashCode())
            return true;
        else
            return false;

    }

    public static boolean testHashCoding(){
        SceneOne testScene1 = new SceneOne();
        SceneOne testScene2 = testScene1;
        if(testScene1.hashCode()== testScene2.hashCode())
            return true;
        else
            return false;

    }
    public static boolean testCorrectId(){
        Random random = new Random();
        int testValue = random.nextInt();
        SceneOne testScene1 = new SceneOne();

        if(testScene1.getBetterId(testValue)==testValue)
            return true;
        else
            return false;
    }

    public static boolean testOfDimentions(){
        SceneOne testScene1 = new SceneOne();
        if(testScene1.getDimension() == Math.ceil(Math.sqrt(testScene1.getNumberOfPairs() * 2)))
            return true;
        else
            return false;
    }
    public static boolean testOfEquality(){
        SceneOne testScene1 = new SceneOne();
        SceneOne testScene2 = new SceneOne();
        if(testScene1.equals(testScene2) == false)
            return true;
        else
            return false;
    }





}
