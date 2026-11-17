package X;

import java.util.function.Predicate;

/* renamed from: X.Ftp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8933Ftp implements Predicate {
    public final int $t;

    public C8933Ftp(int i) {
        this.$t = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.$t) {
            case 0:
                C10144GqB c10144GqB = (C10144GqB) obj;
                AbstractC10024Gnx abstractC10024Gnx = (AbstractC10024Gnx) c10144GqB.A00;
                return (abstractC10024Gnx.A0G() == 1 && abstractC10024Gnx.A0J(0) == String.class && c10144GqB.A01 != EnumC8882Fsl.PROPERTIES) ? false : true;
            case 1:
                AbstractC9958GmS abstractC9958GmS = (AbstractC9958GmS) obj;
                C9903Gkj c9903Gkj = C9903Gkj.A00;
                if (abstractC9958GmS.A0K()) {
                    return false;
                }
                if (abstractC9958GmS instanceof C9978Gmt) {
                    return true;
                }
                C9908Gko c9908Gko = (C9908Gko) abstractC9958GmS;
                return (C9908Gko.A09(c9908Gko.A01) || C9908Gko.A09(c9908Gko.A02) || C9908Gko.A09(c9908Gko.A03) || C9908Gko.A08(c9908Gko.A00)) ? false : true;
            default:
                return false;
        }
    }
}
