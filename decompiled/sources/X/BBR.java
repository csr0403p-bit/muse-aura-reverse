package X;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class BBR {
    public int A00;
    public int A03;
    public int A05;
    public C2232BCc A06;
    public boolean A08;
    public final BBI A09;
    public final AKU A0A = new AKU();
    public boolean A07 = true;
    public final ArrayList<Object> A0B = C3cG.A0h();
    public int A04 = -1;
    public int A01 = -1;
    public int A02 = -1;

    public static final void A00(BBR bbr) {
        int i = bbr.A03;
        if (i > 0) {
            BBe bBe = bbr.A06.A00;
            bBe.A02(BC6.A00);
            bBe.A03[bBe.A00 - bBe.A04[bBe.A02 - 1].A00] = i;
            bbr.A03 = 0;
        }
        ArrayList<Object> arrayList = bbr.A0B;
        if (!arrayList.isEmpty()) {
            C2232BCc c2232BCc = bbr.A06;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = arrayList.get(i2);
            }
            if (size != 0) {
                BBe bBe2 = c2232BCc.A00;
                bBe2.A02(C2225BBv.A00);
                BCJ.A00(bBe2, objArr, 0);
            }
            arrayList.clear();
        }
    }

    public static final void A01(BBR bbr) {
        int i = bbr.A00;
        if (i > 0) {
            int i2 = bbr.A04;
            if (i2 >= 0) {
                A00(bbr);
                BBe bBe = bbr.A06.A00;
                bBe.A02(BC3.A00);
                int i3 = bBe.A00 - bBe.A04[bBe.A02 - 1].A00;
                int[] iArr = bBe.A03;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                bbr.A04 = -1;
            } else {
                int i4 = bbr.A02;
                int i5 = bbr.A01;
                A00(bbr);
                BBe bBe2 = bbr.A06.A00;
                bBe2.A02(BC2.A00);
                int i6 = bBe2.A00 - bBe2.A04[bBe2.A02 - 1].A00;
                int[] iArr2 = bBe2.A03;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                bbr.A01 = -1;
                bbr.A02 = -1;
            }
            bbr.A00 = 0;
        }
    }

    public static final void A02(BBR bbr, boolean z) {
        BBQ bbq = bbr.A09.A0F;
        int i = z ? bbq.A05 : bbq.A01;
        int i2 = i - bbr.A05;
        if (i2 < 0) {
            BBL.A01("Tried to seek backward");
            throw F60.createAndThrow();
        }
        if (i2 > 0) {
            BBe bBe = bbr.A06.A00;
            bBe.A02(BC0.A00);
            bBe.A03[bBe.A00 - bBe.A04[bBe.A02 - 1].A00] = i2;
            bbr.A05 = i;
        }
    }

    public final void A04() {
        BBQ bbq = this.A09.A0F;
        if (bbq.A09 > 0) {
            int i = bbq.A05;
            AKU aku = this.A0A;
            int i2 = aku.A00 - 1;
            if ((i2 >= 0 ? aku.A01[i2] : -2) != i) {
                if (!this.A08 && this.A07) {
                    A02(this, false);
                    this.A06.A00.A02(BCD.A00);
                    this.A08 = true;
                }
                if (i > 0) {
                    BCR bcrA03 = bbq.A03(i);
                    aku.A00(i);
                    A02(this, false);
                    BBe bBe = this.A06.A00;
                    bBe.A02(C2224BBu.A00);
                    BCJ.A00(bBe, bcrA03, 0);
                    this.A08 = true;
                }
            }
        }
    }

    public final void A05(int i, int i2) {
        if (i2 > 0) {
            if (i < 0) {
                BBL.A01(FGI.A0H("Invalid remove index ", i));
                throw F60.createAndThrow();
            }
            if (this.A04 == i) {
                this.A00 += i2;
                return;
            }
            A01(this);
            this.A04 = i;
            this.A00 = i2;
        }
    }

    public BBR(BBI bbi, C2232BCc c2232BCc) {
        this.A09 = bbi;
        this.A06 = c2232BCc;
    }

    public final void A03() {
        A01(this);
        ArrayList<Object> arrayList = this.A0B;
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            this.A03++;
        }
    }
}
