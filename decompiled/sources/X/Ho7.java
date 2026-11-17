package X;

/* loaded from: classes6.dex */
public final class Ho7 {
    public final Class<?> A00;
    public final Class<? extends GLJ> A01;

    public final boolean equals(Object o) {
        if (!(o instanceof Ho7)) {
            return false;
        }
        Ho7 ho7 = (Ho7) o;
        if (ho7.A00.equals(this.A00)) {
            return BV7.A1X(ho7.A01, this.A01, false);
        }
        return false;
    }

    public final int hashCode() {
        return BV7.A0D(this.A00, this.A01);
    }

    public final String toString() {
        return FGI.A0U(this.A00.getSimpleName(), " with serialization type: ", this.A01.getSimpleName());
    }

    public Ho7(Class<?> keyClass, Class<? extends GLJ> keySerializationClass) {
        this.A00 = keyClass;
        this.A01 = keySerializationClass;
    }
}
