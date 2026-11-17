package com.facebook.aura.components.reactions;

import X.AT5;
import X.ATD;
import X.AXN;
import X.AbstractC7559F3s;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraDoubleTakeKt$auraDoubleTakeGlyph$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ AT5<Float, ?> $progress;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        float fA03 = ATD.A03((MutableState.A00(this.$progress) * 1600.0f) / 500.0f, 0.0f, 1.0f);
        if (fA03 <= 0.0f || fA03 >= 1.0f) {
            return;
        }
        List<Float> list = AuraDoubleTakeKt.StampTranslateY;
        List<Float> list2 = AuraDoubleTakeKt.StampKeyTimes;
        AXN.A04(c2av, AuraReactionMotionKt.smoothKeyframe(list, list2, fA03));
        c2av.AeX(AuraReactionMotionKt.smoothKeyframe(AuraDoubleTakeKt.StampScaleX, list2, fA03));
        c2av.AeY(AuraReactionMotionKt.smoothKeyframe(AuraDoubleTakeKt.StampScaleY, list2, fA03));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraDoubleTakeKt$auraDoubleTakeGlyph$1$1(AT5<Float, ?> at5) {
        super(1);
        this.$progress = at5;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
