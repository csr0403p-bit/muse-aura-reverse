package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cJ;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.hatch.browser.core.Hatch_browser_core_uniffiKt;
import com.hatch.browser.protocol.PagePrepareRequest;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler$dispatch$request$1", f = "LocalBrowserEndpointNodeHandler.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserEndpointNodeHandler$dispatch$request$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super PagePrepareRequest>, Object> {
    public final /* synthetic */ JsonObject $params;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserEndpointNodeHandler$dispatch$request$1(JsonObject jsonObject, HtJ<? super LocalBrowserEndpointNodeHandler$dispatch$request$1> htJ) {
        super(2, htJ);
        this.$params = jsonObject;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserEndpointNodeHandler$dispatch$request$1(this.$params, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return Hatch_browser_core_uniffiKt.decodePagePrepare(C3cJ.A15(this.$params));
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super PagePrepareRequest> htJ) {
        return new LocalBrowserEndpointNodeHandler$dispatch$request$1(this.$params, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
