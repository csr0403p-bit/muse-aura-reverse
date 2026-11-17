package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class Hl8 {
    public static final void A01(FNA fna, Object obj, String str) {
        C7384Etj.A0Y(obj, 2);
        if (obj instanceof Number) {
            fna.AQE(str, C3cG.A05(obj));
        } else if (obj instanceof Boolean) {
            fna.AQG(str, AnonymousClass001.A1X(obj));
        } else {
            fna.AQF(str, obj.toString());
        }
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/lang/String;Ljava/lang/String;Ljava/util/Map<Ljava/lang/Object;+Ljava/lang/Object;>;Ljava/lang/Long;)V */
    public static final void A03(Long l, String str, String str2, Map map, int i) throws NumberFormatException {
        C7384Etj.A0Y(map, 3);
        FNA fnaA00 = A00(str, i);
        if (fnaA00 != null) {
            if (l == null) {
                fnaA00.markerPoint(str2);
            } else {
                fnaA00.AQI(str2, l.longValue());
            }
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                itA0n.next();
                A02(fnaA00, map);
            }
        }
    }

    public static final FNA A00(String str, int i) throws NumberFormatException {
        FNA fna;
        if (str == null) {
            return null;
        }
        long j = (Integer.parseInt(str) & 4294967295L) | ((i << 32) & (-4294967296L));
        HuE huE = (HuE) HuE.A05.A00();
        synchronized (huE) {
            fna = huE.A00.get(j);
        }
        return fna;
    }

    public static final void A02(FNA fna, Map<Object, ? extends Object> map) {
        String string;
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Object key = entryA0l.getKey();
            Object value = entryA0l.getValue();
            if (value != null) {
                if (!(key instanceof Number) || key == null || (string = key.toString()) == null) {
                    string = key.toString();
                }
                A01(fna, value, string);
            }
        }
    }
}
