package X;

import androidx.camera.core.ImageProcessingUtil;

/* loaded from: classes5.dex */
public final class F4Y implements InterfaceC2889Bnx {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public F4Y(InterfaceC2873Bng interfaceC2873Bng, InterfaceC2873Bng interfaceC2873Bng2, int i) {
        this.$t = i;
        this.A00 = interfaceC2873Bng;
        this.A01 = interfaceC2873Bng2;
    }

    @Override // X.InterfaceC2889Bnx
    public final void ATY(InterfaceC2873Bng interfaceC2873Bng) {
        InterfaceC2873Bng interfaceC2873Bng2 = (InterfaceC2873Bng) this.A01;
        int i = ImageProcessingUtil.A00;
        interfaceC2873Bng2.close();
    }
}
