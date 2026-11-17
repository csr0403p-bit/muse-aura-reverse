package X;

import android.util.SparseArray;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class DES {
    public static final SparseArray<DES> A00;
    public static final /* synthetic */ Ey9 A01;
    public static final /* synthetic */ DES[] A02;
    public final int value;

    static {
        DES[] desArr = {new DES("MANIFEST_FETCH_END", 0, 1), new DES("PREFETCH_CACHE_EVICT", 1, 4), new DES("QUALITY_CHANGED", 2, 5), new DES("SPAN_CHANGED", 3, 6), new DES("QUALITY_SUMMARY", 4, 7), new DES("CACHE_ERROR", 5, 8), new DES("PREFETCH_START", 6, 10), new DES("DATABASE_FULL", 7, 12), new DES("MANIFEST_PARSE_ERROR", 8, 13), new DES("SUGGEST_UNBIND", 9, 14), new DES("CACHED", 10, 16)};
        A02 = desArr;
        F3w f3wA0w = C3cG.A0w(desArr);
        A01 = f3wA0w;
        A00 = BV4.A0B();
        Iterator<T> it = f3wA0w.iterator();
        while (it.hasNext()) {
            DES des = (DES) it.next();
            A00.put(des.value, des);
        }
    }

    public static DES valueOf(String str) {
        return (DES) Enum.valueOf(DES.class, str);
    }

    public static DES[] values() {
        return (DES[]) A02.clone();
    }

    public DES(String str, int i, int i2) {
        this.value = i2;
    }
}
