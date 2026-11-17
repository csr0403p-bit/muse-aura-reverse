package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HsJ;
import X.HtJ;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchAuthApi$savedAccounts$2", f = "HatchAuthApi.kt", l = {574}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAuthApi$savedAccounts$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends List<? extends HatchSavedAccount>>>, Object> {
    public final /* synthetic */ String $idForAymh;
    public final /* synthetic */ String $tempToken;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuthApi$savedAccounts$2(String str, String str2, HtJ<? super HatchAuthApi$savedAccounts$2> htJ) {
        super(2, htJ);
        this.$idForAymh = str;
        this.$tempToken = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAuthApi$savedAccounts$2(this.$idForAymh, this.$tempToken, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends List<? extends HatchSavedAccount>>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<? extends List<HatchSavedAccount>>>) htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
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
            if (r0 != r6) goto Ldb
            X.Hwg.A00(r9)
        Lc:
            com.facebook.aura.network.AuraHttpResponse r9 = (com.facebook.aura.network.AuraHttpResponse) r9
            com.facebook.aura.network.api.StefiHatchPath$AuthSavedAccounts r0 = com.facebook.aura.network.api.StefiHatchPath.AuthSavedAccounts.INSTANCE
            java.lang.String r3 = r0.getValue()
            r5 = 0
            goto L42
        L16:
            X.Hwg.A00(r9)
            X.9sU r5 = com.facebook.aura.json.HatchJsonKt.HatchJson
            com.facebook.aura.login.nativeflow.AuthSavedAccountsRequestJson$$serializer r4 = com.facebook.aura.login.nativeflow.AuthSavedAccountsRequestJson$$serializer.INSTANCE
            java.lang.String r3 = r8.$idForAymh
            java.lang.String r2 = X.C3cG.A0X()
            java.lang.String r1 = X.C3cG.A0Y()
            com.facebook.aura.login.nativeflow.AuthSavedAccountsRequestJson r0 = new com.facebook.aura.login.nativeflow.AuthSavedAccountsRequestJson
            r0.<init>(r3, r2, r1)
            byte[] r4 = X.C3cH.A1S(r0, r4, r5)
            com.facebook.aura.network.hatchauth.HatchAuthClient r3 = com.facebook.aura.network.hatchauth.HatchAuthClient.INSTANCE
            com.facebook.aura.network.api.StefiHatchPath$AuthSavedAccounts r2 = com.facebook.aura.network.api.StefiHatchPath.AuthSavedAccounts.INSTANCE
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
            if (r0 != 0) goto La7
            com.facebook.aura.json.HatchProblemJson r2 = com.facebook.aura.json.HatchProblemJsonKt.hatchProblemOf(r4)
            com.facebook.aura.network.hatchauth.HatchAuthError r1 = X.C3cG.A0I(r2, r9)
            if (r4 == 0) goto L97
            boolean r0 = X.C7BY.A0j(r4)
            if (r0 != 0) goto L97
        L69:
            com.facebook.aura.network.hatchauth.HatchAuthException r0 = X.C3cH.A0T(r2, r9, r1, r4)
        L6d:
            X.Hud r2 = X.C3cG.A0s(r0)
        L71:
            boolean r0 = r2 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto Ld6
            com.facebook.aura.login.nativeflow.AuthSavedAccountsResponseJson r2 = (com.facebook.aura.login.nativeflow.AuthSavedAccountsResponseJson) r2
            java.util.List<com.facebook.aura.login.nativeflow.AuthSavedAccountJson> r0 = r2.saved_accounts
            java.util.ArrayList r2 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r1 = r0.iterator()
        L83:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Ld6
            java.lang.Object r0 = r1.next()
            com.facebook.aura.login.nativeflow.AuthSavedAccountJson r0 = (com.facebook.aura.login.nativeflow.AuthSavedAccountJson) r0
            com.facebook.aura.login.nativeflow.HatchSavedAccount r0 = r0.toDomain()
            r2.add(r0)
            goto L83
        L97:
            java.lang.String r4 = r9.errorMessage
            if (r4 == 0) goto La2
            boolean r0 = X.C7BY.A0j(r4)
            if (r0 != 0) goto La2
            goto L69
        La2:
            java.lang.String r4 = X.C3cG.A0b(r9, r3)
            goto L69
        La7:
            if (r4 == 0) goto Lc0
            boolean r0 = X.C7BY.A0j(r4)
            if (r0 != 0) goto Lc0
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Exception -> Lba
            X.F0C<X.9hr<java.lang.Object>>[] r0 = com.facebook.aura.login.nativeflow.AuthSavedAccountsResponseJson.$childSerializers     // Catch: java.lang.Exception -> Lba
            com.facebook.aura.login.nativeflow.AuthSavedAccountsResponseJson$$serializer r0 = com.facebook.aura.login.nativeflow.AuthSavedAccountsResponseJson$$serializer.INSTANCE     // Catch: java.lang.Exception -> Lba
            java.lang.Object r2 = r1.A00(r4, r0)     // Catch: java.lang.Exception -> Lba
            goto L71
        Lba:
            r0 = move-exception
            X.Hud r2 = X.C3cH.A0s(r9, r3, r0)
            goto L71
        Lc0:
            int r4 = r9.code
            com.facebook.aura.network.hatchauth.HatchAuthError$Failed r2 = new com.facebook.aura.network.hatchauth.HatchAuthError$Failed
            r2.<init>(r4)
            java.lang.String r3 = X.C3cH.A0c(r9, r3)
            com.facebook.aura.network.hatchauth.HatchAuthException r1 = new com.facebook.aura.network.hatchauth.HatchAuthException
            r6 = r5
            r1.<init>(r2, r3, r4, r5, r6)
            X.Hud r2 = X.C3cG.A0s(r1)
            goto L71
        Ld6:
            X.HsJ r7 = X.C3cG.A0t(r2)
            return r7
        Ldb:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi$savedAccounts$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<? extends List<HatchSavedAccount>>> htJ) {
        return ((HatchAuthApi$savedAccounts$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
