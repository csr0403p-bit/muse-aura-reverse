package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.localbrowser.core.BrowserEngineResult;
import com.facebook.aura.localbrowser.core.BrowserOperation;
import com.facebook.aura.nodes.api.HatchNodeInvocation;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserNodeHandler$execute$result$1", f = "LocalBrowserNodeHandler.kt", l = {154}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserNodeHandler$execute$result$1 extends AbstractC07127nr implements G0U<HtJ<? super BrowserEngineResult>, Object> {
    public final /* synthetic */ LocalBrowserConnection $connection;
    public final /* synthetic */ long $deadline;
    public final /* synthetic */ HatchNodeInvocation $invocation;
    public final /* synthetic */ BrowserOperation $operation;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserNodeHandler$execute$result$1(LocalBrowserConnection localBrowserConnection, HatchNodeInvocation hatchNodeInvocation, BrowserOperation browserOperation, long j, HtJ<? super LocalBrowserNodeHandler$execute$result$1> htJ) {
        super(1, htJ);
        this.$connection = localBrowserConnection;
        this.$invocation = hatchNodeInvocation;
        this.$operation = browserOperation;
        this.$deadline = j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new LocalBrowserNodeHandler$execute$result$1(this.$connection, this.$invocation, this.$operation, this.$deadline, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            LocalBrowserConnection localBrowserConnection = this.$connection;
            String str = this.$invocation.id;
            BrowserOperation browserOperation = this.$operation;
            long j = this.$deadline;
            this.label = 1;
            obj = localBrowserConnection.execute(str, browserOperation, j, this);
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
    public final Object invoke(HtJ<? super BrowserEngineResult> htJ) {
        return ((LocalBrowserNodeHandler$execute$result$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
