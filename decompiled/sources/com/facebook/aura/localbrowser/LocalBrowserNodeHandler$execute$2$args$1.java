package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.nodes.api.HatchNodeInvocation;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserNodeHandler$execute$2$args$1", f = "LocalBrowserNodeHandler.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserNodeHandler$execute$2$args$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super JsonObject>, Object> {
    public final /* synthetic */ HatchNodeInvocation $invocation;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserNodeHandler$execute$2$args$1(HatchNodeInvocation hatchNodeInvocation, HtJ<? super LocalBrowserNodeHandler$execute$2$args$1> htJ) {
        super(2, htJ);
        this.$invocation = hatchNodeInvocation;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserNodeHandler$execute$2$args$1(this.$invocation, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        LocalBrowserCommands localBrowserCommands = LocalBrowserCommands.INSTANCE;
        HatchNodeInvocation hatchNodeInvocation = this.$invocation;
        return localBrowserCommands.decode(hatchNodeInvocation.command, hatchNodeInvocation.arguments);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super JsonObject> htJ) {
        return new LocalBrowserNodeHandler$execute$2$args$1(this.$invocation, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
