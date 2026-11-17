package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.privacy.acs.TokenException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.crypto.Mac;

/* loaded from: classes4.dex */
public final class A8C {
    public A8G A00;
    public A88 A01;
    public A8A A02;
    public String A03;
    public String A04;

    public static final void A01(A8C a8c, ArrayList arrayList) {
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A8E a8e = (A8E) it.next();
            if (a8e.A00(1)) {
                arrayListA0h.add(a8e);
            } else {
                a8c.A02.A05(a8e);
            }
        }
        if (arrayListA0h.isEmpty()) {
            return;
        }
        a8c.A02.A06(arrayListA0h);
    }

    public static A8F A00(A8E a8e, byte[] bArr, int i, int i2) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException, TokenException {
        if (!a8e.A00(i2)) {
            throw C3cG.A0Q("Cached token is not redeemable. Neither storage nor ACS should return unredeemable tokens; this should not happen.");
        }
        a8e.A01 += i2;
        for (Integer num : C79.A00(2)) {
            if (i == (1 - num.intValue() != 0 ? 1 : 2)) {
                Mac mac = Mac.getInstance("HmacSHA512");
                if (mac == null) {
                    throw new TokenException(FGI.A0M("Invalid mac instance: ", "HmacSHA512"));
                }
                C8j4.A1P("HmacSHA512", mac, a8e.A05);
                byte[] bArrDoFinal = mac.doFinal(bArr);
                if (bArrDoFinal == null) {
                    throw new TokenException("Generated tag is null.");
                }
                String str = a8e.A03;
                byte[] bArr2 = a8e.A04;
                byte[] bArr3 = a8e.A05;
                long jMin = Math.min(a8e.A02, LinkEncryptedPairingKt.LINK_COUNTER_MAX);
                A8F a8f = new A8F();
                a8f.A01 = str;
                a8f.A05 = bArrDoFinal;
                a8f.A03 = bArr2;
                a8f.A04 = bArr;
                a8f.A02 = bArr3;
                a8f.A00 = jMin;
                return a8f;
            }
        }
        throw new TokenException(FGI.A0H("Unknown cipher suite: ", i));
    }
}
