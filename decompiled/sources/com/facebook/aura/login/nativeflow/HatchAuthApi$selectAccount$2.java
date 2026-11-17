package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HsJ;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchAuthApi$selectAccount$2", f = "HatchAuthApi.kt", l = {746}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAuthApi$selectAccount$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends HatchAuthCredentials>>, Object> {
    public final /* synthetic */ String $accountRef;
    public final /* synthetic */ String $selectionState;
    public final /* synthetic */ String $tempToken;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuthApi$selectAccount$2(String str, String str2, String str3, HtJ<? super HatchAuthApi$selectAccount$2> htJ) {
        super(2, htJ);
        this.$selectionState = str;
        this.$accountRef = str2;
        this.$tempToken = str3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAuthApi$selectAccount$2(this.$selectionState, this.$accountRef, this.$tempToken, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends HatchAuthCredentials>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<HatchAuthCredentials>>) htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r12.label
            r9 = 1
            if (r0 == 0) goto L16
            if (r0 != r9) goto Lca
            X.Hwg.A00(r13)
        Lc:
            com.facebook.aura.network.AuraHttpResponse r13 = (com.facebook.aura.network.AuraHttpResponse) r13
            com.facebook.aura.network.api.StefiHatchPath$AuthSelectAccount r0 = com.facebook.aura.network.api.StefiHatchPath.AuthSelectAccount.INSTANCE
            java.lang.String r3 = r0.getValue()
            r5 = 0
            goto L44
        L16:
            X.Hwg.A00(r13)
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson
            com.facebook.aura.login.nativeflow.AuthSelectAccountRequestJson$$serializer r0 = com.facebook.aura.login.nativeflow.AuthSelectAccountRequestJson$$serializer.INSTANCE
            java.lang.String r7 = r12.$selectionState
            java.lang.String r8 = r12.$accountRef
            java.lang.String r10 = X.C3cG.A0X()
            java.lang.String r11 = X.C3cG.A0Y()
            r4 = 0
            com.facebook.aura.login.nativeflow.AuthSelectAccountRequestJson r6 = new com.facebook.aura.login.nativeflow.AuthSelectAccountRequestJson
            r6.<init>(r7, r8, r9, r10, r11)
            byte[] r3 = X.C3cH.A1S(r6, r0, r1)
            com.facebook.aura.network.hatchauth.HatchAuthClient r2 = com.facebook.aura.network.hatchauth.HatchAuthClient.INSTANCE
            com.facebook.aura.network.api.StefiHatchPath$AuthSelectAccount r1 = com.facebook.aura.network.api.StefiHatchPath.AuthSelectAccount.INSTANCE
            java.lang.String r0 = r12.$tempToken
            r12.L$0 = r4
            r12.label = r9
            java.lang.Object r13 = r2.post(r1, r3, r0, r12)
            if (r13 != r5) goto Lc
            return r5
        L44:
            java.lang.String r4 = r13.bodyString()     // Catch: java.lang.Exception -> L49
            goto L57
        L49:
            r2 = move-exception
            com.facebook.aura.network.hatchauth.HatchAuthError r1 = X.C3cG.A0I(r5, r13)
            java.lang.String r0 = X.C3cH.A0d(r13, r3, r2)
            com.facebook.aura.network.hatchauth.HatchAuthException r0 = X.C3cG.A0J(r13, r1, r0, r2)
            goto L6f
        L57:
            boolean r0 = r13.isSuccessful
            if (r0 != 0) goto L8a
            com.facebook.aura.json.HatchProblemJson r2 = com.facebook.aura.json.HatchProblemJsonKt.hatchProblemOf(r4)
            com.facebook.aura.network.hatchauth.HatchAuthError r1 = X.C3cG.A0I(r2, r13)
            if (r4 == 0) goto L7a
            boolean r0 = X.C7BY.A0j(r4)
            if (r0 != 0) goto L7a
        L6b:
            com.facebook.aura.network.hatchauth.HatchAuthException r0 = X.C3cH.A0T(r2, r13, r1, r4)
        L6f:
            X.Hud r1 = X.C3cG.A0s(r0)
        L73:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto Lc5
            goto Lb9
        L7a:
            java.lang.String r4 = r13.errorMessage
            if (r4 == 0) goto L85
            boolean r0 = X.C7BY.A0j(r4)
            if (r0 != 0) goto L85
            goto L6b
        L85:
            java.lang.String r4 = X.C3cG.A0b(r13, r3)
            goto L6b
        L8a:
            if (r4 == 0) goto La3
            boolean r0 = X.C7BY.A0j(r4)
            if (r0 != 0) goto La3
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Exception -> L9d
            X.F0C<X.9hr<java.lang.Object>>[] r0 = com.facebook.aura.login.nativeflow.AuthCredentialsJson.$childSerializers     // Catch: java.lang.Exception -> L9d
            com.facebook.aura.login.nativeflow.AuthCredentialsJson$$serializer r0 = com.facebook.aura.login.nativeflow.AuthCredentialsJson$$serializer.INSTANCE     // Catch: java.lang.Exception -> L9d
            java.lang.Object r1 = r1.A00(r4, r0)     // Catch: java.lang.Exception -> L9d
            goto L73
        L9d:
            r0 = move-exception
            X.Hud r1 = X.C3cH.A0s(r13, r3, r0)
            goto L73
        La3:
            int r4 = r13.code
            com.facebook.aura.network.hatchauth.HatchAuthError$Failed r2 = new com.facebook.aura.network.hatchauth.HatchAuthError$Failed
            r2.<init>(r4)
            java.lang.String r3 = X.C3cH.A0c(r13, r3)
            com.facebook.aura.network.hatchauth.HatchAuthException r1 = new com.facebook.aura.network.hatchauth.HatchAuthException
            r6 = r5
            r1.<init>(r2, r3, r4, r5, r6)
            X.Hud r1 = X.C3cG.A0s(r1)
            goto L73
        Lb9:
            com.facebook.aura.login.nativeflow.AuthCredentialsJson r1 = (com.facebook.aura.login.nativeflow.AuthCredentialsJson) r1     // Catch: java.lang.Throwable -> Lc0
            com.facebook.aura.login.nativeflow.HatchAuthCredentials r1 = com.facebook.aura.login.nativeflow.HatchAuthApiJsonKt.toCredentials(r1)     // Catch: java.lang.Throwable -> Lc0
            goto Lc5
        Lc0:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        Lc5:
            X.HsJ r5 = X.C3cG.A0t(r1)
            return r5
        Lca:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi$selectAccount$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<HatchAuthCredentials>> htJ) {
        return ((HatchAuthApi$selectAccount$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
