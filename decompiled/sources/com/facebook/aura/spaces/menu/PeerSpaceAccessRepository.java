package com.facebook.aura.spaces.menu;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import X.C3cG;
import X.HtJ;
import X.HzP;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class PeerSpaceAccessRepository {
    public static final int $stable = 8;
    public final String hostMuse;
    public final String spaceId;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.spaces.menu.PeerSpaceAccessRepository", f = "PeerSpaceAccessRepository.kt", l = {107}, m = "members", v = 2)
    /* renamed from: com.facebook.aura.spaces.menu.PeerSpaceAccessRepository$members$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PeerSpaceAccessRepository.this.members(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.menu.PeerSpaceAccessRepository", f = "PeerSpaceAccessRepository.kt", l = {121}, m = "sendAccessRequest", v = 2)
    /* renamed from: com.facebook.aura.spaces.menu.PeerSpaceAccessRepository$sendAccessRequest$1, reason: invalid class name and case insensitive filesystem */
    public final class C138901 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public C138901(HtJ<? super C138901> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PeerSpaceAccessRepository.this.sendAccessRequest(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendAccessRequest(java.lang.String r27, X.HtJ<? super kotlin.Unit> r28) {
        /*
            r26 = this;
            r3 = r28
            boolean r0 = r3 instanceof com.facebook.aura.spaces.menu.PeerSpaceAccessRepository.C138901
            r5 = r26
            if (r0 == 0) goto La4
            r4 = r3
            com.facebook.aura.spaces.menu.PeerSpaceAccessRepository$sendAccessRequest$1 r4 = (com.facebook.aura.spaces.menu.PeerSpaceAccessRepository.C138901) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La4
            int r2 = r2 - r1
            r4.label = r2
        L16:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r9 = 1
            if (r0 == 0) goto L2b
            if (r0 != r9) goto Lab
            java.lang.Object r0 = X.AnonymousClass001.A0q(r1)
        L25:
            X.Hwg.A00(r0)
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L2b:
            X.Hwg.A00(r1)
            com.facebook.aura.network.http.HatchHttpApi r6 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            java.lang.String r2 = r5.hostMuse
            java.lang.String r1 = r5.spaceId
            java.lang.String r0 = "_access_request"
            com.facebook.aura.spaces.menu.PeerSpacePath r10 = new com.facebook.aura.spaces.menu.PeerSpacePath
            r10.<init>(r2, r1, r0)
            com.facebook.aura.spaces.menu.PeerSpaceAccessRequestJson r11 = new com.facebook.aura.spaces.menu.PeerSpaceAccessRequestJson
            r0 = r27
            r11.<init>(r0)
            com.facebook.aura.network.http.RequestType r12 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r13 = r5.userSession
            r2 = 0
            X.HxE[] r1 = new X.HxE[r2]
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r5 = X.C3cG.A0R(r0)
            r0 = 202(0xca, float:2.83E-43)
            java.lang.Integer r0 = X.C3cG.A0R(r0)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r5, r0}
            java.util.Set r17 = X.BFI.A0H(r0)
            X.9jH r20 = X.C9jH.A00
            com.facebook.aura.spaces.menu.PeerSpaceAccessRepository$sendAccessRequest$$inlined$executeJarvisRequest-Z6QaZII$default$1 r7 = com.facebook.aura.spaces.menu.PeerSpaceAccessRepository$sendAccessRequest$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.spaces.menu.PeerSpaceAccessRepository$sendAccessRequest$$inlined$executeJarvisRequest-Z6QaZII$default$2 r8 = com.facebook.aura.spaces.menu.PeerSpaceAccessRepository$sendAccessRequest$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r14 = 0
            r4.L$0 = r14
            r4.L$1 = r14
            r4.L$2 = r14
            r4.L$3 = r14
            r4.L$4 = r14
            r4.L$5 = r14
            r4.L$6 = r14
            r4.L$7 = r14
            r4.L$8 = r14
            r4.I$0 = r2
            r4.I$1 = r2
            r4.I$2 = r2
            r4.I$3 = r9
            r4.I$4 = r2
            r4.I$5 = r2
            r4.I$6 = r2
            r4.label = r9
            r15 = r14
            r18 = r2
            r19 = r2
            r21 = r14
            r22 = r2
            r23 = r9
            r24 = r2
            r25 = r2
            r26 = r14
            r27 = r2
            r28 = r4
            r16 = r1
            java.lang.Object r0 = r6.m1599executeJarvisRequestWithFof5HsY(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            if (r0 != r3) goto L25
            return r3
        La4:
            com.facebook.aura.spaces.menu.PeerSpaceAccessRepository$sendAccessRequest$1 r4 = new com.facebook.aura.spaces.menu.PeerSpaceAccessRepository$sendAccessRequest$1
            r4.<init>(r3)
            goto L16
        Lab:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.menu.PeerSpaceAccessRepository.sendAccessRequest(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final Object leave(HtJ<? super Unit> htJ) {
        return C3cG.A0U(sendAccessRequest("none", htJ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011b  */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.Hji] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object members(X.HtJ<? super java.util.List<com.facebook.aura.spaces.menu.PeerSpaceMember>> r22) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.menu.PeerSpaceAccessRepository.members(X.HtJ):java.lang.Object");
    }

    public PeerSpaceAccessRepository(AbstractC3358CGz abstractC3358CGz, String str, String str2) {
        AnonymousClass005.A0x(abstractC3358CGz, str, str2);
        this.userSession = abstractC3358CGz;
        this.hostMuse = str;
        this.spaceId = str2;
    }
}
