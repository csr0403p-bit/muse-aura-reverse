package X;

/* loaded from: classes4.dex */
public final class BBe extends AbstractC2251BCw {
    public int A00;
    public int A01;
    public int A02;
    public AbstractC2227BBx[] A04 = new AbstractC2227BBx[16];
    public int[] A03 = new int[16];
    public Object[] A05 = new Object[16];

    public final void A00() {
        this.A02 = 0;
        this.A00 = 0;
        AbstractC0903AHf.A04(this.A05, 0, this.A01);
        this.A01 = 0;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Ahw<*>;LX/BBJ;LX/BCj;LX/BCT;)V */
    public final void A01(InterfaceC1370Ahw interfaceC1370Ahw, InterfaceC2238BCj interfaceC2238BCj, BBJ bbj, BCT bct) {
        int i;
        int i2;
        if (this.A02 != 0) {
            BCQ bcq = new BCQ(this);
            do {
                BBe bBe = bcq.A03;
                AbstractC2227BBx abstractC2227BBx = bBe.A04[bcq.A02];
                BCR bcrA00 = abstractC2227BBx.A00(bcq);
                try {
                    abstractC2227BBx.A01(interfaceC1370Ahw, interfaceC2238BCj, bbj, bcq, bct);
                    int i3 = bcq.A02;
                    i = bBe.A02;
                    if (i3 >= i) {
                        break;
                    }
                    AbstractC2227BBx abstractC2227BBx2 = bBe.A04[i3];
                    bcq.A00 += abstractC2227BBx2.A00;
                    bcq.A01 += abstractC2227BBx2.A01;
                    i2 = i3 + 1;
                    bcq.A02 = i2;
                } catch (Throwable th) {
                    if (bct != null) {
                        AbstractC0980ALd.A00(th, new BTN(bct, bcrA00, bbj, 9));
                    }
                    throw th;
                }
            } while (i2 < i);
        }
        A00();
    }

    public final void A02(AbstractC2227BBx abstractC2227BBx) {
        int i = this.A02;
        AbstractC2227BBx[] abstractC2227BBxArr = this.A04;
        if (i == abstractC2227BBxArr.length) {
            int i2 = i;
            if (i > 1024) {
                i2 = 1024;
            }
            AbstractC2227BBx[] abstractC2227BBxArr2 = new AbstractC2227BBx[i2 + i];
            System.arraycopy(abstractC2227BBxArr, 0, abstractC2227BBxArr2, 0, i);
            this.A04 = abstractC2227BBxArr2;
        }
        int i3 = this.A00;
        int i4 = abstractC2227BBx.A00;
        int i5 = i3 + i4;
        int[] iArr = this.A03;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = length;
            if (length > 1024) {
                i6 = 1024;
            }
            int i7 = i6 + length;
            if (i7 < i5) {
                i7 = i5;
            }
            int[] iArr2 = new int[i7];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.A03 = iArr2;
        }
        int i8 = this.A01;
        int i9 = abstractC2227BBx.A01;
        int i10 = i8 + i9;
        Object[] objArr = this.A05;
        int length2 = objArr.length;
        if (i10 > length2) {
            int i11 = length2;
            if (length2 > 1024) {
                i11 = 1024;
            }
            int i12 = i11 + length2;
            if (i12 < i10) {
                i12 = i10;
            }
            Object[] objArr2 = new Object[i12];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.A05 = objArr2;
        }
        AbstractC2227BBx[] abstractC2227BBxArr3 = this.A04;
        int i13 = this.A02;
        this.A02 = i13 + 1;
        abstractC2227BBxArr3[i13] = abstractC2227BBx;
        this.A00 += i4;
        this.A01 += i9;
    }
}
