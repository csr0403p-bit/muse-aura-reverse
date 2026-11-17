package com.facebook.aura.analytics.timespent.navigation;

import X.DL1;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import java.util.Map;

/* loaded from: classes5.dex */
public final class NavigationLoggerNoOp implements NavigationLogger {
    @Override // com.facebook.aura.analytics.timespent.navigation.NavigationLogger
    public void reportNavigationEventForComposable(String str, String str2, int i, Map<String, ? extends Object> map) {
    }

    @Override // com.facebook.aura.analytics.timespent.navigation.NavigationLogger
    public DL1 getCurrentNavEventData() {
        return new DL1();
    }

    @Override // com.facebook.aura.analytics.timespent.navigation.NavigationLogger
    public String getModuleInfo() {
        return "";
    }

    @Override // com.facebook.aura.analytics.timespent.navigation.NavigationLogger
    public DL1 getPrevNavEventData() {
        return new DL1();
    }

    @Override // com.facebook.aura.analytics.timespent.navigation.NavigationLogger
    public void reportNavigationEventForActivity(Activity activity) {
    }

    @Override // com.facebook.aura.analytics.timespent.navigation.NavigationLogger
    public void reportNavigationEventForFragment(Fragment fragment, String str) {
    }
}
