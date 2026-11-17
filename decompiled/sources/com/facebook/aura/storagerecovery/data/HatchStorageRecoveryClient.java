package com.facebook.aura.storagerecovery.data;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchStorageRecoveryClient {
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient", f = "HatchStorageRecoveryClient.kt", l = {116, 207}, m = "delete", v = 2)
    /* renamed from: com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient$delete$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
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

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchStorageRecoveryClient.this.delete(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient", f = "HatchStorageRecoveryClient.kt", l = {183}, m = "fetchStatus", v = 2)
    /* renamed from: com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient$fetchStatus$1, reason: invalid class name and case insensitive filesystem */
    public final class C141291 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public long J$0;
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

        public C141291(HtJ<? super C141291> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchStorageRecoveryClient.this.fetchStatus(0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient", f = "HatchStorageRecoveryClient.kt", l = {207}, m = "listEntries", v = 2)
    /* renamed from: com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient$listEntries$1, reason: invalid class name and case insensitive filesystem */
    public final class C141301 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public int I$7;
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

        public C141301(HtJ<? super C141301> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchStorageRecoveryClient.this.listEntries(null, null, 0, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient", f = "HatchStorageRecoveryClient.kt", l = {139}, m = "notaryHeader", v = 2)
    /* renamed from: com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient$notaryHeader$1, reason: invalid class name and case insensitive filesystem */
    public final class C141311 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C141311(HtJ<? super C141311> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchStorageRecoveryClient.this.notaryHeader(null, this);
        }
    }

    public HatchStorageRecoveryClient(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
    }

    public static /* synthetic */ Object delete$default(HatchStorageRecoveryClient hatchStorageRecoveryClient, List list, String str, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            str = AnonymousClass002.A0k();
        }
        return hatchStorageRecoveryClient.delete(list, str, htJ);
    }

    public static /* synthetic */ Object fetchStatus$default(HatchStorageRecoveryClient hatchStorageRecoveryClient, long j, HtJ htJ, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 15;
        }
        return hatchStorageRecoveryClient.fetchStatus(j, htJ);
    }

    public static /* synthetic */ Object listEntries$default(HatchStorageRecoveryClient hatchStorageRecoveryClient, String str, String str2, int i, HtJ htJ, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            i = 200;
        }
        return hatchStorageRecoveryClient.listEntries(str, str2, i, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object notaryHeader(com.facebook.aura.network.api.JarvisPath r8, X.HtJ<? super java.util.Map<java.lang.String, java.lang.String>> r9) throws com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError.Unavailable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient.C141311
            if (r0 == 0) goto L5c
            r5 = r9
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient$notaryHeader$1 r5 = (com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient.C141311) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5c
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L27
            if (r0 != r4) goto L62
            X.Hwg.A00(r1)
        L20:
            java.lang.String r0 = "X-Hatch-Notary-Authorization"
            java.util.Map r0 = X.AnonymousClass006.A10(r0, r1)
            return r0
        L27:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore$Companion r1 = com.facebook.aura.gateway.store.HatchGatewayPrefsStore.Companion
            X.CGz r0 = r7.userSession
            java.lang.String r3 = X.C3cH.A0a(r1, r0)
            if (r3 == 0) goto L67
            int r0 = r3.length()
            if (r0 == 0) goto L67
            com.facebook.aura.storagerecovery.data.HatchVmRecoveryTokenCache$Companion r1 = com.facebook.aura.storagerecovery.data.HatchVmRecoveryTokenCache.Companion
            X.CGz r0 = r7.userSession
            com.facebook.aura.storagerecovery.data.HatchVmRecoveryTokenCache r2 = r1.getInstance(r0)
            java.lang.String r1 = r8.getValue()
            java.lang.String r0 = "/"
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.label = r4
            java.lang.Object r1 = r2.token(r3, r1, r5)
            if (r1 != r6) goto L20
            return r6
        L5c:
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient$notaryHeader$1 r5 = new com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient$notaryHeader$1
            r5.<init>(r9)
            goto L12
        L62:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L67:
            r0 = 50
            java.lang.String r1 = X.C60N.A00(r0)
            java.lang.String r0 = "Cannot authorize a recovery mutation: no VM id in the gateway URL"
            X.CFK.A06(r1, r0)
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError$Unavailable r0 = com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError.Unavailable.INSTANCE
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient.notaryHeader(com.facebook.aura.network.api.JarvisPath, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object delete(java.util.List<java.lang.String> r27, java.lang.String r28, X.HtJ<? super com.facebook.aura.storagerecovery.data.HatchStorageRecoveryDeleteReceipt> r29) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient.delete(java.util.List, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchStatus(long r15, X.HtJ<? super com.facebook.aura.storagerecovery.data.HatchStorageRecoveryStatus> r17) {
        /*
            r14 = this;
            r4 = r17
            boolean r0 = r4 instanceof com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient.C141291
            if (r0 == 0) goto L87
            r0 = r4
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient$fetchStatus$1 r0 = (com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient.C141291) r0
            int r3 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L87
            int r3 = r3 - r2
            r0.label = r3
        L14:
            java.lang.Object r3 = r0.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r2 = r0.label
            r12 = 1
            if (r2 == 0) goto L45
            if (r2 != r12) goto L95
            java.lang.Object r2 = X.AnonymousClass001.A0q(r3)
        L23:
            java.lang.Throwable r0 = X.HsJ.A00(r2)
            if (r0 != 0) goto L90
            com.facebook.aura.storagerecovery.data.StorageRecoveryStatusJson r2 = (com.facebook.aura.storagerecovery.data.StorageRecoveryStatusJson) r2
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryServerStatus$Companion r1 = com.facebook.aura.storagerecovery.data.HatchStorageRecoveryServerStatus.Companion
            java.lang.String r0 = r2.status
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryServerStatus r3 = r1.fromWire(r0)
            if (r3 == 0) goto L8d
            long r4 = r2.total_bytes
            long r6 = r2.available_bytes
            double r8 = r2.usage_percentage
            boolean r10 = r2.can_list
            boolean r11 = r2.can_delete
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryStatus r2 = new com.facebook.aura.storagerecovery.data.HatchStorageRecoveryStatus
            r2.<init>(r3, r4, r6, r8, r10, r11)
            return r2
        L45:
            X.Hwg.A00(r3)
            com.facebook.aura.network.http.HatchHttpApi r2 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.storagerecovery.data.StorageRecoveryJarvisPath$RecoveryStorageStatus r5 = com.facebook.aura.storagerecovery.data.StorageRecoveryJarvisPath.RecoveryStorageStatus.INSTANCE
            com.facebook.aura.network.http.RequestType r6 = com.facebook.aura.network.http.RequestType.GET
            X.CGz r7 = r14.userSession
            java.lang.Long r8 = X.C3cG.A0S(r15)
            r4 = 0
            X.HxE[] r9 = new X.HxE[r4]
            java.util.Set r11 = X.AnonymousClass004.A18()
            X.9jH r13 = X.C9jH.A00
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient$fetchStatus$$inlined$executeJarvisRequest-1iavgos$default$1 r3 = com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient$fetchStatus$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r10 = 0
            r0.L$0 = r10
            r0.L$1 = r10
            r0.L$2 = r10
            r0.L$3 = r10
            r0.L$4 = r10
            r0.L$5 = r10
            r0.L$6 = r10
            r0.L$7 = r10
            r0.J$0 = r15
            r0.I$0 = r12
            r0.I$1 = r12
            r0.I$2 = r4
            r0.label = r12
            r14 = r12
            r15 = r10
            r16 = r4
            r17 = r0
            java.lang.Object r2 = r2.m1595executeBodylessJarvisRequestWithp3iPjrY(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r2 != r1) goto L23
            return r1
        L87:
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient$fetchStatus$1 r0 = new com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient$fetchStatus$1
            r0.<init>(r4)
            goto L14
        L8d:
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError$InvalidResponse r0 = com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError.InvalidResponse.INSTANCE
            throw r0
        L90:
            java.lang.Throwable r0 = com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClientKt.toRecoveryError(r0)
            throw r0
        L95:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient.fetchStatus(long, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object listEntries(java.lang.String r26, java.lang.String r27, int r28, X.HtJ<? super com.facebook.aura.storagerecovery.data.HatchStorageRecoveryListResult> r29) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient.listEntries(java.lang.String, java.lang.String, int, X.HtJ):java.lang.Object");
    }
}
