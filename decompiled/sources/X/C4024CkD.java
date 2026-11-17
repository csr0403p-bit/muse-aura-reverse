package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.CkD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4024CkD implements InterfaceC4037Ckd {
    public final InterfaceC4039Ckg A00;

    @Override // X.InterfaceC4037Ckd
    public final void AR3(CYD cyd) {
        String str = this.A00.get();
        if (str != null) {
            String strA0M = FGI.A0M("OAuth ", str);
            Map<String, Set<String>> map = cyd.A06;
            Set<String> setA0k = map.get("Authorization");
            if (setA0k == null) {
                setA0k = C3cG.A0k();
                map.put("Authorization", setA0k);
            }
            setA0k.add(strA0M);
        }
    }

    public C4024CkD(InterfaceC4039Ckg interfaceC4039Ckg) {
        this.A00 = interfaceC4039Ckg;
    }
}
