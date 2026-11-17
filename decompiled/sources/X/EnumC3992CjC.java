package X;

import java.util.HashMap;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.CjC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC3992CjC {
    public static HashMap<Integer, EnumC3992CjC> A00;
    public static final /* synthetic */ Ey9 A01;
    public static final /* synthetic */ EnumC3992CjC[] A02;
    public static final EnumC3992CjC A03;
    public static final EnumC3992CjC A04;
    public final String algorithmName;
    public final int nk;
    public final int nn = 12;
    public final int nt = 16;
    public final int value;

    static {
        EnumC3992CjC enumC3992CjC = new EnumC3992CjC("AES128GCM", "AES-128-GCM", 0, 1, 16);
        A03 = enumC3992CjC;
        EnumC3992CjC enumC3992CjC2 = new EnumC3992CjC("AES256GCM", "AES-256-GCM", 1, 2, 32);
        A04 = enumC3992CjC2;
        EnumC3992CjC[] enumC3992CjCArr = {enumC3992CjC, enumC3992CjC2, new EnumC3992CjC("CHACHA20POLY1305", "ChaCha20Poly1305", 2, 3, 32)};
        A02 = enumC3992CjCArr;
        F3w f3wA0w = C3cG.A0w(enumC3992CjCArr);
        A01 = f3wA0w;
        A00 = BV4.A0u();
        Iterator<T> it = f3wA0w.iterator();
        while (it.hasNext()) {
            EnumC3992CjC enumC3992CjC3 = (EnumC3992CjC) it.next();
            BV6.A1E(enumC3992CjC3, A00, enumC3992CjC3.value);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;IIII)V */
    public EnumC3992CjC(String str, String str2, int i, int i2, int i3) {
        this.algorithmName = str2;
        this.value = i2;
        this.nk = i3;
    }

    public static EnumC3992CjC valueOf(String str) {
        return (EnumC3992CjC) Enum.valueOf(EnumC3992CjC.class, str);
    }

    public static EnumC3992CjC[] values() {
        return (EnumC3992CjC[]) A02.clone();
    }
}
