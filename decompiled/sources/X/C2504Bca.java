package X;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.Bca, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2504Bca implements InterfaceC2502BcY {
    public final DynamicRangeProfiles A00;

    @Override // X.InterfaceC2502BcY
    public final Set<C2507Bcd> AF0(C2507Bcd c2507Bcd) {
        DynamicRangeProfiles dynamicRangeProfiles = this.A00;
        Long lA00 = AbstractC2505Bcb.A00(dynamicRangeProfiles, c2507Bcd);
        BeS.A06(AnonymousClass002.A1X(lA00), AnonymousClass007.A0a("DynamicRange is not supported: ", c2507Bcd));
        return A00(dynamicRangeProfiles.getProfileCaptureRequestConstraints(lA00.longValue()));
    }

    @Override // X.InterfaceC2502BcY
    public final Set<C2507Bcd> ALL() {
        return A00(this.A00.getSupportedProfiles());
    }

    @Override // X.InterfaceC2502BcY
    public final DynamicRangeProfiles Aho() {
        return this.A00;
    }

    public C2504Bca(Object obj) {
        this.A00 = (DynamicRangeProfiles) obj;
    }

    public static Set<C2507Bcd> A00(Set<Long> set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        for (Long l : set) {
            long jLongValue = l.longValue();
            C2507Bcd c2507Bcd = AbstractC2505Bcb.A00.get(l);
            BeS.A03(c2507Bcd, FGI.A0B(jLongValue, "Dynamic range profile cannot be converted to a DynamicRange object: "));
            hashSet.add(c2507Bcd);
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
