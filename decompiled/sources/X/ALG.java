package X;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public abstract class ALG {
    public static final WeakHashMap<AFR, List<WeakReference<ALA>>> A00 = new WeakHashMap<>();

    public static final void A00(AFR afr, ALA ala) {
        WeakHashMap<AFR, List<WeakReference<ALA>>> weakHashMap = A00;
        List<WeakReference<ALA>> list = weakHashMap.get(afr);
        if (list != null) {
            AbstractC0882AGj.A0v(list, new C2326BUa(ala, 17));
            if (list.isEmpty()) {
                weakHashMap.remove(afr);
            }
        }
    }
}
