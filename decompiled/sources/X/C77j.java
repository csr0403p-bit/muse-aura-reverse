package X;

/* renamed from: X.77j, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C77j extends C77S {
    public final BzB A00;

    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return this.A00.equals(((C77j) o).A00);
    }

    public final int hashCode() {
        return 846803280 + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Failure {mOutputData=");
        sbA0x.append(this.A00);
        sbA0x.append('}');
        return sbA0x.toString();
    }

    public C77j(BzB outputData) {
        this.A00 = outputData;
    }

    public C77j() {
        this(BzB.A01);
    }
}
