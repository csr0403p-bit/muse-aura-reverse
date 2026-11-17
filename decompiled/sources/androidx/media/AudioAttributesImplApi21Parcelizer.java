package androidx.media;

import X.AbstractC6562EFd;
import android.media.AudioAttributes;

/* loaded from: classes5.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC6562EFd abstractC6562EFd) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.A01 = (AudioAttributes) abstractC6562EFd.A02(audioAttributesImplApi21.A01, 1);
        audioAttributesImplApi21.A00 = abstractC6562EFd.A01(audioAttributesImplApi21.A00, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC6562EFd abstractC6562EFd) {
        abstractC6562EFd.A07(audioAttributesImplApi21.A01, 1);
        abstractC6562EFd.A06(audioAttributesImplApi21.A00, 2);
    }
}
