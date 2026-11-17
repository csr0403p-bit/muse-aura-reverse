package X;

import android.graphics.Canvas;
import android.graphics.Path;
import android.text.Layout;

/* loaded from: classes6.dex */
public final class Hkb implements InterfaceC10565Htv {
    public final float A00;
    public final float A01;
    public final Path A02;
    public final EtN A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v4, types: [X.EtN] */
    public Hkb(Layout layout, FDW fdw, InterfaceC10557Hsn interfaceC10557Hsn, int i, int i2) {
        EtN etN;
        int lineForOffset = layout.getLineForOffset(i);
        int lineForOffset2 = layout.getLineForOffset(i2 - 1);
        float primaryHorizontal = layout.getPrimaryHorizontal(i);
        float primaryHorizontal2 = layout.getPrimaryHorizontal(i2);
        Path pathA0V = AbstractC7607F5u.A0V();
        float fMin = Float.MAX_VALUE;
        float fMax = -3.4028235E38f;
        if (lineForOffset <= lineForOffset2) {
            int i3 = lineForOffset;
            while (true) {
                float lineLeft = i3 == lineForOffset ? primaryHorizontal : layout.getLineLeft(i3);
                float lineRight = i3 == lineForOffset2 ? primaryHorizontal2 : layout.getLineRight(i3);
                float fMin2 = Math.min(lineLeft, lineRight);
                float fMax2 = Math.max(lineLeft, lineRight);
                pathA0V.addRect(fMin2, layout.getLineTop(i3), fMax2, layout.getLineBottom(i3), Path.Direction.CW);
                fMin = Math.min(fMin, fMin2);
                fMax = Math.max(fMax, fMax2);
                if (i3 == lineForOffset2) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        float lineTop = layout.getLineTop(lineForOffset);
        float f = fMax - fMin;
        float lineBottom = layout.getLineBottom(lineForOffset2) - lineTop;
        FBB fbbA00 = 0;
        if (f <= 0.0f || lineBottom <= 0.0f) {
            return;
        }
        try {
            fbbA00 = HxQ.A00(new C7377EtL(5, 10), fdw, interfaceC10557Hsn, AbstractC5463Diy.A01(f, lineBottom));
            etN = fbbA00;
        } catch (Exception e) {
            FFI.A01(fbbA00, "Failed to parse canvas background", e);
            etN = fbbA00;
        }
        this.A03 = etN;
        this.A02 = pathA0V;
        this.A00 = fMin;
        this.A01 = lineTop;
    }

    @Override // X.InterfaceC10565Htv
    public final void A9I(Canvas canvas, Hrs hrs) {
        AnonymousClass002.A1D(canvas, 0, hrs);
        EtN etN = this.A03;
        Path path = this.A02;
        if (etN != null && path != null) {
            int iSave = canvas.save();
            canvas.clipPath(path);
            try {
                canvas.translate(this.A00, this.A01);
                try {
                    etN.A10(canvas);
                } catch (Exception e) {
                    FFI.A01(null, "Failed to draw canvas background", e);
                }
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
        hrs.A9D(canvas);
    }
}
