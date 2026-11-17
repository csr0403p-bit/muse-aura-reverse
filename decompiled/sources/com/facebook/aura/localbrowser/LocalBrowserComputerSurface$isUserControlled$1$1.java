package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserComputerSurface$isUserControlled$1$1", f = "LocalBrowserComputerSurface.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserComputerSurface$isUserControlled$1$1 extends AbstractC07127nr implements G0W<LocalBrowserFacts, Boolean, HtJ<? super Boolean>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public int label;

    public LocalBrowserComputerSurface$isUserControlled$1$1(HtJ<? super LocalBrowserComputerSurface$isUserControlled$1$1> htJ) {
        super(3, htJ);
    }

    public final Object invoke(LocalBrowserFacts localBrowserFacts, boolean z, HtJ<? super Boolean> htJ) {
        LocalBrowserComputerSurface$isUserControlled$1$1 localBrowserComputerSurface$isUserControlled$1$1 = new LocalBrowserComputerSurface$isUserControlled$1$1(htJ);
        localBrowserComputerSurface$isUserControlled$1$1.L$0 = localBrowserFacts;
        localBrowserComputerSurface$isUserControlled$1$1.Z$0 = z;
        return localBrowserComputerSurface$isUserControlled$1$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r1 = r3.L$0
            com.facebook.aura.localbrowser.LocalBrowserFacts r1 = (com.facebook.aura.localbrowser.LocalBrowserFacts) r1
            boolean r2 = r3.Z$0
            int r0 = r3.label
            if (r0 != 0) goto L1c
            X.Hwg.A00(r4)
            com.facebook.aura.localbrowser.LocalBrowserControl r1 = r1.control
            com.facebook.aura.localbrowser.LocalBrowserControl r0 = com.facebook.aura.localbrowser.LocalBrowserControl.USER
            if (r1 != r0) goto L16
            r0 = 1
            if (r2 != 0) goto L17
        L16:
            r0 = 0
        L17:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserComputerSurface$isUserControlled$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Object invoke(LocalBrowserFacts localBrowserFacts, Boolean bool, HtJ<? super Boolean> htJ) {
        return invoke(localBrowserFacts, AnonymousClass001.A1X(bool), htJ);
    }
}
