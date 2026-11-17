package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: X.Fcp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8375Fcp {
    public final Paint A00;
    public final Path A01;
    public final C8377Fcr A02;
    public final C8377Fcr A03;
    public final C8377Fcr A04;

    public C8375Fcp() {
        Paint paintA0T = AbstractC7607F5u.A0T();
        this.A00 = paintA0T;
        this.A01 = AbstractC7607F5u.A0V();
        this.A04 = C8377Fcr.A00();
        this.A02 = C8377Fcr.A00();
        this.A03 = C8377Fcr.A00();
        AbstractC7610F5x.A17(paintA0T);
        paintA0T.setColor(-14298266);
        paintA0T.setMaskFilter(new BlurMaskFilter(175.0f, BlurMaskFilter.Blur.NORMAL));
    }
}
