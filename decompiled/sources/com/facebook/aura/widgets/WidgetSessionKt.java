package com.facebook.aura.widgets;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.GAX;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.startup.AuraStartupOrchestrator;
import com.facebook.aura.startup.appjob.ScopeFilter;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public abstract class WidgetSessionKt {
    public static final long GATEWAY_CONNECT_TIMEOUT_MS = 20000;
    public static final long SESSION_TIMEOUT_MS = 15000;

    @DebugMetadata(c = "com.facebook.aura.widgets.WidgetSessionKt", f = "WidgetSession.kt", l = {48}, m = "awaitBackgroundWidgetSession", v = 2)
    /* renamed from: com.facebook.aura.widgets.WidgetSessionKt$awaitBackgroundWidgetSession$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WidgetSessionKt.awaitBackgroundWidgetSession(null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.WidgetSessionKt$awaitSettledSessionState$2", f = "WidgetSession.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.widgets.WidgetSessionKt$awaitSettledSessionState$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super AuraSessionManager.SessionState>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.widgets.WidgetSessionKt$awaitSettledSessionState$2$1", f = "WidgetSession.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.widgets.WidgetSessionKt$awaitSettledSessionState$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<AuraSessionManager.SessionState, HtJ<? super Boolean>, Object> {
            public /* synthetic */ Object L$0;
            public int label;

            public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object obj2 = this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return C3cG.A0P(obj2 instanceof AuraSessionManager.SessionState.Initializing);
            }

            @Override // X.G0V
            public final Object invoke(AuraSessionManager.SessionState sessionState, HtJ<? super Boolean> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.L$0 = sessionState;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<AuraSessionManager.SessionState> c1bn = AuraSessionManager.state;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                obj = AbstractC9777Gfy.A00(this, anonymousClass1, c1bn);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super AuraSessionManager.SessionState> htJ) {
            return new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.WidgetSessionKt", f = "WidgetSession.kt", l = {42}, m = "awaitSignedOut", v = 2)
    /* renamed from: com.facebook.aura.widgets.WidgetSessionKt$awaitSignedOut$1, reason: invalid class name and case insensitive filesystem */
    public final class C144301 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WidgetSessionKt.awaitSignedOut(this);
        }

        public C144301(HtJ<? super C144301> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.WidgetSessionKt$awaitSignedOut$2", f = "WidgetSession.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoGravity}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.widgets.WidgetSessionKt$awaitSignedOut$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    public final class C144312 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super AuraSessionManager.SessionState>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.widgets.WidgetSessionKt$awaitSignedOut$2$1", f = "WidgetSession.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.widgets.WidgetSessionKt$awaitSignedOut$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<AuraSessionManager.SessionState, HtJ<? super Boolean>, Object> {
            public /* synthetic */ Object L$0;
            public int label;

            public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object obj2 = this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Boolean.valueOf(obj2 instanceof AuraSessionManager.SessionState.SignedOut);
            }

            @Override // X.G0V
            public final Object invoke(AuraSessionManager.SessionState sessionState, HtJ<? super Boolean> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.L$0 = sessionState;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }
        }

        public C144312(HtJ<? super C144312> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C144312(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<AuraSessionManager.SessionState> c1bn = AuraSessionManager.state;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                obj = AbstractC9777Gfy.A00(this, anonymousClass1, c1bn);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super AuraSessionManager.SessionState> htJ) {
            return new C144312(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.WidgetSessionKt", f = "WidgetSession.kt", l = {31, 32}, m = "connectWidgetGateway", v = 2)
    /* renamed from: com.facebook.aura.widgets.WidgetSessionKt$connectWidgetGateway$1, reason: invalid class name and case insensitive filesystem */
    public final class C144321 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WidgetSessionKt.connectWidgetGateway(null, this);
        }

        public C144321(HtJ<? super C144321> htJ) {
            super(htJ);
        }
    }

    public static final Object awaitSettledSessionState(HtJ<? super AuraSessionManager.SessionState> htJ) {
        return GAX.A01(htJ, new AnonymousClass2(null), 15000L);
    }

    public static final boolean isCurrentWidgetSession(AbstractC3358CGz abstractC3358CGz) {
        AbstractC3358CGz abstractC3358CGz2;
        C7384Etj.A0Y(abstractC3358CGz, 0);
        AuraSessionManager.SessionState value = AuraSessionManager.state.getValue();
        if (!(value instanceof AuraSessionManager.SessionState.Activating)) {
            if (value instanceof AuraSessionManager.SessionState.Active) {
                abstractC3358CGz2 = ((AuraSessionManager.SessionState.Active) value).session;
            }
        }
        abstractC3358CGz2 = ((AuraSessionManager.SessionState.Activating) value).session;
        return abstractC3358CGz2 == abstractC3358CGz;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitBackgroundWidgetSession(android.content.Context r5, X.HtJ<? super X.AbstractC3358CGz> r6) {
        /*
            boolean r0 = r6 instanceof com.facebook.aura.widgets.WidgetSessionKt.AnonymousClass1
            if (r0 == 0) goto L50
            r4 = r6
            com.facebook.aura.widgets.WidgetSessionKt$awaitBackgroundWidgetSession$1 r4 = (com.facebook.aura.widgets.WidgetSessionKt.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L42
            if (r1 != r0) goto L58
            java.lang.Object r0 = r4.L$0
            android.content.Context r5 = X.C60P.A02(r0, r3)
        L23:
            com.facebook.aura.auth.AuraSessionManager$SessionState r3 = (com.facebook.aura.auth.AuraSessionManager.SessionState) r3
            boolean r0 = r3 instanceof com.facebook.aura.auth.AuraSessionManager.SessionState.Activating
            if (r0 == 0) goto L39
            com.facebook.aura.auth.AuraSessionManager$SessionState$Activating r3 = (com.facebook.aura.auth.AuraSessionManager.SessionState.Activating) r3
            X.CGz r2 = r3.session
        L2d:
            if (r2 == 0) goto L38
            com.facebook.aura.gateway.service.HatchGatewayServiceManager r1 = com.facebook.aura.gateway.service.HatchGatewayServiceManager.INSTANCE
            android.content.Context r0 = X.AnonymousClass001.A0I(r5)
            r1.initialize(r0, r2)
        L38:
            return r2
        L39:
            boolean r0 = r3 instanceof com.facebook.aura.auth.AuraSessionManager.SessionState.Active
            if (r0 == 0) goto L56
            com.facebook.aura.auth.AuraSessionManager$SessionState$Active r3 = (com.facebook.aura.auth.AuraSessionManager.SessionState.Active) r3
            X.CGz r2 = r3.session
            goto L2d
        L42:
            X.Hwg.A00(r3)
            r4.L$0 = r5
            r4.label = r0
            java.lang.Object r3 = awaitSettledSessionState(r4)
            if (r3 != r2) goto L23
            return r2
        L50:
            com.facebook.aura.widgets.WidgetSessionKt$awaitBackgroundWidgetSession$1 r4 = new com.facebook.aura.widgets.WidgetSessionKt$awaitBackgroundWidgetSession$1
            r4.<init>(r6)
            goto L12
        L56:
            r2 = 0
            return r2
        L58:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.WidgetSessionKt.awaitBackgroundWidgetSession(android.content.Context, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitSignedOut(X.HtJ<? super java.lang.Boolean> r6) {
        /*
            boolean r0 = r6 instanceof com.facebook.aura.widgets.WidgetSessionKt.C144301
            if (r0 == 0) goto L3c
            r5 = r6
            com.facebook.aura.widgets.WidgetSessionKt$awaitSignedOut$1 r5 = (com.facebook.aura.widgets.WidgetSessionKt.C144301) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3c
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 != r3) goto L42
            X.Hwg.A00(r1)
        L20:
            if (r1 != 0) goto L23
            r3 = 0
        L23:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L28:
            X.Hwg.A00(r1)
            r0 = 0
            com.facebook.aura.widgets.WidgetSessionKt$awaitSignedOut$2 r2 = new com.facebook.aura.widgets.WidgetSessionKt$awaitSignedOut$2
            r2.<init>(r0)
            r5.label = r3
            r0 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r1 = X.GAX.A01(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3c:
            com.facebook.aura.widgets.WidgetSessionKt$awaitSignedOut$1 r5 = new com.facebook.aura.widgets.WidgetSessionKt$awaitSignedOut$1
            r5.<init>(r6)
            goto L12
        L42:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.WidgetSessionKt.awaitSignedOut(X.HtJ):java.lang.Object");
    }

    public static final Object awaitWidgetSession(Context context, HtJ<? super AbstractC3358CGz> htJ) {
        AuraStartupOrchestrator.INSTANCE.start(ScopeFilter.FULL);
        return awaitBackgroundWidgetSession(context, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object connectWidgetGateway(X.AbstractC3358CGz r7, X.HtJ<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof com.facebook.aura.widgets.WidgetSessionKt.C144321
            if (r0 == 0) goto L62
            r6 = r8
            com.facebook.aura.widgets.WidgetSessionKt$connectWidgetGateway$1 r6 = (com.facebook.aura.widgets.WidgetSessionKt.C144321) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L62
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 == r1) goto L4b
            if (r0 != r3) goto L68
            java.lang.Object r2 = r6.L$1
            com.facebook.aura.gateway.HatchGatewayConnection r2 = (com.facebook.aura.gateway.HatchGatewayConnection) r2
            X.Hwg.A00(r5)
        L27:
            boolean r0 = r2.isConnected()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L30:
            X.Hwg.A00(r5)
            com.facebook.aura.gateway.HatchGatewayConnection r2 = X.C60O.A05(r7)
            boolean r0 = r2.isConnected()
            if (r0 != 0) goto L52
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r2
            r6.label = r1
            java.lang.Object r0 = r2.fetchAndConnect(r1, r1, r0, r6)
            if (r0 != r4) goto L52
            return r4
        L4b:
            java.lang.Object r2 = r6.L$1
            com.facebook.aura.gateway.HatchGatewayConnection r2 = (com.facebook.aura.gateway.HatchGatewayConnection) r2
            X.Hwg.A00(r5)
        L52:
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r2
            r6.label = r3
            r0 = 20000(0x4e20, double:9.8813E-320)
            java.lang.Object r0 = r2.awaitConnected(r0, r6)
            if (r0 != r4) goto L27
            return r4
        L62:
            com.facebook.aura.widgets.WidgetSessionKt$connectWidgetGateway$1 r6 = new com.facebook.aura.widgets.WidgetSessionKt$connectWidgetGateway$1
            r6.<init>(r8)
            goto L12
        L68:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.WidgetSessionKt.connectWidgetGateway(X.CGz, X.HtJ):java.lang.Object");
    }
}
