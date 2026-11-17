package X;

/* loaded from: classes4.dex */
public final class BHh implements InterfaceC1185Ado {
    @Override // X.InterfaceC1185Ado
    public final void A4m(AXN axn, int[] iArr, int[] iArr2, int i) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        int i5 = i - i3;
        int i6 = 0;
        while (i2 < length) {
            int i7 = iArr[i2];
            iArr2[i6] = i5;
            i5 += i7;
            i2++;
            i6++;
        }
    }

    @Override // X.InterfaceC1185Ado
    public final /* synthetic */ float AKp() {
        return 0.0f;
    }

    public final String toString() {
        return "Arrangement#Bottom";
    }
}
