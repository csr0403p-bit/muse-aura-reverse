package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;

/* loaded from: classes4.dex */
public final class ASO implements ASQ {
    public ASQ A00;
    public C0912AHo<GraphicsLayer> A01;

    public final void A00() {
        C0912AHo<GraphicsLayer> c0912AHo = this.A01;
        if (c0912AHo != null) {
            Object[] objArr = c0912AHo.A01;
            int i = ((AbstractC0913AHp) c0912AHo).A00;
            for (int i2 = 0; i2 < i; i2++) {
                AaE((GraphicsLayer) objArr[i2]);
            }
            c0912AHo.A06();
        }
    }

    @Override // X.ASQ
    public final GraphicsLayer A7n() {
        ASQ asq = this.A00;
        if (asq == null) {
            ASP.A01("GraphicsContext not provided");
            throw F60.createAndThrow();
        }
        GraphicsLayer graphicsLayerA7n = asq.A7n();
        C0912AHo<GraphicsLayer> c0912AHo = this.A01;
        if (c0912AHo != null) {
            c0912AHo.A09(graphicsLayerA7n);
            return graphicsLayerA7n;
        }
        C0912AHo<GraphicsLayer> c0912AHo2 = new C0912AHo<>(1);
        c0912AHo2.A09(graphicsLayerA7n);
        this.A01 = c0912AHo2;
        return graphicsLayerA7n;
    }

    @Override // X.ASQ
    public final ASS AKX() {
        ASQ asq = this.A00;
        if (asq != null) {
            return asq.AKX();
        }
        ASP.A01("GraphicsContext not provided");
        throw F60.createAndThrow();
    }

    @Override // X.ASQ
    public final void AaE(GraphicsLayer graphicsLayer) {
        ASQ asq = this.A00;
        if (asq != null) {
            asq.AaE(graphicsLayer);
        }
    }
}
