package X;

/* renamed from: X.F0j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7536F0j {
    public static final <T extends Comparable<?>> int A00(T t, T t2) {
        if (t == null) {
            return t2 == null ? 0 : -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }
}
