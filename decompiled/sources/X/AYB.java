package X;

/* loaded from: classes4.dex */
public final class AYB implements AYC {
    public final int A00;

    public final boolean equals(Object obj) {
        return (obj instanceof AYB) && this.A00 == ((AYB) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return C8j4.A0w("AndroidContentDataType(androidAutofillType=", this.A00);
    }

    public /* synthetic */ AYB(int i) {
        this.A00 = i;
    }
}
