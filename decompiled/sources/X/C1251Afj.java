package X;

/* renamed from: X.Afj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1251Afj {
    public final long A00;

    public final boolean equals(Object obj) {
        return (obj instanceof C1251Afj) && this.A00 == ((C1251Afj) obj).A00;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        long j = this.A00;
        StringBuilder sbA0x = C60O.A0x("(");
        sbA0x.append(AnonymousClass003.A03(j));
        C8j3.A1K(sbA0x);
        sbA0x.append(AnonymousClass004.A00(j));
        return AnonymousClass001.A0v(") px/sec", sbA0x);
    }

    public /* synthetic */ C1251Afj(long j) {
        this.A00 = j;
    }

    public static final long A00(long j, float f) {
        return AnonymousClass005.A0L(C8j4.A00(j, f), AnonymousClass001.A01(j, 4294967295L) * f);
    }

    public static final long A01(long j, long j2) {
        return AnonymousClass005.A0L(AnonymousClass001.A00(j) - AnonymousClass001.A00(j2), AnonymousClass001.A01(j, 4294967295L) - AnonymousClass001.A01(j2, 4294967295L));
    }

    public static final long A02(long j, long j2) {
        return AnonymousClass005.A0L(AnonymousClass001.A00(j) + AnonymousClass001.A00(j2), AnonymousClass001.A01(j, 4294967295L) + AnonymousClass001.A01(j2, 4294967295L));
    }
}
