package X;

import java.io.File;

/* loaded from: classes5.dex */
public class C0J implements Comparable<C0J> {
    public int A00;
    public long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final File A05;
    public final String A06;
    public final boolean A07;
    public volatile long A08;

    @Override // java.lang.Comparable
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0J c0j) {
        String str = this.A06;
        String str2 = c0j.A06;
        if (!str.equals(str2)) {
            return str.compareTo(str2);
        }
        long j = this.A04 - c0j.A04;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("CacheSpan{");
        sbA0x.append(this.A06);
        sbA0x.append(" lat:");
        sbA0x.append(this.A02);
        sbA0x.append(" pos: ");
        sbA0x.append(this.A04);
        sbA0x.append(" size: ");
        sbA0x.append(this.A03);
        return C8j3.A15(sbA0x);
    }

    public C0J(File file, String str, long j, long j2, long j3) {
        this.A06 = str;
        this.A04 = j;
        this.A03 = j2;
        this.A07 = AnonymousClass002.A1X(file);
        this.A05 = file;
        this.A02 = j3;
    }

    public C0J(File file, String str, long j, long j2, long j3, boolean z) {
        this.A06 = str;
        this.A04 = j;
        this.A03 = j2;
        this.A07 = z;
        this.A05 = file;
        this.A02 = j3;
        this.A01 = -1L;
        this.A08 = -1L;
    }
}
