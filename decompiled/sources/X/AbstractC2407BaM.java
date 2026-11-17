package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.BaM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2407BaM {
    public static void A02(C2409BaO c2409BaO, EnumC2408BaN enumC2408BaN, Integer num, long j) {
        c2409BaO.A00.add(new C2410BaQ(enumC2408BaN, num, j));
    }

    public static List<C2409BaO> A00() {
        ArrayList arrayListA0h = C3cG.A0h();
        C2409BaO c2409BaO = new C2409BaO();
        Integer num = C79.A00;
        EnumC2408BaN enumC2408BaN = EnumC2408BaN.s1440p;
        C2409BaO.A04(c2409BaO, enumC2408BaN, num, arrayListA0h);
        C2409BaO c2409BaO2 = new C2409BaO();
        Integer num2 = C79.A01;
        C2409BaO.A04(c2409BaO2, enumC2408BaN, num2, arrayListA0h);
        C2409BaO c2409BaOA00 = C2409BaO.A00(enumC2408BaN, num);
        Integer num3 = C79.A0C;
        EnumC2408BaN enumC2408BaN2 = EnumC2408BaN.MAXIMUM;
        C2409BaO.A04(c2409BaOA00, enumC2408BaN2, num3, arrayListA0h);
        C2409BaO.A05(enumC2408BaN, enumC2408BaN2, num2, num3, arrayListA0h);
        C2409BaO.A05(enumC2408BaN, enumC2408BaN2, num, num2, arrayListA0h);
        C2409BaO.A02(new C2409BaO(), enumC2408BaN2, new C2410BaQ(enumC2408BaN, num2, 0L), num2, arrayListA0h);
        C2409BaO c2409BaO3 = new C2409BaO();
        EnumC2408BaN enumC2408BaN3 = EnumC2408BaN.PREVIEW;
        C2409BaO.A02(c2409BaO3, enumC2408BaN, new C2410BaQ(enumC2408BaN3, num, 0L), num, arrayListA0h);
        C2409BaO.A05(enumC2408BaN3, enumC2408BaN, num2, num, arrayListA0h);
        C2409BaO.A05(enumC2408BaN3, enumC2408BaN, num, num2, arrayListA0h);
        C2409BaO.A02(new C2409BaO(), enumC2408BaN, new C2410BaQ(enumC2408BaN3, num2, 0L), num2, arrayListA0h);
        return arrayListA0h;
    }

    public static List<C2409BaO> A01() {
        ArrayList arrayListA0h = C3cG.A0h();
        C2409BaO c2409BaO = new C2409BaO();
        Integer num = C79.A00;
        EnumC2408BaN enumC2408BaN = EnumC2408BaN.s1440p;
        A02(c2409BaO, enumC2408BaN, num, 4L);
        C2409BaO c2409BaOA01 = C2409BaO.A01(c2409BaO, arrayListA0h);
        Integer num2 = C79.A01;
        A02(c2409BaOA01, enumC2408BaN, num2, 4L);
        C2409BaO c2409BaOA012 = C2409BaO.A01(c2409BaOA01, arrayListA0h);
        EnumC2408BaN enumC2408BaN2 = EnumC2408BaN.RECORD;
        A02(c2409BaOA012, enumC2408BaN2, num, 3L);
        C2409BaO c2409BaOA013 = C2409BaO.A01(c2409BaOA012, arrayListA0h);
        A02(c2409BaOA013, enumC2408BaN2, num2, 3L);
        C2409BaO c2409BaOA014 = C2409BaO.A01(c2409BaOA013, arrayListA0h);
        Integer num3 = C79.A0C;
        EnumC2408BaN enumC2408BaN3 = EnumC2408BaN.MAXIMUM;
        A02(c2409BaOA014, enumC2408BaN3, num3, 2L);
        C2409BaO c2409BaOA015 = C2409BaO.A01(c2409BaOA014, arrayListA0h);
        A02(c2409BaOA015, enumC2408BaN3, num2, 2L);
        C2409BaO c2409BaOA016 = C2409BaO.A01(c2409BaOA015, arrayListA0h);
        EnumC2408BaN enumC2408BaN4 = EnumC2408BaN.PREVIEW;
        A02(c2409BaOA016, enumC2408BaN4, num, 1L);
        A02(c2409BaOA016, enumC2408BaN3, num3, 2L);
        C2409BaO c2409BaOA017 = C2409BaO.A01(c2409BaOA016, arrayListA0h);
        A02(c2409BaOA017, enumC2408BaN4, num, 1L);
        A02(c2409BaOA017, enumC2408BaN3, num2, 2L);
        C2409BaO c2409BaOA018 = C2409BaO.A01(c2409BaOA017, arrayListA0h);
        A02(c2409BaOA018, enumC2408BaN4, num, 1L);
        A02(c2409BaOA018, enumC2408BaN2, num, 3L);
        C2409BaO c2409BaOA019 = C2409BaO.A01(c2409BaOA018, arrayListA0h);
        A02(c2409BaOA019, enumC2408BaN4, num, 1L);
        A02(c2409BaOA019, enumC2408BaN2, num2, 3L);
        C2409BaO c2409BaOA0110 = C2409BaO.A01(c2409BaOA019, arrayListA0h);
        A02(c2409BaOA0110, enumC2408BaN4, num, 1L);
        A02(c2409BaOA0110, enumC2408BaN4, num2, 1L);
        C2409BaO c2409BaOA0111 = C2409BaO.A01(c2409BaOA0110, arrayListA0h);
        A02(c2409BaOA0111, enumC2408BaN4, num, 1L);
        A02(c2409BaOA0111, enumC2408BaN2, num, 3L);
        A02(c2409BaOA0111, enumC2408BaN2, num3, 2L);
        C2409BaO c2409BaOA0112 = C2409BaO.A01(c2409BaOA0111, arrayListA0h);
        A02(c2409BaOA0112, enumC2408BaN4, num, 1L);
        A02(c2409BaOA0112, enumC2408BaN2, num2, 3L);
        A02(c2409BaOA0112, enumC2408BaN2, num3, 2L);
        C2409BaO c2409BaOA0113 = C2409BaO.A01(c2409BaOA0112, arrayListA0h);
        A02(c2409BaOA0113, enumC2408BaN4, num, 1L);
        A02(c2409BaOA0113, enumC2408BaN4, num2, 1L);
        A02(c2409BaOA0113, enumC2408BaN3, num3, 2L);
        arrayListA0h.add(c2409BaOA0113);
        return arrayListA0h;
    }
}
