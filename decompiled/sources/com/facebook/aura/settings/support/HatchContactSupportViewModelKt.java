package com.facebook.aura.settings.support;

import android.util.Patterns;

/* loaded from: classes.dex */
public abstract class HatchContactSupportViewModelKt {
    public static final int MAX_DESCRIPTION_LENGTH = 1800;
    public static final int MAX_EMAIL_LENGTH = 320;
    public static final int MAX_NAME_LENGTH = 200;

    public static final boolean isValidEmail(String str) {
        return Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }
}
