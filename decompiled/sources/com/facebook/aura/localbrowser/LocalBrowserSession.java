package com.facebook.aura.localbrowser;

import X.AGH;
import X.AIW;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.BLG;
import X.C06H;
import X.C0924AIa;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C3rb;
import X.C60I;
import X.C60N;
import X.C6ys;
import X.C7384Etj;
import X.C7438Evz;
import X.C79;
import X.C7Bq;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.G0W;
import X.GAo;
import X.GDB;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.Hxb;
import android.os.SystemClock;
import androidx.activity.ComponentActivity;
import com.facebook.aura.backgroundwork.api.BackgroundWorkClaim;
import com.facebook.aura.browsertask.data.BrowserTaskRepository;
import com.facebook.aura.commands.sms.DeviceSmsReaderKt;
import com.facebook.aura.localbrowser.LocalBrowserSession;
import com.facebook.aura.localbrowser.LocalBrowserTarget;
import com.facebook.aura.notifications.push.HatchChatNotificationIds;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public final class LocalBrowserSession {
    public static final int $stable = 8;
    public final C1BN<Boolean> agentActive;
    public HoC agentIdle;
    public HoC availabilityHoldExpiry;
    public BackgroundWorkClaim backgroundWork;
    public LocalBrowserCloseReason closeReason;
    public LocalBrowserConnection connection;
    public final LocalBrowserDialogs dialogs;
    public final C1BN<LocalBrowserFacts> facts;
    public boolean holdingAvailability;
    public final String id;
    public HoC idleClose;
    public HoC idlePark;
    public long lastActivityMs;
    public final BLG<Boolean> mutableAgentActive;
    public final BLG<LocalBrowserFacts> mutableFacts;
    public final BLG<Boolean> mutableParked;
    public LocalBrowserParkTrigger parkRequest;
    public final C1BN<Boolean> parked;
    public HoC pendingHandBack;
    public HoC rendererCheck;
    public Boolean retirementSucceeded;
    public final C3UX scope;
    public final LocalBrowserTarget target;
    public final LocalBrowserTask task;
    public Long unparkedAtMs;
    public final AbstractC3358CGz userSession;

    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserSession$3, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass3 extends C7438Evz implements G0U<Boolean, Unit> {
        public AnonymousClass3(Object obj) {
            super(1, obj, LocalBrowserSession.class, "setAvailable", "setAvailable(Z)V", 0);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(AnonymousClass001.A1X(bool));
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((LocalBrowserSession) this.receiver).setAvailable(z);
        }
    }

    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserSession$4, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass4 extends C7438Evz implements G0U<String, Unit> {
        public AnonymousClass4(Object obj) {
            super(1, obj, LocalBrowserSession.class, "requireUserAction", "requireUserAction(Ljava/lang/String;)V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            ((LocalBrowserSession) AnonymousClass006.A0o(str, this)).requireUserAction(str);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserSession$checkRendererAfterFailure$1", f = "LocalBrowserSession.kt", l = {154}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserSession$checkRendererAfterFailure$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $document;
        public final /* synthetic */ Long $generation;
        public final /* synthetic */ long $revision;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, String str, Long l, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$revision = j;
            this.$document = str;
            this.$generation = l;
        }

        public static final boolean invokeSuspend$lambda$0(LocalBrowserSession localBrowserSession, long j, String str, Long l) {
            if (!AnonymousClass002.A1Y(localBrowserSession.closeReason) || localBrowserSession.getControl() != LocalBrowserControl.AGENT || C3cI.A0G(localBrowserSession).controlRevision != j || !C7384Etj.areEqual(localBrowserSession.target.page.state.getValue().document, str)) {
                return false;
            }
            LocalBrowserTask localBrowserTask = localBrowserSession.task;
            if (!C7384Etj.areEqual(localBrowserTask != null ? Long.valueOf(localBrowserTask.connection.generation) : null, l)) {
                return false;
            }
            LocalBrowserTask localBrowserTask2 = localBrowserSession.task;
            return localBrowserTask2 == null || localBrowserTask2.isCurrent();
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserSession.this.new AnonymousClass1(this.$revision, this.$document, this.$generation, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final LocalBrowserSession localBrowserSession = LocalBrowserSession.this;
                LocalBrowserTarget localBrowserTarget = localBrowserSession.target;
                final long j = this.$revision;
                final String str = this.$document;
                final Long l = this.$generation;
                Function0<Boolean> function0 = new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserSession$checkRendererAfterFailure$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(LocalBrowserSession.AnonymousClass1.invokeSuspend$lambda$0(localBrowserSession, j, str, l));
                    }
                };
                this.label = 1;
                if (localBrowserTarget.terminateIfUnresponsive(function0, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserSession$handBack$1", f = "LocalBrowserSession.kt", l = {198, 201}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserSession$handBack$1, reason: invalid class name and case insensitive filesystem */
    public final class C124551 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $revision;
        public int I$0;
        public int I$1;
        public int I$2;
        public long J$0;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124551(long j, HtJ<? super C124551> htJ) {
            super(2, htJ);
            this.$revision = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserSession.this.new C124551(this.$revision, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008e -> B:7:0x001c). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                r15 = this;
                r1 = r16
                X.Hji r12 = X.EnumC10460Hji.A02
                int r0 = r15.label
                r11 = 0
                r10 = 2
                r9 = 1
                if (r0 == 0) goto L42
                if (r0 == r9) goto L32
                if (r0 != r10) goto La0
                int r8 = r15.I$1
                long r4 = r15.J$0
                int r7 = r15.I$0
                java.lang.Object r6 = r15.L$0
                com.facebook.aura.localbrowser.LocalBrowserSession r6 = (com.facebook.aura.localbrowser.LocalBrowserSession) r6
                X.Hwg.A00(r1)
            L1c:
                boolean r1 = X.AnonymousClass001.A1X(r1)
                boolean r0 = com.facebook.aura.localbrowser.LocalBrowserSession.access$isHandBackCurrent(r6, r4)
                if (r0 == 0) goto L2f
                if (r1 == 0) goto L4d
                r6.pendingHandBack = r11
                com.facebook.aura.localbrowser.LocalBrowserControl r0 = com.facebook.aura.localbrowser.LocalBrowserControl.AGENT
                com.facebook.aura.localbrowser.LocalBrowserSession.access$publishControl(r6, r0)
            L2f:
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
            L31:
                return r12
            L32:
                int r8 = r15.I$2
                int r0 = r15.I$1
                long r4 = r15.J$0
                int r7 = r15.I$0
                java.lang.Object r6 = r15.L$0
                com.facebook.aura.localbrowser.LocalBrowserSession r6 = (com.facebook.aura.localbrowser.LocalBrowserSession) r6
                X.Hwg.A00(r1)
                goto L6a
            L42:
                X.Hwg.A00(r1)
                com.facebook.aura.localbrowser.LocalBrowserSession r6 = com.facebook.aura.localbrowser.LocalBrowserSession.this
                long r4 = r15.$revision
                r8 = 0
                r7 = 3
            L4b:
                r14 = r8
                goto L6c
            L4d:
                int r8 = r8 + 1
                if (r8 >= r7) goto L91
                if (r8 <= 0) goto L4b
                long r0 = (long) r8
                r2 = 500(0x1f4, double:2.47E-321)
                long r0 = r0 * r2
                r15.L$0 = r6
                r15.I$0 = r7
                r15.J$0 = r4
                r15.I$1 = r8
                r15.I$2 = r8
                r15.label = r9
                java.lang.Object r0 = X.C7Bq.A01(r0, r15)
                if (r0 == r12) goto L31
                r0 = r8
            L6a:
                r14 = r8
                r8 = r0
            L6c:
                boolean r0 = com.facebook.aura.localbrowser.LocalBrowserSession.access$isHandBackCurrent(r6, r4)
                if (r0 == 0) goto L2f
                r6.markAgentActivity()
                com.facebook.aura.localbrowser.LocalBrowserTarget r13 = r6.target
                long r2 = android.os.SystemClock.elapsedRealtime()
                r0 = 15000(0x3a98, double:7.411E-320)
                long r2 = r2 + r0
                r15.L$0 = r6
                r15.I$0 = r7
                r15.J$0 = r4
                r15.I$1 = r8
                r15.I$2 = r14
                r15.label = r10
                java.lang.Object r1 = r13.awaitAutomationViewport(r2, r15)
                if (r1 != r12) goto L1c
                return r12
            L91:
                com.facebook.aura.localbrowser.LocalBrowserSession r0 = com.facebook.aura.localbrowser.LocalBrowserSession.this
                r0.pendingHandBack = r11
                r0.refreshRendering()
                java.lang.String r1 = "LocalBrowserSession"
                java.lang.String r0 = "Automation host unavailable; retaining user control"
                X.CFK.A06(r1, r0)
                goto L2f
            La0:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserSession.C124551.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C124551) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserSession$markAgentActivity$1", f = "LocalBrowserSession.kt", l = {346}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserSession$markAgentActivity$1, reason: invalid class name and case insensitive filesystem */
    public final class C124561 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C124561(HtJ<? super C124561> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserSession.this.new C124561(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(60000L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            LocalBrowserSession.this.setAgentActive(false);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return LocalBrowserSession.this.new C124561(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserSession$recordInteraction$1", f = "LocalBrowserSession.kt", l = {232, 239}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserSession$recordInteraction$1, reason: invalid class name and case insensitive filesystem */
    public final class C124571 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public long J$0;
        public long J$1;
        public int label;

        public C124571(HtJ<? super C124571> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserSession.this.new C124571(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ComponentActivity componentActivity;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i != 0 && i != 1 && i != 2) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            while (true) {
                LocalBrowserSession localBrowserSession = LocalBrowserSession.this;
                if (!AnonymousClass002.A1Y(localBrowserSession.closeReason)) {
                    return Unit.INSTANCE;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                LocalBrowserTask localBrowserTask = localBrowserSession.task;
                if (localBrowserTask != null && localBrowserTask.isAvailable()) {
                    LocalBrowserSession.this.lastActivityMs = jElapsedRealtime;
                }
                LocalBrowserSession.this.updateBackgroundWork();
                LocalBrowserSession localBrowserSession2 = LocalBrowserSession.this;
                long j = (localBrowserSession2.lastActivityMs + 600000) - jElapsedRealtime;
                long jMin = 60000;
                if (j > 0) {
                    jMin = Math.min(j, 60000L);
                    this.J$0 = jElapsedRealtime;
                    this.J$1 = j;
                    this.label = 1;
                } else {
                    LocalBrowserTarget.HostLease value = localBrowserSession2.target.currentHost.getValue();
                    if (value == null || value.kind != LocalBrowserHostKind.PRESENTATION || (componentActivity = value.activity) == null || componentActivity.isInPictureInPictureMode()) {
                        LocalBrowserRuntime.Companion.getInstance(LocalBrowserSession.this.userSession).closeSession(LocalBrowserSession.this, LocalBrowserCloseReason.IDLE);
                    } else {
                        this.J$0 = jElapsedRealtime;
                        this.J$1 = j;
                        this.label = 2;
                    }
                }
                if (C7Bq.A01(jMin, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return LocalBrowserSession.this.new C124571(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserSession$restartIdlePark$1", f = "LocalBrowserSession.kt", l = {283}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserSession$restartIdlePark$1, reason: invalid class name and case insensitive filesystem */
    public final class C124581 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C124581(HtJ<? super C124581> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserSession.this.new C124581(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(300000L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            LocalBrowserSession.this.park(LocalBrowserParkTrigger.IDLE);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return LocalBrowserSession.this.new C124581(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserSession$startParking$1", f = "LocalBrowserSession.kt", l = {256}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserSession$startParking$1, reason: invalid class name and case insensitive filesystem */
    public final class C124591 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C124591(HtJ<? super C124591> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserSession.this.new C124591(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q c20qA01 = GDB.A01(new LocalBrowserSession$startParking$1$invokeSuspend$$inlined$map$1(BrowserTaskRepository.Companion.getInstance(LocalBrowserSession.this.userSession).presentationUpdates(C3cH.A0b(LocalBrowserSession.this.task))));
                final LocalBrowserSession localBrowserSession = LocalBrowserSession.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.localbrowser.LocalBrowserSession.startParking.1.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((LocalBrowserParkTrigger) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(LocalBrowserParkTrigger localBrowserParkTrigger, HtJ<? super Unit> htJ) {
                        if (localBrowserParkTrigger != null) {
                            localBrowserSession.park(localBrowserParkTrigger);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c20qA01.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return LocalBrowserSession.this.new C124591(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserSession$startParking$2", f = "LocalBrowserSession.kt", l = {260}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserSession$startParking$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserSession$startParking$2$1", f = "LocalBrowserSession.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserSession$startParking$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0W<LocalBrowserTarget.HostLease, Integer, HtJ<? super Unit>, Object> {
            public int label;

            public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                super(3, htJ);
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(LocalBrowserTarget.HostLease hostLease, Integer num, HtJ<? super Unit> htJ) {
                num.intValue();
                return new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Unit.INSTANCE;
            }

            public final Object invoke(LocalBrowserTarget.HostLease hostLease, int i, HtJ<? super Unit> htJ) {
                return new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserSession.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LocalBrowserTarget localBrowserTarget = LocalBrowserSession.this.target;
                C60I c60iA03 = C3rb.A03(new AnonymousClass1(null), localBrowserTarget.currentHost, localBrowserTarget.previewWatchers);
                final LocalBrowserSession localBrowserSession = LocalBrowserSession.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.localbrowser.LocalBrowserSession.startParking.2.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((Unit) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                        if (LocalBrowserSession.updateParked$default(localBrowserSession, null, 1, null)) {
                            localBrowserSession.target.refreshAccess();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c60iA03.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return LocalBrowserSession.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserSession$updateParked$1", f = "LocalBrowserSession.kt", l = {321}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserSession$updateParked$1, reason: invalid class name and case insensitive filesystem */
    public final class C124601 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C124601(HtJ<? super C124601> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserSession.this.new C124601(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(10000L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            LocalBrowserSession localBrowserSession = LocalBrowserSession.this;
            if (localBrowserSession.holdingAvailability) {
                localBrowserSession.holdingAvailability = false;
                localBrowserSession.setAvailable(localBrowserSession.target.isHostAvailable());
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return LocalBrowserSession.this.new C124601(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public LocalBrowserSession(String str, AbstractC3358CGz abstractC3358CGz, LocalBrowserTarget localBrowserTarget, LocalBrowserTask localBrowserTask) {
        long controlEpoch;
        LocalBrowserControl control;
        AnonymousClass005.A10(str, abstractC3358CGz, localBrowserTarget);
        this.id = str;
        this.userSession = abstractC3358CGz;
        this.target = localBrowserTarget;
        this.task = localBrowserTask;
        if (localBrowserTask != null) {
            controlEpoch = localBrowserTask.getControlEpoch();
            control = localBrowserTask.getControl();
            if (control == null) {
            }
            C9286GCn c9286GCnA14 = C3cG.A14(new LocalBrowserFacts(controlEpoch, control, 1L, localBrowserTarget.isHostAvailable(), null));
            this.mutableFacts = c9286GCnA14;
            this.facts = C3cG.A11(c9286GCnA14);
            C9286GCn c9286GCnA142 = C3cG.A14(false);
            this.mutableAgentActive = c9286GCnA142;
            this.agentActive = C3cG.A11(c9286GCnA142);
            C9286GCn c9286GCnA143 = C3cG.A14(false);
            this.mutableParked = c9286GCnA143;
            this.parked = C3cG.A11(c9286GCnA143);
            this.scope = C3cH.A0y(C3cH.A0u(), new LocalBrowserSession$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this));
            LocalBrowserDialogs localBrowserDialogs = new LocalBrowserDialogs(this);
            this.dialogs = localBrowserDialogs;
            localBrowserTarget.bindDialogs(localBrowserDialogs);
            localBrowserTarget.bindUserInput(new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserSession$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    LocalBrowserSession localBrowserSession = this.f$0;
                    return Boolean.valueOf(localBrowserSession.acceptsUserInput(localBrowserSession.target.currentHost.getValue()));
                }
            }, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserSession$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(LocalBrowserSession._init_$lambda$1(this.f$0));
                }
            });
            localBrowserTarget.bindHostAvailability(new AnonymousClass3(this));
            localBrowserTarget.nativeUi.onRequired = new AnonymousClass4(this);
            localBrowserTarget.bindPopupEvents(new G0W() { // from class: com.facebook.aura.localbrowser.LocalBrowserSession$$ExternalSyntheticLambda2
                @Override // X.G0W
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return LocalBrowserSession._init_$lambda$2(this.f$0, (LocalBrowserPopupAction) obj, AnonymousClass001.A1X(obj2), AnonymousClass001.A1X(obj3));
                }
            });
            localBrowserTarget.bindBlockSignals(new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserSession$$ExternalSyntheticLambda3
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    return LocalBrowserSession._init_$lambda$3(this.f$0, (LocalBrowserBlockSignal) obj);
                }
            });
            localBrowserTarget.bindHeadless(new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserSession$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(LocalBrowserSession._init_$lambda$4(this.f$0));
                }
            });
        }
        controlEpoch = 1;
        control = LocalBrowserControl.AGENT;
        C9286GCn c9286GCnA144 = C3cG.A14(new LocalBrowserFacts(controlEpoch, control, 1L, localBrowserTarget.isHostAvailable(), null));
        this.mutableFacts = c9286GCnA144;
        this.facts = C3cG.A11(c9286GCnA144);
        C9286GCn c9286GCnA1422 = C3cG.A14(false);
        this.mutableAgentActive = c9286GCnA1422;
        this.agentActive = C3cG.A11(c9286GCnA1422);
        C9286GCn c9286GCnA1432 = C3cG.A14(false);
        this.mutableParked = c9286GCnA1432;
        this.parked = C3cG.A11(c9286GCnA1432);
        this.scope = C3cH.A0y(C3cH.A0u(), new LocalBrowserSession$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this));
        LocalBrowserDialogs localBrowserDialogs2 = new LocalBrowserDialogs(this);
        this.dialogs = localBrowserDialogs2;
        localBrowserTarget.bindDialogs(localBrowserDialogs2);
        localBrowserTarget.bindUserInput(new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserSession$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LocalBrowserSession localBrowserSession = this.f$0;
                return Boolean.valueOf(localBrowserSession.acceptsUserInput(localBrowserSession.target.currentHost.getValue()));
            }
        }, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserSession$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(LocalBrowserSession._init_$lambda$1(this.f$0));
            }
        });
        localBrowserTarget.bindHostAvailability(new AnonymousClass3(this));
        localBrowserTarget.nativeUi.onRequired = new AnonymousClass4(this);
        localBrowserTarget.bindPopupEvents(new G0W() { // from class: com.facebook.aura.localbrowser.LocalBrowserSession$$ExternalSyntheticLambda2
            @Override // X.G0W
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return LocalBrowserSession._init_$lambda$2(this.f$0, (LocalBrowserPopupAction) obj, AnonymousClass001.A1X(obj2), AnonymousClass001.A1X(obj3));
            }
        });
        localBrowserTarget.bindBlockSignals(new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserSession$$ExternalSyntheticLambda3
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return LocalBrowserSession._init_$lambda$3(this.f$0, (LocalBrowserBlockSignal) obj);
            }
        });
        localBrowserTarget.bindHeadless(new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserSession$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(LocalBrowserSession._init_$lambda$4(this.f$0));
            }
        });
    }

    public static final Unit _init_$lambda$3(LocalBrowserSession localBrowserSession, LocalBrowserBlockSignal localBrowserBlockSignal) {
        C7384Etj.A0Y(localBrowserBlockSignal, 1);
        LocalBrowserTask localBrowserTask = localBrowserSession.task;
        if (localBrowserTask != null && localBrowserTask.blockSignalSites.add(localBrowserBlockSignal.site)) {
            LocalBrowserTelemetry.INSTANCE.event("local_browser_block_signal", "detected", C3cH.A0n(HatchChatNotificationIds.PARAM_BROWSER_TASK_ID, localBrowserSession.task.id, C3cG.A0r(LocalBrowserNodeHandler.SITE, localBrowserBlockSignal.site), C3cG.A0r("vendor", localBrowserBlockSignal.vendor), C3cG.A0r(C60N.A00(7), String.valueOf(localBrowserBlockSignal.httpStatus))), null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requireUserAction(String str) {
        String str2 = str;
        checkMainThread();
        if (AnonymousClass002.A1Y(this.closeReason) && getControl() == LocalBrowserControl.AGENT && this.mutableFacts.getValue().userActionRequired == null) {
            LocalBrowserFacts value = this.mutableFacts.getValue();
            C3cJ.A0g(this, value.copy(value.controlRevision, value.control, value.pageRevision + 1, false, str2), this.mutableFacts);
            this.target.releaseUserInput();
            LocalBrowserTelemetry localBrowserTelemetry = LocalBrowserTelemetry.INSTANCE;
            C0924AIa c0924AIaA0u = C3cG.A0u();
            c0924AIaA0u.put("operation_id", this.id);
            C3cI.A1E(this, c0924AIaA0u);
            c0924AIaA0u.put("result", "user_action_required");
            if (!BFI.A0H(new String[]{"color", "file", "unknown"}).contains(str)) {
                str2 = DeviceSmsReaderKt.ATTACHMENT_OTHER;
            }
            c0924AIaA0u.put("reason", str2);
            localBrowserTelemetry.event("local_browser_control", "transition", AIW.A0K(c0924AIaA0u), null);
            recordInteraction();
        }
    }

    public final void applyTaskControl(long j, LocalBrowserControl localBrowserControl) {
        C7384Etj.A0Y(localBrowserControl, 1);
        checkMainThread();
        if (!AnonymousClass002.A1Y(this.closeReason) || j < this.mutableFacts.getValue().controlRevision) {
            return;
        }
        if (j != this.mutableFacts.getValue().controlRevision || localBrowserControl != getControl()) {
            this.target.fileChooser.cancel();
        }
        this.target.releaseUserInput();
        clearUserActionAfterTakeover(localBrowserControl);
        BLG<LocalBrowserFacts> blg = this.mutableFacts;
        LocalBrowserFacts value = blg.getValue();
        C3cJ.A0g(this, value.copy(j, localBrowserControl, value.pageRevision, value.available, value.userActionRequired), blg);
        refreshRendering();
    }

    public final void attach(LocalBrowserConnection localBrowserConnection) {
        C7384Etj.A0Y(localBrowserConnection, 0);
        checkMainThread();
        if (this.connection != null || !AnonymousClass002.A1Y(this.closeReason)) {
            throw C3cG.A0Q("Check failed.");
        }
        this.connection = localBrowserConnection;
    }

    public final void checkRendererAfterFailure(String str) {
        checkMainThread();
        if (("timeout".equals(str) || "unavailable".equals(str)) && AnonymousClass002.A1Y(this.closeReason) && getControl() == LocalBrowserControl.AGENT) {
            HoC hoC = this.rendererCheck;
            if (hoC == null || !hoC.isActive()) {
                long j = C3cI.A0G(this).controlRevision;
                LocalBrowserTask localBrowserTask = this.task;
                Long lValueOf = localBrowserTask != null ? Long.valueOf(localBrowserTask.connection.generation) : null;
                this.rendererCheck = AnonymousClass001.A11(new AnonymousClass1(j, this.target.page.state.getValue().document, lValueOf, null), this.scope);
            }
        }
    }

    public final boolean close(LocalBrowserCloseReason localBrowserCloseReason) {
        LocalBrowserConnection localBrowserConnection;
        C7384Etj.A0Y(localBrowserCloseReason, 0);
        checkMainThread();
        Boolean bool = this.retirementSucceeded;
        if (bool != null) {
            return bool.booleanValue();
        }
        this.closeReason = localBrowserCloseReason;
        Hxb.A03(null, this.scope);
        this.pendingHandBack = null;
        if (AnonymousClass003.A1Z(this.mutableParked)) {
            AnonymousClass003.A14(this.mutableParked, false);
            LocalBrowserRuntime.Companion.getInstance(this.userSession).resourceUsage.parked.stop();
        }
        setAgentActive(false);
        LocalBrowserTask localBrowserTask = this.task;
        if (localBrowserTask == null) {
            stopAutomation();
        } else {
            localBrowserTask.viewer.revokeInput();
            this.target.releaseUserInput();
            this.target.stopHeadless();
        }
        this.dialogs.close();
        LocalBrowserConnection localBrowserConnection2 = this.connection;
        if (localBrowserConnection2 != null) {
            localBrowserConnection2.fence();
        }
        boolean zRetire = this.target.retire();
        this.retirementSucceeded = Boolean.valueOf(zRetire);
        if (!this.target.isDestroyed || (localBrowserConnection = this.connection) == null) {
            return zRetire;
        }
        localBrowserConnection.destroyed();
        return zRetire;
    }

    public final void park(LocalBrowserParkTrigger localBrowserParkTrigger) {
        C7384Etj.A0Y(localBrowserParkTrigger, 0);
        checkMainThread();
        if (!AnonymousClass002.A1Y(this.closeReason) || this.task == null) {
            return;
        }
        this.parkRequest = localBrowserParkTrigger;
        if (updateParked(null)) {
            this.target.refreshAccess();
        }
    }

    public final void wake(LocalBrowserParkTrigger localBrowserParkTrigger) {
        C7384Etj.A0Y(localBrowserParkTrigger, 0);
        checkMainThread();
        if (!AnonymousClass002.A1Y(this.closeReason) || this.task == null) {
            return;
        }
        restartIdlePark();
        this.parkRequest = null;
        if (updateParked(localBrowserParkTrigger)) {
            this.target.refreshAccess();
        }
    }

    public static final boolean _init_$lambda$1(LocalBrowserSession localBrowserSession) {
        if (!AnonymousClass002.A1Y(localBrowserSession.closeReason) || localBrowserSession.getControl() != LocalBrowserControl.USER || !localBrowserSession.target.rendering.isReady()) {
            return false;
        }
        LocalBrowserTarget localBrowserTarget = localBrowserSession.target;
        if (!localBrowserTarget.rendering.isTakeover || !localBrowserTarget.isUserAutofillHost(localBrowserTarget.currentHost.getValue())) {
            return false;
        }
        LocalBrowserTask localBrowserTask = localBrowserSession.task;
        return localBrowserTask == null || localBrowserTask.viewer.allows(localBrowserSession.target.currentHost.getValue());
    }

    public static final Unit _init_$lambda$2(LocalBrowserSession localBrowserSession, LocalBrowserPopupAction localBrowserPopupAction, boolean z, boolean z2) {
        C7384Etj.A0Y(localBrowserPopupAction, 1);
        LocalBrowserTelemetry localBrowserTelemetry = LocalBrowserTelemetry.INSTANCE;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put("action", localBrowserPopupAction.getValue());
        C3cI.A1K("is_dialog", c0924AIaA0u, z);
        c0924AIaA0u.put(LocalBrowserNodeHandler.CONTROL, z2 ? "user" : "agent");
        C3cI.A1E(localBrowserSession, c0924AIaA0u);
        Unit unit = Unit.INSTANCE;
        localBrowserTelemetry.event("local_browser_popup", "outcome", AIW.A0K(c0924AIaA0u), null);
        return unit;
    }

    public static final boolean _init_$lambda$4(LocalBrowserSession localBrowserSession) {
        return (!AnonymousClass002.A1Y(localBrowserSession.closeReason) || localBrowserSession.getControl() == LocalBrowserControl.STOPPED || localBrowserSession.target.rendering.isTakeover || AnonymousClass003.A1Z(localBrowserSession.mutableParked)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isHandBackCurrent(long j) {
        return AnonymousClass002.A1Y(this.closeReason) && getControl() == LocalBrowserControl.USER && this.mutableFacts.getValue().controlRevision == j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishControl(LocalBrowserControl localBrowserControl) {
        this.pendingHandBack = C3cI.A15(this.pendingHandBack);
        clearUserActionAfterTakeover(localBrowserControl);
        LocalBrowserFacts value = this.mutableFacts.getValue();
        C3cJ.A0g(this, value.copy(value.controlRevision + 1, localBrowserControl, value.pageRevision, value.available, value.userActionRequired), this.mutableFacts);
        refreshRendering();
    }

    private final void restartIdlePark() {
        HtJ htJA13 = AnonymousClass006.A13(this.idlePark);
        this.idlePark = AnonymousClass001.A11(new C124581(htJA13), this.scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAgentActive(boolean z) {
        AnonymousClass004.A1D(z, this.mutableAgentActive);
        updateBackgroundWork();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBackgroundWork() {
        BackgroundWorkClaim backgroundWorkClaimClaimBackgroundWork;
        if (AnonymousClass002.A1Y(this.closeReason) && this.task == null && AnonymousClass003.A1Z(this.mutableAgentActive)) {
            backgroundWorkClaimClaimBackgroundWork = this.backgroundWork;
            if (backgroundWorkClaimClaimBackgroundWork == null) {
                backgroundWorkClaimClaimBackgroundWork = LocalBrowserRuntime.Companion.getInstance(this.userSession).resourceUsage.claimBackgroundWork(this.userSession, LocalBrowserBackgroundWorkKt.localBrowserBackgroundWorkContent(null, null, null, null, null, false, false));
            }
        } else {
            BackgroundWorkClaim backgroundWorkClaim = this.backgroundWork;
            if (backgroundWorkClaim != null) {
                backgroundWorkClaim.release();
            }
            backgroundWorkClaimClaimBackgroundWork = null;
        }
        this.backgroundWork = backgroundWorkClaimClaimBackgroundWork;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean updateParked(com.facebook.aura.localbrowser.LocalBrowserParkTrigger r9) {
        /*
            r8 = this;
            com.facebook.aura.localbrowser.LocalBrowserParkTrigger r7 = r8.parkRequest
            com.facebook.aura.localbrowser.LocalBrowserTarget r0 = r8.target
            com.facebook.aura.localbrowser.LocalBrowserRendering r0 = r0.rendering
            boolean r4 = r0.isTakeover
            com.facebook.aura.localbrowser.LocalBrowserCloseReason r0 = r8.closeReason
            boolean r0 = X.AnonymousClass002.A1Y(r0)
            r2 = 0
            r6 = 1
            if (r0 == 0) goto L1b
            if (r7 == 0) goto L1b
            boolean r0 = r8.isViewed()
            r5 = 1
            if (r0 == 0) goto L1c
        L1b:
            r5 = 0
        L1c:
            X.BLG<java.lang.Boolean> r0 = r8.mutableParked
            boolean r0 = X.AnonymousClass003.A1Z(r0)
            if (r0 != r5) goto L25
            return r2
        L25:
            X.BLG<java.lang.Boolean> r1 = r8.mutableParked
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            X.GCn r1 = (X.C9286GCn) r1
            r3 = 0
            X.C9286GCn.A00(r3, r0, r1)
            if (r7 != 0) goto La8
            if (r9 != 0) goto L37
            com.facebook.aura.localbrowser.LocalBrowserParkTrigger r9 = com.facebook.aura.localbrowser.LocalBrowserParkTrigger.COMMAND
        L37:
            com.facebook.aura.localbrowser.LocalBrowserRuntime$Companion r1 = com.facebook.aura.localbrowser.LocalBrowserRuntime.Companion
            X.CGz r0 = r8.userSession
            com.facebook.aura.localbrowser.LocalBrowserRuntime r0 = r1.getInstance(r0)
            com.facebook.aura.localbrowser.LocalBrowserResourceUsage r1 = r0.resourceUsage
            X.HoC r0 = r8.availabilityHoldExpiry
            if (r0 == 0) goto L48
            r0.A5w(r3)
        L48:
            com.facebook.aura.localbrowser.LocalBrowserUsageMeter r0 = r1.parked
            if (r5 == 0) goto L8e
            r0.start()
            r8.unparkedAtMs = r3
            boolean r0 = r8.holdingAvailability
            if (r0 != 0) goto L61
            X.BLG<com.facebook.aura.localbrowser.LocalBrowserFacts> r0 = r8.mutableFacts
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.localbrowser.LocalBrowserFacts r0 = (com.facebook.aura.localbrowser.LocalBrowserFacts) r0
            boolean r0 = r0.available
            if (r0 == 0) goto L62
        L61:
            r2 = 1
        L62:
            r8.holdingAvailability = r2
        L64:
            com.facebook.aura.localbrowser.LocalBrowserTelemetry r4 = com.facebook.aura.localbrowser.LocalBrowserTelemetry.INSTANCE
            X.AIa r2 = X.C3cG.A0u()
            if (r5 == 0) goto L8b
            java.lang.String r1 = "parked"
        L6e:
            java.lang.String r0 = "action"
            r2.put(r0, r1)
            java.lang.String r1 = X.AnonymousClass006.A0x(r9)
            java.lang.String r0 = "trigger"
            r2.put(r0, r1)
            X.C3cI.A1E(r8, r2)
            X.AIa r2 = X.AIW.A0K(r2)
            java.lang.String r1 = "local_browser_park"
            java.lang.String r0 = "transition"
            r4.event(r1, r0, r2, r3)
            return r6
        L8b:
            java.lang.String r1 = "unparked"
            goto L6e
        L8e:
            r0.stop()
            r1.recordUnpark()
            java.lang.Long r0 = X.C3cI.A0O()
            r8.unparkedAtMs = r0
            X.3UX r1 = r8.scope
            com.facebook.aura.localbrowser.LocalBrowserSession$updateParked$1 r0 = new com.facebook.aura.localbrowser.LocalBrowserSession$updateParked$1
            r0.<init>(r3)
            X.Hqc r0 = X.AnonymousClass001.A11(r0, r1)
            r8.availabilityHoldExpiry = r0
            goto L64
        La8:
            if (r5 == 0) goto Lac
            r9 = r7
            goto L37
        Lac:
            if (r4 == 0) goto Lb1
            com.facebook.aura.localbrowser.LocalBrowserParkTrigger r9 = com.facebook.aura.localbrowser.LocalBrowserParkTrigger.TAKEOVER
            goto L37
        Lb1:
            com.facebook.aura.localbrowser.LocalBrowserParkTrigger r9 = com.facebook.aura.localbrowser.LocalBrowserParkTrigger.VIEW
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserSession.updateParked(com.facebook.aura.localbrowser.LocalBrowserParkTrigger):boolean");
    }

    public static /* synthetic */ boolean updateParked$default(LocalBrowserSession localBrowserSession, LocalBrowserParkTrigger localBrowserParkTrigger, int i, Object obj) {
        if ((i & 1) != 0) {
            localBrowserParkTrigger = null;
        }
        return localBrowserSession.updateParked(localBrowserParkTrigger);
    }

    public final boolean acceptsUserInput(LocalBrowserTarget.HostLease hostLease) {
        if (!AnonymousClass002.A1Y(this.closeReason) || getControl() != LocalBrowserControl.USER || !this.target.rendering.isReady()) {
            return false;
        }
        LocalBrowserTarget localBrowserTarget = this.target;
        if (!localBrowserTarget.rendering.isTakeover || !localBrowserTarget.isUserHost(hostLease)) {
            return false;
        }
        LocalBrowserTask localBrowserTask = this.task;
        return localBrowserTask == null || localBrowserTask.viewer.allows(hostLease);
    }

    public final Map<String, String> diagnostics() {
        Map<String, String> mapDiagnostics = this.target.diagnostics();
        HxE hxEA0r = C3cG.A0r("page_revision", String.valueOf(C3cI.A0G(this).pageRevision));
        boolean z = false;
        HxE hxEA0r2 = C3cG.A0r("page_available", String.valueOf(C3cI.A0G(this).available));
        HxE hxEA0r3 = C3cG.A0r(LocalBrowserNodeHandler.CONTROL, AnonymousClass006.A0x(getControl()));
        LocalBrowserConnection localBrowserConnection = this.connection;
        if (localBrowserConnection != null && localBrowserConnection.isReady()) {
            z = true;
        }
        return AGH.A02(mapDiagnostics, C3cH.A0n("connection_ready", String.valueOf(z), hxEA0r, hxEA0r2, hxEA0r3));
    }

    public final C1BN<Boolean> getAgentActive() {
        return this.agentActive;
    }

    public final LocalBrowserCloseReason getCloseReason() {
        return this.closeReason;
    }

    public final LocalBrowserConnection getConnection() {
        return this.connection;
    }

    public final LocalBrowserControl getControl() {
        return this.mutableFacts.getValue().control;
    }

    public final LocalBrowserDialogs getDialogs() {
        return this.dialogs;
    }

    public final C1BN<LocalBrowserFacts> getFacts() {
        return this.facts;
    }

    public final String getId() {
        return this.id;
    }

    public final C1BN<Boolean> getParked() {
        return this.parked;
    }

    public final C3UX getScope() {
        return this.scope;
    }

    public final LocalBrowserTarget getTarget() {
        return this.target;
    }

    public final LocalBrowserTask getTask() {
        return this.task;
    }

    public final AbstractC3358CGz getUserSession() {
        return this.userSession;
    }

    public final void handBack(LocalBrowserTarget.HostLease hostLease) {
        if (hostLease == null || this.target.currentHost.getValue() != hostLease) {
            return;
        }
        handBack();
    }

    public final boolean isOpen() {
        return AnonymousClass002.A1Y(this.closeReason);
    }

    public final boolean isTaskFinished() {
        return AbstractC0878AGe.A0k(LocalBrowserSessionKt.FINISHED_PARK_TRIGGERS, this.parkRequest);
    }

    public final boolean isViewed() {
        LocalBrowserTarget localBrowserTarget = this.target;
        if (!localBrowserTarget.rendering.isTakeover) {
            LocalBrowserTarget.HostLease value = localBrowserTarget.currentHost.getValue();
            if ((value != null ? value.kind : null) != LocalBrowserHostKind.PRESENTATION && AnonymousClass001.A0F(this.target.previewWatchers.getValue()) <= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void refreshRendering() {
        /*
            r3 = this;
            com.facebook.aura.localbrowser.LocalBrowserTarget r2 = r3.target
            com.facebook.aura.localbrowser.LocalBrowserCloseReason r0 = r3.closeReason
            boolean r0 = X.AnonymousClass002.A1Y(r0)
            if (r0 == 0) goto L58
            com.facebook.aura.localbrowser.LocalBrowserControl r1 = r3.getControl()
            com.facebook.aura.localbrowser.LocalBrowserControl r0 = com.facebook.aura.localbrowser.LocalBrowserControl.USER
            if (r1 != r0) goto L58
            com.facebook.aura.localbrowser.LocalBrowserTarget r1 = r3.target
            X.1BN<com.facebook.aura.localbrowser.LocalBrowserTarget$HostLease> r0 = r1.currentHost
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.localbrowser.LocalBrowserTarget$HostLease r0 = (com.facebook.aura.localbrowser.LocalBrowserTarget.HostLease) r0
            boolean r0 = r1.isUserHost(r0)
            if (r0 != 0) goto L34
            com.facebook.aura.localbrowser.LocalBrowserTarget r0 = r3.target
            com.facebook.aura.localbrowser.LocalBrowserFileChooser r1 = r0.fileChooser
            X.1BN<com.facebook.aura.localbrowser.LocalBrowserTarget$HostLease> r0 = r0.currentHost
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.localbrowser.LocalBrowserTarget$HostLease r0 = (com.facebook.aura.localbrowser.LocalBrowserTarget.HostLease) r0
            boolean r0 = r1.holds(r0)
            if (r0 == 0) goto L58
        L34:
            com.facebook.aura.localbrowser.LocalBrowserTask r0 = r3.task
            if (r0 == 0) goto L4a
            com.facebook.aura.localbrowser.LocalBrowserTaskControl r1 = r0.viewer
            com.facebook.aura.localbrowser.LocalBrowserTarget r0 = r3.target
            X.1BN<com.facebook.aura.localbrowser.LocalBrowserTarget$HostLease> r0 = r0.currentHost
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.localbrowser.LocalBrowserTarget$HostLease r0 = (com.facebook.aura.localbrowser.LocalBrowserTarget.HostLease) r0
            boolean r0 = r1.allows(r0)
            if (r0 == 0) goto L58
        L4a:
            r0 = 1
        L4b:
            r2.requestTakeover(r0)
            r0 = 0
            r3.updateParked(r0)
            com.facebook.aura.localbrowser.LocalBrowserTarget r0 = r3.target
            r0.refreshAccess()
            return
        L58:
            r0 = 0
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserSession.refreshRendering():void");
    }

    private final void checkMainThread() {
        if (!C3cH.A1K()) {
            throw C3cG.A0Q("Check failed.");
        }
    }

    private final void clearUserActionAfterTakeover(LocalBrowserControl localBrowserControl) {
        if (getControl() == LocalBrowserControl.USER && localBrowserControl == LocalBrowserControl.AGENT) {
            this.target.nativeUi.reset();
            BLG<LocalBrowserFacts> blg = this.mutableFacts;
            LocalBrowserFacts value = blg.getValue();
            blg.Af8(value.copy(value.controlRevision, value.control, value.pageRevision, value.available, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setAvailable(boolean r12) {
        /*
            r11 = this;
            r11.checkMainThread()
            r1 = 0
            if (r12 == 0) goto L4d
            r11.holdingAvailability = r1
            java.lang.Long r0 = r11.unparkedAtMs
            if (r0 == 0) goto L21
            long r3 = r0.longValue()
            com.facebook.aura.localbrowser.LocalBrowserRuntime$Companion r1 = com.facebook.aura.localbrowser.LocalBrowserRuntime.Companion
            X.CGz r0 = r11.userSession
            com.facebook.aura.localbrowser.LocalBrowserRuntime r0 = r1.getInstance(r0)
            com.facebook.aura.localbrowser.LocalBrowserResourceUsage r2 = r0.resourceUsage
            long r0 = X.C3cG.A04(r3)
            r2.recordUnparkReady(r0)
        L21:
            r0 = 0
            r11.unparkedAtMs = r0
        L24:
            X.BLG<com.facebook.aura.localbrowser.LocalBrowserFacts> r0 = r11.mutableFacts
            java.lang.Object r3 = r0.getValue()
            com.facebook.aura.localbrowser.LocalBrowserFacts r3 = (com.facebook.aura.localbrowser.LocalBrowserFacts) r3
            if (r12 == 0) goto L33
            java.lang.String r0 = r3.userActionRequired
            r9 = 1
            if (r0 == 0) goto L34
        L33:
            r9 = 0
        L34:
            boolean r0 = r3.available
            if (r0 == r9) goto L4c
            X.BLG<com.facebook.aura.localbrowser.LocalBrowserFacts> r2 = r11.mutableFacts
            long r7 = r3.pageRevision
            r0 = 1
            long r7 = r7 + r0
            long r4 = r3.controlRevision
            com.facebook.aura.localbrowser.LocalBrowserControl r6 = r3.control
            java.lang.String r10 = r3.userActionRequired
            com.facebook.aura.localbrowser.LocalBrowserFacts r0 = r3.copy(r4, r6, r7, r9, r10)
            X.C3cJ.A0g(r11, r0, r2)
        L4c:
            return
        L4d:
            boolean r0 = r11.holdingAvailability
            if (r0 == 0) goto L24
            com.facebook.aura.localbrowser.LocalBrowserTarget r0 = r11.target
            boolean r0 = r0.isHostBlocked()
            if (r0 == 0) goto L4c
            r11.holdingAvailability = r1
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserSession.setAvailable(boolean):void");
    }

    public final void markAgentActivity() {
        checkMainThread();
        if (AnonymousClass002.A1Y(this.closeReason)) {
            if (this.task != null) {
                restartIdlePark();
            }
            setAgentActive(true);
            HtJ htJA13 = AnonymousClass006.A13(this.agentIdle);
            this.agentIdle = AnonymousClass001.A11(new C124561(htJA13), this.scope);
        }
    }

    public final void recordInteraction() {
        checkMainThread();
        if (AnonymousClass002.A1Y(this.closeReason)) {
            this.lastActivityMs = SystemClock.elapsedRealtime();
            HoC hoC = this.idleClose;
            if (hoC == null || !hoC.isActive()) {
                this.idleClose = AnonymousClass001.A11(new C124571(null), this.scope);
            }
        }
    }

    public final void revokeAuthority() {
        checkMainThread();
        this.target.fileChooser.cancel();
        this.target.releaseUserInput();
        if (this.task == null) {
            publishControl(getControl());
            return;
        }
        LocalBrowserFacts value = this.mutableFacts.getValue();
        C3cJ.A0g(this, value.copy(value.controlRevision, value.control, value.pageRevision + 1, value.available, value.userActionRequired), this.mutableFacts);
    }

    public final void startParking() {
        checkMainThread();
        if (!AnonymousClass002.A1Y(this.closeReason) || this.task == null) {
            return;
        }
        C3UX c3ux = this.scope;
        C124591 c124591 = new C124591(null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, c124591, c3ux);
        GAo.A02(num, c6ys, new AnonymousClass2(null), this.scope);
        restartIdlePark();
    }

    public final void stopAutomation() {
        checkMainThread();
        this.target.releaseUserInput();
        this.target.stopHeadless();
        LocalBrowserTask localBrowserTask = this.task;
        if (localBrowserTask != null) {
            localBrowserTask.viewer.stop();
            return;
        }
        LocalBrowserControl control = getControl();
        LocalBrowserControl localBrowserControl = LocalBrowserControl.STOPPED;
        if (control != localBrowserControl) {
            publishControl(localBrowserControl);
        }
    }

    public final boolean takeControl(LocalBrowserTarget.HostLease hostLease) {
        checkMainThread();
        if (!AnonymousClass002.A1Y(this.closeReason) || getControl() == LocalBrowserControl.STOPPED || !this.target.isUserHost(hostLease)) {
            return false;
        }
        LocalBrowserTask localBrowserTask = this.task;
        if (localBrowserTask != null) {
            return localBrowserTask.viewer.allows(hostLease);
        }
        publishControl(LocalBrowserControl.USER);
        return true;
    }

    public final void updateNativeUiState() {
        checkMainThread();
        this.target.nativeUi.dispatchPending();
    }

    public /* synthetic */ LocalBrowserSession(String str, AbstractC3358CGz abstractC3358CGz, LocalBrowserTarget localBrowserTarget, LocalBrowserTask localBrowserTask, int i, C06H c06h) {
        this(str, abstractC3358CGz, localBrowserTarget, (i & 8) != 0 ? null : localBrowserTask);
    }

    public final void handBack() {
        checkMainThread();
        this.target.fileChooser.cancel();
        LocalBrowserTask localBrowserTask = this.task;
        if (localBrowserTask != null) {
            localBrowserTask.viewer.release();
            return;
        }
        if (!AnonymousClass002.A1Y(this.closeReason) || getControl() != LocalBrowserControl.USER) {
            return;
        }
        HoC hoC = this.pendingHandBack;
        if (hoC != null && hoC.isActive()) {
            return;
        }
        long j = this.mutableFacts.getValue().controlRevision;
        this.target.releaseUserInput();
        this.target.prepareAutomationViewport();
        this.pendingHandBack = AnonymousClass001.A11(new C124551(j, null), this.scope);
    }
}
