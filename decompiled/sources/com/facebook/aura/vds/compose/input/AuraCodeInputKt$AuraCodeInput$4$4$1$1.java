package com.facebook.aura.vds.compose.input;

import X.AOW;
import X.AT5;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.G0V;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraCodeInputKt$AuraCodeInput$4$4$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $activeIndex;
    public final /* synthetic */ float $cellSpacing;
    public final /* synthetic */ String $codeValue;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ MutableState<Boolean> $isFocused$delegate;
    public final /* synthetic */ int $length;
    public final /* synthetic */ boolean $masked;
    public final /* synthetic */ AT5<Float, AOW> $shakeOffset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraCodeInputKt$AuraCodeInput$4$4$1$1(float f, AT5<Float, AOW> at5, boolean z, int i, String str, boolean z2, int i2, boolean z3, MutableState<Boolean> mutableState) {
        super(2);
        this.$cellSpacing = f;
        this.$shakeOffset = at5;
        this.$enabled = z;
        this.$length = i;
        this.$codeValue = str;
        this.$masked = z2;
        this.$activeIndex = i2;
        this.$isError = z3;
        this.$isFocused$delegate = mutableState;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(X.BFM r20, int r21) {
        /*
            r19 = this;
            r1 = r21
            r0 = r21 & 3
            r10 = 0
            boolean r0 = X.AnonymousClass003.A16(r0)
            r11 = r20
            boolean r0 = X.AnonymousClass001.A1b(r0, r11, r1)
            if (r0 == 0) goto Lb0
            r4 = r19
            float r0 = r4.$cellSpacing
            X.9m9 r12 = X.AcQ.A00(r0)
            X.BS0 r9 = X.BRg.A00
            X.ATq r5 = X.C10G.A02
            X.AT5<java.lang.Float, X.AOW> r0 = r4.$shakeOffset
            boolean r1 = r11.A67(r0)
            boolean r0 = r4.$enabled
            boolean r1 = X.AnonymousClass001.A1U(r11, r0, r1)
            X.AT5<java.lang.Float, X.AOW> r3 = r4.$shakeOffset
            boolean r2 = r4.$enabled
            java.lang.Object r0 = r11.AaT()
            if (r1 != 0) goto L37
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L3f
        L37:
            com.facebook.aura.vds.compose.input.AuraCodeInputKt$AuraCodeInput$4$4$1$1$1$1 r0 = new com.facebook.aura.vds.compose.input.AuraCodeInputKt$AuraCodeInput$4$4$1$1$1$1
            r0.<init>(r3, r2)
            r11.Ai0(r0)
        L3f:
            X.BRg r1 = X.AnonymousClass001.A0W(r5, r0)
            int r8 = r4.$length
            java.lang.String r7 = r4.$codeValue
            boolean r15 = r4.$masked
            int r6 = r4.$activeIndex
            boolean r5 = r4.$isError
            androidx.compose.runtime.MutableState<java.lang.Boolean> r4 = r4.$isFocused$delegate
            X.1AC r0 = X.C2VU.A05
            X.AiA r14 = X.C0A8.A00(r12, r11, r0, r10)
            r3 = r11
            X.BBI r3 = (X.BBI) r3
            int r13 = X.AnonymousClass003.A0J(r3)
            X.AKQ r12 = X.BBI.A04(r3)
            X.BRg r2 = X.AxM.A01(r11, r1)
            kotlin.jvm.functions.Function0<X.AkQ> r1 = X.C1515AkP.A00
            X.Ahw<?> r0 = r3.A0V
            if (r0 != 0) goto L72
            X.C00x.A00()
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L72:
            X.AnonymousClass005.A0n(r11, r3, r1)
            X.AnonymousClass005.A0p(r11, r14, r12, r2, r13)
            X.90m r2 = X.C90m.A00
            r0 = -2122758336(0xffffffff81794740, float:-4.5785196E-38)
            r11.AgE(r0)
            r1 = 0
        L81:
            if (r1 >= r8) goto Lac
            java.lang.Character r14 = X.BQG.A15(r7, r1)
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r4)
            if (r0 == 0) goto L91
            r16 = 1
            if (r1 == r6) goto L93
        L91:
            r16 = 0
        L93:
            r12 = 1065353216(0x3f800000, float:1.0)
            r0 = 1
            X.BRg r0 = r2.AiP(r9, r12, r0)
            X.BRg r18 = X.BJe.A00(r0, r12, r10)
            r19 = r11
            r20 = r10
            r21 = r10
            r17 = r5
            com.facebook.aura.vds.compose.input.AuraCodeInputKt.CodeCell(r14, r15, r16, r17, r18, r19, r20, r21)
            int r1 = r1 + 1
            goto L81
        Lac:
            X.AnonymousClass003.A0q(r3)
            return
        Lb0:
            r11.Afo()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.input.AuraCodeInputKt$AuraCodeInput$4$4$1$1.invoke(X.BFM, int):void");
    }
}
