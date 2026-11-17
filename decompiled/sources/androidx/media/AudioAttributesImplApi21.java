package androidx.media;

import X.C60O;
import X.C8j3;
import android.media.AudioAttributes;

/* loaded from: classes5.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public int A00 = -1;
    public AudioAttributes A01;

    @Override // androidx.media.AudioAttributesImpl
    public final Object ACW() {
        return this.A01;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.A01.equals(((AudioAttributesImplApi21) obj).A01);
        }
        return false;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final String toString() {
        return C8j3.A14(this.A01, C60O.A0x("AudioAttributesCompat: audioattributes="));
    }
}
