package X;

import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes6.dex */
public final class FK0 extends View {
    public EtN A00;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C7384Etj.A0Y(canvas, 0);
        super.onDraw(canvas);
        EtN etN = this.A00;
        if (etN != null) {
            etN.A10(canvas);
        }
    }

    public final EtN getCanvasModel() {
        return this.A00;
    }

    public final void setCanvasModel(EtN etN) {
        if (C7384Etj.areEqual(this.A00, etN)) {
            return;
        }
        this.A00 = etN;
        invalidate();
    }
}
