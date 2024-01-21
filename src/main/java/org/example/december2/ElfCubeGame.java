package org.example.december2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ElfCubeGame {
    private File puzzleInput;

    private HashMap<String, Integer> maxAllowedCountForColorHashMap;
    private HashMap<Integer, String> gameIDAndStringHashMap;
    private List<Integer> IDListOfPossibleGames;

    private ArrayList<String> puzzleInputStringArray;

    public ElfCubeGame(File puzzleInput) {
        this.puzzleInput = puzzleInput;
        IDListOfPossibleGames = new ArrayList<>();
        gameIDAndStringHashMap = new HashMap<>();
        puzzleInputStringArray = new ArrayList<>();
        maxAllowedCountForColorHashMap = new HashMap<>();
        setAllowedCountForColors();
        getStringArrayListFromFile();

        fillGameIDAndStringHashMap();

    }

    public void setAllowedCountForColors() {
        maxAllowedCountForColorHashMap.put("red", 12);
        maxAllowedCountForColorHashMap.put("green", 13);
        maxAllowedCountForColorHashMap.put("blue", 14);
    }

    public void getStringArrayListFromFile() {
        try {
            FileReader fr = new FileReader(puzzleInput);
            Scanner sc = new Scanner(fr);

            while (sc.hasNextLine()) {
                puzzleInputStringArray.add(sc.nextLine());
            }

            sc.close();
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void fillGameIDAndStringHashMap() {
        for (String line : puzzleInputStringArray) {
            String[] tempStringArray = line.split(":");

            //remove "Game " part of the String, so only the ID remains
            tempStringArray[0] = tempStringArray[0].substring(5);

            gameIDAndStringHashMap.put(Integer.parseInt(tempStringArray[0]), tempStringArray[1]);
        }
    }

    public void assessTheGameIDAndStringHashMapForAllowedCount() {
        HashMap<String, Integer> countForColorHashMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : gameIDAndStringHashMap.entrySet()) {
            String colorCountString = entry.getValue();

        }
    }

}
