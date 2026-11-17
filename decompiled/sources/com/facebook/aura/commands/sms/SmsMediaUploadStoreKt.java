package com.facebook.aura.commands.sms;

import X.AnonymousClass004;
import X.AnonymousClass005;
import android.content.Context;

/* loaded from: classes3.dex */
public abstract class SmsMediaUploadStoreKt {
    public static final String SMS_MEDIA_UPLOAD_PREFS = "sms_media_uploads";

    public static final void setUploadedMediaPath(Context context, String str, String str2) {
        AnonymousClass005.A10(context, str, str2);
        context.getSharedPreferences(SMS_MEDIA_UPLOAD_PREFS, 0).edit().putString(str, str2).apply();
    }

    public static final String uploadedMediaPath(Context context, String str) {
        return context.getSharedPreferences(SMS_MEDIA_UPLOAD_PREFS, AnonymousClass004.A1b(context, str) ? 1 : 0).getString(str, null);
    }
}
