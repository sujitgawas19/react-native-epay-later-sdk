
package com.epaylater;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;

public class RNEpayLaterModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNEpayLaterModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNEpayLater";
  }

   @ReactMethod
    public void init(ReadableMap params) {
        if (reactContext.getCurrentActivity() != null) {
            
        } else {
            throw new NullPointerException("ReactContext cannot run with Activity null");
        }
    }
}