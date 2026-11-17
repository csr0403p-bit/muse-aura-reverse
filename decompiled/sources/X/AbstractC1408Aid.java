package X;

import android.graphics.RenderEffect;

/* renamed from: X.Aid, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1408Aid {
    public RenderEffect A00;

    public abstract RenderEffect A01();

    public final RenderEffect A00() {
        RenderEffect renderEffect = this.A00;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectA01 = A01();
        this.A00 = renderEffectA01;
        return renderEffectA01;
    }
}
