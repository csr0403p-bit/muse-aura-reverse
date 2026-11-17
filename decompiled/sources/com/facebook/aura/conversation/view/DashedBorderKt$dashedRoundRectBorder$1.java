package com.facebook.aura.conversation.view;

import X.AT3;
import X.AaJ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C1778Aqa;
import X.C7384Etj;
import X.C8j3;
import X.C8j4;
import X.G0U;
import android.graphics.DashPathEffect;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class DashedBorderKt$dashedRoundRectBorder$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ long $color;
    public final /* synthetic */ float $cornerRadius;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        float fAh4 = at3.Ah4(1.0f);
        float fAh42 = at3.Ah4(2.0f);
        float f = fAh4 / 2.0f;
        float fAh43 = at3.Ah4(this.$cornerRadius) - f;
        if (fAh43 < 0.0f) {
            fAh43 = 0.0f;
        }
        long j = this.$color;
        long jA0P = C8j3.A0P(f);
        long jAKb = at3.AKb();
        float f2 = f * 2.0f;
        at3.A9j(null, AaJ.A00(new C1778Aqa(new DashPathEffect(new float[]{fAh42, fAh42}, 0.0f)), fAh4, 0), 1.0f, 3, j, (jA0P << 32) | (jA0P & 4294967295L), AnonymousClass005.A0M(AnonymousClass001.A00(jAKb) - f2, AnonymousClass001.A01(jAKb, 4294967295L) - f2), C8j4.A0J(fAh43));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashedBorderKt$dashedRoundRectBorder$1(float f, long j) {
        super(1);
        this.$cornerRadius = f;
        this.$color = j;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
