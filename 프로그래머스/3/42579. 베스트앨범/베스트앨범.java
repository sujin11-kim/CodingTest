import java.util.*;

class Solution {
    static class Song {
        int idx, plays;
        
        Song(int idx, int plays) {
            this.idx=idx;
            this.plays=plays;
        }
    }
    
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genreMap = new HashMap<>();
        Map<String, List<Song>> genreSongMap = new HashMap<>();
        
        for(int i=0; i<genres.length; i++) {
            genreMap.put(genres[i], genreMap.getOrDefault(genres[i], 0)+plays[i]);
            genreSongMap.computeIfAbsent(genres[i], k -> new ArrayList<>()).add(new Song(i, plays[i]));
        }
        
        List<String> sortedGenres = new ArrayList<>(genreMap.keySet());
        sortedGenres.sort((g1, g2) -> genreMap.get(g2) - genreMap.get(g1));
        
        List<Integer> result = new ArrayList<>();
        for(String genre: sortedGenres) {
            List<Song> songList = genreSongMap.get(genre);
            
            songList.sort((a, b) -> {
               if(b.plays==a.plays) return a.idx - b.idx;
                return b.plays - a.plays;
            });
            
            for(int i=0; i<Math.min(2, songList.size()); i++) {
                result.add(songList.get(i).idx);
            }
        }
        
        return result.stream().mapToInt(i->i).toArray();
    }
}