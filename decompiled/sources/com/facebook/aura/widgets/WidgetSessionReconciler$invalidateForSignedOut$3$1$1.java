package com.facebook.aura.widgets;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.widgets.WidgetSessionReconciler$invalidateForSignedOut$3$1$1", f = "WidgetSessionReconciler.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class WidgetSessionReconciler$invalidateForSignedOut$3$1$1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HomeScreenWidget $widget;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetSessionReconciler$invalidateForSignedOut$3$1$1(HomeScreenWidget homeScreenWidget, Context context, HtJ<? super WidgetSessionReconciler$invalidateForSignedOut$3$1$1> htJ) {
        super(1, htJ);
        this.$widget = homeScreenWidget;
        this.$context = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new WidgetSessionReconciler$invalidateForSignedOut$3$1$1(this.$widget, this.$context, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HomeScreenWidget homeScreenWidget = this.$widget;
            Context context = this.$context;
            this.label = 1;
            if (homeScreenWidget.showSignedOut(context, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super Unit> htJ) {
        return ((WidgetSessionReconciler$invalidateForSignedOut$3$1$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
