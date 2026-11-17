package com.facebook.graphservice.interfaces;

import X.C3cI;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.google.common.base.MoreObjects$ToStringHelper;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class Summary {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final long A0E;
    public final long A0F;
    public final long A0G;
    public final long A0H;
    public final long A0I;
    public final long A0J;
    public final long A0K;
    public final GraphQLQuery A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final List<Long> A0T;
    public final Map<String, String> A0U;
    public final Map<String, String> A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;

    public final String toString() {
        MoreObjects$ToStringHelper moreObjects$ToStringHelper = new MoreObjects$ToStringHelper(C3cI.A0Y(this));
        moreObjects$ToStringHelper.add(PhotosSearchHandlerKt.PARAM_SOURCE, this.A0R);
        moreObjects$ToStringHelper.add("isFinal", this.A0X);
        moreObjects$ToStringHelper.add("isNetworkComplete", this.A0Y);
        moreObjects$ToStringHelper.add(AgeCheckFunnelLogging.KEY_ATTEMPTS, this.A01);
        moreObjects$ToStringHelper.add("retryTimes", this.A0T);
        moreObjects$ToStringHelper.add("fbRequestId", this.A0P);
        moreObjects$ToStringHelper.add("requestStart", this.A0G);
        moreObjects$ToStringHelper.add("requestFirstByteFlushed", this.A0E);
        moreObjects$ToStringHelper.add("requestLastByteAcked", this.A0F);
        moreObjects$ToStringHelper.add("networkStart", this.A0B);
        moreObjects$ToStringHelper.add("networkEnd", this.A0A);
        moreObjects$ToStringHelper.add("parseStart", this.A0C);
        moreObjects$ToStringHelper.add("requestEnd", this.A0D);
        moreObjects$ToStringHelper.add("parsedDataSize", this.A03);
        moreObjects$ToStringHelper.add("additiveParseTimeMs", this.A04);
        moreObjects$ToStringHelper.add("networkChunksCount", this.A09);
        moreObjects$ToStringHelper.add("additiveThreadHopTimeMs", this.A05);
        moreObjects$ToStringHelper.add("fetchCachedResponseStart", this.A08);
        moreObjects$ToStringHelper.add("fetchCachedResponseEnd", this.A07);
        moreObjects$ToStringHelper.add("cachedResponseAge", this.A06);
        moreObjects$ToStringHelper.add("freshCacheResponse", this.A0W);
        moreObjects$ToStringHelper.add("consistencySource", this.A0M);
        moreObjects$ToStringHelper.add("serverStartTime", this.A0J);
        moreObjects$ToStringHelper.add("serverFlushTime", this.A0I);
        moreObjects$ToStringHelper.add("rejectedFromAdaptiveFetch", this.A0b);
        moreObjects$ToStringHelper.add("prefetchPredictionID", this.A0Q);
        moreObjects$ToStringHelper.add("rtt", this.A0H);
        moreObjects$ToStringHelper.add("upstreamLatency", this.A0K);
        moreObjects$ToStringHelper.add("trackedResponseHeaders", this.A0V);
        return moreObjects$ToStringHelper.toString();
    }

    public Summary(String str, boolean z, boolean z2, String str2, int i, List<Long> list, long j, long j2, long j3, long j4, long j5, long j6, long j7, int i2, long j8, long j9, long j10, long j11, long j12, long j13, boolean z3, int i3, int i4, String str3, String str4, String str5, boolean z4, boolean z5, boolean z6, String str6, long j14, long j15, long j16, long j17, boolean z7, String str7, long j18, long j19, GraphQLQuery graphQLQuery, Map<String, String> map, Map<String, String> map2, long j20) {
        this.A0R = str;
        this.A0X = z;
        this.A0Y = z2;
        this.A0P = str2;
        this.A01 = i;
        this.A0T = list;
        this.A0G = j;
        this.A0E = j2;
        this.A0F = j3;
        this.A0B = j4;
        this.A0A = j5;
        this.A0C = j6;
        this.A0D = j7;
        this.A03 = i2;
        this.A04 = j8;
        this.A09 = j9;
        this.A05 = j10;
        this.A08 = j11;
        this.A07 = j12;
        this.A06 = j13;
        this.A0W = z3;
        this.A02 = i3;
        this.A00 = i4;
        this.A0S = str3;
        this.A0O = str4;
        this.A0N = str5;
        this.A0Z = z4;
        this.A0a = z5;
        this.A0c = z6;
        this.A0M = str6;
        this.A0J = j14;
        this.A0I = j15;
        this.A0b = z7;
        this.A0Q = str7;
        this.A0H = j18;
        this.A0K = j19;
        this.A0L = graphQLQuery;
        this.A0V = map;
        this.A0U = map2;
    }

    public Summary(String str, boolean z, boolean z2, String str2, int i, List<Long> list, long j, long j2, long j3, long j4, long j5, long j6, long j7, int i2, long j8, long j9, long j10, long j11, long j12, long j13, boolean z3, int i3, int i4, String str3, String str4, String str5, boolean z4, boolean z5, boolean z6, String str6, long j14, long j15, long j16, long j17, boolean z7, String str7, long j18, long j19, Map<String, String> map, Map<String, String> map2, long j20) {
        this(str, z, z2, str2, i, list, j, j2, j3, j4, j5, j6, j7, i2, j8, j9, j10, j11, j12, j13, z3, i3, i4, str3, str4, str5, z4, z5, z6, str6, j14, j15, j16, j17, z7, str7, j18, j19, null, map, map2, j20);
    }
}
