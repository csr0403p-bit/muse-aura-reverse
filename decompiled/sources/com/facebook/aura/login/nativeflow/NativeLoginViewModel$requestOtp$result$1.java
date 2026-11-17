package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.analytics.hatch.authflow.HatchAuthFlowContext;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$requestOtp$result$1", f = "NativeLoginViewModel.kt", l = {2709}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class NativeLoginViewModel$requestOtp$result$1 extends AbstractC07127nr implements G0V<String, HtJ<? super HsJ<? extends HatchAuthOtpSent>>, Object> {
    public final /* synthetic */ boolean $afterDeclinedUpsell;
    public final /* synthetic */ String $contactPoint;
    public final /* synthetic */ String $priorAuthState;
    public final /* synthetic */ String $regionHint;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginViewModel$requestOtp$result$1(String str, String str2, String str3, boolean z, HtJ<? super NativeLoginViewModel$requestOtp$result$1> htJ) {
        super(2, htJ);
        this.$contactPoint = str;
        this.$regionHint = str2;
        this.$priorAuthState = str3;
        this.$afterDeclinedUpsell = z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        NativeLoginViewModel$requestOtp$result$1 nativeLoginViewModel$requestOtp$result$1 = new NativeLoginViewModel$requestOtp$result$1(this.$contactPoint, this.$regionHint, this.$priorAuthState, this.$afterDeclinedUpsell, htJ);
        nativeLoginViewModel$requestOtp$result$1.L$0 = obj;
        return nativeLoginViewModel$requestOtp$result$1;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(String str, HtJ<? super HsJ<? extends HatchAuthOtpSent>> htJ) {
        return invoke2(str, (HtJ<? super HsJ<HatchAuthOtpSent>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1264sendOtpbMdYcbs;
        String str = (String) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchAuthApi hatchAuthApi = HatchAuthApi.INSTANCE;
            String str2 = this.$contactPoint;
            String str3 = this.$regionHint;
            String str4 = this.$priorAuthState;
            String str5 = HatchAuthFlowContext.INSTANCE.snapshot().registrationSource;
            boolean z = this.$afterDeclinedUpsell;
            this.L$0 = null;
            this.label = 1;
            objM1264sendOtpbMdYcbs = hatchAuthApi.m1264sendOtpbMdYcbs(str, str2, str3, str4, str5, z, this);
            if (objM1264sendOtpbMdYcbs == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1264sendOtpbMdYcbs = AnonymousClass001.A0q(obj);
        }
        return C3cG.A0t(objM1264sendOtpbMdYcbs);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, HtJ<? super HsJ<HatchAuthOtpSent>> htJ) {
        return ((NativeLoginViewModel$requestOtp$result$1) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
