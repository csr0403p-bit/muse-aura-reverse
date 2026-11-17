package X;

import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public final class G3j {
    public final Set<String> A00 = C3cG.A0k();

    public final synchronized void A00(List<? extends AbstractC10579HwA> list) {
        for (AbstractC10579HwA abstractC10579HwA : list) {
            Set<String> set = this.A00;
            C0862A6j.A00(set).remove(abstractC10579HwA.A03());
        }
    }
}
