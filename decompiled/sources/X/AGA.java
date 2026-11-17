package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AGA implements AFx {
    public C0918AHu<String, List<Function0<Object>>> A00;
    public final C0918AHu<String, List<Object>> A01;
    public final G0U<Object, Boolean> A02;

    @Override // X.AFx
    public final boolean A5t(Object obj) {
        return this.A02.invoke(obj).booleanValue();
    }

    @Override // X.AFx
    public final Object A71(String str) {
        List<Object> listA0B;
        C0918AHu<String, List<Object>> c0918AHu = this.A01;
        if (c0918AHu == null || (listA0B = c0918AHu.A0B(str)) == null || listA0B.isEmpty()) {
            return null;
        }
        if (listA0B.size() > 1) {
            c0918AHu.A0C(str, listA0B.subList(1, listA0B.size()));
        }
        return listA0B.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @Override // X.AFx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.util.List<java.lang.Object>> AXs() {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AGA.AXs():java.util.Map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AGA(Map<String, ? extends List<? extends Object>> map, G0U<Object, Boolean> g0u) {
        C0918AHu<String, List<Object>> c0918AHu;
        this.A02 = g0u;
        if (map == null || map.isEmpty()) {
            c0918AHu = 0;
        } else {
            c0918AHu = new C0918AHu<>(map.size());
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entry = (Map.Entry) itA0n.next();
                c0918AHu.A0E(entry.getKey(), entry.getValue());
            }
        }
        this.A01 = c0918AHu;
    }

    @Override // X.AFx
    public final AG2 Aa3(String str, Function0<? extends Object> function0) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!C7LE.A00(str.charAt(i))) {
                C0918AHu<String, List<Function0<Object>>> c0918AHu = this.A00;
                if (c0918AHu == null) {
                    C0918AHu c0918AHu2 = AbstractC0977AKq.A00;
                    c0918AHu = new C0918AHu<>(6);
                    this.A00 = c0918AHu;
                }
                List<Function0<Object>> listA05 = c0918AHu.A05(str);
                if (listA05 == null) {
                    listA05 = new ArrayList<>();
                    c0918AHu.A0E(str, listA05);
                }
                listA05.add(function0);
                return new AGB(c0918AHu, str, function0);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
