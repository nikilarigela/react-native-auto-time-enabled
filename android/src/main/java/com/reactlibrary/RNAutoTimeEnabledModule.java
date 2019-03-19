
package com.reactlibrary;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;

import android.provider.Settings;
import android.content.Context;
import android.os.Build;

public class RNAutoTimeEnabledModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNAutoTimeEnabledModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNAutoTimeEnabled";
    }

    @ReactMethod
    public void hasAutoTimeEnabled(Promise promise) {
        WritableMap map = Arguments.createMap();
        boolean hasAutoTimeEnabled;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            hasAutoTimeEnabled = Settings.Global.getInt(getReactApplicationContext().getContentResolver(), Settings.Global.AUTO_TIME, 0) == 1;
        } else {
            hasAutoTimeEnabled = Settings.System.getInt(getReactApplicationContext().getContentResolver(), Settings.System.AUTO_TIME, 0) == 1;
        }
        map.putBoolean("hasAutoTimeEnabled", hasAutoTimeEnabled);
        promise.resolve(map);
    }

    @ReactMethod
    public void hasAutoTimeZoneEnabled(Promise promise) {
      WritableMap map = Arguments.createMap();
      boolean hasAutoTimeZoneEnabled;
      if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
          hasAutoTimeZoneEnabled = Settings.Global.getInt(getReactApplicationContext().getContentResolver(), Settings.Global.AUTO_TIME_ZONE, 0) == 1;
      } else {
          hasAutoTimeZoneEnabled = android.provider.Settings.System.getInt(getReactApplicationContext().getContentResolver(), android.provider.Settings.System.AUTO_TIME_ZONE, 0) == 1;
      }
      map.putBoolean("hasAutoTimeZoneEnabled", hasAutoTimeZoneEnabled);
      promise.resolve(map);
    }
}
