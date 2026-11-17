package com.facebook.aura.partners.voice.ui;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C7Bq;
import X.C8j4;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzR;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaControllerEvent;
import com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaEvent;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class VoiceEmbodimentMediaController {
    public static final int $stable = 8;
    public boolean closed;
    public final Function0<Long> elapsedRealtimeMs;
    public HoC eventLoopJob;
    public final HzR<VoiceEmbodimentMediaControllerEvent> events;
    public final VoiceEmbodimentMediaReducerState initialState;
    public VoiceEmbodimentMediaControllerInput input;
    public VoiceEmbodimentMediaControllerInput lastQueuedInput;
    public boolean lifecycleResumed;
    public final AtomicLong pendingRtcFrameAtMs;
    public boolean rtcEverPainted;
    public final AtomicBoolean rtcFrameSignalQueued;
    public long rtcLastFrameAtMs;
    public final C3UX scope;
    public final MutableState state$delegate;
    public boolean stillPainted;
    public int timerGeneration;
    public HoC timerJob;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaController$schedule$1", f = "VoiceEmbodimentMediaReducer.kt", l = {965}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaController$schedule$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ int $generation;
        public final /* synthetic */ long $nowMs;
        public final /* synthetic */ Long $wakeAtMs;
        public int label;
        public final /* synthetic */ VoiceEmbodimentMediaController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Long l, long j, VoiceEmbodimentMediaController voiceEmbodimentMediaController, int i, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$wakeAtMs = l;
            this.$nowMs = j;
            this.this$0 = voiceEmbodimentMediaController;
            this.$generation = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$wakeAtMs, this.$nowMs, this.this$0, this.$generation, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                long jLongValue = this.$wakeAtMs.longValue() - this.$nowMs;
                if (jLongValue < 0) {
                    jLongValue = 0;
                }
                this.label = 1;
                if (C7Bq.A01(jLongValue, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            this.this$0.events.AhZ(new VoiceEmbodimentMediaControllerEvent.Wake(this.$generation));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaController$start$1", f = "VoiceEmbodimentMediaReducer.kt", l = {811}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaController$start$1, reason: invalid class name and case insensitive filesystem */
    public final class C133311 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public C133311(HtJ<? super C133311> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceEmbodimentMediaController.this.new C133311(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return VoiceEmbodimentMediaController.this.new C133311(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:6:0x0010). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r11.label
                r3 = 1
                if (r0 == 0) goto L2c
                if (r0 != r3) goto L45
                java.lang.Object r2 = r11.L$0
                X.GCW r2 = (X.GCW) r2
                X.Hwg.A00(r12)
            L10:
                boolean r0 = X.AnonymousClass001.A1X(r12)
                if (r0 == 0) goto L42
                java.lang.Object r1 = r2.A00()
                com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaControllerEvent r1 = (com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaControllerEvent) r1
                com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaController r0 = com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaController.this
                com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaController.access$handle(r0, r1)
            L21:
                r11.L$0 = r2
                r11.label = r3
                java.lang.Object r12 = r2.A01(r11)
                if (r12 != r4) goto L10
                return r4
            L2c:
                X.Hwg.A00(r12)
                com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaController r5 = com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaController.this
                r9 = 3
                r6 = 0
                r7 = 0
                r10 = r6
                com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaController.reduceAndSchedule$default(r5, r6, r7, r9, r10)
                com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaController r0 = com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaController.this
                X.HzR<com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaControllerEvent> r0 = r0.events
                X.GCW r2 = r0.APO()
                goto L21
            L42:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            L45:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaController.C133311.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0062 A[PHI: r19
  0x0062: PHI (r19v4 java.lang.Long) = (r19v1 java.lang.Long), (r19v0 java.lang.Long) binds: [B:14:0x0060, B:12:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068 A[PHI: r19
  0x0068: PHI (r19v3 java.lang.Long) = (r19v1 java.lang.Long), (r19v4 java.lang.Long) binds: [B:14:0x0060, B:16:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VoiceEmbodimentMediaController(com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaControllerInput r40, boolean r41, X.C3UX r42, kotlin.jvm.functions.Function0<java.lang.Long> r43) {
        /*
            r39 = this;
            r5 = 0
            r2 = r40
            r0 = r42
            r6 = r43
            X.AnonymousClass005.A11(r2, r0, r6, r5)
            r4 = r39
            r4.<init>()
            r4.scope = r0
            r4.elapsedRealtimeMs = r6
            r4.input = r2
            r4.lastQueuedInput = r2
            r0 = r41
            r4.lifecycleResumed = r0
            boolean r0 = r2.rtcEverPaintedInCall
            r4.rtcEverPainted = r0
            r12 = 0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>(r12)
            r4.pendingRtcFrameAtMs = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r5)
            r4.rtcFrameSignalQueued = r0
            r3 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
            X.GCV r0 = new X.GCV
            r0.<init>(r1, r3)
            r4.events = r0
            long r10 = X.C8j4.A0Q(r6)
            long r0 = r2.botOutputInactiveAtMs
            long r6 = r2.outputTailHoldMs
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r8 >= 0) goto L48
            r6 = 0
        L48:
            long r8 = r0 + r6
            java.lang.Long r19 = java.lang.Long.valueOf(r8)
            boolean r7 = r2.videoStateSwapEnabled
            if (r7 == 0) goto L5e
            boolean r6 = r2.isBotOutputActive
            if (r6 != 0) goto L5e
            int r6 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r6 <= 0) goto L5e
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 > 0) goto L62
        L5e:
            r19 = r3
            if (r7 == 0) goto L68
        L62:
            boolean r0 = r2.isBotOutputActive
            r16 = 1
            if (r0 != 0) goto L6a
        L68:
            r16 = 0
        L6a:
            long r0 = r2.botOutputActivityGeneration
            if (r7 == 0) goto Lb6
            boolean r2 = r2.isBotOutputActive
            if (r2 != 0) goto L74
            if (r19 == 0) goto Lb6
        L74:
            r20 = 1
        L76:
            com.facebook.aura.partners.voice.ui.EmbodimentClipKind r11 = com.facebook.aura.partners.voice.ui.EmbodimentClipKind.NONE
            r15 = 1
            X.A3q r33 = X.A3q.A00
            com.facebook.aura.partners.voice.ui.VoiceEmbodimentPresentationTarget r38 = com.facebook.aura.partners.voice.ui.VoiceEmbodimentPresentationTarget.FALLBACK
            com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaReducerState r10 = new com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaReducerState
            r14 = r11
            r21 = r3
            r22 = r5
            r23 = r5
            r24 = r5
            r25 = r12
            r27 = r5
            r28 = r5
            r29 = r5
            r30 = r3
            r31 = r3
            r32 = r5
            r34 = r5
            r35 = r3
            r36 = r5
            r37 = r3
            r39 = r5
            r40 = r5
            r41 = r5
            r42 = r5
            r43 = r3
            r17 = r0
            r10.<init>(r11, r12, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r4.initialState = r10
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.AbstractC1798ArH.A06(r10)
            r4.state$delegate = r0
            return
        Lb6:
            r20 = 0
            goto L76
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaController.<init>(com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaControllerInput, boolean, X.3UX, kotlin.jvm.functions.Function0):void");
    }

    private final void schedule(Long l, long j) {
        int i = this.timerGeneration + 1;
        this.timerGeneration = i;
        HoC hoC = this.timerJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.timerJob = null;
        if (l != null) {
            this.timerJob = AnonymousClass001.A11(new AnonymousClass1(l, j, this, i, null), this.scope);
        }
    }

    public final void close() {
        this.closed = true;
        this.timerGeneration++;
        HoC hoC = this.timerJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.timerJob = null;
        HoC hoC2 = this.eventLoopJob;
        if (hoC2 != null) {
            hoC2.A5w(null);
        }
        this.eventLoopJob = null;
        this.events.A6R(null);
    }

    public final void onActivityFailed(EmbodimentClip embodimentClip, int i) {
        C7384Etj.A0Y(embodimentClip, 0);
        this.events.AhZ(new VoiceEmbodimentMediaControllerEvent.ActivityFailed(embodimentClip, i));
    }

    public final void onActivityFramePainted(EmbodimentClip embodimentClip, int i) {
        C7384Etj.A0Y(embodimentClip, 0);
        this.events.AhZ(new VoiceEmbodimentMediaControllerEvent.ActivityFramePainted(embodimentClip, i));
    }

    public final void onStillPainted(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.events.AhZ(new VoiceEmbodimentMediaControllerEvent.StillPainted(str, z));
    }

    public final void updateInput(VoiceEmbodimentMediaControllerInput voiceEmbodimentMediaControllerInput) {
        C7384Etj.A0Y(voiceEmbodimentMediaControllerInput, 0);
        if (voiceEmbodimentMediaControllerInput.equals(this.lastQueuedInput)) {
            return;
        }
        this.lastQueuedInput = voiceEmbodimentMediaControllerInput;
        this.events.AhZ(new VoiceEmbodimentMediaControllerEvent.InputsChanged(voiceEmbodimentMediaControllerInput));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handle(VoiceEmbodimentMediaControllerEvent voiceEmbodimentMediaControllerEvent) {
        VoiceEmbodimentMediaEvent activityFailed;
        boolean z = true;
        boolean z2 = false;
        if (voiceEmbodimentMediaControllerEvent instanceof VoiceEmbodimentMediaControllerEvent.InputsChanged) {
            VoiceEmbodimentMediaControllerInput voiceEmbodimentMediaControllerInputCopy$default = ((VoiceEmbodimentMediaControllerEvent.InputsChanged) voiceEmbodimentMediaControllerEvent).input;
            if (C7384Etj.areEqual(voiceEmbodimentMediaControllerInputCopy$default, this.input)) {
                return;
            }
            boolean z3 = voiceEmbodimentMediaControllerInputCopy$default.rtcReady;
            VoiceEmbodimentMediaControllerInput voiceEmbodimentMediaControllerInput = this.input;
            if (z3 != voiceEmbodimentMediaControllerInput.rtcReady) {
                this.rtcLastFrameAtMs = 0L;
            }
            if (!this.rtcEverPainted && !voiceEmbodimentMediaControllerInputCopy$default.rtcEverPaintedInCall) {
                z = false;
            }
            this.rtcEverPainted = z;
            if (!C7384Etj.areEqual(voiceEmbodimentMediaControllerInputCopy$default.stillKey, voiceEmbodimentMediaControllerInput.stillKey)) {
                this.stillPainted = false;
                voiceEmbodimentMediaControllerInputCopy$default = VoiceEmbodimentMediaControllerInput.copy$default(voiceEmbodimentMediaControllerInputCopy$default, null, null, null, false, false, null, false, false, false, false, false, false, false, 0L, 0L, 0L, 0L, 130943, null);
            }
            this.input = voiceEmbodimentMediaControllerInputCopy$default;
        } else if (voiceEmbodimentMediaControllerEvent instanceof VoiceEmbodimentMediaControllerEvent.LifecycleChanged) {
            boolean z4 = this.lifecycleResumed;
            boolean z5 = ((VoiceEmbodimentMediaControllerEvent.LifecycleChanged) voiceEmbodimentMediaControllerEvent).resumed;
            if (z4 == z5) {
                return;
            } else {
                this.lifecycleResumed = z5;
            }
        } else {
            if (C7384Etj.areEqual(voiceEmbodimentMediaControllerEvent, VoiceEmbodimentMediaControllerEvent.RtcFramePainted.INSTANCE)) {
                this.rtcFrameSignalQueued.set(false);
                if (this.input.rtcReady) {
                    long j = this.pendingRtcFrameAtMs.get();
                    long jA0Q = C8j4.A0Q(this.elapsedRealtimeMs);
                    long j2 = this.rtcLastFrameAtMs;
                    if (j2 > 0 && jA0Q - j2 <= 1000) {
                        z2 = true;
                    }
                    boolean z6 = this.rtcEverPainted;
                    this.rtcLastFrameAtMs = j;
                    this.rtcEverPainted = true;
                    if (z6 && z2) {
                        return;
                    }
                    reduceAndSchedule(VoiceEmbodimentMediaEvent.InputsChanged.INSTANCE, jA0Q);
                    return;
                }
                return;
            }
            if (!(voiceEmbodimentMediaControllerEvent instanceof VoiceEmbodimentMediaControllerEvent.StillPainted)) {
                if (voiceEmbodimentMediaControllerEvent instanceof VoiceEmbodimentMediaControllerEvent.ActivityFramePainted) {
                    VoiceEmbodimentMediaControllerEvent.ActivityFramePainted activityFramePainted = (VoiceEmbodimentMediaControllerEvent.ActivityFramePainted) voiceEmbodimentMediaControllerEvent;
                    activityFailed = new VoiceEmbodimentMediaEvent.ActivityFramePainted(activityFramePainted.clip, activityFramePainted.loadGeneration);
                } else {
                    if (!(voiceEmbodimentMediaControllerEvent instanceof VoiceEmbodimentMediaControllerEvent.ActivityFailed)) {
                        if (!(voiceEmbodimentMediaControllerEvent instanceof VoiceEmbodimentMediaControllerEvent.Wake)) {
                            throw C3cG.A0q();
                        }
                        if (((VoiceEmbodimentMediaControllerEvent.Wake) voiceEmbodimentMediaControllerEvent).timerGeneration == this.timerGeneration) {
                            this.timerJob = null;
                            reduceAndSchedule(VoiceEmbodimentMediaEvent.InputsChanged.INSTANCE, C8j4.A0Q(this.elapsedRealtimeMs));
                            return;
                        }
                        return;
                    }
                    VoiceEmbodimentMediaControllerEvent.ActivityFailed activityFailed2 = (VoiceEmbodimentMediaControllerEvent.ActivityFailed) voiceEmbodimentMediaControllerEvent;
                    activityFailed = new VoiceEmbodimentMediaEvent.ActivityFailed(activityFailed2.clip, activityFailed2.loadGeneration);
                }
                reduceAndSchedule(activityFailed, C8j4.A0Q(this.elapsedRealtimeMs));
                return;
            }
            VoiceEmbodimentMediaControllerEvent.StillPainted stillPainted = (VoiceEmbodimentMediaControllerEvent.StillPainted) voiceEmbodimentMediaControllerEvent;
            if (!C7384Etj.areEqual(stillPainted.stillKey, this.input.stillKey)) {
                return;
            }
            boolean z7 = this.stillPainted;
            boolean z8 = stillPainted.painted;
            if (z7 == z8) {
                return;
            } else {
                this.stillPainted = z8;
            }
        }
        reduceAndSchedule(VoiceEmbodimentMediaEvent.InputsChanged.INSTANCE, C8j4.A0Q(this.elapsedRealtimeMs));
    }

    private final void reduceAndSchedule(VoiceEmbodimentMediaEvent voiceEmbodimentMediaEvent, long j) {
        if (this.closed) {
            return;
        }
        setState(VoiceEmbodimentMediaReducer.INSTANCE.reduce(getState(), reducerInput(j), voiceEmbodimentMediaEvent));
        schedule(getState().nextWakeAtMs, j);
    }

    public static /* synthetic */ void reduceAndSchedule$default(VoiceEmbodimentMediaController voiceEmbodimentMediaController, VoiceEmbodimentMediaEvent voiceEmbodimentMediaEvent, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            voiceEmbodimentMediaEvent = VoiceEmbodimentMediaEvent.InputsChanged.INSTANCE;
        }
        if ((i & 2) != 0) {
            j = C8j4.A0Q(voiceEmbodimentMediaController.elapsedRealtimeMs);
        }
        voiceEmbodimentMediaController.reduceAndSchedule(voiceEmbodimentMediaEvent, j);
    }

    private final VoiceEmbodimentMediaReducerInput reducerInput(long j) {
        VoiceEmbodimentMediaControllerInput voiceEmbodimentMediaControllerInput = this.input;
        return new VoiceEmbodimentMediaReducerInput(voiceEmbodimentMediaControllerInput.activityStatus, j, voiceEmbodimentMediaControllerInput.activityClip, voiceEmbodimentMediaControllerInput.generatedIdleClip, this.lifecycleResumed, AnonymousClass002.A1X(voiceEmbodimentMediaControllerInput.stillKey), new VoiceEmbodimentPaintedFlags(voiceEmbodimentMediaControllerInput.rtcReady, this.rtcLastFrameAtMs, this.rtcEverPainted, this.stillPainted, voiceEmbodimentMediaControllerInput.rtcFullyOpaque, voiceEmbodimentMediaControllerInput.stillFullyOpaque, voiceEmbodimentMediaControllerInput.activityCoverReady), voiceEmbodimentMediaControllerInput.liveRtcEnabled, voiceEmbodimentMediaControllerInput.videoStateSwapEnabled, voiceEmbodimentMediaControllerInput.isBotSpeaking, voiceEmbodimentMediaControllerInput.isBotOutputActive, voiceEmbodimentMediaControllerInput.botOutputActivityGeneration, voiceEmbodimentMediaControllerInput.botOutputInactiveAtMs, voiceEmbodimentMediaControllerInput.workingEntryDwellMs, voiceEmbodimentMediaControllerInput.outputTailHoldMs);
    }

    private final void setState(VoiceEmbodimentMediaReducerState voiceEmbodimentMediaReducerState) {
        this.state$delegate.Af8(voiceEmbodimentMediaReducerState);
    }

    public final VoiceEmbodimentMediaReducerState getState() {
        return (VoiceEmbodimentMediaReducerState) this.state$delegate.getValue();
    }

    public final void onRtcFramePainted() {
        this.pendingRtcFrameAtMs.set(C8j4.A0Q(this.elapsedRealtimeMs));
        if (C3cI.A1W(this.rtcFrameSignalQueued)) {
            this.events.AhZ(VoiceEmbodimentMediaControllerEvent.RtcFramePainted.INSTANCE);
        }
    }

    public final void setLifecycleResumed(boolean z) {
        this.events.AhZ(new VoiceEmbodimentMediaControllerEvent.LifecycleChanged(z));
    }

    public final void start() {
        if (this.closed || this.eventLoopJob != null) {
            return;
        }
        C3UX c3ux = this.scope;
        this.eventLoopJob = GAo.A02(C79.A0K, C6ys.A00, new C133311(null), c3ux);
    }
}
