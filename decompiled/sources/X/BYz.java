package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class BYz implements BZ0 {
    public final List<InterfaceC2817Blu> A00;

    public BYz(List<InterfaceC2817Blu> list) {
        if (list == null || list.isEmpty()) {
            throw C60O.A0i("Cannot set an empty CaptureStage list.");
        }
        this.A00 = BV5.A13(list);
    }
}
