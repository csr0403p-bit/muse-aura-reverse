package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.G0W;
import X.HtJ;
import com.facebook.aura.model.BrowserTaskPresentation;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserComputerSurface$canStopTask$1", f = "LocalBrowserComputerSurface.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserComputerSurface$canStopTask$1 extends AbstractC07127nr implements G0W<LocalBrowserFacts, BrowserTaskPresentation, HtJ<? super Boolean>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public LocalBrowserComputerSurface$canStopTask$1(HtJ<? super LocalBrowserComputerSurface$canStopTask$1> htJ) {
        super(3, htJ);
    }

    @Override // X.G0W
    public final Object invoke(LocalBrowserFacts localBrowserFacts, BrowserTaskPresentation browserTaskPresentation, HtJ<? super Boolean> htJ) {
        LocalBrowserComputerSurface$canStopTask$1 localBrowserComputerSurface$canStopTask$1 = new LocalBrowserComputerSurface$canStopTask$1(htJ);
        localBrowserComputerSurface$canStopTask$1.L$0 = localBrowserFacts;
        localBrowserComputerSurface$canStopTask$1.L$1 = browserTaskPresentation;
        return localBrowserComputerSurface$canStopTask$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
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
            java.lang.Object r2 = r3.L$1
            com.facebook.aura.model.BrowserTaskPresentation r2 = (com.facebook.aura.model.BrowserTaskPresentation) r2
            int r0 = r3.label
            if (r0 != 0) goto L24
            X.Hwg.A00(r4)
            com.facebook.aura.localbrowser.LocalBrowserControl r1 = r1.control
            com.facebook.aura.localbrowser.LocalBrowserControl r0 = com.facebook.aura.localbrowser.LocalBrowserControl.STOPPED
            if (r1 == r0) goto L1e
            r1 = 1
            if (r2 == 0) goto L1f
            boolean r0 = r2.isTombstone()
            if (r0 != r1) goto L1f
        L1e:
            r1 = 0
        L1f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserComputerSurface$canStopTask$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
