package X;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes5.dex */
public final class E87 {
    public final Object A00;
    public final int A01;
    public final AudioManager.OnAudioFocusChangeListener A02;
    public final Handler A03;
    public final DrN A04;

    public E87(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, DrN drN, int i) {
        this.A01 = i;
        this.A03 = handler;
        this.A04 = drN;
        this.A02 = onAudioFocusChangeListener;
        AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(i);
        C5887DrO c5887DrO = drN.A00;
        if (c5887DrO == null) {
            c5887DrO = new C5887DrO(drN);
            drN.A00 = c5887DrO;
        }
        this.A00 = builder.setAudioAttributes(c5887DrO.A00).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E87) {
                E87 e87 = (E87) obj;
                if (this.A01 != e87.A01 || !C6xC.A00(this.A02, e87.A02) || !C6xC.A00(this.A03, e87.A03) || !C6xC.A00(this.A04, e87.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV7.A0F(Integer.valueOf(this.A01), this.A02, this.A03, this.A04, AnonymousClass001.A0h());
    }
}
