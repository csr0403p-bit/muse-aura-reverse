package X;

/* renamed from: X.77i, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C77i extends C77S {
    public final BzB A00;

    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return this.A00.equals(((C77i) o).A00);
    }

    public final int hashCode() {
        return (-1876823561) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Success {mOutputData=");
        sbA0x.append(this.A00);
        sbA0x.append('}');
        return sbA0x.toString();
    }

    public C77i(BzB outputData) {
        this.A00 = outputData;
    }

    public C77i() {
        this(BzB.A01);
    }
}
