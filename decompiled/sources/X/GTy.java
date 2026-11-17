package X;

import com.facebook.rsys.audiodevicestate.manager.gen.AudioDeviceRtcSession;
import com.facebook.rsys.base.gen.FeatureHolder;
import com.facebook.rsys.callintent.gen.CallIntent;
import java.util.List;

/* loaded from: classes6.dex */
public final class GTy extends C06G {
    public final GVw A00;
    public final AudioDeviceRtcSession A01;
    public final CallIntent A02;
    public final AbstractC9635GVx A03;
    public final List<FeatureHolder> A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GTy) {
                GTy gTy = (GTy) obj;
                if (!C7384Etj.areEqual(this.A02, gTy.A02) || this.A05 != gTy.A05 || !C7384Etj.areEqual(this.A00, gTy.A00) || !C7384Etj.areEqual(this.A03, gTy.A03) || !C7384Etj.areEqual(this.A04, gTy.A04) || !C7384Etj.areEqual(this.A01, gTy.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass005.A0F(this.A04, AnonymousClass005.A0F(this.A03, AnonymousClass005.A0F(this.A00, C0KA.A01(AnonymousClass005.A0E(this.A02), this.A05)))) + AnonymousClass006.A0D(this.A01)) * 31) + 1237;
    }

    public final String toString() {
        CallIntent callIntent = this.A02;
        boolean z = this.A05;
        GVw gVw = this.A00;
        AbstractC9635GVx abstractC9635GVx = this.A03;
        List<FeatureHolder> list = this.A04;
        AudioDeviceRtcSession audioDeviceRtcSession = this.A01;
        StringBuilder sbA0f = C3cG.A0f(callIntent, "CallConfig(callIntent=");
        sbA0f.append(", setupMode=");
        sbA0f.append(z);
        sbA0f.append(", audioProxy=");
        sbA0f.append(gVw);
        sbA0f.append(", cameraProxy=");
        sbA0f.append(abstractC9635GVx);
        sbA0f.append(", features=");
        sbA0f.append(list);
        sbA0f.append(", audioDeviceRtcSession=");
        sbA0f.append(audioDeviceRtcSession);
        return C8j5.A0W(", skipPermissionCheck=", sbA0f, false);
    }

    public GTy(GVw gVw, AudioDeviceRtcSession audioDeviceRtcSession, CallIntent callIntent, AbstractC9635GVx abstractC9635GVx, List list, boolean z) {
        this.A02 = callIntent;
        this.A05 = z;
        this.A00 = gVw;
        this.A03 = abstractC9635GVx;
        this.A04 = list;
        this.A01 = audioDeviceRtcSession;
    }
}
