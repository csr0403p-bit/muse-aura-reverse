package X;

import android.content.pm.PackageManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public final class CZk {
    public final C3623CZq A00 = new C3623CZq();
    public final PackageManager A01;

    public CZk(PackageManager packageManager) {
        this.A01 = packageManager;
    }

    public static final Set<CZm> A00(C3621CZn c3621CZn) {
        EnumC3622CZp enumC3622CZp;
        HashSet hashSetA13 = C60O.A13();
        if (!c3621CZn.A05) {
            hashSetA13.add(CZm.INSTALLER_DISABLED);
        }
        Set<EnumC3622CZp> set = c3621CZn.A04;
        if (set.isEmpty()) {
            hashSetA13.add(CZm.INSTALLER_NO_PRIVILEGES);
        }
        HashSet hashSetA132 = C60O.A13();
        int iOrdinal = c3621CZn.A02.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            hashSetA132.addAll(!set.contains(EnumC3622CZp.INSTALL) ? Collections.singleton(CZm.INSTALLER_MISSING_PRIVILEGE) : Collections.EMPTY_SET);
            enumC3622CZp = EnumC3622CZp.INSTALL_PACKAGE_UPDATES;
        } else {
            if (iOrdinal != 2) {
                if (iOrdinal == 4) {
                    hashSetA132.add(CZm.INSTALLER_BAD_SIGNATURE);
                }
                hashSetA13.addAll(hashSetA132);
                return hashSetA13;
            }
            hashSetA132.addAll(!set.contains(EnumC3622CZp.INSTALL_PACKAGE_UPDATES) ? Collections.singleton(CZm.INSTALLER_MISSING_PRIVILEGE) : Collections.EMPTY_SET);
            enumC3622CZp = EnumC3622CZp.INSTALL;
        }
        hashSetA132.addAll(set.contains(enumC3622CZp) ? Collections.singleton(CZm.INSTALLER_INVALID_PRIVILEGE) : Collections.EMPTY_SET);
        hashSetA13.addAll(hashSetA132);
        return hashSetA13;
    }
}
