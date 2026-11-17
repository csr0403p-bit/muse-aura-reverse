package X;

/* loaded from: classes5.dex */
public final class BXu {
    public static final BXu A01 = new BXu("");
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && this.A00.equals(((BXu) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return this.A00;
    }

    public BXu(String str) {
        if (str.contains(":")) {
            throw C60O.A0i("Invalid name");
        }
        this.A00 = str;
    }
}
