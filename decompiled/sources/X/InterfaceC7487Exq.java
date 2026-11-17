package X;

import android.graphics.Canvas;
import java.util.List;

/* renamed from: X.Exq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC7487Exq {
    void A9H(Canvas canvas, C7377EtL c7377EtL);

    static int A00(Canvas canvas, C7377EtL c7377EtL, List list, int i) {
        ((InterfaceC7487Exq) list.get(i)).A9H(canvas, c7377EtL);
        return i + 1;
    }
}
