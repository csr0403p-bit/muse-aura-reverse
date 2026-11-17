package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;

/* renamed from: X.Agd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1293Agd implements InterfaceC1294Age {
    public static final C1293Agd A00 = new C1293Agd();

    @Override // X.InterfaceC1294Age
    public final Bitmap Agt(GraphicsLayer graphicsLayer) {
        long j = graphicsLayer.A05;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(C8j3.A0G(j), AnonymousClass002.A09(j), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Canvas canvas2 = AbstractC1290Aga.A00;
        C1572Alm c1572Alm = new C1572Alm();
        c1572Alm.A00 = canvas;
        graphicsLayer.A0B(c1572Alm, null);
        return bitmapCreateBitmap;
    }
}
