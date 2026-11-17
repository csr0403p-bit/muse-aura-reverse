package com.facebook.aura.components.reactions;

import X.AT2;
import X.AT5;
import X.ATD;
import X.AWx;
import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C16Z;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.G0U;
import X.InterfaceC1068ATy;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraHeartEyesKt$auraHeartEyes$1$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ InterfaceC1068ATy $path;
    public final /* synthetic */ AT5<Float, ?> $progress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraHeartEyesKt$auraHeartEyes$1$1(AT5<Float, ?> at5, InterfaceC1068ATy interfaceC1068ATy) {
        super(1);
        this.$progress = at5;
        this.$path = interfaceC1068ATy;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        long jM408quadraticPointAt428G9Dg;
        C16Z.A00(c16z);
        float fA00 = MutableState.A00(this.$progress);
        if (fA00 <= 0.0f || fA00 >= 1.0f) {
            return;
        }
        float f = fA00 * 680.0f;
        float fA002 = AXN.A00(c16z);
        List<Float> list = AuraHeartEyesKt.HeartSides;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            float f2 = (f - (i * 60.0f)) / 620.0f;
            if (f2 > 0.0f && f2 < 1.0f) {
                float fA03 = C8j4.A03(list, i);
                float fEaseInOut = AuraReactionMotionKt.easeInOut(f2);
                long jADU = c16z.ADU();
                long j = AuraHeartEyesKt.HeartOut;
                long jA03 = AWx.A03(AnonymousClass005.A0M(C8j4.A00(j, fA03), AnonymousClass001.A01(j, 4294967295L)), fA002, jADU);
                if (fEaseInOut < 0.5248f) {
                    long j2 = AuraHeartEyesKt.HeartOutControl;
                    jM408quadraticPointAt428G9Dg = AuraReactionMotionKt.m408quadraticPointAt428G9Dg(jADU, AWx.A03(AnonymousClass005.A0M(C8j4.A00(j2, fA03), AnonymousClass001.A01(j2, 4294967295L)), fA002, jADU), jA03, fEaseInOut / 0.5248f);
                } else {
                    long j3 = AuraHeartEyesKt.HeartBackControl;
                    long jA032 = AWx.A03(AnonymousClass005.A0M(C8j4.A00(j3, fA03), AnonymousClass001.A01(j3, 4294967295L)), fA002, jADU);
                    long j4 = AuraHeartEyesKt.HeartBack;
                    jM408quadraticPointAt428G9Dg = AuraReactionMotionKt.m408quadraticPointAt428G9Dg(jA03, jA032, AWx.A03(AnonymousClass005.A0L(C8j4.A00(j4, fA03), AnonymousClass001.A01(j4, 4294967295L)), fA002, jADU), (fEaseInOut - 0.5248f) / 0.4752f);
                }
                float fA01 = 1.0f - ATD.A01(f2);
                float fAh4 = c16z.Ah4(AuraHeartEyesKt.HeartSize) * C8j3.A02(0.4f, 1.0f, f2);
                float f3 = fAh4 / 2.0f;
                float fA003 = AnonymousClass001.A00(jM408quadraticPointAt428G9Dg) - f3;
                float fA012 = AnonymousClass001.A01(jM408quadraticPointAt428G9Dg, 4294967295L) - f3;
                InterfaceC1068ATy interfaceC1068ATy = this.$path;
                AT2 at2A00 = AT2.A00(c16z, fA003, fA012);
                try {
                    AuraReactionShapesKt.heartPath(interfaceC1068ATy, fAh4);
                    C8j4.A1K(c16z, interfaceC1068ATy, fA01, C8j5.A0G(AuraHeartEyesKt.HeartTint, i));
                } finally {
                    AT2.A01(at2A00, fA003, fA012);
                }
            }
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
