package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HsJ;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchAuthApi$sendOtp$2", f = "HatchAuthApi.kt", l = {137}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAuthApi$sendOtp$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends HatchAuthOtpSent>>, Object> {
    public final /* synthetic */ String $contactPoint;
    public final /* synthetic */ boolean $declinedNtpUpsell;
    public final /* synthetic */ String $priorAuthState;
    public final /* synthetic */ String $region;
    public final /* synthetic */ String $registrationSource;
    public final /* synthetic */ String $tempToken;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuthApi$sendOtp$2(String str, String str2, String str3, String str4, boolean z, String str5, HtJ<? super HatchAuthApi$sendOtp$2> htJ) {
        super(2, htJ);
        this.$contactPoint = str;
        this.$region = str2;
        this.$priorAuthState = str3;
        this.$registrationSource = str4;
        this.$declinedNtpUpsell = z;
        this.$tempToken = str5;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAuthApi$sendOtp$2(this.$contactPoint, this.$region, this.$priorAuthState, this.$registrationSource, this.$declinedNtpUpsell, this.$tempToken, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends HatchAuthOtpSent>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<HatchAuthOtpSent>>) htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.facebook.aura.network.AuraHttpResponse] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi$sendOtp$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<HatchAuthOtpSent>> htJ) {
        return ((HatchAuthApi$sendOtp$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
