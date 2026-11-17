package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.G0W;
import X.HtJ;
import com.facebook.aura.model.BrowserTaskDisplayStatus;
import com.facebook.aura.model.BrowserTaskPresentation;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserComputerSurface$taskDisplayState$1", f = "LocalBrowserComputerSurface.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserComputerSurface$taskDisplayState$1 extends AbstractC07127nr implements G0W<LocalBrowserFacts, BrowserTaskPresentation, HtJ<? super BrowserTaskDisplayStatus>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public LocalBrowserComputerSurface$taskDisplayState$1(HtJ<? super LocalBrowserComputerSurface$taskDisplayState$1> htJ) {
        super(3, htJ);
    }

    @Override // X.G0W
    public final Object invoke(LocalBrowserFacts localBrowserFacts, BrowserTaskPresentation browserTaskPresentation, HtJ<? super BrowserTaskDisplayStatus> htJ) {
        LocalBrowserComputerSurface$taskDisplayState$1 localBrowserComputerSurface$taskDisplayState$1 = new LocalBrowserComputerSurface$taskDisplayState$1(htJ);
        localBrowserComputerSurface$taskDisplayState$1.L$0 = localBrowserFacts;
        localBrowserComputerSurface$taskDisplayState$1.L$1 = browserTaskPresentation;
        return localBrowserComputerSurface$taskDisplayState$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r2.isTombstone() == true) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r3 = r4.L$0
            com.facebook.aura.localbrowser.LocalBrowserFacts r3 = (com.facebook.aura.localbrowser.LocalBrowserFacts) r3
            java.lang.Object r2 = r4.L$1
            com.facebook.aura.model.BrowserTaskPresentation r2 = (com.facebook.aura.model.BrowserTaskPresentation) r2
            int r0 = r4.label
            if (r0 != 0) goto L42
            X.Hwg.A00(r5)
            java.lang.String r0 = r3.userActionRequired
            if (r0 == 0) goto L31
            com.facebook.aura.localbrowser.LocalBrowserControl r1 = r3.control
            com.facebook.aura.localbrowser.LocalBrowserControl r0 = com.facebook.aura.localbrowser.LocalBrowserControl.STOPPED
            if (r1 == r0) goto L31
            if (r2 == 0) goto L3f
            boolean r1 = r2.isTombstone()
            r0 = 1
            if (r1 != r0) goto L3f
        L22:
            com.facebook.aura.model.BrowserTaskDisplayStatus r0 = r2.getDisplayState()
            if (r0 != 0) goto L30
        L28:
            com.facebook.aura.localbrowser.LocalBrowserControl r1 = r3.control
            com.facebook.aura.localbrowser.LocalBrowserControl r0 = com.facebook.aura.localbrowser.LocalBrowserControl.STOPPED
            if (r1 != r0) goto L34
            com.facebook.aura.model.BrowserTaskDisplayStatus r0 = com.facebook.aura.model.BrowserTaskDisplayStatus.STOPPED
        L30:
            return r0
        L31:
            if (r2 == 0) goto L28
            goto L22
        L34:
            com.facebook.aura.localbrowser.LocalBrowserControl r0 = com.facebook.aura.localbrowser.LocalBrowserControl.AGENT
            if (r1 != r0) goto L3f
            boolean r0 = r3.available
            if (r0 == 0) goto L3f
            com.facebook.aura.model.BrowserTaskDisplayStatus r0 = com.facebook.aura.model.BrowserTaskDisplayStatus.WORKING
            return r0
        L3f:
            com.facebook.aura.model.BrowserTaskDisplayStatus r0 = com.facebook.aura.model.BrowserTaskDisplayStatus.PAUSED
            return r0
        L42:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserComputerSurface$taskDisplayState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
