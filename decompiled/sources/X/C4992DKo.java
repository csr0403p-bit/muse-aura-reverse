package X;

import com.facebook.mobileconfig.factory.MobileConfigValueSource;

/* renamed from: X.DKo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4992DKo extends AbstractC4991DKn implements Cloneable {
    public static final C4992DKo A03;
    public static final C4992DKo A04;
    public static final C4992DKo A05 = new C4992DKo();
    public static final C4992DKo A06;
    public boolean A01 = false;
    public boolean A02 = false;
    public C4993DKp A00 = C4993DKp.A02;

    static {
        C4992DKo c4992DKoA00 = A00(new C4992DKo());
        c4992DKoA00.A01 = true;
        A03 = c4992DKoA00;
        C4992DKo c4992DKoA002 = A00(new C4992DKo());
        ((AbstractC4991DKn) c4992DKoA002).A00 = true;
        A06 = c4992DKoA002;
        C4992DKo c4992DKoA003 = A00(new C4992DKo());
        c4992DKoA003.A01 = true;
        C4992DKo c4992DKoA004 = A00(c4992DKoA003);
        ((AbstractC4991DKn) c4992DKoA004).A00 = true;
        A04 = c4992DKoA004;
    }

    public static C4992DKo A00(C4992DKo c4992DKo) {
        if (c4992DKo != A05 && c4992DKo != A03 && c4992DKo != A06 && c4992DKo != A04) {
            return c4992DKo;
        }
        try {
            return (C4992DKo) c4992DKo.clone();
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException("");
        }
    }

    public final void A01(MobileConfigValueSource mobileConfigValueSource) {
        this.A00 = new C4993DKp(mobileConfigValueSource, -1L);
    }
}
