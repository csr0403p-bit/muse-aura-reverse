package com.facebook.aura.activation.view;

import X.ART;
import X.ASR;
import X.AST;
import X.AT3;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.B6A;
import X.C16a;
import X.C1EQ;
import X.C7384Etj;
import X.C8j3;
import X.C8j4;
import X.G0U;
import X.HxE;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraGridBackgroundKt$auraGridBackground$1 extends AbstractC7559F3s implements G0U<AST, ASR> {
    public final /* synthetic */ long $fadeColor;

    /* renamed from: com.facebook.aura.activation.view.AuraGridBackgroundKt$auraGridBackground$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
        public final /* synthetic */ float $cellPx;
        public final /* synthetic */ C1EQ $fadeBrush;
        public final /* synthetic */ float $strokePx;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AT3 at3) {
            long jAKb;
            C7384Etj.A0Y(at3, 0);
            float fA00 = AnonymousClass001.A00(at3.AKb());
            float f = this.$cellPx;
            float f2 = (fA00 % f) / 2.0f;
            while (true) {
                jAKb = at3.AKb();
                if (f2 > AnonymousClass001.A00(jAKb)) {
                    break;
                }
                long j = AuraGridBackgroundKt.GRID_LINE_COLOR;
                long jA0P = C8j3.A0P(f2) << 32;
                at3.A9X(null, null, this.$strokePx, 0.15f, 0, 3, j, jA0P | (C8j3.A0P(0.0f) & 4294967295L), jA0P | (C8j3.A0P(AnonymousClass001.A01(jAKb, 4294967295L)) & 4294967295L));
                f = this.$cellPx;
                f2 += f;
            }
            float fA01 = (AnonymousClass001.A01(jAKb, 4294967295L) % f) / 2.0f;
            while (true) {
                long jAKb2 = at3.AKb();
                if (fA01 > AnonymousClass001.A01(jAKb2, 4294967295L)) {
                    at3.A9f(this.$fadeBrush, null, C16a.A00, 1.0f, 3, 0L, ART.A00(jAKb2, 0L));
                    return;
                } else {
                    long j2 = AuraGridBackgroundKt.GRID_LINE_COLOR;
                    long jA0P2 = C8j3.A0P(0.0f);
                    long jA0P3 = C8j3.A0P(fA01) & 4294967295L;
                    long jA0K = C8j4.A0K(AnonymousClass001.A00(jAKb2)) | jA0P3;
                    at3.A9X(null, null, this.$strokePx, 0.15f, 0, 3, j2, (jA0P2 << 32) | jA0P3, jA0K);
                    fA01 += this.$cellPx;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f, float f2, C1EQ c1eq) {
            super(1);
            this.$cellPx = f;
            this.$strokePx = f2;
            this.$fadeBrush = c1eq;
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
        float fAEm = AuraGridBackgroundKt.GRID_CELL_SIZE * ast.AEm();
        float fAEm2 = AuraGridBackgroundKt.GRID_LINE_WIDTH * ast.AEm();
        HxE hxEA17 = C8j4.A17(AnonymousClass005.A0a(), B6A.A06);
        Float fValueOf = Float.valueOf(0.7f);
        long j = this.$fadeColor;
        return ast.A00(new AnonymousClass1(fAEm, fAEm2, C1EQ.A02(new HxE[]{hxEA17, C8j4.A17(fValueOf, j), AnonymousClass007.A0g(1.0f, j)}, Float.POSITIVE_INFINITY)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraGridBackgroundKt$auraGridBackground$1(long j) {
        super(1);
        this.$fadeColor = j;
    }
}
