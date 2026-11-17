package com.facebook.aura.assist;

import X.AEk;
import X.AT5;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C01N;
import X.C78N;
import X.G0U;
import X.G0V;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class HatchAssistLaunchGlowKt {
    public static final int FADE_OUT_MS = 2200;
    public static final float GLOW_THICKNESS = 28.0f;
    public static final long HOLD_MS = 800;
    public static final float MAX_ALPHA = 0.5f;
    public static final int RAMP_IN_MS = 450;

    /* renamed from: HatchAssistLaunchGlow-3J-VO9M, reason: not valid java name */
    public static final void m270HatchAssistLaunchGlow3JVO9M(long j, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> hatchAssistLaunchGlowKt$HatchAssistLaunchGlow$5;
        BRg bRg2 = bRg;
        bfm.AgG(483219385);
        int iA0M = (i & 6) == 0 ? i | AnonymousClass004.A0M(bfm, j) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0M |= 48;
        } else if ((i & 48) == 0) {
            iA0M |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0M & 19, 18), bfm, iA0M)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            AT5 at5 = (AT5) AnonymousClass005.A0e(bfm, objAaT, obj);
            MutableState mutableState = (MutableState) AnonymousClass005.A0h(bfm, obj, false);
            Unit unit = Unit.INSTANCE;
            boolean zA67 = bfm.A67(at5);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new HatchAssistLaunchGlowKt$HatchAssistLaunchGlow$1$1(at5, mutableState, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, unit);
            if (MutableState.A0A(mutableState)) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    hatchAssistLaunchGlowKt$HatchAssistLaunchGlow$5 = new HatchAssistLaunchGlowKt$HatchAssistLaunchGlow$2(j, bRg2, i, i2);
                    bBbAAc.A06 = hatchAssistLaunchGlowKt$HatchAssistLaunchGlow$5;
                }
                return;
            }
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            boolean zA672 = bfm.A67(at5);
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == obj) {
                objAaT3 = new HatchAssistLaunchGlowKt$HatchAssistLaunchGlow$3$1(at5);
                bfm.Ai0(objAaT3);
            }
            BRg bRgA0W = AnonymousClass001.A0W(bRgA0T, objAaT3);
            boolean zA1L = AnonymousClass001.A1L(iA0M);
            Object objAaT4 = bfm.AaT();
            if (zA1L || objAaT4 == obj) {
                objAaT4 = new HatchAssistLaunchGlowKt$HatchAssistLaunchGlow$4$1(j);
                bfm.Ai0(objAaT4);
            }
            C01N.A07(bfm, AEk.A02(bRgA0W, (G0U) objAaT4));
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            hatchAssistLaunchGlowKt$HatchAssistLaunchGlow$5 = new HatchAssistLaunchGlowKt$HatchAssistLaunchGlow$5(j, bRg2, i, i2);
            bBbAAc.A06 = hatchAssistLaunchGlowKt$HatchAssistLaunchGlow$5;
        }
    }
}
