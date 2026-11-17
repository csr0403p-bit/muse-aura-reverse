package X;

import java.util.Map;

/* renamed from: X.Dmi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5654Dmi {
    public final C5699Dng A00;
    public final Map<String, C5719DoD> A01 = C60O.A1C();

    public static final void A00(EnumC5667Dmw enumC5667Dmw, C5654Dmi c5654Dmi, String str) {
        Integer num;
        if (c5654Dmi.A00.mEnablePlaybackStateQplLogger) {
            Map<String, C5719DoD> map = c5654Dmi.A01;
            C5719DoD c5719DoD = map.get(str);
            if (c5719DoD == null) {
                c5719DoD = new C5719DoD();
                map.put(str, c5719DoD);
            }
            Map<EnumC5667Dmw, Integer> map2 = c5719DoD.A05.A00;
            Number numberA0b = BV4.A0b(enumC5667Dmw, map2);
            int iIntValue = (numberA0b != null ? numberA0b.intValue() : -1) + 1;
            if (iIntValue > 10) {
                iIntValue = 10;
            }
            BV4.A1H(enumC5667Dmw, map2, iIntValue);
            C5915Dry c5915Dry = c5719DoD.A06;
            int iOrdinal = enumC5667Dmw.ordinal();
            if (iOrdinal == 6 || iOrdinal == 12 || iOrdinal == 0) {
                num = C79.A00;
            } else if (iOrdinal != 1 && iOrdinal != 7) {
                return;
            } else {
                num = C79.A01;
            }
            c5915Dry.A00 = num;
        }
    }

    public C5654Dmi(C5699Dng c5699Dng) {
        this.A00 = c5699Dng;
    }
}
