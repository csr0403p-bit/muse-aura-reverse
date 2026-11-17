package com.facebook.aura.activation.view;

import X.AEP;
import X.AKO;
import X.AT1;
import X.ATE;
import X.AXN;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00r;
import X.C0zJ;
import X.C1DG;
import X.C7384Etj;
import X.C78N;
import X.C8j3;
import X.CUB;
import X.G0U;
import android.content.Context;
import android.provider.Settings;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes4.dex */
public abstract class InviteCodeScratchDebrisKt {
    public static final float ANIMATION_SCALE_OFF_THRESHOLD = 0.01f;
    public static final int CRUMBLE_PARTICLES_PER_CELL = 2;
    public static final float PARTICLE_GROWTH_PER_SECOND = 0.3f;
    public static final float PARTICLE_LIFETIME_SECONDS = 1.05f;
    public static final float ParticleGravity = 430.0f;
    public static final int REVEAL_BURST_COUNT = 42;
    public static final int REVEAL_PARTICLE_LIMIT = 420;
    public static final float RevealBurstInset = 24.0f;
    public static final int SCRATCH_PARTICLES_PER_SAMPLE = 7;
    public static final int SCRATCH_PARTICLE_LIMIT = 240;
    public static final AT1<C1DG> ParticleSizeRange = AEP.A00(C8j3.A0k(1.0f), 2.6f);
    public static final AT1<C1DG> RevealParticleSizeRange = AEP.A00(C8j3.A0k(1.2f), 3.2f);
    public static final AT1<C1DG> ScratchVelocityXRange = AEP.A00(C8j3.A0k(-34.0f), 34.0f);
    public static final AT1<C1DG> ScratchVelocityYRange = AEP.A00(C8j3.A0k(-70.0f), -5.0f);
    public static final AT1<C1DG> RevealVelocityXRange = AEP.A00(C8j3.A0k(-62.0f), 62.0f);
    public static final AT1<C1DG> RevealVelocityYRange = AEP.A00(C8j3.A0k(-115.0f), -35.0f);
    public static final AT1<C1DG> CrumbleVelocityXRange = AEP.A00(C8j3.A0k(-30.0f), 30.0f);
    public static final AT1<C1DG> CrumbleVelocityYRange = AEP.A00(C8j3.A0k(12.0f), 68.0f);
    public static final AT1<C1DG> RevealBurstYRange = AEP.A00(C8j3.A0k(12.0f), 42.0f);

    /* renamed from: InviteCodeScratchDebris-3IgeMak, reason: not valid java name */
    public static final void m145InviteCodeScratchDebris3IgeMak(InviteCodeScratchDebrisState inviteCodeScratchDebrisState, long j, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(inviteCodeScratchDebrisState, 0);
        bfm.AgG(1048709313);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, inviteCodeScratchDebrisState) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0N(bfm, j);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new ParcelableSnapshotMutableIntState(0);
                BBI.A0T(bfm, objAaT);
            }
            C00r c00r = (C00r) objAaT;
            boolean zA67 = bfm.A67(inviteCodeScratchDebrisState);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new InviteCodeScratchDebrisKt$InviteCodeScratchDebris$1$1(inviteCodeScratchDebrisState, c00r, null);
                BBI.A0T(bfm, objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, inviteCodeScratchDebrisState);
            boolean zA672 = bfm.A67(inviteCodeScratchDebrisState) | AnonymousClass001.A1N(iA0T);
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == obj) {
                objAaT3 = new InviteCodeScratchDebrisKt$InviteCodeScratchDebris$2$1(inviteCodeScratchDebrisState, j, c00r);
                BBI.A0T(bfm, objAaT3);
            }
            C0zJ.A00(bRg2, (G0U) objAaT3, bfm, (iA0T >> 6) & 14);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new InviteCodeScratchDebrisKt$InviteCodeScratchDebris$3(inviteCodeScratchDebrisState, j, bRg2, i, i2);
        }
    }

    public static final InviteCodeScratchDebrisState rememberInviteCodeScratchDebrisState(BFM bfm, int i) {
        BBI bbi = (BBI) bfm;
        AXN axnA04 = AKO.A04(Am0.A04, bbi);
        boolean zA65 = bfm.A65(axnA04);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = new InviteCodeScratchDebrisState(axnA04);
            BBI.A0O(bbi, objAaT);
        }
        return (InviteCodeScratchDebrisState) objAaT;
    }

    public static final boolean rememberScratchReduceMotionEnabled(BFM bfm, int i) {
        Context contextA00 = AKO.A00(AndroidCompositionLocals_androidKt.A01, (BBI) bfm);
        boolean zA65 = bfm.A65(contextA00);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = Boolean.valueOf(C8j3.A1R((Settings.Global.getFloat(contextA00.getContentResolver(), "animator_duration_scale", 1.0f) > 0.01f ? 1 : (Settings.Global.getFloat(contextA00.getContentResolver(), "animator_duration_scale", 1.0f) == 0.01f ? 0 : -1))));
            bfm.Ai0(objAaT);
        }
        return AnonymousClass001.A1X(objAaT);
    }

    public static final float randomFloat(ATE<Float> ate) {
        Float fAKt = ate.AKt();
        return fAKt.floatValue() + (CUB.A01.A02() * (AnonymousClass001.A02(ate.AF8()) - fAKt.floatValue()));
    }
}
