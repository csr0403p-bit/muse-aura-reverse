package X;

import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.BVb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC2352BVb {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC2352BVb[] A01;
    public static final EnumC2352BVb A02;
    public static final EnumC2352BVb A03;
    public static final EnumC2352BVb A04;
    public static final EnumC2352BVb A05;
    public final int code;
    public final String suffix;

    static {
        EnumC2352BVb enumC2352BVb = new EnumC2352BVb("DISABLED", 0, 0, "");
        A04 = enumC2352BVb;
        EnumC2352BVb enumC2352BVb2 = new EnumC2352BVb("LIBYUV_CONTRAST", 1, 1, "_libyuv");
        EnumC2352BVb enumC2352BVb3 = new EnumC2352BVb("CLAHE_CONSERVATIVE", 2, 2, "_clahe_conservative");
        EnumC2352BVb enumC2352BVb4 = new EnumC2352BVb("CLAHE_MODERATE", 3, 3, "_clahe_moderate");
        EnumC2352BVb enumC2352BVb5 = new EnumC2352BVb("CLAHE_STANDARD", 4, 4, "_clahe_standard");
        EnumC2352BVb enumC2352BVb6 = new EnumC2352BVb("CLAHE_AGGRESSIVE", 5, 5, "_clahe_aggressive");
        EnumC2352BVb enumC2352BVb7 = new EnumC2352BVb("BICUBIC_SHARPENING", 6, 6, "_bicubic");
        EnumC2352BVb enumC2352BVb8 = new EnumC2352BVb("LANCZOS_3", 7, 7, "_lanczos3");
        EnumC2352BVb enumC2352BVb9 = new EnumC2352BVb("UNSHARP_MASK", 8, 8, "_unsharp");
        EnumC2352BVb enumC2352BVb10 = new EnumC2352BVb("USM_STRONG", 9, 9, "_usm_strong");
        EnumC2352BVb enumC2352BVb11 = new EnumC2352BVb("USM_SUBTLE", 10, 10, "_usm_subtle");
        EnumC2352BVb enumC2352BVb12 = new EnumC2352BVb("USM_STRONG_WIDE", 11, 11, "_usm_strong_wide");
        EnumC2352BVb enumC2352BVb13 = new EnumC2352BVb("INVERSE_TONE_MAP", 12, 12, "_itm");
        A05 = enumC2352BVb13;
        EnumC2352BVb enumC2352BVb14 = new EnumC2352BVb("CPU_INVERSE_TONE_MAP", 13, 13, "_cpu_itm");
        A02 = enumC2352BVb14;
        EnumC2352BVb enumC2352BVb15 = new EnumC2352BVb("CPU_INVERSE_TONE_MAP_PLACEBO", 14, 14, "_cpu_itm_placebo");
        A03 = enumC2352BVb15;
        EnumC2352BVb[] enumC2352BVbArr = {enumC2352BVb, enumC2352BVb2, enumC2352BVb3, enumC2352BVb4, enumC2352BVb5, enumC2352BVb6, enumC2352BVb7, enumC2352BVb8, enumC2352BVb9, enumC2352BVb10, enumC2352BVb11, enumC2352BVb12, enumC2352BVb13, enumC2352BVb14, enumC2352BVb15};
        A01 = enumC2352BVbArr;
        A00 = C3cG.A0w(enumC2352BVbArr);
    }

    public static final EnumC2352BVb A00(int i) {
        Object next;
        Iterator<E> it = A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((EnumC2352BVb) next).code == i) {
                break;
            }
        }
        EnumC2352BVb enumC2352BVb = (EnumC2352BVb) next;
        return enumC2352BVb == null ? A04 : enumC2352BVb;
    }

    public static final boolean A01(int i) {
        return i == A02.code || i == A03.code;
    }

    public static final boolean A02(int i) {
        return i == A05.code || A01(i);
    }

    public static EnumC2352BVb valueOf(String str) {
        return (EnumC2352BVb) Enum.valueOf(EnumC2352BVb.class, str);
    }

    public static EnumC2352BVb[] values() {
        return (EnumC2352BVb[]) A01.clone();
    }

    public EnumC2352BVb(String str, int i, int i2, String str2) {
        this.code = i2;
        this.suffix = str2;
    }
}
