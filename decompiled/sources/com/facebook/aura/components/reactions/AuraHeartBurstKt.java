package com.facebook.aura.components.reactions;

import X.AEP;
import X.AGI;
import X.AHD;
import X.AT1;
import X.BFM;
import X.BRg;
import X.C1DG;
import X.C3cH;
import X.C60P;
import X.C7384Etj;
import X.C78N;
import X.C8j3;
import com.facebook.aura.components.confetti.AuraConfettiBurstKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;

/* loaded from: classes4.dex */
public abstract class AuraHeartBurstKt {
    public static final int HeartBurstParticleCount = 4;
    public static final float HeartBurstRadius = 60.0f;
    public static final AT1<C1DG> HeartBurstParticleWidth = AEP.A00(C8j3.A0k(3.0f), 4.5f);
    public static final AT1<C1DG> HeartBurstParticleHeight = AEP.A00(C8j3.A0k(2.0f), 3.0f);

    public static final BRg auraHeartBurst(BRg bRg, boolean z, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        long j = C3cH.A0W(bfm).error;
        boolean zA64 = bfm.A64(j);
        Object objAaT = bfm.AaT();
        if (zA64 || objAaT == C78N.A00) {
            objAaT = AGI.A0E(C60P.A04(j));
            bfm.Ai0(objAaT);
        }
        return AuraConfettiBurstKt.m372auraConfettiBurstiHT50w(bRg, z, (AHD) objAaT, 4, HeartBurstRadius, HeartBurstParticleWidth, HeartBurstParticleHeight, bfm, (i & 14) | 1797120 | (i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
    }
}
