package X;

/* loaded from: classes5.dex */
public final class E6X<T> {
    public C6265DzI A00 = new C6265DzI();
    public boolean A01;
    public boolean A02;
    public final T A03;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A03.equals(((E6X) obj).A03);
    }

    public final int hashCode() {
        return this.A03.hashCode();
    }

    public E6X(T t) {
        this.A03 = t;
    }
}
