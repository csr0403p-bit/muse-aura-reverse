package X;

/* renamed from: X.ApV, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1734ApV implements C1OS {
    public final String A00;

    public final boolean equals(Object obj) {
        return (obj instanceof C1734ApV) && C7384Etj.areEqual(this.A00, ((C1734ApV) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C8j4.A0x("StringAnnotation(value=", this.A00);
    }

    public /* synthetic */ C1734ApV(String str) {
        this.A00 = str;
    }
}
