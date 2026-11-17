package X;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class BG3 {
    public final int A00;
    public static final BG3 A02 = new BG3(0);
    public static final BG3 A03 = new BG3(1);
    public static final BG3 A01 = new BG3(2);

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BG3) && this.A00 == ((BG3) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x;
        int i = this.A00;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayListA0h = C3cG.A0h();
        if ((i & 1) != 0) {
            arrayListA0h.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayListA0h.add("LineThrough");
        }
        if (arrayListA0h.size() == 1) {
            sbA0x = C60O.A0x("TextDecoration.");
            sbA0x.append((String) arrayListA0h.get(0));
        } else {
            sbA0x = C60O.A0x("TextDecoration[");
            sbA0x.append(C1Vi.A00(", ", "", "", arrayListA0h, null));
            sbA0x.append(']');
        }
        return sbA0x.toString();
    }

    public BG3(int i) {
        this.A00 = i;
    }
}
