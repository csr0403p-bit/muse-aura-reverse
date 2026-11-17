package X;

/* renamed from: X.FTd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8097FTd {
    public int A01;
    public int A02;
    public long A07;
    public int A06 = -1;
    public int A05 = 0;
    public int A00 = 0;
    public int A04 = 1;
    public int A03 = 0;
    public boolean A0C = false;
    public boolean A08 = false;
    public boolean A0D = false;
    public boolean A09 = false;
    public boolean A0B = false;
    public boolean A0A = false;

    public final int A00() {
        return this.A08 ? this.A05 - this.A00 : this.A03;
    }

    public final void A01(int i) {
        int i2 = this.A04;
        if ((i2 & i) == 0) {
            throw C3cG.A0Q(FGI.A0d("Layout state should be one of ", Integer.toBinaryString(i), " but it is ", Integer.toBinaryString(i2)));
        }
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("State{mTargetPosition=");
        sbA0x.append(this.A06);
        sbA0x.append(", mData=");
        sbA0x.append((Object) null);
        sbA0x.append(", mItemCount=");
        sbA0x.append(this.A03);
        sbA0x.append(", mIsMeasuring=");
        sbA0x.append(this.A09);
        sbA0x.append(", mPreviousLayoutItemCount=");
        sbA0x.append(this.A05);
        sbA0x.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sbA0x.append(this.A00);
        sbA0x.append(", mStructureChanged=");
        sbA0x.append(this.A0C);
        sbA0x.append(", mInPreLayout=");
        sbA0x.append(this.A08);
        sbA0x.append(", mRunSimpleAnimations=");
        sbA0x.append(this.A0B);
        sbA0x.append(", mRunPredictiveAnimations=");
        sbA0x.append(this.A0A);
        return C8j3.A15(sbA0x);
    }
}
