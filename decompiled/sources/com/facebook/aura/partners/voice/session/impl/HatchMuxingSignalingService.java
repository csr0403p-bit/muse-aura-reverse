package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.GV7;
import com.facebook.rsys.base.gen.FeatureHolder;
import com.facebook.rsys.transport.gen.SignalingMessage;
import com.facebook.rsys.transport.gen.SignalingTransportCallback;
import com.facebook.rsys.transport.gen.SignalingTransportCallbackExt;
import com.facebook.rsys.transport.gen.SignalingTransportProxy;
import com.facebook.rsys.transport.gen.SignalingTransportSink;
import com.facebook.rsys.transport.gen.StatusUpdate;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes6.dex */
public final class HatchMuxingSignalingService implements GV7 {
    public static final Companion Companion = new Companion();
    public static final String TAG = "HatchMuxSignaling";
    public final LinkedHashSet<GV7> activated;
    public volatile GV7 delegate;
    public final Object lock;
    public final MuxingProxy proxy;
    public final String userId;

    public final class MuxingProxy extends SignalingTransportProxy {
        public volatile SignalingTransportSink activeSink;

        @Override // com.facebook.rsys.transport.gen.SignalingTransportProxy
        public void onStatusUpdate(StatusUpdate statusUpdate) {
            C7384Etj.A0Y(statusUpdate, 0);
            HatchMuxingSignalingService.this.delegate.getSignalingTransportProxy().onStatusUpdate(statusUpdate);
        }

        @Override // com.facebook.rsys.transport.gen.SignalingTransportProxy
        public void setSink(SignalingTransportSink signalingTransportSink) {
            C7384Etj.A0Y(signalingTransportSink, 0);
            this.activeSink = signalingTransportSink;
            HatchMuxingSignalingService.this.delegate.getSignalingTransportProxy().setSink(signalingTransportSink);
        }

        public MuxingProxy() {
        }

        public final SignalingTransportSink getActiveSink() {
            return this.activeSink;
        }

        @Override // com.facebook.rsys.transport.gen.SignalingTransportProxy
        public SignalingTransportSink getTransportSink() {
            return this.activeSink;
        }

        public final void setActiveSink(SignalingTransportSink signalingTransportSink) {
            this.activeSink = signalingTransportSink;
        }

        @Override // com.facebook.rsys.transport.gen.SignalingTransportProxy
        public void sendSignalingMessage(SignalingMessage signalingMessage, SignalingTransportCallback signalingTransportCallback, SignalingTransportCallbackExt signalingTransportCallbackExt, int i) {
            AnonymousClass003.A0u(signalingMessage, signalingTransportCallback);
            HatchMuxingSignalingService.this.delegate.getSignalingTransportProxy().sendSignalingMessage(signalingMessage, signalingTransportCallback, signalingTransportCallbackExt, i);
        }
    }

    public final void setActiveDelegate(GV7 gv7) {
        C7384Etj.A0Y(gv7, 0);
        synchronized (this.lock) {
            if (gv7 == this.delegate) {
                return;
            }
            this.delegate = gv7;
            this.activated.add(gv7);
            SignalingTransportSink signalingTransportSink = this.proxy.activeSink;
            if (signalingTransportSink != null) {
                gv7.getSignalingTransportProxy().setSink(signalingTransportSink);
            }
        }
    }

    @Override // X.GV7
    public void tearDown(String str) {
        List listA0X;
        C7384Etj.A0Y(str, 0);
        synchronized (this.lock) {
            listA0X = AbstractC0878AGe.A0X(this.activated);
        }
        Iterator it = listA0X.iterator();
        while (it.hasNext()) {
            ((GV7) it.next()).tearDown(str);
        }
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    @Override // X.GV7
    public FeatureHolder createRsysFeature() {
        return this.delegate.createRsysFeature();
    }

    @Override // X.GV7
    public SignalingTransportProxy getSignalingTransportProxy() {
        return this.proxy;
    }

    @Override // X.GV7
    public String getUserId() {
        return this.userId;
    }

    public HatchMuxingSignalingService(String str, GV7 gv7) {
        boolean zA1b = AnonymousClass004.A1b(str, gv7);
        this.userId = str;
        this.lock = C3cG.A0T();
        LinkedHashSet<GV7> linkedHashSet = new LinkedHashSet<>(2);
        linkedHashSet.add(new GV7[]{gv7}[zA1b ? 1 : 0]);
        this.activated = linkedHashSet;
        this.delegate = gv7;
        this.proxy = new MuxingProxy();
    }
}
