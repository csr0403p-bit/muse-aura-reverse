package androidx.media;

import X.AbstractC6562EFd;

/* loaded from: classes5.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC6562EFd abstractC6562EFd) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.A03 = abstractC6562EFd.A01(audioAttributesImplBase.A03, 1);
        audioAttributesImplBase.A00 = abstractC6562EFd.A01(audioAttributesImplBase.A00, 2);
        audioAttributesImplBase.A01 = abstractC6562EFd.A01(audioAttributesImplBase.A01, 3);
        audioAttributesImplBase.A02 = abstractC6562EFd.A01(audioAttributesImplBase.A02, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC6562EFd abstractC6562EFd) {
        abstractC6562EFd.A06(audioAttributesImplBase.A03, 1);
        abstractC6562EFd.A06(audioAttributesImplBase.A00, 2);
        abstractC6562EFd.A06(audioAttributesImplBase.A01, 3);
        abstractC6562EFd.A06(audioAttributesImplBase.A02, 4);
    }
}
