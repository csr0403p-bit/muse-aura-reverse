package com.facebook.aura.library.repo;

import X.BFI;
import X.HtJ;
import X.HzP;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public abstract class PeerSpaceAccessKt {
    public static final long ACCESS_CHECK_TIMEOUT_MS = 15000;
    public static final Set<Integer> ACCESS_DENIED_CODES = BFI.A0H(new Integer[]{403, 404, 410});
    public static final String TAG = "PeerSpaceAccess";

    @DebugMetadata(c = "com.facebook.aura.library.repo.PeerSpaceAccessKt", f = "PeerSpaceAccess.kt", l = {35}, m = "checkPeerSpaceAccess", v = 2)
    /* renamed from: com.facebook.aura.library.repo.PeerSpaceAccessKt$checkPeerSpaceAccess$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PeerSpaceAccessKt.checkPeerSpaceAccess(null, null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object checkPeerSpaceAccess(X.AbstractC3358CGz r14, java.lang.String r15, java.lang.String r16, X.HtJ<? super com.facebook.aura.library.repo.PeerSpaceAccess> r17) {
        /*
            r3 = r17
            boolean r0 = r3 instanceof com.facebook.aura.library.repo.PeerSpaceAccessKt.AnonymousClass1
            if (r0 == 0) goto L20
            r5 = r3
            com.facebook.aura.library.repo.PeerSpaceAccessKt$checkPeerSpaceAccess$1 r5 = (com.facebook.aura.library.repo.PeerSpaceAccessKt.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.label = r2
        L14:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L2b
            if (r0 != r3) goto L26
            goto L7f
        L20:
            com.facebook.aura.library.repo.PeerSpaceAccessKt$checkPeerSpaceAccess$1 r5 = new com.facebook.aura.library.repo.PeerSpaceAccessKt$checkPeerSpaceAccess$1
            r5.<init>(r3)
            goto L14
        L26:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2b:
            X.Hwg.A00(r1)
            java.lang.String r1 = X.C60P.A1K(r14)
            com.facebook.aura.network.http.HatchHttpApi r0 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            java.lang.String r2 = r0.jarvisHttpBaseUrl(r1)
            if (r2 == 0) goto Lb8
            r0 = r16
            java.lang.String r1 = com.facebook.aura.library.repo.UnifiedArtifactKt.peerSpaceRootPath(r15, r0)
            java.lang.String r0 = "/"
            java.lang.String r0 = X.C7BY.A0K(r0, r1)
            java.lang.String r7 = X.FGI.A0M(r2, r0)
            com.facebook.aura.network.transport.HatchHttpClient r2 = X.C60O.A08()     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> Lb6
            com.facebook.aura.network.transport.HatchHttpRequest$Companion r6 = com.facebook.aura.network.transport.HatchHttpRequest.Companion     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> Lb6
            r0 = 15000(0x3a98, double:7.411E-320)
            java.lang.Long r9 = X.C3cG.A0S(r0)     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> Lb6
            r14 = 0
            X.9jH r8 = X.AGH.A0E()     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> Lb6
            com.facebook.aura.network.transport.HatchRequestCategory r12 = com.facebook.aura.network.transport.HatchRequestCategory.API     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> Lb6
            com.facebook.aura.network.transport.HatchRequestPurpose r13 = com.facebook.aura.network.transport.HatchRequestPurpose.FETCH     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> Lb6
            r15 = 0
            com.facebook.aura.network.transport.HatchResponseBodyPolicy r17 = com.facebook.aura.network.transport.HatchResponseBodyPolicy.DEFAULT     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> Lb6
            r10 = r9
            r11 = r9
            r16 = r15
            com.facebook.aura.network.transport.HatchHttpRequest r0 = r6.get(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> Lb6
            r5.L$0 = r14     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> Lb6
            r5.L$1 = r14     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> Lb6
            r5.L$2 = r14     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> Lb6
            r5.L$3 = r14     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> Lb6
            r5.L$4 = r14     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> Lb6
            r5.L$5 = r14     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> Lb6
            r5.label = r3     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> Lb6
            java.lang.Object r1 = r2.execute(r0, r5)     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> Lb6
            if (r1 != r4) goto L82
            return r4
        L7f:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> Lb6
        L82:
            com.facebook.aura.network.transport.HatchHttpResponse r1 = (com.facebook.aura.network.transport.HatchHttpResponse) r1     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> Lb6
            int r0 = r1.statusCode     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> Lb6
            java.lang.Integer r3 = X.C3cG.A0R(r0)     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> Lb6
            goto L93
        L8b:
            java.lang.String r1 = "PeerSpaceAccess"
            java.lang.String r0 = "access check failed"
            X.CFK.A06(r1, r0)
            r3 = 0
        L93:
            r2 = 200(0xc8, float:2.8E-43)
            r0 = 299(0x12b, float:4.19E-43)
            X.ADq r1 = new X.ADq
            r1.<init>(r2, r0)
            if (r3 == 0) goto Lab
            int r0 = r3.intValue()
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto Lab
            com.facebook.aura.library.repo.PeerSpaceAccess r4 = com.facebook.aura.library.repo.PeerSpaceAccess.AVAILABLE
            return r4
        Lab:
            java.util.Set<java.lang.Integer> r0 = com.facebook.aura.library.repo.PeerSpaceAccessKt.ACCESS_DENIED_CODES
            boolean r0 = X.AbstractC0878AGe.A0k(r0, r3)
            if (r0 == 0) goto Lb8
            com.facebook.aura.library.repo.PeerSpaceAccess r4 = com.facebook.aura.library.repo.PeerSpaceAccess.UNAVAILABLE
            return r4
        Lb6:
            r0 = move-exception
            throw r0
        Lb8:
            com.facebook.aura.library.repo.PeerSpaceAccess r4 = com.facebook.aura.library.repo.PeerSpaceAccess.UNREACHABLE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.PeerSpaceAccessKt.checkPeerSpaceAccess(X.CGz, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }
}
