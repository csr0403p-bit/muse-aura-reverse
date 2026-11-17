package X;

import java.math.BigInteger;
import java.security.AccessControlException;
import java.security.Permission;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class EZG {
    public static final AtomicReference A01;
    public static final Logger A09 = BV5.A1B(EZG.class);
    public static final Permission A04 = new C3106ByT("globalConfig");
    public static final Permission A06 = new C3106ByT("threadLocalConfig");
    public static final Permission A05 = new C3106ByT("defaultRandomConfig");
    public static final Permission A03 = new C3106ByT("constraints");
    public static final ThreadLocal<Map<String, Object[]>> A00 = new ThreadLocal<>();
    public static final Map<String, Object[]> A07 = BV5.A14();
    public static final EXJ A0A = new EXJ();
    public static final EZS A02 = new EZS();
    public static final AtomicReference A08 = BV4.A15();

    static {
        AtomicReference atomicReferenceA15 = BV4.A15();
        A01 = atomicReferenceA15;
        EZM ezmA01 = A01(new BigInteger("678471b27a9cf44ee91a49c5147db1a9aaf244f05a434d6486931d2d14271b9e35030b71fd73da179069b32e2935630e1c2062354d0da20a6c416e50be794ca4", 16), new BigInteger("fca682ce8e12caba26efccf7110e526db078b05edecbcd1eb4a208f3ae1617ae01f35b91a47e6df63413c5e12ed0899bcd132acd50d99151bdc43ee737592e17", 16), new BigInteger("962eddcc369cba8ebb260ee6b6a126d9346e38c5", 16), Bz9.A00("b869c82b35d70e1b1ff91b28e37a62ecdc34409b"), 123);
        EZM ezmA012 = A01(new BigInteger("30470ad5a005fb14ce2d9dcd87e38bc7d1b1c5facbaecbe95f190aa7a31d23c4dbbcbe06174544401a5b2c020965d8c2bd2171d3668445771f74ba084d2029d83c1c158547f3a9f1a2715be23d51ae4d3e5a1f6a7064f316933a346d3f529252", 16), new BigInteger("e9e642599d355f37c97ffd3567120b8e25c9cd43e927b3a9670fbec5d890141922d2c3b3ad2480093799869d1e846aab49fab0ad26d2ce6a22219d470bce7d777d4a21fbe9c270b57f607002f3cef8393694cf45ee3688c11a8c56ab127a3daf", 16), new BigInteger("9cdbd84c9f1ac2f38d0f80f42ab952e7338bf511", 16), Bz9.A00("77d0f8c4dad15eb8c4f2f8d6726cefd96d5bb399"), 263);
        EZM ezmA013 = A01(new BigInteger("f7e1a085d69b3ddecbbcab5c36b857b97994afbbfa3aea82f9574c0b3d0782675159578ebad4594fe67107108180b449167123e84c281613b7cf09328cc8a6e13c167a8b547c8d28e0a3ae1e2bb3a675916ea37f0bfa213562f1fb627a01243bcca4f1bea8519089a883dfe15ae59f06928b665e807b552564014c3bfecf492a", 16), new BigInteger("fd7f53811d75122952df4a9c2eece4e7f611b7523cef4400c31e3f80b6512669455d402251fb593d8d58fabfc5f5ba30f6cb9b556cd7813b801d346ff26660b76b9950a5a49f9fe8047b1022c24fbba9d7feb7c61bf83b57e7c6a8a6150f04fb83f6d3c51ec3023554135a169132f675f3ae2b61d72aeff22203199dd14801c7", 16), new BigInteger("9760508f15230bccb292b982a2eb840bf0581cf5", 16), Bz9.A00("8d5155894229d5e689ee01e6018a237e2cae64cd"), 92);
        EZM ezmA014 = A01(new BigInteger("42debb9da5b3d88cc956e08787ec3f3a09bba5f48b889a74aaf53174aa0fbe7e3c5b8fcd7a53bef563b0e98560328960a9517f4014d3325fc7962bf1e049370d76d1314a76137e792f3f0db859d095e4a5b932024f079ecf2ef09c797452b0770e1350782ed57ddf794979dcef23cb96f183061965c4ebc93c9c71c56b925955a75f94cccf1449ac43d586d0beee43251b0b2287349d68de0d144403f13e802f4146d882e057af19b6f6275c6676c8fa0e3ca2713a3257fd1b27d0639f695e347d8d1cf9ac819a26ca9b04cb0eb9b7b035988d15bbac65212a55239cfc7e58fae38d7250ab9991ffbc97134025fe8ce04c4399ad96569be91a546f4978693c7a", 16), new BigInteger("95475cf5d93e596c3fcd1d902add02f427f5f3c7210313bb45fb4d5bb2e5fe1cbd678cd4bbdd84c9836be1f31c0777725aeb6c2fc38b85f48076fa76bcd8146cc89a6fb2f706dd719898c2083dc8d896f84062e2c9c94d137b054a8d8096adb8d51952398eeca852a0af12df83e475aa65d4ec0c38a9560d5661186ff98b9fc9eb60eee8b030376b236bc73be3acdbd74fd61c1d2475fa3077b8f080467881ff7e1ca56fee066d79506ade51edbb5443a563927dbc4ba520086746175c8885925ebc64c6147906773496990cb714ec667304e261faee33b3cbdf008e0c3fa90650d97d3909c9275bf4ac86ffcb3d03e6dfc8ada5934242dd6d3bcca2a406cb0b", 16), new BigInteger("f8183668ba5fc5bb06b5981e6d8b795d30b8978d43ca0ec572e37e09939a9773", 16), Bz9.A00("b0b4417601b59cbc9d8ac8f935cadaec4f5fbb2f23785609ae466748d9b5a536"), 497);
        A02(EZP.A03, ezmA01, ezmA012, ezmA013, ezmA014);
        A02(EZP.A02, A00(ezmA01), A00(ezmA012), A00(ezmA013), A00(ezmA014));
        atomicReferenceA15.set(A02);
    }

    public static EZH A00(EZM ezm) {
        int i;
        BigInteger bigInteger = ezm.A01;
        int iBitLength = bigInteger.bitLength();
        if (iBitLength <= 1024) {
            i = 160;
        } else if (iBitLength <= 2048) {
            i = 224;
        } else if (iBitLength <= 3072) {
            i = 256;
        } else {
            i = 512;
            if (iBitLength <= 7680) {
                i = 384;
            }
        }
        BigInteger bigInteger2 = ezm.A00;
        BigInteger bigInteger3 = ezm.A02;
        EZN ezn = ezm.A03;
        byte[] bArrA00 = EZC.A00(ezn.A01);
        int i2 = ezn.A00;
        EZO ezo = new EZO();
        ezo.A01 = EZC.A00(bArrA00);
        ezo.A00 = i2;
        EZH ezh = new EZH();
        if (i >= bigInteger.bitLength()) {
            try {
                String strA01 = EZK.A01("org.bouncycastle.dh.allow_unsafe_p_value");
                if (strA01 != null && strA01.length() == 4 && ((strA01.charAt(0) == 't' || strA01.charAt(0) == 'T') && ((strA01.charAt(1) == 'r' || strA01.charAt(1) == 'R') && (strA01.charAt(2) == 'u' || strA01.charAt(2) == 'U')))) {
                    if (strA01.charAt(3) != 'e') {
                        if (strA01.charAt(3) == 'E') {
                        }
                    }
                }
            } catch (AccessControlException unused) {
            }
            throw C60O.A0i("unsafe p value so small specific l required");
        }
        ezh.A00 = bigInteger2;
        ezh.A01 = bigInteger;
        ezh.A02 = bigInteger3;
        ezh.A03 = ezo;
        return ezh;
    }

    public static EZM A01(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte[] bArr, int i) {
        EZN ezn = new EZN();
        ezn.A01 = EZC.A00(bArr);
        ezn.A00 = i;
        EZM ezm = new EZM();
        ezm.A00 = bigInteger;
        ezm.A01 = bigInteger2;
        ezm.A02 = bigInteger3;
        ezm.A03 = ezn;
        return ezm;
    }

    public static <T> void A02(EZP ezp, T... tArr) {
        if (!BV6.A1Y(ezp.A00, tArr[0])) {
            throw C60O.A0i("Bad property value passed");
        }
        ThreadLocal<Map<String, Object[]>> threadLocal = A00;
        Map<String, Object[]> mapA0u = threadLocal.get();
        if (mapA0u == null) {
            mapA0u = BV4.A0u();
            threadLocal.set(mapA0u);
        }
        String str = ezp.A01;
        mapA0u.put(str, tArr);
        A07.put(str, tArr);
    }
}
