package X;

import java.util.List;

/* loaded from: classes4.dex */
public final class BNO extends C06G {
    public final List<String> A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BNO) && C7384Etj.areEqual(this.A00, ((BNO) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public BNO(List<String> list) {
        this.A00 = list;
    }

    public BNO() {
        this(C0881AGi.A00);
    }
}
