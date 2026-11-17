package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HsJ;
import X.HtJ;
import com.facebook.aura.settings.MC;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchAuthApi$ssoExchange$2", f = "HatchAuthApi.kt", l = {359, MC.mwa_help_and_support.__CONFIG__}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAuthApi$ssoExchange$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends HatchAuthCredentials>>, Object> {
    public final /* synthetic */ String $accessToken;
    public final /* synthetic */ String $firstName;
    public final /* synthetic */ String $lastName;
    public final /* synthetic */ String $linkingDisclosureVersion;
    public final /* synthetic */ HatchSsoSourceApp $sourceApp;
    public final /* synthetic */ boolean $supportsDirectNtpUpsell;
    public final /* synthetic */ String $tempToken;
    public final /* synthetic */ String $tosContentVersion;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuthApi$ssoExchange$2(HatchSsoSourceApp hatchSsoSourceApp, String str, String str2, String str3, String str4, String str5, String str6, boolean z, HtJ<? super HatchAuthApi$ssoExchange$2> htJ) {
        super(2, htJ);
        this.$sourceApp = hatchSsoSourceApp;
        this.$accessToken = str;
        this.$firstName = str2;
        this.$lastName = str3;
        this.$tosContentVersion = str4;
        this.$linkingDisclosureVersion = str5;
        this.$tempToken = str6;
        this.$supportsDirectNtpUpsell = z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAuthApi$ssoExchange$2(this.$sourceApp, this.$accessToken, this.$firstName, this.$lastName, this.$tosContentVersion, this.$linkingDisclosureVersion, this.$tempToken, this.$supportsDirectNtpUpsell, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends HatchAuthCredentials>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<HatchAuthCredentials>>) htJ);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:(1:(3:6|7|8)(2:50|51))(1:15))(4:9|(1:11)|12|(1:14))|16|56|17|20|(10:22|(1:36)|26|27|28|(2:54|44)|47|(1:49)|7|8)(7:(1:43)(2:52|40)|28|(0)|47|(0)|7|8)) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        r0 = X.C3cG.A0J(r7, X.C3cG.A0I(null, r7), X.C3cH.A0d(r7, r8, r6), r6);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi$ssoExchange$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<HatchAuthCredentials>> htJ) {
        return ((HatchAuthApi$ssoExchange$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
