package X;

import com.facebook.mobileconfig.factory.MobileConfigValueSource;
import java.util.Map;

/* renamed from: X.DMn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4997DMn extends AbstractC5052DRc {
    public final C4993DKp A00;

    public C4997DMn(DS5 ds5, MobileConfigValueSource mobileConfigValueSource, DS4 ds4) {
        super(ds5, ds4);
        this.A00 = new C4993DKp(mobileConfigValueSource, -1L);
    }

    @Override // X.InterfaceC5054DRe
    public final Map<Integer, Integer> getEmergencyPushInfo() {
        return BV4.A0u();
    }

    @Override // X.InterfaceC5054DRe
    public final boolean isAdvancedConsistencyLoggingEnabled(long j) {
        return false;
    }
}
