package X;

/* renamed from: X.FGx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7841FGx implements FH1 {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C7841FGx) && this.A00 == ((C7841FGx) obj).A00);
    }

    @Override // X.FH1
    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return FGI.A0I("IndexedBinderKey(index=", this.A00, ")");
    }

    public C7841FGx(int i) {
        this.A00 = i;
    }
}
