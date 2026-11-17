package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HsJ;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchAuthApi$confirmPasskey$2", f = "HatchAuthApi.kt", l = {890, 893}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAuthApi$confirmPasskey$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends HatchAuthCredentials>>, Object> {
    public final /* synthetic */ String $authState;
    public final /* synthetic */ String $passkeyResponse;
    public final /* synthetic */ String $tempToken;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuthApi$confirmPasskey$2(String str, String str2, String str3, HtJ<? super HatchAuthApi$confirmPasskey$2> htJ) {
        super(2, htJ);
        this.$authState = str;
        this.$passkeyResponse = str2;
        this.$tempToken = str3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAuthApi$confirmPasskey$2(this.$authState, this.$passkeyResponse, this.$tempToken, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends HatchAuthCredentials>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<HatchAuthCredentials>>) htJ);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:(1:(3:6|7|8)(2:52|53))(1:17))(4:9|(1:13)|14|(1:16))|18|58|19|22|(10:24|(1:38)|28|29|30|(2:56|46)|49|(1:51)|7|8)(7:(1:45)(2:54|42)|30|(0)|49|(0)|7|8)) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        r0 = X.C3cG.A0J(r14, X.C3cG.A0I(null, r14), X.C3cH.A0d(r14, r5, r4), r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r13.label
            r1 = 2
            r8 = 1
            r11 = 0
            if (r0 == 0) goto L16
            if (r0 == r8) goto L4c
            if (r0 != r1) goto Le3
            java.lang.Object r0 = X.AnonymousClass002.A0j(r14)
        L11:
            X.HsJ r2 = X.C3cG.A0t(r0)
            return r2
        L16:
            X.Hwg.A00(r14)
            X.9sU r4 = com.facebook.aura.json.HatchJsonKt.HatchJson
            com.facebook.aura.login.nativeflow.AuthConfirmPasskeyRequestJson$$serializer r3 = com.facebook.aura.login.nativeflow.AuthConfirmPasskeyRequestJson$$serializer.INSTANCE
            java.lang.String r6 = r13.$authState
            if (r6 == 0) goto L27
            boolean r0 = X.C7BY.A0j(r6)
            if (r0 == 0) goto L28
        L27:
            r6 = r11
        L28:
            java.lang.String r7 = r13.$passkeyResponse
            java.lang.String r9 = X.C3cG.A0X()
            java.lang.String r10 = X.C3cG.A0Y()
            com.facebook.aura.login.nativeflow.AuthConfirmPasskeyRequestJson r5 = new com.facebook.aura.login.nativeflow.AuthConfirmPasskeyRequestJson
            r5.<init>(r6, r7, r8, r9, r10)
            byte[] r5 = X.C3cH.A1S(r5, r3, r4)
            com.facebook.aura.network.hatchauth.HatchAuthClient r4 = com.facebook.aura.network.hatchauth.HatchAuthClient.INSTANCE
            com.facebook.aura.network.api.StefiHatchPath$AuthConfirmPasskey r3 = com.facebook.aura.network.api.StefiHatchPath.AuthConfirmPasskey.INSTANCE
            java.lang.String r0 = r13.$tempToken
            r13.L$0 = r11
            r13.label = r8
            java.lang.Object r14 = r4.post(r3, r5, r0, r13)
            if (r14 != r2) goto L4f
            return r2
        L4c:
            X.Hwg.A00(r14)
        L4f:
            com.facebook.aura.network.AuraHttpResponse r14 = (com.facebook.aura.network.AuraHttpResponse) r14
            com.facebook.aura.network.api.StefiHatchPath$AuthConfirmPasskey r0 = com.facebook.aura.network.api.StefiHatchPath.AuthConfirmPasskey.INSTANCE
            java.lang.String r5 = r0.getValue()
            java.lang.String r6 = r14.bodyString()     // Catch: java.lang.Exception -> L5c
            goto L6a
        L5c:
            r4 = move-exception
            com.facebook.aura.network.hatchauth.HatchAuthError r3 = X.C3cG.A0I(r11, r14)
            java.lang.String r0 = X.C3cH.A0d(r14, r5, r4)
            com.facebook.aura.network.hatchauth.HatchAuthException r0 = X.C3cG.A0J(r14, r3, r0, r4)
            goto L82
        L6a:
            boolean r0 = r14.isSuccessful
            if (r0 != 0) goto L9d
            com.facebook.aura.json.HatchProblemJson r4 = com.facebook.aura.json.HatchProblemJsonKt.hatchProblemOf(r6)
            com.facebook.aura.network.hatchauth.HatchAuthError r3 = X.C3cG.A0I(r4, r14)
            if (r6 == 0) goto L8d
            boolean r0 = X.C7BY.A0j(r6)
            if (r0 != 0) goto L8d
        L7e:
            com.facebook.aura.network.hatchauth.HatchAuthException r0 = X.C3cH.A0T(r4, r14, r3, r6)
        L82:
            X.Hud r3 = X.C3cG.A0s(r0)
        L86:
            boolean r0 = r3 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto Ld8
            goto Lcc
        L8d:
            java.lang.String r6 = r14.errorMessage
            if (r6 == 0) goto L98
            boolean r0 = X.C7BY.A0j(r6)
            if (r0 != 0) goto L98
            goto L7e
        L98:
            java.lang.String r6 = X.C3cG.A0b(r14, r5)
            goto L7e
        L9d:
            if (r6 == 0) goto Lb6
            boolean r0 = X.C7BY.A0j(r6)
            if (r0 != 0) goto Lb6
            X.9sU r3 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Exception -> Lb0
            X.F0C<X.9hr<java.lang.Object>>[] r0 = com.facebook.aura.login.nativeflow.AuthCredentialsJson.$childSerializers     // Catch: java.lang.Exception -> Lb0
            com.facebook.aura.login.nativeflow.AuthCredentialsJson$$serializer r0 = com.facebook.aura.login.nativeflow.AuthCredentialsJson$$serializer.INSTANCE     // Catch: java.lang.Exception -> Lb0
            java.lang.Object r3 = r3.A00(r6, r0)     // Catch: java.lang.Exception -> Lb0
            goto L86
        Lb0:
            r0 = move-exception
            X.Hud r3 = X.C3cH.A0s(r14, r5, r0)
            goto L86
        Lb6:
            int r10 = r14.code
            com.facebook.aura.network.hatchauth.HatchAuthError$Failed r8 = new com.facebook.aura.network.hatchauth.HatchAuthError$Failed
            r8.<init>(r10)
            java.lang.String r9 = X.C3cH.A0c(r14, r5)
            com.facebook.aura.network.hatchauth.HatchAuthException r7 = new com.facebook.aura.network.hatchauth.HatchAuthException
            r12 = r11
            r7.<init>(r8, r9, r10, r11, r12)
            X.Hud r3 = X.C3cG.A0s(r7)
            goto L86
        Lcc:
            com.facebook.aura.login.nativeflow.AuthCredentialsJson r3 = (com.facebook.aura.login.nativeflow.AuthCredentialsJson) r3     // Catch: java.lang.Throwable -> Ld3
            com.facebook.aura.login.nativeflow.HatchAuthCredentials r3 = com.facebook.aura.login.nativeflow.HatchAuthApiJsonKt.toCredentials(r3)     // Catch: java.lang.Throwable -> Ld3
            goto Ld8
        Ld3:
            r0 = move-exception
            X.Hud r3 = X.C3cG.A0s(r0)
        Ld8:
            r13.L$0 = r11
            r13.label = r1
            java.lang.Object r0 = com.facebook.aura.login.nativeflow.HatchAuthApiKt.beginRegistrationAttestation(r3, r13)
            if (r0 != r2) goto L11
            return r2
        Le3:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi$confirmPasskey$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<HatchAuthCredentials>> htJ) {
        return ((HatchAuthApi$confirmPasskey$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
