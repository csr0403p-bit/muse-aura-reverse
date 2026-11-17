package com.facebook.aura.widgets;

import X.BFM;
import X.HtJ;
import android.content.Context;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;
import com.facebook.aura.analytics.hatch.HatchWidgetKind;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public interface HomeScreenWidget {

    /* renamed from: com.facebook.aura.widgets.HomeScreenWidget$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static boolean $default$isAvailable(HomeScreenWidget homeScreenWidget) {
            return true;
        }

        public static /* synthetic */ boolean access$isAvailable$jd(HomeScreenWidget homeScreenWidget) {
            return true;
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static boolean isAvailable(HomeScreenWidget homeScreenWidget) {
            return true;
        }

        @Deprecated
        public static List<Class<?>> getComponents(HomeScreenWidget homeScreenWidget) {
            return Collections.singletonList(homeScreenWidget.getReceiver());
        }
    }

    void Preview(BFM bfm, int i);

    void cancelWork(Context context);

    Object clear(Context context, HtJ<? super Unit> htJ);

    void deleteFiles(Context context);

    List<Class<?>> getComponents();

    String getKey();

    HatchWidgetKind getKind();

    /* renamed from: getPreviewSize-MYxV2XQ */
    long mo3155getPreviewSizeMYxV2XQ();

    Class<? extends GlanceAppWidgetReceiver> getReceiver();

    boolean isAvailable();

    Object reconcile(Context context, String str, boolean z, HtJ<? super Unit> htJ);

    Object refreshIfStale(Context context, long j, HtJ<? super Unit> htJ);

    Object showSignedOut(Context context, HtJ<? super Unit> htJ);
}
