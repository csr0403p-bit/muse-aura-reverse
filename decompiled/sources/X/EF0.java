package X;

import android.security.KeyStoreException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class EF0 {
    public static boolean A01(EFB efb) {
        Integer num = efb.A01;
        return num != null && num.intValue() == 8;
    }

    public static EFB A00(List<Throwable> list) {
        KeyStoreException keyStoreException;
        Iterator<Throwable> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                keyStoreException = null;
                break;
            }
            Throwable next = it.next();
            if (next instanceof KeyStoreException) {
                keyStoreException = (KeyStoreException) next;
                break;
            }
        }
        KeyStoreException keyStoreException2 = keyStoreException;
        if (keyStoreException2 == null) {
            return EFB.A02;
        }
        int numericErrorCode = keyStoreException2.getNumericErrorCode();
        keyStoreException2.getRetryPolicy();
        return new EFB(keyStoreException2, Integer.valueOf(numericErrorCode));
    }
}
