package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HsJ;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchAuthApi$confirmPassword$2", f = "HatchAuthApi.kt", l = {703}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAuthApi$confirmPassword$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends HatchAuthCredentials>>, Object> {
    public final /* synthetic */ String $authState;
    public final /* synthetic */ String $password;
    public final /* synthetic */ String $tempToken;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuthApi$confirmPassword$2(String str, String str2, String str3, HtJ<? super HatchAuthApi$confirmPassword$2> htJ) {
        super(2, htJ);
        this.$authState = str;
        this.$password = str2;
        this.$tempToken = str3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAuthApi$confirmPassword$2(this.$authState, this.$password, this.$tempToken, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends HatchAuthCredentials>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<HatchAuthCredentials>>) htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r14.label
            r9 = 1
            if (r0 == 0) goto L16
            if (r0 != r9) goto Lcc
            X.Hwg.A00(r15)
        Lc:
            com.facebook.aura.network.AuraHttpResponse r15 = (com.facebook.aura.network.AuraHttpResponse) r15
            com.facebook.aura.network.api.StefiHatchPath$AuthConfirmPassword r0 = com.facebook.aura.network.api.StefiHatchPath.AuthConfirmPassword.INSTANCE
            java.lang.String r3 = r0.getValue()
            r5 = 0
            goto L46
        L16:
            X.Hwg.A00(r15)
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson
            com.facebook.aura.login.nativeflow.AuthConfirmPasswordRequestJson$$serializer r0 = com.facebook.aura.login.nativeflow.AuthConfirmPasswordRequestJson$$serializer.INSTANCE
            java.lang.String r7 = r14.$authState
            java.lang.String r8 = r14.$password
            java.lang.String r12 = X.C3cG.A0X()
            java.lang.String r13 = X.C3cG.A0Y()
            r4 = 0
            com.facebook.aura.login.nativeflow.AuthConfirmPasswordRequestJson r6 = new com.facebook.aura.login.nativeflow.AuthConfirmPasswordRequestJson
            r10 = r9
            r11 = r9
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            byte[] r3 = X.C3cH.A1S(r6, r0, r1)
            com.facebook.aura.network.hatchauth.HatchAuthClient r2 = com.facebook.aura.network.hatchauth.HatchAuthClient.INSTANCE
            com.facebook.aura.network.api.StefiHatchPath$AuthConfirmPassword r1 = com.facebook.aura.network.api.StefiHatchPath.AuthConfirmPassword.INSTANCE
            java.lang.String r0 = r14.$tempToken
            r14.L$0 = r4
            r14.label = r9
            java.lang.Object r15 = r2.post(r1, r3, r0, r14)
            if (r15 != r5) goto Lc
            return r5
        L46:
            java.lang.String r4 = r15.bodyString()     // Catch: java.lang.Exception -> L4b
            goto L59
        L4b:
            r2 = move-exception
            com.facebook.aura.network.hatchauth.HatchAuthError r1 = X.C3cG.A0I(r5, r15)
            java.lang.String r0 = X.C3cH.A0d(r15, r3, r2)
            com.facebook.aura.network.hatchauth.HatchAuthException r0 = X.C3cG.A0J(r15, r1, r0, r2)
            goto L71
        L59:
            boolean r0 = r15.isSuccessful
            if (r0 != 0) goto L8c
            com.facebook.aura.json.HatchProblemJson r2 = com.facebook.aura.json.HatchProblemJsonKt.hatchProblemOf(r4)
            com.facebook.aura.network.hatchauth.HatchAuthError r1 = X.C3cG.A0I(r2, r15)
            if (r4 == 0) goto L7c
            boolean r0 = X.C7BY.A0j(r4)
            if (r0 != 0) goto L7c
        L6d:
            com.facebook.aura.network.hatchauth.HatchAuthException r0 = X.C3cH.A0T(r2, r15, r1, r4)
        L71:
            X.Hud r1 = X.C3cG.A0s(r0)
        L75:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto Lc7
            goto Lbb
        L7c:
            java.lang.String r4 = r15.errorMessage
            if (r4 == 0) goto L87
            boolean r0 = X.C7BY.A0j(r4)
            if (r0 != 0) goto L87
            goto L6d
        L87:
            java.lang.String r4 = X.C3cG.A0b(r15, r3)
            goto L6d
        L8c:
            if (r4 == 0) goto La5
            boolean r0 = X.C7BY.A0j(r4)
            if (r0 != 0) goto La5
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Exception -> L9f
            X.F0C<X.9hr<java.lang.Object>>[] r0 = com.facebook.aura.login.nativeflow.AuthCredentialsJson.$childSerializers     // Catch: java.lang.Exception -> L9f
            com.facebook.aura.login.nativeflow.AuthCredentialsJson$$serializer r0 = com.facebook.aura.login.nativeflow.AuthCredentialsJson$$serializer.INSTANCE     // Catch: java.lang.Exception -> L9f
            java.lang.Object r1 = r1.A00(r4, r0)     // Catch: java.lang.Exception -> L9f
            goto L75
        L9f:
            r0 = move-exception
            X.Hud r1 = X.C3cH.A0s(r15, r3, r0)
            goto L75
        La5:
            int r4 = r15.code
            com.facebook.aura.network.hatchauth.HatchAuthError$Failed r2 = new com.facebook.aura.network.hatchauth.HatchAuthError$Failed
            r2.<init>(r4)
            java.lang.String r3 = X.C3cH.A0c(r15, r3)
            com.facebook.aura.network.hatchauth.HatchAuthException r1 = new com.facebook.aura.network.hatchauth.HatchAuthException
            r6 = r5
            r1.<init>(r2, r3, r4, r5, r6)
            X.Hud r1 = X.C3cG.A0s(r1)
            goto L75
        Lbb:
            com.facebook.aura.login.nativeflow.AuthCredentialsJson r1 = (com.facebook.aura.login.nativeflow.AuthCredentialsJson) r1     // Catch: java.lang.Throwable -> Lc2
            com.facebook.aura.login.nativeflow.HatchAuthCredentials r1 = com.facebook.aura.login.nativeflow.HatchAuthApiJsonKt.toCredentials(r1)     // Catch: java.lang.Throwable -> Lc2
            goto Lc7
        Lc2:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        Lc7:
            X.HsJ r5 = X.C3cG.A0t(r1)
            return r5
        Lcc:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi$confirmPassword$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<HatchAuthCredentials>> htJ) {
        return ((HatchAuthApi$confirmPassword$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
