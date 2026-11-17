package X;

import android.util.SparseBooleanArray;

/* loaded from: classes5.dex */
public final class DzH {
    public final SparseBooleanArray A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DzH) {
            return this.A00.equals(((DzH) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public DzH(SparseBooleanArray sparseBooleanArray) {
        this.A00 = sparseBooleanArray;
    }
}
