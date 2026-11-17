package androidx.savedstate;

import X.A5q;
import X.A63;
import X.A6F;
import X.A6Q;
import X.A6T;
import X.AbstractC7606F5t;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.F60;
import X.FGI;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class SavedStateRegistry {
    public A63 A00;
    public final A6Q A01;

    public final Bundle A00(String str) {
        Bundle bundle;
        A6Q a6q = this.A01;
        if (!a6q.A03) {
            throw C3cG.A0Q("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle2 = a6q.A00;
        if (bundle2 == null) {
            return null;
        }
        if (bundle2.containsKey(str)) {
            C7384Etj.A0Y(str, 1);
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                A5q.A00(str);
                throw F60.createAndThrow();
            }
        } else {
            bundle = null;
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            a6q.A00 = null;
        }
        return bundle;
    }

    public final A6F A01(String str) {
        A6F a6f;
        A6Q a6q = this.A01;
        synchronized (a6q.A05) {
            Iterator itA0n = AnonymousClass002.A0n(a6q.A06);
            while (true) {
                a6f = null;
                if (!itA0n.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) itA0n.next();
                String str2 = (String) entry.getKey();
                a6f = (A6F) entry.getValue();
                if (str.equals(str2) && a6f != null) {
                    break;
                }
            }
        }
        return a6f;
    }

    public final void A02() throws NoSuchMethodException, SecurityException {
        if (!this.A01.A02) {
            throw C3cG.A0Q(AbstractC7606F5t.A00(27));
        }
        A63 a63 = this.A00;
        if (a63 == null) {
            a63 = new A63(this);
        }
        this.A00 = a63;
        try {
            A6T.class.getDeclaredConstructor(null);
            A63 a632 = this.A00;
            if (a632 != null) {
                a632.A00.add(A6T.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException(FGI.A0U("Class ", A6T.class.getSimpleName(), " must have default constructor in order to be automatically recreated"), e);
        }
    }

    public SavedStateRegistry(A6Q a6q) {
        this.A01 = a6q;
    }

    public final void A03(A6F a6f, String str) {
        AnonymousClass003.A0u(str, a6f);
        A6Q a6q = this.A01;
        synchronized (a6q.A05) {
            Map<String, A6F> map = a6q.A06;
            if (map.containsKey(str)) {
                throw C60O.A0i("SavedStateProvider with the given key is already registered");
            }
            map.put(str, a6f);
        }
    }
}
