package X;

import android.os.Build;
import android.util.Log;
import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* renamed from: X.6xD, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6xD {
    public static C6x7 A00(WebSettings webSettings) {
        try {
            return new C6x7((WebSettingsBoundaryInterface) C7510EyX.A00(WebSettingsBoundaryInterface.class, C6xF.A00.A00.convertSettings(webSettings)));
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(C60Q.A0f(webSettings))) {
                throw e;
            }
            Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e);
            return new C05716xA(null);
        }
    }
}
