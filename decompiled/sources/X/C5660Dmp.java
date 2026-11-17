package X;

/* renamed from: X.Dmp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5660Dmp {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Dq8 A05;
    public final Boolean A06;
    public final Integer A07;
    public final Long A08;
    public final Long A09;
    public final Long A0A;
    public final Long A0B;
    public final Long A0C;
    public final Long A0D;
    public final Long A0E;
    public final Long A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("StartedBufferingDiagnostics{failedRequestType=");
        sbA0x.append(this.A0G);
        sbA0x.append(", lastHttpStatus=");
        sbA0x.append(this.A07);
        sbA0x.append(", lastLoadErrorAgeMs=");
        sbA0x.append(this.A0B);
        sbA0x.append(", lastManifestLoadSuccessAgeMs=");
        sbA0x.append(this.A0C);
        sbA0x.append(", lastMediaLoadSuccessAgeMs=");
        sbA0x.append(this.A0D);
        sbA0x.append(", audioBufferedDurationMs=");
        sbA0x.append(this.A08);
        sbA0x.append(", videoBufferedDurationMs=");
        sbA0x.append(this.A0F);
        sbA0x.append(", bufferEndToLiveHeadDeltaMs=");
        sbA0x.append(this.A09);
        sbA0x.append(", lastLatencyActionType=");
        sbA0x.append(this.A0H);
        sbA0x.append(", lastLatencyActionAgeMs=");
        sbA0x.append(this.A0A);
        sbA0x.append(", latencyLevel=");
        sbA0x.append(this.A0I);
        sbA0x.append(", isAudioStalling=");
        sbA0x.append(this.A0J);
        sbA0x.append(", liveState=");
        sbA0x.append(this.A05);
        sbA0x.append(", manifestLoadFailureCount=");
        sbA0x.append(this.A02);
        sbA0x.append(", videoChunkLoadFailureCount=");
        sbA0x.append(this.A03);
        sbA0x.append(", audioChunkLoadFailureCount=");
        sbA0x.append(this.A00);
        sbA0x.append(", videoInitLoadFailureCount=");
        sbA0x.append(this.A04);
        sbA0x.append(", audioInitLoadFailureCount=");
        sbA0x.append(this.A01);
        sbA0x.append(", isLoading=");
        sbA0x.append(this.A0K);
        sbA0x.append(", loadControlWantsLoading=");
        sbA0x.append(this.A06);
        sbA0x.append(", isNetworkRequestInFlight=");
        sbA0x.append(this.A0L);
        sbA0x.append(", oldestNetworkRequestAgeMs=");
        sbA0x.append(this.A0E);
        return C8j3.A15(sbA0x);
    }

    public C5660Dmp(Dq8 dq8, Boolean bool, Integer num, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        this.A0G = str;
        this.A07 = num;
        this.A0B = l;
        this.A0C = l2;
        this.A0D = l3;
        this.A08 = l4;
        this.A0F = l5;
        this.A09 = l6;
        this.A0H = str2;
        this.A0A = l7;
        this.A0I = str3;
        this.A0J = z;
        this.A05 = dq8;
        this.A02 = i;
        this.A03 = i2;
        this.A00 = i3;
        this.A04 = i4;
        this.A01 = i5;
        this.A0K = z2;
        this.A06 = bool;
        this.A0L = z3;
        this.A0E = l8;
    }
}
