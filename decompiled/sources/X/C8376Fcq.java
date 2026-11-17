package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: X.Fcq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8376Fcq {
    public final Paint A00;
    public final Path A01;
    public final C8378Fcs A02;
    public final C8378Fcs A03;
    public final C8378Fcs A04;

    public C8376Fcq() {
        Paint paintA0T = AbstractC7607F5u.A0T();
        this.A00 = paintA0T;
        this.A01 = AbstractC7607F5u.A0V();
        this.A04 = C8378Fcs.A00();
        this.A02 = C8378Fcs.A00();
        this.A03 = C8378Fcs.A00();
        AbstractC7610F5x.A17(paintA0T);
        paintA0T.setColor(-14298266);
        paintA0T.setMaskFilter(new BlurMaskFilter(175.0f, BlurMaskFilter.Blur.NORMAL));
    }
}
