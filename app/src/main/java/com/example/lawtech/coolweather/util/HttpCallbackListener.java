package com.example.lawtech.coolweather.util;

/**
 * Created by lawtech on 16/8/25.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
