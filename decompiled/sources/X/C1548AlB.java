package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.layer.GraphicsLayer;

/* renamed from: X.AlB, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1548AlB implements ASQ {
    public boolean A00;
    public ASS A01;
    public final ViewGroup A03;
    public final Object A04 = C3cG.A0T();
    public final ComponentCallbacks2 A02 = new ComponentCallbacks2C1551AlG(this);

    public static final void A00(C1548AlB c1548AlB) {
        ASS ass = c1548AlB.A01;
        if (ass != null) {
            C1545Al8 c1545Al8 = (C1545Al8) ass;
            synchronized (c1545Al8) {
                C0918AHu<C1546Al9, C1547AlA> c0918AHu = c1545Al8.A00;
                if (c0918AHu != null) {
                    c0918AHu.A0D();
                }
                c1545Al8.A01 = null;
            }
        }
        c1548AlB.A01 = null;
    }

    @Override // X.ASQ
    public final GraphicsLayer A7n() {
        GraphicsLayer graphicsLayer;
        synchronized (this.A04) {
            this.A03.getUniqueDrawingId();
            graphicsLayer = new GraphicsLayer(new C1391AiM());
        }
        return graphicsLayer;
    }

    @Override // X.ASQ
    public final ASS AKX() {
        ASS ass = this.A01;
        if (ass != null) {
            return ass;
        }
        C1545Al8 c1545Al8 = new C1545Al8();
        this.A01 = c1545Al8;
        return c1545Al8;
    }

    @Override // X.ASQ
    public final void AaE(GraphicsLayer graphicsLayer) {
        synchronized (this.A04) {
            if (!graphicsLayer.A0C) {
                graphicsLayer.A0C = true;
                GraphicsLayer.A04(graphicsLayer);
            }
        }
    }

    public C1548AlB(ViewGroup viewGroup) {
        this.A03 = viewGroup;
        if (viewGroup.isAttachedToWindow()) {
            Context context = viewGroup.getContext();
            if (!this.A00) {
                context.getApplicationContext().registerComponentCallbacks(this.A02);
                this.A00 = true;
            }
        }
        viewGroup.addOnAttachStateChangeListener(new BSC(this, 0));
    }
}
