package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HsJ;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchAuthApi$cancelDeletion$2", f = "HatchAuthApi.kt", l = {724}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAuthApi$cancelDeletion$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends HatchAuthCredentials>>, Object> {
    public final /* synthetic */ String $tempToken;
    public final /* synthetic */ String $token;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuthApi$cancelDeletion$2(String str, String str2, HtJ<? super HatchAuthApi$cancelDeletion$2> htJ) {
        super(2, htJ);
        this.$token = str;
        this.$tempToken = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAuthApi$cancelDeletion$2(this.$token, this.$tempToken, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends HatchAuthCredentials>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<HatchAuthCredentials>>) htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r6 = 1
            if (r0 == 0) goto L16
            if (r0 != r6) goto Lc8
            X.Hwg.A00(r9)
        Lc:
            com.facebook.aura.network.AuraHttpResponse r9 = (com.facebook.aura.network.AuraHttpResponse) r9
            com.facebook.aura.network.api.StefiHatchPath$AuthCancelDeletion r0 = com.facebook.aura.network.api.StefiHatchPath.AuthCancelDeletion.INSTANCE
            java.lang.String r3 = r0.getValue()
            r5 = 0
            goto L42
        L16:
            X.Hwg.A00(r9)
            X.9sU r5 = com.facebook.aura.json.HatchJsonKt.HatchJson
            com.facebook.aura.login.nativeflow.AuthCancelDeletionRequestJson$$serializer r4 = com.facebook.aura.login.nativeflow.AuthCancelDeletionRequestJson$$serializer.INSTANCE
            java.lang.String r3 = r8.$token
            java.lang.String r2 = X.C3cG.A0X()
            java.lang.String r1 = X.C3cG.A0Y()
            com.facebook.aura.login.nativeflow.AuthCancelDeletionRequestJson r0 = new com.facebook.aura.login.nativeflow.AuthCancelDeletionRequestJson
            r0.<init>(r3, r2, r1)
            byte[] r4 = X.C3cH.A1S(r0, r4, r5)
            com.facebook.aura.network.hatchauth.HatchAuthClient r3 = com.facebook.aura.network.hatchauth.HatchAuthClient.INSTANCE
            com.facebook.aura.network.api.StefiHatchPath$AuthCancelDeletion r2 = com.facebook.aura.network.api.StefiHatchPath.AuthCancelDeletion.INSTANCE
            java.lang.String r1 = r8.$tempToken
            r0 = 0
            r8.L$0 = r0
            r8.label = r6
            java.lang.Object r9 = r3.post(r2, r4, r1, r8)
            if (r9 != r7) goto Lc
            return r7
        L42:
            java.lang.String r4 = r9.bodyString()     // Catch: java.lang.Exception -> L47
            goto L55
        L47:
            r2 = move-exception
            com.facebook.aura.network.hatchauth.HatchAuthError r1 = X.C3cG.A0I(r5, r9)
            java.lang.String r0 = X.C3cH.A0d(r9, r3, r2)
            com.facebook.aura.network.hatchauth.HatchAuthException r0 = X.C3cG.A0J(r9, r1, r0, r2)
            goto L6d
        L55:
            boolean r0 = r9.isSuccessful
            if (r0 != 0) goto L88
            com.facebook.aura.json.HatchProblemJson r2 = com.facebook.aura.json.HatchProblemJsonKt.hatchProblemOf(r4)
            com.facebook.aura.network.hatchauth.HatchAuthError r1 = X.C3cG.A0I(r2, r9)
            if (r4 == 0) goto L78
            boolean r0 = X.C7BY.A0j(r4)
            if (r0 != 0) goto L78
        L69:
            com.facebook.aura.network.hatchauth.HatchAuthException r0 = X.C3cH.A0T(r2, r9, r1, r4)
        L6d:
            X.Hud r1 = X.C3cG.A0s(r0)
        L71:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto Lc3
            goto Lb7
        L78:
            java.lang.String r4 = r9.errorMessage
            if (r4 == 0) goto L83
            boolean r0 = X.C7BY.A0j(r4)
            if (r0 != 0) goto L83
            goto L69
        L83:
            java.lang.String r4 = X.C3cG.A0b(r9, r3)
            goto L69
        L88:
            if (r4 == 0) goto La1
            boolean r0 = X.C7BY.A0j(r4)
            if (r0 != 0) goto La1
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Exception -> L9b
            X.F0C<X.9hr<java.lang.Object>>[] r0 = com.facebook.aura.login.nativeflow.AuthCredentialsJson.$childSerializers     // Catch: java.lang.Exception -> L9b
            com.facebook.aura.login.nativeflow.AuthCredentialsJson$$serializer r0 = com.facebook.aura.login.nativeflow.AuthCredentialsJson$$serializer.INSTANCE     // Catch: java.lang.Exception -> L9b
            java.lang.Object r1 = r1.A00(r4, r0)     // Catch: java.lang.Exception -> L9b
            goto L71
        L9b:
            r0 = move-exception
            X.Hud r1 = X.C3cH.A0s(r9, r3, r0)
            goto L71
        La1:
            int r4 = r9.code
            com.facebook.aura.network.hatchauth.HatchAuthError$Failed r2 = new com.facebook.aura.network.hatchauth.HatchAuthError$Failed
            r2.<init>(r4)
            java.lang.String r3 = X.C3cH.A0c(r9, r3)
            com.facebook.aura.network.hatchauth.HatchAuthException r1 = new com.facebook.aura.network.hatchauth.HatchAuthException
            r6 = r5
            r1.<init>(r2, r3, r4, r5, r6)
            X.Hud r1 = X.C3cG.A0s(r1)
            goto L71
        Lb7:
            com.facebook.aura.login.nativeflow.AuthCredentialsJson r1 = (com.facebook.aura.login.nativeflow.AuthCredentialsJson) r1     // Catch: java.lang.Throwable -> Lbe
            com.facebook.aura.login.nativeflow.HatchAuthCredentials r1 = com.facebook.aura.login.nativeflow.HatchAuthApiJsonKt.toCredentials(r1)     // Catch: java.lang.Throwable -> Lbe
            goto Lc3
        Lbe:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        Lc3:
            X.HsJ r7 = X.C3cG.A0t(r1)
            return r7
        Lc8:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi$cancelDeletion$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<HatchAuthCredentials>> htJ) {
        return ((HatchAuthApi$cancelDeletion$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
