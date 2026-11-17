package X;

/* renamed from: X.EPx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6684EPx implements EQN {
    public final EC6<EQ8> A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C6684EPx) && this.A00.equals(((C6684EPx) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C3cJ.A0M("Success(credentials=", this.A00);
    }

    public C6684EPx(EC6<EQ8> ec6) {
        this.A00 = ec6;
    }
}
