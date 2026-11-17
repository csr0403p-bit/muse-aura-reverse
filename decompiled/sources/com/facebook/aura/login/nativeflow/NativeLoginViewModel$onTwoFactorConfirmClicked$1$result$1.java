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

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$onTwoFactorConfirmClicked$1$result$1", f = "NativeLoginViewModel.kt", l = {4781}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class NativeLoginViewModel$onTwoFactorConfirmClicked$1$result$1 extends AbstractC07127nr implements G0V<String, HtJ<? super HsJ<? extends HatchAuthCredentials>>, Object> {
    public final /* synthetic */ HatchAttestationRequest $attestationRequest;
    public final /* synthetic */ String $code;
    public final /* synthetic */ String $linkingTosContentVersion;
    public final /* synthetic */ HatchTwoFactorMethod $method;
    public final /* synthetic */ String $state;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginViewModel$onTwoFactorConfirmClicked$1$result$1(String str, HatchTwoFactorMethod hatchTwoFactorMethod, String str2, String str3, HatchAttestationRequest hatchAttestationRequest, HtJ<? super NativeLoginViewModel$onTwoFactorConfirmClicked$1$result$1> htJ) {
        super(2, htJ);
        this.$state = str;
        this.$method = hatchTwoFactorMethod;
        this.$code = str2;
        this.$linkingTosContentVersion = str3;
        this.$attestationRequest = hatchAttestationRequest;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        NativeLoginViewModel$onTwoFactorConfirmClicked$1$result$1 nativeLoginViewModel$onTwoFactorConfirmClicked$1$result$1 = new NativeLoginViewModel$onTwoFactorConfirmClicked$1$result$1(this.$state, this.$method, this.$code, this.$linkingTosContentVersion, this.$attestationRequest, htJ);
        nativeLoginViewModel$onTwoFactorConfirmClicked$1$result$1.L$0 = obj;
        return nativeLoginViewModel$onTwoFactorConfirmClicked$1$result$1;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(String str, HtJ<? super HsJ<? extends HatchAuthCredentials>> htJ) {
        return invoke2(str, (HtJ<? super HsJ<HatchAuthCredentials>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1269twoFactorConfirmbMdYcbs;
        String str = (String) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchAuthApi hatchAuthApi = HatchAuthApi.INSTANCE;
            String str2 = this.$state;
            String str3 = this.$method.id;
            String str4 = this.$code;
            String str5 = this.$linkingTosContentVersion;
            HatchAttestationRequest hatchAttestationRequest = this.$attestationRequest;
            this.L$0 = null;
            this.label = 1;
            objM1269twoFactorConfirmbMdYcbs = hatchAuthApi.m1269twoFactorConfirmbMdYcbs(str, str2, str3, str4, str5, hatchAttestationRequest, this);
            if (objM1269twoFactorConfirmbMdYcbs == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1269twoFactorConfirmbMdYcbs = AnonymousClass001.A0q(obj);
        }
        return C3cG.A0t(objM1269twoFactorConfirmbMdYcbs);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, HtJ<? super HsJ<HatchAuthCredentials>> htJ) {
        return ((NativeLoginViewModel$onTwoFactorConfirmClicked$1$result$1) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
