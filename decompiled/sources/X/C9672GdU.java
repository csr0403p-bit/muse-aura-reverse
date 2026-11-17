package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.GdU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9672GdU {
    public final int A00;
    public final C9671GdT[] A01;

    public final JsonSerializer<Object> A00(AbstractC9870GjI abstractC9870GjI) {
        C9671GdT c9671GdT = this.A01[(abstractC9870GjI.hashCode() - 1) & this.A00];
        if (c9671GdT != null) {
            do {
                if (!c9671GdT.A04 && abstractC9870GjI.equals(c9671GdT.A00)) {
                    return c9671GdT.A01;
                }
                c9671GdT = c9671GdT.A02;
            } while (c9671GdT != null);
        }
        return null;
    }

    public final JsonSerializer<Object> A01(Class<?> cls) {
        C9671GdT c9671GdT = this.A01[cls.getName().hashCode() & this.A00];
        if (c9671GdT != null) {
            do {
                if (c9671GdT.A03 == cls && !c9671GdT.A04) {
                    return c9671GdT.A01;
                }
                c9671GdT = c9671GdT.A02;
            } while (c9671GdT != null);
        }
        return null;
    }

    public C9672GdU(InterfaceC9510GMb<C9669GdR, JsonSerializer<Object>> interfaceC9510GMb) {
        AbstractMap abstractMap = ((GQ5) interfaceC9510GMb).A00;
        int size = abstractMap.size();
        int i = 8;
        while (i < (size > 64 ? (size >> 2) + size : size + size)) {
            i += i;
        }
        this.A00 = i - 1;
        C9671GdT[] c9671GdTArr = new C9671GdT[i];
        Iterator itA0i = C3cG.A0i(abstractMap);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            C9669GdR c9669GdR = (C9669GdR) entryA0l.getKey();
            JsonSerializer jsonSerializer = (JsonSerializer) entryA0l.getValue();
            int iHashCode = c9669GdR.hashCode() & this.A00;
            c9671GdTArr[iHashCode] = new C9671GdT(jsonSerializer, c9671GdTArr[iHashCode], c9669GdR);
        }
        this.A01 = c9671GdTArr;
    }
}
