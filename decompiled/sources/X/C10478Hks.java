package X;

/* renamed from: X.Hks, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10478Hks {
    public final Class<?> A00;
    public final Class<?> A01;

    public final boolean equals(Object o) {
        if (!(o instanceof C10478Hks)) {
            return false;
        }
        C10478Hks c10478Hks = (C10478Hks) o;
        if (c10478Hks.A00.equals(this.A00)) {
            return BV7.A1X(c10478Hks.A01, this.A01, false);
        }
        return false;
    }

    public final int hashCode() {
        return BV7.A0D(this.A00, this.A01);
    }

    public final String toString() {
        return FGI.A0U(this.A00.getSimpleName(), " with primitive type: ", this.A01.getSimpleName());
    }

    public C10478Hks(Class<?> keyClass, Class<?> primitiveClass) {
        this.A00 = keyClass;
        this.A01 = primitiveClass;
    }
}
