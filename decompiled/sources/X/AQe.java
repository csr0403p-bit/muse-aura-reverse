package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;

/* loaded from: classes4.dex */
public final class AQe implements APo {
    public final GraphicsLayer A00;
    public final /* synthetic */ C1020AQd A01;

    public AQe(C1020AQd c1020AQd, GraphicsLayer graphicsLayer) {
        this.A01 = c1020AQd;
        this.A00 = graphicsLayer;
    }

    @Override // X.APo
    public final void A9U(AT3 at3) {
        C1020AQd c1020AQd = this.A01;
        if (c1020AQd.A04) {
            long j = c1020AQd.A00;
            float fA03 = AnonymousClass003.A03(j);
            float fA00 = AnonymousClass004.A00(j);
            AT2 at2A00 = AT2.A00(at3, fA03, fA00);
            try {
                ATI.A00(at3, this.A00);
            } finally {
                AT2.A01(at2A00, fA03, fA00);
            }
        }
    }

    @Override // X.APo
    public final float AMw() {
        return this.A01.A05.AFn();
    }
}
