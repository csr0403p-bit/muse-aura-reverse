package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.common.video.HatchVideoPrefetcher;

/* loaded from: classes5.dex */
public final class C1S {
    public int A00;
    public C1T A01;
    public C4904DDx A02;
    public Integer A03;
    public final boolean A04;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("VideoPrefetchRequest\nmCacheKey: ");
        sbA0x.append((String) null);
        sbA0x.append("\nmPrefetchOffset: ");
        sbA0x.append(0L);
        sbA0x.append("\nmPrefetchBytes: ");
        sbA0x.append(this.A00);
        sbA0x.append("\nmPrefetchSegment: ");
        sbA0x.append(-1);
        sbA0x.append("\nmStreamType: ");
        sbA0x.append(-1);
        sbA0x.append("\nmQueueBehavior: ");
        sbA0x.append(this.A03.intValue() != 0 ? "Urgent_front_wth_h3_p0" : "Unspecified");
        sbA0x.append("\nmAtomSize: ");
        sbA0x.append(0);
        sbA0x.append("\nmBitRate: ");
        sbA0x.append(0);
        sbA0x.append("\nmQualityLabel: ");
        sbA0x.append("");
        sbA0x.append("\nmVideoTotalDurationMs: ");
        sbA0x.append(0);
        sbA0x.append("\nmPrefetchSource: ");
        sbA0x.append(HatchVideoPrefetcher.TAG);
        sbA0x.append("\nmVideoStatus: ");
        sbA0x.append("PREFETCH");
        sbA0x.append("\nVideoPrefetchRequest.VideoSource\n");
        BV4.A1O(sbA0x, this.A02);
        sbA0x.append("\nmIsAudioOn: ");
        sbA0x.append(true);
        sbA0x.append("\nmShouldForceHighPriority: ");
        sbA0x.append(false);
        sbA0x.append("\nmUserOptedInLowLatency: ");
        sbA0x.append(false);
        sbA0x.append("\nmStartTimeMs: ");
        sbA0x.append(0L);
        sbA0x.append("\nmPrefetchDurationMs: ");
        sbA0x.append(-1L);
        sbA0x.append("\nmUseHeroBgThread: ");
        sbA0x.append(false);
        sbA0x.append("\nmTag: ");
        sbA0x.append(HatchVideoPrefetcher.TAG);
        sbA0x.append("\nmPrefetchingModule: ");
        sbA0x.append(HatchVideoPrefetcher.TAG);
        sbA0x.append("\nmIsThumbnail: ");
        sbA0x.append(false);
        sbA0x.append("\nmIsBackgroundPrefetch: ");
        sbA0x.append(false);
        sbA0x.append("\nmIsFollowUpPrefetch: ");
        sbA0x.append(false);
        sbA0x.append("\nmDisableFollowUpPrefetch: ");
        sbA0x.append(true);
        sbA0x.append("\nmEnableForegroundPrefetchQualityExperimentation: ");
        sbA0x.append(false);
        sbA0x.append("\nmFromNewsFeedStartup: ");
        sbA0x.append(this.A04);
        sbA0x.append("\nmCustomDataSoruceFactory: ");
        sbA0x.append(HatchCcvLoggingKt.NO_POSTAL_FIELD);
        sbA0x.append("\nmCustomCache: ");
        sbA0x.append(HatchCcvLoggingKt.NO_POSTAL_FIELD);
        sbA0x.append("\nmBytesCalculationOrigin: ");
        sbA0x.append("UNKNOWN");
        sbA0x.append("\nmVideoPos: ");
        sbA0x.append((Object) null);
        return C60P.A1O("\nmQplInstanceKey: ", sbA0x, 0);
    }

    public C1S(C1T c1t, C4904DDx c4904DDx, Integer num, int i, boolean z) {
        this.A02 = c4904DDx;
        this.A00 = i;
        this.A03 = num;
        this.A01 = c1t;
        this.A04 = z;
    }
}
