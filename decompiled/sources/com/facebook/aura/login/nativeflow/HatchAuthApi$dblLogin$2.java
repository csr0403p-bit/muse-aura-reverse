package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HsJ;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchAuthApi$dblLogin$2", f = "HatchAuthApi.kt", l = {635}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAuthApi$dblLogin$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends HatchAuthCredentials>>, Object> {
    public final /* synthetic */ String $accountCuid;
    public final /* synthetic */ String $aymhDeviceId;
    public final /* synthetic */ String $nonce;
    public final /* synthetic */ String $tempToken;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuthApi$dblLogin$2(String str, String str2, String str3, String str4, HtJ<? super HatchAuthApi$dblLogin$2> htJ) {
        super(2, htJ);
        this.$accountCuid = str;
        this.$nonce = str2;
        this.$aymhDeviceId = str3;
        this.$tempToken = str4;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAuthApi$dblLogin$2(this.$accountCuid, this.$nonce, this.$aymhDeviceId, this.$tempToken, htJ);
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
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r13.label
            r5 = 1
            if (r0 == 0) goto L16
            if (r0 != r5) goto Lcc
            X.Hwg.A00(r14)
        Lc:
            com.facebook.aura.network.AuraHttpResponse r14 = (com.facebook.aura.network.AuraHttpResponse) r14
            com.facebook.aura.network.api.StefiHatchPath$AuthDblLogin r0 = com.facebook.aura.network.api.StefiHatchPath.AuthDblLogin.INSTANCE
            java.lang.String r3 = r0.getValue()
            r5 = 0
            goto L46
        L16:
            X.Hwg.A00(r14)
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson
            com.facebook.aura.login.nativeflow.AuthDblLoginRequestJson$$serializer r0 = com.facebook.aura.login.nativeflow.AuthDblLoginRequestJson$$serializer.INSTANCE
            java.lang.String r8 = r13.$accountCuid
            java.lang.String r9 = r13.$nonce
            java.lang.String r10 = r13.$aymhDeviceId
            java.lang.String r11 = X.C3cG.A0X()
            java.lang.String r12 = X.C3cG.A0Y()
            com.facebook.aura.login.nativeflow.AuthDblLoginRequestJson r7 = new com.facebook.aura.login.nativeflow.AuthDblLoginRequestJson
            r7.<init>(r8, r9, r10, r11, r12)
            byte[] r4 = X.C3cH.A1S(r7, r0, r1)
            com.facebook.aura.network.hatchauth.HatchAuthClient r3 = com.facebook.aura.network.hatchauth.HatchAuthClient.INSTANCE
            com.facebook.aura.network.api.StefiHatchPath$AuthDblLogin r2 = com.facebook.aura.network.api.StefiHatchPath.AuthDblLogin.INSTANCE
            java.lang.String r1 = r13.$tempToken
            r0 = 0
            r13.L$0 = r0
            r13.label = r5
            java.lang.Object r14 = r3.post(r2, r4, r1, r13)
            if (r14 != r6) goto Lc
            return r6
        L46:
            java.lang.String r4 = r14.bodyString()     // Catch: java.lang.Exception -> L4b
            goto L59
        L4b:
            r2 = move-exception
            com.facebook.aura.network.hatchauth.HatchAuthError r1 = X.C3cG.A0I(r5, r14)
            java.lang.String r0 = X.C3cH.A0d(r14, r3, r2)
            com.facebook.aura.network.hatchauth.HatchAuthException r0 = X.C3cG.A0J(r14, r1, r0, r2)
            goto L71
        L59:
            boolean r0 = r14.isSuccessful
            if (r0 != 0) goto L8c
            com.facebook.aura.json.HatchProblemJson r2 = com.facebook.aura.json.HatchProblemJsonKt.hatchProblemOf(r4)
            com.facebook.aura.network.hatchauth.HatchAuthError r1 = X.C3cG.A0I(r2, r14)
            if (r4 == 0) goto L7c
            boolean r0 = X.C7BY.A0j(r4)
            if (r0 != 0) goto L7c
        L6d:
            com.facebook.aura.network.hatchauth.HatchAuthException r0 = X.C3cH.A0T(r2, r14, r1, r4)
        L71:
            X.Hud r1 = X.C3cG.A0s(r0)
        L75:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto Lc7
            goto Lbb
        L7c:
            java.lang.String r4 = r14.errorMessage
            if (r4 == 0) goto L87
            boolean r0 = X.C7BY.A0j(r4)
            if (r0 != 0) goto L87
            goto L6d
        L87:
            java.lang.String r4 = X.C3cG.A0b(r14, r3)
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
            X.Hud r1 = X.C3cH.A0s(r14, r3, r0)
            goto L75
        La5:
            int r4 = r14.code
            com.facebook.aura.network.hatchauth.HatchAuthError$Failed r2 = new com.facebook.aura.network.hatchauth.HatchAuthError$Failed
            r2.<init>(r4)
            java.lang.String r3 = X.C3cH.A0c(r14, r3)
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
            X.HsJ r6 = X.C3cG.A0t(r1)
            return r6
        Lcc:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi$dblLogin$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<HatchAuthCredentials>> htJ) {
        return ((HatchAuthApi$dblLogin$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
