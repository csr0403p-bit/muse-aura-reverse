package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes6.dex */
public final class FGJ extends FGU {
    public final FGG A00;

    @Override // X.FGU
    public final FGG getRootHostDelegate() {
        return this.A00;
    }

    public FGJ(Context context) {
        super(context);
        this.A00 = new FGC(this);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AnonymousClass003.A0u(canvas, view);
        FMA.A00(canvas, view);
        return super.drawChild(canvas, view, j);
    }
}
