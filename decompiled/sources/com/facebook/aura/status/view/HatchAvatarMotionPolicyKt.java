package com.facebook.aura.status.view;

import X.AnonymousClass002;
import X.BFM;
import X.C20Q;
import X.C2CK;
import X.C7384Etj;
import X.C78N;
import android.content.Context;
import com.facebook.aura.memory.AuraMemory;

/* loaded from: classes2.dex */
public abstract class HatchAvatarMotionPolicyKt {
    public static final HatchAvatarMotionPolicy rememberAvatarMotionPolicy(BFM bfm, int i) {
        Context applicationContext = AnonymousClass002.A0H(bfm).getApplicationContext();
        boolean zA65 = bfm.A65(applicationContext);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            AuraMemory auraMemory = AuraMemory.INSTANCE;
            C7384Etj.A0X(applicationContext);
            objAaT = new HatchAvatarMotionPolicyKt$rememberAvatarMotionPolicy$lambda$0$$inlined$map$1(auraMemory.observe(applicationContext));
            bfm.Ai0(objAaT);
        }
        return (HatchAvatarMotionPolicy) C2CK.A01(bfm, null, HatchAvatarMotionPolicy.CHECKING_DEVICE, (C20Q) objAaT, 48, 14).getValue();
    }
}
