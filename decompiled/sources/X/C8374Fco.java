package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: X.Fco, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8374Fco {
    public final Paint A00;
    public final Path A01;
    public final C8378Fcs A02;
    public final C8378Fcs A03;
    public final C8378Fcs A04;
    public final C8378Fcs A05;
    public final C8378Fcs A06;

    public final void A00() {
        Path path = this.A01;
        path.reset();
        C8378Fcs c8378Fcs = this.A06;
        path.moveTo(c8378Fcs.A00, c8378Fcs.A01);
        C8378Fcs c8378Fcs2 = this.A02;
        float f = c8378Fcs2.A00;
        float f2 = c8378Fcs2.A01;
        C8378Fcs c8378Fcs3 = this.A03;
        float f3 = c8378Fcs3.A00;
        float f4 = c8378Fcs3.A01;
        C8378Fcs c8378Fcs4 = this.A04;
        path.cubicTo(f, f2, f3, f4, c8378Fcs4.A00, c8378Fcs4.A01);
        C8378Fcs c8378Fcs5 = this.A05;
        path.lineTo(c8378Fcs5.A00, c8378Fcs5.A01);
        path.close();
    }

    public C8374Fco(int i, int i2) {
        Paint paintA0T = AbstractC7607F5u.A0T();
        this.A00 = paintA0T;
        this.A01 = AbstractC7607F5u.A0V();
        this.A05 = C8378Fcs.A00();
        this.A06 = C8378Fcs.A00();
        this.A04 = C8378Fcs.A00();
        this.A02 = C8378Fcs.A00();
        this.A03 = C8378Fcs.A00();
        AbstractC7610F5x.A17(paintA0T);
        paintA0T.setColor(i);
        paintA0T.setMaskFilter(new BlurMaskFilter(i2, BlurMaskFilter.Blur.NORMAL));
    }
}
