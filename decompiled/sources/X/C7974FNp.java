package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.FNp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7974FNp<Response, Config> {
    public Set A00;
    public final AbstractC7976FNr<Response, Config> A01;
    public final FO9 A02;

    public static void A02(C7974FNp c7974FNp, int i) {
        FO9 fo9 = c7974FNp.A02;
        if (fo9.AOp()) {
            c7974FNp.A01.onFetch(i);
        } else {
            fo9.AYE(new FNt(c7974FNp, i));
        }
    }

    public C7974FNp(AbstractC7976FNr<Response, Config> abstractC7976FNr, FO9 fo9) {
        this.A01 = abstractC7976FNr;
        this.A02 = fo9;
    }

    public static void A00(C7973FNo c7973FNo, C7974FNp c7974FNp) {
        FOM.A00();
        try {
            Set setA0k = c7974FNp.A00;
            if (setA0k == null) {
                setA0k = C3cG.A0k();
                c7974FNp.A00 = setA0k;
            }
            setA0k.add(c7973FNo);
            c7974FNp.A00.size();
        } finally {
            FOM.A00();
        }
    }

    public static void A01(C7973FNo c7973FNo, C7974FNp c7974FNp) {
        FOM.A00();
        try {
            Set set = c7974FNp.A00;
            if (set != null && !set.isEmpty()) {
                c7974FNp.A00.remove(c7973FNo);
                c7974FNp.A00.isEmpty();
            }
        } finally {
            FOM.A00();
        }
    }

    public static void A03(C7974FNp c7974FNp, Object obj) {
        FOM.A00();
        try {
            Set set = c7974FNp.A00;
            if (set != null && !set.isEmpty()) {
                Iterator it = c7974FNp.A00.iterator();
                while (it.hasNext()) {
                    C7975FNq<T> c7975FNq = ((C7973FNo) it.next()).A00;
                    int iIncrementAndGet = c7975FNq.A03.incrementAndGet();
                    FO9 fo9 = c7975FNq.A02;
                    if (fo9.AOp()) {
                        C7975FNq.A01(c7975FNq, obj, iIncrementAndGet);
                    } else {
                        fo9.AYE(new FO0(c7975FNq, obj, iIncrementAndGet));
                    }
                }
            }
        } finally {
            FOM.A00();
        }
    }
}
