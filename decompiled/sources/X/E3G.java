package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class E3G {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public C6421E4x A05;
    public C6365E2s A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public long[] A0D = new long[0];
    public int[] A0B = new int[0];
    public int[] A0A = new int[0];
    public long[] A0C = new long[0];
    public boolean[] A0F = new boolean[0];
    public boolean[] A0E = new boolean[0];
    public final E1P A0G = BV6.A0X();

    public static void A00(E1P e1p, E3G e3g, int i, boolean z) {
        Arrays.fill(e3g.A0E, 0, i, z);
        int iA04 = e1p.A04();
        E1P e1p2 = e3g.A0G;
        e1p2.A0P(iA04);
        e3g.A07 = true;
        e3g.A09 = true;
        e1p.A0U(e1p2.A02, 0, e1p2.A00);
        e1p2.A0R(0);
        e3g.A09 = false;
    }

    public final void A01(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (this.A0B.length < i) {
            this.A0D = new long[i];
            this.A0B = new int[i];
        }
        if (this.A0A.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.A0A = new int[i3];
            this.A0C = new long[i3];
            this.A0F = new boolean[i3];
            this.A0E = new boolean[i3];
        }
    }
}
