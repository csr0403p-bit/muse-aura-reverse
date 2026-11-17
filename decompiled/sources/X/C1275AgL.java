package X;

import android.content.Context;
import android.widget.EdgeEffect;

/* renamed from: X.AgL, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1275AgL extends EdgeEffect {
    public float A00;
    public final float A01;

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.A00 = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.A00 = 0.0f;
        super.onPull(f);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.A00 = 0.0f;
        super.onRelease();
    }

    public C1275AgL(Context context) {
        super(context);
        this.A01 = 1.0f * AbstractC1500Ak7.A00(context).A00;
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.A00 = 0.0f;
        super.onPull(f, f2);
    }
}
