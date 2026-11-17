package com.facebook.aura.conversation.view.richcontent;

import X.AGH;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.network.transport.HatchHttpRequest;
import com.facebook.aura.network.transport.HatchHttpResponseStream;
import com.facebook.aura.network.transport.HatchRequestCategory;
import com.facebook.aura.network.transport.HatchRequestPurpose;
import com.facebook.aura.network.transport.HatchResponseBodyPolicy;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt$openWidgetAssetStream$stream$1", f = "HatchWidgetWebView.kt", l = {1648}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchWidgetWebViewKt$openWidgetAssetStream$stream$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchHttpResponseStream>, Object> {
    public final /* synthetic */ String $fullUrl;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWidgetWebViewKt$openWidgetAssetStream$stream$1(String str, HtJ<? super HatchWidgetWebViewKt$openWidgetAssetStream$stream$1> htJ) {
        super(2, htJ);
        this.$fullUrl = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchWidgetWebViewKt$openWidgetAssetStream$stream$1(this.$fullUrl, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HatchHttpResponseStream> htJ) {
        return new HatchWidgetWebViewKt$openWidgetAssetStream$stream$1(this.$fullUrl, htJ).invokeSuspend(Unit.INSTANCE);
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
        HatchHttpRequest hatchHttpRequest = HatchHttpRequest.Companion.get(this.$fullUrl, AGH.A0E(), null, null, null, HatchRequestCategory.API, HatchRequestPurpose.FETCH, null, false, false, HatchResponseBodyPolicy.DEFAULT);
        this.label = 1;
        Object objOpenStreamWithTransportRetry = HatchWidgetWebViewKt.openStreamWithTransportRetry(hatchHttpRequest, this);
        return objOpenStreamWithTransportRetry == enumC10460Hji ? enumC10460Hji : objOpenStreamWithTransportRetry;
    }
}
