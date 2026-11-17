package X;

import android.graphics.Rect;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class FQ0 {
    public long A00;
    public final Map<String, FQ5> A04 = BV4.A0u();
    public final FQ3 A02 = new FQ3();
    public final FQ3 A01 = new FQ3();
    public final List<Rect> A05 = C60O.A11(1);
    public final Map<String, Set<String>> A03 = BV4.A0u();

    private final void A00(FQ3 fq3) {
        Collection<C8020FPu<?, ?>> collectionValues = fq3.A00.values();
        if (C8021FPx.skipIteratorCalls && collectionValues.isEmpty()) {
            return;
        }
        for (C8020FPu<?, ?> c8020FPu : collectionValues) {
            FQ5 fq5 = this.A04.get(c8020FPu.A00);
            if (fq5 != null) {
                fq5.A00 = C79.A0C;
                fq5.A02.clear();
                c8020FPu.A00(this);
            }
        }
    }

    private final void A01(FQ3 fq3) {
        Set<C8020FPu<?, ?>> set = fq3.A01;
        if (C8021FPx.skipIteratorCalls && set.isEmpty()) {
            return;
        }
        Iterator<C8020FPu<?, ?>> it = set.iterator();
        while (it.hasNext()) {
            it.next().A00(this);
        }
    }

    public final void A03(List list) {
        FQ3 fq3;
        FQ3 fq32;
        this.A00++;
        List<Rect> list2 = this.A05;
        list2.clear();
        this.A03.clear();
        if (C8021FPx.skipIteratorCalls) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    list2.add(new Rect((Rect) it.next()));
                }
            }
            fq3 = this.A02;
            Collection<C8020FPu<?, ?>> collectionValues = fq3.A00.values();
            if (!collectionValues.isEmpty()) {
                Iterator<C8020FPu<?, ?>> it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    A02(this, it2);
                }
            }
            fq32 = this.A01;
            Collection<C8020FPu<?, ?>> collectionValues2 = fq32.A00.values();
            if (!collectionValues2.isEmpty()) {
                Iterator<C8020FPu<?, ?>> it3 = collectionValues2.iterator();
                while (it3.hasNext()) {
                    A02(this, it3);
                }
            }
            Map<String, FQ5> map = this.A04;
            if (!map.isEmpty()) {
                Iterator itA10 = BV5.A10(map);
                while (itA10.hasNext()) {
                    ((FQ5) itA10.next()).A02.clear();
                }
            }
        } else {
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                list2.add(new Rect((Rect) it4.next()));
            }
            fq3 = this.A02;
            Iterator itA102 = BV5.A10(fq3.A00);
            while (itA102.hasNext()) {
                A02(this, itA102);
            }
            fq32 = this.A01;
            Iterator itA103 = BV5.A10(fq32.A00);
            while (itA103.hasNext()) {
                A02(this, itA103);
            }
            Iterator itA104 = BV5.A10(this.A04);
            while (itA104.hasNext()) {
                ((FQ5) itA104.next()).A02.clear();
            }
        }
        fq3.A00();
        fq32.A00();
    }

    public final void A04(List<? extends C8020FPu<?, ?>> list) {
        this.A00++;
        if (list == null) {
            FQ3 fq3 = this.A02;
            A01(fq3);
            A00(fq3);
            FQ3 fq32 = this.A01;
            A01(fq32);
            A00(fq32);
            return;
        }
        if (!list.isEmpty()) {
            Iterator<? extends C8020FPu<?, ?>> it = list.iterator();
            while (it.hasNext()) {
                this.A04.get(it.next().A00);
            }
        }
        FQ3 fq33 = this.A02;
        A01(fq33);
        A00(fq33);
        FQ3 fq322 = this.A01;
        A01(fq322);
        A00(fq322);
        return;
    }

    public static void A02(FQ0 fq0, Iterator it) {
        fq0.A04.remove(((C8020FPu) it.next()).A00);
    }
}
