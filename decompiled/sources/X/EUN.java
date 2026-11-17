package X;

import com.facebook.tigon.tigonobserver.TigonObservable;
import com.facebook.tigon.tigonobserver.interfaces.TigonBodyObservation;

/* loaded from: classes5.dex */
public final class EUN extends EUQ<EUK> {
    public final /* synthetic */ TigonObservable A00;

    public EUN(TigonObservable tigonObservable) {
        this.A00 = tigonObservable;
    }

    @Override // X.EUQ
    public final /* bridge */ /* synthetic */ Object A00() {
        return new EUK(this.A00);
    }

    @Override // X.EUQ
    public final /* bridge */ /* synthetic */ void A02(Object obj) {
        EUK euk = (EUK) obj;
        euk.getClass();
        euk.A00 = -1;
        euk.A01 = null;
        TigonBodyObservation tigonBodyObservation = euk.A02;
        if (tigonBodyObservation != null) {
            tigonBodyObservation.cleanup();
            euk.A02 = null;
        }
    }
}
