package com.facebook.aura.components.reactions;

import X.AHD;
import X.AT5;
import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.B6A;
import X.C16Z;
import X.C16a;
import X.C8j3;
import X.C8j5;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraDiscoFlashKt$auraDiscoFlash$1$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ AHD<B6A> $palette;
    public final /* synthetic */ AT5<Float, ?> $progress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraDiscoFlashKt$auraDiscoFlash$1$1(AT5<Float, ?> at5, AHD<B6A> ahd) {
        super(1);
        this.$progress = at5;
        this.$palette = ahd;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        C16Z.A00(c16z);
        float fA00 = MutableState.A00(this.$progress);
        if (fA00 <= 0.0f || fA00 >= 1.0f || this.$palette.isEmpty()) {
            return;
        }
        float f = fA00 * 560.0f;
        float fA002 = AXN.A00(c16z);
        int i = 0;
        do {
            float f2 = (f - (70.0f * i)) / 420.0f;
            if (f2 > 0.0f && f2 < 1.0f) {
                float fA01 = AnonymousClass001.A01(c16z.ADU(), 4294967295L) + (((r7 * 12.0f) - 12.0f) * fA002);
                long jA0G = C8j5.A0G(this.$palette, i);
                float fAh4 = c16z.Ah4(AuraDiscoFlashKt.LightSize) / 2.0f;
                float fA003 = AnonymousClass001.A00(c16z.ADU());
                float f3 = 34.0f * fA002;
                c16z.A9N(null, C16a.A00, fAh4, AuraReactionMotionKt.keyframe(AuraDiscoFlashKt.LightOpacityTrack, AuraDiscoFlashKt.LightOpacityKeyTimes, f2) * 0.75f, 3, jA0G, AnonymousClass005.A0L(C8j3.A02(fA003 + f3, fA003 - f3, AuraReactionMotionKt.easeInOut(f2)), fA01));
            }
            i++;
        } while (i < 3);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
