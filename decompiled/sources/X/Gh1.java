package X;

/* loaded from: classes6.dex */
public final class Gh1 extends AbstractC9806GhU {
    public static final Gh1 A00 = new Gh1();
    public static final long serialVersionUID = 1;

    @Override // X.AbstractC9804GhQ
    public final boolean equals(Object obj) {
        return obj == this || (obj instanceof Gh1);
    }

    @Override // X.AbstractC9941Glq
    public final int hashCode() {
        return 4;
    }

    public Object readResolve() {
        return A00;
    }
}
