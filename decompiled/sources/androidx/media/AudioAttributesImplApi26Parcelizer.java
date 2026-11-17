package androidx.media;

import X.AbstractC6562EFd;
import android.media.AudioAttributes;

/* loaded from: classes5.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AbstractC6562EFd abstractC6562EFd) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.A01 = (AudioAttributes) abstractC6562EFd.A02(audioAttributesImplApi26.A01, 1);
        audioAttributesImplApi26.A00 = abstractC6562EFd.A01(audioAttributesImplApi26.A00, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, AbstractC6562EFd abstractC6562EFd) {
        abstractC6562EFd.A07(audioAttributesImplApi26.A01, 1);
        abstractC6562EFd.A06(audioAttributesImplApi26.A00, 2);
    }
}
