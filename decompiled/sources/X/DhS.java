package X;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: classes5.dex */
public final class DhS {
    public final Map<Integer, Long> A00;
    public final Map<String, Long> A01;
    public final Map<List<Pair<String, Integer>>, C5376DhT> A02;
    public final Random A03;

    public DhS() {
        Random random = new Random();
        this.A02 = BV4.A0u();
        this.A03 = random;
        this.A01 = BV4.A0u();
        this.A00 = BV4.A0u();
    }

    public static ArrayList A00(DhS dhS, List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Map<String, Long> map = dhS.A01;
        A01(map, jElapsedRealtime);
        Map<Integer, Long> map2 = dhS.A00;
        A01(map2, jElapsedRealtime);
        ArrayList arrayListA0h = C3cG.A0h();
        for (int i = 0; i < list.size(); i++) {
            C5376DhT c5376DhT = (C5376DhT) list.get(i);
            if (!map.containsKey(c5376DhT.A02) && !map2.containsKey(Integer.valueOf(c5376DhT.A00))) {
                arrayListA0h.add(c5376DhT);
            }
        }
        return arrayListA0h;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(JLjava/util/Map<TT;Ljava/lang/Long;>;)V */
    public static void A01(Map map, long j) {
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if (C3cG.A05(entryA0l.getValue()) <= j) {
                arrayListA0h.add(entryA0l.getKey());
            }
        }
        for (int i = 0; i < arrayListA0h.size(); i++) {
            map.remove(arrayListA0h.get(i));
        }
    }

    public final C5376DhT A02(List<C5376DhT> list) {
        C5376DhT c5376DhT;
        Object next;
        ArrayList arrayListA00 = A00(this, list);
        if (arrayListA00.size() >= 2) {
            C7572F4l.A00(31, arrayListA00);
            ArrayList arrayListA0h = C3cG.A0h();
            int i = ((C5376DhT) arrayListA00.get(0)).A00;
            int i2 = 0;
            while (true) {
                if (i2 >= arrayListA00.size()) {
                    break;
                }
                C5376DhT c5376DhT2 = (C5376DhT) arrayListA00.get(i2);
                if (i == c5376DhT2.A00) {
                    arrayListA0h.add(BV5.A0E(c5376DhT2.A02, c5376DhT2.A01));
                    i2++;
                } else if (arrayListA0h.size() == 1) {
                    next = arrayListA00.get(0);
                }
            }
            Map<List<Pair<String, Integer>>, C5376DhT> map = this.A02;
            C5376DhT c5376DhT3 = map.get(arrayListA0h);
            if (c5376DhT3 != null) {
                return c5376DhT3;
            }
            List listSubList = arrayListA00.subList(0, arrayListA0h.size());
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < listSubList.size(); i5++) {
                i4 += ((C5376DhT) listSubList.get(i5)).A01;
            }
            int iNextInt = this.A03.nextInt(i4);
            int i6 = 0;
            while (true) {
                if (i3 >= listSubList.size()) {
                    c5376DhT = (C5376DhT) AbstractC7398Eub.A00(listSubList);
                    break;
                }
                c5376DhT = (C5376DhT) listSubList.get(i3);
                i6 += c5376DhT.A01;
                if (iNextInt < i6) {
                    break;
                }
                i3++;
            }
            map.put(arrayListA0h, c5376DhT);
            return c5376DhT;
        }
        next = null;
        Iterator it = arrayListA00.iterator();
        if (it.hasNext()) {
            next = it.next();
        }
        return (C5376DhT) next;
    }
}
