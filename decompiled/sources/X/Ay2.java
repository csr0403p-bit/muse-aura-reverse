package X;

/* loaded from: classes4.dex */
public final class Ay2 {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof Ay2) && this.A00 == ((Ay2) obj).A00);
    }

    public final int hashCode() {
        return C0KA.A02(this.A00);
    }

    public final String toString() {
        return FGI.A0r("InputTextSuggestionState(isCommittedByInputMethodEditor=", this.A00);
    }

    public Ay2(boolean z) {
        this.A00 = z;
    }

    public Ay2() {
        this(false);
    }
}
