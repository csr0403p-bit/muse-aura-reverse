package X;

import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Guo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC10334Guo {
    public static final Map<String, EnumC10334Guo> A00;
    public static final /* synthetic */ EnumC10334Guo[] A01;
    public static final EnumC10334Guo A02;
    public static final EnumC10334Guo A03;

    static {
        EnumC10334Guo enumC10334GuoA00 = A00("svg", 0);
        EnumC10334Guo enumC10334GuoA002 = A00("a", 1);
        EnumC10334Guo enumC10334GuoA003 = A00("circle", 2);
        EnumC10334Guo enumC10334GuoA004 = A00("clipPath", 3);
        EnumC10334Guo enumC10334GuoA005 = A00("defs", 4);
        EnumC10334Guo enumC10334GuoA006 = A00("desc", 5);
        EnumC10334Guo enumC10334GuoA007 = A00("ellipse", 6);
        EnumC10334Guo enumC10334GuoA008 = A00("g", 7);
        EnumC10334Guo enumC10334GuoA009 = A00("image", 8);
        EnumC10334Guo enumC10334GuoA0010 = A00("line", 9);
        EnumC10334Guo enumC10334GuoA0011 = A00("linearGradient", 10);
        EnumC10334Guo enumC10334GuoA0012 = A00("marker", 11);
        EnumC10334Guo enumC10334GuoA0013 = A00("mask", 12);
        EnumC10334Guo enumC10334GuoA0014 = A00("path", 13);
        EnumC10334Guo enumC10334GuoA0015 = A00("pattern", 14);
        EnumC10334Guo enumC10334GuoA0016 = A00("polygon", 15);
        EnumC10334Guo enumC10334GuoA0017 = A00("polyline", 16);
        EnumC10334Guo enumC10334GuoA0018 = A00("radialGradient", 17);
        EnumC10334Guo enumC10334GuoA0019 = A00("rect", 18);
        EnumC10334Guo enumC10334GuoA0020 = A00("solidColor", 19);
        EnumC10334Guo enumC10334GuoA0021 = A00("stop", 20);
        EnumC10334Guo enumC10334GuoA0022 = A00("style", 21);
        EnumC10334Guo enumC10334GuoA0023 = A00("SWITCH", 22);
        A02 = enumC10334GuoA0023;
        EnumC10334Guo enumC10334GuoA0024 = A00("symbol", 23);
        EnumC10334Guo enumC10334GuoA0025 = A00("text", 24);
        EnumC10334Guo enumC10334GuoA0026 = A00("textPath", 25);
        EnumC10334Guo enumC10334GuoA0027 = A00("title", 26);
        EnumC10334Guo enumC10334GuoA0028 = A00("tref", 27);
        EnumC10334Guo enumC10334GuoA0029 = A00("tspan", 28);
        EnumC10334Guo enumC10334GuoA0030 = A00("use", 29);
        EnumC10334Guo enumC10334GuoA0031 = A00("view", 30);
        EnumC10334Guo enumC10334GuoA0032 = A00("UNSUPPORTED", 31);
        A03 = enumC10334GuoA0032;
        EnumC10334Guo[] enumC10334GuoArr = new EnumC10334Guo[32];
        System.arraycopy(new EnumC10334Guo[]{enumC10334GuoA0028, enumC10334GuoA0029, enumC10334GuoA0030, enumC10334GuoA0031, enumC10334GuoA0032}, BV5.A1U(new EnumC10334Guo[]{enumC10334GuoA00, enumC10334GuoA002, enumC10334GuoA003, enumC10334GuoA004, enumC10334GuoA005, enumC10334GuoA006, enumC10334GuoA007, enumC10334GuoA008, enumC10334GuoA009, enumC10334GuoA0010, enumC10334GuoA0011, enumC10334GuoA0012, enumC10334GuoA0013, enumC10334GuoA0014, enumC10334GuoA0015, enumC10334GuoA0016, enumC10334GuoA0017, enumC10334GuoA0018, enumC10334GuoA0019, enumC10334GuoA0020, enumC10334GuoA0021, enumC10334GuoA0022, enumC10334GuoA0023, enumC10334GuoA0024, enumC10334GuoA0025, enumC10334GuoA0026, enumC10334GuoA0027}, enumC10334GuoArr) ? 1 : 0, enumC10334GuoArr, 27, 5);
        A01 = enumC10334GuoArr;
        A00 = BV4.A0u();
        for (EnumC10334Guo enumC10334Guo : values()) {
            if (enumC10334Guo == A02) {
                A00.put("switch", enumC10334Guo);
            } else if (enumC10334Guo != A03) {
                A00.put(enumC10334Guo.name(), enumC10334Guo);
            }
        }
    }

    public static EnumC10334Guo A00(String str, int i) {
        return new EnumC10334Guo(str, i);
    }

    public static EnumC10334Guo valueOf(String str) {
        return (EnumC10334Guo) Enum.valueOf(EnumC10334Guo.class, str);
    }

    public static EnumC10334Guo[] values() {
        return (EnumC10334Guo[]) A01.clone();
    }

    public EnumC10334Guo(String str, int i) {
    }
}
