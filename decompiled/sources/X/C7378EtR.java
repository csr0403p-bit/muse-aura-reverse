package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: X.EtR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7378EtR {
    public final Map<EnumC3085Bxl, List<C5301Dfk>> A00 = BV4.A0u();
    public final Map<C5301Dfk, EnumC3085Bxl> A01;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/Dfk;>;LX/1HY;LX/Bxl;Ljava/lang/Object;)V */
    public static void A00(EnumC3085Bxl enumC3085Bxl, C1HY c1hy, Object obj, List list) {
        Method method;
        Object[] objArr;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C5301Dfk c5301Dfk = (C5301Dfk) list.get(size);
            try {
                int i = c5301Dfk.A00;
                if (i == 0) {
                    method = c5301Dfk.A01;
                    objArr = null;
                } else if (i != 1) {
                    method = c5301Dfk.A01;
                    objArr = new Object[]{c1hy, enumC3085Bxl};
                } else {
                    method = c5301Dfk.A01;
                    objArr = new Object[]{c1hy};
                }
                method.invoke(obj, objArr);
            } catch (IllegalAccessException e) {
                throw BV4.A0e(e);
            } catch (InvocationTargetException e2) {
                throw BV4.A0d("Failed to call observer method", e2.getCause());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7378EtR(Map<C5301Dfk, EnumC3085Bxl> map) {
        this.A01 = map;
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Object value = entryA0l.getValue();
            List listA0z = BV4.A0z(value, this.A00);
            if (listA0z == null) {
                listA0z = C3cG.A0h();
                this.A00.put(value, listA0z);
            }
            listA0z.add(entryA0l.getKey());
        }
    }
}
