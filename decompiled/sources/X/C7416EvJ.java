package X;

import java.io.InputStream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.EvJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7416EvJ {
    public final int A00;
    public final InputStream A01;
    public final String A02;
    public final List<HxE<String, String>> A03;
    public final TreeMap<String, List<String>> A04;

    public C7416EvJ(InputStream inputStream, String str, Map map, int i) {
        C7384Etj.A0Y(map, 0);
        this.A00 = i;
        this.A02 = str;
        this.A01 = inputStream;
        List<HxE<String, String>> listA0B = AbstractC3060BvS.A0B(map);
        this.A03 = listA0B;
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        C7384Etj.A0V(comparator);
        TreeMap<String, List<String>> treeMap = new TreeMap<>((Comparator<? super String>) comparator);
        Iterator<HxE<String, String>> it = listA0B.iterator();
        while (it.hasNext()) {
            HxE hxEA10 = C60Q.A10(it);
            A a = hxEA10.first;
            ((List) C60R.A0Z(a, treeMap)).add(hxEA10.second);
        }
        this.A04 = treeMap;
    }
}
