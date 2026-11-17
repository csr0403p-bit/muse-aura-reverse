package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RenderNode;

/* loaded from: classes5.dex */
public final class EGS {
    public Bitmap A00;
    public RenderNode A01;
    public final Canvas A02 = new Canvas();

    public final void A00() {
        this.A02.setBitmap(null);
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.A00 = null;
        RenderNode renderNode = this.A01;
        if (renderNode != null) {
            renderNode.discardDisplayList();
        }
        this.A01 = null;
    }
}
