package com.facebook.rsys.transport.gen;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C3cH;
import X.C60O;
import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class SignalingMessage {
    public static G50<SignalingMessage> CONVERTER = C8922Fte.A00(34);
    public static long sMcfTypeId;
    public final boolean disableInlineProcessing;
    public final McfReference extraContext;
    public final SignalingMessageIncomingStats incomingStats;
    public final int messageRetryThreshold;
    public final MetricIdentifiers metricIdentifiers;
    public final byte[] payload;
    public final int signalingProtocol;
    public final int transportChannel;

    public static native SignalingMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SignalingMessage) {
                SignalingMessage signalingMessage = (SignalingMessage) obj;
                if (this.signalingProtocol == signalingMessage.signalingProtocol && this.transportChannel == signalingMessage.transportChannel && this.metricIdentifiers.equals(signalingMessage.metricIdentifiers) && Arrays.equals(this.payload, signalingMessage.payload)) {
                    McfReference mcfReference = this.extraContext;
                    McfReference mcfReference2 = signalingMessage.extraContext;
                    if (mcfReference != null ? mcfReference.equals(mcfReference2) : mcfReference2 == null) {
                        SignalingMessageIncomingStats signalingMessageIncomingStats = this.incomingStats;
                        SignalingMessageIncomingStats signalingMessageIncomingStats2 = signalingMessage.incomingStats;
                        if (signalingMessageIncomingStats == null) {
                            if (signalingMessageIncomingStats2 != null) {
                                return false;
                            }
                        } else if (signalingMessageIncomingStats.equals(signalingMessageIncomingStats2)) {
                        }
                        if (this.disableInlineProcessing != signalingMessage.disableInlineProcessing || this.messageRetryThreshold != signalingMessage.messageRetryThreshold) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((AnonymousClass005.A0F(this.metricIdentifiers, (((527 + this.signalingProtocol) * 31) + this.transportChannel) * 31) + Arrays.hashCode(this.payload)) * 31) + AnonymousClass006.A0D(this.extraContext)) * 31) + C3cH.A02(this.incomingStats)) * 31) + (this.disableInlineProcessing ? 1 : 0)) * 31) + this.messageRetryThreshold;
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("SignalingMessage{signalingProtocol=");
        sbA0x.append(this.signalingProtocol);
        sbA0x.append(",transportChannel=");
        sbA0x.append(this.transportChannel);
        sbA0x.append(",metricIdentifiers=");
        sbA0x.append(this.metricIdentifiers);
        sbA0x.append(",payload=");
        sbA0x.append(this.payload);
        sbA0x.append(",extraContext=");
        sbA0x.append(this.extraContext);
        sbA0x.append(",incomingStats=");
        sbA0x.append(this.incomingStats);
        sbA0x.append(",disableInlineProcessing=");
        sbA0x.append(this.disableInlineProcessing);
        sbA0x.append(",messageRetryThreshold=");
        return BV8.A0z(sbA0x, this.messageRetryThreshold);
    }

    public SignalingMessage(int i, int i2, MetricIdentifiers metricIdentifiers, byte[] bArr, McfReference mcfReference, SignalingMessageIncomingStats signalingMessageIncomingStats, boolean z, int i3) {
        metricIdentifiers.getClass();
        bArr.getClass();
        this.signalingProtocol = i;
        this.transportChannel = i2;
        this.metricIdentifiers = metricIdentifiers;
        this.payload = bArr;
        this.extraContext = mcfReference;
        this.incomingStats = signalingMessageIncomingStats;
        this.disableInlineProcessing = z;
        this.messageRetryThreshold = i3;
    }
}
