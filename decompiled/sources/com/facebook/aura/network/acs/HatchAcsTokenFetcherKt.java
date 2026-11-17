package com.facebook.aura.network.acs;

import android.util.Base64;

/* loaded from: classes4.dex */
public abstract class HatchAcsTokenFetcherKt {
    public static final boolean isBase64Url(String str) {
        try {
            Base64.decode(str, 8);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}
