package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$onNameCompletionContinueClicked$1$result$1", f = "NativeLoginViewModel.kt", l = {4584}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class NativeLoginViewModel$onNameCompletionContinueClicked$1$result$1 extends AbstractC07127nr implements G0V<String, HtJ<? super HsJ<? extends HatchAuthCredentials>>, Object> {
    public final /* synthetic */ String $firstName;
    public final /* synthetic */ String $lastName;
    public final /* synthetic */ String $linkingDisclosureVersion;
    public final /* synthetic */ NativeLoginSsoAccount $sso;
    public final /* synthetic */ String $tosContentVersion;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginViewModel$onNameCompletionContinueClicked$1$result$1(NativeLoginSsoAccount nativeLoginSsoAccount, String str, String str2, String str3, String str4, HtJ<? super NativeLoginViewModel$onNameCompletionContinueClicked$1$result$1> htJ) {
        super(2, htJ);
        this.$sso = nativeLoginSsoAccount;
        this.$firstName = str;
        this.$lastName = str2;
        this.$tosContentVersion = str3;
        this.$linkingDisclosureVersion = str4;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        NativeLoginViewModel$onNameCompletionContinueClicked$1$result$1 nativeLoginViewModel$onNameCompletionContinueClicked$1$result$1 = new NativeLoginViewModel$onNameCompletionContinueClicked$1$result$1(this.$sso, this.$firstName, this.$lastName, this.$tosContentVersion, this.$linkingDisclosureVersion, htJ);
        nativeLoginViewModel$onNameCompletionContinueClicked$1$result$1.L$0 = obj;
        return nativeLoginViewModel$onNameCompletionContinueClicked$1$result$1;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(String str, HtJ<? super HsJ<? extends HatchAuthCredentials>> htJ) {
        return invoke2(str, (HtJ<? super HsJ<HatchAuthCredentials>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1267ssoExchangetZkwj4A;
        String str = (String) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchAuthApi hatchAuthApi = HatchAuthApi.INSTANCE;
            NativeLoginSsoAccount nativeLoginSsoAccount = this.$sso;
            HatchSsoSourceApp hatchSsoSourceApp = nativeLoginSsoAccount.sourceApp;
            String str2 = nativeLoginSsoAccount.accessToken;
            String str3 = this.$firstName;
            String str4 = this.$lastName;
            String str5 = this.$tosContentVersion;
            String str6 = this.$linkingDisclosureVersion;
            this.L$0 = null;
            this.label = 1;
            objM1267ssoExchangetZkwj4A = hatchAuthApi.m1267ssoExchangetZkwj4A(str, hatchSsoSourceApp, str2, str3, str4, str5, str6, false, this);
            if (objM1267ssoExchangetZkwj4A == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1267ssoExchangetZkwj4A = AnonymousClass001.A0q(obj);
        }
        return C3cG.A0t(objM1267ssoExchangetZkwj4A);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, HtJ<? super HsJ<HatchAuthCredentials>> htJ) {
        return ((NativeLoginViewModel$onNameCompletionContinueClicked$1$result$1) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
