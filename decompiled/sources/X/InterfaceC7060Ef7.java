package X;

import java.util.Map;

/* renamed from: X.Ef7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC7060Ef7 {
    <E> E getExtra(String str);

    Map<String, Object> getExtras();

    <E> void putExtra(String str, E e);

    void putExtras(Map<String, ? extends Object> map);

    static void A00(InterfaceC7060Ef7 interfaceC7060Ef7, String str, int i) {
        interfaceC7060Ef7.putExtra(str, Integer.valueOf(i));
    }
}
