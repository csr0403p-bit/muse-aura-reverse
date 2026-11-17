package com.facebook.aura.activation.model;

import android.util.Patterns;

/* loaded from: classes2.dex */
public abstract class AuraNdaViewModelKt {
    public static final long FETCH_RETRY_DELAY_MS = 1500;
    public static final String FIELD_EMAIL = "email";
    public static final String FIELD_NAME = "name";
    public static final int MAX_FETCH_ATTEMPTS = 2;
    public static final String TAG = "AuraNdaViewModel";

    public static final boolean isValidEmail(String str) {
        return Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }
}
