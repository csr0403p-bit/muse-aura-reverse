package com.facebook.aura.login.nativeflow;

import X.EnumC10460Hji;
import X.HsJ;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public abstract class HatchAuthApiKt {
    public static final int MAX_SSO_ACCOUNT_INFO_ENTRIES = 10;

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchAuthApiKt", f = "HatchAuthApi.kt", l = {899}, m = "beginRegistrationAttestation", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.HatchAuthApiKt$beginRegistrationAttestation$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objBeginRegistrationAttestation = HatchAuthApiKt.beginRegistrationAttestation(null, this);
            return objBeginRegistrationAttestation != EnumC10460Hji.A02 ? new HsJ(objBeginRegistrationAttestation) : objBeginRegistrationAttestation;
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object beginRegistrationAttestation(java.lang.Object r6, X.HtJ<? super X.HsJ<com.facebook.aura.login.nativeflow.HatchAuthCredentials>> r7) {
        /*
            boolean r0 = r7 instanceof com.facebook.aura.login.nativeflow.HatchAuthApiKt.AnonymousClass1
            if (r0 == 0) goto L47
            r5 = r7
            com.facebook.aura.login.nativeflow.HatchAuthApiKt$beginRegistrationAttestation$1 r5 = (com.facebook.aura.login.nativeflow.HatchAuthApiKt.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L4d
            java.lang.Object r6 = r5.L$1
            X.Hwg.A00(r1)
        L22:
            return r6
        L23:
            X.Hwg.A00(r1)
            boolean r0 = r6 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L22
            r0 = r6
            com.facebook.aura.login.nativeflow.HatchAuthCredentials r0 = (com.facebook.aura.login.nativeflow.HatchAuthCredentials) r0
            com.facebook.aura.login.nativeflow.HatchAttestationRequest r2 = r0.attestationRequest
            if (r2 == 0) goto L22
            com.facebook.aura.login.nativeflow.HatchRegistrationAttestor r1 = com.facebook.aura.login.nativeflow.HatchRegistrationAttestor.INSTANCE
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r6
            r5.L$2 = r0
            r5.L$3 = r0
            r5.label = r3
            java.lang.Object r0 = r1.begin(r2, r5)
            if (r0 != r4) goto L22
            return r4
        L47:
            com.facebook.aura.login.nativeflow.HatchAuthApiKt$beginRegistrationAttestation$1 r5 = new com.facebook.aura.login.nativeflow.HatchAuthApiKt$beginRegistrationAttestation$1
            r5.<init>(r7)
            goto L12
        L4d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApiKt.beginRegistrationAttestation(java.lang.Object, X.HtJ):java.lang.Object");
    }
}
