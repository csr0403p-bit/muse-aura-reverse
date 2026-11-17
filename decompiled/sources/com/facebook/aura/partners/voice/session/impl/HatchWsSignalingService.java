package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7607F5u;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06H;
import X.C3UX;
import X.C7384Etj;
import X.C8eO;
import X.CFK;
import X.F0C;
import X.GV7;
import X.Hxb;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.rsys.base.gen.FeatureHolder;
import com.facebook.rsys.transport.gen.SignalingTransportProxy;

/* loaded from: classes6.dex */
public final class HatchWsSignalingService implements GV7 {
    public static final Companion Companion = new Companion();
    public static final long GATEWAY_CONNECTED_WAIT_MS = 2000;
    public static final String TAG = "HatchWsSignalingService";
    public final HatchGatewayConnection gateway;
    public final HatchCallJoinContext joinContext;
    public volatile boolean joinRequestsVideoMedia;
    public final F0C proxy$delegate;
    public final C3UX scope;
    public final String userId;

    @Override // X.GV7
    public void tearDown(String str) {
        C7384Etj.A0Y(str, 0);
        CFK.A03(str, TAG, "tearDown: %s");
        Hxb.A03(null, this.scope);
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    private final SignalingTransportProxy getProxy() {
        return (SignalingTransportProxy) this.proxy$delegate.getValue();
    }

    @Override // X.GV7
    public /* bridge */ FeatureHolder createRsysFeature() {
        return null;
    }

    public final boolean getJoinRequestsVideoMedia() {
        return this.joinRequestsVideoMedia;
    }

    @Override // X.GV7
    public String getUserId() {
        return this.userId;
    }

    public final void setJoinRequestsVideoMedia(boolean z) {
        this.joinRequestsVideoMedia = z;
    }

    public HatchWsSignalingService(String str, HatchGatewayConnection hatchGatewayConnection, HatchCallJoinContext hatchCallJoinContext) {
        AnonymousClass005.A0x(str, hatchGatewayConnection, hatchCallJoinContext);
        this.userId = str;
        this.gateway = hatchGatewayConnection;
        this.joinContext = hatchCallJoinContext;
        this.scope = Hxb.A02(AnonymousClass001.A0y().plus(new C8eO(null)));
        this.proxy$delegate = AbstractC7607F5u.A1A(null, new HatchWsSignalingService$proxy$2(this));
    }

    @Override // X.GV7
    public SignalingTransportProxy getSignalingTransportProxy() {
        return getProxy();
    }
}
