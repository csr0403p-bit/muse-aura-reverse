package com.facebook.rsys.transport.gen;

import X.AbstractC7608F5v;
import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C60O;
import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class MetricIdentifiers {
    public static G50<MetricIdentifiers> CONVERTER = C8922Fte.A00(31);
    public static long sMcfTypeId;
    public final Long flowId;
    public final boolean isRetryable;
    public final String localCallId;
    public final String messageType;
    public final String sharedCallId;
    public final String transactionId;

    public static native MetricIdentifiers createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MetricIdentifiers) {
                MetricIdentifiers metricIdentifiers = (MetricIdentifiers) obj;
                Long l = this.flowId;
                Long l2 = metricIdentifiers.flowId;
                if (l != null ? l.equals(l2) : l2 == null) {
                    String str = this.transactionId;
                    String str2 = metricIdentifiers.transactionId;
                    if (str == null) {
                        if (str2 != null) {
                            return false;
                        }
                    } else if (str.equals(str2)) {
                    }
                    String str3 = this.sharedCallId;
                    String str4 = metricIdentifiers.sharedCallId;
                    if (str3 == null) {
                        if (str4 != null) {
                            return false;
                        }
                    } else if (str3.equals(str4)) {
                    }
                    String str5 = this.localCallId;
                    String str6 = metricIdentifiers.localCallId;
                    if (str5 == null) {
                        if (str6 != null) {
                            return false;
                        }
                    } else if (str5.equals(str6)) {
                    }
                    String str7 = this.messageType;
                    String str8 = metricIdentifiers.messageType;
                    if (str7 == null) {
                        if (str8 != null) {
                            return false;
                        }
                    } else if (str7.equals(str8)) {
                    }
                    if (this.isRetryable == metricIdentifiers.isRetryable) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((AbstractC7608F5v.A02(AnonymousClass006.A0D(this.flowId)) + AnonymousClass006.A0G(this.transactionId)) * 31) + AnonymousClass006.A0G(this.sharedCallId)) * 31) + AnonymousClass006.A0G(this.localCallId)) * 31) + AnonymousClass005.A0H(this.messageType)) * 31) + (this.isRetryable ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("MetricIdentifiers{flowId=");
        sbA0x.append(this.flowId);
        sbA0x.append(",transactionId=");
        sbA0x.append(this.transactionId);
        sbA0x.append(",sharedCallId=");
        sbA0x.append(this.sharedCallId);
        sbA0x.append(",localCallId=");
        sbA0x.append(this.localCallId);
        sbA0x.append(",messageType=");
        sbA0x.append(this.messageType);
        sbA0x.append(",isRetryable=");
        return AbstractC7610F5x.A0y(sbA0x, this.isRetryable);
    }

    public MetricIdentifiers(Long l, String str, String str2, String str3, String str4, boolean z) {
        this.flowId = l;
        this.transactionId = str;
        this.sharedCallId = str2;
        this.localCallId = str3;
        this.messageType = str4;
        this.isRetryable = z;
    }
}
