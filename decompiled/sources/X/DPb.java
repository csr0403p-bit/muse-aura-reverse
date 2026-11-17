package X;

/* loaded from: classes5.dex */
public abstract class DPb {
    public static boolean A00(InterfaceC5026DPa<?> multiset, Object object) {
        if (object != multiset) {
            if (object instanceof InterfaceC5026DPa) {
                InterfaceC5026DPa interfaceC5026DPa = (InterfaceC5026DPa) object;
                if (multiset.size() == interfaceC5026DPa.size() && multiset.entrySet().size() == interfaceC5026DPa.entrySet().size()) {
                    for (DPD dpd : interfaceC5026DPa.entrySet()) {
                        if (multiset.A7Q(dpd.A01()) != dpd.A00()) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
