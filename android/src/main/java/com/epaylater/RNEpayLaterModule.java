
package com.epaylater;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;

import org.json.JSONException;

import in.epaylater.android.nonbankingsdk.models.IDFCInitProfileModel;
import in.epaylater.android.nonbankingsdk.managers.EPLManager;

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

            IDFCInitProfileModel userProfileBean = IDFCInitProfileModel.Builder.newInstance()
                .setCustPhoneNo(params.getString("phone"))
                .setCustFirstName(params.getString("firstName"))
                .setCustLastName(params.getString("lastName"))
                .setCustEmail(params.getString("email"))
                .setFCMToken(params.getString("fcmToken"))
                .setLatitude(params.getDouble("lat"))
                .setLongitude(params.getDouble("log"))
                .setAccuracy(params.getDouble("accuracy"))
                .build();

            EPLManager.INSTANCE.startIntegration(reactContext.getCurrentActivity(),userProfileBean);
        } else {
            throw new NullPointerException("ReactContext cannot run with Activity null");
        }
    }
}