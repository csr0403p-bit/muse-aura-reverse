package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.ElC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7334ElC<P> {
    public static final C6966EdO A01 = new C6966EdO(new byte[0], 0);
    public final Map<C6966EdO, List<P>> A00;

    public final Iterable<P> A00(byte[] text) {
        Map<C6966EdO, List<P>> map = this.A00;
        List listA0z = BV4.A0z(A01, map);
        List listA0z2 = text.length >= 5 ? BV4.A0z(new C6966EdO(text, 5), map) : null;
        return listA0z == null ? listA0z2 == null ? C3cG.A0h() : listA0z2 : listA0z2 == null ? listA0z : new C7333ElB(this, listA0z2, listA0z);
    }

    public C7334ElC(Map<C6966EdO, List<P>> entries) {
        this.A00 = entries;
    }
}
