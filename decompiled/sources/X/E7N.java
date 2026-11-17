package X;

/* loaded from: classes5.dex */
public final class E7N {
    public final DzH A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof E7N) {
            return this.A00.equals(((E7N) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public E7N(DzH dzH) {
        this.A00 = dzH;
    }
}
