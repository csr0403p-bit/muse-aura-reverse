package X;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Hkv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10480Hkv implements HrP, Cloneable {
    public static <T> void A00(final Iterable<T> values, final List<? super T> list) {
        Charset charset = AbstractC9349GFi.A04;
        if (values instanceof InterfaceC10548Hrv) {
            list.addAll((Collection) values);
            return;
        }
        if ((list instanceof ArrayList) && (values instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) values).size());
        }
        int size = list.size();
        for (T t : values) {
            if (t == null) {
                String strA0I = FGI.A0I("Element at index ", AbstractC7607F5u.A0J(list, size), " is null.");
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw BV4.A0a(strA0I);
                    }
                    list.remove(size2);
                }
            } else {
                list.add(t);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object clone() {
        throw F60.createAndThrow();
    }
}
