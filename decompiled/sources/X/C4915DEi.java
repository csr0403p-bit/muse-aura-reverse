package X;

/* renamed from: X.DEi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4915DEi extends BYP {
    public static final long serialVersionUID = 7460241350213486923L;
    public final long avgBitrate;
    public final int bufferedDurationMsAtCreation;
    public final long bytesTransferred;
    public final int cacheSource;
    public final int coalescedProgressCount;
    public final int connectTimeoutMs;
    public final int connectionQuality;
    public final long contentLength;
    public final int errorCategory;
    public final long eventElapsedMs;
    public final int httpStatusCode;
    public final boolean isLowestBitrate;
    public final int networkPriority;
    public final int phase;
    public final long playerId;
    public final long producerId;
    public final long rangeLength;
    public final long rangeOffset;
    public final int readTimeoutMs;
    public final int requestKind;
    public final long requestLocalId;
    public final int retryOrdinal;
    public final int segmentDurationMs;
    public final int segmentStartMs;
    public final int streamType;
    public final int trackType;

    public static C4915DEi A01(int i, int i2, int i3, int i4, int i5, int i6, long j, long j2, long j3, long j4, long j5, long j6) {
        return new C4915DEi(i, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, i2, i3, i4, i5, i6, j, j2, j3, j4, 0L, -1L, 0L, j5, j6, false);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("VideoRequestDiagnosticEvent{phase=");
        sbA0x.append(this.phase);
        sbA0x.append(", producerId=");
        sbA0x.append(this.producerId);
        sbA0x.append(", requestLocalId=");
        sbA0x.append(this.requestLocalId);
        sbA0x.append(", playerId=");
        sbA0x.append(this.playerId);
        sbA0x.append(", eventElapsedMs=");
        sbA0x.append(this.eventElapsedMs);
        sbA0x.append(", bytesTransferred=");
        sbA0x.append(this.bytesTransferred);
        sbA0x.append(", errorCategory=");
        return BV8.A0z(sbA0x, this.errorCategory);
    }

    public C4915DEi(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, boolean z) {
        super(DER.A0K);
        this.phase = i;
        this.producerId = j;
        this.requestLocalId = j2;
        this.playerId = j3;
        this.eventElapsedMs = j4;
        this.streamType = i2;
        this.trackType = i3;
        this.requestKind = i4;
        this.rangeOffset = j5;
        this.rangeLength = j6;
        this.avgBitrate = j7;
        this.isLowestBitrate = z;
        this.segmentStartMs = i5;
        this.segmentDurationMs = i6;
        this.bufferedDurationMsAtCreation = i7;
        this.networkPriority = i8;
        this.connectTimeoutMs = i9;
        this.readTimeoutMs = i10;
        this.retryOrdinal = i11;
        this.bytesTransferred = j8;
        this.contentLength = j9;
        this.coalescedProgressCount = i12;
        this.connectionQuality = i13;
        this.cacheSource = i14;
        this.errorCategory = i15;
        this.httpStatusCode = i16;
    }
}
