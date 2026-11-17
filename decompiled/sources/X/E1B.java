package X;

/* loaded from: classes5.dex */
public final class E1B {
    public static final E1B A01 = new E1B(new C6265DzI().A00());
    public final DzH A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof E1B) {
            return this.A00.equals(((E1B) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public E1B(DzH dzH) {
        this.A00 = dzH;
    }
}
