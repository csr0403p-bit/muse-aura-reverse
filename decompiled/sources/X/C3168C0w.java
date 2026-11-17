package X;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: X.C0w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3168C0w {
    public long A00;
    public final long A01;
    public final Long A02;
    public volatile InterfaceC3158C0g A08;
    public final Object A03 = C3cG.A0T();
    public final List<String> A07 = C3cG.A0h();
    public final TreeSet<C0J> A06 = new TreeSet<>(C0K.A00);
    public final HashMap<String, Set<C0J>> A05 = BV4.A0u();
    public final HashMap<String, Long> A04 = BV4.A0u();

    public static final C3171C0z A01(InterfaceC3158C0g interfaceC3158C0g, C3168C0w c3168C0w, String str, String str2) {
        List<C0J> listA0X;
        HashMap<String, Set<C0J>> map = c3168C0w.A05;
        Set<C0J> set = map.get(str);
        if (set == null || (listA0X = AbstractC0878AGe.A0X(set)) == null) {
            return null;
        }
        long j = c3168C0w.A00;
        Iterator it = listA0X.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            j2 += ((C0J) it.next()).A03;
        }
        for (C0J c0j : listA0X) {
            if (interfaceC3158C0g instanceof C0a) {
                C3157C0f.A00(interfaceC3158C0g, c0j, str2);
            } else {
                interfaceC3158C0g.Aax(c0j);
            }
        }
        int size = map.size();
        c3168C0w.A07.add(str);
        return new C3171C0z(c3168C0w, str, str2, size, j2, j);
    }

    public final boolean A02(C0J c0j) {
        File parentFile;
        File file = c0j.A05;
        return "offline".equals((file == null || (parentFile = file.getParentFile()) == null) ? null : parentFile.getName());
    }

    public static final InterfaceC3158C0g A00(InterfaceC3158C0g interfaceC3158C0g, C3168C0w c3168C0w) {
        String str;
        if (!(interfaceC3158C0g instanceof C3157C0f)) {
            return interfaceC3158C0g;
        }
        InterfaceC3158C0g interfaceC3158C0g2 = c3168C0w.A08;
        if (interfaceC3158C0g2 != null) {
            return interfaceC3158C0g2;
        }
        synchronized (c3168C0w.A03) {
            C0J c0j = (C0J) AbstractC0878AGe.A0C(c3168C0w.A06);
            str = c0j != null ? c0j.A06 : null;
        }
        if (str == null) {
            return null;
        }
        ((C3157C0f) interfaceC3158C0g).ADD(str);
        return c3168C0w.A08;
    }

    public C3168C0w(long j, Long l) {
        this.A01 = j;
        this.A02 = l;
    }
}
