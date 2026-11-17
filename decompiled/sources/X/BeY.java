package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class BeY extends BeX {
    public final List<BeX> A00 = C3cG.A0h();

    public BeY(List<BeX> list) {
        for (BeX beX : list) {
            if (!(beX instanceof BeZ)) {
                this.A00.add(beX);
            }
        }
    }
}
