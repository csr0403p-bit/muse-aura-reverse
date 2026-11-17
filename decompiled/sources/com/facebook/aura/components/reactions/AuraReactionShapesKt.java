package com.facebook.aura.components.reactions;

import X.C1710Aot;
import X.C7384Etj;
import X.C8j3;
import X.InterfaceC1068ATy;
import android.graphics.Path;

/* loaded from: classes4.dex */
public abstract class AuraReactionShapesKt {
    public static final float TEAR_DROP_WIDTH_RATIO = 0.72f;

    public static final InterfaceC1068ATy heartPath(InterfaceC1068ATy interfaceC1068ATy, float f) {
        C7384Etj.A0Y(interfaceC1068ATy, 0);
        Path path = ((C1710Aot) interfaceC1068ATy).A03;
        path.reset();
        float f2 = f / 2.0f;
        path.moveTo(f2, f);
        float f3 = f * 0.78f;
        float f4 = f * 0.6f;
        path.cubicTo(f * 0.18f, f3, 0.0f, f4, 0.0f, f * 0.32f);
        float f5 = 0.05f * f;
        float f6 = 0.5f * f;
        float f7 = 0.55f * f;
        interfaceC1068ATy.A4i(C8j3.A0f(0.0f, f5, f6, f7), 180.0f, 180.0f, false);
        interfaceC1068ATy.A4i(C8j3.A0f(f6, f5, f, f7), 180.0f, 180.0f, false);
        path.cubicTo(f, f4, f * 0.82f, f3, f2, f);
        path.close();
        return interfaceC1068ATy;
    }

    public static final InterfaceC1068ATy tearDropPath(InterfaceC1068ATy interfaceC1068ATy, float f) {
        C7384Etj.A0Y(interfaceC1068ATy, 0);
        float f2 = f * 0.72f;
        Path path = ((C1710Aot) interfaceC1068ATy).A03;
        path.reset();
        float f3 = f2 / 2.0f;
        path.moveTo(f3, 0.0f);
        float f4 = f * 0.24f;
        float f5 = 0.46f * f;
        float f6 = f * 0.66f;
        path.cubicTo(0.68f * f2, f4, f2, f5, f2, f6);
        float f7 = f * 0.86f;
        path.cubicTo(f2, f7, f2 * 0.72f, f, f3, f);
        path.cubicTo(f2 * 0.28f, f, 0.0f, f7, 0.0f, f6);
        path.cubicTo(0.0f, f5, f2 * 0.32f, f4, f3, 0.0f);
        path.close();
        return interfaceC1068ATy;
    }
}
