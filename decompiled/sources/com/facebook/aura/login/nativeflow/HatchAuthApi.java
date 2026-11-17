package com.facebook.aura.login.nativeflow;

import X.HtJ;
import com.facebook.aura.analytics.hatch.authflow.HatchAuthFlowContext;
import com.facebook.aura.common.identifiers.AuraDeviceId;
import java.util.List;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class HatchAuthApi {
    public static final HatchAuthApi INSTANCE = new HatchAuthApi();

    /* JADX INFO: Access modifiers changed from: private */
    public final String deviceId() {
        return AuraDeviceId.INSTANCE.get().toUpperCase(Locale.ROOT);
    }

    /* renamed from: sendOtp-bMdYcbs$default, reason: not valid java name */
    public static /* synthetic */ Object m1246sendOtpbMdYcbs$default(HatchAuthApi hatchAuthApi, String str, String str2, String str3, String str4, String str5, boolean z, HtJ htJ, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        return hatchAuthApi.m1264sendOtpbMdYcbs(str, str2, str3, str4, str5, z, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ssoAccountPickerInfo-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ Object m1247ssoAccountPickerInfoyxL6bBk$default(HatchAuthApi hatchAuthApi, List list, String str, String str2, List list2, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            list2 = null;
        }
        return hatchAuthApi.m1266ssoAccountPickerInfoyxL6bBk(list, str, str2, list2, htJ);
    }

    /* renamed from: ssoExchange-tZkwj4A$default, reason: not valid java name */
    public static /* synthetic */ Object m1248ssoExchangetZkwj4A$default(HatchAuthApi hatchAuthApi, String str, HatchSsoSourceApp hatchSsoSourceApp, String str2, String str3, String str4, String str5, String str6, boolean z, HtJ htJ, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            str6 = null;
        }
        if ((i & 128) != 0) {
            z = false;
        }
        return hatchAuthApi.m1267ssoExchangetZkwj4A(str, hatchSsoSourceApp, str2, str3, str4, str5, str6, z, htJ);
    }

    /* renamed from: start-gIAlu-s$default, reason: not valid java name */
    public static /* synthetic */ Object m1249startgIAlus$default(HatchAuthApi hatchAuthApi, String str, HtJ htJ, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return hatchAuthApi.m1268startgIAlus(str, htJ);
    }

    private final String waterfallId() {
        return HatchAuthFlowContext.INSTANCE.snapshot().waterfallId;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* renamed from: cancelDeletion-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1250cancelDeletion0E7RQCE(java.lang.String r7, java.lang.String r8, X.HtJ<? super X.HsJ<com.facebook.aura.login.nativeflow.HatchAuthCredentials>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.login.nativeflow.HatchAuthApi$cancelDeletion$1
            if (r0 == 0) goto L3c
            r5 = r9
            com.facebook.aura.login.nativeflow.HatchAuthApi$cancelDeletion$1 r5 = (com.facebook.aura.login.nativeflow.HatchAuthApi$cancelDeletion$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3c
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L42
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.login.nativeflow.HatchAuthApi$cancelDeletion$2 r0 = new com.facebook.aura.login.nativeflow.HatchAuthApi$cancelDeletion$2
            r0.<init>(r8, r7, r1)
            r5.L$0 = r1
            r5.L$1 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3c:
            com.facebook.aura.login.nativeflow.HatchAuthApi$cancelDeletion$1 r5 = new com.facebook.aura.login.nativeflow.HatchAuthApi$cancelDeletion$1
            r5.<init>(r6, r9)
            goto L12
        L42:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi.m1250cancelDeletion0E7RQCE(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* renamed from: confirmOtp-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1251confirmOtpBWLJW6A(java.lang.String r7, java.lang.String r8, java.lang.String r9, X.HtJ<? super X.HsJ<com.facebook.aura.login.nativeflow.HatchAuthCredentials>> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.login.nativeflow.HatchAuthApi$confirmOtp$1
            if (r0 == 0) goto L3e
            r5 = r10
            com.facebook.aura.login.nativeflow.HatchAuthApi$confirmOtp$1 r5 = (com.facebook.aura.login.nativeflow.HatchAuthApi$confirmOtp$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L44
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.login.nativeflow.HatchAuthApi$confirmOtp$2 r0 = new com.facebook.aura.login.nativeflow.HatchAuthApi$confirmOtp$2
            r0.<init>(r8, r9, r7, r1)
            r5.L$0 = r1
            r5.L$1 = r1
            r5.L$2 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3e:
            com.facebook.aura.login.nativeflow.HatchAuthApi$confirmOtp$1 r5 = new com.facebook.aura.login.nativeflow.HatchAuthApi$confirmOtp$1
            r5.<init>(r6, r10)
            goto L12
        L44:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi.m1251confirmOtpBWLJW6A(java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* renamed from: confirmPasskey-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1252confirmPasskeyBWLJW6A(java.lang.String r7, java.lang.String r8, java.lang.String r9, X.HtJ<? super X.HsJ<com.facebook.aura.login.nativeflow.HatchAuthCredentials>> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.login.nativeflow.HatchAuthApi$confirmPasskey$1
            if (r0 == 0) goto L3e
            r5 = r10
            com.facebook.aura.login.nativeflow.HatchAuthApi$confirmPasskey$1 r5 = (com.facebook.aura.login.nativeflow.HatchAuthApi$confirmPasskey$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L44
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.login.nativeflow.HatchAuthApi$confirmPasskey$2 r0 = new com.facebook.aura.login.nativeflow.HatchAuthApi$confirmPasskey$2
            r0.<init>(r8, r9, r7, r1)
            r5.L$0 = r1
            r5.L$1 = r1
            r5.L$2 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3e:
            com.facebook.aura.login.nativeflow.HatchAuthApi$confirmPasskey$1 r5 = new com.facebook.aura.login.nativeflow.HatchAuthApi$confirmPasskey$1
            r5.<init>(r6, r10)
            goto L12
        L44:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi.m1252confirmPasskeyBWLJW6A(java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* renamed from: confirmPassword-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1253confirmPasswordBWLJW6A(java.lang.String r7, java.lang.String r8, java.lang.String r9, X.HtJ<? super X.HsJ<com.facebook.aura.login.nativeflow.HatchAuthCredentials>> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.login.nativeflow.HatchAuthApi$confirmPassword$1
            if (r0 == 0) goto L3e
            r5 = r10
            com.facebook.aura.login.nativeflow.HatchAuthApi$confirmPassword$1 r5 = (com.facebook.aura.login.nativeflow.HatchAuthApi$confirmPassword$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L44
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.login.nativeflow.HatchAuthApi$confirmPassword$2 r0 = new com.facebook.aura.login.nativeflow.HatchAuthApi$confirmPassword$2
            r0.<init>(r8, r9, r7, r1)
            r5.L$0 = r1
            r5.L$1 = r1
            r5.L$2 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3e:
            com.facebook.aura.login.nativeflow.HatchAuthApi$confirmPassword$1 r5 = new com.facebook.aura.login.nativeflow.HatchAuthApi$confirmPassword$1
            r5.<init>(r6, r10)
            goto L12
        L44:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi.m1253confirmPasswordBWLJW6A(java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* renamed from: dblLogin-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1254dblLoginyxL6bBk(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, X.HtJ<? super X.HsJ<com.facebook.aura.login.nativeflow.HatchAuthCredentials>> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof com.facebook.aura.login.nativeflow.HatchAuthApi$dblLogin$1
            if (r0 == 0) goto L44
            r4 = r15
            com.facebook.aura.login.nativeflow.HatchAuthApi$dblLogin$1 r4 = (com.facebook.aura.login.nativeflow.HatchAuthApi$dblLogin$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L25
            if (r0 != r1) goto L4a
            X.Hwg.A00(r3)
        L20:
            X.HsJ r3 = (X.HsJ) r3
            java.lang.Object r0 = r3.value
            return r0
        L25:
            X.78T r0 = X.AnonymousClass002.A0s(r3)
            r10 = 0
            com.facebook.aura.login.nativeflow.HatchAuthApi$dblLogin$2 r5 = new com.facebook.aura.login.nativeflow.HatchAuthApi$dblLogin$2
            r9 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r4.L$0 = r10
            r4.L$1 = r10
            r4.L$2 = r10
            r4.L$3 = r10
            r4.label = r1
            java.lang.Object r3 = X.GAo.A00(r4, r0, r5)
            if (r3 != r2) goto L20
            return r2
        L44:
            com.facebook.aura.login.nativeflow.HatchAuthApi$dblLogin$1 r4 = new com.facebook.aura.login.nativeflow.HatchAuthApi$dblLogin$1
            r4.<init>(r10, r15)
            goto L12
        L4a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi.m1254dblLoginyxL6bBk(java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* renamed from: dblProvision-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1255dblProvisionBWLJW6A(java.lang.String r7, java.lang.String r8, java.lang.String r9, X.HtJ<? super X.HsJ<com.facebook.aura.login.nativeflow.HatchDblProvision>> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.login.nativeflow.HatchAuthApi$dblProvision$1
            if (r0 == 0) goto L3e
            r5 = r10
            com.facebook.aura.login.nativeflow.HatchAuthApi$dblProvision$1 r5 = (com.facebook.aura.login.nativeflow.HatchAuthApi$dblProvision$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L44
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.login.nativeflow.HatchAuthApi$dblProvision$2 r0 = new com.facebook.aura.login.nativeflow.HatchAuthApi$dblProvision$2
            r0.<init>(r8, r9, r7, r1)
            r5.L$0 = r1
            r5.L$1 = r1
            r5.L$2 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3e:
            com.facebook.aura.login.nativeflow.HatchAuthApi$dblProvision$1 r5 = new com.facebook.aura.login.nativeflow.HatchAuthApi$dblProvision$1
            r5.<init>(r6, r10)
            goto L12
        L44:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi.m1255dblProvisionBWLJW6A(java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* renamed from: loginOptions-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1256loginOptionsgIAlus(java.lang.String r7, X.HtJ<? super X.HsJ<com.facebook.aura.login.nativeflow.HatchAuthLoginOptions>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.login.nativeflow.HatchAuthApi$loginOptions$1
            if (r0 == 0) goto L3a
            r5 = r8
            com.facebook.aura.login.nativeflow.HatchAuthApi$loginOptions$1 r5 = (com.facebook.aura.login.nativeflow.HatchAuthApi$loginOptions$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L40
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.login.nativeflow.HatchAuthApi$loginOptions$2 r0 = new com.facebook.aura.login.nativeflow.HatchAuthApi$loginOptions$2
            r0.<init>(r7, r1)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3a:
            com.facebook.aura.login.nativeflow.HatchAuthApi$loginOptions$1 r5 = new com.facebook.aura.login.nativeflow.HatchAuthApi$loginOptions$1
            r5.<init>(r6, r8)
            goto L12
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi.m1256loginOptionsgIAlus(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* renamed from: registerCompletion-5p_uFSQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1257registerCompletion5p_uFSQ(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, com.facebook.aura.login.nativeflow.HatchAttestationRequest r24, X.HtJ<? super X.HsJ<com.facebook.aura.login.nativeflow.HatchAuthCredentials>> r25) {
        /*
            r14 = this;
            r3 = r25
            boolean r0 = r3 instanceof com.facebook.aura.login.nativeflow.HatchAuthApi$registerCompletion$1
            if (r0 == 0) goto L62
            r4 = r3
            com.facebook.aura.login.nativeflow.HatchAuthApi$registerCompletion$1 r4 = (com.facebook.aura.login.nativeflow.HatchAuthApi$registerCompletion$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L62
            int r2 = r2 - r1
            r4.label = r2
        L14:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L27
            if (r0 != r2) goto L68
            X.Hwg.A00(r1)
        L22:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L27:
            X.78T r1 = X.AnonymousClass002.A0s(r1)
            r0 = 0
            com.facebook.aura.login.nativeflow.HatchAuthApi$registerCompletion$2 r5 = new com.facebook.aura.login.nativeflow.HatchAuthApi$registerCompletion$2
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            r14 = r23
            r6 = r24
            r16 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4.L$0 = r0
            r4.L$1 = r0
            r4.L$2 = r0
            r4.L$3 = r0
            r4.L$4 = r0
            r4.L$5 = r0
            r4.L$6 = r0
            r4.L$7 = r0
            r4.L$8 = r0
            r4.L$9 = r0
            r4.label = r2
            java.lang.Object r1 = X.GAo.A00(r4, r1, r5)
            if (r1 != r3) goto L22
            return r3
        L62:
            com.facebook.aura.login.nativeflow.HatchAuthApi$registerCompletion$1 r4 = new com.facebook.aura.login.nativeflow.HatchAuthApi$registerCompletion$1
            r4.<init>(r14, r3)
            goto L14
        L68:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi.m1257registerCompletion5p_uFSQ(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.facebook.aura.login.nativeflow.HatchAttestationRequest, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* renamed from: registerCompletionLinked-tZkwj4A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1258registerCompletionLinkedtZkwj4A(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20, java.lang.String r21, com.facebook.aura.login.nativeflow.HatchAttestationRequest r22, X.HtJ<? super X.HsJ<com.facebook.aura.login.nativeflow.HatchAuthCredentials>> r23) {
        /*
            r14 = this;
            r3 = r23
            boolean r0 = r3 instanceof com.facebook.aura.login.nativeflow.HatchAuthApi$registerCompletionLinked$1
            if (r0 == 0) goto L59
            r4 = r3
            com.facebook.aura.login.nativeflow.HatchAuthApi$registerCompletionLinked$1 r4 = (com.facebook.aura.login.nativeflow.HatchAuthApi$registerCompletionLinked$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r4.label = r2
        L14:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 != r1) goto L5f
            X.Hwg.A00(r3)
        L22:
            X.HsJ r3 = (X.HsJ) r3
            java.lang.Object r0 = r3.value
            return r0
        L27:
            X.78T r0 = X.AnonymousClass002.A0s(r3)
            r14 = 0
            com.facebook.aura.login.nativeflow.HatchAuthApi$registerCompletionLinked$2 r5 = new com.facebook.aura.login.nativeflow.HatchAuthApi$registerCompletionLinked$2
            r13 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r6 = r22
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r4.L$0 = r14
            r4.L$1 = r14
            r4.L$2 = r14
            r4.L$3 = r14
            r4.L$4 = r14
            r4.L$5 = r14
            r4.L$6 = r14
            r4.Z$0 = r11
            r4.label = r1
            java.lang.Object r3 = X.GAo.A00(r4, r0, r5)
            if (r3 != r2) goto L22
            return r2
        L59:
            com.facebook.aura.login.nativeflow.HatchAuthApi$registerCompletionLinked$1 r4 = new com.facebook.aura.login.nativeflow.HatchAuthApi$registerCompletionLinked$1
            r4.<init>(r14, r3)
            goto L14
        L5f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi.m1258registerCompletionLinkedtZkwj4A(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, com.facebook.aura.login.nativeflow.HatchAttestationRequest, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* renamed from: removeCrossAppAccount-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1259removeCrossAppAccountyxL6bBk(java.lang.String r11, com.facebook.aura.login.nativeflow.HatchSsoSourceApp r12, java.lang.String r13, java.lang.String r14, X.HtJ<? super X.HsJ<java.lang.String>> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof com.facebook.aura.login.nativeflow.HatchAuthApi$removeCrossAppAccount$1
            if (r0 == 0) goto L44
            r4 = r15
            com.facebook.aura.login.nativeflow.HatchAuthApi$removeCrossAppAccount$1 r4 = (com.facebook.aura.login.nativeflow.HatchAuthApi$removeCrossAppAccount$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L25
            if (r0 != r1) goto L4a
            X.Hwg.A00(r3)
        L20:
            X.HsJ r3 = (X.HsJ) r3
            java.lang.Object r0 = r3.value
            return r0
        L25:
            X.78T r0 = X.AnonymousClass002.A0s(r3)
            r10 = 0
            com.facebook.aura.login.nativeflow.HatchAuthApi$removeCrossAppAccount$2 r5 = new com.facebook.aura.login.nativeflow.HatchAuthApi$removeCrossAppAccount$2
            r9 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r4.L$0 = r10
            r4.L$1 = r10
            r4.L$2 = r10
            r4.L$3 = r10
            r4.label = r1
            java.lang.Object r3 = X.GAo.A00(r4, r0, r5)
            if (r3 != r2) goto L20
            return r2
        L44:
            com.facebook.aura.login.nativeflow.HatchAuthApi$removeCrossAppAccount$1 r4 = new com.facebook.aura.login.nativeflow.HatchAuthApi$removeCrossAppAccount$1
            r4.<init>(r10, r15)
            goto L12
        L4a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi.m1259removeCrossAppAccountyxL6bBk(java.lang.String, com.facebook.aura.login.nativeflow.HatchSsoSourceApp, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* renamed from: removeSavedAccount-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1260removeSavedAccountBWLJW6A(java.lang.String r7, java.lang.String r8, java.lang.String r9, X.HtJ<? super X.HsJ<kotlin.Unit>> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.login.nativeflow.HatchAuthApi$removeSavedAccount$1
            if (r0 == 0) goto L3e
            r5 = r10
            com.facebook.aura.login.nativeflow.HatchAuthApi$removeSavedAccount$1 r5 = (com.facebook.aura.login.nativeflow.HatchAuthApi$removeSavedAccount$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L44
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.login.nativeflow.HatchAuthApi$removeSavedAccount$2 r0 = new com.facebook.aura.login.nativeflow.HatchAuthApi$removeSavedAccount$2
            r0.<init>(r8, r9, r7, r1)
            r5.L$0 = r1
            r5.L$1 = r1
            r5.L$2 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3e:
            com.facebook.aura.login.nativeflow.HatchAuthApi$removeSavedAccount$1 r5 = new com.facebook.aura.login.nativeflow.HatchAuthApi$removeSavedAccount$1
            r5.<init>(r6, r10)
            goto L12
        L44:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi.m1260removeSavedAccountBWLJW6A(java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* renamed from: saveAccount-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1261saveAccountBWLJW6A(java.lang.String r7, java.lang.String r8, java.lang.String r9, X.HtJ<? super X.HsJ<java.lang.String>> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.login.nativeflow.HatchAuthApi$saveAccount$1
            if (r0 == 0) goto L3e
            r5 = r10
            com.facebook.aura.login.nativeflow.HatchAuthApi$saveAccount$1 r5 = (com.facebook.aura.login.nativeflow.HatchAuthApi$saveAccount$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L44
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.login.nativeflow.HatchAuthApi$saveAccount$2 r0 = new com.facebook.aura.login.nativeflow.HatchAuthApi$saveAccount$2
            r0.<init>(r8, r9, r7, r1)
            r5.L$0 = r1
            r5.L$1 = r1
            r5.L$2 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3e:
            com.facebook.aura.login.nativeflow.HatchAuthApi$saveAccount$1 r5 = new com.facebook.aura.login.nativeflow.HatchAuthApi$saveAccount$1
            r5.<init>(r6, r10)
            goto L12
        L44:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi.m1261saveAccountBWLJW6A(java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* renamed from: savedAccounts-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1262savedAccounts0E7RQCE(java.lang.String r7, java.lang.String r8, X.HtJ<? super X.HsJ<? extends java.util.List<com.facebook.aura.login.nativeflow.HatchSavedAccount>>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.login.nativeflow.HatchAuthApi$savedAccounts$1
            if (r0 == 0) goto L3c
            r5 = r9
            com.facebook.aura.login.nativeflow.HatchAuthApi$savedAccounts$1 r5 = (com.facebook.aura.login.nativeflow.HatchAuthApi$savedAccounts$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3c
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L42
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.login.nativeflow.HatchAuthApi$savedAccounts$2 r0 = new com.facebook.aura.login.nativeflow.HatchAuthApi$savedAccounts$2
            r0.<init>(r8, r7, r1)
            r5.L$0 = r1
            r5.L$1 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3c:
            com.facebook.aura.login.nativeflow.HatchAuthApi$savedAccounts$1 r5 = new com.facebook.aura.login.nativeflow.HatchAuthApi$savedAccounts$1
            r5.<init>(r6, r9)
            goto L12
        L42:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi.m1262savedAccounts0E7RQCE(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* renamed from: selectAccount-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1263selectAccountBWLJW6A(java.lang.String r7, java.lang.String r8, java.lang.String r9, X.HtJ<? super X.HsJ<com.facebook.aura.login.nativeflow.HatchAuthCredentials>> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.login.nativeflow.HatchAuthApi$selectAccount$1
            if (r0 == 0) goto L3e
            r5 = r10
            com.facebook.aura.login.nativeflow.HatchAuthApi$selectAccount$1 r5 = (com.facebook.aura.login.nativeflow.HatchAuthApi$selectAccount$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L44
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.login.nativeflow.HatchAuthApi$selectAccount$2 r0 = new com.facebook.aura.login.nativeflow.HatchAuthApi$selectAccount$2
            r0.<init>(r8, r9, r7, r1)
            r5.L$0 = r1
            r5.L$1 = r1
            r5.L$2 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3e:
            com.facebook.aura.login.nativeflow.HatchAuthApi$selectAccount$1 r5 = new com.facebook.aura.login.nativeflow.HatchAuthApi$selectAccount$1
            r5.<init>(r6, r10)
            goto L12
        L44:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi.m1263selectAccountBWLJW6A(java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* renamed from: sendOtp-bMdYcbs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1264sendOtpbMdYcbs(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, boolean r18, X.HtJ<? super X.HsJ<com.facebook.aura.login.nativeflow.HatchAuthOtpSent>> r19) {
        /*
            r12 = this;
            r3 = r19
            boolean r0 = r3 instanceof com.facebook.aura.login.nativeflow.HatchAuthApi$sendOtp$1
            if (r0 == 0) goto L4f
            r4 = r3
            com.facebook.aura.login.nativeflow.HatchAuthApi$sendOtp$1 r4 = (com.facebook.aura.login.nativeflow.HatchAuthApi$sendOtp$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r4.label = r2
        L14:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 != r1) goto L55
            X.Hwg.A00(r3)
        L22:
            X.HsJ r3 = (X.HsJ) r3
            java.lang.Object r0 = r3.value
            return r0
        L27:
            X.78T r0 = X.AnonymousClass002.A0s(r3)
            r12 = 0
            com.facebook.aura.login.nativeflow.HatchAuthApi$sendOtp$2 r5 = new com.facebook.aura.login.nativeflow.HatchAuthApi$sendOtp$2
            r11 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r4.L$0 = r12
            r4.L$1 = r12
            r4.L$2 = r12
            r4.L$3 = r12
            r4.L$4 = r12
            r4.Z$0 = r10
            r4.label = r1
            java.lang.Object r3 = X.GAo.A00(r4, r0, r5)
            if (r3 != r2) goto L22
            return r2
        L4f:
            com.facebook.aura.login.nativeflow.HatchAuthApi$sendOtp$1 r4 = new com.facebook.aura.login.nativeflow.HatchAuthApi$sendOtp$1
            r4.<init>(r12, r3)
            goto L14
        L55:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi.m1264sendOtpbMdYcbs(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* renamed from: sendSavedAccountOtp-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1265sendSavedAccountOtpBWLJW6A(java.lang.String r7, java.lang.String r8, java.lang.String r9, X.HtJ<? super X.HsJ<com.facebook.aura.login.nativeflow.HatchAuthOtpSent>> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.login.nativeflow.HatchAuthApi$sendSavedAccountOtp$1
            if (r0 == 0) goto L3e
            r5 = r10
            com.facebook.aura.login.nativeflow.HatchAuthApi$sendSavedAccountOtp$1 r5 = (com.facebook.aura.login.nativeflow.HatchAuthApi$sendSavedAccountOtp$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L44
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.login.nativeflow.HatchAuthApi$sendSavedAccountOtp$2 r0 = new com.facebook.aura.login.nativeflow.HatchAuthApi$sendSavedAccountOtp$2
            r0.<init>(r8, r9, r7, r1)
            r5.L$0 = r1
            r5.L$1 = r1
            r5.L$2 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3e:
            com.facebook.aura.login.nativeflow.HatchAuthApi$sendSavedAccountOtp$1 r5 = new com.facebook.aura.login.nativeflow.HatchAuthApi$sendSavedAccountOtp$1
            r5.<init>(r6, r10)
            goto L12
        L44:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi.m1265sendSavedAccountOtpBWLJW6A(java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* renamed from: ssoAccountPickerInfo-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1266ssoAccountPickerInfoyxL6bBk(java.util.List<com.facebook.aura.login.nativeflow.HatchSsoAccountInfoRequest> r11, java.lang.String r12, java.lang.String r13, java.util.List<java.lang.String> r14, X.HtJ<? super X.HsJ<com.facebook.aura.login.nativeflow.HatchSsoAccountInfoResponse>> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof com.facebook.aura.login.nativeflow.HatchAuthApi$ssoAccountPickerInfo$1
            if (r0 == 0) goto L44
            r4 = r15
            com.facebook.aura.login.nativeflow.HatchAuthApi$ssoAccountPickerInfo$1 r4 = (com.facebook.aura.login.nativeflow.HatchAuthApi$ssoAccountPickerInfo$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L25
            if (r0 != r1) goto L4a
            X.Hwg.A00(r3)
        L20:
            X.HsJ r3 = (X.HsJ) r3
            java.lang.Object r0 = r3.value
            return r0
        L25:
            X.78T r0 = X.AnonymousClass002.A0s(r3)
            r10 = 0
            com.facebook.aura.login.nativeflow.HatchAuthApi$ssoAccountPickerInfo$2 r5 = new com.facebook.aura.login.nativeflow.HatchAuthApi$ssoAccountPickerInfo$2
            r6 = r11
            r9 = r12
            r7 = r13
            r8 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r4.L$0 = r10
            r4.L$1 = r10
            r4.L$2 = r10
            r4.L$3 = r10
            r4.label = r1
            java.lang.Object r3 = X.GAo.A00(r4, r0, r5)
            if (r3 != r2) goto L20
            return r2
        L44:
            com.facebook.aura.login.nativeflow.HatchAuthApi$ssoAccountPickerInfo$1 r4 = new com.facebook.aura.login.nativeflow.HatchAuthApi$ssoAccountPickerInfo$1
            r4.<init>(r10, r15)
            goto L12
        L4a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi.m1266ssoAccountPickerInfoyxL6bBk(java.util.List, java.lang.String, java.lang.String, java.util.List, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* renamed from: ssoExchange-tZkwj4A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1267ssoExchangetZkwj4A(java.lang.String r15, com.facebook.aura.login.nativeflow.HatchSsoSourceApp r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, boolean r22, X.HtJ<? super X.HsJ<com.facebook.aura.login.nativeflow.HatchAuthCredentials>> r23) {
        /*
            r14 = this;
            r3 = r23
            boolean r0 = r3 instanceof com.facebook.aura.login.nativeflow.HatchAuthApi$ssoExchange$1
            if (r0 == 0) goto L59
            r4 = r3
            com.facebook.aura.login.nativeflow.HatchAuthApi$ssoExchange$1 r4 = (com.facebook.aura.login.nativeflow.HatchAuthApi$ssoExchange$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r4.label = r2
        L14:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 != r1) goto L5f
            X.Hwg.A00(r3)
        L22:
            X.HsJ r3 = (X.HsJ) r3
            java.lang.Object r0 = r3.value
            return r0
        L27:
            X.78T r0 = X.AnonymousClass002.A0s(r3)
            r14 = 0
            com.facebook.aura.login.nativeflow.HatchAuthApi$ssoExchange$2 r5 = new com.facebook.aura.login.nativeflow.HatchAuthApi$ssoExchange$2
            r12 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r13 = r22
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r4.L$0 = r14
            r4.L$1 = r14
            r4.L$2 = r14
            r4.L$3 = r14
            r4.L$4 = r14
            r4.L$5 = r14
            r4.L$6 = r14
            r4.Z$0 = r13
            r4.label = r1
            java.lang.Object r3 = X.GAo.A00(r4, r0, r5)
            if (r3 != r2) goto L22
            return r2
        L59:
            com.facebook.aura.login.nativeflow.HatchAuthApi$ssoExchange$1 r4 = new com.facebook.aura.login.nativeflow.HatchAuthApi$ssoExchange$1
            r4.<init>(r14, r3)
            goto L14
        L5f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi.m1267ssoExchangetZkwj4A(java.lang.String, com.facebook.aura.login.nativeflow.HatchSsoSourceApp, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* renamed from: start-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1268startgIAlus(java.lang.String r7, X.HtJ<? super X.HsJ<com.facebook.aura.login.nativeflow.HatchAuthStart>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.login.nativeflow.HatchAuthApi$start$1
            if (r0 == 0) goto L3a
            r5 = r8
            com.facebook.aura.login.nativeflow.HatchAuthApi$start$1 r5 = (com.facebook.aura.login.nativeflow.HatchAuthApi$start$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L40
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.login.nativeflow.HatchAuthApi$start$2 r0 = new com.facebook.aura.login.nativeflow.HatchAuthApi$start$2
            r0.<init>(r7, r1)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3a:
            com.facebook.aura.login.nativeflow.HatchAuthApi$start$1 r5 = new com.facebook.aura.login.nativeflow.HatchAuthApi$start$1
            r5.<init>(r6, r8)
            goto L12
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi.m1268startgIAlus(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* renamed from: twoFactorConfirm-bMdYcbs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1269twoFactorConfirmbMdYcbs(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, com.facebook.aura.login.nativeflow.HatchAttestationRequest r18, X.HtJ<? super X.HsJ<com.facebook.aura.login.nativeflow.HatchAuthCredentials>> r19) {
        /*
            r12 = this;
            r3 = r19
            boolean r0 = r3 instanceof com.facebook.aura.login.nativeflow.HatchAuthApi$twoFactorConfirm$1
            if (r0 == 0) goto L4f
            r4 = r3
            com.facebook.aura.login.nativeflow.HatchAuthApi$twoFactorConfirm$1 r4 = (com.facebook.aura.login.nativeflow.HatchAuthApi$twoFactorConfirm$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r4.label = r2
        L14:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 != r1) goto L55
            X.Hwg.A00(r3)
        L22:
            X.HsJ r3 = (X.HsJ) r3
            java.lang.Object r0 = r3.value
            return r0
        L27:
            X.78T r0 = X.AnonymousClass002.A0s(r3)
            r12 = 0
            com.facebook.aura.login.nativeflow.HatchAuthApi$twoFactorConfirm$2 r5 = new com.facebook.aura.login.nativeflow.HatchAuthApi$twoFactorConfirm$2
            r11 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r7 = r17
            r6 = r18
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r4.L$0 = r12
            r4.L$1 = r12
            r4.L$2 = r12
            r4.L$3 = r12
            r4.L$4 = r12
            r4.L$5 = r12
            r4.label = r1
            java.lang.Object r3 = X.GAo.A00(r4, r0, r5)
            if (r3 != r2) goto L22
            return r2
        L4f:
            com.facebook.aura.login.nativeflow.HatchAuthApi$twoFactorConfirm$1 r4 = new com.facebook.aura.login.nativeflow.HatchAuthApi$twoFactorConfirm$1
            r4.<init>(r12, r3)
            goto L14
        L55:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi.m1269twoFactorConfirmbMdYcbs(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.facebook.aura.login.nativeflow.HatchAttestationRequest, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* renamed from: twoFactorSendCode-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1270twoFactorSendCodeBWLJW6A(java.lang.String r7, java.lang.String r8, java.lang.String r9, X.HtJ<? super X.HsJ<kotlin.Unit>> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.login.nativeflow.HatchAuthApi$twoFactorSendCode$1
            if (r0 == 0) goto L3e
            r5 = r10
            com.facebook.aura.login.nativeflow.HatchAuthApi$twoFactorSendCode$1 r5 = (com.facebook.aura.login.nativeflow.HatchAuthApi$twoFactorSendCode$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L44
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.login.nativeflow.HatchAuthApi$twoFactorSendCode$2 r0 = new com.facebook.aura.login.nativeflow.HatchAuthApi$twoFactorSendCode$2
            r0.<init>(r8, r9, r7, r1)
            r5.L$0 = r1
            r5.L$1 = r1
            r5.L$2 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3e:
            com.facebook.aura.login.nativeflow.HatchAuthApi$twoFactorSendCode$1 r5 = new com.facebook.aura.login.nativeflow.HatchAuthApi$twoFactorSendCode$1
            r5.<init>(r6, r10)
            goto L12
        L44:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi.m1270twoFactorSendCodeBWLJW6A(java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* renamed from: zariExchange-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1271zariExchange0E7RQCE(java.lang.String r7, com.facebook.aura.login.nativeflow.HatchSsoAccountInfoRequest r8, X.HtJ<? super X.HsJ<com.facebook.aura.login.nativeflow.HatchAuthCredentials>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.login.nativeflow.HatchAuthApi$zariExchange$1
            if (r0 == 0) goto L3c
            r5 = r9
            com.facebook.aura.login.nativeflow.HatchAuthApi$zariExchange$1 r5 = (com.facebook.aura.login.nativeflow.HatchAuthApi$zariExchange$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3c
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L42
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.login.nativeflow.HatchAuthApi$zariExchange$2 r0 = new com.facebook.aura.login.nativeflow.HatchAuthApi$zariExchange$2
            r0.<init>(r8, r7, r1)
            r5.L$0 = r1
            r5.L$1 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3c:
            com.facebook.aura.login.nativeflow.HatchAuthApi$zariExchange$1 r5 = new com.facebook.aura.login.nativeflow.HatchAuthApi$zariExchange$1
            r5.<init>(r6, r9)
            goto L12
        L42:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi.m1271zariExchange0E7RQCE(java.lang.String, com.facebook.aura.login.nativeflow.HatchSsoAccountInfoRequest, X.HtJ):java.lang.Object");
    }
}
