package X;

import android.media.AudioAttributes;

/* renamed from: X.Dsw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5961Dsw {
    public static void A00(AudioAttributes.Builder builder) {
        builder.setIsContentSpatialized(false);
    }

    public static void A01(AudioAttributes.Builder builder) {
        builder.setSpatializationBehavior(0);
    }
}
