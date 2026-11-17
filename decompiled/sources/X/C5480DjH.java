package X;

/* renamed from: X.DjH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5480DjH extends C06G {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5480DjH) {
                C5480DjH c5480DjH = (C5480DjH) obj;
                if (this.A01 != c5480DjH.A01 || this.A02 != c5480DjH.A02 || this.A03 != c5480DjH.A03 || this.A04 != c5480DjH.A04 || this.A05 != c5480DjH.A05 || this.A06 != c5480DjH.A06 || this.A00 != c5480DjH.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass006.A06(this.A06, AnonymousClass006.A06(this.A05, AnonymousClass006.A06(this.A04, AnonymousClass006.A06(this.A03, AnonymousClass006.A06(this.A02, AnonymousClass005.A07(this.A01)))))) + this.A00;
    }

    public C5480DjH(int i, long j, long j2, long j3, long j4, long j5, long j6) {
        this.A01 = j;
        this.A02 = j2;
        this.A03 = j3;
        this.A04 = j4;
        this.A05 = j5;
        this.A06 = j6;
        this.A00 = i;
    }
}
