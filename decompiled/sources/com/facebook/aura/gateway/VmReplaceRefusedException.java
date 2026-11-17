package com.facebook.aura.gateway;

import X.C7384Etj;
import X.FGI;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class VmReplaceRefusedException extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VmReplaceRefusedException(String str) {
        super(FGI.A0M("destroy_env_and_replace_refused:", str));
        C7384Etj.A0Y(str, 0);
    }
}
