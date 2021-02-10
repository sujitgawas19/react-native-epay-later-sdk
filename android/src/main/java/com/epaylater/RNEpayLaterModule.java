
package com.epaylater;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;

import org.json.JSONException;

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
            try {
                val userProfileBean = IDFCInitProfileModel.Builder.newInstance()
                    .setCustPhoneNo("7666763027")
                    .setCustFirstName("Sujit")
                    .setCustLastName("Gawas")
                    .setCustEmail("sujit@ajency.in")
                    .setFCMToken("adkdkdjaskdjhaksdhhsadjkasdad")
                    .setLatitude(4533.44)
                    .setLongitude(1234.4)
                    .setAccuracy(100.0)
                    .build()

                EPLManager.startIntegration(this,userProfileBean)
            }
            catch(error) {
                error.printStackTrace();
            }

        } else {
            throw new NullPointerException("ReactContext cannot run with Activity null");
        }
    }
}