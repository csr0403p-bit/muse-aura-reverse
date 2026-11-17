package X;

/* renamed from: X.Dir, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5456Dir implements InterfaceC5529Dk6 {
    public final C5426DiN[] A00;
    public final int[] A01;

    @Override // X.InterfaceC5529Dk6
    public final InterfaceC5563Dkg AhC(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.A01;
            if (i3 >= iArr.length) {
                CNC.A02("BaseMediaChunkOutput", FGI.A0H("Unmatched track of type: ", i2));
                return new C5551DkU();
            }
            if (i2 == iArr[i3]) {
                return this.A00[i3];
            }
            i3++;
        }
    }

    public final void A00(long j) {
        for (C5426DiN c5426DiN : this.A00) {
            if (c5426DiN.A07 != j) {
                c5426DiN.A07 = j;
                c5426DiN.A0G = true;
            }
        }
    }

    public C5456Dir(int[] iArr, C5426DiN[] c5426DiNArr) {
        this.A01 = iArr;
        this.A00 = c5426DiNArr;
    }
}
