package X;

import X.InterfaceC4391Cut;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.Ctw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4354Ctw<R extends InterfaceC4391Cut> {
    public final void A00(InterfaceC4394Cux interfaceC4394Cux) {
        BasePendingResult basePendingResult = (BasePendingResult) this;
        synchronized (basePendingResult.A04) {
            if (basePendingResult.A06.getCount() == 0) {
                interfaceC4394Cux.ASJ(basePendingResult.A01);
            } else {
                basePendingResult.A05.add(interfaceC4394Cux);
            }
        }
    }
}
