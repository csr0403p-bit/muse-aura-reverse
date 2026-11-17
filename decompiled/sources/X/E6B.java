package X;

import androidx.media3.common.Timeline;

/* loaded from: classes5.dex */
public final class E6B {
    public int A00;
    public long A01;
    public long A02;
    public E6C A03 = E6C.A02;
    public Object A04;
    public Object A05;
    public boolean A06;

    public static int A00(E6B e6b, Timeline timeline, int i) {
        return timeline.A0D(e6b, i, false).A00;
    }

    public final void A04(Object obj, Object obj2, long j, long j2) {
        E6C e6c = E6C.A02;
        this.A04 = obj;
        this.A05 = obj2;
        this.A00 = 0;
        this.A01 = j;
        this.A02 = j2;
        this.A03 = e6c;
        this.A06 = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && BV5.A1T(this, obj)) {
                E6B e6b = (E6B) obj;
                if (!C6xC.A00(this.A04, e6b.A04) || !C6xC.A00(this.A05, e6b.A05) || this.A00 != e6b.A00 || this.A01 != e6b.A01 || this.A02 != e6b.A02 || this.A06 != e6b.A06 || !C6xC.A00(this.A03, e6b.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int A02(int i) {
        int i2;
        E6D e6d = i < 0 ? E6C.A01 : this.A03.A00[i];
        int i3 = -1;
        do {
            i3++;
            int[] iArr = e6d.A01;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0) {
                break;
            }
        } while (i2 != 1);
        return i3;
    }

    public final long A03(int i, int i2) {
        E6D e6d = i < 0 ? E6C.A01 : this.A03.A00[i];
        if (e6d.A00 != -1) {
            return e6d.A02[i2];
        }
        return -9223372036854775807L;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A03, (AnonymousClass006.A06(this.A02, AnonymousClass006.A06(this.A01, (((((217 + AnonymousClass006.A0D(this.A04)) * 31) + C3cH.A02(this.A05)) * 31) + this.A00) * 31)) + (this.A06 ? 1 : 0)) * 31);
    }

    public static int A01(E6B e6b, Timeline timeline, Object obj) {
        return timeline.A0B(e6b, obj).A00;
    }
}
