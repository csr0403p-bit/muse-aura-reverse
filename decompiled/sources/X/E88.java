package X;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImplApi26;

@Deprecated
/* loaded from: classes5.dex */
public final class E88 {
    public static final AudioAttributesCompat A05;
    public final AudioAttributesCompat A00;
    public final Object A01;
    public final int A02;
    public final AudioManager.OnAudioFocusChangeListener A03;
    public final Handler A04;

    public E88(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat, int i) {
        this.A02 = i;
        this.A04 = handler;
        this.A00 = audioAttributesCompat;
        this.A03 = onAudioFocusChangeListener;
        this.A01 = new AudioFocusRequest.Builder(i).setAudioAttributes((AudioAttributes) audioAttributesCompat.A00.ACW()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E88) {
                E88 e88 = (E88) obj;
                if (this.A02 != e88.A02 || !Ht0.A00(this.A03, e88.A03) || !Ht0.A00(this.A04, e88.A04) || !Ht0.A00(this.A00, e88.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setUsage(1);
        AudioAttributes audioAttributesBuild = builder.build();
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.A01 = audioAttributesBuild;
        audioAttributesImplApi26.A00 = -1;
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.A00 = audioAttributesImplApi26;
        A05 = audioAttributesCompat;
    }

    public final int hashCode() {
        return BV7.A0F(Integer.valueOf(this.A02), this.A03, this.A04, this.A00, AnonymousClass001.A0h());
    }
}
