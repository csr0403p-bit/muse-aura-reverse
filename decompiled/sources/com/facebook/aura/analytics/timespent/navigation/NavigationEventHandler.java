package com.facebook.aura.analytics.timespent.navigation;

import X.AnonymousClass003;
import X.BV4;
import X.BV5;
import X.C06H;
import X.C0881AGi;
import X.C3cG;
import X.C7384Etj;
import X.DL1;
import X.DL6;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class NavigationEventHandler {
    public static final Companion Companion = new Companion();
    public static final String TAG = "NavigationEventHandler";

    public final void handleNavigationEventForActivity(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        assertOnUiThread();
        if (activity instanceof FragmentActivity) {
            List<Fragment> listA03 = ((FragmentActivity) activity).getSupportFragmentManager().A0U.A03();
            C7384Etj.A0U(listA03);
            if (!listA03.isEmpty()) {
                A00(listA03);
            }
        }
        AuraNavigationLogger.instance.reportNavigationEventForActivity(activity);
    }

    public final void handleNavigationEventForFragmentWithVisibilityDetector(Fragment fragment) {
        List<Fragment> listA03;
        C7384Etj.A0Y(fragment, 0);
        assertOnUiThread();
        if (fragment.isAdded()) {
            try {
                listA03 = fragment.getChildFragmentManager().A0U.A03();
                C7384Etj.A0U(listA03);
            } catch (IllegalStateException unused) {
            }
        } else {
            listA03 = C0881AGi.A00;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<Fragment> it = listA03.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (!(arrayListA0h instanceof Collection) || !arrayListA0h.isEmpty()) {
            Iterator it2 = arrayListA0h.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw BV4.A0a("getFragmentVisibilityDetector");
            }
        }
        A00(listA03);
        AuraNavigationLogger.instance.reportNavigationEventForFragment(fragment, null);
    }

    public void onFragmentVisibilityChange(Fragment fragment, boolean z) {
        C7384Etj.A0Y(fragment, 0);
        if (z) {
            handleNavigationEventForFragmentWithVisibilityDetector(fragment);
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/util/List<+Landroidx/fragment/app/Fragment;>;)Z */
    public static final void A00(List list) {
        if (list.isEmpty()) {
            return;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private final void assertOnUiThread() {
        if (!Thread.currentThread().equals(BV5.A0s())) {
            throw BV4.A0c("NavigationEventHandler must be executed on main UI thread");
        }
    }

    public final void directlyHandleNavigationEventForFragment(Fragment fragment, String str) {
        AnonymousClass003.A0u(fragment, str);
        assertOnUiThread();
        AuraNavigationLogger.instance.reportNavigationEventForFragment(fragment, str);
    }

    public /* synthetic */ void onFragmentCreate(Fragment fragment) {
    }

    public final void setClickPointOnBackPressed() {
        assertOnUiThread();
        DL1 currentNavEventData = AuraNavigationLogger.instance.getCurrentNavEventData();
        Map mapA0u = currentNavEventData.A07;
        if (mapA0u == null) {
            mapA0u = BV4.A0u();
            currentNavEventData.A07 = mapA0u;
        }
        if (mapA0u.get(NavigationLoggerImpl.CLICK_POINT_KEY) == null) {
            Map<String, DL6> map = currentNavEventData.A07;
            DL6 dl6 = new DL6();
            dl6.A01 = "tap_back_button";
            dl6.A00 = System.currentTimeMillis();
            map.put(NavigationLoggerImpl.CLICK_POINT_KEY, dl6);
        }
    }
}
