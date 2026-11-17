package com.facebook.aura.analytics.timespent.navigation;

import X.C3cH;
import X.C8j3;
import X.DL1;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import java.util.Map;

/* loaded from: classes5.dex */
public interface NavigationLogger {

    /* renamed from: com.facebook.aura.analytics.timespent.navigation.NavigationLogger$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static /* synthetic */ void reportNavigationEventForComposable$default(NavigationLogger navigationLogger, String str, String str2, int i, Map map, int i2, Object obj) {
            if (obj != null) {
                throw C8j3.A18("Super calls with default arguments not supported in this target, function: reportNavigationEventForComposable");
            }
            navigationLogger.reportNavigationEventForComposable(str, str2, i, C3cH.A0o(map, i2 & 8));
        }
    }

    DL1 getCurrentNavEventData();

    String getModuleInfo();

    DL1 getPrevNavEventData();

    void reportNavigationEventForActivity(Activity activity);

    void reportNavigationEventForComposable(String str, String str2, int i, Map<String, ? extends Object> map);

    void reportNavigationEventForFragment(Fragment fragment, String str);

    public abstract class DefaultImpls {
    }
}
