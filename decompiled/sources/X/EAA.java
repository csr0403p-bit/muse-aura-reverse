package X;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;

/* loaded from: classes5.dex */
public final class EAA implements InterfaceC5909Drs {
    @Override // X.InterfaceC5909Drs
    public final AudioTrack ACa(Context context, DrN drN, C6518EAw c6518EAw, int i) throws IllegalArgumentException {
        AudioAttributes audioAttributesBuild;
        int i2 = c6518EAw.A03;
        int i3 = c6518EAw.A01;
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(c6518EAw.A02).build();
        if (c6518EAw.A05) {
            audioAttributesBuild = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            C5887DrO c5887DrO = drN.A00;
            if (c5887DrO == null) {
                c5887DrO = new C5887DrO(drN);
                drN.A00 = c5887DrO;
            }
            audioAttributesBuild = c5887DrO.A00;
        }
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(audioAttributesBuild).setAudioFormat(audioFormatBuild).setTransferMode(1).setBufferSizeInBytes(c6518EAw.A00).setSessionId(i);
        sessionId.setOffloadedPlayback(c6518EAw.A04);
        if (Build.VERSION.SDK_INT >= 34 && context != null) {
            sessionId.setContext(context);
        }
        return sessionId.build();
    }
}
