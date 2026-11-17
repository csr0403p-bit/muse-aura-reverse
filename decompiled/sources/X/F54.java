package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class F54 implements CQG {
    public final int $t;
    public final int A00;

    public F54(int i, int i2) {
        this.$t = i2;
        this.A00 = i;
    }

    @Override // X.CQG
    public final void onFailure(Throwable th) {
        C6669EOg c6669EOgA15;
        int i;
        switch (this.$t) {
            case 0:
                C7384Etj.A0Y(th, 0);
                c6669EOgA15 = BV7.A16();
                i = 100335618;
                break;
            case 1:
                C7384Etj.A0Y(th, 0);
                c6669EOgA15 = BV7.A15();
                i = 100349780;
                break;
            default:
                C7384Etj.A0Y(th, 0);
                c6669EOgA15 = BV7.A15();
                i = 100346940;
                break;
        }
        int i2 = this.A00;
        ENz eNz = ENz.A0F;
        String message = th.getMessage();
        if (message == null && (message = C60O.A0n(th)) == null) {
            message = "Unknown error";
        }
        EOE.A00(Collections.singletonList(new EOL(message, null, eNz)), c6669EOgA15, i, i2);
    }

    @Override // X.CQG
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.$t) {
            case 0:
                EOM eom = (EOM) obj;
                C7384Etj.A0Y(eom, 0);
                C6669EOg c6669EOgA16 = BV7.A16();
                int i = this.A00;
                c6669EOgA16.A01.markerAnnotate(100335618, i, "item_count", String.valueOf(eom.A01.size()));
                EOE.A00(eom.A00, BV7.A16(), 100335618, i);
                break;
            case 1:
                List list = (List) obj;
                C7384Etj.A0Y(list, 0);
                EOE.A00(list, BV7.A15(), 100349780, this.A00);
                break;
            default:
                EOE.A00(AbstractC0885AGm.A0z(obj), BV7.A15(), 100346940, this.A00);
                break;
        }
    }
}
