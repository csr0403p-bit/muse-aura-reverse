package X;

/* renamed from: X.Exn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7485Exn {
    public static <K, V> boolean A00(DQZ<K, V> dqz, DQZ<K, V> dqz2) {
        boolean zEquals;
        if (dqz != dqz2) {
            int size = dqz.size();
            if (size == dqz2.size()) {
                for (int i = 0; i < size; i++) {
                    K kA05 = dqz.A05(i);
                    V vA07 = dqz.A07(i);
                    V v = dqz2.get(kA05);
                    if (vA07 != null) {
                        zEquals = vA07.equals(v);
                    } else if (v == null) {
                        zEquals = dqz2.containsKey(kA05);
                    }
                    if (zEquals) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
