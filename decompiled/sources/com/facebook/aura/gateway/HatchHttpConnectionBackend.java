package com.facebook.aura.gateway;

import X.AbstractC3358CGz;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import com.facebook.aura.nodes.transport.HatchNodeHttpClient;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class HatchHttpConnectionBackend implements HatchNodeHttpClient {
    public static final int $stable = 8;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchHttpConnectionBackend", f = "HatchHttpConnectionBackend.kt", l = {R.styleable.maplibre_MapView_maplibre_uiTiltGestures}, m = "sendHttpPost", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchHttpConnectionBackend$sendHttpPost$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
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
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchHttpConnectionBackend.this.sendHttpPost(null, null, this);
        }
    }

    public HatchHttpConnectionBackend(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    @Override // com.facebook.aura.nodes.transport.HatchNodeHttpClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object sendHttpPost(java.lang.String r20, java.lang.String r21, X.HtJ<? super java.lang.String> r22) {
        /*
            r19 = this;
            r4 = r20
            r12 = r21
            r3 = r22
            boolean r0 = r3 instanceof com.facebook.aura.gateway.HatchHttpConnectionBackend.AnonymousClass1
            r9 = r19
            if (r0 == 0) goto L9d
            r7 = r3
            com.facebook.aura.gateway.HatchHttpConnectionBackend$sendHttpPost$1 r7 = (com.facebook.aura.gateway.HatchHttpConnectionBackend.AnonymousClass1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9d
            int r2 = r2 - r1
            r7.label = r2
        L1a:
            java.lang.Object r8 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 1
            if (r0 == 0) goto L52
            if (r0 != r5) goto La4
            java.lang.Object r0 = r7.L$0
            java.lang.String r4 = X.C3cG.A0d(r0, r8)
        L2b:
            com.facebook.aura.network.transport.HatchHttpResponse r8 = (com.facebook.aura.network.transport.HatchHttpResponse) r8
            r3 = 0
            if (r8 == 0) goto L46
            boolean r0 = r8.isSuccessful
            if (r0 != 0) goto L47
            int r2 = r8.statusCode
            java.lang.String r1 = "sendHttpPost "
            java.lang.String r0 = " returned HTTP "
            java.lang.String r1 = X.FGI.A0V(r1, r4, r0, r2)
            java.lang.String r0 = "HatchHttpConnectionBackend"
            X.CFK.A06(r0, r1)
            r8.body()
        L46:
            return r3
        L47:
            com.facebook.aura.network.transport.HatchHttpResponseBody r0 = r8.body()
            if (r0 == 0) goto L46
            java.lang.String r0 = r0.string()
            return r0
        L52:
            X.Hwg.A00(r8)
            com.facebook.aura.network.http.HatchHttpApi r10 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.api.JarvisPath$Raw r11 = new com.facebook.aura.network.api.JarvisPath$Raw
            r11.<init>(r4)
            com.facebook.aura.network.http.RequestType r13 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r14 = r9.userSession
            r3 = 0
            X.HxE[] r2 = new X.HxE[r3]
            X.9jH r19 = X.AGH.A0E()
            if (r21 != 0) goto L71
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson
            X.9iq r0 = X.C07779iq.A01
            java.lang.String r12 = r1.A02(r12, r0)
        L71:
            r7.L$0 = r4
            r15 = 0
            r7.L$1 = r15
            r7.L$2 = r15
            r7.L$3 = r15
            r7.L$4 = r15
            r7.L$5 = r15
            r7.L$6 = r15
            r7.L$7 = r15
            r7.L$8 = r15
            r7.L$9 = r15
            r7.I$0 = r5
            r7.label = r5
            r16 = r15
            r21 = r5
            r20 = r3
            r22 = r7
            r18 = r5
            r17 = r2
            java.lang.Object r8 = r10.makeJarvisHttpRequestInternal(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            if (r8 != r6) goto L2b
            return r6
        L9d:
            com.facebook.aura.gateway.HatchHttpConnectionBackend$sendHttpPost$1 r7 = new com.facebook.aura.gateway.HatchHttpConnectionBackend$sendHttpPost$1
            r7.<init>(r3)
            goto L1a
        La4:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchHttpConnectionBackend.sendHttpPost(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }
}
