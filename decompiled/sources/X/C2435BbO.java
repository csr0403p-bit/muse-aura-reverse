package X;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.BbO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2435BbO implements InterfaceC2436BbP {
    public final Set<Size> A00;
    public final Range<Integer> A01;
    public final Range<Integer> A02;
    public final InterfaceC2436BbP A03;

    @Override // X.InterfaceC2436BbP
    public final boolean A5v() {
        return this.A03.A5v();
    }

    @Override // X.InterfaceC2436BbP
    public final int AGE() {
        return this.A03.AGE();
    }

    @Override // X.InterfaceC2436BbP
    public final Range<Integer> ALK() {
        return this.A03.ALK();
    }

    @Override // X.InterfaceC2436BbP
    public final Range<Integer> ALM() {
        return this.A01;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    @Override // X.InterfaceC2436BbP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Range<java.lang.Integer> ALN(int r5) {
        /*
            r4 = this;
            android.util.Range<java.lang.Integer> r3 = r4.A02
            boolean r0 = X.BV6.A1V(r3, r5)
            if (r0 == 0) goto L13
            X.BbP r0 = r4.A03
            int r0 = r0.AMl()
            int r0 = r5 % r0
            r2 = 1
            if (r0 == 0) goto L14
        L13:
            r2 = 0
        L14:
            java.lang.String r0 = "Not supported width: "
            java.lang.StringBuilder r1 = X.C60O.A0y(r0, r5)
            java.lang.String r0 = " which is not in "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " or can not be divided by alignment "
            r1.append(r0)
            X.BbP r0 = r4.A03
            int r0 = r0.AMl()
            java.lang.String r0 = X.BV4.A0l(r1, r0)
            X.BeS.A06(r2, r0)
            android.util.Range<java.lang.Integer> r0 = r4.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2435BbO.ALN(int):android.util.Range");
    }

    @Override // X.InterfaceC2436BbP
    public final Range<Integer> ALR() {
        return this.A02;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    @Override // X.InterfaceC2436BbP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Range<java.lang.Integer> ALS(int r5) {
        /*
            r4 = this;
            android.util.Range<java.lang.Integer> r3 = r4.A01
            boolean r0 = X.BV6.A1V(r3, r5)
            if (r0 == 0) goto L13
            X.BbP r0 = r4.A03
            int r0 = r0.AGE()
            int r0 = r5 % r0
            r2 = 1
            if (r0 == 0) goto L14
        L13:
            r2 = 0
        L14:
            java.lang.String r0 = "Not supported height: "
            java.lang.StringBuilder r1 = X.C60O.A0y(r0, r5)
            java.lang.String r0 = " which is not in "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " or can not be divided by alignment "
            r1.append(r0)
            X.BbP r0 = r4.A03
            int r0 = r0.AGE()
            java.lang.String r0 = X.BV4.A0l(r1, r0)
            X.BeS.A06(r2, r0)
            android.util.Range<java.lang.Integer> r0 = r4.A02
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2435BbO.ALS(int):android.util.Range");
    }

    @Override // X.InterfaceC2436BbP
    public final int AMl() {
        return this.A03.AMl();
    }

    @Override // X.InterfaceC2436BbP
    public final boolean AP3(int i, int i2) {
        InterfaceC2436BbP interfaceC2436BbP = this.A03;
        if (!interfaceC2436BbP.AP3(i, i2)) {
            Iterator<Size> it = this.A00.iterator();
            while (it.hasNext()) {
                Size sizeA0R = BV6.A0R(it);
                if (sizeA0R.getWidth() != i || sizeA0R.getHeight() != i2) {
                }
            }
            return BV6.A1V(this.A02, i) && BV6.A1V(this.A01, i2) && i % interfaceC2436BbP.AMl() == 0 && i2 % interfaceC2436BbP.AGE() == 0;
        }
        return true;
    }

    public C2435BbO(InterfaceC2436BbP interfaceC2436BbP) {
        HashSet hashSetA13 = C60O.A13();
        this.A00 = hashSetA13;
        this.A03 = interfaceC2436BbP;
        int iAMl = interfaceC2436BbP.AMl();
        this.A02 = Range.create(Integer.valueOf(iAMl), Integer.valueOf(((int) Math.ceil(4096.0d / iAMl)) * iAMl));
        int iAGE = interfaceC2436BbP.AGE();
        this.A01 = Range.create(Integer.valueOf(iAGE), Integer.valueOf(((int) Math.ceil(2160.0d / iAGE)) * iAGE));
        hashSetA13.addAll(MediaCodecInfoReportIncorrectInfoQuirk.A00.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(BV6.A0P(1920, 1080)) : Collections.EMPTY_SET);
    }
}
