package com.google.crypto.tink.daead;

import X.AbstractC7609F5w;
import X.AbstractC9485GLb;
import X.AbstractC9488GLe;
import X.AbstractC9489GLf;
import X.BV4;
import X.BV6;
import X.C10437Hhj;
import X.C7338ElG;
import X.C9419GIi;
import X.C9471GKn;
import X.C9473GKp;
import X.C9486GLc;
import X.C9490GLg;
import X.C9492GLi;
import X.C9495GLl;
import X.EXA;
import X.EnumC7335ElD;
import X.GL6;
import X.GL9;
import X.GLE;
import X.Hna;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes6.dex */
public abstract class DeterministicAeadConfig {

    @Deprecated
    public static final C9419GIi A00;

    @Deprecated
    public static final C9419GIi A01;

    static {
        C9419GIi c9419GIi = C9419GIi.DEFAULT_INSTANCE;
        A01 = c9419GIi;
        A00 = c9419GIi;
        try {
            A00();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void A00() throws GeneralSecurityException {
        GL9 gl9 = GL9.A01;
        gl9.A01(C9495GLl.A00);
        gl9.A00(C9495GLl.A01);
        if (C7338ElG.A00.get()) {
            return;
        }
        GLE<C9492GLi, EXA> gle = AbstractC9489GLf.A03;
        if (!EnumC7335ElD.A01.A00()) {
            throw BV6.A0u("Registering AES SIV is not supported in FIPS mode");
        }
        GL6 gl6 = GL6.A01;
        gl6.A0B(AbstractC9488GLe.A03);
        gl6.A0A(AbstractC9488GLe.A02);
        gl6.A09(AbstractC9488GLe.A01);
        gl6.A08(AbstractC9488GLe.A00);
        gl9.A00(AbstractC9489GLf.A03);
        Hna hna = Hna.A01;
        HashMap mapA0u = BV4.A0u();
        mapA0u.put("AES256_SIV", AbstractC9485GLb.A00);
        AbstractC7609F5w.A1C(hna, "AES256_SIV_RAW", new C9490GLg(C9486GLc.A02, 64), mapA0u);
        C9473GKp.A01.A00(AbstractC9489GLf.A02, C9490GLg.class);
        C9471GKn.A02.A01(AbstractC9489GLf.A00, C9490GLg.class);
        C10437Hhj.A02.A03(AbstractC9489GLf.A01);
    }
}
