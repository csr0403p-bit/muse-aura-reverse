package X;

import kotlin.Unit;

/* renamed from: X.BSz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2299BSz implements Ht9, G2j {
    public final int $t;
    public final Object A00;

    @Override // X.G2j
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        switch (this.$t) {
            case 2:
                C1943Aug c1943Aug = (C1943Aug) this.A00;
                boolean zA1X = AnonymousClass001.A1X(obj);
                InterfaceC1497Ak4 interfaceC1497Ak4 = (InterfaceC1497Ak4) obj2;
                Ay9 ay9 = (Ay9) obj4;
                long jAKd = interfaceC1497Ak4.AKd();
                AaC aaC = new AaC(0.0f, 0.0f, C8j3.A0G(jAKd), AnonymousClass002.A09(jAKd));
                long jA01 = ((AWx) obj3).A00;
                if (!AbstractC1703Aoi.A01(aaC, jA01)) {
                    jA01 = AbstractC1882Asw.A01(aaC, jA01);
                }
                long jA02 = C1943Aug.A02(c1943Aug, interfaceC1497Ak4, jA01);
                if ((9223372034707292159L & jA02) != 9205357640488583168L) {
                    C1943Aug.A06(c1943Aug, zA1X);
                    c1943Aug.A02 = null;
                    C1943Aug.A07(ay9, c1943Aug, jA02, 9205357640488583168L, false);
                    C1518AkS.A00(c1943Aug.A03);
                    c1943Aug.A0C = false;
                    C1943Aug.A05(c1943Aug);
                    c1943Aug.A0B = true;
                    break;
                }
                break;
            case 3:
                C1833Arx c1833Arx = (C1833Arx) this.A00;
                C1BO<Object> c1boAbY = c1833Arx.A04.AbY((AbstractC1996Aw5) obj, (C1736ApY) obj2, ((B0A) obj3).A00, ((B0I) obj4).A00);
                if (c1boAbY instanceof B0K) {
                    obj5 = ((B0K) c1boAbY).A00;
                } else {
                    As3 as3 = new As3(c1boAbY, c1833Arx.A00);
                    c1833Arx.A00 = as3;
                    obj5 = as3.A00;
                }
                C7384Etj.A0Z(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                return obj5;
            default:
                G0W g0w = (G0W) this.A00;
                BFM bfm = (BFM) obj3;
                int iA0F = AnonymousClass001.A0F(obj4);
                if ((iA0F & 6) == 0) {
                    iA0F |= AnonymousClass004.A0d(bfm, obj);
                }
                if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0F & 131, 130), bfm, iA0F)) {
                    bfm.Afo();
                    break;
                } else {
                    AnonymousClass001.A1G(obj, bfm, g0w, iA0F & 14);
                    break;
                }
        }
        return Unit.INSTANCE;
    }

    public C2299BSz(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }
}
