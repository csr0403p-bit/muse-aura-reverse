package androidx.media3.common.audio;

import X.AnonymousClass006;
import X.C3cG;
import X.EAL;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;

/* loaded from: classes5.dex */
public final class AudioProcessor$UnhandledAudioFormatException extends Exception {
    public final EAL inputAudioFormat;

    public AudioProcessor$UnhandledAudioFormatException(EAL eal, String str) {
        super(AnonymousClass006.A0y(eal, InviteCodeScratcherKt.CODE_SEPARATOR, C3cG.A0g(str)));
        this.inputAudioFormat = eal;
    }
}
