package com.facebook.aura.widgets;

import X.AnonymousClass005;
import X.C06H;
import X.C6PP;
import X.CFK;
import android.content.Context;
import androidx.glance.appwidget.GlanceAppWidget;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchWidgetKind;
import com.facebook.aura.analytics.hatch.HatchWidgetTelemetry;

/* loaded from: classes3.dex */
public abstract class AuraGlanceAppWidget extends GlanceAppWidget {

    @Deprecated
    public static final String TAG = "AuraGlanceAppWidget";
    public static final Companion Companion = new Companion();
    public static final int $stable = GlanceAppWidget.$stable;

    public abstract HatchWidgetKind getKind$fbandroid_express_aura_java_com_facebook_aura_widgets_widgets();

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuraGlanceAppWidget() {
        super(R.layout._name_removed__res_0x7f0d018d);
    }

    @Override // androidx.glance.appwidget.GlanceAppWidget
    public void onCompositionError(Context context, C6PP c6pp, int i, Throwable th) throws Throwable {
        AnonymousClass005.A0y(context, c6pp, th);
        CFK.A0C(TAG, "%s failed to render widget %d", th, getKind$fbandroid_express_aura_java_com_facebook_aura_widgets_widgets().getValue(), Integer.valueOf(i));
        HatchWidgetTelemetry.INSTANCE.logRenderFailed(getKind$fbandroid_express_aura_java_com_facebook_aura_widgets_widgets(), th);
        super.onCompositionError(context, c6pp, i, th);
    }
}
