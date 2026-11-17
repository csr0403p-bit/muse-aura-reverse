package com.facebook.aura.gateway.service;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C20Q;
import X.C20Y;
import X.C20Z;
import X.C3pU;
import X.EnumC10460Hji;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.backgroundwork.api.BackgroundWork;
import com.facebook.aura.backgroundwork.api.BackgroundWorkHeadline;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$3", f = "HatchForegroundService.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$3 extends AbstractC07127nr implements G0W<C20Z<? super BackgroundWorkHeadline>, AbstractC3358CGz, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public int label;

    public HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$3(HtJ htJ) {
        super(3, htJ);
    }

    @Override // X.G0W
    public final Object invoke(C20Z<? super BackgroundWorkHeadline> c20z, AbstractC3358CGz abstractC3358CGz, HtJ<? super Unit> htJ) {
        HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$3 hatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$3 = new HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$3(htJ);
        hatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$3.L$0 = c20z;
        hatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$3.L$1 = abstractC3358CGz;
        return hatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C20Q c20y;
        C20Z c20z = (C20Z) this.L$0;
        Object obj2 = this.L$1;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AbstractC3358CGz abstractC3358CGz = (AbstractC3358CGz) obj2;
            if (abstractC3358CGz == null || (c20y = BackgroundWork.INSTANCE.activeHeadline(abstractC3358CGz)) == null) {
                c20y = new C20Y(null);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (C3pU.A01(this, c20y, c20z) == enumC10460Hji) {
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
}
