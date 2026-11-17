package X;

import com.google.android.gms.common.Feature;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class CWZ extends C3503CRd<List<CS5>> implements InterfaceC3000Brb {
    public final Feature A00;

    @Override // X.InterfaceC3593CWc
    public final Feature[] AII() {
        return new Feature[]{this.A00};
    }

    public CWZ(Feature feature, AbstractC3512CRm abstractC3512CRm, Executor executor) {
        super(abstractC3512CRm, executor);
        this.A00 = feature;
    }
}
