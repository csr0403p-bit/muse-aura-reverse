package X;

import android.graphics.Path;
import java.util.List;

/* renamed from: X.Fig, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8680Fig {
    public final List<AbstractC8724FjP<C10447Hid, Path>> A00;
    public final List<C8693Fit> A01;
    public final List<AbstractC8724FjP<Integer, Integer>> A02;

    public C8680Fig(List<C8693Fit> list) {
        this.A01 = list;
        this.A00 = C60Q.A0t(list);
        this.A02 = C60Q.A0t(list);
        for (int i = 0; i < list.size(); i++) {
            this.A00.add(new C8700Fj0(list.get(i).A01.A00));
            this.A02.add(new C8722FjN(list.get(i).A00.A00));
        }
    }
}
