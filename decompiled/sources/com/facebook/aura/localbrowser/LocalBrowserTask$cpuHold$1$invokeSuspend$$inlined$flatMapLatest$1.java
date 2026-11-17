package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Q;
import X.C20Y;
import X.C20Z;
import X.C3pU;
import X.EnumC10460Hji;
import X.G0W;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTask$cpuHold$1$invokeSuspend$$inlined$flatMapLatest$1", f = "LocalBrowserEndpoint.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserTask$cpuHold$1$invokeSuspend$$inlined$flatMapLatest$1 extends AbstractC07127nr implements G0W<C20Z<? super Boolean>, LocalBrowserSession, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public int label;

    public LocalBrowserTask$cpuHold$1$invokeSuspend$$inlined$flatMapLatest$1(HtJ htJ) {
        super(3, htJ);
    }

    @Override // X.G0W
    public final Object invoke(C20Z<? super Boolean> c20z, LocalBrowserSession localBrowserSession, HtJ<? super Unit> htJ) {
        LocalBrowserTask$cpuHold$1$invokeSuspend$$inlined$flatMapLatest$1 localBrowserTask$cpuHold$1$invokeSuspend$$inlined$flatMapLatest$1 = new LocalBrowserTask$cpuHold$1$invokeSuspend$$inlined$flatMapLatest$1(htJ);
        localBrowserTask$cpuHold$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = c20z;
        localBrowserTask$cpuHold$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = localBrowserSession;
        return localBrowserTask$cpuHold$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
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
            LocalBrowserSession localBrowserSession = (LocalBrowserSession) obj2;
            if (localBrowserSession == null || (c20y = localBrowserSession.parked) == null) {
                c20y = new C20Y(AnonymousClass001.A0h());
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
