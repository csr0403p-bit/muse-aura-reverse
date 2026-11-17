package com.facebook.aura.activation.view;

import X.ART;
import X.ASR;
import X.AST;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.B6A;
import X.C16Z;
import X.C16a;
import X.C1DO;
import X.C1EQ;
import X.C7384Etj;
import X.G0U;
import X.HDi;
import X.HxS;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraInviteFriendSheetKt$fadeEdgesInto$1 extends AbstractC7559F3s implements G0U<AST, ASR> {
    public final /* synthetic */ long $color;

    /* renamed from: com.facebook.aura.activation.view.AuraInviteFriendSheetKt$fadeEdgesInto$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
        public final /* synthetic */ C1EQ $bottomFade;
        public final /* synthetic */ C1EQ $endFade;
        public final /* synthetic */ float $fade;
        public final /* synthetic */ C1EQ $startFade;
        public final /* synthetic */ C1EQ $topFade;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C1EQ c1eq, float f, C1EQ c1eq2, C1EQ c1eq3, C1EQ c1eq4) {
            super(1);
            this.$topFade = c1eq;
            this.$fade = f;
            this.$bottomFade = c1eq2;
            this.$startFade = c1eq3;
            this.$endFade = c1eq4;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C16Z c16z) {
            C16Z.A00(c16z);
            C1EQ c1eq = this.$topFade;
            float fA00 = AnonymousClass001.A00(c16z.AKb());
            float f = this.$fade;
            long jFloatToRawIntBits = Float.floatToRawIntBits(fA00);
            C16a c16a = C16a.A00;
            c16z.A9f(c1eq, null, c16a, 1.0f, 3, 0L, (Float.floatToRawIntBits(f) & 4294967295L) | (jFloatToRawIntBits << 32));
            C1EQ c1eq2 = this.$bottomFade;
            long jAKb = c16z.AKb();
            float fA01 = AnonymousClass001.A01(jAKb, 4294967295L) - this.$fade;
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
            long jFloatToRawIntBits3 = (jFloatToRawIntBits2 << 32) | (Float.floatToRawIntBits(fA01) & 4294967295L);
            c16z.A9f(c1eq2, null, c16a, 1.0f, 3, jFloatToRawIntBits3, ART.A00(jAKb, jFloatToRawIntBits3));
            c16z.A9f(this.$startFade, null, c16a, 1.0f, 3, 0L, AnonymousClass005.A0M(this.$fade, AnonymousClass001.A01(c16z.AKb(), 4294967295L)));
            long jFloatToRawIntBits4 = (Float.floatToRawIntBits(AnonymousClass001.A00(r2) - this.$fade) << 32) | (jFloatToRawIntBits2 & 4294967295L);
            c16z.A9f(this.$endFade, null, c16a, 1.0f, 3, jFloatToRawIntBits4, ART.A00(c16z.AKb(), jFloatToRawIntBits4));
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
            invoke2(c16z);
            return Unit.INSTANCE;
        }
    }

    @Override // X.G0U
    public final ASR invoke(AST ast) {
        C7384Etj.A0Y(ast, 0);
        float fAEm = 32.0f * ast.AEm();
        long j = this.$color;
        List listA17 = AnonymousClass004.A17(new B6A(j), HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.0f));
        return ast.A01(new AnonymousClass1(C1EQ.A01(listA17, 0.0f, fAEm), fAEm, C1EQ.A01(AbstractC0878AGe.A0V(listA17), AnonymousClass001.A01(ast.A00.AKb(), 4294967295L) - fAEm, AnonymousClass001.A01(ast.A00.AKb(), 4294967295L)), C1EQ.A00(listA17, 0.0f, fAEm), C1EQ.A00(AbstractC0878AGe.A0V(listA17), C1DO.A00(ast) - fAEm, C1DO.A00(ast))));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraInviteFriendSheetKt$fadeEdgesInto$1(long j) {
        super(1);
        this.$color = j;
    }
}
