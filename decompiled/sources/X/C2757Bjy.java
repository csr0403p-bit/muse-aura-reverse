package X;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* renamed from: X.Bjy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2757Bjy extends BkE {
    public C2757Bjy(int i, Surface surface) {
        super(new OutputConfiguration(i, surface));
    }

    public static C2757Bjy A00(OutputConfiguration outputConfiguration) {
        return new C2757Bjy(outputConfiguration);
    }

    @Override // X.BkD, X.Bl6
    public final Object AIM() {
        Object obj = this.A00;
        BeS.A05(obj instanceof OutputConfiguration);
        return obj;
    }

    @Override // X.BkE, X.Bl6
    public final void AdM(long j) {
        Object obj = this.A00;
        BeS.A05(obj instanceof OutputConfiguration);
        ((OutputConfiguration) obj).setDynamicRangeProfile(j);
    }

    @Override // X.BkD, X.Bl6
    public final void Adm(int i) {
        Object obj = this.A00;
        BeS.A05(obj instanceof OutputConfiguration);
        ((OutputConfiguration) obj).setMirrorMode(i);
    }

    @Override // X.BkD, X.Bl6
    public final void Aem(long j) {
        if (j != -1) {
            Object obj = this.A00;
            BeS.A05(obj instanceof OutputConfiguration);
            ((OutputConfiguration) obj).setStreamUseCase(j);
        }
    }
}
