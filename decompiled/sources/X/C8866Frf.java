package X;

import com.facebook.aura.avatarassets.AvatarMediaMapperKt;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Frf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8866Frf implements Fx5 {
    public static final Map<Integer, String> A04;
    public static final Map<String, Integer> A05;
    public final int A00;
    public final C9086FyD A01;
    public final Instant A02;
    public final ZoneOffset A03;

    static {
        Map<String, Integer> mapA0m = C3cH.A0m("heavy", 3, C3cG.A0r(AvatarMediaMapperKt.LIGHT, BV4.A0W()), C3cG.A0r("medium", BV4.A0X()));
        A05 = mapA0m;
        Set<Map.Entry<String, Integer>> setEntrySet = mapA0m.entrySet();
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(setEntrySet));
        Iterator<Map.Entry<String, Integer>> it = setEntrySet.iterator();
        while (it.hasNext()) {
            AbstractC7611F5y.A17(linkedHashMapA15, it);
        }
        A04 = linkedHashMapA15;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8866Frf) {
                C8866Frf c8866Frf = (C8866Frf) obj;
                if (this.A00 != c8866Frf.A00 || !this.A02.equals(c8866Frf.A02) || !C7384Etj.areEqual(this.A03, c8866Frf.A03) || !this.A01.equals(c8866Frf.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC9011Fwo
    public final C9086FyD AHf() {
        return this.A01;
    }

    @Override // X.Fx5
    public final Instant ALd() {
        return this.A02;
    }

    @Override // X.Fx5
    public final ZoneOffset AMx() {
        return this.A03;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, (AnonymousClass005.A0F(this.A02, this.A00 * 31) + C60R.A01(this.A03)) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("MenstruationFlowRecord(time=");
        AbstractC7608F5v.A1R(sbA0x, this.A02);
        sbA0x.append(this.A03);
        sbA0x.append(", flow=");
        AbstractC7608F5v.A1N(sbA0x, this.A00);
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public C8866Frf(C9086FyD c9086FyD, Instant instant, ZoneOffset zoneOffset, int i) {
        this.A02 = instant;
        this.A03 = zoneOffset;
        this.A01 = c9086FyD;
        this.A00 = i;
    }
}
