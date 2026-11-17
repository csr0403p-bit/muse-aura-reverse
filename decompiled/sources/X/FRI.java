package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.aura.widgets.WidgetComponentsKt;

/* loaded from: classes6.dex */
public final class FRI implements InterfaceC10565Htv {
    public final Paint A00;
    public final Paint A01;
    public final FRN A02;
    public final FRN A03;

    @Override // X.InterfaceC10565Htv
    public final void A9I(Canvas canvas, Hrs hrs) {
        AnonymousClass002.A1D(canvas, 0, hrs);
        FRN frn = this.A02;
        if (frn != null) {
            A00(canvas, this.A00, frn);
        }
        hrs.A9D(canvas);
        FRN frn2 = this.A03;
        if (frn2 != null) {
            A00(canvas, this.A01, frn2);
        }
    }

    public FRI(FRN frn, FRN frn2) {
        this.A02 = frn;
        this.A03 = frn2;
        Paint paintA0T = AbstractC7607F5u.A0T();
        paintA0T.setColor(frn != null ? frn.A03 : 0);
        Paint.Style style = Paint.Style.FILL;
        paintA0T.setStyle(style);
        this.A00 = paintA0T;
        Paint paintA0T2 = AbstractC7607F5u.A0T();
        paintA0T2.setColor(frn2 != null ? frn2.A03 : 0);
        paintA0T2.setStyle(style);
        this.A01 = paintA0T2;
    }

    private final void A00(Canvas canvas, Paint paint, FRN frn) {
        int width = canvas.getWidth();
        String str = frn.A04;
        float fMin = Math.min(Math.max(0.0f, (WidgetComponentsKt.START_PATH.equals(str) ? 0 : "end".equals(str) ? width : width / 2) + frn.A00), width);
        int height = canvas.getHeight();
        String str2 = frn.A06;
        float fMin2 = Math.min(Math.max(0.0f, (WidgetComponentsKt.START_PATH.equals(str2) ? 0 : "end".equals(str2) ? height : height / 2) + frn.A02), height);
        if ("circle".equals(frn.A05)) {
            canvas.drawCircle(fMin, fMin2, frn.A01, paint);
        }
    }
}
