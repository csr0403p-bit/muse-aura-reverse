package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.Cdx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3760Cdx implements InterfaceC3751Cdo {
    public transient Map A00;
    public transient Set A01;

    public static Map A00(AbstractC3760Cdx abstractC3760Cdx) {
        Map map = abstractC3760Cdx.A00;
        if (map != null) {
            return map;
        }
        Ce3 ce3 = (Ce3) abstractC3760Cdx;
        C3761Cdy c3761Cdy = new C3761Cdy(ce3, ce3.A01);
        abstractC3760Cdx.A00 = c3761Cdy;
        return c3761Cdy;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC3751Cdo) {
            return A00(this).equals(A00((AbstractC3760Cdx) ((InterfaceC3751Cdo) obj)));
        }
        return false;
    }

    public final int hashCode() {
        return A00(this).hashCode();
    }

    public final String toString() {
        return ((C3761Cdy) A00(this)).A02.toString();
    }
}
