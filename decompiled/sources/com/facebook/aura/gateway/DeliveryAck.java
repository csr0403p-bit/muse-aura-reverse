package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class DeliveryAck extends C06G {
    public static final int $stable = 0;
    public final String requestId;
    public final String serverMessageId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryAck) {
                DeliveryAck deliveryAck = (DeliveryAck) obj;
                if (!C7384Etj.areEqual(this.requestId, deliveryAck.requestId) || !C7384Etj.areEqual(this.serverMessageId, deliveryAck.serverMessageId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeliveryAck copy$default(DeliveryAck deliveryAck, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deliveryAck.requestId;
        }
        if ((i & 2) != 0) {
            str2 = deliveryAck.serverMessageId;
        }
        AnonymousClass003.A0u(str, str2);
        return new DeliveryAck(str, str2);
    }

    public final String component1() {
        return this.requestId;
    }

    public final String component2() {
        return this.serverMessageId;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getServerMessageId() {
        return this.serverMessageId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.serverMessageId, AnonymousClass001.A0G(this.requestId));
    }

    public DeliveryAck(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.requestId = str;
        this.serverMessageId = str2;
    }

    public final DeliveryAck copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new DeliveryAck(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
