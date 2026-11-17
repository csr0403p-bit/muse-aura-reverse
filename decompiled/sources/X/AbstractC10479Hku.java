package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Hku, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10479Hku {
    public static final HjI A00(List<? extends AbstractC10579HwA> list) {
        C7384Etj.A0Y(list, 0);
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        Iterator<? extends AbstractC10579HwA> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0m.add(it.next().A05());
        }
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list);
        for (AbstractC10579HwA abstractC10579HwA : list) {
            arrayListA0m2.add(new C10629Hzy(abstractC10579HwA.A05(), abstractC10579HwA.A01().A01));
        }
        return new HjI(arrayListA0m, arrayListA0m2, list);
    }
}
