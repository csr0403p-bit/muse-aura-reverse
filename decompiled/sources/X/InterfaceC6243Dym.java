package X;

/* renamed from: X.Dym, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC6243Dym {
    void onDroppedFrames(int i, long j);

    void onRenderedFirstFrame(Object obj, long j);

    void onVideoCodecError(Exception exc);

    void onVideoDecoderInitialized(String str, long j, long j2);

    void onVideoDecoderReleased(String str);

    void onVideoDisabled(C6173DxG c6173DxG);

    void onVideoEnabled(C6173DxG c6173DxG);

    void onVideoFrameProcessingOffset(long j, int i);

    void onVideoInputFormatChanged(C6154Dwx c6154Dwx, C2461Bbo c2461Bbo);

    void onVideoSizeChanged(C6232Dya c6232Dya);
}
