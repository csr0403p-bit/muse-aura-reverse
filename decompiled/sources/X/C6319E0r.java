package X;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* renamed from: X.E0r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6319E0r implements InterfaceC6304E0a {
    public Inflater A00;
    public final C6320E0s A03;
    public final E1P A02 = BV6.A0X();
    public final E1P A01 = BV6.A0X();

    @Override // X.InterfaceC6304E0a
    public final /* synthetic */ void reset() {
    }

    /* JADX WARN: Incorrect types in method signature: ([BIILX/E03;LX/Dgn<LX/E00;>;)V */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0204  */
    @Override // X.InterfaceC6304E0a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AXd(X.InterfaceC5344Dgn r21, X.E03 r22, byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6319E0r.AXd(X.Dgn, X.E03, byte[], int, int):void");
    }

    public C6319E0r(List<byte[]> list) throws NumberFormatException {
        int i;
        C6320E0s c6320E0s = new C6320E0s();
        this.A03 = c6320E0s;
        for (String str : new String(list.get(0), StandardCharsets.UTF_8).trim().split("\\r?\\n", -1)) {
            if (str.startsWith("palette: ")) {
                String[] strArrSplit = str.substring(9).split(",", -1);
                int[] iArr = new int[strArrSplit.length];
                c6320E0s.A07 = iArr;
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    try {
                        i = Integer.parseInt(BV6.A0r(strArrSplit, i2), 16);
                    } catch (RuntimeException unused) {
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str.startsWith("size: ")) {
                String[] strArrSplit2 = str.substring(6).trim().split("x", -1);
                if (strArrSplit2.length == 2) {
                    try {
                        c6320E0s.A03 = BV6.A0F(strArrSplit2, 0);
                        c6320E0s.A02 = BV6.A0F(strArrSplit2, 1);
                        c6320E0s.A06 = true;
                    } catch (RuntimeException e) {
                        CNC.A06("VobsubParser", "Parsing IDX failed", e);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC6304E0a
    public final /* synthetic */ E0T AXf(byte[] bArr, int i, int i2) {
        return E0e.A00(this, bArr, i, i2);
    }
}
