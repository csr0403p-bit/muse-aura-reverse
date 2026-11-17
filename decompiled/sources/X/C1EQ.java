package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1EQ, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1EQ {
    public static final C1335AhM A00(List list, float f, float f2) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jA0F = AnonymousClass002.A0F() & 4294967295L;
        return new C1335AhM(list, null, 0, (jFloatToRawIntBits << 32) | jA0F, (Float.floatToRawIntBits(f2) << 32) | jA0F);
    }

    public static final C1335AhM A01(List list, float f, float f2) {
        long jA0F = AnonymousClass002.A0F() << 32;
        return new C1335AhM(list, null, 0, jA0F | (Float.floatToRawIntBits(f) & 4294967295L), jA0F | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    public static final C1335AhM A02(HxE[] hxEArr, float f) {
        HxE[] hxEArr2 = (HxE[]) Arrays.copyOf(hxEArr, hxEArr.length);
        long jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        long j = jFloatToRawIntBits << 32;
        return A03(hxEArr2, j | (jFloatToRawIntBits & 4294967295L), j | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C1335AhM A03(HxE[] hxEArr, long j, long j2) {
        int length = hxEArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (HxE hxE : hxEArr) {
            arrayList.add(new B6A(((B6A) hxE.second).A00));
        }
        ArrayList arrayList2 = new ArrayList(length);
        for (HxE hxE2 : hxEArr) {
            arrayList2.add(Float.valueOf(((Number) hxE2.first).floatValue()));
        }
        return new C1335AhM(arrayList, arrayList2, 0, j, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C1334AhL A04(HxE[] hxEArr, float f, long j) {
        int length = hxEArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (HxE hxE : hxEArr) {
            arrayList.add(new B6A(((B6A) hxE.second).A00));
        }
        ArrayList arrayList2 = new ArrayList(length);
        for (HxE hxE2 : hxEArr) {
            arrayList2.add(Float.valueOf(AnonymousClass001.A02(hxE2.first)));
        }
        return new C1334AhL(arrayList, arrayList2, f, 0, j);
    }

    public static void A05(BFM bfm, BRg bRg, B6A b6a, B6A b6a2) {
        C3Ue.A04(C1b8.A02(bRg, A01(Arrays.asList(b6a, b6a2), 0.0f, Float.POSITIVE_INFINITY), C1OM.A00), bfm, 0);
    }

    public abstract void A07(InterfaceC1330AhH interfaceC1330AhH, float f, long j);
}
