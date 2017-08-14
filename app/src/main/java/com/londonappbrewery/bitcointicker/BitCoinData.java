package com.londonappbrewery.bitcointicker;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class BitCoinData {

    private String mAskingPrice;

    public static BitCoinData fromJson(JSONObject jsonObject) {
        try {
            BitCoinData bitCoinData = new BitCoinData();
            bitCoinData.mAskingPrice = jsonObject.getString("ask");
            Log.d("Clima", bitCoinData.mAskingPrice);
            return bitCoinData;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getAskingPrice() {
        return mAskingPrice;
    }
}
