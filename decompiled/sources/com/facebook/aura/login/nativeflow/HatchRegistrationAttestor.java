package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.BV5;
import X.BV7;
import X.C3432CNc;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C7Bm;
import X.C9258GBl;
import X.CFK;
import X.CQD;
import X.CQG;
import X.EDo;
import X.EEy;
import X.EF7;
import X.EFA;
import X.EFE;
import X.EFP;
import X.EY5;
import X.EnumC3451CNw;
import X.F0C;
import X.G0V;
import X.GBL;
import X.HtJ;
import X.HxE;
import X.HzP;
import X.InterfaceC2261BLa;
import com.google.common.collect.RegularImmutableSet;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class HatchRegistrationAttestor {
    public static HatchAttestationRequest activeRequest;
    public static HatchAttestationRequest queuedRequest;
    public static final HatchRegistrationAttestor INSTANCE = new HatchRegistrationAttestor();
    public static final F0C operations$delegate = AbstractC5321DgF.A03(HatchRegistrationAttestor$operations$2.INSTANCE);
    public static final AtomicReference<HxE<HatchAttestationRequest, ListenableFuture<EF7>>> currentRotation = BV5.A1A();
    public static final InterfaceC2261BLa rotationMutex = new C9258GBl();
    public static final InterfaceC2261BLa attestationMutex = new C9258GBl();

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchRegistrationAttestor", f = "HatchRegistrationAttestor.kt", l = {232}, m = "activateRequest", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$activateRequest$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchRegistrationAttestor.this.activateRequest(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchRegistrationAttestor", f = "HatchRegistrationAttestor.kt", l = {84}, m = "attest", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$attest$1, reason: invalid class name and case insensitive filesystem */
    public final class C125061 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C125061(HtJ<? super C125061> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchRegistrationAttestor.this.attest(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$attest$2", f = "HatchRegistrationAttestor.kt", l = {232, 86, 88, 90, 90}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$attest$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super AuthRegistrationAttestationJson>, Object> {
        public final /* synthetic */ String $redeemedHandle;
        public final /* synthetic */ HatchAttestationRequest $request;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchAttestationRequest hatchAttestationRequest, String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$request = hatchAttestationRequest;
            this.$redeemedHandle = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$request, this.$redeemedHandle, htJ);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|52|(1:(1:(1:(1:(1:(2:9|10)(3:11|43|44))(4:12|13|35|36))(8:14|53|27|28|55|29|(4:31|34|35|36)|20))(10:15|16|57|24|(2:26|33)|28|55|29|(0)|20))(1:17))(1:18)|21|(2:23|32)|57|24|(0)|28|55|29|(0)|20|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
        
            if (r2.APs(null, r10) == r4) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b5, code lost:
        
            r6 = th;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00cb A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super AuthRegistrationAttestationJson> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchRegistrationAttestor", f = "HatchRegistrationAttestor.kt", l = {107, 121, 123}, m = "attestOrReport", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$attestOrReport$1, reason: invalid class name and case insensitive filesystem */
    public final class C125071 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C125071(HtJ<? super C125071> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchRegistrationAttestor.this.attestOrReport(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchRegistrationAttestor", f = "HatchRegistrationAttestor.kt", l = {232}, m = "begin", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$begin$1, reason: invalid class name and case insensitive filesystem */
    public final class C125081 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C125081(HtJ<? super C125081> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchRegistrationAttestor.this.begin(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchRegistrationAttestor", f = "HatchRegistrationAttestor.kt", l = {232}, m = "finishRequest", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$finishRequest$1, reason: invalid class name and case insensitive filesystem */
    public final class C125091 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C125091(HtJ<? super C125091> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchRegistrationAttestor.this.finishRequest(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchRegistrationAttestor", f = "HatchRegistrationAttestor.kt", l = {232}, m = "restartRotation", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$restartRotation$1, reason: invalid class name and case insensitive filesystem */
    public final class C125101 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C125101(HtJ<? super C125101> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchRegistrationAttestor.this.restartRotation(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchRegistrationAttestor", f = "HatchRegistrationAttestor.kt", l = {232, 145, 149, 154}, m = "rotationFor", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$rotationFor$1, reason: invalid class name and case insensitive filesystem */
    public final class C125111 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C125111(HtJ<? super C125111> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchRegistrationAttestor.this.rotationFor(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object activateRequest(com.facebook.aura.login.nativeflow.HatchAttestationRequest r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.AnonymousClass1
            if (r0 == 0) goto L2a
            r5 = r8
            com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$activateRequest$1 r5 = (com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L35
            if (r1 != r0) goto L30
            java.lang.Object r1 = r5.L$1
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            java.lang.Object r7 = r5.L$0
            com.facebook.aura.login.nativeflow.HatchAttestationRequest r7 = (com.facebook.aura.login.nativeflow.HatchAttestationRequest) r7
            X.Hwg.A00(r4)
            goto L47
        L2a:
            com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$activateRequest$1 r5 = new com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$activateRequest$1
            r5.<init>(r8)
            goto L12
        L30:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L35:
            X.Hwg.A00(r4)
            X.BLa r1 = com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.rotationMutex
            r5.L$0 = r7
            r5.L$1 = r1
            r5.label = r0
            java.lang.Object r0 = r1.APs(r2, r5)
            if (r0 != r3) goto L47
            return r3
        L47:
            com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.activeRequest = r7     // Catch: java.lang.Throwable -> L59
            com.facebook.aura.login.nativeflow.HatchAttestationRequest r0 = com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.queuedRequest     // Catch: java.lang.Throwable -> L59
            boolean r0 = X.C7384Etj.areEqual(r0, r7)     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L53
            com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.queuedRequest = r2     // Catch: java.lang.Throwable -> L59
        L53:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L59
            r1.Ahe(r2)
            return r3
        L59:
            r0 = move-exception
            r1.Ahe(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.activateRequest(com.facebook.aura.login.nativeflow.HatchAttestationRequest, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[PHI: r5
  0x005b: PHI (r5v2 java.util.List<java.lang.String>) = (r5v1 java.util.List<java.lang.String>), (r5v3 java.util.List<java.lang.String>) binds: [B:17:0x0051, B:19:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object attestOrReport(com.facebook.aura.login.nativeflow.HatchAttestationRequest r15, java.lang.String r16, X.HtJ<? super com.facebook.aura.login.nativeflow.AuthRegistrationAttestationJson> r17) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.attestOrReport(com.facebook.aura.login.nativeflow.HatchAttestationRequest, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object finishRequest(com.facebook.aura.login.nativeflow.HatchAttestationRequest r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.C125091
            if (r0 == 0) goto L28
            r6 = r9
            com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$finishRequest$1 r6 = (com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.C125091) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r0 = 1
            r3 = 0
            if (r1 == 0) goto L33
            if (r1 != r0) goto L2e
            java.lang.Object r2 = r6.L$1
            X.BLa r2 = (X.InterfaceC2261BLa) r2
            java.lang.Object r8 = r6.L$0
            X.Hwg.A00(r5)
            goto L45
        L28:
            com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$finishRequest$1 r6 = new com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$finishRequest$1
            r6.<init>(r9)
            goto L12
        L2e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L33:
            X.Hwg.A00(r5)
            X.BLa r2 = com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.rotationMutex
            r6.L$0 = r8
            r6.L$1 = r2
            r6.label = r0
            java.lang.Object r0 = r2.APs(r3, r6)
            if (r0 != r4) goto L45
            return r4
        L45:
            com.facebook.aura.login.nativeflow.HatchAttestationRequest r0 = com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.activeRequest     // Catch: java.lang.Throwable -> L77
            boolean r0 = X.C7384Etj.areEqual(r0, r8)     // Catch: java.lang.Throwable -> L77
            if (r0 == 0) goto L4f
            com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.activeRequest = r3     // Catch: java.lang.Throwable -> L77
        L4f:
            com.facebook.aura.login.nativeflow.HatchAttestationRequest r1 = com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.queuedRequest     // Catch: java.lang.Throwable -> L77
            com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.queuedRequest = r3     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L6e
            java.util.concurrent.atomic.AtomicReference<X.HxE<com.facebook.aura.login.nativeflow.HatchAttestationRequest, com.google.common.util.concurrent.ListenableFuture<X.EF7>>> r0 = com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.currentRotation     // Catch: java.lang.Throwable -> L77
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L77
            X.HxE r0 = (X.HxE) r0     // Catch: java.lang.Throwable -> L77
            if (r0 == 0) goto L71
            A r0 = r0.first     // Catch: java.lang.Throwable -> L77
            com.facebook.aura.login.nativeflow.HatchAttestationRequest r0 = (com.facebook.aura.login.nativeflow.HatchAttestationRequest) r0     // Catch: java.lang.Throwable -> L77
        L63:
            boolean r0 = X.C7384Etj.areEqual(r0, r1)     // Catch: java.lang.Throwable -> L77
            if (r0 != 0) goto L6e
            com.facebook.aura.login.nativeflow.HatchRegistrationAttestor r0 = com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.INSTANCE     // Catch: java.lang.Throwable -> L77
            r0.startRotationLocked(r1)     // Catch: java.lang.Throwable -> L77
        L6e:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L77
            goto L73
        L71:
            r0 = r3
            goto L63
        L73:
            r2.Ahe(r3)
            return r4
        L77:
            r0 = move-exception
            r2.Ahe(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.finishRequest(com.facebook.aura.login.nativeflow.HatchAttestationRequest, X.HtJ):java.lang.Object");
    }

    private final C3432CNc getOperations() {
        return (C3432CNc) operations$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object restartRotation(com.facebook.aura.login.nativeflow.HatchAttestationRequest r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.C125101
            if (r0 == 0) goto L2a
            r6 = r9
            com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$restartRotation$1 r6 = (com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.C125101) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r0 = 1
            r3 = 0
            if (r1 == 0) goto L35
            if (r1 != r0) goto L30
            java.lang.Object r2 = r6.L$1
            X.BLa r2 = (X.InterfaceC2261BLa) r2
            java.lang.Object r8 = r6.L$0
            com.facebook.aura.login.nativeflow.HatchAttestationRequest r8 = (com.facebook.aura.login.nativeflow.HatchAttestationRequest) r8
            X.Hwg.A00(r5)
            goto L47
        L2a:
            com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$restartRotation$1 r6 = new com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$restartRotation$1
            r6.<init>(r9)
            goto L12
        L30:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L35:
            X.Hwg.A00(r5)
            X.BLa r2 = com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.rotationMutex
            r6.L$0 = r8
            r6.L$1 = r2
            r6.label = r0
            java.lang.Object r0 = r2.APs(r3, r6)
            if (r0 != r4) goto L47
            return r4
        L47:
            java.util.concurrent.atomic.AtomicReference<X.HxE<com.facebook.aura.login.nativeflow.HatchAttestationRequest, com.google.common.util.concurrent.ListenableFuture<X.EF7>>> r1 = com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.currentRotation     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r0 = r1.get()     // Catch: java.lang.Throwable -> L6c
            X.HxE r0 = (X.HxE) r0     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L66
            A r0 = r0.first     // Catch: java.lang.Throwable -> L6c
            com.facebook.aura.login.nativeflow.HatchAttestationRequest r0 = (com.facebook.aura.login.nativeflow.HatchAttestationRequest) r0     // Catch: java.lang.Throwable -> L6c
        L55:
            boolean r0 = X.C7384Etj.areEqual(r0, r8)     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L63
            r1.set(r3)     // Catch: java.lang.Throwable -> L6c
            com.facebook.aura.login.nativeflow.HatchRegistrationAttestor r0 = com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.INSTANCE     // Catch: java.lang.Throwable -> L6c
            r0.startRotationLocked(r8)     // Catch: java.lang.Throwable -> L6c
        L63:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L6c
            goto L68
        L66:
            r0 = r3
            goto L55
        L68:
            r2.Ahe(r3)
            return r4
        L6c:
            r0 = move-exception
            r2.Ahe(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.restartRotation(com.facebook.aura.login.nativeflow.HatchAttestationRequest, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object rotationFor(com.facebook.aura.login.nativeflow.HatchAttestationRequest r12, X.HtJ<? super X.EF7> r13) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.rotationFor(com.facebook.aura.login.nativeflow.HatchAttestationRequest, X.HtJ):java.lang.Object");
    }

    private final HxE<HatchAttestationRequest, ListenableFuture<EF7>> startRotation(HatchAttestationRequest hatchAttestationRequest) {
        C3432CNc c3432CNc = (C3432CNc) operations$delegate.getValue();
        EFE efe = new EFE();
        byte[] bArrA1S = C3cG.A1S(hatchAttestationRequest.challenge);
        return C3cG.A0r(hatchAttestationRequest, C3432CNc.A00(c3432CNc, C3432CNc.A03, new EDo(c3432CNc, efe, new EFP(RegularImmutableSet.A05), bArrA1S, 0), new EY5(14)));
    }

    private final void startRotationLocked(HatchAttestationRequest hatchAttestationRequest) {
        try {
            currentRotation.set(startRotation(hatchAttestationRequest));
        } catch (Exception e) {
            CFK.A08(HatchRegistrationAttestorKt.TAG, "Failed to start registration attestation key rotation", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object attest(com.facebook.aura.login.nativeflow.HatchAttestationRequest r7, java.lang.String r8, X.HtJ<? super com.facebook.aura.login.nativeflow.AuthRegistrationAttestationJson> r9) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.C125061
            if (r0 == 0) goto L1e
            r5 = r9
            com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$attest$1 r5 = (com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.C125061) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L24
            if (r0 != r4) goto L79
            goto L56
        L1e:
            com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$attest$1 r5 = new com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$attest$1
            r5.<init>(r9)
            goto L12
        L24:
            X.Hwg.A00(r1)
            java.lang.String r1 = r7.keyAlias
            java.lang.String r0 = "w6CmevIyM/PL6Q5uUDw="
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            X.F0C<X.9hr<java.lang.Object>>[] r0 = com.facebook.aura.login.nativeflow.AuthRegistrationAttestationJson.$childSerializers
            java.lang.String r0 = "INVALID_KEY_ALIAS"
        L36:
            java.util.List r1 = java.util.Collections.singletonList(r0)
            r0 = 0
            com.facebook.aura.login.nativeflow.AuthRegistrationAttestationJson r3 = new com.facebook.aura.login.nativeflow.AuthRegistrationAttestationJson
            r3.<init>(r0, r0, r1)
        L40:
            return r3
        L41:
            r0 = 0
            com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$attest$2 r2 = new com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$attest$2     // Catch: java.lang.Exception -> L6d
            r2.<init>(r7, r8, r0)     // Catch: java.lang.Exception -> L6d
            r5.L$0 = r0     // Catch: java.lang.Exception -> L6d
            r5.L$1 = r0     // Catch: java.lang.Exception -> L6d
            r5.label = r4     // Catch: java.lang.Exception -> L6d
            r0 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r1 = X.GAX.A01(r5, r2, r0)     // Catch: java.lang.Exception -> L6d
            if (r1 != r3) goto L59
            goto L77
        L56:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L6d
        L59:
            r3 = r1
            com.facebook.aura.login.nativeflow.AuthRegistrationAttestationJson r3 = (com.facebook.aura.login.nativeflow.AuthRegistrationAttestationJson) r3     // Catch: java.lang.Exception -> L6d
            if (r3 != 0) goto L40
            X.F0C<X.9hr<java.lang.Object>>[] r0 = com.facebook.aura.login.nativeflow.AuthRegistrationAttestationJson.$childSerializers     // Catch: java.lang.Exception -> L6d
            java.lang.String r0 = "OPERATION_TIMED_OUT"
            java.util.List r1 = java.util.Collections.singletonList(r0)     // Catch: java.lang.Exception -> L6d
            r0 = 0
            com.facebook.aura.login.nativeflow.AuthRegistrationAttestationJson r3 = new com.facebook.aura.login.nativeflow.AuthRegistrationAttestationJson     // Catch: java.lang.Exception -> L6d
            r3.<init>(r0, r0, r1)     // Catch: java.lang.Exception -> L6d
            goto L78
        L6d:
            r1 = move-exception
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L7d
            X.F0C<X.9hr<java.lang.Object>>[] r0 = com.facebook.aura.login.nativeflow.AuthRegistrationAttestationJson.$childSerializers
            java.lang.String r0 = "UNEXPECTED_EXCEPTION"
            goto L36
        L77:
            return r3
        L78:
            return r3
        L79:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
        L7d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.attest(com.facebook.aura.login.nativeflow.HatchAttestationRequest, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object begin(com.facebook.aura.login.nativeflow.HatchAttestationRequest r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.C125081
            if (r0 == 0) goto L2a
            r6 = r9
            com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$begin$1 r6 = (com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.C125081) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r3 = 1
            r1 = 0
            if (r0 == 0) goto L35
            if (r0 != r3) goto L30
            java.lang.Object r2 = r6.L$1
            X.BLa r2 = (X.InterfaceC2261BLa) r2
            java.lang.Object r8 = r6.L$0
            com.facebook.aura.login.nativeflow.HatchAttestationRequest r8 = (com.facebook.aura.login.nativeflow.HatchAttestationRequest) r8
            X.Hwg.A00(r5)
            goto L55
        L2a:
            com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$begin$1 r6 = new com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$begin$1
            r6.<init>(r9)
            goto L12
        L30:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L35:
            X.Hwg.A00(r5)
            java.lang.String r2 = r8.keyAlias
            java.lang.String r0 = "w6CmevIyM/PL6Q5uUDw="
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L46
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L46:
            X.BLa r2 = com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.rotationMutex
            r6.L$0 = r8
            r6.L$1 = r2
            r6.label = r3
            java.lang.Object r0 = r2.APs(r1, r6)
            if (r0 != r4) goto L55
            return r4
        L55:
            java.util.concurrent.atomic.AtomicReference<X.HxE<com.facebook.aura.login.nativeflow.HatchAttestationRequest, com.google.common.util.concurrent.ListenableFuture<X.EF7>>> r0 = com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.currentRotation     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L8f
            X.HxE r0 = (X.HxE) r0     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L6c
            A r0 = r0.first     // Catch: java.lang.Throwable -> L8f
            com.facebook.aura.login.nativeflow.HatchAttestationRequest r0 = (com.facebook.aura.login.nativeflow.HatchAttestationRequest) r0     // Catch: java.lang.Throwable -> L8f
        L63:
            boolean r0 = X.C7384Etj.areEqual(r0, r8)     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L72
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L8f
            goto L6e
        L6c:
            r0 = r1
            goto L63
        L6e:
            r2.Ahe(r1)
            return r0
        L72:
            com.facebook.aura.login.nativeflow.HatchAttestationRequest r0 = com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.activeRequest     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L84
            boolean r0 = r0.equals(r8)     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L84
            com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.queuedRequest = r8     // Catch: java.lang.Throwable -> L8f
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L8f
            r2.Ahe(r1)
            return r0
        L84:
            com.facebook.aura.login.nativeflow.HatchRegistrationAttestor r0 = com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.INSTANCE     // Catch: java.lang.Throwable -> L8f
            r0.startRotationLocked(r8)     // Catch: java.lang.Throwable -> L8f
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L8f
            r2.Ahe(r1)
            return r0
        L8f:
            r0 = move-exception
            r2.Ahe(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.begin(com.facebook.aura.login.nativeflow.HatchAttestationRequest, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object awaitResult(ListenableFuture<T> listenableFuture, HtJ<? super T> htJ) {
        final GBL gblA03 = C7Bm.A03(htJ);
        CQD.A01(new CQG<T>() { // from class: com.facebook.aura.login.nativeflow.HatchRegistrationAttestor$awaitResult$2$1
            @Override // X.CQG
            public void onFailure(Throwable th) {
                C7384Etj.A0Y(th, 0);
                BV7.A1K(th, gblA03);
            }

            @Override // X.CQG
            public void onSuccess(T t) {
                gblA03.resumeWith(t);
            }
        }, listenableFuture, EnumC3451CNw.A01);
        return gblA03.A0F();
    }

    private final List<String> codes(List<EEy> list) {
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<EEy> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(EFA.A00(it.next().A04));
        }
        return arrayListA0i;
    }
}
