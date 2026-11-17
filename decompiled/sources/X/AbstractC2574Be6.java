package X;

import android.media.EncoderProfiles;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Be6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2574Be6 {
    public static C2525Bcw A00(EncoderProfiles encoderProfiles) {
        int defaultDurationSeconds = encoderProfiles.getDefaultDurationSeconds();
        int recommendedFileFormat = encoderProfiles.getRecommendedFileFormat();
        List<EncoderProfiles.AudioProfile> audioProfiles = encoderProfiles.getAudioProfiles();
        ArrayList arrayListA0h = C3cG.A0h();
        for (EncoderProfiles.AudioProfile audioProfile : audioProfiles) {
            arrayListA0h.add(new C2521Bcs(audioProfile.getMediaType(), audioProfile.getCodec(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile()));
        }
        List<EncoderProfiles.VideoProfile> videoProfiles = encoderProfiles.getVideoProfiles();
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (EncoderProfiles.VideoProfile videoProfile : videoProfiles) {
            arrayListA0h2.add(new C2520Bcr(videoProfile.getMediaType(), videoProfile.getCodec(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), 8, 0, 0));
        }
        return new C2525Bcw(BV5.A13(arrayListA0h), BV5.A13(arrayListA0h2), defaultDurationSeconds, recommendedFileFormat);
    }
}
