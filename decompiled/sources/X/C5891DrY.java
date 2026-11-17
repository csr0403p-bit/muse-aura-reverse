package X;

import kotlin.Unit;

/* renamed from: X.DrY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5891DrY extends AbstractC7559F3s implements G0U<C5700Dnh, Unit> {
    public final /* synthetic */ long $clientTimestamp;
    public final /* synthetic */ String $sessionToken;
    public final /* synthetic */ C5962Dsy $tagMetadata;
    public final /* synthetic */ long $videoDuration;
    public final /* synthetic */ String $videoLoggingEventName;
    public final /* synthetic */ long $videoPosition;

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(C5700Dnh c5700Dnh) {
        C5700Dnh c5700Dnh2 = c5700Dnh;
        C7384Etj.A0Y(c5700Dnh2, 0);
        long j = this.$videoPosition;
        long j2 = this.$videoDuration;
        long j3 = this.$clientTimestamp;
        c5700Dnh2.A04(this.$tagMetadata, this.$videoLoggingEventName, this.$sessionToken, j, j2, j3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5891DrY(C5962Dsy c5962Dsy, String str, String str2, long j, long j2, long j3) {
        super(1);
        this.$videoPosition = j;
        this.$videoDuration = j2;
        this.$clientTimestamp = j3;
        this.$videoLoggingEventName = str;
        this.$tagMetadata = c5962Dsy;
        this.$sessionToken = str2;
    }
}
