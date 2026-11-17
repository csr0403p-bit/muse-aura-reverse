package X;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Cje, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4007Cje implements InterfaceC3786CeU {
    public static final C4007Cje A01 = new C4007Cje(BV6.A0N());
    public final Bundle A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4007Cje)) {
            return false;
        }
        Bundle bundle = this.A00;
        Bundle bundle2 = ((C4007Cje) obj).A00;
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> setKeySet = bundle.keySet();
        if (!setKeySet.containsAll(bundle2.keySet())) {
            return false;
        }
        Iterator<String> it = setKeySet.iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            if (!CS7.A01(bundle.get(strA0j), bundle2.get(strA0j))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    public /* synthetic */ C4007Cje(Bundle bundle) {
        this.A00 = bundle;
    }
}
