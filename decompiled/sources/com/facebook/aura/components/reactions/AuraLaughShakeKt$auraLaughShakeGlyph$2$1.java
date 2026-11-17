package com.facebook.aura.components.reactions;

import X.AOW;
import X.AT5;
import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C2av;
import X.C7384Etj;
import X.C8j3;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraLaughShakeKt$auraLaughShakeGlyph$2$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ float $hopSettleDp;
    public final /* synthetic */ float $hopStartDp;
    public final /* synthetic */ AT5<Float, AOW> $progress;
    public final /* synthetic */ float $shakeLiftDp;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        float fA02;
        float fA022;
        C7384Etj.A0Y(c2av, 0);
        float fA00 = MutableState.A00(this.$progress);
        if (fA00 <= 0.0f || fA00 >= 1.0f) {
            return;
        }
        if (fA00 < 0.46875f) {
            float fEase = AuraLaughShakeKt.ease(fA00 / 0.46875f);
            AXN.A04(c2av, C8j3.A02(this.$hopSettleDp, this.$hopStartDp, fEase));
            c2av.AeX(C8j3.A02(1.06f, 0.86f, fEase));
            c2av.AeY(C8j3.A02(0.9f, 0.86f, fEase));
            return;
        }
        if (fA00 < 0.6015625f) {
            float f = AuraLaughShakeKt.HOP_END;
            float fEase2 = AuraLaughShakeKt.ease(AnonymousClass003.A00((fA00 - 0.46875f) / (0.6015625f - 0.46875f)));
            AXN.A04(c2av, C8j3.A02(0.0f, this.$hopSettleDp, fEase2));
            c2av.AeX(C8j3.A02(1.0f, 1.06f, fEase2));
            c2av.AeY(C8j3.A02(1.0f, 0.9f, fEase2));
            fA022 = C8j3.A02(8.181818f, 0.0f, fEase2);
        } else {
            if (fA00 >= 0.734375f) {
                if (fA00 < 0.8671875f) {
                    float f2 = AuraLaughShakeKt.HOP_END;
                    float fEase3 = AuraLaughShakeKt.ease(AnonymousClass003.A00((fA00 - 0.734375f) / (0.8671875f - 0.734375f)));
                    c2av.AeW(C8j3.A02(0.0f, -8.181818f, fEase3));
                    fA02 = C8j3.A02(this.$shakeLiftDp, 0.0f, fEase3);
                } else {
                    float f3 = this.$shakeLiftDp;
                    float f4 = AuraLaughShakeKt.HOP_END;
                    fA02 = C8j3.A02(0.0f, f3, AuraLaughShakeKt.ease(AnonymousClass003.A00((fA00 - 0.8671875f) / (1.0f - 0.8671875f))));
                }
                AXN.A04(c2av, fA02);
                return;
            }
            float f5 = AuraLaughShakeKt.HOP_END;
            fA022 = C8j3.A02(-8.181818f, 8.181818f, AuraLaughShakeKt.ease(AnonymousClass003.A00((fA00 - 0.6015625f) / (0.734375f - 0.6015625f))));
        }
        c2av.AeW(fA022);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraLaughShakeKt$auraLaughShakeGlyph$2$1(AT5<Float, AOW> at5, float f, float f2, float f3) {
        super(1);
        this.$progress = at5;
        this.$hopStartDp = f;
        this.$hopSettleDp = f2;
        this.$shakeLiftDp = f3;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
