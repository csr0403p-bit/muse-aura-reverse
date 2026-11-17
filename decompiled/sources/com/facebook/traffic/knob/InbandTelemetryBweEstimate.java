package com.facebook.traffic.knob;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV4;
import X.BV8;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.DOO;
import X.DOQ;
import X.DOR;
import X.FGI;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates$AndPredicate;
import com.google.common.base.Predicates$CompositionPredicate;
import com.google.common.base.Predicates$InPredicate;
import com.google.common.collect.Maps$EntryFunction;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class InbandTelemetryBweEstimate {
    public static final String COMPACT_DEBUG_STR_DELIMITER_LEVEL_1 = ",";
    public static final String HTTP_HEADER_INBAND_ESTIMATE_PREFIX = "inbandbwe-estimate";
    public static final String KEY_VALUE_SEPARATOR = "=";
    public static final int PRIME = 31;
    public final List<InbandTelemetryBweEstimate> alternateEstimates;
    public final Map<String, String> debugInfo;
    public final long httpBytesMultiplexed;
    public final long httpDelaysMs;
    public final String httpLastRequestAppMarker;
    public final String httpRequestTypeId;
    public final long transportDelaysMs;
    public final Map<Double, Long> transportGfrKbps;

    public final class Builder {
        public Map<Double, Long> transportGfrKbps = BV4.A0u();
        public long transportDelaysMs = -1;
        public long httpBytesMultiplexed = -1;
        public long httpDelaysMs = -1;
        public String httpRequestTypeId = "";
        public String httpLastRequestAppMarker = "";
        public Map<String, String> debugInfo = BV4.A0u();
        public List<InbandTelemetryBweEstimate> alternateEstimates = C3cG.A0h();

        public InbandTelemetryBweEstimate build() {
            return new InbandTelemetryBweEstimate(this);
        }

        public Builder alternateEstimates(List<InbandTelemetryBweEstimate> list) {
            this.alternateEstimates = list;
            return this;
        }

        public Builder debugInfo(Map<String, String> map) {
            this.debugInfo = map;
            return this;
        }

        public Builder httpBytesMultiplexed(long j) {
            this.httpBytesMultiplexed = j;
            return this;
        }

        public Builder httpDelaysMs(long j) {
            this.httpDelaysMs = j;
            return this;
        }

        public Builder httpLastRequestAppMarker(String str) {
            this.httpLastRequestAppMarker = str;
            return this;
        }

        public Builder httpRequestTypeId(String str) {
            this.httpRequestTypeId = str;
            return this;
        }

        public Builder transportDelaysMs(long j) {
            this.transportDelaysMs = j;
            return this;
        }

        public Builder transportGfrKbps(Map<Double, Long> map) {
            this.transportGfrKbps = map;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InbandTelemetryBweEstimate inbandTelemetryBweEstimate = (InbandTelemetryBweEstimate) obj;
        return this.transportGfrKbps.equals(inbandTelemetryBweEstimate.transportGfrKbps) && this.transportDelaysMs == inbandTelemetryBweEstimate.transportDelaysMs && this.httpBytesMultiplexed == inbandTelemetryBweEstimate.httpBytesMultiplexed && this.httpDelaysMs == inbandTelemetryBweEstimate.httpDelaysMs && this.httpRequestTypeId.equals(inbandTelemetryBweEstimate.httpRequestTypeId) && this.httpLastRequestAppMarker.equals(inbandTelemetryBweEstimate.httpLastRequestAppMarker) && this.debugInfo.equals(inbandTelemetryBweEstimate.debugInfo) && this.alternateEstimates.equals(inbandTelemetryBweEstimate.alternateEstimates);
    }

    public List<InbandTelemetryBweEstimate> getAlternateEstimates() {
        return this.alternateEstimates;
    }

    public long getBandwidthBps(double d) {
        Number numberA0b = BV4.A0b(Double.valueOf(d), this.transportGfrKbps);
        if (numberA0b == null) {
            return -1L;
        }
        return numberA0b.longValue() * 1000;
    }

    public Map<String, String> getDebugInfo() {
        return this.debugInfo;
    }

    public String getDebugStr(DebugStrOptions debugStrOptions) {
        Map<String, String> doq;
        boolean zIsEmpty = debugStrOptions.allowListByFieldId.isEmpty();
        Map<String, String> map = this.debugInfo;
        if (!zIsEmpty) {
            Predicates$InPredicate predicates$InPredicate = new Predicates$InPredicate(debugStrOptions.allowListByFieldId);
            Predicates$CompositionPredicate predicates$CompositionPredicate = new Predicates$CompositionPredicate(predicates$InPredicate, Maps$EntryFunction.A01);
            if (map instanceof DOO) {
                DOO doo = (DOO) map;
                Map<K, V> map2 = doo.A01;
                Predicate<? super Map.Entry<K, V>> predicate = doo.A00;
                predicate.getClass();
                doq = new DOR<>(new Predicates$AndPredicate(Arrays.asList(predicate, predicates$CompositionPredicate)), map2);
            } else {
                map.getClass();
                doq = new DOQ<>(predicates$InPredicate, predicates$CompositionPredicate, map);
            }
            map = doq;
        }
        Iterator itA0n = AnonymousClass002.A0n(map);
        StringBuilder sbA0w = C60O.A0w();
        try {
            if (itA0n.hasNext()) {
                while (true) {
                    Map.Entry entryA0l = C3cH.A0l(itA0n);
                    Object key = entryA0l.getKey();
                    sbA0w.append(BV8.A0k(key, key));
                    sbA0w.append((CharSequence) KEY_VALUE_SEPARATOR);
                    Object value = entryA0l.getValue();
                    sbA0w.append(BV8.A0k(value, value));
                    if (!itA0n.hasNext()) {
                        break;
                    }
                    sbA0w.append((CharSequence) ",");
                }
            }
            return sbA0w.toString();
        } catch (IOException e) {
            throw BV4.A0N(e);
        }
    }

    public long getHttpBytesMultiplexed() {
        return this.httpBytesMultiplexed;
    }

    public long getHttpDelaysMs() {
        return this.httpDelaysMs;
    }

    public String getHttpLastRequestAppMarker() {
        return this.httpLastRequestAppMarker;
    }

    public String getHttpRequestIdType() {
        return this.httpRequestTypeId;
    }

    public long getTransportDelaysMs() {
        return this.transportDelaysMs;
    }

    public Map<Double, Long> getTransportGfrKbps() {
        return this.transportGfrKbps;
    }

    public long getTtfbMs() {
        long j = this.httpDelaysMs;
        if (j <= 0) {
            j = 0;
        }
        long j2 = this.transportDelaysMs;
        return j2 > 0 ? j + j2 : j;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0F(Long.valueOf(this.httpDelaysMs), AnonymousClass005.A0F(Long.valueOf(this.httpBytesMultiplexed), AnonymousClass005.A0F(Long.valueOf(this.transportDelaysMs), (this.transportGfrKbps.hashCode() + 31) * 31))) + AnonymousClass006.A0G(this.httpRequestTypeId)) * 31) + AnonymousClass005.A0H(this.httpLastRequestAppMarker)) * 31) + this.debugInfo.hashCode()) * 31) + this.alternateEstimates.hashCode();
    }

    public InbandTelemetryBweEstimate(Builder builder) {
        this.transportGfrKbps = builder.transportGfrKbps;
        this.transportDelaysMs = builder.transportDelaysMs;
        this.httpBytesMultiplexed = builder.httpBytesMultiplexed;
        this.httpDelaysMs = builder.httpDelaysMs;
        this.httpRequestTypeId = builder.httpRequestTypeId;
        this.httpLastRequestAppMarker = builder.httpLastRequestAppMarker;
        this.debugInfo = builder.debugInfo;
        this.alternateEstimates = builder.alternateEstimates;
    }

    public Map<String, String> getHttpHeaders(HttpHeaderOptions httpHeaderOptions) {
        HashMap mapA0u = BV4.A0u();
        mapA0u.put(FGI.A0M(httpHeaderOptions.prependStr, HTTP_HEADER_INBAND_ESTIMATE_PREFIX), getDebugStr(new DebugStrOptions(httpHeaderOptions.allowListByFieldId)));
        return mapA0u;
    }
}
