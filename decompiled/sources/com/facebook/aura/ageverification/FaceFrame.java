package com.facebook.aura.ageverification;

import X.AnonymousClass003;
import X.G0U;
import java.util.List;

/* loaded from: classes3.dex */
public final class FaceFrame {
    public static final int $stable = 8;
    public final List<NormalizedFace> faces;
    public final float luma;
    public final G0U<Float, FaceSnapshot> snapshot;

    public final List<NormalizedFace> getFaces() {
        return this.faces;
    }

    public final float getLuma() {
        return this.luma;
    }

    public final G0U<Float, FaceSnapshot> getSnapshot() {
        return this.snapshot;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FaceFrame(List<NormalizedFace> list, float f, G0U<? super Float, FaceSnapshot> g0u) {
        AnonymousClass003.A0v(list, g0u);
        this.faces = list;
        this.luma = f;
        this.snapshot = g0u;
    }
}
