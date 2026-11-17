package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: X.Fcn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8373Fcn {
    public final Paint A00;
    public final Path A01;
    public final C8377Fcr A02;
    public final C8377Fcr A03;
    public final C8377Fcr A04;
    public final C8377Fcr A05;
    public final C8377Fcr A06;

    public final void A00() {
        Path path = this.A01;
        path.reset();
        C8377Fcr c8377Fcr = this.A06;
        path.moveTo(c8377Fcr.A00, c8377Fcr.A01);
        C8377Fcr c8377Fcr2 = this.A02;
        float f = c8377Fcr2.A00;
        float f2 = c8377Fcr2.A01;
        C8377Fcr c8377Fcr3 = this.A03;
        float f3 = c8377Fcr3.A00;
        float f4 = c8377Fcr3.A01;
        C8377Fcr c8377Fcr4 = this.A04;
        path.cubicTo(f, f2, f3, f4, c8377Fcr4.A00, c8377Fcr4.A01);
        C8377Fcr c8377Fcr5 = this.A05;
        path.lineTo(c8377Fcr5.A00, c8377Fcr5.A01);
        path.close();
    }

    public C8373Fcn(int i, int i2) {
        Paint paintA0T = AbstractC7607F5u.A0T();
        this.A00 = paintA0T;
        this.A01 = AbstractC7607F5u.A0V();
        this.A05 = C8377Fcr.A00();
        this.A06 = C8377Fcr.A00();
        this.A04 = C8377Fcr.A00();
        this.A02 = C8377Fcr.A00();
        this.A03 = C8377Fcr.A00();
        AbstractC7610F5x.A17(paintA0T);
        paintA0T.setColor(i);
        paintA0T.setMaskFilter(new BlurMaskFilter(i2, BlurMaskFilter.Blur.NORMAL));
    }
}
