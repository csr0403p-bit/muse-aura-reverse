package com.facebook.aura.components.reactions;

import X.AOW;
import X.AT5;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraAwkwardShiverKt$auraAwkwardShiverGlyph$2$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ List<Float> $offsetsDp;
    public final /* synthetic */ AT5<Float, AOW> $progress;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        float fA02;
        float fA022;
        float f;
        C7384Etj.A0Y(c2av, 0);
        float fA00 = MutableState.A00(this.$progress);
        if (fA00 > 0.0f) {
            if (fA00 < 1.0f) {
                int i = (int) (fA00 / 0.25f);
                int size = AuraAwkwardShiverKt.ShiverOffsets.size();
                if (i > size) {
                    i = size;
                }
                float fShiverEase = AuraAwkwardShiverKt.shiverEase((fA00 - (i * 0.25f)) / 0.25f);
                if (i == 0) {
                    fA02 = 0.0f;
                    fA022 = 0.0f;
                    f = 0.96f;
                } else {
                    int i2 = i - 1;
                    fA02 = AnonymousClass001.A02(this.$offsetsDp.get(i2));
                    fA022 = AnonymousClass001.A02(AuraAwkwardShiverKt.ShiverDegrees.get(i2));
                    f = 0.98f;
                }
                float fA023 = i < this.$offsetsDp.size() ? AnonymousClass001.A02(this.$offsetsDp.get(i)) : 0.0f;
                List<Float> list = AuraAwkwardShiverKt.ShiverDegrees;
                float fA024 = i < list.size() ? AnonymousClass001.A02(list.get(i)) : 0.0f;
                float f2 = i < this.$offsetsDp.size() ? 0.98f : 1.0f;
                c2av.Af5((fA02 + ((fA023 - fA02) * fShiverEase)) * c2av.AEm());
                c2av.AeW(fA022 + ((fA024 - fA022) * fShiverEase));
                float f3 = f + ((f2 - f) * fShiverEase);
                c2av.AeX(f3);
                c2av.AeY(f3);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraAwkwardShiverKt$auraAwkwardShiverGlyph$2$1(AT5<Float, AOW> at5, List<Float> list) {
        super(1);
        this.$progress = at5;
        this.$offsetsDp = list;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
