package X;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes6.dex */
public abstract class GLR {

    @Deprecated
    public static final C9419GIi A00;

    @Deprecated
    public static final C9419GIi A01;

    @Deprecated
    public static final C9419GIi A02;

    static {
        C9419GIi c9419GIi = C9419GIi.DEFAULT_INSTANCE;
        A01 = c9419GIi;
        A02 = c9419GIi;
        A00 = c9419GIi;
        try {
            A00();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void A00() {
        GL9 gl9 = GL9.A01;
        gl9.A01(C9496GLm.A01);
        gl9.A00(C9496GLm.A00);
        gl9.A01(C9499GLp.A00);
        EnumC7335ElD enumC7335ElD = GLQ.A00;
        if (!enumC7335ElD.A00()) {
            throw BV6.A0u(BV3.A00(28));
        }
        GL6 gl6 = GL6.A01;
        gl6.A0B(GLN.A05);
        gl6.A0A(GLN.A04);
        gl6.A09(GLN.A03);
        gl6.A08(GLN.A02);
        gl9.A00(GLQ.A04);
        gl9.A00(GLQ.A05);
        Hna hna = Hna.A01;
        HashMap mapA0u = BV4.A0u();
        mapA0u.put("HMAC_SHA256_128BITTAG", GLW.A01);
        C9484GLa c9484GLa = C9484GLa.A03;
        GLL gll = GLL.A03;
        mapA0u.put("HMAC_SHA256_128BITTAG_RAW", GLM.A00(gll, c9484GLa, 32, 16));
        C9484GLa c9484GLa2 = C9484GLa.A04;
        mapA0u.put("HMAC_SHA256_256BITTAG", GLM.A00(gll, c9484GLa2, 32, 32));
        mapA0u.put("HMAC_SHA256_256BITTAG_RAW", GLM.A00(gll, c9484GLa, 32, 32));
        GLL gll2 = GLL.A05;
        mapA0u.put("HMAC_SHA512_128BITTAG", GLM.A00(gll2, c9484GLa2, 64, 16));
        mapA0u.put("HMAC_SHA512_128BITTAG_RAW", GLM.A00(gll2, c9484GLa, 64, 16));
        mapA0u.put("HMAC_SHA512_256BITTAG", GLM.A00(gll2, c9484GLa2, 64, 32));
        mapA0u.put("HMAC_SHA512_256BITTAG_RAW", GLM.A00(gll2, c9484GLa, 64, 32));
        mapA0u.put("HMAC_SHA512_512BITTAG", GLW.A04);
        AbstractC7609F5w.A1C(hna, "HMAC_SHA512_512BITTAG_RAW", GLM.A00(gll2, c9484GLa, 64, 64), mapA0u);
        C9471GKn c9471GKn = C9471GKn.A02;
        c9471GKn.A01(GLQ.A01, GLO.class);
        C9473GKp.A01.A00(GLQ.A03, GLO.class);
        C10437Hhj c10437Hhj = C10437Hhj.A02;
        c10437Hhj.A02(enumC7335ElD, GLQ.A02);
        if (C7338ElG.A00.get()) {
            return;
        }
        GLE<Htd, Hwz> gle = GLT.A02;
        if (!EnumC7335ElD.A01.A00()) {
            throw BV6.A0u("Registering AES CMAC is not supported in FIPS mode");
        }
        gl6.A0B(GLU.A03);
        gl6.A0A(GLU.A02);
        gl6.A09(GLU.A01);
        gl6.A08(GLU.A00);
        c9471GKn.A01(GLT.A00, GLV.class);
        gl9.A00(GLT.A02);
        gl9.A00(GLT.A03);
        HashMap mapA0u2 = BV4.A0u();
        GLV glv = GLW.A00;
        mapA0u2.put("AES_CMAC", glv);
        mapA0u2.put("AES256_CMAC", glv);
        AbstractC7609F5w.A1C(hna, "AES256_CMAC_RAW", new GLV(GLZ.A03, 32, 16), mapA0u2);
        c10437Hhj.A03(GLT.A01);
    }
}
