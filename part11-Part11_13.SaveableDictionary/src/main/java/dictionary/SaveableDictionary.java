/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private String fileName;
    private HashMap<String, String> dic;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
        this.dic = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.fileName = file;
        this.dic = new HashMap<>();
    }

    public void add(String words, String translation) {
        if (!dictionary.containsKey(words)) {
            dictionary.put(words, translation);
            dictionary.put(translation, words);

        }
        if (!dic.containsKey(translation)) {
            dic.put(words, translation);
        }
    }

    public String translate(String word) {
        String translation = null;
        for (String key : dictionary.keySet()) {
            if (key.equals(word)) {
                translation = dictionary.get(key);
            }

        }

        return translation;
    }

    public void delete(String word) {
        dic.remove(translate(word)); // bu iki satir asagida olunca hata verdi. niye anlamadim. daha evvelden tecrube ile yer degistirince duzeldi:)
        dic.remove(word);
        dictionary.remove(translate(word));
        dictionary.remove(word);
        

    }

    public boolean load() {
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
// we read all the lines of the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals("")) {
                    break;
                }
                String[] parts = line.split(":");
                String word = parts[0];
                String translation = parts[1];
                dictionary.put(word, translation);
                dictionary.put(translation, word);
                dic.put(word, translation);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean save() {

        try {
            PrintWriter writer = new PrintWriter(fileName);
            for (String key : dic.keySet()) {

                writer.println(key + ":" + dic.get(key));

            }
            writer.close();

        } catch (Exception e) {
            return false;
        }

        return true;
    }

}
