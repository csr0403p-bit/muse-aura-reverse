package X;

import android.graphics.Canvas;

/* renamed from: X.EkV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7304EkV extends AbstractC7302EkT {
    @Override // X.AbstractC7302EkT, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C7384Etj.A0Y(canvas, 0);
        C7267Ejs.A00();
        if (!A02()) {
            super.draw(canvas);
            C7267Ejs.A00();
            return;
        }
        A00();
        A01();
        canvas.clipPath(this.A0C);
        super.draw(canvas);
        C7267Ejs.A00();
    }
}
