package X;

import androidx.media3.container.ObuParser$NotYetImplementedException;
import java.util.List;

/* loaded from: classes5.dex */
public final class Dy1 {
    public C6188DxW A00;

    public static void A00(Dy1 dy1, List list) {
        C6188DxW c6188DxW;
        for (int i = 0; i < list.size(); i++) {
            if (((C6267DzK) list.get(i)).A00 == 1) {
                try {
                    c6188DxW = new C6188DxW((C6267DzK) list.get(i));
                } catch (ObuParser$NotYetImplementedException unused) {
                    c6188DxW = null;
                }
                dy1.A00 = c6188DxW;
            }
        }
    }
}
