package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.C27k;
import X.C3UX;
import X.F1F;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.HwV;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$offerDiscoverablePasskey$probed$1", f = "NativeLoginViewModel.kt", l = {3040, 3050, 3051}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class NativeLoginViewModel$offerDiscoverablePasskey$probed$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HwV<? extends String, ? extends HatchPasskeyRequestOptions, ? extends Boolean>>, Object> {
    public final /* synthetic */ C27k<Boolean> $googleCheck;
    public final /* synthetic */ C27k<HsJ<String>> $mint;
    public final /* synthetic */ F1F $probeFinished;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ NativeLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginViewModel$offerDiscoverablePasskey$probed$1(C27k<HsJ<String>> c27k, F1F f1f, NativeLoginViewModel nativeLoginViewModel, C27k<Boolean> c27k2, HtJ<? super NativeLoginViewModel$offerDiscoverablePasskey$probed$1> htJ) {
        super(2, htJ);
        this.$mint = c27k;
        this.$probeFinished = f1f;
        this.this$0 = nativeLoginViewModel;
        this.$googleCheck = c27k2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new NativeLoginViewModel$offerDiscoverablePasskey$probed$1(this.$mint, this.$probeFinished, this.this$0, this.$googleCheck, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HwV<? extends String, ? extends HatchPasskeyRequestOptions, ? extends Boolean>> htJ) {
        return invoke2(c3ux, (HtJ<? super HwV<String, HatchPasskeyRequestOptions, Boolean>>) htJ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r8 == r6) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 3
            r1 = 2
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L21
            if (r0 == r3) goto L2f
            if (r0 == r1) goto L61
            if (r0 != r5) goto L7e
            java.lang.Object r2 = r7.L$3
            java.lang.Object r1 = r7.L$2
            X.Hwg.A00(r8)
        L17:
            X.HwV r4 = new X.HwV
            r4.<init>(r2, r1, r8)
        L1c:
            X.F1F r0 = r7.$probeFinished
            r0.element = r3
            return r4
        L21:
            X.Hwg.A00(r8)
            X.27k<X.HsJ<java.lang.String>> r0 = r7.$mint
            r7.label = r3
            java.lang.Object r8 = X.C3cG.A0W(r0, r7)
            if (r8 != r6) goto L32
        L2e:
            return r6
        L2f:
            X.Hwg.A00(r8)
        L32:
            X.HsJ r8 = (X.HsJ) r8
            java.lang.Object r2 = r8.value
            boolean r0 = r2 instanceof X.C10571Hud
            if (r0 == 0) goto L3b
            r2 = r4
        L3b:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L54
            com.facebook.aura.analytics.hatch.passkey.HatchPasskeyLogger r2 = com.facebook.aura.analytics.hatch.passkey.HatchPasskeyLogger.INSTANCE
            com.facebook.aura.analytics.hatch.passkey.HatchPasskeyEvent r1 = com.facebook.aura.analytics.hatch.passkey.HatchPasskeyEvent.FETCH_CHALLENGE_ERROR
            com.facebook.aura.analytics.hatch.passkey.HatchPasskeyErrorType r0 = com.facebook.aura.analytics.hatch.passkey.HatchPasskeyErrorType.TEMP_TOKEN_UNAVAILABLE
            java.lang.String r0 = r0.getValue()
            r2.log(r1, r0)
            java.lang.String r1 = "NativeLoginViewModel"
            java.lang.String r0 = "discoverable passkey offer skipped: no temp token"
            X.CFK.A06(r1, r0)
            goto L1c
        L54:
            com.facebook.aura.login.nativeflow.NativeLoginViewModel r0 = r7.this$0
            r7.L$0 = r2
            r7.label = r1
            java.lang.Object r8 = com.facebook.aura.login.nativeflow.NativeLoginViewModel.access$discoverableOffer(r0, r2, r7)
            if (r8 != r6) goto L66
            return r6
        L61:
            java.lang.Object r2 = r7.L$0
            X.Hwg.A00(r8)
        L66:
            if (r8 == 0) goto L1c
            X.27k<java.lang.Boolean> r1 = r7.$googleCheck
            r0 = 0
            r7.L$0 = r0
            r7.L$1 = r0
            r7.L$2 = r8
            r7.L$3 = r2
            r7.label = r5
            java.lang.Object r0 = X.C3cG.A0W(r1, r7)
            if (r0 == r6) goto L2e
            r1 = r8
            r8 = r0
            goto L17
        L7e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel$offerDiscoverablePasskey$probed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HwV<String, HatchPasskeyRequestOptions, Boolean>> htJ) {
        return ((NativeLoginViewModel$offerDiscoverablePasskey$probed$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
