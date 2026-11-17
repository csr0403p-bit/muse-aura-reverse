package X;

import android.graphics.RenderEffect;

/* renamed from: X.2b2, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2b2 {
    public static final RenderEffect A00(float f, float f2, int i) {
        return (f == 0.0f && f2 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : RenderEffect.createBlurEffect(f, f2, AbstractC2070Axl.A00(i));
    }
}
