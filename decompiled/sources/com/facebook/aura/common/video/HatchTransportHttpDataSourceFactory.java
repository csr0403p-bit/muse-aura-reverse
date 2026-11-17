package com.facebook.aura.common.video;

import X.C06H;
import X.C7384Etj;
import X.CX1;
import X.CX6;
import X.InterfaceC4891DDk;
import com.facebook.aura.network.transport.HatchRequestPurpose;

/* loaded from: classes5.dex */
public final class HatchTransportHttpDataSourceFactory extends CX6 {
    public static final int $stable = 8;
    public final Long idleTimeoutMs;
    public final HatchRequestPurpose purpose;
    public final String userAgent;

    public HatchTransportHttpDataSourceFactory() {
        this(null, HatchRequestPurpose.FETCH, null);
    }

    @Override // X.CX6
    public InterfaceC4891DDk createDataSourceInternal(CX1 cx1) {
        C7384Etj.A0Y(cx1, 0);
        return new HatchTransportHttpDataSource(this.userAgent, cx1, this.purpose, this.idleTimeoutMs);
    }

    public HatchTransportHttpDataSourceFactory(String str, HatchRequestPurpose hatchRequestPurpose, Long l) {
        C7384Etj.A0Y(hatchRequestPurpose, 1);
        this.userAgent = str;
        this.purpose = hatchRequestPurpose;
        this.idleTimeoutMs = l;
    }

    public /* synthetic */ HatchTransportHttpDataSourceFactory(String str, HatchRequestPurpose hatchRequestPurpose, Long l, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? HatchRequestPurpose.FETCH : hatchRequestPurpose, (i & 4) != 0 ? null : l);
    }
}
