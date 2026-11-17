package com.facebook.aura.ui;

import X.AT3;
import X.AW9;
import X.AbstractC1290Aga;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.B6A;
import X.C16a;
import X.C7384Etj;
import X.C8j3;
import X.G0U;
import X.HDi;
import X.HxS;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchHighlightGlowKt$highlightGlow$2$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ Function0<Float> $alpha;
    public final /* synthetic */ long $color;
    public final /* synthetic */ float $cornerRadius;
    public final /* synthetic */ B6A $coverColor;
    public final /* synthetic */ Paint $paint;
    public final /* synthetic */ float $topExpand;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        float fA04 = AnonymousClass003.A04(this.$alpha);
        if (fA04 > 0.0f) {
            float f = -at3.Ah4(this.$topExpand);
            float fAh4 = at3.Ah4(this.$cornerRadius);
            long j = this.$color;
            int iA01 = HxS.A01(HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), fA04));
            this.$paint.setColor(0);
            this.$paint.setShadowLayer(at3.Ah4(HatchHighlightGlowKt.HighlightGlowBlurRadius), 0.0f, 0.0f, iA01);
            Canvas canvasA00 = AbstractC1290Aga.A00(AW9.A01(at3));
            long jAKb = at3.AKb();
            canvasA00.drawRoundRect(0.0f, f, AnonymousClass001.A00(jAKb), AnonymousClass001.A01(jAKb, 4294967295L), fAh4, fAh4, this.$paint);
            B6A b6a = this.$coverColor;
            if (b6a != null) {
                long j2 = b6a.A00;
                long jA0L = AnonymousClass005.A0L(0.0f, f);
                long jAKb2 = at3.AKb();
                at3.A9j(null, C16a.A00, 1.0f, 3, j2, jA0L, AnonymousClass005.A0M(AnonymousClass001.A00(jAKb2), AnonymousClass001.A01(jAKb2, 4294967295L) - f), C8j3.A0O(fAh4));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchHighlightGlowKt$highlightGlow$2$1(Function0<Float> function0, float f, float f2, long j, Paint paint, B6A b6a) {
        super(1);
        this.$alpha = function0;
        this.$topExpand = f;
        this.$cornerRadius = f2;
        this.$color = j;
        this.$paint = paint;
        this.$coverColor = b6a;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
