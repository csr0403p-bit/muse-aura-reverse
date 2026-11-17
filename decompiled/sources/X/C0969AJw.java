package X;

/* renamed from: X.AJw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0969AJw extends C0958AJl implements AK3 {
    public C0967AJu A00;

    public static final C0967AJu A00(C0969AJw c0969AJw) {
        C0957AJk<K, V> c0957AJk = c0969AJw.A01;
        C0967AJu c0967AJu = c0969AJw.A00;
        if (c0957AJk != c0967AJu.A00) {
            c0969AJw.A02 = new C0902AHe();
            c0967AJu = new C0967AJu(c0957AJk, c0969AJw.size());
        }
        c0969AJw.A00 = c0967AJu;
        return c0967AJu;
    }

    @Override // X.C0958AJl, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AKN) {
            return super.containsKey(obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof AKP) {
            return super.containsValue(obj);
        }
        return false;
    }

    @Override // X.C0958AJl, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof AKN) {
            return super.get(obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AKN) ? obj2 : super.getOrDefault(obj, obj2);
    }

    @Override // X.C0958AJl, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj instanceof AKN) {
            return super.remove(obj);
        }
        return null;
    }

    @Override // X.C0958AJl
    /* renamed from: A02 */
    public final /* bridge */ /* synthetic */ C0959AJm A5O() {
        return A00(this);
    }

    @Override // X.C0958AJl, X.AK3
    public final /* bridge */ /* synthetic */ AK8 A5O() {
        return A00(this);
    }
}
