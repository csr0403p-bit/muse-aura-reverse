package X;

import com.facebook.quicklog.MarkerEditor;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class DAL extends AbstractC7559F3s implements G0U<MarkerEditor, Unit> {
    public final /* synthetic */ boolean $isEnabledResult;
    public final /* synthetic */ boolean $isProviderAvailable;
    public final /* synthetic */ boolean $lastRefreshTimeResult;
    public final /* synthetic */ String $providerName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAL(String str, boolean z, boolean z2, boolean z3) {
        super(1);
        this.$providerName = str;
        this.$lastRefreshTimeResult = z;
        this.$isEnabledResult = z2;
        this.$isProviderAvailable = z3;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(MarkerEditor markerEditor) {
        AbstractC7559F3s.A01(markerEditor).pointEditor("check_should_register").addPointData("provider_name", this.$providerName).addPointData("past_ttl", this.$lastRefreshTimeResult).addPointData("is_enabled", this.$isEnabledResult).addPointData("is_available", this.$isProviderAvailable);
        return Unit.INSTANCE;
    }
}
