package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;

/* renamed from: X.Ejw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7271Ejw {
    public final C7270Ejv A00;
    public final InterfaceC7181Ehq A01;
    public final boolean A02;
    public final Paint A03;

    private boolean A01(int i) {
        if (i != 0) {
            C7285EkC[] c7285EkCArr = this.A00.A0B;
            C7285EkC c7285EkC = c7285EkCArr[i];
            C7285EkC c7285EkC2 = c7285EkCArr[i - 1];
            if (c7285EkC.A05 != C79.A01 || !A02(c7285EkC)) {
                return c7285EkC2.A04 == EnumC2379BWs.DISPOSE_TO_BACKGROUND && A02(c7285EkC2);
            }
        }
        return true;
    }

    private void A00(Canvas canvas, C7285EkC c7285EkC) {
        canvas.drawRect(c7285EkC.A02, c7285EkC.A03, r2 + c7285EkC.A01, r1 + c7285EkC.A00, this.A03);
    }

    private boolean A02(C7285EkC c7285EkC) {
        if (c7285EkC.A02 == 0 && c7285EkC.A03 == 0) {
            int i = c7285EkC.A01;
            Rect rect = this.A00.A05;
            if (i == rect.width() && c7285EkC.A00 == rect.height()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Path cross not found for [B:86:0x01a3, B:65:0x015c], limit reached: 124 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x01d1 -> B:91:0x01b0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(int r13, android.graphics.Bitmap r14) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7271Ejw.A03(int, android.graphics.Bitmap):void");
    }

    public C7271Ejw(C7270Ejv c7270Ejv, InterfaceC7181Ehq interfaceC7181Ehq, boolean z) {
        this.A00 = c7270Ejv;
        this.A01 = interfaceC7181Ehq;
        this.A02 = z;
        Paint paint = new Paint();
        this.A03 = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }
}
