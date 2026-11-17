package X;

import java.util.HashMap;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.CjD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC3993CjD {
    public static HashMap<Integer, EnumC3993CjD> A00;
    public static final /* synthetic */ Ey9 A01;
    public static final /* synthetic */ EnumC3993CjD[] A02;
    public static final EnumC3993CjD A03;
    public final String algorithmName;
    public final int nh;
    public final int value;

    static {
        EnumC3993CjD enumC3993CjD = new EnumC3993CjD("SHA256", 0, "HKDF-SHA256", 1, 32);
        A03 = enumC3993CjD;
        EnumC3993CjD[] enumC3993CjDArr = {enumC3993CjD, new EnumC3993CjD("SHA384", 1, "HKDF-SHA384", 2, 48), new EnumC3993CjD("SHA512", 2, "HKDF-SHA512", 3, 64)};
        A02 = enumC3993CjDArr;
        F3w f3wA0w = C3cG.A0w(enumC3993CjDArr);
        A01 = f3wA0w;
        A00 = BV4.A0u();
        Iterator<T> it = f3wA0w.iterator();
        while (it.hasNext()) {
            EnumC3993CjD enumC3993CjD2 = (EnumC3993CjD) it.next();
            BV6.A1E(enumC3993CjD2, A00, enumC3993CjD2.value);
        }
    }

    public static EnumC3993CjD valueOf(String str) {
        return (EnumC3993CjD) Enum.valueOf(EnumC3993CjD.class, str);
    }

    public static EnumC3993CjD[] values() {
        return (EnumC3993CjD[]) A02.clone();
    }

    public EnumC3993CjD(String str, int i, String str2, int i2, int i3) {
        this.algorithmName = str2;
        this.value = i2;
        this.nh = i3;
    }
}
