package X;

import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.AJg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0953AJg<K, V> extends AJ0<K, V> implements InterfaceC0962AJp<K, V> {
    public static final C0953AJg A03;
    public final Object A00;
    public final Object A01;
    public final C0952AJf<K, AK6<V>> A02;

    @Override // X.InterfaceC0962AJp
    @Deprecated(message = "Use puttingAll() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "puttingAll(m)", imports = {}))
    public final InterfaceC0962AJp<K, V> AYm(Map<? extends K, ? extends V> map) {
        C7384Etj.A0Y(map, 0);
        if (map.isEmpty()) {
            return this;
        }
        C0954AJh c0954AJh = new C0954AJh(this);
        c0954AJh.putAll(map);
        return c0954AJh.A5S();
    }

    static {
        C0946AIz c0946AIz = C0946AIz.A00;
        A03 = new C0953AJg(c0946AIz, c0946AIz, C0952AJf.A02);
    }

    public static final <K, V> C0953AJg<K, V> A00() {
        return A03;
    }

    @Override // X.AJ0
    public final /* bridge */ /* synthetic */ Set A04() {
        return new AJ2(this);
    }

    @Override // X.AJ0
    public final int A05() {
        return this.A02.size();
    }

    @Override // X.InterfaceC0962AJp
    public final AGJ<K, V> A5b() {
        return new C0954AJh(this);
    }

    @Override // X.InterfaceC0962AJp
    public final /* bridge */ /* synthetic */ InterfaceC0962AJp AaZ(Object obj) {
        C0952AJf<K, AK6<V>> c0952AJf = this.A02;
        AK6<V> ak6 = c0952AJf.get(obj);
        if (ak6 == null) {
            return this;
        }
        C0952AJf c0952AJfA01 = C0952AJf.A01(obj, c0952AJf);
        Object obj2 = ak6.A01;
        C0946AIz c0946AIz = C0946AIz.A00;
        boolean zA1Z = AnonymousClass006.A1Z(obj2, c0946AIz);
        if (zA1Z) {
            V v = c0952AJfA01.get(obj2);
            C7384Etj.A0X(v);
            AK6 ak62 = (AK6) v;
            c0952AJfA01 = C0952AJf.A00(obj2, new AK6(ak62.A02, ak62.A01, ak6.A00), c0952AJfA01);
        }
        Object obj3 = ak6.A00;
        boolean zA1Z2 = AnonymousClass006.A1Z(obj3, c0946AIz);
        if (zA1Z2) {
            V v2 = c0952AJfA01.get(obj3);
            C7384Etj.A0X(v2);
            AK6 ak63 = (AK6) v2;
            c0952AJfA01 = C0952AJf.A00(obj3, new AK6(ak63.A02, obj2, ak63.A00), c0952AJfA01);
        }
        if (zA1Z) {
            obj3 = this.A00;
        }
        if (zA1Z2) {
            obj2 = this.A01;
        }
        return new C0953AJg(obj3, obj2, c0952AJfA01);
    }

    @Override // X.AJ0, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.A02.containsKey(obj);
    }

    @Override // X.AJ0, java.util.Map
    public final boolean equals(Object obj) {
        C0956AJj<K, AK6<V>> c0956AJj;
        C0956AJj<K, V> c0956AJj2;
        int i;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() == map.size()) {
                if (map instanceof C0953AJg) {
                    c0956AJj = this.A02.A00;
                    c0956AJj2 = ((C0953AJg) obj).A02.A00;
                    i = 9;
                } else if (map instanceof C0954AJh) {
                    c0956AJj = this.A02.A00;
                    c0956AJj2 = ((C0954AJh) obj).A03.A04;
                    i = 10;
                } else if (map instanceof C0952AJf) {
                    c0956AJj = this.A02.A00;
                    c0956AJj2 = ((C0952AJf) obj).A00;
                    i = 11;
                } else {
                    if (!(map instanceof C0955AJi)) {
                        return super.equals(obj);
                    }
                    c0956AJj = this.A02.A00;
                    c0956AJj2 = ((C0955AJi) obj).A04;
                    i = 12;
                }
                return c0956AJj.A0N(new C2280BSg(i), c0956AJj2);
            }
        }
        return false;
    }

    @Override // X.AJ0, java.util.Map
    public final V get(Object obj) {
        AK6<V> ak6 = this.A02.get(obj);
        if (ak6 != null) {
            return ak6.A02;
        }
        return null;
    }

    public C0953AJg(Object obj, Object obj2, C0952AJf<K, AK6<V>> c0952AJf) {
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = c0952AJf;
    }

    @Override // X.InterfaceC0962AJp
    public final /* bridge */ /* synthetic */ InterfaceC0962AJp AYj(Object obj, Object obj2) {
        boolean zIsEmpty = isEmpty();
        C0952AJf<K, AK6<V>> c0952AJf = this.A02;
        if (zIsEmpty) {
            C0946AIz c0946AIz = C0946AIz.A00;
            return new C0953AJg(obj, obj, C0952AJf.A00(obj, new AK6(obj2, c0946AIz, c0946AIz), c0952AJf));
        }
        AK6<V> ak6 = c0952AJf.get(obj);
        if (ak6 != null) {
            if (ak6.A02 == obj2) {
                return this;
            }
            return new C0953AJg(this.A00, this.A01, C0952AJf.A00(obj, new AK6(obj2, ak6.A01, ak6.A00), c0952AJf));
        }
        Object obj3 = this.A01;
        AK6<V> ak62 = c0952AJf.get(obj3);
        C7384Etj.A0X(ak62);
        AK6<V> ak63 = ak62;
        return new C0953AJg(this.A00, obj, C0952AJf.A00(obj, new AK6(obj2, obj3, C0946AIz.A00), C0952AJf.A00(obj3, new AK6(ak63.A02, ak63.A01, obj), c0952AJf)));
    }
}
