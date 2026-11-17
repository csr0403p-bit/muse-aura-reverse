package com.facebook.aura.components.reactions;

import X.AT5;
import X.ATD;
import X.AWx;
import X.AXN;
import X.AaJ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C16Z;
import X.C1710Aot;
import X.G0U;
import X.InterfaceC1068ATy;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraRedlineKt$auraRedlineStroke$1$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ InterfaceC1068ATy $path;
    public final /* synthetic */ AT5<Float, ?> $progress;
    public final /* synthetic */ AaJ $stroke;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraRedlineKt$auraRedlineStroke$1$1(AT5<Float, ?> at5, InterfaceC1068ATy interfaceC1068ATy, AaJ aaJ) {
        super(1);
        this.$progress = at5;
        this.$path = interfaceC1068ATy;
        this.$stroke = aaJ;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        C16Z.A00(c16z);
        float fA00 = MutableState.A00(this.$progress);
        if (fA00 <= 0.0f || fA00 >= 1.0f) {
            return;
        }
        float f = (fA00 * 860.0f) - 160.0f;
        if (f > 0.0f) {
            float fEaseOut = AuraReactionMotionKt.easeOut(ATD.A02(f, 160.0f));
            if (fEaseOut > 0.0f) {
                float f2 = f < 60.0f ? f / 60.0f : f < 460.0f ? 1.0f : 1.0f - ((f - 460.0f) / 240.0f);
                float fA002 = AXN.A00(c16z);
                long jADU = c16z.ADU();
                long jA0M = AnonymousClass005.A0M(AnonymousClass001.A00(jADU), AnonymousClass001.A01(jADU, 4294967295L) + c16z.Ah4(AuraRedlineKt.RedlineBaseline));
                long jA03 = AWx.A03(AuraRedlineKt.RedlineStart, fA002, jA0M);
                long jA032 = AWx.A03(AuraRedlineKt.RedlineControlOne, fA002, jA0M);
                long jA033 = AWx.A03(AuraRedlineKt.RedlineControlTwo, fA002, jA0M);
                long jA034 = AWx.A03(AuraRedlineKt.RedlineEnd, fA002, jA0M);
                long jM407lerpWko1d7g = AuraReactionMotionKt.m407lerpWko1d7g(jA03, jA032, fEaseOut);
                long jM407lerpWko1d7g2 = AuraReactionMotionKt.m407lerpWko1d7g(jA032, jA033, fEaseOut);
                long jM407lerpWko1d7g3 = AuraReactionMotionKt.m407lerpWko1d7g(jA033, jA034, fEaseOut);
                long jM407lerpWko1d7g4 = AuraReactionMotionKt.m407lerpWko1d7g(jM407lerpWko1d7g, jM407lerpWko1d7g2, fEaseOut);
                long jM407lerpWko1d7g5 = AuraReactionMotionKt.m407lerpWko1d7g(jM407lerpWko1d7g2, jM407lerpWko1d7g3, fEaseOut);
                ((C1710Aot) this.$path).A03.reset();
                ((C1710Aot) this.$path).A03.moveTo(AnonymousClass001.A00(jA03), AnonymousClass001.A01(jA03, 4294967295L));
                InterfaceC1068ATy interfaceC1068ATy = this.$path;
                float fA003 = AnonymousClass001.A00(jM407lerpWko1d7g);
                float fA01 = AnonymousClass001.A01(jM407lerpWko1d7g, 4294967295L);
                float fA004 = AnonymousClass001.A00(jM407lerpWko1d7g4);
                float fA012 = AnonymousClass001.A01(jM407lerpWko1d7g4, 4294967295L);
                long jM407lerpWko1d7g6 = AuraReactionMotionKt.m407lerpWko1d7g(jM407lerpWko1d7g4, jM407lerpWko1d7g5, fEaseOut);
                ((C1710Aot) interfaceC1068ATy).A03.cubicTo(fA003, fA01, fA004, fA012, AnonymousClass001.A00(jM407lerpWko1d7g6), AnonymousClass001.A01(jM407lerpWko1d7g6, 4294967295L));
                c16z.A9d(null, this.$path, this.$stroke, ATD.A03(f2, 0.0f, 1.0f), 3, AuraRedlineKt.RedlineColor);
            }
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
