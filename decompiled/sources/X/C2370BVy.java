package X;

import java.util.LinkedList;
import java.util.List;

/* renamed from: X.BVy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2370BVy implements InterfaceC2356BVg {
    public final InterfaceC2356BVg A00;

    @Override // X.InterfaceC2356BVg
    public final List<C6153Dwv> AEg(String str, boolean z, boolean z2) {
        List<C6153Dwv> listAEg = this.A00.AEg(str, z, z2);
        if (str.contains("video") && listAEg.size() > 1) {
            LinkedList linkedList = new LinkedList(listAEg);
            C6153Dwv c6153Dwv = (C6153Dwv) linkedList.get(0);
            if (c6153Dwv != null && BeK.A04.A00(c6153Dwv.A06) == C79.A00) {
                linkedList.remove(0);
                listAEg = linkedList;
            }
        }
        AbstractC3426CMt.A03("MediaCodecSelectorHelper", "%s dec order (exclusion fallback order) %s", str, listAEg);
        return listAEg;
    }

    public C2370BVy(InterfaceC2356BVg interfaceC2356BVg) {
        this.A00 = interfaceC2356BVg;
    }
}
