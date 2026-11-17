package X;

import com.facebook.tigon.iface.TigonPropertyContainer;
import com.facebook.tigon.iface.TigonRequest;

/* loaded from: classes5.dex */
public final class CY1 extends TigonPropertyContainer {
    public final TigonRequest A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CY1) {
            return super.equals(obj);
        }
        return false;
    }

    public CY1(TigonRequest tigonRequest) {
        this.A00 = tigonRequest;
    }
}
