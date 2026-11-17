package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class EON implements InterfaceC6668EOe {
    public final List<ENw> A00;

    public EON(List<ENw> list) {
        C7384Etj.A0Y(list, 0);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof EON) && this.A00.equals(((EON) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C3cJ.A0M("Success(items=", this.A00);
    }
}
