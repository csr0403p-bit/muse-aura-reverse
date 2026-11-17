package com.facebook.rsys.callmanager.callintentcommon.gen;

import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.BV8;
import X.C60O;
import X.C8926Fti;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callintent.gen.CallIntent;

/* loaded from: classes6.dex */
public class RejectCallParams {
    public static G50<RejectCallParams> CONVERTER = C8926Fti.A00(30);
    public static long sMcfTypeId;
    public final CallIntent callIntent;
    public final int reason;
    public final boolean shouldInformPeer;
    public final String subReason;

    public class Builder {
        public CallIntent callIntent;
        public int reason;
        public boolean shouldInformPeer;
        public String subReason;

        public RejectCallParams build() {
            return new RejectCallParams(this);
        }
    }

    public static native RejectCallParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RejectCallParams) {
                RejectCallParams rejectCallParams = (RejectCallParams) obj;
                if (!this.callIntent.equals(rejectCallParams.callIntent) || this.reason != rejectCallParams.reason || !this.subReason.equals(rejectCallParams.subReason) || this.shouldInformPeer != rejectCallParams.shouldInformPeer) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.subReason, (BV8.A09(this.callIntent) + this.reason) * 31) + (this.shouldInformPeer ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("RejectCallParams{callIntent=");
        sbA0x.append(this.callIntent);
        sbA0x.append(",reason=");
        sbA0x.append(this.reason);
        sbA0x.append(",subReason=");
        sbA0x.append(this.subReason);
        sbA0x.append(",shouldInformPeer=");
        return AbstractC7610F5x.A0y(sbA0x, this.shouldInformPeer);
    }

    public RejectCallParams(Builder builder) {
        builder.callIntent.getClass();
        builder.subReason.getClass();
        this.callIntent = builder.callIntent;
        this.reason = builder.reason;
        this.subReason = builder.subReason;
        this.shouldInformPeer = builder.shouldInformPeer;
    }
}
