package X;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import javax.crypto.Cipher;

/* loaded from: classes4.dex */
public final class AF4<JcePrimitiveT> implements AF7<JcePrimitiveT> {
    public final AEx<JcePrimitiveT> A00;

    @Override // X.AF7
    public final JcePrimitiveT AGa(String algorithm) throws GeneralSecurityException {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        AF2<AF6, Cipher> af2 = AF2.A01;
        ArrayList arrayListA0h = C3cG.A0h();
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayListA0h.add(provider);
            }
        }
        Iterator it = arrayListA0h.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.A00.AGb(algorithm, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    public AF4(AEx<JcePrimitiveT> jceFactory) {
        this.A00 = jceFactory;
    }
}
