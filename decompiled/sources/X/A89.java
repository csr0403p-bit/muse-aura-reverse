package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.privacy.acs.ACSClientException;
import com.facebook.privacy.acs.TokenException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class A89 implements A7r {
    public final /* synthetic */ int A00;
    public final /* synthetic */ A8C A01;
    public final /* synthetic */ A84 A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ byte[] A04;

    public A89(A8C a8c, A84 a84, byte[] bArr) {
        this.A03 = true;
        this.A00 = 1;
        this.A04 = bArr;
        this.A02 = a84;
        this.A01 = a8c;
    }

    @Override // X.A7r
    public final void onFailure(Throwable th) {
        this.A02.onFailure(th);
    }

    @Override // X.A7r
    public final void AWN(A7u a7u) throws TokenException {
        A8E a8e;
        A8F a8fA00;
        A8C a8c = this.A01;
        boolean z = this.A03;
        int i = this.A00;
        byte[] bArr = this.A04;
        A84 a84 = this.A02;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis > LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            long j = a7u.A03;
            e = new ACSClientException("ACS server config expired before token redemption.", (LinkEncryptedPairingKt.LINK_COUNTER_MAX >= j || jCurrentTimeMillis > j) ? null : "config_soft_expiry");
        } else {
            try {
                int i2 = a7u.A00;
                String str = a7u.A05;
                long j2 = a7u.A03;
                synchronized (a8c) {
                    System.currentTimeMillis();
                    A8A a8a = a8c.A02;
                    synchronized (a8a) {
                        try {
                            C7384Etj.A0Y(str, 0);
                            a8e = null;
                            try {
                                try {
                                    Map map = (Map) A8A.A01(a8a).get(str);
                                    if (map != null) {
                                        A8E a8e2 = null;
                                        for (A8E a8e3 : map.values()) {
                                            if (a8e3.A00(1) && (a8e2 == null || a8e2.A01 > a8e3.A01)) {
                                                a8e2 = a8e3;
                                            }
                                        }
                                        a8e = a8e2;
                                    }
                                } catch (IllegalArgumentException unused) {
                                    a8a.A04();
                                }
                            } catch (JSONException unused2) {
                                a8a.A04();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (jCurrentTimeMillis2 > LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
                        throw new ACSClientException("ACS server config expired before token redemption.", (LinkEncryptedPairingKt.LINK_COUNTER_MAX >= j2 || jCurrentTimeMillis2 > j2) ? null : "config_soft_expiry");
                    }
                    if (a8e == null || !a8e.A00(i)) {
                        a8fA00 = null;
                    } else {
                        a8fA00 = A8C.A00(a8e, bArr, i2, i);
                        boolean zA00 = a8e.A00(1);
                        A8A a8a2 = a8c.A02;
                        if (zA00) {
                            a8a2.A06(Arrays.asList(a8e));
                        } else {
                            a8a2.A05(a8e);
                        }
                    }
                    System.currentTimeMillis();
                }
                if (a8fA00 != null) {
                    a84.onSuccess(a8fA00);
                    return;
                }
                int i3 = a7u.A01;
                A8D a8d = new A8D(a8c, a84, a7u, bArr, i);
                System.currentTimeMillis();
                if (i3 <= 0) {
                    a8d.A02.onFailure(new ACSClientException(FGI.A0H("Invalid number of tokens requested: ", i3)));
                    return;
                }
                try {
                    A8G a8g = a8c.A00;
                    ArrayList arrayListA11 = C60O.A11(i3);
                    SecureRandom secureRandom = new SecureRandom();
                    int curveBytes = a8g.getCurveBytes();
                    int curveScalarBytes = a8g.getCurveScalarBytes();
                    int i4 = 0;
                    do {
                        byte[] bArr2 = new byte[curveBytes];
                        secureRandom.nextBytes(bArr2);
                        byte[] bArr3 = new byte[curveBytes];
                        byte[] bArr4 = new byte[curveScalarBytes];
                        int iBlind = a8g.blind(bArr2, bArr3, bArr4);
                        if (iBlind != 0) {
                            throw new TokenException(FGI.A0H("VOPRF blind(...) returned error code: ", iBlind));
                        }
                        A8J a8j = new A8J();
                        a8j.A02 = bArr2;
                        a8j.A01 = bArr4;
                        a8j.A00 = bArr3;
                        arrayListA11.add(a8j);
                        i4++;
                    } while (i4 < i3);
                    byte[][] bArr5 = new byte[arrayListA11.size()][];
                    for (int i5 = 0; i5 < arrayListA11.size(); i5++) {
                        byte[] bArr6 = ((A8J) arrayListA11.get(i5)).A00;
                        bArr5[i5] = Arrays.copyOf(bArr6, bArr6.length);
                    }
                    a8c.A01.A00.A02.getCredentials(a7u, bArr5, z, false, new A8B(a8d, a8c, a7u, arrayListA11, z));
                    return;
                } catch (TokenException e) {
                    a8d.A02.onFailure(e);
                    return;
                }
            } catch (ACSClientException | TokenException | IllegalStateException | InvalidKeyException | NoSuchAlgorithmException e2) {
                e = e2;
            }
        }
        a84.onFailure(e);
    }

    public A89() {
    }
}
