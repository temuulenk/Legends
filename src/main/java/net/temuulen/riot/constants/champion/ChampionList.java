package main.java.net.temuulen.riot.constants.champion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

public class ChampionList {

    private Map<String, Champion> data;
    private String version;
    private String type;

    private ArrayList<Champion> champions;

    public ChampionList() {
        champions = new ArrayList<>();
        champions.add(new Champion("Annie", "Annie", 1));
        champions.add(new Champion("Olaf", "Olaf", 2));
        champions.add(new Champion("Galio", "Galio", 3));
        champions.add(new Champion("Twisted Fate", "TwistedFate", 4));
        champions.add(new Champion("Xin Zhao", "XinZhao", 5));
        champions.add(new Champion("Urgot", "Urgot", 6));
        champions.add(new Champion("LeBlanc", "Leblanc", 7));
        champions.add(new Champion("Vladimir", "Vladimir", 8));
        champions.add(new Champion("Fiddlesticks", "Fiddlesticks", 9));
        champions.add(new Champion("Kayle", "Kayle", 10));
        champions.add(new Champion("Master Yi", "MasterYi", 11));
        champions.add(new Champion("Alistar", "Alistar", 12));
        champions.add(new Champion("Ryze", "Ryze", 13));
        champions.add(new Champion("Sion", "Sion", 14));
        champions.add(new Champion("Sivir", "Sivir", 15));
        champions.add(new Champion("Soraka", "Soraka", 16));
        champions.add(new Champion("Teemo", "Teemo", 17));
        champions.add(new Champion("Tristana", "Tristana", 18));
        champions.add(new Champion("Warwick", "Warwick", 19));
        champions.add(new Champion("Nunu", "Nunu", 20));
        champions.add(new Champion("Miss Fortune", "MissFortune", 21));
        champions.add(new Champion("Ashe", "Ashe", 22));
        champions.add(new Champion("Tryndamere", "Tryndamere", 23));
        champions.add(new Champion("Jax", "Jax", 24));
        champions.add(new Champion("Morgana", "Morgana", 25));
        champions.add(new Champion("Zilean", "Zilean", 26));
        champions.add(new Champion("Singed", "Singed", 27));
        champions.add(new Champion("Evelynn", "Evelynn", 28));
        champions.add(new Champion("Twitch", "Twitch", 29));
        champions.add(new Champion("Karthus", "Karthus", 30));
        champions.add(new Champion("Cho'Gath", "Chogath", 31));
        champions.add(new Champion("Amumu", "Amumu", 32));
        champions.add(new Champion("Rammus", "Rammus", 33));
        champions.add(new Champion("Anivia", "Anivia", 34));
        champions.add(new Champion("Shaco", "Shaco", 35));
        champions.add(new Champion("Dr. Mundo", "DrMundo", 36));
        champions.add(new Champion("Sona", "Sona", 37));
        champions.add(new Champion("Kassadin", "Kassadin", 38));
        champions.add(new Champion("Irelia", "Irelia", 39));
        champions.add(new Champion("Janna", "Janna", 40));
        champions.add(new Champion("Gangplank", "Gangplank", 41));
        champions.add(new Champion("Corki", "Corki", 42));
        champions.add(new Champion("Karma", "Karma", 43));
        champions.add(new Champion("Taric", "Taric", 44));
        champions.add(new Champion("Veigar", "Veigar", 45));
        champions.add(new Champion("Trundle", "Trundle", 48));
        champions.add(new Champion("Swain", "Swain", 50));
        champions.add(new Champion("Caitlyn", "Caitlyn", 51));
        champions.add(new Champion("Blitzcrank", "Blitzcrank", 53));
        champions.add(new Champion("Malphite", "Malphite", 54));
        champions.add(new Champion("Katarina", "Katarina", 55));
        champions.add(new Champion("Nocturne", "Nocturne", 56));
        champions.add(new Champion("Maokai", "Maokai", 57));
        champions.add(new Champion("Renekton", "Renekton", 58));
        champions.add(new Champion("Jarvan IV", "JarvanIV", 59));
        champions.add(new Champion("Elise", "Elise", 60));
        champions.add(new Champion("Orianna", "Orianna", 61));
        champions.add(new Champion("Wukong", "MonkeyKing", 62));
        champions.add(new Champion("Brand", "Brand", 63));
        champions.add(new Champion("Lee Sin", "LeeSin", 64));
        champions.add(new Champion("Vayne", "Vayne", 67));
        champions.add(new Champion("Rumble", "Rumble", 68));
        champions.add(new Champion("Cassiopeia", "Cassiopeia", 69));
        champions.add(new Champion("Skarner", "Skarner", 72));
        champions.add(new Champion("Heimerdinger", "Heimerdinger", 74));
        champions.add(new Champion("Nasus", "Nasus", 75));
        champions.add(new Champion("Nidalee", "Nidalee", 76));
        champions.add(new Champion("Udyr", "Udyr", 77));
        champions.add(new Champion("Poppy", "Poppy", 78));
        champions.add(new Champion("Gragas", "Gragas", 79));
        champions.add(new Champion("Pantheon", "Pantheon", 80));
        champions.add(new Champion("Ezreal", "Ezreal", 81));
        champions.add(new Champion("Mordekaiser", "Mordekaiser", 82));
        champions.add(new Champion("Yorick", "Yorick", 83));
        champions.add(new Champion("Akali", "Akali", 84));
        champions.add(new Champion("Kennen", "Kennen", 85));
        champions.add(new Champion("Garen", "Garen", 86));
        champions.add(new Champion("Leona", "Leona", 89));
        champions.add(new Champion("Malzahar", "Malzahar", 90));
        champions.add(new Champion("Talon", "Talon", 91));
        champions.add(new Champion("Riven", "Riven", 92));
        champions.add(new Champion("Kog'Maw", "KogMaw", 96));
        champions.add(new Champion("Shen", "Shen", 98));
        champions.add(new Champion("Lux", "Lux", 99));
        champions.add(new Champion("Xerath", "Xerath", 101));
        champions.add(new Champion("Shyvana", "Shyvana", 102));
        champions.add(new Champion("Ahri", "Ahri", 103));
        champions.add(new Champion("Graves", "Graves", 104));
        champions.add(new Champion("Fizz", "Fizz", 105));
        champions.add(new Champion("Volibear", "Volibear", 106));
        champions.add(new Champion("Rengar", "Rengar", 107));
        champions.add(new Champion("Varus", "Varus", 110));
        champions.add(new Champion("Nautilus", "Nautilus", 111));
        champions.add(new Champion("Viktor", "Viktor", 112));
        champions.add(new Champion("Sejuani", "Sejuani", 113));
        champions.add(new Champion("Fiora", "Fiora", 114));
        champions.add(new Champion("Ziggs", "Ziggs", 115));
        champions.add(new Champion("Lulu", "Lulu", 117));
        champions.add(new Champion("Draven", "Draven", 119));
        champions.add(new Champion("Hecarim", "Hecarim", 120));
        champions.add(new Champion("Kha'Zix", "Khazix", 121));
        champions.add(new Champion("Darius", "Darius", 122));
        champions.add(new Champion("Jayce", "Jayce", 126));
        champions.add(new Champion("Lissandra", "Lissandra", 127));
        champions.add(new Champion("Diana", "Diana", 131));
        champions.add(new Champion("Quinn", "Quinn", 133));
        champions.add(new Champion("Syndra", "Syndra", 134));
        champions.add(new Champion("Aurelion Sol", "AurelionSol", 136));
        champions.add(new Champion("Kayn", "Kayn", 141));
        champions.add(new Champion("Zoe", "Zoe", 142));
        champions.add(new Champion("Zyra", "Zyra", 143));
        champions.add(new Champion("Kai'Sa", "Kaisa", 145));
        champions.add(new Champion("Gnar", "Gnar", 150));
        champions.add(new Champion("Zac", "Zac", 154));
        champions.add(new Champion("Yasuo", "Yasuo", 157));
        champions.add(new Champion("Vel'Koz", "Velkoz", 161));
        champions.add(new Champion("Taliyah", "Taliyah", 163));
        champions.add(new Champion("Camille", "Camille", 164));
        champions.add(new Champion("Braum", "Braum", 201));
        champions.add(new Champion("Jhin", "Jhin", 202));
        champions.add(new Champion("Kindred", "Kindred", 203));
        champions.add(new Champion("Jinx", "Jinx", 222));
        champions.add(new Champion("Tahm Kench", "TahmKench", 223));
        champions.add(new Champion("Lucian", "Lucian", 236));
        champions.add(new Champion("Zed", "Zed", 238));
        champions.add(new Champion("Kled", "Kled", 240));
        champions.add(new Champion("Ekko", "Ekko", 245));
        champions.add(new Champion("Vi", "Vi", 254));
        champions.add(new Champion("Aatrox", "Aatrox", 266));
        champions.add(new Champion("Nami", "Nami", 267));
        champions.add(new Champion("Azir", "Azir", 268));
        champions.add(new Champion("Thresh", "Thresh", 412));
        champions.add(new Champion("Illaoi", "Illaoi", 420));
        champions.add(new Champion("Rek'Sai", "RekSai", 421));
        champions.add(new Champion("Ivern", "Ivern", 427));
        champions.add(new Champion("Kalista", "Kalista", 429));
        champions.add(new Champion("Bard", "Bard", 432));
        champions.add(new Champion("Rakan", "Rakan", 497));
        champions.add(new Champion("Xayah", "Xayah", 498));
        champions.add(new Champion("Ornn", "Ornn", 516));

        
        
    }

    public String getChampionName(long id) {
        return getChampionById(id).getName();
    }
    
    public String getChampionKey(long id) {
    	return getChampionById(id).getKey();
    }

    public Champion getChampionById(long id) {
        return getChampionById(id, 0, champions.size());
    }

    private Champion getChampionById(long id, int min, int max) {
        int median = (min + max) / 2;

        if(min > max) return null;

        if(champions.get(median).getId() == id) {
            return champions.get(median);
        }else if(champions.get(median).getId() < id) {
            return getChampionById(id, median + 1, max);
        }else {
            return getChampionById(id, min, median - 1);
        }

    }


//    public String getVersion() {
//        return version;
//    }
//
//    public String getType() {
//        return type;
//    }
//
    public Map<String, Champion> getData() {
        return data;
    }


}
