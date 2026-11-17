package X;

/* loaded from: classes6.dex */
public final class Hqs {
    public final C6966EdO A00;
    public final Class<? extends GLJ> A01;

    public final boolean equals(Object o) {
        if (!(o instanceof Hqs)) {
            return false;
        }
        Hqs hqs = (Hqs) o;
        if (hqs.A01.equals(this.A01)) {
            return BV7.A1X(hqs.A00, this.A00, false);
        }
        return false;
    }

    public final int hashCode() {
        return BV7.A0D(this.A01, this.A00);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<+LX/GLJ;>;LX/EdO;)V */
    public Hqs(C6966EdO keySerializationClass, Class serializationIdentifier) {
        this.A01 = serializationIdentifier;
        this.A00 = keySerializationClass;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.A01.getSimpleName());
        sbA0w.append(", object identifier: ");
        return C8j3.A14(this.A00, sbA0w);
    }
}
