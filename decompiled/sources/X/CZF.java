package X;

import com.facebook.aura.attribution.HatchAttributionComplianceActionProvider;
import com.facebook.aura.attribution.HatchAttributionDeviceProperties;
import com.facebook.aura.attribution.HatchAttributionEventsClient;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final class CZF {
    public final HatchAttributionComplianceActionProvider A00;
    public final HatchAttributionDeviceProperties A01;
    public final HatchAttributionEventsClient A02;
    public final ExecutorService A03;
    public final CZI A04;

    public CZF(HatchAttributionComplianceActionProvider hatchAttributionComplianceActionProvider, HatchAttributionDeviceProperties hatchAttributionDeviceProperties, HatchAttributionEventsClient hatchAttributionEventsClient, ExecutorService executorService, CZI czi) {
        C7384Etj.A0Y(executorService, 3);
        this.A01 = hatchAttributionDeviceProperties;
        this.A02 = hatchAttributionEventsClient;
        this.A00 = hatchAttributionComplianceActionProvider;
        this.A03 = executorService;
        this.A04 = czi;
    }
}
