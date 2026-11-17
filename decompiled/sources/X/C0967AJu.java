package X;

/* renamed from: X.AJu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0967AJu extends C0959AJm<AKN<Object>, AKP<Object>> implements AKQ {
    public static final C0967AJu A00 = new C0967AJu(C0957AJk.A04, 0);

    @Override // X.C0959AJm
    /* renamed from: A07 */
    public final /* bridge */ /* synthetic */ C0958AJl<AKN<Object>, AKP<Object>> A5Z() {
        C0969AJw c0969AJw = new C0969AJw(this);
        c0969AJw.A00 = this;
        return c0969AJw;
    }

    @Override // X.C0959AJm, X.AK8
    public final /* bridge */ /* synthetic */ AK3 A5Z() {
        C0969AJw c0969AJw = new C0969AJw(this);
        c0969AJw.A00 = this;
        return c0969AJw;
    }

    @Override // X.AKQ
    public final AKQ AYs(AKN<Object> akn, AKP<Object> akp) {
        AK4 ak4A0E = this.A00.A0E(akn, akp, akn.hashCode(), 0);
        return ak4A0E == null ? this : new C0967AJu(ak4A0E.A00, size() + ak4A0E.A01);
    }

    @Override // X.C0959AJm, X.AJ0, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AKN) {
            return super.containsKey(obj);
        }
        return false;
    }

    @Override // X.AJ0, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof AKP) {
            return super.containsValue(obj);
        }
        return false;
    }

    @Override // X.C0959AJm, X.AJ0, java.util.Map
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
}
