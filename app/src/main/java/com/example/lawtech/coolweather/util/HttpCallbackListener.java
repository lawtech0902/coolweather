package com.example.lawtech.coolweather.util;

import java.io.InputStream;

/**
 * Created by lawtech on 16/8/25.
 */
public interface HttpCallbackListener {
    void onFinish(InputStream in);

    void onError(Exception e);
}
