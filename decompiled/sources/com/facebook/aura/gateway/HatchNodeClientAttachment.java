package com.facebook.aura.gateway;

import X.AbstractC3358CGz;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.C8eO;
import X.HtJ;
import X.Hxb;
import X.HzP;
import android.content.Context;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository;
import com.facebook.aura.gateway.HatchNodeClientAttachmentKt;
import com.facebook.aura.nodes.HatchNodeClient;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class HatchNodeClientAttachment {
    public static final int $stable = 0;
    public static boolean attached;
    public static final HatchNodeClientAttachment INSTANCE = new HatchNodeClientAttachment();
    public static C3UX backendScope = Hxb.A02(new C8eO(null));
    public static final Object attachLock = C3cG.A0T();
    public static final AtomicBoolean signOutResetRegistered = C60O.A1E();

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchNodeClientAttachment", f = "HatchNodeClientAttachment.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft, R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight}, m = "connectForBackgroundWork", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchNodeClientAttachment$connectForBackgroundWork$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchNodeClientAttachment.this.connectForBackgroundWork(null, null, this);
        }
    }

    private final void registerSignOutResetOnce() {
        if (C3cI.A1W(signOutResetRegistered)) {
            AuraSessionManager.INSTANCE.addSignOutCallback(new Runnable() { // from class: com.facebook.aura.gateway.HatchNodeClientAttachment.registerSignOutResetOnce.1
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (HatchNodeClientAttachment.attachLock) {
                        Hxb.A03(null, HatchNodeClientAttachment.backendScope);
                        HatchNodeClientAttachment.backendScope = Hxb.A02(new C8eO(null));
                        HatchNodeClientAttachment.attached = false;
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object connectForBackgroundWork(X.AbstractC3358CGz r8, android.content.Context r9, X.HtJ<? super java.lang.Boolean> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.gateway.HatchNodeClientAttachment.AnonymousClass1
            if (r0 == 0) goto L6a
            r6 = r10
            com.facebook.aura.gateway.HatchNodeClientAttachment$connectForBackgroundWork$1 r6 = (com.facebook.aura.gateway.HatchNodeClientAttachment.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6a
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 == r3) goto L51
            if (r0 != r4) goto L70
            java.lang.Object r2 = r6.L$2
            com.facebook.aura.gateway.HatchGatewayConnection r2 = (com.facebook.aura.gateway.HatchGatewayConnection) r2
            X.Hwg.A00(r1)
        L27:
            com.facebook.aura.gateway.HatchGatewayStateSnapshot r0 = X.C60Q.A0I(r2)
            com.facebook.aura.gateway.HatchGatewayConnectionState r0 = r0.connection
            boolean r0 = r0 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Connected
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L34:
            X.Hwg.A00(r1)
            r7.ensureAttached(r8, r9)
            com.facebook.aura.gateway.HatchGatewayConnection$Companion r0 = com.facebook.aura.gateway.HatchGatewayConnection.Companion
            com.facebook.aura.gateway.HatchGatewayConnection r2 = r0.getInstance(r8)
            r1 = 0
            r6.L$0 = r1
            r6.L$1 = r1
            r6.L$2 = r2
            r6.label = r3
            r0 = 0
            java.lang.Object r0 = r2.fetchAndConnect(r0, r0, r1, r6)
            if (r0 != r5) goto L58
            return r5
        L51:
            java.lang.Object r2 = r6.L$2
            com.facebook.aura.gateway.HatchGatewayConnection r2 = (com.facebook.aura.gateway.HatchGatewayConnection) r2
            X.Hwg.A00(r1)
        L58:
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.L$2 = r2
            r6.label = r4
            r0 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r0 = r2.awaitConnected(r0, r6)
            if (r0 != r5) goto L27
            return r5
        L6a:
            com.facebook.aura.gateway.HatchNodeClientAttachment$connectForBackgroundWork$1 r6 = new com.facebook.aura.gateway.HatchNodeClientAttachment$connectForBackgroundWork$1
            r6.<init>(r10)
            goto L12
        L70:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchNodeClientAttachment.connectForBackgroundWork(X.CGz, android.content.Context, X.HtJ):java.lang.Object");
    }

    public final void ensureAttached(AbstractC3358CGz abstractC3358CGz, Context context) {
        boolean zA1Y = C60P.A1Y(abstractC3358CGz, context);
        HatchNodeClient companion = HatchNodeClient.Companion.getInstance(abstractC3358CGz, context);
        registerSignOutResetOnce();
        synchronized (attachLock) {
            if (!attached) {
                HatchGatewayConnection companion2 = HatchGatewayConnection.Companion.getInstance(abstractC3358CGz);
                companion.proactiveSyncDispatcher = new HatchNodeClient.ProactiveSyncDispatcher() { // from class: com.facebook.aura.gateway.HatchNodeClientAttachment$ensureAttached$1$1
                    @Override // com.facebook.aura.nodes.HatchNodeClient.ProactiveSyncDispatcher
                    public void cancelAll(Context context2) {
                        C7384Etj.A0Y(context2, 0);
                        AuraProactiveSyncManager.INSTANCE.cancelAll(context2);
                    }

                    @Override // com.facebook.aura.nodes.HatchNodeClient.ProactiveSyncDispatcher
                    public void enqueueAll(Context context2) throws IOException {
                        C7384Etj.A0Y(context2, 0);
                        AuraProactiveSyncManager.INSTANCE.enqueueAll(context2);
                    }
                };
                companion.attach(new HatchGatewayConnectionBackend(companion2, backendScope), new HatchHttpConnectionBackend(abstractC3358CGz), HatchNodeHitlGate.Companion.getInstance(abstractC3358CGz), new HatchNodeClientAttachmentKt.AnonymousClass1(ConfidentialVmRepository.Companion.getInstance(abstractC3358CGz)), new HatchNodeClientAttachment$ensureAttached$1$2(abstractC3358CGz));
                HatchClientRuntimeStatePublisher.Companion.getInstance(abstractC3358CGz, companion);
                attached = zA1Y;
            }
        }
    }
}
