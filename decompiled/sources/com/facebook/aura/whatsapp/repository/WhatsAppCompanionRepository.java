package com.facebook.aura.whatsapp.repository;

import X.AbstractC3358CGz;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class WhatsAppCompanionRepository {
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.whatsapp.repository.WhatsAppCompanionRepository", f = "WhatsAppCompanionRepository.kt", l = {100}, m = "checkStatus", v = 2)
    /* renamed from: com.facebook.aura.whatsapp.repository.WhatsAppCompanionRepository$checkStatus$1, reason: invalid class name */
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
        public Object L$7;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WhatsAppCompanionRepository.this.checkStatus(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.whatsapp.repository.WhatsAppCompanionRepository", f = "WhatsAppCompanionRepository.kt", l = {124}, m = "requestLinkCode", v = 2)
    /* renamed from: com.facebook.aura.whatsapp.repository.WhatsAppCompanionRepository$requestLinkCode$1, reason: invalid class name and case insensitive filesystem */
    public final class C143691 extends HzP {
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
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C143691(HtJ<? super C143691> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WhatsAppCompanionRepository.this.requestLinkCode(null, this);
        }
    }

    public WhatsAppCompanionRepository(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkStatus(X.HtJ<? super com.facebook.aura.whatsapp.repository.WhatsAppCompanionStatusResult> r19) {
        /*
            r18 = this;
            r4 = r19
            boolean r0 = r4 instanceof com.facebook.aura.whatsapp.repository.WhatsAppCompanionRepository.AnonymousClass1
            r5 = r18
            if (r0 == 0) goto L22
            r3 = r4
            com.facebook.aura.whatsapp.repository.WhatsAppCompanionRepository$checkStatus$1 r3 = (com.facebook.aura.whatsapp.repository.WhatsAppCompanionRepository.AnonymousClass1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r1 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r14 = 1
            if (r0 == 0) goto L2d
            if (r0 != r14) goto L28
            goto L71
        L22:
            com.facebook.aura.whatsapp.repository.WhatsAppCompanionRepository$checkStatus$1 r3 = new com.facebook.aura.whatsapp.repository.WhatsAppCompanionRepository$checkStatus$1
            r3.<init>(r4)
            goto L16
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r1)
            com.facebook.aura.network.http.HatchHttpApi r4 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE     // Catch: java.lang.Exception -> L8e
            com.facebook.aura.whatsapp.repository.WhatsAppJarvisPath$WhatsAppCompanionStatus r7 = com.facebook.aura.whatsapp.repository.WhatsAppJarvisPath.WhatsAppCompanionStatus.INSTANCE     // Catch: java.lang.Exception -> L8e
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.GET     // Catch: java.lang.Exception -> L8e
            X.CGz r9 = r5.userSession     // Catch: java.lang.Exception -> L8e
            r0 = 10
            java.lang.Long r10 = X.C3cG.A0S(r0)     // Catch: java.lang.Exception -> L8e
            r6 = 0
            X.HxE[] r11 = new X.HxE[r6]     // Catch: java.lang.Exception -> L8e
            java.util.Set r13 = X.AnonymousClass004.A18()     // Catch: java.lang.Exception -> L8e
            X.9jH r15 = X.C9jH.A00     // Catch: java.lang.Exception -> L8e
            com.facebook.aura.whatsapp.repository.WhatsAppCompanionRepository$checkStatus$$inlined$executeJarvisRequest-1iavgos$default$1 r5 = com.facebook.aura.whatsapp.repository.WhatsAppCompanionRepository$checkStatus$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE     // Catch: java.lang.Exception -> L8e
            r12 = 0
            r3.L$0 = r12     // Catch: java.lang.Exception -> L8e
            r3.L$1 = r12     // Catch: java.lang.Exception -> L8e
            r3.L$2 = r12     // Catch: java.lang.Exception -> L8e
            r3.L$3 = r12     // Catch: java.lang.Exception -> L8e
            r3.L$4 = r12     // Catch: java.lang.Exception -> L8e
            r3.L$5 = r12     // Catch: java.lang.Exception -> L8e
            r3.L$6 = r12     // Catch: java.lang.Exception -> L8e
            r3.L$7 = r12     // Catch: java.lang.Exception -> L8e
            r3.I$0 = r14     // Catch: java.lang.Exception -> L8e
            r3.I$1 = r14     // Catch: java.lang.Exception -> L8e
            r3.I$2 = r6     // Catch: java.lang.Exception -> L8e
            r3.label = r14     // Catch: java.lang.Exception -> L8e
            r16 = r14
            r17 = r12
            r18 = r6
            r19 = r3
            java.lang.Object r1 = r4.m1595executeBodylessJarvisRequestWithp3iPjrY(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Exception -> L8e
            if (r1 != r2) goto L75
            return r2
        L71:
            java.lang.Object r1 = X.AnonymousClass001.A0q(r1)     // Catch: java.lang.Exception -> L8e
        L75:
            boolean r0 = r1 instanceof X.C10571Hud     // Catch: java.lang.Exception -> L8e
            if (r0 == 0) goto L7a
            r1 = 0
        L7a:
            com.facebook.aura.whatsapp.repository.WhatsAppStatusPayloadJson r1 = (com.facebook.aura.whatsapp.repository.WhatsAppStatusPayloadJson) r1     // Catch: java.lang.Exception -> L8e
            if (r1 == 0) goto L85
            com.facebook.aura.whatsapp.repository.WhatsAppCompanionStatusResult r2 = r1.toDomain()     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L85
            return r2
        L85:
            com.facebook.aura.whatsapp.repository.WhatsAppCompanionStatus r1 = com.facebook.aura.whatsapp.repository.WhatsAppCompanionStatus.PENDING     // Catch: java.lang.Exception -> L8e
            r0 = 0
            com.facebook.aura.whatsapp.repository.WhatsAppCompanionStatusResult r2 = new com.facebook.aura.whatsapp.repository.WhatsAppCompanionStatusResult     // Catch: java.lang.Exception -> L8e
            r2.<init>(r1, r0, r0, r0)     // Catch: java.lang.Exception -> L8e
            return r2
        L8e:
            r2 = move-exception
            java.lang.String r1 = "checkStatus failed"
            java.lang.String r0 = "WhatsAppCompanionRepo"
            X.CFK.A08(r0, r1, r2)
            com.facebook.aura.whatsapp.repository.WhatsAppCompanionStatus r2 = com.facebook.aura.whatsapp.repository.WhatsAppCompanionStatus.PENDING
            r1 = 0
            com.facebook.aura.whatsapp.repository.WhatsAppCompanionStatusResult r0 = new com.facebook.aura.whatsapp.repository.WhatsAppCompanionStatusResult
            r0.<init>(r2, r1, r1, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.whatsapp.repository.WhatsAppCompanionRepository.checkStatus(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object requestLinkCode(java.lang.String r27, X.HtJ<? super com.facebook.aura.whatsapp.repository.WhatsAppCompanionLinkResult> r28) {
        /*
            r26 = this;
            r4 = r28
            boolean r0 = r4 instanceof com.facebook.aura.whatsapp.repository.WhatsAppCompanionRepository.C143691
            r5 = r26
            if (r0 == 0) goto L22
            r2 = r4
            com.facebook.aura.whatsapp.repository.WhatsAppCompanionRepository$requestLinkCode$1 r2 = (com.facebook.aura.whatsapp.repository.WhatsAppCompanionRepository.C143691) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L22
            int r3 = r3 - r1
            r2.label = r3
        L16:
            java.lang.Object r4 = r2.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r2.label
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L28
            goto L94
        L22:
            com.facebook.aura.whatsapp.repository.WhatsAppCompanionRepository$requestLinkCode$1 r2 = new com.facebook.aura.whatsapp.repository.WhatsAppCompanionRepository$requestLinkCode$1
            r2.<init>(r4)
            goto L16
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r4)
            com.facebook.aura.network.http.HatchHttpApi r6 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE     // Catch: java.lang.Exception -> Laf
            com.facebook.aura.whatsapp.repository.WhatsAppJarvisPath$WhatsAppCompanionLink r10 = com.facebook.aura.whatsapp.repository.WhatsAppJarvisPath.WhatsAppCompanionLink.INSTANCE     // Catch: java.lang.Exception -> Laf
            com.facebook.aura.whatsapp.repository.WhatsAppLinkRequestJson r11 = new com.facebook.aura.whatsapp.repository.WhatsAppLinkRequestJson     // Catch: java.lang.Exception -> Laf
            r0 = r27
            r11.<init>(r0)     // Catch: java.lang.Exception -> Laf
            com.facebook.aura.network.http.RequestType r12 = com.facebook.aura.network.http.RequestType.POST     // Catch: java.lang.Exception -> Laf
            X.CGz r13 = r5.userSession     // Catch: java.lang.Exception -> Laf
            r4 = 30
            java.lang.Long r14 = X.C3cG.A0S(r4)     // Catch: java.lang.Exception -> Laf
            r9 = 0
            X.HxE[] r0 = new X.HxE[r9]     // Catch: java.lang.Exception -> Laf
            java.util.Set r17 = X.AnonymousClass004.A18()     // Catch: java.lang.Exception -> Laf
            X.9jH r20 = X.C9jH.A00     // Catch: java.lang.Exception -> Laf
            com.facebook.aura.whatsapp.repository.WhatsAppCompanionRepository$requestLinkCode$$inlined$executeJarvisRequest-Z6QaZII$default$1 r7 = com.facebook.aura.whatsapp.repository.WhatsAppCompanionRepository$requestLinkCode$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE     // Catch: java.lang.Exception -> Laf
            com.facebook.aura.whatsapp.repository.WhatsAppCompanionRepository$requestLinkCode$$inlined$executeJarvisRequest-Z6QaZII$default$2 r8 = com.facebook.aura.whatsapp.repository.WhatsAppCompanionRepository$requestLinkCode$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE     // Catch: java.lang.Exception -> Laf
            r15 = 0
            r2.L$0 = r15     // Catch: java.lang.Exception -> Laf
            r2.L$1 = r15     // Catch: java.lang.Exception -> Laf
            r2.L$2 = r15     // Catch: java.lang.Exception -> Laf
            r2.L$3 = r15     // Catch: java.lang.Exception -> Laf
            r2.L$4 = r15     // Catch: java.lang.Exception -> Laf
            r2.L$5 = r15     // Catch: java.lang.Exception -> Laf
            r2.L$6 = r15     // Catch: java.lang.Exception -> Laf
            r2.L$7 = r15     // Catch: java.lang.Exception -> Laf
            r2.L$8 = r15     // Catch: java.lang.Exception -> Laf
            r2.L$9 = r15     // Catch: java.lang.Exception -> Laf
            r2.I$0 = r1     // Catch: java.lang.Exception -> Laf
            r2.I$1 = r1     // Catch: java.lang.Exception -> Laf
            r2.I$2 = r9     // Catch: java.lang.Exception -> Laf
            r2.I$3 = r1     // Catch: java.lang.Exception -> Laf
            r2.I$4 = r9     // Catch: java.lang.Exception -> Laf
            r2.I$5 = r9     // Catch: java.lang.Exception -> Laf
            r2.I$6 = r9     // Catch: java.lang.Exception -> Laf
            r2.label = r1     // Catch: java.lang.Exception -> Laf
            r19 = r1
            r21 = r15
            r22 = r9
            r23 = r1
            r24 = r9
            r25 = r9
            r26 = r15
            r27 = r9
            r28 = r2
            r18 = r1
            r16 = r0
            java.lang.Object r1 = r6.m1599executeJarvisRequestWithFof5HsY(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch: java.lang.Exception -> Laf
            if (r1 != r3) goto L98
            return r3
        L94:
            java.lang.Object r1 = X.AnonymousClass001.A0q(r4)     // Catch: java.lang.Exception -> Laf
        L98:
            java.lang.Throwable r0 = X.HsJ.A00(r1)     // Catch: java.lang.Exception -> Laf
            if (r0 != 0) goto La5
            com.facebook.aura.whatsapp.repository.WhatsAppLinkPayloadJson r1 = (com.facebook.aura.whatsapp.repository.WhatsAppLinkPayloadJson) r1     // Catch: java.lang.Exception -> Laf
            com.facebook.aura.whatsapp.repository.WhatsAppCompanionLinkResult r3 = r1.toDomain()     // Catch: java.lang.Exception -> Laf
            return r3
        La5:
            java.lang.String r2 = "Failed to connect"
            r1 = 0
            r0 = 0
            com.facebook.aura.whatsapp.repository.WhatsAppCompanionLinkResult r3 = new com.facebook.aura.whatsapp.repository.WhatsAppCompanionLinkResult     // Catch: java.lang.Exception -> Laf
            r3.<init>(r0, r1, r2)     // Catch: java.lang.Exception -> Laf
            return r3
        Laf:
            r2 = move-exception
            java.lang.String r1 = "requestLinkCode failed"
            java.lang.String r0 = "WhatsAppCompanionRepo"
            X.CFK.A08(r0, r1, r2)
            r3 = 0
            java.lang.String r2 = "Failed to initiate linking"
            r1 = 0
            com.facebook.aura.whatsapp.repository.WhatsAppCompanionLinkResult r0 = new com.facebook.aura.whatsapp.repository.WhatsAppCompanionLinkResult
            r0.<init>(r1, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.whatsapp.repository.WhatsAppCompanionRepository.requestLinkCode(java.lang.String, X.HtJ):java.lang.Object");
    }
}
