package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class BVk implements InterfaceC2356BVg {
    public final /* synthetic */ boolean A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public BVk(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = z;
        this.A03 = z2;
        this.A02 = z3;
        this.A01 = z4;
        this.A04 = z5;
    }

    @Override // X.InterfaceC2356BVg
    public final List<C6153Dwv> AEg(String str, boolean z, boolean z2) {
        ArrayList arrayListA0t = BV4.A0t(InterfaceC2356BVg.A00.AEg(str, z, z2));
        boolean z3 = this.A00;
        BVp.A02(str, arrayListA0t, z3, this.A03, this.A02);
        if ("video/av01".equals(str)) {
            Collections.sort(arrayListA0t, new C2357BVh(this, str, this.A01, z3, this.A04));
            AbstractC3426CMt.A03("MediaCodecSelectorHelper", "%s dec order (sw first) %s", str, arrayListA0t);
        }
        return arrayListA0t;
    }
}
