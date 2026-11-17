package X;

import com.facebook.secure.hatchcvm.HatchCVMException;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class A7K {
    public boolean A00;
    public final ADo A01;
    public final ACW A02;
    public final Object A03 = C3cG.A0T();
    public final String A04;

    public static final byte[] A03(String str, String str2) throws IOException {
        C7384Etj.A0Y(str2, 1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            String[] strArr = {"hatch:cvm-secret-record:v1", str, str2};
            for (int i = 0; i < 3; i++) {
                byte[] bArrA1S = C3cG.A1S(strArr[i]);
                dataOutputStream.writeInt(bArrA1S.length);
                dataOutputStream.write(bArrA1S);
            }
            dataOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C7384Etj.A0U(byteArray);
            return byteArray;
        } finally {
        }
    }

    public static final A7D A00(A7K a7k, String str) {
        synchronized (a7k.A03) {
            A01(a7k);
            ACW acw = a7k.A02;
            A7L a7lA00 = acw.A00(str);
            if (a7lA00 == null) {
                return null;
            }
            A7M a7m = a7lA00.A01;
            String str2 = a7m.A00;
            if ("AES-GCM-256".equals(str2) && AnonymousClass002.A1X(acw.A00(FGI.A0M("hatch_cvm_bound:", str)))) {
                throw new HatchCVMException(FGI.A0M("Refusing a legacy record in bound slot ", str));
            }
            byte[] bArrA01 = a7k.A01.A01(a7m, A03(a7k.A04, str));
            if ("AES-GCM-256-AAD-V1".equals(str2) && !a7m.A01.equals("hatchcvm_local_secret_key_after_first_unlock")) {
                try {
                    A02(a7k, str, bArrA01);
                } catch (HatchCVMException e) {
                    CFK.A0D("HatchCVMSecretRepository", "Re-encrypting %s under the current key failed; keeping the old key", e, str);
                }
            }
            return new A7D(bArrA01, a7lA00.A00);
        }
    }

    public static final void A01(A7K a7k) {
        if (a7k.A00) {
            return;
        }
        a7k.A00 = true;
        try {
            ACW acw = a7k.A02;
            A7L a7lA00 = acw.A00("hatch_cvm_account_secret_pin_hash");
            if (a7lA00 != null) {
                A7M a7m = a7lA00.A01;
                if (!"AES-GCM-256".equals(a7m.A00) || AnonymousClass002.A1X(acw.A00(FGI.A0M("hatch_cvm_bound:", "hatch_cvm_account_secret_pin_hash")))) {
                    return;
                }
                byte[] bArrA01 = a7k.A01.A01(a7m, null);
                try {
                    A02(a7k, "hatch_cvm_account_secret_pin_hash", bArrA01);
                } finally {
                    C8j4.A1T(bArrA01);
                }
            }
        } catch (Exception e) {
            a7k.A00 = false;
            CFK.A0K("HatchCVMSecretRepository", e, "Binding the legacy PIN hash failed; retrying on the next use");
        }
    }

    public static final void A02(A7K a7k, String str, byte[] bArr) {
        synchronized (a7k.A03) {
            A01(a7k);
            ACW acw = a7k.A02;
            ADo aDo = a7k.A01;
            String str2 = a7k.A04;
            acw.A02(aDo.A00(bArr, A03(str2, str)), str);
            String strA0M = FGI.A0M("hatch_cvm_bound:", str);
            try {
                if (acw.A00(strA0M) == null) {
                    acw.A02(aDo.A00(new byte[]{1}, A03(str2, strA0M)), strA0M);
                }
            } catch (HatchCVMException e) {
                CFK.A0D("HatchCVMSecretRepository", "Persisting the bound marker for %s failed; retrying on the next write", e, str);
            }
        }
    }

    public A7K(ADo aDo, ACW acw, String str) {
        this.A02 = acw;
        this.A01 = aDo;
        this.A04 = str;
        if (str.length() == 0) {
            throw new HatchCVMException("HatchCVMSecretRepository requires an account id");
        }
    }
}
