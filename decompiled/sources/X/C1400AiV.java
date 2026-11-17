package X;

import android.graphics.Canvas;
import android.graphics.Picture;
import androidx.compose.ui.graphics.layer.GraphicsLayer;

/* renamed from: X.AiV, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1400AiV extends Picture {
    public final GraphicsLayer A00;

    @Override // android.graphics.Picture
    public final Canvas beginRecording(int i, int i2) {
        return new Canvas();
    }

    @Override // android.graphics.Picture
    public final void draw(Canvas canvas) {
        GraphicsLayer graphicsLayer = this.A00;
        Canvas canvas2 = AbstractC1290Aga.A00;
        C1572Alm c1572Alm = new C1572Alm();
        c1572Alm.A00 = canvas;
        graphicsLayer.A0B(c1572Alm, null);
    }

    @Override // android.graphics.Picture
    public final void endRecording() {
    }

    @Override // android.graphics.Picture
    public final int getHeight() {
        return AnonymousClass002.A09(this.A00.A05);
    }

    @Override // android.graphics.Picture
    public final int getWidth() {
        return C8j3.A0G(this.A00.A05);
    }

    @Override // android.graphics.Picture
    public final boolean requiresHardwareAcceleration() {
        return true;
    }

    public C1400AiV(GraphicsLayer graphicsLayer) {
        this.A00 = graphicsLayer;
    }
}
