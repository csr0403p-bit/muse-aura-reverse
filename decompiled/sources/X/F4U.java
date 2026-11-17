package X;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes5.dex */
public final class F4U implements GLI {
    public final int $t;

    public F4U(int i) {
        this.$t = i;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.EdS] */
    @Override // X.GLI
    public final Object A6u(AbstractC9465GKh abstractC9465GKh) throws GeneralSecurityException {
        switch (this.$t) {
            case 0:
                return new C6973EdV((Ho4) abstractC9465GKh);
            case 1:
                return new C6976EdY((Ho4) abstractC9465GKh);
            case 2:
                C10536Hqh c10536Hqh = (C10536Hqh) abstractC9465GKh;
                ThreadLocal<Cipher> threadLocal = C6962EdI.A04;
                byte[] bArrA01 = c10536Hqh.A02.A00.A01();
                C9483GKz c9483GKz = c10536Hqh.A00;
                C6962EdI c6962EdI = new C6962EdI(bArrA01, c9483GKz.A02);
                EnumC7335ElD enumC7335ElD = Ed0.A04;
                Ed0 ed0 = new Ed0(C8j3.A14(c9483GKz.A04, C60O.A0x("HMAC")), new SecretKeySpec(c10536Hqh.A03.A00.A01(), "HMAC"));
                int i = c9483GKz.A03;
                return new C6965EdM(new C6973EdV(ed0, i), c6962EdI, c10536Hqh.A01.A01(), i);
            case 3:
                HjH hjH = (HjH) abstractC9465GKh;
                ?? r2 = new Object() { // from class: X.EdS
                };
                byte[] bArr = C6956EdC.A07;
                if (C6956EdC.A00(AbstractC6955EdB.A00())) {
                    return new C6956EdC(r2, hjH.A02.A00.A01(), hjH.A01.A01());
                }
                throw C3cG.A0Q("Cipher does not implement AES GCM SIV.");
            case 4:
                C9508GLz c9508GLz = (C9508GLz) abstractC9465GKh;
                GLE<C9508GLz, EX9> gle = GM9.A02;
                try {
                    C6958EdE.A00();
                    Cipher cipherA00 = C6958EdE.A00();
                    return new C6958EdE(cipherA00.getProvider(), c9508GLz.A02.A00.A01(), c9508GLz.A01.A01());
                } catch (GeneralSecurityException unused) {
                    return new C6960EdG(c9508GLz.A02.A00.A01(), c9508GLz.A01.A01());
                }
            case 5:
                GM0 gm0 = (GM0) abstractC9465GKh;
                InterfaceC9472GKo<GMH> interfaceC9472GKo = GM6.A00;
                EnumC7335ElD enumC7335ElD2 = C6957EdD.A03;
                try {
                    C6958EdE.A00();
                    Cipher cipherA002 = C6958EdE.A00();
                    return new C6957EdD(cipherA002.getProvider(), gm0.A02.A00.A01(), gm0.A01.A01());
                } catch (GeneralSecurityException unused2) {
                    return new C6961EdH(gm0.A02.A00.A01(), gm0.A01.A01());
                }
            case 6:
                Htd htd = (Htd) abstractC9465GKh;
                GLE<Htd, Hwz> gle2 = GLT.A02;
                if (htd.A00.A00 != 32) {
                    throw BV6.A0u("AesCmacKey size wrong, must be 32 bytes");
                }
                if (!C6975EdX.A01.A00()) {
                    throw BV6.A0u("Cannot use AES-CMAC in FIPS-mode.");
                }
                Provider providerA00 = AF8.A00();
                if (providerA00 != null) {
                    try {
                        return new C6974EdW(htd, providerA00);
                    } catch (GeneralSecurityException unused3) {
                    }
                }
                return new C6975EdX(htd);
            case 7:
                Htd htd2 = (Htd) abstractC9465GKh;
                GLE<Htd, Hwz> gle3 = GLT.A02;
                if (htd2.A00.A00 == 32) {
                    return new C6973EdV(htd2);
                }
                throw BV6.A0u("AesCmacKey size wrong, must be 32 bytes");
            default:
                return null;
        }
    }
}
