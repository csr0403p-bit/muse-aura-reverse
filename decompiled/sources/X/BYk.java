package X;

import android.util.SparseArray;

/* loaded from: classes5.dex */
public enum BYk {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    GREEN(1),
    YELLOW(2),
    RED(3);

    public static final SparseArray<BYk> A00 = BV4.A0B();
    public final int mValue;

    static {
        for (BYk bYk : values()) {
            A00.put(bYk.mValue, bYk);
        }
    }

    BYk(int i) {
        this.mValue = i;
    }
}
