package X;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DeC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5247DeC {
    public final List<InterfaceC5259DeO> A00 = new ArrayList();

    public final void A00() {
        List<InterfaceC5259DeO> list = this.A00;
        Preconditions.checkState(!list.isEmpty());
        list.remove(list.size() - 1);
    }
}
