package X;

import android.util.Base64;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meta.mftpaymentssecurity.ptt.impl.diinterfaces.PttVerificationEvent;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.EWg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6703EWg {
    public final Ev3 A00;
    public final C6710EWp A01;
    public final List<PttVerificationEvent> A02;
    public final Set<String> A03;

    public C6703EWg() {
    }

    /* JADX WARN: Incorrect types in method signature: ([B[B[BLjava/util/Set<Ljava/lang/String;>;Ljava/lang/String;)V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v14, types: [X.AGi] */
    public C6703EWg(String str, Set set, byte[] bArr, byte[] bArr2, byte[] bArr3) throws IllegalStateException, BadPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Ev3 ev3;
        C6710EWp c6710EWp;
        ?? A11;
        byte[] bArrA1S = bArr2;
        this.A03 = set;
        this.A02 = C3cG.A0h();
        try {
            ev3 = new Ev3();
            if (bArr2 == null) {
                try {
                    bArrA1S = C3cG.A1S("{}");
                } catch (Exception e) {
                    e = e;
                    String message = e.getMessage();
                    c6710EWp = new C6710EWp(null, message == null ? e.toString() : message);
                    this.A01 = c6710EWp;
                    this.A00 = ev3;
                }
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("ver", (Number) 1);
            jsonObject.addProperty("op", str);
            jsonObject.addProperty("nonce", BV5.A0j());
            EYC eyc = new EYC();
            Charset charset = DCl.A05;
            jsonObject.add("data", (JsonElement) eyc.A02(new String(bArrA1S, charset), JsonElement.class));
            String strA03 = eyc.A03(jsonObject);
            C7384Etj.A0U(strA03);
            String strA00 = AbstractC7494Ey4.A00(strA03.getBytes(charset));
            if (bArr != null && bArr.length != 0 && bArr3 != null && bArr3.length != 0) {
                BigInteger bigInteger = EWP.A01;
                byte[] bArrDecode = Base64.decode(bArr, 0);
                C7384Etj.A0U(bArrDecode);
                PublicKey publicKey = CertificateFactory.getInstance("X.509").generateCertificate(BV4.A0E(bArrDecode)).getPublicKey();
                C7384Etj.A0U(publicKey);
                byte[] encoded = publicKey.getEncoded();
                C7384Etj.A0U(encoded);
                byte[] bArrDigest = MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256).digest(encoded);
                C7384Etj.A0U(bArrDigest);
                String strA002 = AbstractC7494Ey4.A00(bArrDigest);
                ArrayList arrayListA0i = AnonymousClass003.A0i(set);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    String strA0j = AnonymousClass005.A0j(it);
                    C7384Etj.A0Y(strA0j, 0);
                    if (AnonymousClass006.A1b("RSA::", strA0j)) {
                        strA0j = strA0j.substring(5);
                    }
                    arrayListA0i.add(FGI.A0M("fp:", strA0j));
                }
                String strA01 = AbstractC06907md.A01(";", AbstractC0878AGe.A0X(AbstractC0878AGe.A0g(arrayListA0i)), null);
                C7384Etj.A0Y(strA002, 0);
                String strA0M = FGI.A0M("fp:", AnonymousClass006.A1b("RSA::", strA002) ? strA002.substring(5) : strA002);
                C7384Etj.A0Y(strA01, 0);
                String strA003 = AbstractC7494Ey4.A00(strA01.getBytes(charset));
                C7384Etj.A0Y(strA0M, 0);
                String strA004 = AbstractC7494Ey4.A00(strA0M.getBytes(charset));
                String strA05 = C6tn.A05(FGI.A0U("-----BEGIN PUBLIC KEY-----\n", Base64.encodeToString(ev3.A01.getEncoded(), 0), "-----END PUBLIC KEY-----\n"));
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("alg", "ECDH-ES");
                jsonObject2.addProperty("enc", "A256GCM");
                jsonObject2.addProperty("apu", strA003);
                jsonObject2.addProperty("apv", strA004);
                JsonObject jsonObject3 = new JsonObject();
                jsonObject3.addProperty("kty", "EC");
                jsonObject3.addProperty("crv", "P-256");
                jsonObject3.addProperty("pem", strA05);
                jsonObject2.add("epk", jsonObject3);
                String strA032 = new EYC().A03(jsonObject2);
                C7384Etj.A0U(strA032);
                String strA005 = AbstractC7494Ey4.A00(strA032.getBytes(charset));
                byte[] bytes = FGI.A0U(strA005, ".", strA00).getBytes(charset);
                KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
                keyAgreement.init(ev3.A00);
                keyAgreement.doPhase(publicKey, true);
                byte[] bArrGenerateSecret = keyAgreement.generateSecret();
                C7384Etj.A0U(bArrGenerateSecret);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                ByteBuffer byteBufferOrder = byteBufferAllocate.order(byteOrder);
                byteBufferOrder.putInt(1);
                ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(4).order(byteOrder);
                byteBufferOrder2.putInt(256);
                byte[] bArrArray = byteBufferOrder.array();
                C7384Etj.A0U(bArrArray);
                byte[] bArrA07 = AbstractC0903AHf.A07(bArrArray, bArrGenerateSecret);
                int i = 0;
                String[] strArr = {"A256GCM", strA01, strA0M};
                do {
                    String str2 = strArr[i];
                    ByteBuffer byteBufferOrder3 = ByteBuffer.allocate(4).order(byteOrder);
                    byteBufferOrder3.putInt(str2.length());
                    byte[] bArrArray2 = byteBufferOrder3.array();
                    C7384Etj.A0U(bArrArray2);
                    bArrA07 = AbstractC0903AHf.A07(bArrA07, AbstractC0903AHf.A07(bArrArray2, C3cG.A1S(str2)));
                    i++;
                } while (i < 3);
                byte[] bArrArray3 = byteBufferOrder2.array();
                C7384Etj.A0U(bArrArray3);
                byte[] bArrDigest2 = MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256).digest(AbstractC0903AHf.A07(bArrA07, bArrArray3));
                C7384Etj.A0U(bArrDigest2);
                int length = bArrDigest2.length;
                if (length == 0) {
                    A11 = C0881AGi.A00;
                } else if (length < length) {
                    int i2 = 0;
                    A11 = C60O.A11(length);
                    int i3 = 0;
                    do {
                        A11.add(Byte.valueOf(bArrDigest2[i2]));
                        i3++;
                        if (i3 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    } while (i2 < length);
                } else {
                    A11 = BFI.A0D(bArrDigest2);
                }
                byte[] bArrA0l = AbstractC0878AGe.A0l(A11);
                Cipher cipher = ev3.A02;
                cipher.init(1, new SecretKeySpec(bArrA0l, 0, bArrA0l.length, ConfidentialVmPinVerifierCrypto.AES));
                cipher.updateAAD(bytes);
                byte[] bArrDoFinal = cipher.doFinal(bArr3);
                C7384Etj.A0U(bArrDoFinal);
                int length2 = bArrDoFinal.length;
                int i4 = length2 - 16;
                byte[] bArrA06 = AbstractC0903AHf.A06(bArrDoFinal, 0, i4);
                byte[] bArrA062 = AbstractC0903AHf.A06(bArrDoFinal, i4, length2);
                String strA006 = AbstractC7494Ey4.A00(bArrA06);
                String strA007 = AbstractC7494Ey4.A00(bArrA062);
                byte[] iv = cipher.getIV();
                C7384Etj.A0U(iv);
                String strA008 = AbstractC7494Ey4.A00(iv);
                StringBuilder sbA0g = C3cG.A0g(strA005);
                sbA0g.append(".");
                C60O.A1R(".", strA008, sbA0g);
                sbA0g.append((Object) strA006);
                strA00 = FGI.A0U(strA00, ".", AnonymousClass006.A0y(strA007, ".", sbA0g));
            }
            c6710EWp = new C6710EWp(strA00, null);
        } catch (Exception e2) {
            e = e2;
            ev3 = null;
        }
        this.A01 = c6710EWp;
        this.A00 = ev3;
    }
}
