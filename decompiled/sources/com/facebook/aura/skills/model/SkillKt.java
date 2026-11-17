package com.facebook.aura.skills.model;

import X.AbstractC2159Azp;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C7384Etj;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;

/* loaded from: classes.dex */
public abstract class SkillKt {
    public static final String normalizedSkillId(String str) {
        C7384Etj.A0Y(str, 0);
        return AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(AnonymousClass001.A0u(AnonymousClass002.A0l(str)), "-", "_"), InviteCodeScratcherKt.CODE_SEPARATOR, "_");
    }
}
