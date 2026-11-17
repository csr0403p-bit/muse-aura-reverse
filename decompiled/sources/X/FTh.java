package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class FTh {
    public int A00;
    public int A01;
    public AbstractC8085FSq A02;
    public boolean A03;
    public boolean A04;

    public final void A00() {
        this.A01 = -1;
        this.A00 = Integer.MIN_VALUE;
        this.A03 = false;
        this.A04 = false;
    }

    public final void A01(View view, int i) {
        int iA09;
        boolean z = this.A03;
        AbstractC8085FSq abstractC8085FSq = this.A02;
        if (z) {
            int iA06 = abstractC8085FSq.A06(view);
            AbstractC8085FSq abstractC8085FSq2 = this.A02;
            iA09 = iA06 + (Integer.MIN_VALUE == abstractC8085FSq2.A00 ? 0 : abstractC8085FSq2.A05() - abstractC8085FSq2.A00);
        } else {
            iA09 = abstractC8085FSq.A09(view);
        }
        this.A00 = iA09;
        this.A01 = i;
    }

    public final void A02(View view, int i) {
        int iA05;
        int iMin;
        AbstractC8085FSq abstractC8085FSq = this.A02;
        if (Integer.MIN_VALUE == abstractC8085FSq.A00 || (iA05 = abstractC8085FSq.A05() - abstractC8085FSq.A00) >= 0) {
            A01(view, i);
            return;
        }
        this.A01 = i;
        boolean z = this.A03;
        AbstractC8085FSq abstractC8085FSq2 = this.A02;
        if (z) {
            int iA02 = (abstractC8085FSq2.A02() - iA05) - this.A02.A06(view);
            this.A00 = this.A02.A02() - iA02;
            if (iA02 <= 0) {
                return;
            }
            int iA07 = this.A00 - this.A02.A07(view);
            int iA04 = this.A02.A04();
            int iMin2 = iA07 - (iA04 + Math.min(this.A02.A09(view) - iA04, 0));
            if (iMin2 >= 0) {
                return;
            } else {
                iMin = this.A00 + Math.min(iA02, -iMin2);
            }
        } else {
            int iA09 = abstractC8085FSq2.A09(view);
            int iA042 = iA09 - this.A02.A04();
            this.A00 = iA09;
            if (iA042 <= 0) {
                return;
            }
            int iA022 = (this.A02.A02() - Math.min(0, (this.A02.A02() - iA05) - this.A02.A06(view))) - (iA09 + this.A02.A07(view));
            if (iA022 >= 0) {
                return;
            } else {
                iMin = this.A00 - Math.min(iA042, -iA022);
            }
        }
        this.A00 = iMin;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AnchorInfo{mPosition=");
        sbA0x.append(this.A01);
        sbA0x.append(", mCoordinate=");
        sbA0x.append(this.A00);
        sbA0x.append(", mLayoutFromEnd=");
        sbA0x.append(this.A03);
        sbA0x.append(", mValid=");
        sbA0x.append(this.A04);
        return C8j3.A15(sbA0x);
    }

    public FTh() {
        A00();
    }
}
