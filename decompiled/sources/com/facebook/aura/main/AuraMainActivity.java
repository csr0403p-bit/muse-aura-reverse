package com.facebook.aura.main;

import X.A6J;
import X.AKH;
import X.AKJ;
import X.AKT;
import X.AbstractC3358CGz;
import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AbstractC8082FSn;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.B1V;
import X.BFM;
import X.BJt;
import X.BMW;
import X.C06977mk;
import X.C06H;
import X.C1971Avc;
import X.C1BO;
import X.C2CK;
import X.C3cG;
import X.C3cI;
import X.C5246DeB;
import X.C60P;
import X.C7344EnG;
import X.C7384Etj;
import X.C7438Evz;
import X.C78N;
import X.C79;
import X.C7mA;
import X.C8345FcJ;
import X.C8497Ff4;
import X.CFK;
import X.F0C;
import X.FPU;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC08439ui;
import X.InterfaceC7353EnQ;
import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.aura.analytics.timespent.TimeSpentAnalytics;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import com.facebook.aura.bugreport.AuraRageShakeManager;
import com.facebook.aura.conversation.api.ComposerLaunchAction;
import com.facebook.aura.deeplink.HatchIntentViewModel;
import com.facebook.aura.deeplink.HatchReservedIntentExtras;
import com.facebook.aura.gateway.AuraProactiveSyncManager;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.lifecycle.AuraPictureInPicture;
import com.facebook.aura.main.api.AuraWidgetLaunch;
import com.facebook.aura.qpl.startup.HatchStartupQpl;
import com.facebook.aura.qpl.startup.points.HatchStartupPoints;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.startup.AuraStartupOrchestrator;
import com.facebook.aura.ui.HatchComposerGeometry;
import com.facebook.aura.ui.HatchComposerGeometryKt;
import com.facebook.aura.ui.HatchWindowGeometry;
import com.facebook.aura.ui.HatchWindowGeometryKt;
import com.facebook.aura.ui.MutableHatchWindowGeometry;
import com.facebook.aura.ui.adaptive.AuraAdaptiveInfoKt;
import com.facebook.aura.vds.compose.theme.root.AuraRootKt;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AuraMainActivity extends AppCompatActivity {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final String KEY_FRAMEWORK_FRAGMENTS = "android:fragments";
    public static final String KEY_LAUNCH_INTENT_FINISHED = "launch_intent_finished";
    public static final String TAG = "AuraMainActivity";
    public static boolean hasShownSplash;
    public static final C06977mk ownAppCaller;
    public final F0C intentViewModel$delegate;
    public boolean isColdStart;
    public boolean isNavBarVisible;
    public final F0C isActivationEnabled$delegate = AbstractC5321DgF.A02(C79.A0C, AnonymousClass2.INSTANCE);
    public final F0C rageShakeManager$delegate = AbstractC5321DgF.A03(new AuraMainActivity$rageShakeManager$2(this));
    public final MutableHatchWindowGeometry windowGeometry = new MutableHatchWindowGeometry();
    public final HatchComposerGeometry composerGeometry = new HatchComposerGeometry();
    public final AtomicBoolean hasFiredSessionlessAfterRender = new AtomicBoolean(false);
    public final AtomicBoolean hasFiredInitialContentRendered = new AtomicBoolean(false);

    /* renamed from: com.facebook.aura.main.AuraMainActivity$onCreate$2, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C126522 extends C7438Evz implements Function0<Unit> {
        public C126522(Object obj) {
            super(0, obj, AuraMainActivity.class, "setStatusBarColors", "setStatusBarColors()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((AuraMainActivity) this.receiver).setStatusBarColors();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.main.AuraMainActivity$onCreate$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Intent $launchIntent;

        /* renamed from: com.facebook.aura.main.AuraMainActivity$onCreate$3$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ C1BO<Boolean> $isInitialized$delegate;
            public final /* synthetic */ C1BO<AuraSessionManager.SessionState> $sessionState$delegate;
            public final /* synthetic */ AuraMainActivity this$0;

            /* renamed from: com.facebook.aura.main.AuraMainActivity$onCreate$3$2$1, reason: invalid class name */
            public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
                public final /* synthetic */ C1BO<Boolean> $isInitialized$delegate;
                public final /* synthetic */ C1BO<AuraSessionManager.SessionState> $sessionState$delegate;
                public final /* synthetic */ AuraMainActivity this$0;

                /* renamed from: com.facebook.aura.main.AuraMainActivity$onCreate$3$2$1$1, reason: invalid class name and collision with other inner class name */
                public final class C02271 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
                    public final /* synthetic */ C1BO<Boolean> $isInitialized$delegate;
                    public final /* synthetic */ C1BO<AuraSessionManager.SessionState> $sessionState$delegate;
                    public final /* synthetic */ AuraMainActivity this$0;

                    /* renamed from: com.facebook.aura.main.AuraMainActivity$onCreate$3$2$1$1$1, reason: invalid class name and collision with other inner class name */
                    public final class C02281 extends AbstractC7559F3s implements G0W<Boolean, BFM, Integer, Unit> {
                        public final /* synthetic */ AuraMainActivity this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C02281(AuraMainActivity auraMainActivity) {
                            super(3);
                            this.this$0 = auraMainActivity;
                        }

                        public final void invoke(boolean z, BFM bfm, int i) {
                            if ((i & 6) == 0) {
                                i |= AnonymousClass004.A0n(bfm, z);
                            }
                            if (!AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
                                bfm.Afo();
                            } else {
                                AuraMainActivity auraMainActivity = this.this$0;
                                HatchSignedOutHostKt.HatchSignedOutHost(auraMainActivity.isColdStart, z, auraMainActivity.getRageShakeManager(), null, bfm, ((i << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (AuraRageShakeManager.$stable << 6), 8);
                            }
                        }

                        @Override // X.G0W
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, BFM bfm, Integer num) {
                            invoke(AnonymousClass001.A1X(bool), bfm, AnonymousClass001.A0F(num));
                            return Unit.INSTANCE;
                        }
                    }

                    /* renamed from: com.facebook.aura.main.AuraMainActivity$onCreate$3$2$1$1$2, reason: invalid class name and collision with other inner class name */
                    public final class C02292 extends AbstractC7559F3s implements G0W<AbstractC3358CGz, BFM, Integer, Unit> {
                        public final /* synthetic */ AuraMainActivity this$0;

                        public final void invoke(AbstractC3358CGz abstractC3358CGz, BFM bfm, int i) {
                            C7384Etj.A0Y(abstractC3358CGz, 0);
                            ActivationLoadingScreenKt.ActivationLoadingScreen(abstractC3358CGz, this.this$0.getRageShakeManager(), null, bfm, (i & 14) | (AuraRageShakeManager.$stable << 3), 4);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C02292(AuraMainActivity auraMainActivity) {
                            super(3);
                            this.this$0 = auraMainActivity;
                        }

                        @Override // X.G0W
                        public /* bridge */ /* synthetic */ Unit invoke(AbstractC3358CGz abstractC3358CGz, BFM bfm, Integer num) {
                            invoke(abstractC3358CGz, bfm, AnonymousClass001.A0F(num));
                            return Unit.INSTANCE;
                        }
                    }

                    /* renamed from: com.facebook.aura.main.AuraMainActivity$onCreate$3$2$1$1$3, reason: invalid class name and collision with other inner class name */
                    public final class C02303 extends AbstractC7559F3s implements G0W<AuraSessionManager.SessionState.Active, BFM, Integer, Unit> {
                        public final /* synthetic */ AuraMainActivity this$0;

                        public final void invoke(AuraSessionManager.SessionState.Active active, BFM bfm, int i) {
                            C7384Etj.A0Y(active, 0);
                            boolean zIsActivationEnabled = this.this$0.isActivationEnabled();
                            AuraRageShakeManager rageShakeManager = this.this$0.getRageShakeManager();
                            AuraMainActivity auraMainActivity = this.this$0;
                            boolean zA67 = bfm.A67(auraMainActivity);
                            Object objAaT = bfm.AaT();
                            if (zA67 || objAaT == C78N.A00) {
                                objAaT = new AuraMainActivity$onCreate$3$2$1$1$3$1$1(auraMainActivity);
                                bfm.Ai0(objAaT);
                            }
                            HatchActiveSessionHostKt.HatchActiveSessionHost(active, zIsActivationEnabled, rageShakeManager, (G0U) ((InterfaceC7353EnQ) objAaT), null, bfm, (i & 14) | (AuraRageShakeManager.$stable << 6), 16);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C02303(AuraMainActivity auraMainActivity) {
                            super(3);
                            this.this$0 = auraMainActivity;
                        }

                        @Override // X.G0W
                        public /* bridge */ /* synthetic */ Unit invoke(AuraSessionManager.SessionState.Active active, BFM bfm, Integer num) {
                            invoke(active, bfm, AnonymousClass001.A0F(num));
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C02271(AuraMainActivity auraMainActivity, C1BO<Boolean> c1bo, C1BO<? extends AuraSessionManager.SessionState> c1bo2) {
                        super(2);
                        this.this$0 = auraMainActivity;
                        this.$isInitialized$delegate = c1bo;
                        this.$sessionState$delegate = c1bo2;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void invoke(X.BFM r16, int r17) {
                        /*
                            r15 = this;
                            r2 = r17
                            r1 = r17 & 3
                            r0 = 2
                            r14 = 0
                            r3 = 1
                            boolean r0 = X.AnonymousClass002.A1P(r1, r0)
                            r12 = r16
                            boolean r0 = X.AnonymousClass001.A1b(r0, r12, r2)
                            if (r0 == 0) goto L9f
                            X.1BO<java.lang.Boolean> r0 = r15.$isInitialized$delegate
                            boolean r0 = X.C1BO.A0F(r0)
                            if (r0 == 0) goto L26
                            X.1BO<com.facebook.aura.auth.AuraSessionManager$SessionState> r0 = r15.$sessionState$delegate
                            java.lang.Object r0 = r0.getValue()
                            boolean r0 = r0 instanceof com.facebook.aura.auth.AuraSessionManager.SessionState.Initializing
                            r4 = 1
                            if (r0 == 0) goto L27
                        L26:
                            r4 = 0
                        L27:
                            X.1BO<java.lang.Boolean> r0 = r15.$isInitialized$delegate
                            boolean r6 = X.C1BO.A0F(r0)
                            X.1BO<com.facebook.aura.auth.AuraSessionManager$SessionState> r0 = r15.$sessionState$delegate
                            java.lang.Object r7 = r0.getValue()
                            com.facebook.aura.auth.AuraSessionManager$SessionState r7 = (com.facebook.aura.auth.AuraSessionManager.SessionState) r7
                            com.facebook.aura.main.AuraMainActivity r0 = r15.this$0
                            com.facebook.aura.main.AuraMainActivity$onCreate$3$2$1$1$1 r1 = new com.facebook.aura.main.AuraMainActivity$onCreate$3$2$1$1$1
                            r1.<init>(r0)
                            r0 = -1849914958(0xffffffff91bc89b2, float:-2.9746031E-28)
                            X.B1U r8 = X.B1V.A00(r12, r1, r0)
                            com.facebook.aura.main.AuraMainActivity r0 = r15.this$0
                            com.facebook.aura.main.AuraMainActivity$onCreate$3$2$1$1$2 r1 = new com.facebook.aura.main.AuraMainActivity$onCreate$3$2$1$1$2
                            r1.<init>(r0)
                            r0 = -268564492(0xffffffffeffe07f4, float:-1.5723761E29)
                            X.B1U r9 = X.B1V.A00(r12, r1, r0)
                            com.facebook.aura.main.AuraMainActivity r0 = r15.this$0
                            com.facebook.aura.main.AuraMainActivity$onCreate$3$2$1$1$3 r1 = new com.facebook.aura.main.AuraMainActivity$onCreate$3$2$1$1$3
                            r1.<init>(r0)
                            r0 = 833252708(0x31aa6d64, float:4.9600875E-9)
                            X.B1U r10 = X.B1V.A00(r12, r1, r0)
                            r2 = 0
                            X.ATq r5 = X.C10G.A01
                            com.facebook.aura.vds.compose.theme.AuraColors r0 = X.C3cH.A0W(r12)
                            long r0 = r0.background
                            X.BRg r5 = X.C1b8.A01(r5, r0)
                            com.facebook.aura.main.AuraMainActivity r1 = r15.this$0
                            int r0 = com.facebook.aura.main.AuraMainActivity.$stable
                            com.facebook.aura.ui.MutableHatchWindowGeometry r0 = r1.windowGeometry
                            X.BRg r5 = com.facebook.aura.ui.HatchWindowGeometryKt.hatchWindowGeometryRoot(r5, r0, r4)
                            com.facebook.aura.main.AuraMainActivity r4 = r15.this$0
                            boolean r1 = r12.A67(r4)
                            java.lang.Object r0 = r12.AaT()
                            if (r1 != 0) goto L86
                            java.lang.Object r1 = X.C78N.A00
                            if (r0 != r1) goto L8e
                        L86:
                            com.facebook.aura.main.AuraMainActivity$onCreate$3$2$1$1$4$1 r0 = new com.facebook.aura.main.AuraMainActivity$onCreate$3$2$1$1$4$1
                            r0.<init>(r4)
                            r12.Ai0(r0)
                        L8e:
                            X.EnQ r0 = (X.InterfaceC7353EnQ) r0
                            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
                            X.BRg r11 = X.BJW.A00(r5, r0)
                            r13 = 28032(0x6d80, float:3.9281E-41)
                            com.facebook.aura.main.HatchSessionTransitionHostKt.HatchSessionTransitionHost(r6, r7, r8, r9, r10, r11, r12, r13, r14)
                            com.facebook.aura.main.HatchLogoutOverlayKt.HatchLogoutOverlay(r2, r12, r14, r3)
                            return
                        L9f:
                            r12.Afo()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.main.AuraMainActivity.AnonymousClass3.AnonymousClass2.AnonymousClass1.C02271.invoke(X.BFM, int):void");
                    }

                    @Override // X.G0V
                    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                        invoke(bfm, AnonymousClass001.A0F(num));
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass1(AuraMainActivity auraMainActivity, C1BO<Boolean> c1bo, C1BO<? extends AuraSessionManager.SessionState> c1bo2) {
                    super(2);
                    this.this$0 = auraMainActivity;
                    this.$isInitialized$delegate = c1bo;
                    this.$sessionState$delegate = c1bo2;
                }

                public final void invoke(BFM bfm, int i) {
                    if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                        AuraRootKt.AuraRoot(null, null, B1V.A00(bfm, new C02271(this.this$0, this.$isInitialized$delegate, this.$sessionState$delegate), 270832386), bfm, 384, 3);
                    } else {
                        bfm.Afo();
                    }
                }

                @Override // X.G0V
                public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                    invoke(bfm, AnonymousClass001.A0F(num));
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(AuraMainActivity auraMainActivity, C1BO<Boolean> c1bo, C1BO<? extends AuraSessionManager.SessionState> c1bo2) {
                super(2);
                this.this$0 = auraMainActivity;
                this.$isInitialized$delegate = c1bo;
                this.$sessionState$delegate = c1bo2;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    AuraAdaptiveInfoKt.ProvideAuraAdaptiveInfo(B1V.A00(bfm, new AnonymousClass1(this.this$0, this.$isInitialized$delegate, this.$sessionState$delegate), 1937006710), bfm, 6);
                } else {
                    bfm.Afo();
                }
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Intent intent) {
            super(2);
            this.$launchIntent = intent;
        }

        public static final /* synthetic */ AuraSessionManager.SessionState access$invoke$lambda$0(C1BO c1bo) {
            return (AuraSessionManager.SessionState) c1bo.getValue();
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            C1BO c1boA02 = C2CK.A02(bfm, AuraSessionManager.state);
            C1BO c1boA022 = C2CK.A02(bfm, AuraStartupOrchestrator.isUiBlockingReady);
            boolean zA1T = AnonymousClass001.A1T(bfm, AuraMainActivity.this, bfm.A65(c1boA02));
            AuraMainActivity auraMainActivity = AuraMainActivity.this;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new AuraMainActivity$onCreate$3$1$1(auraMainActivity, c1boA02);
                bfm.Ai0(objAaT);
            }
            bfm.AZp((Function0) objAaT);
            AKH<HatchWindowGeometry> akh = HatchWindowGeometryKt.LocalHatchWindowGeometry;
            AuraMainActivity auraMainActivity2 = AuraMainActivity.this;
            int i2 = AuraMainActivity.$stable;
            AKT.A02(bfm, B1V.A00(bfm, new AnonymousClass2(auraMainActivity2, c1boA022, c1boA02), -471578151), new AKJ[]{akh.A04(auraMainActivity2.windowGeometry), HatchComposerGeometryKt.LocalHatchComposerGeometry.A04(auraMainActivity2.composerGeometry)}, 48);
            Unit unit = Unit.INSTANCE;
            boolean zA1T2 = AnonymousClass001.A1T(bfm, AuraMainActivity.this, bfm.A67(this.$launchIntent));
            Intent intent = this.$launchIntent;
            AuraMainActivity auraMainActivity3 = AuraMainActivity.this;
            Object objAaT2 = bfm.AaT();
            if (zA1T2 || objAaT2 == C78N.A00) {
                objAaT2 = new AuraMainActivity$onCreate$3$3$1(intent, auraMainActivity3);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, unit);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSessionlessContentRendered() {
        hasShownSplash = true;
        fireInitialContentRenderedIfNeeded();
        if (this.hasFiredSessionlessAfterRender.compareAndSet(false, true)) {
            AuraStartupOrchestrator.INSTANCE.notifyInitialContentRendered();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C7384Etj.A0Y(keyEvent, 0);
        ((TimeSpentAnalytics) C5246DeB.A00(65558)).recordUserInteraction();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C7384Etj.A0Y(motionEvent, 0);
        ((TimeSpentAnalytics) C5246DeB.A00(65558)).recordUserInteraction();
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) throws NoSuchAlgorithmException {
        C7384Etj.A0Y(intent, 0);
        dropUnreadableExtras(intent);
        super.onNewIntent(intent);
        handleIntent(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C7384Etj.A0Y(configuration, 1);
        super.onPictureInPictureModeChanged(z, configuration);
        AuraAppLifecycleManager.INSTANCE.markPictureInPicture(System.identityHashCode(this), z);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPictureInPictureUiStateChanged(android.app.PictureInPictureUiState r5) {
        /*
            r4 = this;
            r3 = 0
            X.C7384Etj.A0Y(r5, r3)
            super.onPictureInPictureUiStateChanged(r5)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 35
            if (r1 < r0) goto L14
            boolean r0 = r5.isTransitioningToPip()
            r2 = 1
            if (r0 != 0) goto L15
        L14:
            r2 = 0
        L15:
            int[] r0 = new int[]{r3}
            r0 = r0[r3]
            boolean r1 = r5.isStashed()
            if (r0 != 0) goto L27
            com.facebook.aura.partners.voice.impl.HatchVoicePipUiStateListener r0 = com.facebook.aura.partners.voice.impl.HatchVoicePipUiStateListener.INSTANCE
            r0.onPictureInPictureUiStateChanged(r2, r1)
            return
        L27:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass005.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.main.AuraMainActivity.onPictureInPictureUiStateChanged(android.app.PictureInPictureUiState):void");
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C7384Etj.A0Y(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(KEY_LAUNCH_INTENT_FINISHED, getIntentViewModel().isLaunchIntentFinished(AuraUserSessionStore.INSTANCE.getCurrentUserSession()));
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivities(Intent[] intentArr, Bundle bundle) {
        C7384Etj.A0Y(intentArr, 0);
        for (Intent intent : intentArr) {
            tagOutboundLaunch(intent);
        }
        super.startActivities(intentArr, bundle);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        C7384Etj.A0Y(intent, 0);
        tagOutboundLaunch(intent);
        super.startActivityForResult(intent, i, bundle);
    }

    /* renamed from: com.facebook.aura.main.AuraMainActivity$isActivationEnabled$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return AnonymousClass001.A0i();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return AnonymousClass001.A0i();
        }
    }

    static {
        C7mA c7mA = new C7mA();
        long j = c7mA.A00 | 1;
        c7mA.A00 = j;
        c7mA.A00 = j | 16;
        ownAppCaller = c7mA.A00();
    }

    private final void fireInitialContentRenderedIfNeeded() {
        if (C3cI.A1W(this.hasFiredInitialContentRendered)) {
            HatchStartupQpl.Companion.markerPoint(HatchStartupPoints.INITIAL_CONTENT_RENDERED);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchIntentViewModel getIntentViewModel() {
        return (HatchIntentViewModel) this.intentViewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuraRageShakeManager getRageShakeManager() {
        return (AuraRageShakeManager) this.rageShakeManager$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleIntent(Intent intent) throws NoSuchAlgorithmException {
        if (intent != null) {
            boolean zIsWidgetLaunch = AuraWidgetLaunch.INSTANCE.isWidgetLaunch(intent);
            if (!zIsWidgetLaunch) {
                intent.removeExtra(ComposerLaunchAction.EXTRA);
            }
            if ((intent.getData() != null && !zIsWidgetLaunch) || HatchReservedIntentExtras.INSTANCE.hasAny(intent)) {
                try {
                    C06977mk.A00(this, intent, ownAppCaller);
                } catch (SecurityException unused) {
                    if (!zIsWidgetLaunch) {
                        intent.setData(null);
                    }
                    HatchReservedIntentExtras.INSTANCE.clear(intent);
                }
            }
            getIntentViewModel().handleIntent(this, AuraUserSessionStore.INSTANCE.getCurrentUserSession(), intent, zIsWidgetLaunch);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isActivationEnabled() {
        return AnonymousClass001.A1X(this.isActivationEnabled$delegate.getValue());
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuraMainActivity() {
        final Function0 function0 = null;
        this.intentViewModel$delegate = new BMW(new Function0<BJt>() { // from class: com.facebook.aura.main.AuraMainActivity$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final BJt invoke() {
                return this.getViewModelStore();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ BJt invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<InterfaceC08439ui>() { // from class: com.facebook.aura.main.AuraMainActivity$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final InterfaceC08439ui invoke() {
                return this.getDefaultViewModelProviderFactory();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ InterfaceC08439ui invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<A6J>() { // from class: com.facebook.aura.main.AuraMainActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final A6J invoke() {
                A6J a6j;
                Function0 function02 = function0;
                return (function02 == null || (a6j = (A6J) function02.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : a6j;
            }
        }, C3cG.A0x(HatchIntentViewModel.class));
    }

    private final void dropUnreadableExtras(Intent intent) {
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                extras.keySet();
            }
        } catch (RuntimeException e) {
            CFK.A0A(TAG, "Dropping unreadable intent extras", e);
            intent.replaceExtras((Bundle) null);
        }
    }

    private final boolean isDarkMode(Context context) {
        return AnonymousClass003.A18(C60P.A00(context));
    }

    private final void observeWindowGeometry() {
        View viewFindViewById = findViewById(R.id.content);
        AbstractC8082FSn.A00(viewFindViewById, new FPU() { // from class: com.facebook.aura.main.AuraMainActivity.observeWindowGeometry.1
            @Override // X.FPU
            public final C8497Ff4 onApplyWindowInsets(View view, C8497Ff4 c8497Ff4) {
                C7384Etj.A0Y(c8497Ff4, 1);
                C8345FcJ c8345FcJA05 = c8497Ff4.A00.A05(2);
                C7384Etj.A0U(c8345FcJA05);
                AuraMainActivity auraMainActivity = AuraMainActivity.this;
                int i = AuraMainActivity.$stable;
                auraMainActivity.windowGeometry.updateNavigationBarInsets(c8345FcJA05.A01, c8345FcJA05.A02, c8345FcJA05.A00);
                return c8497Ff4;
            }
        });
        viewFindViewById.requestApplyInsets();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInitialContentRendered(AbstractC3358CGz abstractC3358CGz) {
        fireInitialContentRenderedIfNeeded();
        AuraStartupOrchestrator.INSTANCE.notifyInitialContentRenderedPostLogin(abstractC3358CGz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStatusBarColors() {
        boolean zA18 = AnonymousClass003.A18(C60P.A00(this));
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        getWindow().setNavigationBarContrastEnforced(false);
        C1971Avc c1971Avc = new C1971Avc(getWindow().getDecorView(), getWindow());
        boolean z = !zA18;
        c1971Avc.A01(z);
        c1971Avc.A00(z);
    }

    private final void tagOutboundLaunch(Intent intent) {
        ComponentName component = intent.getComponent();
        if (getPackageName().equals(component != null ? component.getPackageName() : null)) {
            return;
        }
        if (getPackageName().equals(intent.getPackage())) {
            return;
        }
        AuraPictureInPicture auraPictureInPicture = AuraPictureInPicture.INSTANCE;
        if (auraPictureInPicture.skipsOutboundLaunch(this)) {
            intent.addFlags(262144);
            auraPictureInPicture.markOutboundLaunch();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        AnonymousClass003.A0v(str, printWriter);
        if (C7344EnG.A05(printWriter, str, strArr)) {
            return;
        }
        super.dump(str, fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            android.content.Intent r0 = r8.getIntent()
            if (r0 == 0) goto L9
            r8.dropUnreadableExtras(r0)
        L9:
            if (r9 == 0) goto L10
            java.lang.String r0 = "android:fragments"
            r9.remove(r0)
        L10:
            com.facebook.aura.qpl.startup.HatchStartupQpl$Companion r2 = com.facebook.aura.qpl.startup.HatchStartupQpl.Companion
            java.lang.String r0 = "activity_oncreate_start"
            r2.markerPoint(r0)
            java.lang.String r0 = "splash_install_start"
            r2.markerPoint(r0)
            X.HsB r5 = new X.HsB
            r5.<init>(r8)
            X.FcY r6 = r5.A00
            r6.A02()
            java.lang.String r0 = "splash_install_end"
            r2.markerPoint(r0)
            android.view.Window r0 = r8.getWindow()
            r7 = 0
            X.BA9.A00(r0, r7)
            super.onCreate(r9)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 >= r0) goto L51
            android.view.Window r1 = r8.getWindow()
            android.view.Window r0 = r8.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            int r0 = r0.softInputMode
            r0 = r0 & (-241(0xffffffffffffff0f, float:NaN))
            r0 = r0 | 16
            r1.setSoftInputMode(r0)
        L51:
            r8.setStatusBarColors()
            com.facebook.aura.startup.AuraStartupOrchestrator r1 = com.facebook.aura.startup.AuraStartupOrchestrator.INSTANCE
            r4 = 0
            r3 = 1
            com.facebook.aura.startup.appjob.ScopeFilter r0 = com.facebook.aura.startup.appjob.ScopeFilter.FULL
            r1.start(r0)
            com.facebook.aura.analytics.hatch.HatchInstallReferrerLogger r0 = com.facebook.aura.analytics.hatch.HatchInstallReferrerLogger.INSTANCE
            r0.maybeLog(r8)
            if (r9 != 0) goto L74
            android.content.Intent r1 = r8.getIntent()
            if (r1 == 0) goto L74
            java.lang.String r0 = "replay_splash"
            boolean r0 = r1.getBooleanExtra(r0, r7)
            if (r0 != r3) goto L74
            com.facebook.aura.main.AuraMainActivity.hasShownSplash = r7
        L74:
            com.facebook.aura.main.AuraMainActivity$onCreate$1 r0 = new com.facebook.aura.main.AuraMainActivity$onCreate$1
            r0.<init>()
            r6.A03(r0)
            boolean r1 = com.facebook.aura.main.AuraMainActivity.hasShownSplash
            r0 = r1 ^ 1
            r8.isColdStart = r0
            if (r1 != 0) goto L8c
            com.facebook.aura.main.AuraMainActivity$onCreate$2 r0 = new com.facebook.aura.main.AuraMainActivity$onCreate$2
            r0.<init>(r8)
            com.facebook.aura.main.SplashScreenExitAnimationKt.animateSplashScreen(r5, r0)
        L8c:
            com.facebook.aura.appappearance.HatchAppAppearanceManager r0 = com.facebook.aura.appappearance.HatchAppAppearanceManager.INSTANCE
            r0.applySavedAppearance(r8)
            java.lang.String r0 = "activity_oncreate_end"
            r2.markerPoint(r0)
            java.lang.String r0 = "set_content"
            r2.markerPoint(r0)
            if (r9 != 0) goto Ldd
            android.content.Intent r0 = r8.getIntent()
            if (r0 == 0) goto Lbd
            int r1 = r0.getFlags()
            r0 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r1
            if (r0 == 0) goto Lbd
        Lac:
            com.facebook.aura.deeplink.HatchIntentViewModel r0 = r8.getIntentViewModel()
            r0.hasHandledLaunchIntent = r3
            if (r9 == 0) goto Lbd
        Lb4:
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "com.facebook.aura.extra.COMPOSER_LAUNCH_ACTION"
            r1.removeExtra(r0)
        Lbd:
            android.content.Intent r2 = r8.getIntent()
            com.facebook.aura.deeplink.HatchIntentViewModel r0 = r8.getIntentViewModel()
            boolean r0 = r0.hasHandledLaunchIntent
            if (r0 == 0) goto Lca
            r2 = r4
        Lca:
            com.facebook.aura.main.AuraMainActivity$onCreate$3 r1 = new com.facebook.aura.main.AuraMainActivity$onCreate$3
            r1.<init>(r2)
            r0 = -546347751(0xffffffffdf6f6519, float:-1.7250221E19)
            X.B1U r0 = X.B1V.A01(r1, r0, r3)
            X.Ap7.A00(r8, r0)
            r8.observeWindowGeometry()
            return
        Ldd:
            java.lang.String r0 = "launch_intent_finished"
            boolean r0 = r9.getBoolean(r0)
            if (r0 != r3) goto Lb4
            goto Lac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.main.AuraMainActivity.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        getRageShakeManager().onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() throws IOException {
        super.onResume();
        setStatusBarColors();
        AuraSessionManager auraSessionManager = AuraSessionManager.INSTANCE;
        if ((AuraSessionManager.state.getValue() instanceof AuraSessionManager.SessionState.Active) && AuraUserSessionStore.INSTANCE.getCurrentUserSession() == null) {
            auraSessionManager.signOut();
        }
        getRageShakeManager().onResume();
        AuraStartupOrchestrator.INSTANCE.refreshIfNeeded();
        AuraProactiveSyncManager auraProactiveSyncManager = AuraProactiveSyncManager.INSTANCE;
        auraProactiveSyncManager.cancelAll(this);
        auraProactiveSyncManager.enqueueAll(this);
    }

    @Override // android.app.Activity
    public void onTopResumedActivityChanged(boolean z) {
        super.onTopResumedActivityChanged(z);
        AuraAppLifecycleManager.INSTANCE.markTopResumedActivity(System.identityHashCode(this), z, isInPictureInPictureMode());
    }
}
