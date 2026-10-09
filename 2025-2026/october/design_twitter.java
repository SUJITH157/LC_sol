import java.util.*;

class Twitter {

    class Tweet {
        int tweetId;
        int time;
        Tweet next;

        Tweet(int tweetId, int time, Tweet next) {
            this.tweetId = tweetId;
            this.time = time;
            this.next = next;
        }
    }

    HashMap<Integer, Tweet> tweets;
    HashMap<Integer, HashSet<Integer>> following;
    int time;

    public Twitter() {
        tweets = new HashMap<>();
        following = new HashMap<>();
        time = 0;
    }

    public void postTweet(int userId, int tweetId) {
        Tweet newTweet = new Tweet(tweetId, time++, tweets.get(userId));
        tweets.put(userId, newTweet);
    }

    public List<Integer> getNewsFeed(int userId) {

        PriorityQueue<Tweet> maxHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(b.time, a.time)
        );

        if (tweets.containsKey(userId)) {
            maxHeap.add(tweets.get(userId));
        }

        if (following.containsKey(userId)) {
            for (int followeeId : following.get(userId)) {
                if (followeeId != userId && tweets.containsKey(followeeId)) {
                    maxHeap.add(tweets.get(followeeId));
                }
            }
        }

        List<Integer> ans = new ArrayList<>();

        while (!maxHeap.isEmpty() && ans.size() < 10) {

            Tweet current = maxHeap.poll();

            ans.add(current.tweetId);

            if (current.next != null) {
                maxHeap.add(current.next);
            }
        }

        return ans;
    }

    public void follow(int followerId, int followeeId) {
        following.putIfAbsent(followerId, new HashSet<>());
        following.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (following.containsKey(followerId)) {
            following.get(followerId).remove(followeeId);
        }
    }
}