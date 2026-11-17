package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.localbrowser.LocalBrowserStefiPath;
import com.facebook.aura.network.transport.HatchHttpClient;
import com.facebook.aura.network.transport.HatchHttpRequest;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.network.transport.HatchRequestBody;
import com.facebook.aura.network.transport.HatchRequestPriorityPolicyKt;
import com.facebook.aura.network.transport.HatchRequestPurpose;
import com.facebook.aura.network.transport.HatchResponseBodyPolicy;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserBlocklist$check$1$check$response$1", f = "LocalBrowserBlocklist.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class LocalBrowserBlocklist$check$1$check$response$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchHttpResponse>, Object> {
    public final /* synthetic */ LocalBrowserStefiPath.BrowserBlocklistCheck $path;
    public final /* synthetic */ byte[] $request;
    public int label;
    public final /* synthetic */ LocalBrowserBlocklist this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserBlocklist$check$1$check$response$1(LocalBrowserBlocklist localBrowserBlocklist, LocalBrowserStefiPath.BrowserBlocklistCheck browserBlocklistCheck, byte[] bArr, HtJ<? super LocalBrowserBlocklist$check$1$check$response$1> htJ) {
        super(2, htJ);
        this.this$0 = localBrowserBlocklist;
        this.$path = browserBlocklistCheck;
        this.$request = bArr;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserBlocklist$check$1$check$response$1(this.this$0, this.$path, this.$request, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return obj;
        }
        Hwg.A00(obj);
        HatchHttpClient hatchHttpClient = this.this$0.client;
        HatchHttpRequest.Companion companion = HatchHttpRequest.Companion;
        String strUrl = LocalBrowserBlocklist.Companion.url(this.$path);
        HatchRequestBody.Bytes bytes = new HatchRequestBody.Bytes(this.$request, "application/json; charset=utf-8");
        Map<String, String> map = LocalBrowserBlocklist.HEADERS;
        Long lA0S = C3cG.A0S(5000L);
        HatchHttpRequest hatchHttpRequestPost = companion.post(strUrl, bytes, map, lA0S, lA0S, lA0S, HatchRequestPriorityPolicyKt.categoryFor(this.$path), HatchRequestPurpose.FETCH, null, false, false, true, new HatchResponseBodyPolicy(65536L), null, false, true);
        this.label = 1;
        Object objExecute = hatchHttpClient.execute(hatchHttpRequestPost, this);
        return objExecute == enumC10460Hji ? enumC10460Hji : objExecute;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HatchHttpResponse> htJ) {
        return ((LocalBrowserBlocklist$check$1$check$response$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
