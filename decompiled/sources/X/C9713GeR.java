package X;

import java.util.List;

/* renamed from: X.GeR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9713GeR extends C06G {
    public final GOU A00;
    public final C9733Gem A01;
    public final C9698Ge3 A02;
    public final C9661Gd3 A03;
    public final GPX A04;
    public final GPY A05;
    public final List<AbstractC10579HwA> A06;

    /* JADX WARN: Incorrect types in method signature: (LX/GOU;LX/GPY;LX/GPX;LX/Gem;LX/Ge3;Ljava/util/List<+LX/HwA;>;LX/Gd3;)V */
    public C9713GeR(GOU gou, C9733Gem c9733Gem, C9698Ge3 c9698Ge3, C9661Gd3 c9661Gd3, GPX gpx, GPY gpy, List list) {
        C7384Etj.A0Y(c9698Ge3, 4);
        AnonymousClass003.A0z(list, c9661Gd3);
        this.A00 = gou;
        this.A05 = gpy;
        this.A04 = gpx;
        this.A01 = c9733Gem;
        this.A02 = c9698Ge3;
        this.A06 = list;
        this.A03 = c9661Gd3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9713GeR) {
                C9713GeR c9713GeR = (C9713GeR) obj;
                if (!C7384Etj.areEqual(this.A00, c9713GeR.A00) || !C7384Etj.areEqual(this.A05, c9713GeR.A05) || !C7384Etj.areEqual(this.A04, c9713GeR.A04) || !C7384Etj.areEqual(this.A01, c9713GeR.A01) || !C7384Etj.areEqual(this.A02, c9713GeR.A02) || !C7384Etj.areEqual(this.A06, c9713GeR.A06) || !C7384Etj.areEqual(this.A03, c9713GeR.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A03, AnonymousClass005.A0F(this.A06, AnonymousClass005.A0F(this.A02, (((AnonymousClass005.A0F(this.A05, AnonymousClass005.A0E(this.A00)) + AnonymousClass006.A0D(this.A04)) * 31) + C3cH.A02(this.A01)) * 31)));
    }
}
