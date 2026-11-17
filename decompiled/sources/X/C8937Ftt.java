package X;

import android.os.Looper;
import java.lang.ref.Reference;
import java.util.Map;

/* renamed from: X.Ftt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8937Ftt implements FC0 {
    public final int $t;
    public final Object A00;

    public C8937Ftt(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.FC0
    public final /* bridge */ /* synthetic */ void AVw(Object obj) {
        switch (this.$t) {
            case 0:
                C7708FBg c7708FBg = (C7708FBg) obj;
                C7384Etj.A0Y(c7708FBg, 0);
                FBN fbn = (FBN) this.A00;
                synchronized (fbn.A07) {
                    fbn.A00 = c7708FBg;
                    fbn.A05.A01(new C7687FAg(c7708FBg));
                }
                return;
            case 1:
                Map<String, FBm> map = ((C7704FBc) obj).A00;
                C7384Etj.A0Y(map, 0);
                ((FC0) this.A00).AVw(new C7705FBd(map));
                return;
            default:
                C7708FBg c7708FBg2 = ((C7687FAg) obj).A00;
                C7384Etj.A0Y(c7708FBg2, 0);
                FB4 fb4 = (FB4) ((Reference) this.A00).get();
                if (fb4 != null) {
                    F9b f9b = (F9b) fb4;
                    F9k f9k = new F9k(f9b, new C7687FAg(c7708FBg2), "acq");
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        f9k.run();
                        return;
                    } else {
                        F9b.A0U.post(f9k);
                        return;
                    }
                }
                return;
        }
    }
}
