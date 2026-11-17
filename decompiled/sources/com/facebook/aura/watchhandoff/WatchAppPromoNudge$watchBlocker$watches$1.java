package com.facebook.aura.watchhandoff;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.watchhandoff.WatchAppPromoNudge$watchBlocker$watches$1", f = "WatchAppPromoNudge.kt", l = {152}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class WatchAppPromoNudge$watchBlocker$watches$1 extends AbstractC07127nr implements G0U<HtJ<? super ConnectedWatches>, Object> {
    public final /* synthetic */ Context $context;
    public int label;
    public final /* synthetic */ WatchAppPromoNudge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchAppPromoNudge$watchBlocker$watches$1(WatchAppPromoNudge watchAppPromoNudge, Context context, HtJ<? super WatchAppPromoNudge$watchBlocker$watches$1> htJ) {
        super(1, htJ);
        this.this$0 = watchAppPromoNudge;
        this.$context = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new WatchAppPromoNudge$watchBlocker$watches$1(this.this$0, this.$context, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            WatchAppPromoNudge watchAppPromoNudge = this.this$0;
            Context context = this.$context;
            this.label = 1;
            obj = watchAppPromoNudge.connectedWatches(context, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super ConnectedWatches> htJ) {
        return ((WatchAppPromoNudge$watchBlocker$watches$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
