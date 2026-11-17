package X;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class BO7 implements Serializable {
    public long element;

    public static BO7 A00(long j) {
        BO7 bo7 = new BO7();
        bo7.element = j;
        return bo7;
    }

    public final String toString() {
        return String.valueOf(this.element);
    }
}
