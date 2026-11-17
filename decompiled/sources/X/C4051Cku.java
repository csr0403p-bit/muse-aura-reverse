package X;

import android.content.Context;
import com.facebook.flexiblesampling.SamplingPolicyConfig;

/* renamed from: X.Cku, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4051Cku implements DFz {
    public final Context A00;
    public final Class<? extends SamplingPolicyConfig> A01;

    @Override // X.DFz
    public final /* synthetic */ void clientModeStateChanged() {
    }

    @Override // X.DFz
    public final void onBackground() {
    }

    @Override // X.DFz
    public final void onForeground() {
    }

    @Override // X.DFz
    public final void userConsentChanged() {
    }

    @Override // X.DFz
    public final void userLogout() {
        String name = this.A01.getName();
        C4046Ckp c4046CkpA00 = C4046Ckp.A00(this.A00);
        SamplingPolicyConfig samplingPolicyConfig = (SamplingPolicyConfig) C4046Ckp.A02(c4046CkpA00, name, c4046CkpA00.A03);
        if (samplingPolicyConfig != null) {
            samplingPolicyConfig.invalidateChecksum();
        }
    }

    public C4051Cku(Context context, Class cls) {
        this.A01 = cls;
        this.A00 = context;
    }

    @Override // X.DFz
    public final void userLogin(C4931DFd c4931DFd) {
    }
}
