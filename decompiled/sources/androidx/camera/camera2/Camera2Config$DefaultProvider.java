package androidx.camera.camera2;

import X.Bh2;
import X.Bh4;
import X.Bh5;
import X.C2582Bee;
import X.C2584Beg;
import X.C2598Bew;
import X.C2647Bge;
import X.InterfaceC2673BhJ;

/* loaded from: classes5.dex */
public final class Camera2Config$DefaultProvider implements Bh2 {
    @Override // X.Bh2
    public C2647Bge getCameraXConfig() {
        Bh4 bh4 = new Bh4() { // from class: X.Bgv
        };
        Bh5 bh5 = new Bh5() { // from class: X.Bgw
        };
        InterfaceC2673BhJ interfaceC2673BhJ = new InterfaceC2673BhJ() { // from class: X.Bgx
        };
        C2582Bee c2582Bee = new C2598Bew().A00;
        c2582Bee.ANl(C2647Bge.A03, bh4);
        c2582Bee.ANl(C2647Bge.A06, bh5);
        c2582Bee.ANl(C2647Bge.A0A, interfaceC2673BhJ);
        return new C2647Bge(C2584Beg.A02(c2582Bee));
    }
}
