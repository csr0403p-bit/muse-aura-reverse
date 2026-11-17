package com.facebook.pando;

import X.AnonymousClass005;
import X.C06H;
import X.C0881AGi;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Summary {
    public final long additiveThreadHopTimeMs;
    public final List<PandoError> allErrors;
    public final long cacheAge;
    public final long cacheEndTime;
    public final long cacheStartTime;
    public final String connectionErrorMessage;
    public final String connectionFieldName;
    public final boolean connectionHasError;
    public final long connectionUpdateEndIndex;
    public final long connectionUpdateStartIndex;
    public final long consistencySyncEndTime;
    public final long consistencySyncStartTime;
    public final String fbRequestId;
    public final boolean isAdaptivePrefetchReject;
    public final boolean isFinal;
    public final long networkAttempts;
    public final long networkChunksCount;
    public final long networkEndTime;
    public final long networkResponseStartTime;
    public final long networkResponsesCount;
    public final long networkStartTime;
    public final long parseEndTime;
    public final long parseStartTime;
    public final long parsedBytes;
    public final long parserElapsedMs;
    public final String prefetchPredictionId;
    public final long requestEndTime;
    public final long requestFirstByteFlushedTime;
    public final long requestLastByteAckedTime;
    public final long requestStartTime;
    public final long serverDuration;
    public final long serverFlushTime;
    public final long serverStartTime;
    public final String source;
    public final String sourceName;
    public final Map<String, String> trackedResponseHeaders;

    public boolean isFinal() {
        return this.isFinal;
    }

    public final com.facebook.graphservice.interfaces.Summary toGraphServiceSummary() {
        String str = this.source;
        String strConvertPandoSummarySourceToGSSummarySource = convertPandoSummarySourceToGSSummarySource(str);
        boolean z = this.isFinal;
        boolean isNetworkComplete = getIsNetworkComplete(str, z);
        List list = Collections.EMPTY_LIST;
        String str2 = this.fbRequestId;
        int i = (int) this.networkAttempts;
        long j = this.requestStartTime;
        long j2 = this.parseEndTime;
        long j3 = this.requestFirstByteFlushedTime;
        long j4 = this.requestLastByteAckedTime;
        long j5 = this.networkStartTime;
        long j6 = this.networkEndTime;
        long j7 = this.parseStartTime;
        int i2 = (int) this.parsedBytes;
        long j8 = this.networkChunksCount;
        long j9 = this.additiveThreadHopTimeMs;
        long j10 = this.parserElapsedMs;
        long j11 = this.cacheAge;
        long j12 = this.cacheStartTime;
        long j13 = this.cacheEndTime;
        long j14 = this.consistencySyncStartTime;
        long j15 = this.consistencySyncEndTime;
        return new com.facebook.graphservice.interfaces.Summary(strConvertPandoSummarySourceToGSSummarySource, z, isNetworkComplete, str2, i, list, j, j3, j4, j5, j6, j7, j2, i2, j10, j8, j9, j12, j13, j11, "fresh_cache".equals(str), 0, 0, "", "", "", false, false, false, this.sourceName, this.serverStartTime, this.serverFlushTime, j14, j15, this.isAdaptivePrefetchReject, this.prefetchPredictionId, 0L, 0L, null, this.trackedResponseHeaders, null, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0009 A[FALL_THROUGH, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0009 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String convertPandoSummarySourceToGSSummarySource(java.lang.String r2) {
        /*
            r1 = this;
            int r0 = r2.hashCode()
            java.lang.String r1 = "consistency"
            switch(r0) {
                case -1468451587: goto Lc;
                case 461569884: goto Lf;
                case 731617703: goto L13;
                case 1561714200: goto L1a;
                case 1782559025: goto L21;
                case 1843485230: goto L2c;
                default: goto L9;
            }
        L9:
            java.lang.String r1 = ""
        Lb:
            return r1
        Lc:
            java.lang.String r0 = "in_memory_store"
            goto L23
        Lf:
            java.lang.String r0 = "stale_cache"
            goto L23
        L13:
            java.lang.String r0 = "connection_load"
            boolean r0 = r2.equals(r0)
            goto L1e
        L1a:
            boolean r0 = r2.equals(r1)
        L1e:
            if (r0 != 0) goto Lb
            goto L9
        L21:
            java.lang.String r0 = "fresh_cache"
        L23:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            java.lang.String r1 = "cache"
            return r1
        L2c:
            java.lang.String r1 = "network"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L9
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.pando.Summary.convertPandoSummarySourceToGSSummarySource(java.lang.String):java.lang.String");
    }

    private final boolean getIsNetworkComplete(String str, boolean z) {
        String str2;
        switch (str.hashCode()) {
            case -1468451587:
                str2 = "in_memory_store";
                if (!str.equals(str2)) {
                }
                break;
            case 461569884:
                str2 = "stale_cache";
                if (!str.equals(str2)) {
                }
                break;
            case 1782559025:
                str2 = "fresh_cache";
                if (!str.equals(str2)) {
                }
                break;
            case 1843485230:
                if (str.equals("network")) {
                }
                break;
            default:
                return true;
        }
        return z;
    }

    public /* synthetic */ Summary(String str, boolean z, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, Map map, long j19, long j20, long j21, long j22, long j23, String str4, long j24, long j25, boolean z2, String str5, boolean z3, String str6, List list, int i, int i2, C06H c06h) {
        this(str, z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, C3cH.A03(i & 16, j), C3cH.A03(i & 32, j2), C3cH.A03(i & 64, j3), C3cH.A03(i & 128, j4), C3cH.A03(i & 256, j5), C3cH.A03(i & 512, j6), C3cH.A03(i & 1024, j7), C3cH.A03(i & 2048, j8), C3cH.A03(i & 4096, j9), C3cH.A03(i & 8192, j10), C3cH.A03(i & 16384, j11), C3cH.A03(32768 & i, j12), C3cH.A03(65536 & i, j13), C3cH.A03(131072 & i, j14), C3cH.A03(262144 & i, j15), C3cH.A03(524288 & i, j16), C3cH.A03(1048576 & i, j17), C3cH.A03(2097152 & i, j18), (4194304 & i) != 0 ? null : map, C3cH.A03(i & 8388608, j19), C3cH.A03(i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES, j20), C3cH.A03(i & 33554432, j21), C3cH.A03(i & 67108864, j22), C3cH.A03(i & 134217728, j23), (i & 268435456) != 0 ? "" : str4, C3cH.A03(i & 536870912, j24), (i & 1073741824) == 0 ? j25 : 0L, C3cG.A1K(i & Integer.MIN_VALUE, z2), (i2 & 1) != 0 ? "" : str5, (i2 & 2) == 0 ? z3 : false, (i2 & 4) == 0 ? str6 : "", (i2 & 8) != 0 ? C0881AGi.A00 : list);
    }

    public Summary(String str, boolean z, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, Map<String, String> map, long j19, long j20, long j21, long j22, long j23, String str4, long j24, long j25, boolean z2, String str5, boolean z3, String str6, List<PandoError> list) {
        AnonymousClass005.A11(str, str2, str3, 0);
        C7384Etj.A0Y(str4, 28);
        C7384Etj.A0Y(str5, 32);
        C7384Etj.A0Y(str6, 34);
        C7384Etj.A0Y(list, 35);
        this.source = str;
        this.isFinal = z;
        this.sourceName = str2;
        this.fbRequestId = str3;
        this.requestStartTime = j;
        this.requestEndTime = j2;
        this.requestFirstByteFlushedTime = j3;
        this.requestLastByteAckedTime = j4;
        this.networkStartTime = j5;
        this.networkEndTime = j6;
        this.networkResponseStartTime = j7;
        this.parseStartTime = j8;
        this.parseEndTime = j9;
        this.parserElapsedMs = j10;
        this.parsedBytes = j11;
        this.serverDuration = j12;
        this.serverStartTime = j13;
        this.serverFlushTime = j14;
        this.networkChunksCount = j15;
        this.additiveThreadHopTimeMs = j16;
        this.networkResponsesCount = j17;
        this.networkAttempts = j18;
        this.trackedResponseHeaders = map;
        this.cacheAge = j19;
        this.cacheStartTime = j20;
        this.cacheEndTime = j21;
        this.consistencySyncStartTime = j22;
        this.consistencySyncEndTime = j23;
        this.connectionFieldName = str4;
        this.connectionUpdateStartIndex = j24;
        this.connectionUpdateEndIndex = j25;
        this.connectionHasError = z2;
        this.connectionErrorMessage = str5;
        this.isAdaptivePrefetchReject = z3;
        this.prefetchPredictionId = str6;
        this.allErrors = list;
    }
}
