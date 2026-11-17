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

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEndpoint$register$ineligible$1", f = "LocalBrowserEndpoint.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserEndpoint$register$ineligible$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
    public final /* synthetic */ HatchNodeInvocation $invocation;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserEndpoint$register$ineligible$1(HatchNodeInvocation hatchNodeInvocation, HtJ<? super LocalBrowserEndpoint$register$ineligible$1> htJ) {
        super(2, htJ);
        this.$invocation = hatchNodeInvocation;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserEndpoint$register$ineligible$1(this.$invocation, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return LocalBrowserCapabilities.INSTANCE.deviceIneligibility$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(AnonymousClass001.A0I(this.$invocation.context));
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
        return new LocalBrowserEndpoint$register$ineligible$1(this.$invocation, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
