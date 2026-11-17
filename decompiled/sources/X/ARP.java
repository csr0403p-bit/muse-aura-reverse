package X;

/* loaded from: classes4.dex */
public abstract class ARP {
    public abstract boolean A02(ARR<?> arr);

    public final <T> T A00(ARR<T> arr) {
        if (!(this instanceof ARO)) {
            throw C3cG.A0Q("");
        }
        ARO aro = (ARO) this;
        if (arr != aro.A01) {
            ASP.A01("Check failed.");
            throw F60.createAndThrow();
        }
        T t = (T) aro.A00.getValue();
        if (t == null) {
            return null;
        }
        return t;
    }

    public <T> void A01(ARR<T> arr, T t) {
        throw C3cG.A0Q("");
    }
}
