package X;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;

/* renamed from: X.Bck, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2513Bck {
    public static EncoderProfiles A00(String str, int i) {
        return CamcorderProfile.getAll(str, i);
    }
}
