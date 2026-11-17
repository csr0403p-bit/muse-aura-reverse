package X;

import android.graphics.Paint;
import android.text.Layout;
import com.facebook.aura.devices.pairing.FittedMuseGadgetNameKt;

/* renamed from: X.AwC, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2003AwC {
    public static final float A00(Paint paint, Layout layout, int i) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        if (!AnonymousClass002.A1N(layout.getEllipsisCount(i)) || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i)) - lineLeft) + paint.measureText(FittedMuseGadgetNameKt.ELLIPSIS);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment == null || AbstractC2032Awl.A00[paragraphAlignment.ordinal()] != 1) {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - primaryHorizontal;
        } else {
            fAbs = Math.abs(lineLeft);
            width = C8j3.A00(layout.getWidth(), primaryHorizontal);
        }
        return fAbs + width;
    }

    public static final float A01(Paint paint, Layout layout, int i) {
        float width;
        float width2;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float lineRight = (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i))) + paint.measureText(FittedMuseGadgetNameKt.ELLIPSIS);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment == null || AbstractC2032Awl.A00[paragraphAlignment.ordinal()] != 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - lineRight;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = C8j3.A00(layout.getWidth(), lineRight);
        }
        return width - width2;
    }
}
