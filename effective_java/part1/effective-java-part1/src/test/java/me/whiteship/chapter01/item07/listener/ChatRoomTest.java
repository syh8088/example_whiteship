package me.whiteship.chapter01.item07.listener;

import me.whiteship.chapter01.item07.cache.Post;
import org.junit.jupiter.api.Test;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChatRoomTest {

    @Test
    void charRoom() throws InterruptedException {
        ChatRoom chatRoom = new ChatRoom();
        User user1 = new User();
        User user2 = new User();

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);

        chatRoom.sendMessage("hello");

        user1 = null;

        HashMap<String, Post> hashMap = new HashMap<>();
        Post post1 = new Post();
        Post post2 = new Post();
        hashMap.put("test", post1);
        hashMap.put("test2", post2);

        String test = "test";

        post1 = null;

        System.gc();



        Thread.sleep(5000L);
        System.out.println("hashMap = " + hashMap);
        System.out.println("test = " + test);

        List<WeakReference<User>> users = chatRoom.getUsers();
//        assertTrue(users.size() == 1);
    }

}