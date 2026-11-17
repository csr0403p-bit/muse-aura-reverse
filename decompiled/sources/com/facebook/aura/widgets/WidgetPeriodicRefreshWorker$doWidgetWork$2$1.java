package com.facebook.aura.widgets;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.widgets.WidgetPeriodicRefreshWorker$doWidgetWork$2$1", f = "WidgetPeriodicRefreshWorker.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class WidgetPeriodicRefreshWorker$doWidgetWork$2$1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
    public final /* synthetic */ HomeScreenWidget $widget;
    public int label;
    public final /* synthetic */ WidgetPeriodicRefreshWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetPeriodicRefreshWorker$doWidgetWork$2$1(HomeScreenWidget homeScreenWidget, WidgetPeriodicRefreshWorker widgetPeriodicRefreshWorker, HtJ<? super WidgetPeriodicRefreshWorker$doWidgetWork$2$1> htJ) {
        super(1, htJ);
        this.$widget = homeScreenWidget;
        this.this$0 = widgetPeriodicRefreshWorker;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new WidgetPeriodicRefreshWorker$doWidgetWork$2$1(this.$widget, this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HomeScreenWidget homeScreenWidget = this.$widget;
            Context context = this.this$0.mAppContext;
            C7384Etj.A0U(context);
            long j = WidgetPeriodicRefreshWorkerKt.STALE_AFTER_MS;
            this.label = 1;
            if (homeScreenWidget.refreshIfStale(context, j, this) == enumC10460Hji) {
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
        return ((WidgetPeriodicRefreshWorker$doWidgetWork$2$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
