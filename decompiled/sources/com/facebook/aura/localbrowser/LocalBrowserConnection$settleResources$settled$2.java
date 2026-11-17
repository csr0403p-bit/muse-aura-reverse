package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.localbrowser.connector.DevToolsBridge;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserConnection$settleResources$settled$2", f = "LocalBrowserConnection.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserConnection$settleResources$settled$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ LocalBrowserConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserConnection$settleResources$settled$2(LocalBrowserConnection localBrowserConnection, HtJ<? super LocalBrowserConnection$settleResources$settled$2> htJ) {
        super(2, htJ);
        this.this$0 = localBrowserConnection;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserConnection$settleResources$settled$2(this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Exception {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        LocalBrowserConnection localBrowserConnection = this.this$0;
        localBrowserConnection.bridgeGeneration++;
        DevToolsBridge devToolsBridge = localBrowserConnection.initialBridge;
        if (devToolsBridge != null) {
            devToolsBridge.close();
        }
        LocalBrowserConnection localBrowserConnection2 = this.this$0;
        localBrowserConnection2.initialBridge = null;
        DevToolsBridge devToolsBridge2 = localBrowserConnection2.bridge;
        if (devToolsBridge2 != null) {
            devToolsBridge2.close();
        }
        LocalBrowserConnection localBrowserConnection3 = this.this$0;
        localBrowserConnection3.bridge = null;
        localBrowserConnection3.lease.close();
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new LocalBrowserConnection$settleResources$settled$2(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
