package com.facebook.aura.gateway.service;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C20Q;
import X.C20Z;
import X.C2CS;
import X.C3pU;
import X.EnumC10460Hji;
import X.G0W;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$2", f = "HatchForegroundService.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$2 extends AbstractC07127nr implements G0W<C20Z<? super Integer>, AbstractC3358CGz, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ HatchForegroundService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$2(HtJ htJ, HatchForegroundService hatchForegroundService) {
        super(3, htJ);
        this.this$0 = hatchForegroundService;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C20Z c20z = (C20Z) this.L$0;
        Object obj2 = this.L$1;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AbstractC3358CGz abstractC3358CGz = (AbstractC3358CGz) obj2;
            C20Q c20qResurfaceOnNewRequest = abstractC3358CGz != null ? this.this$0.resurfaceOnNewRequest(abstractC3358CGz) : C2CS.A00;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (C3pU.A01(this, c20qResurfaceOnNewRequest, c20z) == enumC10460Hji) {
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

    @Override // X.G0W
    public final Object invoke(C20Z<? super Integer> c20z, AbstractC3358CGz abstractC3358CGz, HtJ<? super Unit> htJ) {
        HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$2 hatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$2 = new HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$2(htJ, this.this$0);
        hatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$2.L$0 = c20z;
        hatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$2.L$1 = abstractC3358CGz;
        return hatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$2.invokeSuspend(Unit.INSTANCE);
    }
}
