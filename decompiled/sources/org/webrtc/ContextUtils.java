package org.webrtc;

import X.C60O;
import android.content.Context;

/* loaded from: classes5.dex */
public class ContextUtils {
    public static final String TAG = "ContextUtils";
    public static Context applicationContext;

    @Deprecated
    public static Context getApplicationContext() {
        return applicationContext;
    }

    public static void initialize(Context context) {
        if (context == null) {
            throw C60O.A0i("Application context cannot be null for ContextUtils.initialize.");
        }
        applicationContext = context;
    }
}
