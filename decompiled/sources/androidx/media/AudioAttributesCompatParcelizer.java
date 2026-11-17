package androidx.media;

import X.AbstractC6562EFd;
import X.E1K;

/* loaded from: classes5.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC6562EFd abstractC6562EFd) throws Throwable {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        E1K e1kA04 = audioAttributesCompat.A00;
        if (abstractC6562EFd.A09(1)) {
            e1kA04 = abstractC6562EFd.A04();
        }
        audioAttributesCompat.A00 = (AudioAttributesImpl) e1kA04;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC6562EFd abstractC6562EFd) throws Throwable {
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.A00;
        abstractC6562EFd.A05(1);
        abstractC6562EFd.A08(audioAttributesImpl);
    }
}
