package X;

import android.util.SparseArray;

/* loaded from: classes5.dex */
public enum DEK {
    NOT_CACHED(0, "NOT_CACHED"),
    CACHED(1, "CACHED"),
    SEMI_CACHED(2, "SEMI_CACHED"),
    NOT_APPLY(-1, "NOT_APPLY");

    public static final SparseArray<DEK> A00 = BV4.A0B();
    public final String mName;
    public final int mValue;

    static {
        for (DEK dek : values()) {
            A00.put(dek.mValue, dek);
        }
    }

    DEK(int i, String str) {
        this.mValue = i;
        this.mName = str;
    }
}
