package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserComputerSurface$visiblePage$1", f = "LocalBrowserComputerSurface.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserComputerSurface$visiblePage$1 extends AbstractC07127nr implements G0W<LocalBrowserPageState, LocalBrowserPageState, HtJ<? super LocalBrowserPageState>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public LocalBrowserComputerSurface$visiblePage$1(HtJ<? super LocalBrowserComputerSurface$visiblePage$1> htJ) {
        super(3, htJ);
    }

    @Override // X.G0W
    public final Object invoke(LocalBrowserPageState localBrowserPageState, LocalBrowserPageState localBrowserPageState2, HtJ<? super LocalBrowserPageState> htJ) {
        LocalBrowserComputerSurface$visiblePage$1 localBrowserComputerSurface$visiblePage$1 = new LocalBrowserComputerSurface$visiblePage$1(htJ);
        localBrowserComputerSurface$visiblePage$1.L$0 = localBrowserPageState;
        localBrowserComputerSurface$visiblePage$1.L$1 = localBrowserPageState2;
        return localBrowserComputerSurface$visiblePage$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        Object obj3 = this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return obj3 == null ? obj2 : obj3;
    }
}
