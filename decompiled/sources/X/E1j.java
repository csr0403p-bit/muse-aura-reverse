package X;

import android.text.Layout;

/* loaded from: classes5.dex */
public final class E1j {
    public float A00;
    public int A02;
    public int A04;
    public Layout.Alignment A0C;
    public Layout.Alignment A0D;
    public C6333E1i A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public boolean A0J;
    public boolean A0K;
    public int A07 = -1;
    public int A0B = -1;
    public int A03 = -1;
    public int A06 = -1;
    public int A05 = -1;
    public int A09 = -1;
    public int A08 = -1;
    public int A0A = -1;
    public float A01 = Float.MAX_VALUE;

    public final void A00(E1j e1j) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (e1j != null) {
            if (!this.A0K && e1j.A0K) {
                this.A04 = e1j.A04;
                this.A0K = true;
            }
            if (this.A03 == -1) {
                this.A03 = e1j.A03;
            }
            if (this.A06 == -1) {
                this.A06 = e1j.A06;
            }
            if (this.A0G == null && (str = e1j.A0G) != null) {
                this.A0G = str;
            }
            if (this.A07 == -1) {
                this.A07 = e1j.A07;
            }
            if (this.A0B == -1) {
                this.A0B = e1j.A0B;
            }
            if (this.A08 == -1) {
                this.A08 = e1j.A08;
            }
            if (this.A0D == null && (alignment2 = e1j.A0D) != null) {
                this.A0D = alignment2;
            }
            if (this.A0C == null && (alignment = e1j.A0C) != null) {
                this.A0C = alignment;
            }
            if (this.A0A == -1) {
                this.A0A = e1j.A0A;
            }
            if (this.A05 == -1) {
                this.A05 = e1j.A05;
                this.A00 = e1j.A00;
            }
            if (this.A0E == null) {
                this.A0E = e1j.A0E;
            }
            if (this.A01 == Float.MAX_VALUE) {
                this.A01 = e1j.A01;
            }
            if (this.A0I == null) {
                this.A0I = e1j.A0I;
            }
            if (this.A0F == null) {
                this.A0F = e1j.A0F;
            }
            if (!this.A0J && e1j.A0J) {
                this.A02 = e1j.A02;
                this.A0J = true;
            }
            if (this.A09 != -1 || (i = e1j.A09) == -1) {
                return;
            }
            this.A09 = i;
        }
    }
}
