package X;

import android.animation.ValueAnimator;

/* renamed from: X.FeL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8457FeL implements InterfaceC8465FeT {
    public ValueAnimator.DurationScaleChangeListener A00;
    public final /* synthetic */ C8454FeI A01;

    public C8457FeL(C8454FeI c8454FeI) {
        this.A01 = c8454FeI;
    }

    public final /* synthetic */ void A00(float f) {
        this.A01.A00 = f;
    }

    @Override // X.InterfaceC8465FeT
    public final void AZy() {
        if (this.A00 == null) {
            ValueAnimator.DurationScaleChangeListener durationScaleChangeListener = new ValueAnimator.DurationScaleChangeListener() { // from class: X.FeP
                @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                public final void onChanged(float f) {
                    this.A00.A00(f);
                }
            };
            this.A00 = durationScaleChangeListener;
            ValueAnimator.registerDurationScaleChangeListener(durationScaleChangeListener);
        }
    }

    @Override // X.InterfaceC8465FeT
    public final void Ahi() {
        ValueAnimator.unregisterDurationScaleChangeListener(this.A00);
        this.A00 = null;
    }
}
