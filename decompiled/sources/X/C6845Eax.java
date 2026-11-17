package X;

import java.util.List;

/* renamed from: X.Eax, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6845Eax {
    public final List<String> A00 = C60O.A11(20);

    public final void A01(String str) {
        int i = 0;
        while (true) {
            List<String> list = this.A00;
            if (i >= list.size()) {
                return;
            }
            if (str.equalsIgnoreCase(C60Q.A0n(list, i))) {
                list.remove(i);
                list.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public final C6844Eaw A00() {
        Object[] array = this.A00.toArray(new String[0]);
        if (array != null) {
            return new C6844Eaw((String[]) array);
        }
        throw BV6.A0h();
    }

    public final void A02(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        List<String> list = this.A00;
        list.add(str);
        list.add(AnonymousClass002.A0l(str2));
    }

    public final void A03(String str, String str2) {
        C6844Eaw.A01(str);
        C6844Eaw.A02(str2, str);
        A01(str);
        A02(str, str2);
    }
}
