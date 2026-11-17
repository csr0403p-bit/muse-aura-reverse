package X;

import androidx.media3.common.Timeline;
import java.util.List;

/* renamed from: X.E5j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6431E5j implements InterfaceC6435E5n {
    public int A00;
    public boolean A01;
    public final C6004Dtn A02;
    public final List<Dy6> A04 = C3cG.A0h();
    public final Object A03 = C3cG.A0T();

    @Override // X.InterfaceC6435E5n
    public final Timeline ALh() {
        return this.A02.A01;
    }

    @Override // X.InterfaceC6435E5n
    public final Object AMD() {
        return this.A03;
    }

    public C6431E5j(InterfaceC6009Dts interfaceC6009Dts, boolean z) {
        this.A02 = new C6004Dtn(interfaceC6009Dts, z);
    }
}
