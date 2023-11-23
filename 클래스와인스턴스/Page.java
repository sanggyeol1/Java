package 클래스와인스턴스;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Page {
    int pageId;
    int lastUsed;

    Page(int pageId, int lastUsed) {
        this.pageId = pageId;
        this.lastUsed = lastUsed;
    }
}

class LRUCache {
    private final int CACHE_SIZE = 4; // Total cache size in MB
    private final int PAGE_SIZE = 4 * 1024; // Page size in KB

    private int currentTime;
    private int totalMisses;
    private LinkedList<Page> cacheList;
    private Map<Integer, Page> pageMap;

    LRUCache() {
        currentTime = 0;
        totalMisses = 0;
        cacheList = new LinkedList<>();
        pageMap = new HashMap<>();
    }

    private void addPageToCache(int pageId) {
        if (cacheList.size() >= CACHE_SIZE * 1024 / PAGE_SIZE) {
            evictPageLRU();
        }

        Page newPage = new Page(pageId, currentTime++);
        cacheList.addFirst(newPage);
        pageMap.put(pageId, newPage);
    }

    private void evictPageLRU() {
        Page lastPage = cacheList.removeLast();
        pageMap.remove(lastPage.pageId);
    }

    public void accessPage(int pageId) {
        if (pageMap.containsKey(pageId)) {
            // Page hit, move to the front and update last used time
            Page existingPage = pageMap.get(pageId);
            existingPage.lastUsed = currentTime++;
            cacheList.remove(existingPage);
            cacheList.addFirst(existingPage);
        } else {
            // Page miss, add to the cache
            addPageToCache(pageId);
            totalMisses++;
        }
    }

    public float calculateHitRatio() {
        return (float) (currentTime - totalMisses) / currentTime;
    }
}

public class LRUCacheSimulation {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache();

        try (BufferedReader reader = new BufferedReader(new FileReader("w3_mixed.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int pageId = Integer.parseInt(line.trim());
                cache.accessPage(pageId);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("4MB Hit ratio: " + cache.calculateHitRatio());
    }
}
