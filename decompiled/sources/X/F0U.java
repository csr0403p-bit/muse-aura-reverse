package X;

/* loaded from: classes5.dex */
public final class F0U implements F0S {
    public final Class<?> A00;

    @Override // X.F0S
    public final Class<?> AGj() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof F0U) && this.A00.equals(((F0U) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return FGI.A0M(this.A00.toString(), C8j2.A00(2));
    }

    public F0U(Class cls) {
        this.A00 = cls;
    }
}
