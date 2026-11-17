package com.facebook.aura.vds.compose.divider;

import X.AT3;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1778Aqa;
import X.C7384Etj;
import X.C8j3;
import X.C8j4;
import X.G0U;
import android.graphics.DashPathEffect;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraDashedDividerKt$AuraDashedDivider$1$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ long $color;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        C1778Aqa c1778Aqa = new C1778Aqa(new DashPathEffect(new float[]{at3.Ah4(2.0f), at3.Ah4(2.0f)}, 0.0f));
        long j = this.$color;
        long jAKb = at3.AKb();
        float fA01 = AnonymousClass001.A01(jAKb, 4294967295L) / 2.0f;
        long jA0P = C8j3.A0P(0.0f);
        long jA0P2 = C8j3.A0P(fA01) & 4294967295L;
        at3.A9X(null, c1778Aqa, at3.Ah4(1.0f), 1.0f, 0, 3, j, jA0P2 | (jA0P << 32), jA0P2 | C8j4.A0K(AnonymousClass001.A00(jAKb)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraDashedDividerKt$AuraDashedDivider$1$1(long j) {
        super(1);
        this.$color = j;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
