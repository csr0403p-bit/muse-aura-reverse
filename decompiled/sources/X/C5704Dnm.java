package X;

/* renamed from: X.Dnm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5704Dnm {
    public static final C5704Dnm A08 = new C5608Dln().A00();
    public final AbstractC5802Dpm A00;

    @Deprecated
    public final C6026DuL A01;
    public final C5777DpJ A02;
    public final C5568Dkm A03;

    @Deprecated
    public final C5568Dkm A04;
    public final C5913Drw A05;
    public final C10388Har A06;
    public final String A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5704Dnm) {
                C5704Dnm c5704Dnm = (C5704Dnm) obj;
                if (!C6xC.A00(this.A07, c5704Dnm.A07) || !this.A00.equals(c5704Dnm.A00) || !C6xC.A00(this.A03, c5704Dnm.A03) || !C6xC.A00(this.A02, c5704Dnm.A02) || !C6xC.A00(this.A06, c5704Dnm.A06) || !C6xC.A00(this.A05, c5704Dnm.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A05, AnonymousClass005.A0F(this.A06, AnonymousClass005.A0F(this.A00, AnonymousClass005.A0F(this.A02, (AnonymousClass001.A0G(this.A07) + C60R.A01(this.A03)) * 31))));
    }

    public C5704Dnm(C6026DuL c6026DuL, C5777DpJ c5777DpJ, C5568Dkm c5568Dkm, C5913Drw c5913Drw, C10388Har c10388Har, String str) {
        this.A07 = str;
        this.A03 = c5568Dkm;
        this.A04 = c5568Dkm;
        this.A02 = c5777DpJ;
        this.A06 = c10388Har;
        this.A00 = c6026DuL;
        this.A01 = c6026DuL;
        this.A05 = c5913Drw;
    }
}
