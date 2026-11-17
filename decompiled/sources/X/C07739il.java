package X;

/* renamed from: X.9il, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C07739il extends AOk implements AT1 {
    public static final C07739il A00 = new C07739il(1, 0);

    public C07739il(long j, long j2) {
        super(j, j2, 1L);
    }

    @Override // X.AT1
    public final /* bridge */ /* synthetic */ Comparable AF8() {
        return Long.valueOf(this.A01);
    }

    @Override // X.AT1
    public final /* bridge */ /* synthetic */ Comparable AKt() {
        return Long.valueOf(this.A00);
    }

    @Override // X.AOk
    public final boolean equals(Object obj) {
        if (!(obj instanceof C07739il)) {
            return false;
        }
        if (isEmpty() && ((AOk) obj).isEmpty()) {
            return true;
        }
        AOk aOk = (AOk) obj;
        return this.A00 == aOk.A00 && this.A01 == aOk.A01;
    }

    @Override // X.AOk
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return C8j4.A0B(this.A01, AnonymousClass005.A07(this.A00));
    }

    @Override // X.AOk
    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.A00);
        sbA0w.append("..");
        sbA0w.append(this.A01);
        return sbA0w.toString();
    }
}
