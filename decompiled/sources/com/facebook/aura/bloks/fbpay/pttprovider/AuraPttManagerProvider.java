package com.facebook.aura.bloks.fbpay.pttprovider;

import X.AIE;
import X.AIF;
import X.Bs8;
import X.C4JM;
import X.C7384Etj;
import X.EWD;
import android.app.Application;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class AuraPttManagerProvider {
    public static final AuraPttManagerProvider INSTANCE = new AuraPttManagerProvider();
    public static final AIE INSTANCE$1 = new AIE();
    public static final AIF CREATOR = AuraPttManagerProvider$CREATOR$1.INSTANCE;

    public EWD getPTTManager() {
        Application applicationA00 = C4JM.A00();
        AIE aie = INSTANCE$1;
        AIF aif = CREATOR;
        AtomicReference<T> atomicReference = aie.A00;
        Object objM284create = atomicReference.get();
        if (objM284create == null) {
            objM284create = ((AuraPttManagerProvider$CREATOR$1) aif).m284create((Context) applicationA00);
            if (!Bs8.A00(null, objM284create, atomicReference)) {
                objM284create = atomicReference.get();
                objM284create.getClass();
            }
        }
        C7384Etj.A0U(objM284create);
        return (EWD) objM284create;
    }
}
