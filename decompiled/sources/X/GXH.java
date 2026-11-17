package X;

import X.AbstractC3136BzG;
import X.CFK;
import X.GXH;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.SystemClock;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public final class GXH {
    public AudioDeviceCallback A00;
    public boolean A01;
    public boolean A02;
    public final BroadcastReceiver A03;
    public final AudioManager A04;
    public final Object A05;
    public volatile long A06;
    public volatile List<AudioDeviceInfo> A07;

    public GXH(AudioManager audioManager) {
        C7384Etj.A0Y(audioManager, 0);
        this.A04 = audioManager;
        this.A03 = new BroadcastReceiver() { // from class: com.facebook.rtc.audiolite.audiomanager.FbAudioManager$SpeakerphoneChangedReceiver
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                boolean zIsSpeakerphoneOn;
                GXH gxh = this.A00;
                AbstractC3136BzG.A00("FbAudioManager::SpeakerphoneChangedReceiver");
                try {
                    try {
                        zIsSpeakerphoneOn = gxh.A04.isSpeakerphoneOn();
                    } catch (Exception e) {
                        CFK.A08("FbAudioManager", "audioManager.isSpeakerphoneOn failed with exception", e);
                        zIsSpeakerphoneOn = gxh.A02;
                    }
                    gxh.A02 = zIsSpeakerphoneOn;
                } finally {
                    Trace.endSection();
                }
            }
        };
        this.A05 = C3cG.A0T();
        this.A07 = C0881AGi.A00;
    }

    public final synchronized void A00(boolean z) {
        try {
            this.A04.setSpeakerphoneOn(z);
            this.A02 = z;
        } catch (Exception e) {
            CFK.A08("FbAudioManager", "audioManager.setSpeakerphoneOn failed with exception", e);
        }
    }

    public final void A01(AudioDeviceInfo[] audioDeviceInfoArr, AudioDeviceInfo[] audioDeviceInfoArr2) {
        synchronized (this.A05) {
            List<AudioDeviceInfo> listA0Q = this.A07;
            ArrayList arrayListA0m = AnonymousClass002.A0m(listA0Q);
            Iterator<AudioDeviceInfo> it = listA0Q.iterator();
            while (it.hasNext()) {
                C60Q.A1P(arrayListA0m, it.next().getId());
            }
            Set setA0f = AbstractC0878AGe.A0f(arrayListA0m);
            int i = 0;
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (audioDeviceInfo.isSink() && setA0f.add(Integer.valueOf(audioDeviceInfo.getId()))) {
                    listA0Q = AbstractC0878AGe.A0Q(audioDeviceInfo, listA0Q);
                }
            }
            int length = audioDeviceInfoArr2.length;
            if (length != 0) {
                ArrayList arrayListA0h = C3cG.A0h();
                do {
                    AudioDeviceInfo audioDeviceInfo2 = audioDeviceInfoArr2[i];
                    if (audioDeviceInfo2.isSink()) {
                        arrayListA0h.add(audioDeviceInfo2);
                    }
                    i++;
                } while (i < length);
                ArrayList arrayListA0m2 = AnonymousClass002.A0m(arrayListA0h);
                Iterator it2 = arrayListA0h.iterator();
                while (it2.hasNext()) {
                    C60Q.A1P(arrayListA0m2, ((AudioDeviceInfo) it2.next()).getId());
                }
                Set setA0g = AbstractC0878AGe.A0g(arrayListA0m2);
                if (!setA0g.isEmpty()) {
                    ArrayList arrayListA0h2 = C3cG.A0h();
                    for (AudioDeviceInfo audioDeviceInfo3 : listA0Q) {
                        if (!C60Q.A1W(setA0g, audioDeviceInfo3.getId())) {
                            arrayListA0h2.add(audioDeviceInfo3);
                        }
                    }
                    listA0Q = arrayListA0h2;
                }
            }
            this.A07 = listA0Q;
            this.A06 = SystemClock.elapsedRealtimeNanos();
        }
    }
}
