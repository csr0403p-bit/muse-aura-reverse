package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.FNq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7975FNq<T> {
    public T A00;
    public List A01;
    public final FO9 A02 = new HandlerC7978FNu(AbstractC7725FCb.A01);
    public final AtomicInteger A03 = BV5.A17();

    public static void A00(FNC fnc, C7975FNq c7975FNq, Object obj) {
        List listA0h = c7975FNq.A01;
        if (listA0h == null) {
            listA0h = C3cG.A0h();
            c7975FNq.A01 = listA0h;
        }
        listA0h.add(fnc);
        synchronized (c7975FNq) {
            Object obj2 = c7975FNq.A00;
            if (obj2 == null || obj2 == obj) {
                return;
            }
            FOM.A00();
            try {
                Huk huk = (Huk) obj2;
                synchronized (fnc) {
                    FOG fog = fnc.A00;
                    if (fog != null) {
                        fog.onResponse(huk);
                    }
                }
            } finally {
                FOM.A00();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A01(C7975FNq c7975FNq, Object obj, int i) {
        int i2 = c7975FNq.A03.get();
        synchronized (c7975FNq) {
            if (i2 != i) {
                return;
            }
            c7975FNq.A00 = obj;
            List list = c7975FNq.A01;
            if (list == null || list.isEmpty()) {
                return;
            }
            Iterator itA0z = BV5.A0z(c7975FNq.A01);
            while (itA0z.hasNext()) {
                FNC fnc = (FNC) itA0z.next();
                if (fnc != null) {
                    FOM.A00();
                    try {
                        Huk huk = (Huk) obj;
                        synchronized (fnc) {
                            FOG fog = fnc.A00;
                            if (fog != null) {
                                fog.onResponse(huk);
                            }
                        }
                    } finally {
                        FOM.A00();
                    }
                }
            }
        }
    }
}
