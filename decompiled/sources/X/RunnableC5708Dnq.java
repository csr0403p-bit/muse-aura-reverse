package X;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImplApi26;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Dnq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5708Dnq implements Runnable {
    public static final String __redex_internal_original_name = "AudioFocusManager$maybeRequestAudioFocusRunnable$1";
    public final /* synthetic */ C5645DmZ A00;
    public final /* synthetic */ DsL A01;

    public RunnableC5708Dnq(C5645DmZ c5645DmZ, DsL dsL) {
        this.A00 = c5645DmZ;
        this.A01 = dsL;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5645DmZ c5645DmZ = this.A00;
        AtomicBoolean atomicBoolean = c5645DmZ.A07;
        if (atomicBoolean.get() || c5645DmZ.A0C >= 3) {
            return;
        }
        SparseIntArray sparseIntArray = AudioAttributesCompat.A01;
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(3);
        builder.setContentType(2);
        builder.setUsage(1);
        AudioAttributes audioAttributesBuild = builder.build();
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.A01 = audioAttributesBuild;
        audioAttributesImplApi26.A00 = -1;
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.A00 = audioAttributesImplApi26;
        int i = c5645DmZ.A08.get();
        AudioAttributesCompat audioAttributesCompat2 = E88.A05;
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw BV5.A0Q("Illegal audio focus gain type ", i);
        }
        E88 e88 = new E88(c5645DmZ.A02, C60O.A02(), audioAttributesCompat, i);
        c5645DmZ.A0D = e88;
        int iRequestAudioFocus = c5645DmZ.A01.A00.requestAudioFocus((AudioFocusRequest) e88.A01);
        if (iRequestAudioFocus != 1) {
            AbstractC3426CMt.A03("AudioFocusManager", (iRequestAudioFocus == 2 ? "Delayed" : "Failed").concat(" to acquire audio focus"), new Object[0]);
            c5645DmZ.A04.ATG(iRequestAudioFocus);
            c5645DmZ.A09.set(iRequestAudioFocus == 2 ? Do2.A03 : Do2.A04);
            c5645DmZ.A0C++;
            return;
        }
        atomicBoolean.set(true);
        c5645DmZ.A0C = 0;
        c5645DmZ.A09.set(Do2.A02);
        this.A01.ARo();
    }
}
