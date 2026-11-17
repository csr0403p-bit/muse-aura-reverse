package X;

import android.graphics.PathMeasure;

/* renamed from: X.B0s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2174B0s implements InterfaceC2177B0v {
    public final PathMeasure A00;

    @Override // X.InterfaceC2177B0v
    public final void AK8(InterfaceC1068ATy interfaceC1068ATy, float f, float f2, boolean z) {
        PathMeasure pathMeasure = this.A00;
        if (!(interfaceC1068ATy instanceof C1710Aot)) {
            throw C8j3.A18("Unable to obtain android.graphics.Path");
        }
        pathMeasure.getSegment(f, f2, ((C1710Aot) interfaceC1068ATy).A03, z);
    }

    public C2174B0s(PathMeasure pathMeasure) {
        this.A00 = pathMeasure;
    }
}
