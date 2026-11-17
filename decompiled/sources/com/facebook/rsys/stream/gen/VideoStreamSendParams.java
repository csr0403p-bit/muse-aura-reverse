package com.facebook.rsys.stream.gen;

import X.AnonymousClass006;
import X.BV7;
import X.C60O;
import X.C8922Fte;
import X.C8j4;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class VideoStreamSendParams {
    public static G50<VideoStreamSendParams> CONVERTER = C8922Fte.A00(28);
    public static long sMcfTypeId;
    public final double bitratePriority;
    public final int maxBitrateBps;
    public final int maxFrameRate;
    public final int minBitrateBps;
    public final double scaleResolutionDownBy;

    public static native VideoStreamSendParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VideoStreamSendParams) {
                VideoStreamSendParams videoStreamSendParams = (VideoStreamSendParams) obj;
                if (this.maxFrameRate != videoStreamSendParams.maxFrameRate || this.minBitrateBps != videoStreamSendParams.minBitrateBps || this.maxBitrateBps != videoStreamSendParams.maxBitrateBps || this.bitratePriority != videoStreamSendParams.bitratePriority || this.scaleResolutionDownBy != videoStreamSendParams.scaleResolutionDownBy) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C8j4.A0B(Double.doubleToLongBits(this.scaleResolutionDownBy), AnonymousClass006.A06(Double.doubleToLongBits(this.bitratePriority), (((((527 + this.maxFrameRate) * 31) + this.minBitrateBps) * 31) + this.maxBitrateBps) * 31));
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("VideoStreamSendParams{maxFrameRate=");
        sbA0x.append(this.maxFrameRate);
        sbA0x.append(",minBitrateBps=");
        sbA0x.append(this.minBitrateBps);
        sbA0x.append(",maxBitrateBps=");
        sbA0x.append(this.maxBitrateBps);
        sbA0x.append(",bitratePriority=");
        sbA0x.append(this.bitratePriority);
        sbA0x.append(",scaleResolutionDownBy=");
        sbA0x.append(this.scaleResolutionDownBy);
        return BV7.A11(sbA0x);
    }

    public VideoStreamSendParams(int i, int i2, int i3, double d, double d2) {
        this.maxFrameRate = i;
        this.minBitrateBps = i2;
        this.maxBitrateBps = i3;
        this.bitratePriority = d;
        this.scaleResolutionDownBy = d2;
    }
}
