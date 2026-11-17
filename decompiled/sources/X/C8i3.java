package X;

import android.app.RemoteAction;
import android.view.textclassifier.TextClassification;
import kotlin.Unit;

/* renamed from: X.8i3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8i3 implements Ht9, G0V {
    public final int $t;
    public final Object A00;

    public C8i3(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        BFM bfm;
        String string;
        switch (this.$t) {
            case 0:
                C7dn c7dn = (C7dn) this.A00;
                bfm = (BFM) obj;
                bfm.AgE(666084174);
                string = ((C7dk) c7dn).A01;
                break;
            case 1:
                TextClassification textClassification = (TextClassification) this.A00;
                bfm = (BFM) obj;
                bfm.AgE(950061013);
                string = String.valueOf(textClassification.getLabel());
                break;
            case 2:
                RemoteAction remoteAction = (RemoteAction) this.A00;
                bfm = (BFM) obj;
                bfm.AgE(-1376593684);
                string = remoteAction.getTitle().toString();
                break;
            default:
                G0W g0w = (G0W) this.A00;
                BFM bfm2 = (BFM) obj;
                if (AnonymousClass005.A0D(obj2) == 2 && bfm2.AKh()) {
                    bfm2.Afo();
                } else {
                    AnonymousClass001.A1G(new C71b() { // from class: X.71c
                    }, bfm2, g0w, 0);
                }
                return Unit.INSTANCE;
        }
        AnonymousClass002.A19(bfm);
        return string;
    }
}
