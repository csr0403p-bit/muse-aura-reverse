package com.facebook.aura.file.view;

import X.ADq;
import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C9jH;
import X.C9sU;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.file.view.HtmlHostJarvisPath;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class AuraHtmlHostCallClient {
    public static final int $stable = 0;
    public static final AuraHtmlHostCallClient INSTANCE = new AuraHtmlHostCallClient();

    @DebugMetadata(c = "com.facebook.aura.file.view.AuraHtmlHostCallClient$call$2", f = "AuraHtmlHostCallClient.kt", l = {HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.AuraHtmlHostCallClient$call$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ AuraHtmlHostCallRequest $request;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AuraHtmlHostCallRequest auraHtmlHostCallRequest, AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$request = auraHtmlHostCallRequest;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$request, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objMakeJarvisHttpRequestInternal = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            boolean z = false;
            if (i == 0) {
                Hwg.A00(objMakeJarvisHttpRequestInternal);
                C9sU c9sU = HatchJsonKt.HatchJson;
                AuraHtmlHostCallRequest auraHtmlHostCallRequest = this.$request;
                String strA02 = c9sU.A02(new AuraHtmlHostCallBody(auraHtmlHostCallRequest.action, auraHtmlHostCallRequest.payload), AuraHtmlHostCallBody$$serializer.INSTANCE);
                C9jH c9jHA0E = AGH.A0E();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.I$0 = 1;
                this.label = 1;
                objMakeJarvisHttpRequestInternal = HatchHttpApi.INSTANCE.makeJarvisHttpRequestInternal(HtmlHostJarvisPath.Call.INSTANCE, strA02, RequestType.POST, this.$userSession, C3cG.A0S(20L), null, new HxE[0], true, c9jHA0E, false, true, this);
                if (objMakeJarvisHttpRequestInternal == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objMakeJarvisHttpRequestInternal);
            }
            HatchHttpResponse hatchHttpResponse = (HatchHttpResponse) objMakeJarvisHttpRequestInternal;
            ADq aDq = new ADq(200, 299);
            Integer numA0R = hatchHttpResponse != null ? C3cG.A0R(hatchHttpResponse.statusCode) : null;
            if (numA0R == null || !aDq.A00(numA0R.intValue())) {
                CFK.A06(AuraHtmlHostCallClientKt.TAG, AnonymousClass006.A0y(hatchHttpResponse != null ? C3cG.A0R(hatchHttpResponse.statusCode) : null, ": HTTP failed code=", C3cI.A0x("hatch:call ", this.$request.action)));
            } else {
                CFK.A05(AuraHtmlHostCallClientKt.TAG, FGI.A0U("hatch:call ", this.$request.action, ": sent"));
                z = true;
            }
            return Boolean.valueOf(z);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object call(AbstractC3358CGz abstractC3358CGz, AuraHtmlHostCallRequest auraHtmlHostCallRequest, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(auraHtmlHostCallRequest, abstractC3358CGz, null));
    }
}
