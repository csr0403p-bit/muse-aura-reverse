package com.facebook.aura.widgets;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0U;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.widgets.WidgetSessionReconciler$invalidateForSignedOut$4$1", f = "WidgetSessionReconciler.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class WidgetSessionReconciler$invalidateForSignedOut$4$1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HomeScreenWidget $widget;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetSessionReconciler$invalidateForSignedOut$4$1(HomeScreenWidget homeScreenWidget, Context context, HtJ<? super WidgetSessionReconciler$invalidateForSignedOut$4$1> htJ) {
        super(1, htJ);
        this.$widget = homeScreenWidget;
        this.$context = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new WidgetSessionReconciler$invalidateForSignedOut$4$1(this.$widget, this.$context, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.$widget.deleteFiles(this.$context);
        return Unit.INSTANCE;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super Unit> htJ) {
        return ((WidgetSessionReconciler$invalidateForSignedOut$4$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
