package X;

/* renamed from: X.Alv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1580Alv extends AEs {
    public final Ab2<C0912AHo<C1586AmB>> A00;

    @Override // X.AEs
    public final void onCleared() {
        Ab2<C0912AHo<C1586AmB>> ab2 = this.A00;
        Object[] objArr = ab2.A04;
        long[] jArr = ab2.A03;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((C8j5.A0A(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                int iA0E = 8 - C8j3.A0E(i, length);
                for (int i2 = 0; i2 < iA0E; i2++) {
                    if ((255 & j) < 128) {
                        AbstractC0913AHp abstractC0913AHp = (AbstractC0913AHp) C8j3.A11(objArr, i, i2);
                        Object[] objArr2 = abstractC0913AHp.A01;
                        int i3 = abstractC0913AHp.A00;
                        for (int i4 = 0; i4 < i3; i4++) {
                            C1586AmB c1586AmB = (C1586AmB) objArr2[i4];
                            InterfaceC1799ArI interfaceC1799ArI = c1586AmB.A00;
                            if (interfaceC1799ArI != null) {
                                interfaceC1799ArI.cancel();
                            }
                            c1586AmB.A00 = null;
                            Am2 am2 = c1586AmB.A03.A00;
                            am2.A01 = true;
                            am2.A02 = false;
                            Am2.A00(am2);
                        }
                    }
                    j >>= 8;
                }
                if (iA0E != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public C1580Alv() {
        Ab2 ab2 = AbstractC1489Ajw.A00;
        this.A00 = Ab2.A01();
    }
}
