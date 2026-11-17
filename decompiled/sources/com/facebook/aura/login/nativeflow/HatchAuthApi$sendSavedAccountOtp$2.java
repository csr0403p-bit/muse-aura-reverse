package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HsJ;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchAuthApi$sendSavedAccountOtp$2", f = "HatchAuthApi.kt", l = {603}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAuthApi$sendSavedAccountOtp$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends HatchAuthOtpSent>>, Object> {
    public final /* synthetic */ String $accountCuid;
    public final /* synthetic */ String $aymhDeviceId;
    public final /* synthetic */ String $tempToken;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuthApi$sendSavedAccountOtp$2(String str, String str2, String str3, HtJ<? super HatchAuthApi$sendSavedAccountOtp$2> htJ) {
        super(2, htJ);
        this.$accountCuid = str;
        this.$aymhDeviceId = str2;
        this.$tempToken = str3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAuthApi$sendSavedAccountOtp$2(this.$accountCuid, this.$aymhDeviceId, this.$tempToken, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends HatchAuthOtpSent>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<HatchAuthOtpSent>>) htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r7 = 1
            if (r0 == 0) goto L16
            if (r0 != r7) goto Lca
            X.Hwg.A00(r10)
        Lc:
            com.facebook.aura.network.AuraHttpResponse r10 = (com.facebook.aura.network.AuraHttpResponse) r10
            com.facebook.aura.network.api.StefiHatchPath$AuthSendSavedAccountOtp r0 = com.facebook.aura.network.api.StefiHatchPath.AuthSendSavedAccountOtp.INSTANCE
            java.lang.String r3 = r0.getValue()
            r5 = 0
            goto L44
        L16:
            X.Hwg.A00(r10)
            X.9sU r6 = com.facebook.aura.json.HatchJsonKt.HatchJson
            com.facebook.aura.login.nativeflow.AuthSendSavedAccountOtpRequestJson$$serializer r5 = com.facebook.aura.login.nativeflow.AuthSendSavedAccountOtpRequestJson$$serializer.INSTANCE
            java.lang.String r4 = r9.$accountCuid
            java.lang.String r3 = r9.$aymhDeviceId
            java.lang.String r2 = X.C3cG.A0X()
            java.lang.String r1 = X.C3cG.A0Y()
            com.facebook.aura.login.nativeflow.AuthSendSavedAccountOtpRequestJson r0 = new com.facebook.aura.login.nativeflow.AuthSendSavedAccountOtpRequestJson
            r0.<init>(r4, r3, r2, r1)
            byte[] r4 = X.C3cH.A1S(r0, r5, r6)
            com.facebook.aura.network.hatchauth.HatchAuthClient r3 = com.facebook.aura.network.hatchauth.HatchAuthClient.INSTANCE
            com.facebook.aura.network.api.StefiHatchPath$AuthSendSavedAccountOtp r2 = com.facebook.aura.network.api.StefiHatchPath.AuthSendSavedAccountOtp.INSTANCE
            java.lang.String r1 = r9.$tempToken
            r0 = 0
            r9.L$0 = r0
            r9.label = r7
            java.lang.Object r10 = r3.post(r2, r4, r1, r9)
            if (r10 != r8) goto Lc
            return r8
        L44:
            java.lang.String r4 = r10.bodyString()     // Catch: java.lang.Exception -> L49
            goto L57
        L49:
            r2 = move-exception
            com.facebook.aura.network.hatchauth.HatchAuthError r1 = X.C3cG.A0I(r5, r10)
            java.lang.String r0 = X.C3cH.A0d(r10, r3, r2)
            com.facebook.aura.network.hatchauth.HatchAuthException r0 = X.C3cG.A0J(r10, r1, r0, r2)
            goto L6f
        L57:
            boolean r0 = r10.isSuccessful
            if (r0 != 0) goto L9d
            com.facebook.aura.json.HatchProblemJson r2 = com.facebook.aura.json.HatchProblemJsonKt.hatchProblemOf(r4)
            com.facebook.aura.network.hatchauth.HatchAuthError r1 = X.C3cG.A0I(r2, r10)
            if (r4 == 0) goto L8d
            boolean r0 = X.C7BY.A0j(r4)
            if (r0 != 0) goto L8d
        L6b:
            com.facebook.aura.network.hatchauth.HatchAuthException r0 = X.C3cH.A0T(r2, r10, r1, r4)
        L6f:
            X.Hud r1 = X.C3cG.A0s(r0)
        L73:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L88
            com.facebook.aura.login.nativeflow.AuthSendOtpResponseJson r1 = (com.facebook.aura.login.nativeflow.AuthSendOtpResponseJson) r1
            java.lang.String r2 = r1.auth_state
            boolean r3 = r1.password_login_available
            com.facebook.aura.login.nativeflow.HatchAuthFlow r4 = com.facebook.aura.login.nativeflow.HatchAuthFlow.Login
            com.facebook.aura.login.nativeflow.HatchAuthOtpSent r1 = new com.facebook.aura.login.nativeflow.HatchAuthOtpSent
            r6 = r5
            r7 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L88:
            X.HsJ r8 = X.C3cG.A0t(r1)
            return r8
        L8d:
            java.lang.String r4 = r10.errorMessage
            if (r4 == 0) goto L98
            boolean r0 = X.C7BY.A0j(r4)
            if (r0 != 0) goto L98
            goto L6b
        L98:
            java.lang.String r4 = X.C3cG.A0b(r10, r3)
            goto L6b
        L9d:
            if (r4 == 0) goto Lb4
            boolean r0 = X.C7BY.A0j(r4)
            if (r0 != 0) goto Lb4
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Exception -> Lae
            com.facebook.aura.login.nativeflow.AuthSendOtpResponseJson$$serializer r0 = com.facebook.aura.login.nativeflow.AuthSendOtpResponseJson$$serializer.INSTANCE     // Catch: java.lang.Exception -> Lae
            java.lang.Object r1 = r1.A00(r4, r0)     // Catch: java.lang.Exception -> Lae
            goto L73
        Lae:
            r0 = move-exception
            X.Hud r1 = X.C3cH.A0s(r10, r3, r0)
            goto L73
        Lb4:
            int r4 = r10.code
            com.facebook.aura.network.hatchauth.HatchAuthError$Failed r2 = new com.facebook.aura.network.hatchauth.HatchAuthError$Failed
            r2.<init>(r4)
            java.lang.String r3 = X.C3cH.A0c(r10, r3)
            com.facebook.aura.network.hatchauth.HatchAuthException r1 = new com.facebook.aura.network.hatchauth.HatchAuthException
            r6 = r5
            r1.<init>(r2, r3, r4, r5, r6)
            X.Hud r1 = X.C3cG.A0s(r1)
            goto L73
        Lca:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi$sendSavedAccountOtp$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<HatchAuthOtpSent>> htJ) {
        return ((HatchAuthApi$sendSavedAccountOtp$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
