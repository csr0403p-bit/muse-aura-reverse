package X;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Coy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4188Coy {
    public static final Cc9 A00 = new Cc9("GoogleSignInCommon");

    public static void A00(Context context) {
        C4187Cox.A00(context).A01();
        Set set = AbstractC4272Cry.A00;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            it.next();
            throw C8j3.A17();
        }
        C4163CoN.A03();
    }
}
