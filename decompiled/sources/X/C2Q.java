package X;

import android.os.Build;
import java.util.AbstractMap;

/* loaded from: classes5.dex */
public abstract class C2Q {
    public static InterfaceC3234C4r A00;

    public static InterfaceC3234C4r A00() {
        InterfaceC3234C4r interfaceC3234C4r = A00;
        if (interfaceC3234C4r != null) {
            return interfaceC3234C4r;
        }
        C2P c2p = new C2P();
        A00 = c2p;
        return c2p;
    }

    public static InterfaceC3234C4r A01(Object obj, Object obj2, AbstractMap abstractMap, boolean z, boolean z2) {
        abstractMap.put(obj, obj2);
        abstractMap.put("has_critical", String.valueOf(z));
        abstractMap.put("has_large", String.valueOf(z2));
        abstractMap.put("device_brand", Build.BRAND);
        return A00();
    }
}
