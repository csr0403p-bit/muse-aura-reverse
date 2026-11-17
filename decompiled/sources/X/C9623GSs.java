package X;

import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GSs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9623GSs extends AudioManager.AudioRecordingCallback {
    public final /* synthetic */ C9621GSq A00;

    public C9623GSs(C9621GSq c9621GSq) {
        this.A00 = c9621GSq;
    }

    @Override // android.media.AudioManager.AudioRecordingCallback
    public final void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
        int i;
        super.onRecordingConfigChanged(list);
        C9621GSq c9621GSq = this.A00;
        InterfaceC9648GXn interfaceC9648GXn = c9621GSq.A09;
        AudioManager audioManager = c9621GSq.A07;
        int size = audioManager.getActiveRecordingConfigurations().size();
        List<AudioRecordingConfiguration> activeRecordingConfigurations = audioManager.getActiveRecordingConfigurations();
        C7384Etj.A0U(activeRecordingConfigurations);
        boolean z = false;
        if ((activeRecordingConfigurations instanceof Collection) && activeRecordingConfigurations.isEmpty()) {
            i = 0;
        } else {
            Iterator<AudioRecordingConfiguration> it = activeRecordingConfigurations.iterator();
            i = 0;
            while (it.hasNext()) {
                if (it.next().isClientSilenced() && (i = i + 1) < 0) {
                    AbstractC0885AGm.A13();
                    throw F60.createAndThrow();
                }
            }
        }
        InterfaceC9648GXn.A00(interfaceC9648GXn, FGI.A0T("updateIsAudioDisabledBySystem - size: ", ", numIsClientSilenced: ", size, i));
        List<AudioRecordingConfiguration> activeRecordingConfigurations2 = audioManager.getActiveRecordingConfigurations();
        C7384Etj.A0U(activeRecordingConfigurations2);
        if (!(activeRecordingConfigurations2 instanceof Collection) || !activeRecordingConfigurations2.isEmpty()) {
            for (AudioRecordingConfiguration audioRecordingConfiguration : activeRecordingConfigurations2) {
                if (!audioRecordingConfiguration.isClientSilenced() && (audioRecordingConfiguration.getClientAudioSource() == 7 || audioRecordingConfiguration.getClientAudioSource() == 6)) {
                    z = true;
                    break;
                }
            }
        }
        boolean z2 = !z;
        boolean z3 = c9621GSq.A06;
        c9621GSq.A06 = z2;
        if (z3 != z2) {
            c9621GSq.A08.postDelayed(new GSu(c9621GSq, z2), 500L);
        }
    }
}
