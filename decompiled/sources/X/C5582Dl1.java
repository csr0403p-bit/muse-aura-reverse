package X;

import android.util.Log;
import java.util.List;

/* renamed from: X.Dl1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5582Dl1 extends AbstractC5553DkW implements DhD {
    public final Dl3 A00;

    @Override // X.DhD
    public final C5325DgJ AKC(long j) {
        long j2;
        C7408Eum c7408Eum;
        long jA00 = j;
        Dl3 dl3 = this.A00;
        if (!(dl3 instanceof Dl0)) {
            C5588DlG c5588DlG = (C5588DlG) dl3;
            return c5588DlG.A00.get((int) (j - c5588DlG.A05));
        }
        Dl0 dl0 = (Dl0) dl3;
        if (dl0.A06 != null) {
            DlL dlL = dl0.A00;
            j2 = 0;
            if (dlL == null || !dl0.A03) {
                int i = (int) (j - dl0.A05);
                if (!dl0.A06(i).A05 || dlL == null) {
                    j2 = dl0.A06(i).A04;
                }
            }
            jA00 = dl0.A00(j);
            c7408Eum = dlL.A01;
            C6154Dwx c6154Dwx = this.A03;
            return new C5325DgJ(c7408Eum.A00(c6154Dwx.A0Y, c6154Dwx.A05, jA00, j2), 0L, -1L);
        }
        j2 = (j - dl0.A05) * ((Dl3) dl0).A02;
        c7408Eum = dl0.A02;
        C6154Dwx c6154Dwx2 = this.A03;
        return new C5325DgJ(c7408Eum.A00(c6154Dwx2.A0Y, c6154Dwx2.A05, jA00, j2), 0L, -1L);
    }

    @Override // X.DhD
    public final long ACe(long j, long j2) {
        long jA01 = this.A00.A01(j);
        return jA01 == -1 ? (int) (r4.A05((j2 - r4.A04) + r4.A01, j) - r4.A03(j, j2)) : jA01;
    }

    @Override // X.DhD
    public final long AEz(long j, long j2) {
        return this.A00.A04(j, j2);
    }

    @Override // X.DhD
    public final long AFd(long j, long j2) {
        return this.A00.A03(j, j2);
    }

    @Override // X.DhD
    public final long AFg() {
        return this.A00.A05;
    }

    @Override // X.DhD
    public final long AI7(long j, long j2) {
        Dl3 dl3 = this.A00;
        if (dl3.A06 != null) {
            return -9223372036854775807L;
        }
        long jA03 = dl3.A03(j, j2);
        long jA01 = dl3.A01(j);
        if (jA01 == -1) {
            jA01 = (int) (dl3.A05((j2 - dl3.A04) + dl3.A01, j) - dl3.A03(j, j2));
        }
        long j3 = jA03 + jA01;
        return (dl3.A02(j3) + dl3.A04(j3, j)) - dl3.A01;
    }

    @Override // X.DhD
    public final int AIx(long j) {
        return this.A00.A00(j);
    }

    @Override // X.DhD
    public final long AK9(long j) {
        return this.A00.A01(j);
    }

    @Override // X.DhD
    public final long AKA(long j, long j2) {
        return this.A00.A05(j, j2);
    }

    @Override // X.DhD
    public final long AKB(long j) {
        int i;
        long j2;
        long j3;
        long j4;
        Dl3 dl3 = this.A00;
        if (!(dl3 instanceof Dl0)) {
            return -1L;
        }
        Dl0 dl0 = (Dl0) dl3;
        long jA01 = dl0.A01(-9223372036854775807L);
        long j5 = dl0.A05;
        if (jA01 <= 0 || j5 < 0) {
            return -1L;
        }
        List<DlF> list = dl0.A06;
        if (jA01 == list.size()) {
            j4 = ((j5 + jA01) - 1) + j;
            i = dl0.A00.A00;
        } else {
            i = list.get(list.size() - 1).A00;
            if (j < i) {
                DlF dlF = list.get(0);
                if (j < dlF.A00 - (dlF.A02 - 1)) {
                    return -1L;
                }
                int size = list.size() - 1;
                int i2 = 0;
                while (i2 <= size) {
                    int i3 = (i2 + size) / 2;
                    DlF dlF2 = list.get(i3);
                    int i4 = dlF2.A00;
                    int i5 = i4 + 1;
                    int i6 = i4 - (dlF2.A02 - 1);
                    long j6 = i5;
                    if (j6 <= j) {
                        i2 = i3 + 1;
                    } else {
                        if (j6 <= j || i3 == 0) {
                            j2 = -1;
                            if (j6 > j || (i3 != 0 && i6 > j)) {
                                throw BV6.A0g("Segment Index out of Segment Timeline bounds");
                            }
                            j3 = dlF2.A00 - j;
                            if (j3 >= dlF2.A02) {
                                return j2;
                            }
                            j4 = j5 + dlF2.A01 + (r8 - 1);
                            return j4 - j3;
                        }
                        j2 = -1;
                        if (i6 <= j) {
                            if (j6 > j) {
                            }
                            throw BV6.A0g("Segment Index out of Segment Timeline bounds");
                        }
                        size = i3 - 1;
                    }
                }
                Log.w("SegmentTemplate", String.format("Search Fail; Index: %d, Start predicted num: %d, End predicted num: %d, Segment Timeline Size: %d", Long.valueOf(j), Integer.valueOf(list.size() > 0 ? list.get(0).A00 : -1), Integer.valueOf(list.size() > 0 ? ((DlF) BV7.A0t(list)).A00 : -1), Integer.valueOf(list.size())));
                return -1L;
            }
            j4 = ((j5 + jA01) - 1) + j;
        }
        j3 = i;
        return j4 - j3;
    }

    @Override // X.DhD
    public final long ALf(long j) {
        return this.A00.A02(j);
    }

    @Override // X.DhD
    public final boolean AOO() {
        Dl3 dl3 = this.A00;
        if (dl3 instanceof C5588DlG) {
            return true;
        }
        return AnonymousClass002.A1X(dl3.A06);
    }

    /* JADX WARN: Incorrect types in method signature: (JLX/Dwx;Ljava/util/List<LX/DhT;>;LX/Dl3;Ljava/util/List<LX/DjV;>;Ljava/util/List<LX/DjV;>;Ljava/util/List<LX/DjV;>;)V */
    public C5582Dl1(C6154Dwx c6154Dwx, Dl3 dl3, List list, List list2, List list3, List list4, long j) {
        super(c6154Dwx, dl3, list, list2, list3, list4, j);
        this.A00 = dl3;
    }
}
