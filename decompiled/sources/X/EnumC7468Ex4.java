package X;

import java.util.HashMap;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ex4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC7468Ex4 {
    public static HashMap<Byte, EnumC7468Ex4> A00;
    public static final /* synthetic */ Ey9 A01;
    public static final /* synthetic */ EnumC7468Ex4[] A02;
    public final String modeName;
    public final byte value;

    static {
        EnumC7468Ex4[] enumC7468Ex4Arr = {new EnumC7468Ex4("BASE", "mode_base", (byte) 0, 0), new EnumC7468Ex4("PSK", "mode_psk", (byte) 1, 1), new EnumC7468Ex4("AUTH", "mode_auth", (byte) 2, 2), new EnumC7468Ex4("AUTH_PSK", "mode_auth_psk", (byte) 3, 3)};
        A02 = enumC7468Ex4Arr;
        F3w f3wA0w = C3cG.A0w(enumC7468Ex4Arr);
        A01 = f3wA0w;
        A00 = BV4.A0u();
        Iterator<T> it = f3wA0w.iterator();
        while (it.hasNext()) {
            EnumC7468Ex4 enumC7468Ex4 = (EnumC7468Ex4) it.next();
            A00.put(Byte.valueOf(enumC7468Ex4.value), enumC7468Ex4);
        }
    }

    public static EnumC7468Ex4 valueOf(String str) {
        return (EnumC7468Ex4) Enum.valueOf(EnumC7468Ex4.class, str);
    }

    public static EnumC7468Ex4[] values() {
        return (EnumC7468Ex4[]) A02.clone();
    }

    public EnumC7468Ex4(String str, String str2, byte b, int i) {
        this.modeName = str2;
        this.value = b;
    }
}
