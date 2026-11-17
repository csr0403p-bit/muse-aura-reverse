package com.facebook.aura.components.reactions;

import X.AT5;
import X.AbstractC7559F3s;
import X.C2av;
import X.C7384Etj;
import X.C8j5;
import X.G0U;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraSingleClapKt$auraSingleClapGlyph$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ AT5<Float, ?> $progress;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        float fA00 = MutableState.A00(this.$progress);
        if (fA00 <= 0.0f || fA00 >= 1.0f) {
            return;
        }
        float f = ((fA00 * 600.0f) - 200.0f) / 280.0f;
        if (f > 0.0f) {
            List<Float> list = AuraSingleClapKt.ClapScales;
            if (f > 1.0f) {
                f = 1.0f;
            }
            C8j5.A0g(c2av, list, f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSingleClapKt$auraSingleClapGlyph$1$1(AT5<Float, ?> at5) {
        super(1);
        this.$progress = at5;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
