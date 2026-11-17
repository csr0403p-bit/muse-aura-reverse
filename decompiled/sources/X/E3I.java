package X;

import androidx.media3.common.util.Util;

/* loaded from: classes5.dex */
public final class E3I implements InterfaceC6406E4i {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final E1P A04 = BV6.A0Y(32);
    public final InterfaceC6408E4k A05;

    @Override // X.InterfaceC6406E4i
    public final void A6x(E1P e1p, int i) {
        boolean z;
        int iA0A;
        if ((i & 1) != 0) {
            z = true;
            iA0A = e1p.A01 + e1p.A0A();
        } else {
            z = false;
            iA0A = -1;
        }
        if (this.A03) {
            if (!z) {
                return;
            }
            this.A03 = false;
            e1p.A0R(iA0A);
            this.A00 = 0;
        }
        while (true) {
            int iA04 = e1p.A04();
            if (iA04 <= 0) {
                return;
            }
            int i2 = this.A00;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iA0A2 = e1p.A0A();
                    e1p.A0R(e1p.A01 - 1);
                    if (iA0A2 == 255) {
                        break;
                    }
                }
                int iA042 = e1p.A04();
                int i3 = this.A00;
                int iMin = Math.min(iA042, 3 - i3);
                E1P e1p2 = this.A04;
                e1p.A0U(e1p2.A02, i3, iMin);
                int i4 = this.A00 + iMin;
                this.A00 = i4;
                if (i4 == 3) {
                    e1p2.A0R(0);
                    e1p2.A0Q(3);
                    int iA06 = BV6.A06(e1p2, 1);
                    int iA0A3 = e1p2.A0A();
                    this.A02 = AnonymousClass002.A1L(iA06 & 128);
                    int i5 = (((iA06 & 15) << 8) | iA0A3) + 3;
                    this.A01 = i5;
                    int length = e1p2.A02.length;
                    if (length < i5) {
                        e1p2.A0O(Math.min(4098, Math.max(i5, length * 2)));
                    }
                }
            } else {
                int iA0F = C8j3.A0F(this.A01, i2, iA04);
                E1P e1p3 = this.A04;
                e1p.A0U(e1p3.A02, i2, iA0F);
                int i6 = this.A00 + iA0F;
                this.A00 = i6;
                int i7 = this.A01;
                if (i6 != i7) {
                    continue;
                } else {
                    if (this.A02) {
                        byte[] bArr = e1p3.A02;
                        int i8 = -1;
                        for (int i9 = 0; i9 < i7; i9++) {
                            i8 = Util.A09[((i8 >>> 24) ^ (bArr[i9] & 255)) & 255] ^ (i8 << 8);
                        }
                        if (i8 != 0) {
                            break;
                        } else {
                            e1p3.A0Q(i7 - 4);
                        }
                    } else {
                        e1p3.A0Q(i7);
                    }
                    e1p3.A0R(0);
                    this.A05.A6w(e1p3);
                    this.A00 = 0;
                }
            }
        }
        this.A03 = true;
    }

    @Override // X.InterfaceC6406E4i
    public final void AcK() {
        this.A03 = true;
    }

    @Override // X.InterfaceC6406E4i
    public final void ANZ(E3J e3j, InterfaceC6413E4p interfaceC6413E4p, E4I e4i) {
        this.A05.ANZ(e3j, interfaceC6413E4p, e4i);
        this.A03 = true;
    }

    public E3I(InterfaceC6408E4k interfaceC6408E4k) {
        this.A05 = interfaceC6408E4k;
    }
}
