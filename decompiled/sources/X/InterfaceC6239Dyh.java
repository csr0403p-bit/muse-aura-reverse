package X;

/* renamed from: X.Dyh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC6239Dyh {
    void onAudioCodecError(Exception exc);

    void onAudioDecoderInitialized(String str, long j, long j2);

    void onAudioDecoderReleased(String str);

    void onAudioDisabled(C6173DxG c6173DxG);

    void onAudioEnabled(C6173DxG c6173DxG);

    void onAudioInputFormatChanged(C6154Dwx c6154Dwx, C2461Bbo c2461Bbo);

    void onAudioPositionAdvancing(long j);

    void onAudioSinkError(Exception exc);

    void onAudioTrackInitialized(C6518EAw c6518EAw);

    void onAudioTrackReleased(C6518EAw c6518EAw);

    void onAudioUnderrun(int i, long j, long j2);

    void onSkipSilenceEnabledChanged(boolean z);
}
