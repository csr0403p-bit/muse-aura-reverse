package com.facebook.aura.components.reactions;

import X.AHD;
import X.AT5;
import X.AWx;
import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.B6A;
import X.C16Z;
import X.C16a;
import X.C8j4;
import X.G0U;
import X.HDi;
import X.HxS;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraMeltReformKt$auraMeltReform$1$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ AHD<B6A> $palette;
    public final /* synthetic */ AT5<Float, ?> $progress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraMeltReformKt$auraMeltReform$1$1(AT5<Float, ?> at5, AHD<B6A> ahd) {
        super(1);
        this.$progress = at5;
        this.$palette = ahd;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        boolean zA1X = C8j4.A1X(c16z);
        float fA00 = MutableState.A00(this.$progress);
        if (fA00 <= 0.0f || fA00 >= 1.0f || this.$palette.isEmpty()) {
            return;
        }
        float f = ((fA00 * 920.0f) - 100.0f) / 820.0f;
        if (f <= 0.0f || f >= 1.0f) {
            return;
        }
        float fA002 = AXN.A00(c16z);
        float fKeyframe = AuraReactionMotionKt.keyframe(AuraMeltReformKt.PuddleScaleTrack, AuraMeltReformKt.PuddleScaleKeyTimes, f);
        long j = AuraMeltReformKt.PuddleSize;
        long jA0L = AnonymousClass005.A0L(C8j4.A00(j, fA002) * fKeyframe, AnonymousClass001.A01(j, 4294967295L) * fA002 * fKeyframe);
        long jA03 = AWx.A03(AuraMeltReformKt.PuddleOffset, fA002, c16z.ADU());
        long jA0P = C8j4.A0P(this.$palette, zA1X ? 1 : 0);
        long jA04 = HxS.A04(HDi.A0O[(int) (jA0P & 63)], B6A.A03(jA0P), B6A.A02(jA0P), B6A.A01(jA0P), 0.85f);
        long jA0L2 = AnonymousClass005.A0L(AnonymousClass001.A00(jA03) - (AnonymousClass001.A00(jA0L) / 2.0f), AnonymousClass001.A01(jA03, 4294967295L) - (AnonymousClass001.A01(jA0L, 4294967295L) / 2.0f));
        c16z.A9a(null, C16a.A00, AuraReactionMotionKt.keyframe(AuraMeltReformKt.PuddleOpacityTrack, AuraMeltReformKt.PuddleOpacityKeyTimes, f), 3, jA04, jA0L2, jA0L);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
