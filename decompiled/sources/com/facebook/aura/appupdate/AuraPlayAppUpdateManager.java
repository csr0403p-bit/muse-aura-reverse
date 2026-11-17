package com.facebook.aura.appupdate;

import X.AbstractC5321DgF;
import X.C7384Etj;
import X.F0C;
import X.InterfaceC3408CKu;

/* loaded from: classes5.dex */
public final class AuraPlayAppUpdateManager {
    public static final int $stable = 0;
    public static final AuraPlayAppUpdateManager INSTANCE = new AuraPlayAppUpdateManager();
    public static final F0C instance$delegate = AbstractC5321DgF.A03(AuraPlayAppUpdateManager$instance$2.INSTANCE);

    public final InterfaceC3408CKu getInstance() {
        return (InterfaceC3408CKu) C7384Etj.A0G(instance$delegate);
    }
}
