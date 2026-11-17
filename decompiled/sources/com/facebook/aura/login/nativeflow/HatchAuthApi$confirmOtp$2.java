package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HsJ;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchAuthApi$confirmOtp$2", f = "HatchAuthApi.kt", l = {182, 185}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAuthApi$confirmOtp$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends HatchAuthCredentials>>, Object> {
    public final /* synthetic */ String $authState;
    public final /* synthetic */ String $otpCode;
    public final /* synthetic */ String $tempToken;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuthApi$confirmOtp$2(String str, String str2, String str3, HtJ<? super HatchAuthApi$confirmOtp$2> htJ) {
        super(2, htJ);
        this.$authState = str;
        this.$otpCode = str2;
        this.$tempToken = str3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAuthApi$confirmOtp$2(this.$authState, this.$otpCode, this.$tempToken, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends HatchAuthCredentials>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<HatchAuthCredentials>>) htJ);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:(1:(3:6|7|8)(2:47|48))(1:12))(2:9|(1:11))|13|53|14|17|(10:19|(1:33)|23|24|25|(2:51|41)|44|(1:46)|7|8)(7:(1:40)(2:49|37)|25|(0)|44|(0)|7|8)) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        r3 = X.C3cG.A0J(r6, X.C3cG.A0I(null, r6), X.C3cH.A0d(r6, r7, r5), r5);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi$confirmOtp$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<HatchAuthCredentials>> htJ) {
        return ((HatchAuthApi$confirmOtp$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
