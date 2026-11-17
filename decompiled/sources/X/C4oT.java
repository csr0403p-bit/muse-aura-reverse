package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.4oT, reason: invalid class name */
/* loaded from: classes2.dex */
public interface C4oT {
    static String A00(C4oT c4oT, String str) {
        return c4oT.getString(str, null);
    }

    BzK A9q();

    Map<String, ?> ACL();

    Boolean ACw(String str);

    void Aa2(InterfaceC3137BzH interfaceC3137BzH);

    void Ahk(InterfaceC3137BzH interfaceC3137BzH);

    boolean contains(String str);

    boolean getBoolean(String str, boolean z);

    float getFloat(String str, float f);

    int getInt(String str, int i);

    long getLong(String str, long j);

    int getSize();

    String getString(String str, String str2);

    Set<String> getStringSet(String str, Set<String> set);
}
