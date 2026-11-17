package X;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import javax.crypto.Cipher;

/* loaded from: classes4.dex */
public final class AF5<JcePrimitiveT> implements AF7<JcePrimitiveT> {
    public final AEx<JcePrimitiveT> A00;

    @Override // X.AF7
    public final JcePrimitiveT AGa(String algorithm) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        AF2<AF6, Cipher> af2 = AF2.A01;
        ArrayList arrayListA0h = C3cG.A0h();
        for (int i = 0; i < 2; i++) {
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
        return this.A00.AGb(algorithm, null);
    }

    public AF5(AEx<JcePrimitiveT> jceFactory) {
        this.A00 = jceFactory;
    }
}
