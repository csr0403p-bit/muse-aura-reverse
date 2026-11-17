package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C57m;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$awaitDetachedSessionTeardown$ended$1", f = "HatchRealTimeSessionController.kt", l = {441}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class HatchRealTimeSessionController$awaitDetachedSessionTeardown$ended$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ C57m $pending;
    public int label;
    public final /* synthetic */ HatchRealTimeSessionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRealTimeSessionController$awaitDetachedSessionTeardown$ended$1(HatchRealTimeSessionController hatchRealTimeSessionController, C57m c57m, HtJ<? super HatchRealTimeSessionController$awaitDetachedSessionTeardown$ended$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchRealTimeSessionController;
        this.$pending = c57m;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchRealTimeSessionController$awaitDetachedSessionTeardown$ended$1(this.this$0, this.$pending, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchRealTimeSessionController$awaitDetachedSessionTeardown$ended$1$confirmed$1 hatchRealTimeSessionController$awaitDetachedSessionTeardown$ended$1$confirmed$1 = new HatchRealTimeSessionController$awaitDetachedSessionTeardown$ended$1$confirmed$1(this.$pending, null);
            this.label = 1;
            obj = C3cI.A0S(hatchRealTimeSessionController$awaitDetachedSessionTeardown$ended$1$confirmed$1, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        boolean zA1P = C3cG.A1P(obj, true);
        if (!zA1P) {
            this.this$0.quarantineSession(this.$pending, "detached_start_barrier");
        }
        return Boolean.valueOf(zA1P);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return ((HatchRealTimeSessionController$awaitDetachedSessionTeardown$ended$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
