package X;

import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class A6N {
    public A6M A00;
    public final Map A01;

    public static final A6N A00(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
            if (bundle2 == null) {
                return new A6N();
            }
        }
        ClassLoader classLoader = A6N.class.getClassLoader();
        C7384Etj.A0X(classLoader);
        bundle.setClassLoader(classLoader);
        C0924AIa c0924AIa = new C0924AIa(bundle.size());
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            C7384Etj.A0X(strA0j);
            c0924AIa.put(strA0j, bundle.get(strA0j));
        }
        return new A6N(AIW.A0K(c0924AIa));
    }

    public final <T> T A01(String str) {
        T t;
        A6M a6m = this.A00;
        try {
            BLG<Object> blg = a6m.A02.get(str);
            return (blg == null || (t = (T) blg.getValue()) == null) ? (T) a6m.A04.get(str) : t;
        } catch (ClassCastException unused) {
            a6m.A04.remove(str);
            a6m.A01.remove(str);
            a6m.A02.remove(str);
            return null;
        }
    }

    public final <T> void A02(String str, T t) {
        AbstractC5306Dfp abstractC5306Dfp;
        if (t != null) {
            List<Class<? extends Object>> list = A5u.A00;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<Class<? extends Object>> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().isInstance(t)) {
                    }
                }
            }
            StringBuilder sbA0x = C60O.A0x("Can't put value with type ");
            sbA0x.append(t.getClass());
            throw C8j3.A0w(" into saved state", sbA0x);
        }
        Object obj = this.A01.get(str);
        if ((obj instanceof C2934BpC) && (abstractC5306Dfp = (AbstractC5306Dfp) obj) != null) {
            abstractC5306Dfp.A0A(t);
        }
        this.A00.A00(str, t);
    }

    public A6N(Map<String, ? extends Object> map) {
        this.A01 = C3cG.A0j();
        this.A00 = new A6M(map);
    }

    public A6N() {
        this.A01 = C3cG.A0j();
        this.A00 = new A6M(C9jH.A00);
    }
}
