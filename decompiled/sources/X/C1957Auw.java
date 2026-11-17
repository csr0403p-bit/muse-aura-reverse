package X;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.TextUtils;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.Auw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1957Auw implements InterfaceC2006AwF {
    public final long A00;
    public final C1999Aw8 A01;
    public final C1833Arx A02;
    public final CharSequence A03;
    public final List<AaC> A04;
    public final int A05;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0171  */
    /* JADX WARN: Type inference failed for: r10v8, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List<X.AaC>] */
    /* JADX WARN: Type inference failed for: r13v3, types: [X.AGi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1957Auw(X.C1833Arx r23, int r24, int r25, long r26) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1957Auw.<init>(X.Arx, int, int, long):void");
    }

    private final C1999Aw8 A00(TextUtils.TruncateAt truncateAt, CharSequence charSequence, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        C1830Aru c1830Aru;
        float fA01 = Constraints.A01(this.A00);
        C1833Arx c1833Arx = this.A02;
        C1779Aqf c1779Aqf = c1833Arx.A05;
        int i8 = c1833Arx.A01;
        Av1 av1 = c1833Arx.A03;
        C1822Arm c1822Arm = c1833Arx.A02;
        C1843AsG c1843AsG = AbstractC1844AsH.A00;
        C1831Arv c1831Arv = c1822Arm.A01;
        return new C1999Aw8(c1779Aqf, truncateAt, av1, charSequence, fA01, i, i8, i3, i5, i6, i7, i4, i2, (c1831Arv == null || (c1830Aru = c1831Arv.A00) == null) ? false : c1830Aru.A01);
    }

    @Override // X.InterfaceC2006AwF
    public final float AGD() {
        C1999Aw8 c1999Aw8 = this.A01;
        boolean z = c1999Aw8.A0C;
        Layout layout = c1999Aw8.A09;
        return (z ? layout.getLineBottom(c1999Aw8.A06 - 1) : layout.getHeight()) + c1999Aw8.A07 + c1999Aw8.A04 + c1999Aw8.A05;
    }

    @Override // X.InterfaceC2006AwF
    public final void AXa(C1EQ c1eq, InterfaceC1327AhE interfaceC1327AhE, C1780Aqg c1780Aqg, C16b c16b, BG3 bg3, float f, int i) {
        C1779Aqf c1779Aqf = this.A02.A05;
        int i2 = c1779Aqf.A00;
        c1779Aqf.A03(c1eq, f, AnonymousClass005.A0J(Constraints.A01(this.A00), AGD()));
        c1779Aqf.A04(c1780Aqg);
        c1779Aqf.A06(bg3);
        c1779Aqf.A05(c16b);
        c1779Aqf.A01(i);
        A01(interfaceC1327AhE, this);
        c1779Aqf.A01(i2);
    }

    public static final void A01(InterfaceC1327AhE interfaceC1327AhE, C1957Auw c1957Auw) {
        Canvas canvasA00 = AbstractC1290Aga.A00(interfaceC1327AhE);
        C1999Aw8 c1999Aw8 = c1957Auw.A01;
        boolean z = c1999Aw8.A0C;
        if (z) {
            canvasA00.save();
            canvasA00.clipRect(0.0f, 0.0f, Constraints.A01(c1957Auw.A00), c1957Auw.AGD());
        }
        if (canvasA00.getClipBounds(c1999Aw8.A08)) {
            int i = c1999Aw8.A07;
            if (i != 0) {
                canvasA00.translate(0.0f, i);
            }
            ThreadLocal<BE7> threadLocal = AbstractC2117Ayi.A01;
            BE7 be7 = threadLocal.get();
            if (be7 == null) {
                be7 = new BE7();
                threadLocal.set(be7);
            }
            BE7 be72 = be7;
            be72.A00 = canvasA00;
            try {
                c1999Aw8.A09.draw(be72);
                if (i != 0) {
                    canvasA00.translate(0.0f, (-1.0f) * i);
                }
            } finally {
                be72.A00 = null;
            }
        }
        if (z) {
            canvasA00.restore();
        }
    }
}
