package X;

import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class A7A {
    public final A7K A00;

    public A7A(A7K a7k) {
        C7384Etj.A0Y(a7k, 0);
        this.A00 = a7k;
    }

    public final byte[] A01(String str) {
        C7384Etj.A0Y(str, 0);
        A7D a7dA00 = A7K.A00(this.A00, "hatch_cvm_account_secret");
        if (a7dA00 == null) {
            return null;
        }
        byte[] bArr = a7dA00.A01;
        try {
            byte[] bArr2 = C9zv.A00;
            return C9zv.A01(bArr, C3cG.A1S(FGI.A0M("hatch:rv-luks:v1:", str)));
        } finally {
            C8j3.A1L(bArr);
        }
    }

    public static final boolean A00(String str, byte[] bArr, byte[] bArr2) throws Throwable {
        byte[] bArr3 = C9zv.A00;
        byte[] bArrA01 = C9zv.A01(bArr, C3cG.A1S(FGI.A0M("hatch:rv-luks:v1:", str)));
        try {
            return MessageDigest.isEqual(C9zv.A00(bArrA01), bArr2);
        } finally {
            Arrays.fill(bArrA01, 0, 32, (byte) 0);
        }
    }
}
