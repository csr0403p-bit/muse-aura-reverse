package X;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class GQO implements AudioManager.OnCommunicationDeviceChangedListener {
    public final /* synthetic */ MetaAiRsysSdkRealTimeSession A00;
    public final /* synthetic */ GXX A01;
    public final /* synthetic */ InterfaceC10560Hsz<Unit> A02;

    public GQO(MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession, GXX gxx, InterfaceC10560Hsz<Unit> interfaceC10560Hsz) {
        this.A00 = metaAiRsysSdkRealTimeSession;
        this.A01 = gxx;
        this.A02 = interfaceC10560Hsz;
    }

    @Override // android.media.AudioManager.OnCommunicationDeviceChangedListener
    public final void onCommunicationDeviceChanged(AudioDeviceInfo audioDeviceInfo) {
        if (MetaAiRsysSdkRealTimeSession.A0A(audioDeviceInfo, this.A01)) {
            C3cG.A1F(this.A02, Unit.INSTANCE);
        }
    }
}
