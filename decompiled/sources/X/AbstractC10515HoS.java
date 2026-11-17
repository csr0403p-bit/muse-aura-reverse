package X;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.HoS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10515HoS {
    public static final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    public static EX3 A00(String keyUri) throws GeneralSecurityException {
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            EX3 ex3 = (EX3) it.next();
            if (keyUri.toLowerCase(Locale.US).startsWith(BV3.A00(47))) {
                return ex3;
            }
        }
        throw BV6.A0u(FGI.A0M("No KMS client does support: ", keyUri));
    }
}
