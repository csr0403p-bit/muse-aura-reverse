package X;

import android.graphics.Canvas;
import com.facebook.rendercore.text.RCTextView;

/* loaded from: classes6.dex */
public final class FRO implements Hrs {
    public final /* synthetic */ RCTextView A00;

    public FRO(RCTextView rCTextView) {
        this.A00 = rCTextView;
    }

    @Override // X.Hrs
    public final void A9D(Canvas canvas) {
        RCTextView.A03(canvas, this.A00);
    }
}
