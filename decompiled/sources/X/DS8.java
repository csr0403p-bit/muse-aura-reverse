package X;

import com.facebook.mobileconfig.MobileConfigResolvedParamsReceiver;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class DS8 implements InterfaceC5058DRj {
    @Override // X.InterfaceC5058DRj
    public final boolean tryUpdateConfigs() {
        DS1 ds1 = new DS1();
        ds1.A06 = true;
        return updateConfigs(ds1);
    }

    @Override // X.InterfaceC5058DRj
    public final boolean updateConfigs() {
        return updateConfigs(new DS1());
    }

    @Override // X.InterfaceC5058DRj
    public final boolean updateConfigsSynchronouslyWithDefaultUpdater(int i) {
        DS1 ds1 = new DS1();
        ds1.A04 = true;
        ds1.A00 = i;
        return updateConfigs(ds1);
    }

    @Override // X.InterfaceC5058DRj
    public void setFamilyDeviceId(String str) {
    }

    @Override // X.InterfaceC5058DRj
    public /* synthetic */ void setResolvedParamsReceiver(MobileConfigResolvedParamsReceiver mobileConfigResolvedParamsReceiver) {
    }

    @Override // X.InterfaceC5058DRj
    public /* synthetic */ Set tryLogExposuresInJava(Set set) {
        return set;
    }
}
