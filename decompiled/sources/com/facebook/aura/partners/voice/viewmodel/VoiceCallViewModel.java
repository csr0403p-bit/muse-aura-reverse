package com.facebook.aura.partners.voice.viewmodel;

import X.AEs;
import X.AEu;
import X.AbstractC05633ui;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass441;
import X.BLG;
import X.BLL;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3Ej;
import X.C3Ek;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C3rb;
import X.C60I;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.G0W;
import X.GDB;
import X.HtJ;
import X.HwB;
import X.Hwg;
import android.content.Context;
import android.view.Surface;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.model.AvatarStatusVideos;
import com.facebook.aura.partners.voice.api.VoiceCallManager;
import com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider;
import com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import com.facebook.aura.partners.voice.intf.CaptionEntry;
import com.facebook.aura.partners.voice.intf.VoiceCallControlLoggingKt;
import com.facebook.aura.partners.voice.intf.VoiceCallPhase;
import com.facebook.aura.partners.voice.intf.VoiceCallStart;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoiceCallUiState;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentStillHandoff;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentStillHandoffKt;
import com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent;
import com.facebook.aura.partners.voice.prefs.VoiceAvatarExpandedView;
import com.facebook.aura.partners.voice.prefs.VoicePrefs;
import com.facebook.aura.partners.voice.runtime.VoiceCallSessionOwner;
import com.facebook.aura.partners.voice.viewmodel.VoiceCaptionScreen;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceCallViewModel extends AEs {
    public static final int $stable = 8;
    public final C1BN<Boolean> avatarEmbodimentCompatible;
    public final C1BN<CallIdleSelection> callIdleSelection;
    public final VoiceCallManager callManager;
    public final C1BN<VoiceCallUiState> callStateFlow;
    public final C1BN<AvatarStatusVideos> callStatusVideos;
    public final C1BN<String> callThread;
    public final C1BN<Boolean> embodimentReady;
    public final C1BN<Integer> embodimentReadyGeneration;
    public final C1BN<Boolean> isCallBackdropDark;
    public final C1BN<Boolean> isCallEmbodimentDark;
    public final C1BN<Boolean> isCaptionsEnabled;
    public final C1BN<Boolean> isTabRootCaptionVisible;
    public final C1BN<VoiceAvatarExpandedView> rememberedAvatarSize;
    public final VoiceCallSessionOwner sessionOwner;
    public final BLG<Integer> startedStillHosts;
    public final C1BN<VoiceEmbodimentStillHandoff> stillHandoff;
    public final C1BN<VoiceCallUiState> uiState;
    public final AbstractC3358CGz userSession;
    public final C1BN<Float> userSpeechLevel;
    public final VoiceCallStateHolder voiceCallStateHolder;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel$1", f = "VoiceCallViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0W<Boolean, Integer, HtJ<? super Boolean>, Object> {
        public /* synthetic */ int I$0;
        public /* synthetic */ boolean Z$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(3, htJ);
        }

        public final Object invoke(boolean z, int i, HtJ<? super Boolean> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.Z$0 = z;
            anonymousClass1.I$0 = i;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r2 = r3.Z$0
                int r1 = r3.I$0
                int r0 = r3.label
                if (r0 != 0) goto L16
                X.Hwg.A00(r4)
                if (r2 == 0) goto L10
                r0 = 1
                if (r1 > 0) goto L11
            L10:
                r0 = 0
            L11:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L16:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Integer num, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A1X(bool), AnonymousClass001.A0F(num), htJ);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<VoiceStillHandoffEvent.Failed, Unit> {
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(VoiceStillHandoffEvent.Failed failed) {
            C7384Etj.A0Y(failed, 0);
            VoiceCallViewModel.this.applyStillHandoffEvent("watchdog_fired", failed);
        }

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(VoiceStillHandoffEvent.Failed failed) {
            invoke2(failed);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<VoiceStillHandoffEvent.Retry, Unit> {
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(VoiceStillHandoffEvent.Retry retry) {
            C7384Etj.A0Y(retry, 0);
            VoiceCallViewModel.this.applyStillHandoffEvent("retried", retry);
        }

        public AnonymousClass3() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(VoiceStillHandoffEvent.Retry retry) {
            invoke2(retry);
            return Unit.INSTANCE;
        }
    }

    public final class Factory extends AuraViewModelFactory<VoiceCallViewModel> {
        public static final int $stable = 8;
        public final Context context;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public VoiceCallViewModel create() {
            return new VoiceCallViewModel(this.context, this.userSession);
        }

        public Factory(Context context, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(context, abstractC3358CGz);
            this.context = context;
            this.userSession = abstractC3358CGz;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel$applyStillHandoffEvent$1, reason: invalid class name and case insensitive filesystem */
    public final class C133361 extends AbstractC7559F3s implements G0U<VoiceEmbodimentStillHandoff, VoiceEmbodimentStillHandoff> {
        public final /* synthetic */ VoiceStillHandoffEvent $event;

        /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel$applyStillHandoffEvent$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03261 extends AbstractC7559F3s implements Function0<Boolean> {
            public static final C03261 INSTANCE = new C03261();

            public C03261() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(VoiceGating.INSTANCE.isLiveAvatarUpdateEnabled());
            }
        }

        @Override // X.G0U
        public final VoiceEmbodimentStillHandoff invoke(VoiceEmbodimentStillHandoff voiceEmbodimentStillHandoff) {
            C7384Etj.A0Y(voiceEmbodimentStillHandoff, 0);
            VoiceStillHandoffEvent voiceStillHandoffEvent = this.$event;
            if (voiceStillHandoffEvent instanceof VoiceStillHandoffEvent.Target) {
                VoiceStillHandoffEvent.Target target = (VoiceStillHandoffEvent.Target) voiceStillHandoffEvent;
                return voiceEmbodimentStillHandoff.target(target.getCallGeneration(), target.still, target.stillKey, C03261.INSTANCE);
            }
            if (voiceStillHandoffEvent instanceof VoiceStillHandoffEvent.Decoded) {
                VoiceStillHandoffEvent.Decoded decoded = (VoiceStillHandoffEvent.Decoded) voiceStillHandoffEvent;
                return voiceEmbodimentStillHandoff.decoded(decoded.getCallGeneration(), decoded.stillKey);
            }
            if (voiceStillHandoffEvent instanceof VoiceStillHandoffEvent.Failed) {
                VoiceStillHandoffEvent.Failed failed = (VoiceStillHandoffEvent.Failed) voiceStillHandoffEvent;
                return voiceEmbodimentStillHandoff.failed(failed.getCallGeneration(), failed.stillKey, failed.attempt);
            }
            if (!(voiceStillHandoffEvent instanceof VoiceStillHandoffEvent.Retry)) {
                throw C3cG.A0q();
            }
            VoiceStillHandoffEvent.Retry retry = (VoiceStillHandoffEvent.Retry) voiceStillHandoffEvent;
            return voiceEmbodimentStillHandoff.retried(retry.getCallGeneration(), retry.stillKey);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133361(VoiceStillHandoffEvent voiceStillHandoffEvent) {
            super(1);
            this.$event = voiceStillHandoffEvent;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel$isCallBackdropDark$1", f = "VoiceCallViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel$isCallBackdropDark$1, reason: invalid class name and case insensitive filesystem */
    public final class C133371 extends AbstractC07127nr implements G0W<Boolean, Boolean, HtJ<? super Boolean>, Object> {
        public /* synthetic */ boolean Z$0;
        public /* synthetic */ boolean Z$1;
        public int label;

        public C133371(HtJ<? super C133371> htJ) {
            super(3, htJ);
        }

        public final Object invoke(boolean z, boolean z2, HtJ<? super Boolean> htJ) {
            C133371 c133371 = new C133371(htJ);
            c133371.Z$0 = z;
            c133371.Z$1 = z2;
            return c133371.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r2 = r3.Z$0
                boolean r1 = r3.Z$1
                int r0 = r3.label
                if (r0 != 0) goto L16
                X.Hwg.A00(r4)
                if (r2 == 0) goto L10
                r0 = 1
                if (r1 != 0) goto L11
            L10:
                r0 = 0
            L11:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L16:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel.C133371.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel$tabRootCaptionVisibility$2", f = "VoiceCallViewModel.kt", l = {233, 236, 238, 242}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel$tabRootCaptionVisibility$2, reason: invalid class name and case insensitive filesystem */
    public final class C133382 extends AbstractC07127nr implements G0W<C20Z<? super Boolean>, CaptionEntry, HtJ<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel$tabRootCaptionVisibility$2$1", f = "VoiceCallViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel$tabRootCaptionVisibility$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
            public /* synthetic */ boolean Z$0;
            public int label;

            public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.Z$0 = AnonymousClass001.A1X(obj);
                return anonymousClass1;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return C3cG.A0P(z);
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
                return invoke(AnonymousClass001.A1X(bool), htJ);
            }

            public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
                return ((AnonymousClass1) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel$tabRootCaptionVisibility$2$2", f = "VoiceCallViewModel.kt", l = {239}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel$tabRootCaptionVisibility$2$2, reason: invalid class name and collision with other inner class name */
        public final class C03272 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
            public int label;
            public final /* synthetic */ VoiceCallViewModel this$0;

            @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel$tabRootCaptionVisibility$2$2$1", f = "VoiceCallViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel$tabRootCaptionVisibility$2$2$1, reason: invalid class name */
            public final class AnonymousClass1 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
                public /* synthetic */ boolean Z$0;
                public int label;

                public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                    super(2, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                    anonymousClass1.Z$0 = AnonymousClass001.A1X(obj);
                    return anonymousClass1;
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    boolean z = this.Z$0;
                    if (this.label == 0) {
                        return AnonymousClass001.A0k(obj, z);
                    }
                    throw AnonymousClass001.A0n();
                }

                @Override // X.G0V
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
                    return invoke(AnonymousClass001.A1X(bool), htJ);
                }

                public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
                    return ((AnonymousClass1) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03272(VoiceCallViewModel voiceCallViewModel, HtJ<? super C03272> htJ) {
                super(2, htJ);
                this.this$0 = voiceCallViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C03272(this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    C1BN<Boolean> c1bn = this.this$0.voiceCallStateHolder.isBotSpeaking;
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
            public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
                return new C03272(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C133382(HtJ<? super C133382> htJ) {
            super(3, htJ);
        }

        @Override // X.G0W
        public final Object invoke(C20Z<? super Boolean> c20z, CaptionEntry captionEntry, HtJ<? super Unit> htJ) {
            C133382 c133382 = VoiceCallViewModel.this.new C133382(htJ);
            c133382.L$0 = c20z;
            c133382.L$1 = captionEntry;
            return c133382.invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006b -> B:25:0x0071). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r7 = r9.L$0
                X.20Z r7 = (X.C20Z) r7
                java.lang.Object r2 = r9.L$1
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r9.label
                r5 = 0
                r4 = 4
                r8 = 3
                r3 = 2
                r1 = 1
                if (r0 == 0) goto L1f
                if (r0 == r1) goto L37
                if (r0 == r3) goto L55
                if (r0 == r8) goto L6e
                if (r0 != r4) goto L84
                X.Hwg.A00(r10)
            L1c:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L1f:
                X.Hwg.A00(r10)
                boolean r0 = X.AnonymousClass002.A1X(r2)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r9.L$0 = r7
                r9.L$1 = r2
                r9.label = r1
                java.lang.Object r0 = r7.emit(r0, r9)
                if (r0 != r6) goto L3a
                return r6
            L37:
                X.Hwg.A00(r10)
            L3a:
                if (r2 != 0) goto L3d
                goto L1c
            L3d:
                com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel r0 = com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel.this
                com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r0 = r0.voiceCallStateHolder
                X.1BN<java.lang.Boolean> r1 = r0.isBotSpeaking
                com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel$tabRootCaptionVisibility$2$1 r0 = new com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel$tabRootCaptionVisibility$2$1
                r0.<init>(r5)
                r9.L$0 = r7
                r9.L$1 = r5
                r9.label = r3
                java.lang.Object r0 = X.AbstractC9777Gfy.A00(r9, r0, r1)
                if (r0 != r6) goto L58
                return r6
            L55:
                X.Hwg.A00(r10)
            L58:
                com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel r0 = com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel.this
                com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel$tabRootCaptionVisibility$2$2 r2 = new com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel$tabRootCaptionVisibility$2$2
                r2.<init>(r0, r5)
                r9.L$0 = r7
                r9.L$1 = r5
                r9.label = r8
                r0 = 4000(0xfa0, double:1.9763E-320)
                java.lang.Object r10 = X.GAX.A01(r9, r2, r0)
                if (r10 != r6) goto L71
                return r6
            L6e:
                X.Hwg.A00(r10)
            L71:
                if (r10 != 0) goto L3d
                java.lang.Boolean r0 = X.AnonymousClass001.A0h()
                r9.L$0 = r5
                r9.L$1 = r5
                r9.label = r4
                java.lang.Object r0 = r7.emit(r0, r9)
                if (r0 != r6) goto L1c
                return r6
            L84:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel.C133382.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final Integer attachEmbodimentSurface(Surface surface, int i, int i2) {
        C7384Etj.A0Y(surface, 0);
        VoiceCallManager voiceCallManager = this.callManager;
        if (voiceCallManager != null) {
            return voiceCallManager.attachEmbodimentSurface(surface, i, i2);
        }
        return null;
    }

    public final void detachEmbodimentSurface(Surface surface) {
        C7384Etj.A0Y(surface, 0);
        VoiceCallManager voiceCallManager = this.callManager;
        if (voiceCallManager != null) {
            voiceCallManager.detachEmbodimentSurface(surface);
        }
    }

    public final boolean isCaptionSurface(VoiceCaptionScreen voiceCaptionScreen, String str) {
        C7384Etj.A0Y(voiceCaptionScreen, 0);
        if (!voiceCaptionScreen.equals(VoiceCaptionScreen.Hidden.INSTANCE)) {
            if (!voiceCaptionScreen.equals(VoiceCaptionScreen.TabRoot.INSTANCE)) {
                if (!(voiceCaptionScreen instanceof VoiceCaptionScreen.Conversation)) {
                    throw C3cG.A0q();
                }
                if (!C7384Etj.areEqual(((VoiceCaptionScreen.Conversation) voiceCaptionScreen).thread, str)) {
                }
            }
            return true;
        }
        return false;
    }

    public final void onAvatarSizeUsed(VoiceAvatarExpandedView voiceAvatarExpandedView) {
        C7384Etj.A0Y(voiceAvatarExpandedView, 0);
        VoicePrefs.INSTANCE.setAvatarExpandedView(this.userSession, voiceAvatarExpandedView);
    }

    public final void onStillHandoffEvent(VoiceStillHandoffEvent voiceStillHandoffEvent) {
        String str;
        C7384Etj.A0Y(voiceStillHandoffEvent, 0);
        if (voiceStillHandoffEvent instanceof VoiceStillHandoffEvent.Target) {
            str = "target";
        } else if (voiceStillHandoffEvent instanceof VoiceStillHandoffEvent.Decoded) {
            str = "decoded";
        } else if (voiceStillHandoffEvent instanceof VoiceStillHandoffEvent.Failed) {
            str = "failed";
        } else {
            if (!(voiceStillHandoffEvent instanceof VoiceStillHandoffEvent.Retry)) {
                throw C3cG.A0q();
            }
            str = "retried";
        }
        applyStillHandoffEvent(str, voiceStillHandoffEvent);
    }

    public final void resizeEmbodimentSurface(Surface surface, int i, int i2) {
        C7384Etj.A0Y(surface, 0);
        VoiceCallManager voiceCallManager = this.callManager;
        if (voiceCallManager != null) {
            voiceCallManager.resizeEmbodimentSurface(surface, i, i2);
        }
    }

    public final void startCall(VoiceCallStart voiceCallStart) {
        C7384Etj.A0Y(voiceCallStart, 0);
        VoiceCallManager voiceCallManager = this.callManager;
        if (voiceCallManager == null || this.uiState.getValue().phase != VoiceCallPhase.ENDED) {
            return;
        }
        voiceCallManager.startCall(null, null, voiceCallStart.entryPoint, voiceCallStart.attribution, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VoiceCallViewModel(Context context, AbstractC3358CGz abstractC3358CGz) {
        C1BN<VoiceCallUiState> c1bnA14;
        C1BN<Integer> embodimentReadyGeneration;
        C1BN<Boolean> embodimentReady;
        C1BN<Float> userSpeechLevel;
        boolean zA1b = AnonymousClass004.A1b(context, abstractC3358CGz);
        this.userSession = abstractC3358CGz;
        VoiceCallSessionOwner companion = VoiceCallSessionOwner.Companion.getInstance(abstractC3358CGz);
        this.sessionOwner = companion;
        VoiceCallManager voiceCallManagerAcquire = companion.acquire(context, abstractC3358CGz);
        this.callManager = voiceCallManagerAcquire;
        if (voiceCallManagerAcquire == null || (c1bnA14 = voiceCallManagerAcquire.getCallState()) == null) {
            long j = 0;
            c1bnA14 = C3cG.A14(new VoiceCallUiState(null, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, zA1b, zA1b, zA1b, zA1b, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, j, zA1b ? 1 : 0, zA1b, 0 == true ? 1 : 0, 131071, 0 == true ? 1 : 0));
        }
        this.callStateFlow = c1bnA14;
        this.uiState = c1bnA14;
        C20Q c20qA01 = GDB.A01(new VoiceCallViewModel$special$$inlined$map$1(c1bnA14));
        BLL bllA00 = AEu.A00(this);
        C3Ej c3Ej = C3Ek.A00;
        this.isCaptionsEnabled = AnonymousClass441.A00(Boolean.valueOf(c1bnA14.getValue().isCaptionsEnabled), bllA00, c20qA01, c3Ej);
        VoiceCallStateHolder voiceCallStateHolderA0K = C3cG.A0K(abstractC3358CGz);
        this.voiceCallStateHolder = voiceCallStateHolderA0K;
        HatchAvatarReferenceImageProvider.Companion companion2 = HatchAvatarReferenceImageProvider.Companion;
        C1BN<Boolean> c1bn = companion2.getInstance(abstractC3358CGz).isCallEmbodimentDark;
        this.isCallEmbodimentDark = c1bn;
        C60I c60iA03 = C3rb.A03(new C133371(null), voiceCallStateHolderA0K.isCallActive, c1bn);
        BLL bllA002 = AEu.A00(this);
        Boolean boolValueOf = Boolean.valueOf(zA1b);
        this.isCallBackdropDark = AnonymousClass441.A00(boolValueOf, bllA002, c60iA03, c3Ej);
        this.callIdleSelection = AnonymousClass441.A00(null, AEu.A00(this), GDB.A01(new VoiceCallViewModel$special$$inlined$map$3(new HwB(new CallIdleState(null, null, null), new VoiceCallViewModel$callIdleSelection$4(null), C3rb.A01(new VoiceCallViewModel$callIdleSelection$3(null), new VoiceCallViewModel$special$$inlined$map$2(HatchVoiceVideoConfigStore.Companion.getInstance(abstractC3358CGz).presentation), companion2.getInstance(abstractC3358CGz).readyCallIdle, companion2.getInstance(abstractC3358CGz).idlePosters.posters, C3rb.A00(VoiceCallViewModel$callIdleSelection$2.INSTANCE, voiceCallStateHolderA0K.isCallActive, voiceCallStateHolderA0K.embodimentMedia, c1bn))))), c3Ej);
        this.avatarEmbodimentCompatible = voiceCallStateHolderA0K.avatarEmbodimentCompatible;
        this.callStatusVideos = voiceCallStateHolderA0K.callStatusVideos;
        C1BN<VoiceEmbodimentStillHandoff> c1bn2 = voiceCallStateHolderA0K.stillHandoff;
        this.stillHandoff = c1bn2;
        VoicePrefs voicePrefs = VoicePrefs.INSTANCE;
        this.rememberedAvatarSize = AnonymousClass441.A00(voicePrefs.getAvatarExpandedView(abstractC3358CGz), AEu.A00(this), voicePrefs.observeAvatarExpandedView(abstractC3358CGz), c3Ej);
        this.callThread = AnonymousClass441.A00(VoiceCallViewModelKt.conversationThread(C3cG.A0c(voiceCallStateHolderA0K)), AEu.A00(this), GDB.A01(new VoiceCallViewModel$special$$inlined$map$4(voiceCallStateHolderA0K.activeThreadId)), c3Ej);
        C9286GCn c9286GCnA14 = C3cG.A14(Integer.valueOf(zA1b ? 1 : 0));
        this.startedStillHosts = c9286GCnA14;
        VoiceEmbodimentStillHandoffKt.launchStillHandoffTimers(AEu.A00(this), c1bn2, C3rb.A03(new AnonymousClass1(null), voiceCallStateHolderA0K.isCallActive, c9286GCnA14), new AnonymousClass2(), new AnonymousClass3());
        this.isTabRootCaptionVisible = AnonymousClass441.A00(boolValueOf, AEu.A00(this), GDB.A01(AbstractC05633ui.A00(new VoiceCallViewModel$special$$inlined$flatMapLatest$1(null, this), GDB.A01(new VoiceCallViewModel$special$$inlined$map$5(voiceCallStateHolderA0K.isCallActive)))), c3Ej);
        this.userSpeechLevel = (voiceCallManagerAcquire == null || (userSpeechLevel = voiceCallManagerAcquire.getUserSpeechLevel()) == null) ? C3cG.A14(AnonymousClass005.A0a()) : userSpeechLevel;
        this.embodimentReady = (voiceCallManagerAcquire == null || (embodimentReady = voiceCallManagerAcquire.getEmbodimentReady()) == null) ? C3cG.A14(boolValueOf) : embodimentReady;
        this.embodimentReadyGeneration = (voiceCallManagerAcquire == null || (embodimentReadyGeneration = voiceCallManagerAcquire.getEmbodimentReadyGeneration()) == null) ? C3cG.A13() : embodimentReadyGeneration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void applyStillHandoffEvent(java.lang.String r6, com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent r7) {
        /*
            r5 = this;
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r0 = r5.voiceCallStateHolder
            X.1BN<com.facebook.aura.partners.voice.intf.VoiceEmbodimentStillHandoff> r0 = r0.stillHandoff
            java.lang.Object r4 = r0.getValue()
            com.facebook.aura.partners.voice.intf.VoiceEmbodimentStillHandoff r4 = (com.facebook.aura.partners.voice.intf.VoiceEmbodimentStillHandoff) r4
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r1 = r5.voiceCallStateHolder
            com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel$applyStillHandoffEvent$1 r0 = new com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel$applyStillHandoffEvent$1
            r0.<init>(r7)
            r1.updateStillHandoff(r0)
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r0 = r5.voiceCallStateHolder
            X.1BN<com.facebook.aura.partners.voice.intf.VoiceEmbodimentStillHandoff> r0 = r0.stillHandoff
            java.lang.Object r3 = r0.getValue()
            com.facebook.aura.partners.voice.intf.VoiceEmbodimentStillHandoff r3 = (com.facebook.aura.partners.voice.intf.VoiceEmbodimentStillHandoff) r3
            boolean r2 = r7 instanceof com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent.Target
            if (r2 == 0) goto L2e
            r0 = r7
            com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent$Target r0 = (com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent.Target) r0
            com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia$StaticAvatar r0 = r0.still
            if (r0 != 0) goto L2e
            com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia$StaticAvatar r0 = r3.incoming
            r1 = 1
            if (r0 != 0) goto L2f
        L2e:
            r1 = 0
        L2f:
            boolean r0 = X.C7384Etj.areEqual(r3, r4)
            if (r0 == 0) goto L37
            if (r1 == 0) goto L44
        L37:
            if (r2 == 0) goto L45
            com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent$Target r7 = (com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent.Target) r7
            java.lang.String r0 = r7.stillKey
        L3d:
            if (r1 == 0) goto L41
            java.lang.String r6 = "target_hidden"
        L41:
            com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModelKt.logStillHandoff(r6, r0, r4, r3)
        L44:
            return
        L45:
            boolean r0 = r7 instanceof com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent.Decoded
            if (r0 == 0) goto L4e
            com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent$Decoded r7 = (com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent.Decoded) r7
            java.lang.String r0 = r7.stillKey
            goto L3d
        L4e:
            boolean r0 = r7 instanceof com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent.Failed
            if (r0 == 0) goto L57
            com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent$Failed r7 = (com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent.Failed) r7
            java.lang.String r0 = r7.stillKey
            goto L3d
        L57:
            boolean r0 = r7 instanceof com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent.Retry
            if (r0 == 0) goto L60
            com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent$Retry r7 = (com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent.Retry) r7
            java.lang.String r0 = r7.stillKey
            goto L3d
        L60:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel.applyStillHandoffEvent(java.lang.String, com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent):void");
    }

    public static /* synthetic */ void isTabRootCaptionVisible$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C20Q<Boolean> tabRootCaptionVisibility() {
        return AbstractC05633ui.A00(new C133382(null), GDB.A01(new VoiceCallViewModel$tabRootCaptionVisibility$$inlined$map$1(this.callStateFlow)));
    }

    public final void endCall() {
        VoiceCallManager voiceCallManager = this.callManager;
        if (voiceCallManager != null) {
            voiceCallManager.endCall();
        }
    }

    public final C1BN<Boolean> getAvatarEmbodimentCompatible() {
        return this.avatarEmbodimentCompatible;
    }

    public final C1BN<CallIdleSelection> getCallIdleSelection() {
        return this.callIdleSelection;
    }

    public final C1BN<AvatarStatusVideos> getCallStatusVideos() {
        return this.callStatusVideos;
    }

    public final C1BN<String> getCallThread() {
        return this.callThread;
    }

    public final C1BN<Boolean> getEmbodimentReady() {
        return this.embodimentReady;
    }

    public final C1BN<Integer> getEmbodimentReadyGeneration() {
        return this.embodimentReadyGeneration;
    }

    public final C1BN<VoiceAvatarExpandedView> getRememberedAvatarSize() {
        return this.rememberedAvatarSize;
    }

    public final C1BN<VoiceEmbodimentStillHandoff> getStillHandoff() {
        return this.stillHandoff;
    }

    public final C1BN<VoiceCallUiState> getUiState() {
        return this.uiState;
    }

    public final C1BN<Float> getUserSpeechLevel() {
        return this.userSpeechLevel;
    }

    public final C1BN<Boolean> isCallBackdropDark() {
        return this.isCallBackdropDark;
    }

    public final C1BN<Boolean> isCallEmbodimentDark() {
        return this.isCallEmbodimentDark;
    }

    public final C1BN<Boolean> isCaptionsEnabled() {
        return this.isCaptionsEnabled;
    }

    public final C1BN<Boolean> isTabRootCaptionVisible() {
        return this.isTabRootCaptionVisible;
    }

    @Override // X.AEs
    public void onCleared() {
        VoiceCallManager voiceCallManager = this.callManager;
        if (voiceCallManager != null) {
            this.sessionOwner.release(voiceCallManager);
        }
    }

    public final void onStillHostStarted() {
        while (!C3cJ.A11(this.startedStillHosts)) {
        }
    }

    public final void onStillHostStopped() {
        Integer value;
        int iA0F;
        BLG<Integer> blg = this.startedStillHosts;
        do {
            value = blg.getValue();
            iA0F = AnonymousClass001.A0F(value) - 1;
            if (iA0F < 0) {
                iA0F = 0;
            }
        } while (!blg.A6e(value, Integer.valueOf(iA0F)));
    }

    public final void toggleCaptions() {
        VoiceCallManager voiceCallManager = this.callManager;
        if (voiceCallManager != null) {
            VoiceCallControlLoggingKt.logCallControlToggle(VoiceCallStateHolder.Companion.getInstance(this.userSession), !C3cH.A1R(this.isCaptionsEnabled), HatchComponent.CAPTIONS_BUTTON);
            voiceCallManager.toggleCaptions();
        }
    }

    public final void toggleMute() {
        VoiceCallManager voiceCallManager = this.callManager;
        if (voiceCallManager != null) {
            voiceCallManager.toggleMute();
        }
    }

    public final void toggleSpeaker() {
        VoiceCallManager voiceCallManager = this.callManager;
        if (voiceCallManager != null) {
            voiceCallManager.toggleSpeaker();
        }
    }
}
