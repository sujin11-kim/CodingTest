import java.io.*;
import java.util.*;
 
public class Main {
    private static int K;
    private static boolean[] visited = new boolean[100001];
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
 
        if(N == K) System.out.println(0);
        else System.out.println(bfs(N));
    }
 
    private static int bfs(int x) {
        Queue<Position> que = new LinkedList<>();
 
        que.offer(new Position(x,0));
        visited[x] = true;
 
 
        while(!que.isEmpty()) {
            Position pos = que.poll();
            if(pos.x == K) return pos.sec;
 
            if(pos.x * 2 <= 100000 && !visited[pos.x*2]) {
                visited[pos.x*2] = true;
                que.offer(new Position(pos.x * 2, pos.sec + 1));
            }
            if(pos.x + 1 <= 100000 && !visited[pos.x+1]) {
                visited[pos.x+1] = true;
                que.offer(new Position(pos.x + 1, pos.sec + 1));
            }
            if(pos.x - 1 >= 0 && !visited[pos.x-1]) {
                visited[pos.x-1] = true;
                que.offer(new Position(pos.x - 1, pos.sec + 1));
            }
        }
        return 0;
    }
 
    static class Position {
        int x;
        int sec;
 
        public Position(int x, int sec) {
            this.x = x;
            this.sec = sec;
        }
    }
 
}