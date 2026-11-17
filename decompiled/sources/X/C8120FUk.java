package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.FUk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8120FUk extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C8117FUh A02;

    public C8120FUk(C8117FUh c8117FUh, int i, int i2) {
        this.A02 = c8117FUh;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.A02.A0H.setAlpha((int) (this.A01 + ((this.A00 - r2) * f)));
    }
}
