package X;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.List;

/* renamed from: X.FkU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC8790FkU extends InterfaceC8698Fiy {
    Path AId();

    static void A00(Matrix matrix, Path path, List list, int i) {
        path.addPath(((InterfaceC8790FkU) list.get(i)).AId(), matrix);
    }
}
