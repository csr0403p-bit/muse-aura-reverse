package X;

import android.util.Base64;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.privacy.acs.ACSClientException;
import com.facebook.privacy.acs.TokenException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class A8B implements C9bg {
    public final /* synthetic */ A8D A00;
    public final /* synthetic */ A8C A01;
    public final /* synthetic */ A7u A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ boolean A04;

    public A8B(A8D a8d, A8C a8c, A7u a7u, ArrayList arrayList, boolean z) {
        this.A02 = a7u;
        this.A03 = arrayList;
        this.A04 = z;
        this.A00 = a8d;
        this.A01 = a8c;
    }

    @Override // X.C9bg
    public final void AWO(C9bh[] c9bhArr, byte[][] bArr) throws TokenException {
        Throwable aCSClientException;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        A8C a8c = this.A01;
        System.currentTimeMillis();
        A7u a7u = this.A02;
        ArrayList arrayList = this.A03;
        boolean z = this.A04;
        A8D a8d = this.A00;
        try {
            A8G a8g = a8c.A00;
            ArrayList arrayListA19 = C8j3.A19(arrayList);
            if (z) {
                if (c9bhArr == null) {
                    throw new TokenException("Proofs need to be verified but not provided.");
                }
                if (arrayList.size() != c9bhArr.length) {
                    throw new TokenException("Number of signatures do not match number of proofs.");
                }
            }
            if (bArr.length != arrayList.size()) {
                throw new TokenException("Number of signatures do not match number of credentials requested.");
            }
            for (int i = 0; i < arrayList.size(); i++) {
                A8J a8j = (A8J) arrayList.get(i);
                if (a8j == null || a8j.A01 == null || a8j.A00 == null || bArr[i] == null) {
                    throw new TokenException("Token or its blinding factor or its blinded once or its signed blinded nonce is null.");
                }
                if (z) {
                    C9bh c9bh = c9bhArr[i];
                    if (c9bh == null || c9bh.A00 == null || c9bh.A01 == null) {
                        throw new TokenException("Proof verification requested but dleqProof or either of its fields are null.");
                    }
                    bArr4 = c9bh.A00;
                    bArr5 = c9bh.A01;
                } else {
                    bArr4 = null;
                    bArr5 = null;
                }
                byte[] bArr6 = new byte[a8g.getCurveBytes()];
                byte[] bArr7 = a7u.A06;
                int iUnblind = a8g.unblind(bArr7, a8j.A01, a8j.A00, bArr[i], z, bArr4, bArr5, bArr6);
                if (iUnblind != 0) {
                    throw new TokenException(FGI.A0H("VOPRF unblind(...) returned error code: ", iUnblind));
                }
                long jCurrentTimeMillis = System.currentTimeMillis() + a7u.A04;
                byte[] bArr8 = a8j.A02;
                String str = a7u.A05;
                A8H a8h = new A8H();
                a8h.A02 = bArr8;
                a8h.A03 = bArr6;
                a8h.A01 = str;
                a8h.A00 = jCurrentTimeMillis;
                arrayListA19.add(a8h);
                Base64.encodeToString(bArr7, 8);
                Base64.encodeToString(a8h.A02, 8);
                Base64.encodeToString(a8j.A00, 8);
                Base64.encodeToString(a8j.A01, 8);
                Base64.encodeToString(bArr[i], 8);
                Base64.encodeToString(a8h.A03, 8);
            }
            ArrayList arrayListA192 = C8j3.A19(arrayListA19);
            Iterator it = arrayListA19.iterator();
            while (it.hasNext()) {
                A8H a8h2 = (A8H) it.next();
                if (a8h2 == null || (bArr2 = a8h2.A02) == null || (bArr3 = a8h2.A03) == null) {
                    throw new TokenException("Server configuration or token or its fields used for shared secret derivation are null during getting a cached token.");
                }
                byte[] bArr9 = new byte[64];
                int iComputeSharedSecret = a8g.computeSharedSecret(bArr2, bArr3, bArr9);
                if (iComputeSharedSecret != 0) {
                    throw new TokenException(FGI.A0H("VOPRF computeSharedSecret(...) returned error code: ", iComputeSharedSecret));
                }
                String str2 = a8h2.A01;
                Base64.encodeToString(a7u.A06, 8);
                Base64.encodeToString(bArr2, 8);
                Base64.encodeToString(bArr3, 8);
                Base64.encodeToString(bArr9, 8);
                long j = a8h2.A00;
                int i2 = a7u.A02;
                A8E a8e = new A8E();
                a8e.A03 = str2;
                a8e.A04 = bArr2;
                a8e.A05 = bArr9;
                a8e.A02 = j;
                a8e.A00 = i2;
                a8e.A01 = 0;
                arrayListA192.add(a8e);
            }
            A8C a8c2 = a8d.A01;
            A7u a7u2 = a8d.A03;
            byte[] bArr10 = a8d.A04;
            int i3 = a8d.A00;
            A84 a84 = a8d.A02;
            if (arrayListA192.size() < 1) {
                aCSClientException = C3cG.A0Q("No tokens received from ACS.");
            } else {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (jCurrentTimeMillis2 <= LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
                    A8E a8e2 = (A8E) arrayListA192.get(0);
                    try {
                        A8F a8fA00 = A8C.A00(a8e2, bArr10, a8e2.A03.isEmpty() ? 1 : a7u2.A00, i3);
                        A8C.A01(a8c2, arrayListA192);
                        a84.onSuccess(a8fA00);
                        return;
                    } catch (TokenException | IllegalStateException | InvalidKeyException | NoSuchAlgorithmException e) {
                        a84.onFailure(e);
                        return;
                    }
                }
                A8C.A01(a8c2, arrayListA192);
                long j2 = a7u2.A03;
                aCSClientException = new ACSClientException("ACS server config expired during token issuance.", (LinkEncryptedPairingKt.LINK_COUNTER_MAX >= j2 || jCurrentTimeMillis2 > j2) ? null : "config_soft_expiry");
            }
            a84.onFailure(aCSClientException);
        } catch (TokenException | UnsupportedOperationException e2) {
            a8d.A02.onFailure(e2);
        }
    }
}
