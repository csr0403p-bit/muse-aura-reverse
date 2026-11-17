package X;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: X.GLo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9498GLo {

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

    public static void A00() throws GeneralSecurityException {
        GL9 gl9 = GL9.A01;
        gl9.A01(C9497GLn.A00);
        gl9.A00(C9497GLn.A01);
        GLR.A00();
        EnumC7335ElD enumC7335ElD = GL2.A00;
        if (!enumC7335ElD.A00()) {
            throw BV6.A0u("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        GL6 gl6 = GL6.A01;
        gl6.A0B(AbstractC9481GKx.A03);
        gl6.A0A(AbstractC9481GKx.A02);
        gl6.A09(AbstractC9481GKx.A01);
        gl6.A08(AbstractC9481GKx.A00);
        gl9.A00(GL2.A04);
        Hna hna = Hna.A01;
        HashMap mapA0u = BV4.A0u();
        mapA0u.put("AES128_CTR_HMAC_SHA256", AbstractC9506GLx.A00);
        C9479GKv c9479GKv = C9479GKv.A02;
        GL4 gl4 = GL4.A03;
        mapA0u.put("AES128_CTR_HMAC_SHA256_RAW", GL3.A00(gl4, c9479GKv, 16, 32, 16, 16));
        mapA0u.put("AES256_CTR_HMAC_SHA256", AbstractC9506GLx.A01);
        AbstractC7609F5w.A1C(hna, "AES256_CTR_HMAC_SHA256_RAW", GL3.A00(gl4, c9479GKv, 32, 32, 16, 32), mapA0u);
        C9473GKp c9473GKp = C9473GKp.A01;
        c9473GKp.A00(GL2.A03, C9483GKz.class);
        C9471GKn c9471GKn = C9471GKn.A02;
        c9471GKn.A01(GL2.A01, C9483GKz.class);
        C10437Hhj c10437Hhj = C10437Hhj.A02;
        c10437Hhj.A02(enumC7335ElD, GL2.A02);
        EnumC7335ElD enumC7335ElD2 = GM3.A00;
        if (!enumC7335ElD2.A00()) {
            throw BV6.A0u(BV3.A00(27));
        }
        gl6.A0B(AbstractC9500GLq.A03);
        gl6.A0A(AbstractC9500GLq.A02);
        gl6.A09(AbstractC9500GLq.A01);
        gl6.A08(AbstractC9500GLq.A00);
        gl9.A00(GM3.A04);
        HashMap mapA0u2 = BV4.A0u();
        mapA0u2.put("AES128_GCM", AbstractC9506GLx.A04);
        GMK gmk = GMK.A02;
        mapA0u2.put("AES128_GCM_RAW", new GM4(gmk, 16));
        mapA0u2.put("AES256_GCM", AbstractC9506GLx.A05);
        AbstractC7609F5w.A1C(hna, "AES256_GCM_RAW", new GM4(gmk, 32), mapA0u2);
        c9473GKp.A00(GM3.A03, GM4.class);
        c9471GKn.A01(GM3.A01, GM4.class);
        c10437Hhj.A02(enumC7335ElD2, GM3.A02);
        if (C7338ElG.A00.get()) {
            return;
        }
        GLE<Hnc, EX9> gle = GL1.A02;
        EnumC7335ElD enumC7335ElD3 = EnumC7335ElD.A01;
        if (!enumC7335ElD3.A00()) {
            throw BV6.A0u("Registering AES EAX is not supported in FIPS mode");
        }
        gl6.A0B(AbstractC9482GKy.A03);
        gl6.A0A(AbstractC9482GKy.A02);
        gl6.A09(AbstractC9482GKy.A01);
        gl6.A08(AbstractC9482GKy.A00);
        gl9.A00(GL1.A02);
        HashMap mapA0u3 = BV4.A0u();
        mapA0u3.put("AES128_EAX", AbstractC9506GLx.A02);
        C9480GKw c9480GKw = C9480GKw.A02;
        mapA0u3.put("AES128_EAX_RAW", new GL0(c9480GKw, 16, 16));
        mapA0u3.put("AES256_EAX", AbstractC9506GLx.A03);
        AbstractC7609F5w.A1C(hna, "AES256_EAX_RAW", new GL0(c9480GKw, 32, 16), mapA0u3);
        c9471GKn.A01(GL1.A00, GL0.class);
        c10437Hhj.A03(GL1.A01);
        GLE<HjH, EX9> gle2 = GM5.A03;
        if (!enumC7335ElD3.A00()) {
            throw BV6.A0u("Registering AES GCM SIV is not supported in FIPS mode");
        }
        gl6.A0B(GLs.A03);
        gl6.A0A(GLs.A02);
        gl6.A09(GLs.A01);
        gl6.A08(GLs.A00);
        HashMap mapA0u4 = BV4.A0u();
        GML gml = GML.A02;
        GML gml2 = GML.A03;
        mapA0u4.put("AES128_GCM_SIV", new GM8(gml2, 16));
        mapA0u4.put("AES128_GCM_SIV_RAW", new GM8(gml, 16));
        mapA0u4.put("AES256_GCM_SIV", new GM8(gml2, 32));
        AbstractC7609F5w.A1C(hna, "AES256_GCM_SIV_RAW", new GM8(gml, 32), mapA0u4);
        c9473GKp.A00(GM5.A02, GM8.class);
        c9471GKn.A01(GM5.A00, GM8.class);
        gl9.A00(GM5.A03);
        c10437Hhj.A03(GM5.A01);
        GLE<C9508GLz, EX9> gle3 = GM9.A02;
        if (!enumC7335ElD3.A00()) {
            throw BV6.A0u("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        gl6.A0B(AbstractC9502GLt.A03);
        gl6.A0A(AbstractC9502GLt.A02);
        gl6.A09(AbstractC9502GLt.A01);
        gl6.A08(AbstractC9502GLt.A00);
        gl9.A00(GM9.A02);
        c9471GKn.A01(GM9.A00, GMG.class);
        HashMap mapA0u5 = BV4.A0u();
        mapA0u5.put("CHACHA20_POLY1305", new GMG(GMM.A03));
        AbstractC7609F5w.A1C(hna, "CHACHA20_POLY1305_RAW", new GMG(GMM.A02), mapA0u5);
        c10437Hhj.A03(GM9.A01);
        InterfaceC9472GKo<GMD> interfaceC9472GKo = GMA.A00;
        if (!enumC7335ElD3.A00()) {
            throw BV6.A0u("Registering KMS AEAD is not supported in FIPS mode");
        }
        gl6.A0B(AbstractC9505GLw.A03);
        gl6.A0A(AbstractC9505GLw.A02);
        gl6.A09(AbstractC9505GLw.A01);
        gl6.A08(AbstractC9505GLw.A00);
        gl9.A00(GMA.A02);
        c9471GKn.A01(GMA.A00, GMD.class);
        c10437Hhj.A03(GMA.A01);
        InterfaceC9472GKo<GMB> interfaceC9472GKo2 = GM7.A00;
        if (!enumC7335ElD3.A00()) {
            throw BV6.A0u("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        gl6.A0B(AbstractC9501GLr.A03);
        gl6.A0A(AbstractC9501GLr.A02);
        gl6.A09(AbstractC9501GLr.A01);
        gl6.A08(AbstractC9501GLr.A00);
        c9471GKn.A01(GM7.A00, GMB.class);
        gl9.A00(GM7.A02);
        c10437Hhj.A03(GM7.A01);
        InterfaceC9472GKo<GMH> interfaceC9472GKo3 = GM6.A00;
        if (!enumC7335ElD3.A00()) {
            throw BV6.A0u("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        gl6.A0B(AbstractC9503GLu.A03);
        gl6.A0A(AbstractC9503GLu.A02);
        gl6.A09(AbstractC9503GLu.A01);
        gl6.A08(AbstractC9503GLu.A00);
        gl9.A00(GM6.A03);
        HashMap mapA0u6 = BV4.A0u();
        mapA0u6.put("XCHACHA20_POLY1305", new GMH(GMO.A03));
        AbstractC7609F5w.A1C(hna, "XCHACHA20_POLY1305_RAW", new GMH(GMO.A02), mapA0u6);
        c9471GKn.A01(GM6.A00, GMH.class);
        c9473GKp.A00(GM6.A02, GMH.class);
        c10437Hhj.A03(GM6.A01);
        gl6.A0B(AbstractC9504GLv.A03);
        gl6.A0A(AbstractC9504GLv.A02);
        gl6.A09(AbstractC9504GLv.A01);
        gl6.A08(AbstractC9504GLv.A00);
        HashMap mapA0u7 = BV4.A0u();
        mapA0u7.put("XAES_256_GCM_192_BIT_NONCE", AbstractC9506GLx.A08);
        mapA0u7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", AbstractC9506GLx.A09);
        mapA0u7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", AbstractC9506GLx.A07);
        AbstractC7609F5w.A1C(hna, "X_AES_GCM_8_BYTE_SALT_NO_PREFIX", AbstractC9506GLx.A0A, mapA0u7);
        gl9.A00(GMJ.A01);
        c9471GKn.A01(GMJ.A00, GMC.class);
    }
}
