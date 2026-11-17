package X;

import android.graphics.Path;
import java.util.List;

/* renamed from: X.Fja, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8735Fja {
    public final List<C8723FjO> A00 = C3cG.A0h();

    public final void A00(Path path) {
        List<C8723FjO> list = this.A00;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C8723FjO c8723FjO = list.get(size);
            if (c8723FjO != null && !c8723FjO.A05) {
                AbstractC8712FjD.A03(path, ((C8720FjL) c8723FjO.A02).A0B() / 100.0f, ((C8720FjL) c8723FjO.A00).A0B() / 100.0f, ((C8720FjL) c8723FjO.A01).A0B() / 360.0f);
            }
        }
    }
}
