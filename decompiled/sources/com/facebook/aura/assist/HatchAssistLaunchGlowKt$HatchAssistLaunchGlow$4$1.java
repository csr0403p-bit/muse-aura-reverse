package com.facebook.aura.assist;

import X.ASR;
import X.AST;
import X.AT3;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.B6A;
import X.C16a;
import X.C1DO;
import X.C1EQ;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAssistLaunchGlowKt$HatchAssistLaunchGlow$4$1 extends AbstractC7559F3s implements G0U<AST, ASR> {
    public final /* synthetic */ long $color;

    /* renamed from: com.facebook.aura.assist.HatchAssistLaunchGlowKt$HatchAssistLaunchGlow$4$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
        public final /* synthetic */ C1EQ $bottomBrush;
        public final /* synthetic */ C1EQ $leftBrush;
        public final /* synthetic */ C1EQ $rightBrush;
        public final /* synthetic */ float $t;
        public final /* synthetic */ C1EQ $topBrush;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AT3 at3) {
            C7384Etj.A0Y(at3, 0);
            C1EQ c1eq = this.$topBrush;
            float fA00 = AnonymousClass001.A00(at3.AKb());
            float f = this.$t;
            long jFloatToRawIntBits = Float.floatToRawIntBits(fA00);
            C16a c16a = C16a.A00;
            at3.A9f(c1eq, null, c16a, 1.0f, 3, 0L, (Float.floatToRawIntBits(f) & 4294967295L) | (jFloatToRawIntBits << 32));
            C1EQ c1eq2 = this.$bottomBrush;
            long jAKb = at3.AKb();
            float fA01 = AnonymousClass001.A01(jAKb, 4294967295L);
            float f2 = this.$t;
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
            at3.A9f(c1eq2, null, c16a, 1.0f, 3, (jFloatToRawIntBits2 << 32) | (Float.floatToRawIntBits(fA01 - f2) & 4294967295L), AnonymousClass005.A0L(AnonymousClass001.A00(jAKb), f2));
            at3.A9f(this.$leftBrush, null, c16a, 1.0f, 3, 0L, AnonymousClass005.A0L(this.$t, AnonymousClass001.A01(at3.AKb(), 4294967295L)));
            C1EQ c1eq3 = this.$rightBrush;
            long jAKb2 = at3.AKb();
            float fA002 = AnonymousClass001.A00(jAKb2);
            at3.A9f(c1eq3, null, c16a, 1.0f, 3, (Float.floatToRawIntBits(fA002 - r6) << 32) | (jFloatToRawIntBits2 & 4294967295L), AnonymousClass005.A0L(this.$t, AnonymousClass001.A01(jAKb2, 4294967295L)));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C1EQ c1eq, float f, C1EQ c1eq2, C1EQ c1eq3, C1EQ c1eq4) {
            super(1);
            this.$topBrush = c1eq;
            this.$t = f;
            this.$bottomBrush = c1eq2;
            this.$leftBrush = c1eq3;
            this.$rightBrush = c1eq4;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
            invoke2(at3);
            return Unit.INSTANCE;
        }
    }

    @Override // X.G0U
    public final ASR invoke(AST ast) {
        C7384Etj.A0Y(ast, 0);
        float fAEm = HatchAssistLaunchGlowKt.GLOW_THICKNESS * ast.AEm();
        B6A b6a = new B6A(this.$color);
        long j = B6A.A06;
        return ast.A00(new AnonymousClass1(C1EQ.A01(AnonymousClass004.A17(b6a, j), 0.0f, fAEm), fAEm, C1EQ.A01(AnonymousClass004.A17(new B6A(j), this.$color), AnonymousClass001.A01(ast.A00.AKb(), 4294967295L) - fAEm, AnonymousClass001.A01(ast.A00.AKb(), 4294967295L)), C1EQ.A00(AnonymousClass004.A17(new B6A(this.$color), j), 0.0f, fAEm), C1EQ.A00(AnonymousClass004.A17(new B6A(j), this.$color), AnonymousClass001.A00(ast.A00.AKb()) - fAEm, C1DO.A00(ast))));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistLaunchGlowKt$HatchAssistLaunchGlow$4$1(long j) {
        super(1);
        this.$color = j;
    }
}
