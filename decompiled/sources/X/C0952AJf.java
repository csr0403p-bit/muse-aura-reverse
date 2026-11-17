package X;

import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.AJf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0952AJf<K, V> extends AJ0<K, V> implements InterfaceC0962AJp<K, V> {
    public static final C0952AJf A02 = new C0952AJf(C0956AJj.A04, 0);
    public final C0956AJj<K, V> A00;
    public final int A01;

    public C0952AJf(C0956AJj<K, V> c0956AJj, int i) {
        C7384Etj.A0Y(c0956AJj, 0);
        this.A00 = c0956AJj;
        this.A01 = i;
    }

    @Override // X.InterfaceC0962AJp
    @Deprecated(message = "Use puttingAll() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "puttingAll(m)", imports = {}))
    public final InterfaceC0962AJp<K, V> AYm(Map<? extends K, ? extends V> map) {
        C7384Etj.A0Y(map, 0);
        if (map.isEmpty()) {
            return this;
        }
        C0955AJi c0955AJi = new C0955AJi(this);
        c0955AJi.putAll(map);
        return c0955AJi.A5S();
    }

    @Deprecated(message = "Use putting() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "putting(key, value)", imports = {}))
    public static final C0952AJf A00(Object obj, Object obj2, C0952AJf c0952AJf) {
        AK5 ak5A0F = c0952AJf.A00.A0F(obj, obj2, C60R.A01(obj), 0);
        return ak5A0F == null ? c0952AJf : new C0952AJf(ak5A0F.A00, c0952AJf.size() + ak5A0F.A01);
    }

    @Deprecated(message = "Use removing() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "removing(key)", imports = {}))
    public static final C0952AJf A01(Object obj, C0952AJf c0952AJf) {
        C0956AJj<K, V> c0956AJj = c0952AJf.A00;
        C0956AJj<K, V> c0956AJjA0H = c0956AJj.A0H(obj, C60R.A01(obj), 0);
        return c0956AJj == c0956AJjA0H ? c0952AJf : c0956AJjA0H == null ? A02 : new C0952AJf(c0956AJjA0H, c0952AJf.size() - 1);
    }

    @Override // X.AJ0
    public final int A05() {
        return this.A01;
    }

    @Override // X.InterfaceC0962AJp
    public final /* bridge */ /* synthetic */ AGJ A5b() {
        return new C0955AJi(this);
    }

    @Override // X.AJ0, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.A00.A0M(obj, C60R.A01(obj), 0);
    }

    @Override // X.AJ0, java.util.Map
    public final boolean equals(Object obj) {
        C0956AJj<K, V> c0956AJj;
        C0956AJj<K, V> c0956AJj2;
        int i;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() == map.size()) {
                if (map instanceof C0953AJg) {
                    c0956AJj = this.A00;
                    c0956AJj2 = ((C0953AJg) obj).A02.A00;
                    i = 1;
                } else if (map instanceof C0954AJh) {
                    c0956AJj = this.A00;
                    c0956AJj2 = ((C0954AJh) obj).A03.A04;
                    i = 2;
                } else if (map instanceof C0952AJf) {
                    c0956AJj = this.A00;
                    c0956AJj2 = ((C0952AJf) obj).A00;
                    i = 3;
                } else {
                    if (!(map instanceof C0955AJi)) {
                        return super.equals(obj);
                    }
                    c0956AJj = this.A00;
                    c0956AJj2 = ((C0955AJi) obj).A04;
                    i = 4;
                }
                return c0956AJj.A0N(new C2280BSg(i), c0956AJj2);
            }
        }
        return false;
    }

    @Override // X.AJ0, java.util.Map
    public final V get(Object obj) {
        return (V) this.A00.A0E(obj, obj != null ? obj.hashCode() : 0, 0);
    }

    @Override // X.InterfaceC0962AJp
    public final /* bridge */ /* synthetic */ InterfaceC0962AJp AYj(Object obj, Object obj2) {
        return A00(obj, obj2, this);
    }

    @Override // X.InterfaceC0962AJp
    public final /* bridge */ /* synthetic */ InterfaceC0962AJp AaZ(Object obj) {
        return A01(obj, this);
    }
}
