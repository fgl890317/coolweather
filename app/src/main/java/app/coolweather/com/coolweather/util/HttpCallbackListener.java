package app.coolweather.com.coolweather.util;

/**
 * Created by Administrator on 2015/9/12.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
