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

@DebugMetadata(c = "com.facebook.aura.widgets.SpaceHomeScreenWidget$refreshIfStale$2$1", f = "SpaceHomeScreenWidget.kt", l = {80}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class SpaceHomeScreenWidget$refreshIfStale$2$1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
    public final /* synthetic */ int $appWidgetId;
    public final /* synthetic */ Context $context;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceHomeScreenWidget$refreshIfStale$2$1(Context context, int i, HtJ<? super SpaceHomeScreenWidget$refreshIfStale$2$1> htJ) {
        super(1, htJ);
        this.$context = context;
        this.$appWidgetId = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new SpaceHomeScreenWidget$refreshIfStale$2$1(this.$context, this.$appWidgetId, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            SpaceWidgetRefresher spaceWidgetRefresher = SpaceWidgetRefresher.INSTANCE;
            Context context = this.$context;
            int i2 = this.$appWidgetId;
            this.label = 1;
            if (spaceWidgetRefresher.refresh(context, i2, false, false, this) == enumC10460Hji) {
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
        return ((SpaceHomeScreenWidget$refreshIfStale$2$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
