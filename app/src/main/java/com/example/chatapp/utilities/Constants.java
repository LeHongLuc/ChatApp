package com.example.chatapp.utilities;

import java.util.HashMap;

public class Constants {
    public static final String KEY_COLLECTION_USERS = "users";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_NAME = "name";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_PREFERENCE_NAME = "chatAppPreference";
    public static final String KEY_IS_SIGNED_IN = "isSignedIn";
    public static final String KEY_USER_ID = "userId";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_FCM_TOKEN = "fcmToken";
    public static final String KEY_USER = "user";
    public static final String KEY_COLLECTION_CHAT = "chat";
    public static final String KEY_SENDER_ID = "senderId";
    public static final String KEY_RECEIVER_ID = "receivedId";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_TIME_STAMP = "timestamp";
    public static final String KEY_COLLECTION_CONVERSIONS = "conversions";
    public static final String KEY_SENDER_NAME = "senderName";
    public static final String KEY_SENDER_IMAGE = "senderImage";
    public static final String KEY_RECEIVER_IMAGE = "receivedImage";
    public static final String KEY_RECEIVER_NAME = "receivedName";
    public static final String KEY_LAST_MESSAGE = "lastMessage";
    public static final String KEY_AVAILABILITY = "availability";
    public static final String REMOTE_MSG_AUTHORIZATION = "authorization";
    public static final String REMOTE_MSG_CONTENT_TYPE = "contentType";
    public static final String REMOTE_MSG_DATA = "data";
    public static final String REMOTE_MSG_REGISTRATION_IDS = "registration_ids";

    public static HashMap<String, String> remoteMsgHeader = null;

    public static HashMap<String, String> getRemoteMsgHeader() {
        if (remoteMsgHeader == null) {
            remoteMsgHeader = new HashMap<>();
            remoteMsgHeader.put(REMOTE_MSG_AUTHORIZATION, "key=AAAAyIbg3d4:APA91bEJD7qdW3gY7Y9LBwEC88E0u3irNGT_cBR646NuZC2Xv3p9T7qNvyH7ho9mTspJIx9aLXfbVOQ2sa4697IJGkxqVRUJRUomvmsFdVhZErCfVkuZkGe2lfXkF4yV7S_gCxE7lRvn");
            remoteMsgHeader.put(REMOTE_MSG_CONTENT_TYPE, "application/json");
        }
        return remoteMsgHeader;
    }

}
