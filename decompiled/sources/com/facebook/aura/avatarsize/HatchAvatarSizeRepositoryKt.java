package com.facebook.aura.avatarsize;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C1BO;
import X.C2CK;
import X.C78N;

/* loaded from: classes.dex */
public abstract class HatchAvatarSizeRepositoryKt {
    public static final HatchAvatarSize rememberHatchAvatarSize(BFM bfm, int i) {
        HatchAvatarSizeRepository hatchAvatarSizeRepositoryRememberHatchAvatarSizeRepository = rememberHatchAvatarSizeRepository(bfm, 0);
        C1BO c1boA02 = C2CK.A02(bfm, hatchAvatarSizeRepositoryRememberHatchAvatarSizeRepository.avatarSize);
        boolean zA67 = bfm.A67(hatchAvatarSizeRepositoryRememberHatchAvatarSizeRepository);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new HatchAvatarSizeRepositoryKt$rememberHatchAvatarSize$1$1(hatchAvatarSizeRepositoryRememberHatchAvatarSizeRepository, null);
            bfm.Ai0(objAaT);
        }
        AnonymousClass001.A18(bfm, objAaT, hatchAvatarSizeRepositoryRememberHatchAvatarSizeRepository);
        return (HatchAvatarSize) c1boA02.getValue();
    }

    public static final HatchAvatarSizeRepository rememberHatchAvatarSizeRepository(BFM bfm, int i) {
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        boolean zA65 = bfm.A65(abstractC3358CGzA0h);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = HatchAvatarSizeRepository.Companion.getInstance(abstractC3358CGzA0h);
            bfm.Ai0(objAaT);
        }
        return (HatchAvatarSizeRepository) objAaT;
    }
}
