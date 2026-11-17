package com.facebook.aura.components.reactions;

import X.AT5;
import X.ATD;
import X.AXN;
import X.AbstractC7559F3s;
import X.C2av;
import X.C7384Etj;
import X.C8j3;
import X.G0U;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraSaluteKt$auraSaluteGlyph$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ AT5<Float, ?> $progress;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        float fA00 = MutableState.A00(this.$progress);
        if (fA00 <= 0.0f || fA00 >= 1.0f) {
            return;
        }
        float f = fA00 * 800.0f;
        c2av.Acj(C8j3.A02(1.0f, 0.15f, ATD.A02(f, 140.0f)));
        float fA02 = ATD.A02(f, 620.0f);
        if (fA02 < 1.0f) {
            float fEaseInOut = AuraReactionMotionKt.easeInOut(fA02);
            List<Float> list = AuraSaluteKt.SaluteRiseDy;
            List<Float> list2 = AuraSaluteKt.SaluteEntranceKeyTimes;
            AXN.A04(c2av, AuraReactionMotionKt.keyframe(list, list2, fEaseInOut));
            float fKeyframe = AuraReactionMotionKt.keyframe(AuraSaluteKt.SaluteScales, list2, fEaseInOut);
            c2av.AeX(fKeyframe);
            c2av.AeY(fKeyframe);
            c2av.AeW(AuraReactionMotionKt.keyframe(AuraSaluteKt.SaluteDegrees, AuraSaluteKt.SaluteTurnKeyTimes, fEaseInOut));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSaluteKt$auraSaluteGlyph$1$1(AT5<Float, ?> at5) {
        super(1);
        this.$progress = at5;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
