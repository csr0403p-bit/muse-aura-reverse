package com.facebook.aura.partners.voice.infra;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass602;
import X.C06H;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzC;
import X.HzP;
import X.InterfaceC7549F2g;
import android.os.SystemClock;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.common.coroutines.LazyStartSingleFlightImpl;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import com.facebook.aura.partners.voice.intf.Voice;
import com.facebook.aura.partners.voice.prefs.VoicePrefs;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class VoiceAnnouncementRepository implements InterfaceC7549F2g {
    public static final long ACCOUNT_CHECK_TIMEOUT_MS = 15000;
    public static final long CONNECT_TIMEOUT_MS = 30000;
    public static final Companion Companion = new Companion();
    public static final long DUE_CHECK_TIMEOUT_MS = 3000;
    public static final long MIN_TIME_AWAY_MS = 300000;
    public static final String TAG = "VoiceAnnouncementRepository";
    public final SingleFlight accountSync;
    public Long backgroundedAtMs;
    public boolean isForegroundFresh;
    public final C3UX scope;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$1", f = "VoiceAnnouncementRepository.kt", l = {44}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceAnnouncementRepository.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                VoiceAnnouncementRepository$1$invokeSuspend$$inlined$filter$1 voiceAnnouncementRepository$1$invokeSuspend$$inlined$filter$1 = new VoiceAnnouncementRepository$1$invokeSuspend$$inlined$filter$1(AnonymousClass602.A00(AuraAppLifecycleManager.isAppInForegroundFlow));
                final VoiceAnnouncementRepository voiceAnnouncementRepository = VoiceAnnouncementRepository.this;
                C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository.1.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        voiceAnnouncementRepository.backgroundedAtMs = C3cG.A0S(SystemClock.elapsedRealtime());
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (voiceAnnouncementRepository$1$invokeSuspend$$inlined$filter$1.collect(c20z, this) == enumC10460Hji) {
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
            return VoiceAnnouncementRepository.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$isDue$2", f = "VoiceAnnouncementRepository.kt", l = {71}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$isDue$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceAnnouncementRepository.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            boolean z = false;
            if (i == 0) {
                Hwg.A00(obj);
                VoicePrefs voicePrefs = VoicePrefs.INSTANCE;
                boolean zHasSeenVoiceAnnouncement = voicePrefs.hasSeenVoiceAnnouncement(VoiceAnnouncementRepository.this.userSession);
                AbstractC3358CGz abstractC3358CGz = VoiceAnnouncementRepository.this.userSession;
                if (zHasSeenVoiceAnnouncement) {
                    if (!voicePrefs.isVoiceAnnouncementSyncedToAccount(abstractC3358CGz)) {
                        VoiceAnnouncementRepository.this.syncSeenToAccount();
                    }
                } else if (!voicePrefs.hasSeenVoiceNux(abstractC3358CGz) && Voice.INSTANCE.isCallSupported(VoiceAnnouncementRepository.this.userSession)) {
                    VoiceGating voiceGating = VoiceGating.INSTANCE;
                    if (voiceGating.isVoiceAnnouncementFlowOn() && (!voiceGating.isVoiceAnnouncementControlWithoutLogging() || !voicePrefs.hasVoiceAnnouncementControlExposure(VoiceAnnouncementRepository.this.userSession))) {
                        VoiceAnnouncementRepository voiceAnnouncementRepository = VoiceAnnouncementRepository.this;
                        this.label = 1;
                        obj = voiceAnnouncementRepository.isDueOnAccount(this);
                        if (obj == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (AnonymousClass001.A1X(obj)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return VoiceAnnouncementRepository.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository", f = "VoiceAnnouncementRepository.kt", l = {AuraWaitlistConfettiKt.StandardParticleCount, SelfieSnapshotKt.SELFIE_JPEG_QUALITY}, m = "isDueOnAccount", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$isDueOnAccount$1, reason: invalid class name and case insensitive filesystem */
    public final class C131121 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C131121(HtJ<? super C131121> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceAnnouncementRepository.this.isDueOnAccount(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$isDueOnAccount$2", f = "VoiceAnnouncementRepository.kt", l = {97, 98}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$isDueOnAccount$2, reason: invalid class name and case insensitive filesystem */
    public final class C131132 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        public C131132(HtJ<? super C131132> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C131132 c131132 = VoiceAnnouncementRepository.this.new C131132(htJ);
            c131132.L$0 = obj;
            return c131132;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r2 = r8.L$0
                X.3UX r2 = (X.C3UX) r2
                X.Hji r7 = X.EnumC10460Hji.A02
                int r0 = r8.label
                r6 = 0
                r5 = 2
                r4 = 1
                if (r0 == 0) goto L20
                if (r0 == r4) goto L46
                if (r0 != r5) goto L61
                X.Hwg.A00(r9)
            L14:
                boolean r0 = X.AnonymousClass001.A1X(r9)
                if (r0 == 0) goto L1b
                r6 = 1
            L1b:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
                return r0
            L20:
                X.Hwg.A00(r9)
                com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository r1 = com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository.this
                r3 = 0
                com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$isDueOnAccount$2$dueOnServer$1 r0 = new com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$isDueOnAccount$2$dueOnServer$1
                r0.<init>(r1, r3)
                X.Hrx r2 = X.AnonymousClass001.A10(r0, r2)
                com.facebook.aura.partners.voice.infra.VoiceNuxRepository$Companion r1 = com.facebook.aura.partners.voice.infra.VoiceNuxRepository.Companion
                com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository r0 = com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository.this
                X.CGz r0 = r0.userSession
                com.facebook.aura.partners.voice.infra.VoiceNuxRepository r0 = r1.getInstance(r0)
                r8.L$0 = r3
                r8.L$1 = r2
                r8.label = r4
                java.lang.Object r9 = r0.readSeenOnAccountAndCache$fbandroid_express_aura_java_com_facebook_aura_partners_voice_infra_infra(r8)
                if (r9 != r7) goto L4d
                return r7
            L46:
                java.lang.Object r2 = r8.L$1
                X.27k r2 = (X.C27k) r2
                X.Hwg.A00(r9)
            L4d:
                boolean r0 = X.C3cG.A1P(r9, r6)
                if (r0 == 0) goto L1b
                r0 = 0
                r8.L$0 = r0
                r8.L$1 = r0
                r8.label = r5
                java.lang.Object r9 = X.C3cG.A0W(r2, r8)
                if (r9 != r7) goto L14
                return r7
            L61:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository.C131132.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C131132) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository", f = "VoiceAnnouncementRepository.kt", l = {178}, m = "readDueOnServer", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$readDueOnServer$1, reason: invalid class name and case insensitive filesystem */
    public final class C131141 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C131141(HtJ<? super C131141> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceAnnouncementRepository.this.readDueOnServer(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$syncSeenToAccount$1", f = "VoiceAnnouncementRepository.kt", l = {123}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$syncSeenToAccount$1, reason: invalid class name and case insensitive filesystem */
    public final class C131151 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$syncSeenToAccount$1$1", f = "VoiceAnnouncementRepository.kt", l = {126, 128}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$syncSeenToAccount$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02901 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ VoiceAnnouncementRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02901(VoiceAnnouncementRepository voiceAnnouncementRepository, HtJ<? super C02901> htJ) {
                super(1, htJ);
                this.this$0 = voiceAnnouncementRepository;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C02901(this.this$0, htJ);
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return new C02901(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchGatewayConnection gateway = HatchGatewayServiceManager.INSTANCE.getGateway(this.this$0.userSession);
                    this.label = 1;
                    obj = gateway.awaitConnected(15000L, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                        return Unit.INSTANCE;
                    }
                    Hwg.A00(obj);
                }
                if (AnonymousClass001.A1X(obj)) {
                    VoiceAnnouncementRepository voiceAnnouncementRepository = this.this$0;
                    this.label = 2;
                    if (voiceAnnouncementRepository.writeSeen(true, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public C131151(HtJ<? super C131151> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceAnnouncementRepository.this.new C131151(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                VoiceAnnouncementRepository voiceAnnouncementRepository = VoiceAnnouncementRepository.this;
                SingleFlight singleFlight = voiceAnnouncementRepository.accountSync;
                C02901 c02901 = new C02901(voiceAnnouncementRepository, null);
                this.label = 1;
                if (singleFlight.invoke(Unit.INSTANCE, c02901, this) == enumC10460Hji) {
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
            return VoiceAnnouncementRepository.this.new C131151(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository", f = "VoiceAnnouncementRepository.kt", l = {138}, m = "writeSeen", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$writeSeen$1, reason: invalid class name and case insensitive filesystem */
    public final class C131161 extends HzP {
        public Object L$0;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C131161(HtJ<? super C131161> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceAnnouncementRepository.this.writeSeen(false, this);
        }
    }

    public final void onForegroundUsed() {
        this.isForegroundFresh = false;
    }

    private final void cacheNeverDue() {
        VoicePrefs voicePrefs = VoicePrefs.INSTANCE;
        voicePrefs.setVoiceAnnouncementSeen(this.userSession);
        voicePrefs.setVoiceAnnouncementSyncedToAccount(this.userSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isDueOnAccount(X.HtJ<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository.C131121
            if (r0 == 0) goto L5e
            r5 = r8
            com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$isDueOnAccount$1 r5 = (com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository.C131121) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L2c
            if (r0 == r3) goto L42
            if (r0 != r4) goto L64
            X.Hwg.A00(r1)
        L23:
            boolean r0 = X.C3cG.A1P(r1, r3)
        L27:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L2c:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.service.HatchGatewayServiceManager r1 = com.facebook.aura.gateway.service.HatchGatewayServiceManager.INSTANCE
            X.CGz r0 = r7.userSession
            com.facebook.aura.gateway.HatchGatewayConnection r2 = r1.getGateway(r0)
            r5.label = r3
            r0 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r1 = r2.awaitConnected(r0, r5)
            if (r1 != r6) goto L45
            return r6
        L42:
            X.Hwg.A00(r1)
        L45:
            boolean r0 = X.AnonymousClass001.A1X(r1)
            if (r0 != 0) goto L4d
            r0 = 0
            goto L27
        L4d:
            r0 = 0
            com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$isDueOnAccount$2 r2 = new com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$isDueOnAccount$2
            r2.<init>(r0)
            r5.label = r4
            r0 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r1 = X.GAX.A01(r5, r2, r0)
            if (r1 != r6) goto L23
            return r6
        L5e:
            com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$isDueOnAccount$1 r5 = new com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$isDueOnAccount$1
            r5.<init>(r8)
            goto L12
        L64:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository.isDueOnAccount(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readDueOnServer(X.HtJ<? super java.lang.Boolean> r20) {
        /*
            r19 = this;
            r5 = r20
            boolean r0 = r5 instanceof com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository.C131141
            r2 = r19
            if (r0 == 0) goto L84
            r4 = r5
            com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$readDueOnServer$1 r4 = (com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository.C131141) r4
            int r3 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L84
            int r3 = r3 - r1
            r4.label = r3
        L16:
            java.lang.Object r3 = r4.result
            X.Hji r0 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r7 = 0
            r15 = 1
            if (r1 == 0) goto L46
            if (r1 != r15) goto L8f
            java.lang.Object r3 = X.AnonymousClass001.A0q(r3)
        L26:
            java.lang.Throwable r0 = X.HsJ.A00(r3)
            if (r0 != 0) goto L8a
            com.facebook.aura.partners.voice.infra.VoiceAnnouncementStatusJson r3 = (com.facebook.aura.partners.voice.infra.VoiceAnnouncementStatusJson) r3
            java.util.Set<java.lang.String> r1 = com.facebook.aura.partners.voice.infra.VoiceAnnouncementJsonKt.VOICE_ANNOUNCEMENT_FINAL_REASONS
            java.lang.String r0 = r3.reason
            boolean r0 = X.AbstractC0878AGe.A0k(r1, r0)
            if (r0 == 0) goto L3b
            r2.cacheNeverDue()
        L3b:
            java.lang.Boolean r0 = r3.due
            boolean r0 = X.AnonymousClass002.A1b(r0, r15)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L46:
            X.Hwg.A00(r3)
            com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.partners.voice.api.VoiceJarvisPath$VoiceAnnouncement r8 = com.facebook.aura.partners.voice.api.VoiceJarvisPath.VoiceAnnouncement.INSTANCE
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.GET
            X.CGz r10 = r2.userSession
            X.HxE[] r12 = new X.HxE[r7]
            java.util.Set r14 = X.AnonymousClass004.A18()
            X.9jH r16 = X.AGH.A0E()
            com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$readDueOnServer$$inlined$executeJarvisRequest-1iavgos$default$1 r6 = com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$readDueOnServer$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r11 = 0
            r4.L$0 = r11
            r4.L$1 = r11
            r4.L$2 = r11
            r4.L$3 = r11
            r4.L$4 = r11
            r4.L$5 = r11
            r4.L$6 = r11
            r4.I$0 = r15
            r4.I$1 = r15
            r4.I$2 = r7
            r4.label = r15
            r13 = r11
            r17 = r15
            r18 = r11
            r19 = r7
            r20 = r4
            java.lang.Object r3 = r5.m1595executeBodylessJarvisRequestWithp3iPjrY(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r3 != r0) goto L26
            return r0
        L84:
            com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$readDueOnServer$1 r4 = new com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$readDueOnServer$1
            r4.<init>(r5)
            goto L16
        L8a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L8f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository.readDueOnServer(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncSeenToAccount() {
        AnonymousClass001.A1J(new C131151(null), this.scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeSeen(boolean r13, X.HtJ<? super java.lang.Boolean> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository.C131161
            if (r0 == 0) goto L7a
            r11 = r14
            com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$writeSeen$1 r11 = (com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository.C131161) r11
            int r2 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7a
            int r2 = r2 - r1
            r11.label = r2
        L12:
            java.lang.Object r0 = r11.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r11.label
            r7 = 1
            if (r1 == 0) goto L3c
            if (r1 != r7) goto L80
            boolean r13 = r11.Z$0
            X.Hwg.A00(r0)
        L22:
            boolean r2 = r0 instanceof com.facebook.aura.gateway.HatchFileOperations.WriteResult.Success
            if (r2 != 0) goto L32
            java.lang.String r1 = "VoiceAnnouncementRepository"
            java.lang.String r0 = "Failed to write user/voice_announcement.json"
            X.CFK.A06(r1, r0)
        L2d:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L32:
            if (r13 == 0) goto L2d
            com.facebook.aura.partners.voice.prefs.VoicePrefs r1 = com.facebook.aura.partners.voice.prefs.VoicePrefs.INSTANCE
            X.CGz r0 = r12.userSession
            r1.setVoiceAnnouncementSyncedToAccount(r0)
            goto L2d
        L3c:
            X.Hwg.A00(r0)
            if (r13 == 0) goto L4d
            com.facebook.aura.partners.voice.prefs.VoicePrefs r1 = com.facebook.aura.partners.voice.prefs.VoicePrefs.INSTANCE
            X.CGz r0 = r12.userSession
            boolean r0 = r1.hasSeenVoiceAnnouncement(r0)
            if (r0 != 0) goto L4d
            r2 = 0
            goto L2d
        L4d:
            X.9sU r3 = com.facebook.aura.json.HatchJsonKt.HatchJson
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            com.facebook.aura.partners.voice.infra.VoiceAnnouncementJson r1 = new com.facebook.aura.partners.voice.infra.VoiceAnnouncementJson
            r1.<init>(r0)
            com.facebook.aura.partners.voice.infra.VoiceAnnouncementJson$$serializer r0 = com.facebook.aura.partners.voice.infra.VoiceAnnouncementJson$$serializer.INSTANCE
            java.lang.String r1 = r3.A02(r1, r0)
            java.lang.String r0 = "\n"
            java.lang.String r5 = X.FGI.A0M(r1, r0)
            com.facebook.aura.gateway.HatchFileOperations r3 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
            X.CGz r6 = r12.userSession
            r10 = 0
            r11.L$0 = r10
            r11.Z$0 = r13
            r11.label = r7
            java.lang.String r4 = "user/voice_announcement.json"
            r8 = 0
            r9 = r7
            java.lang.Object r0 = r3.writeFile(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r0 != r2) goto L22
            return r2
        L7a:
            com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$writeSeen$1 r11 = new com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$writeSeen$1
            r11.<init>(r14)
            goto L12
        L80:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository.writeSeen(boolean, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.accountSync.clearAndCancelAll();
        Hxb.A03(null, this.scope);
    }

    public final boolean isFreshForeground() {
        Long l = this.backgroundedAtMs;
        if (l != null) {
            this.isForegroundFresh = C3cG.A04(l.longValue()) >= 300000;
        }
        this.backgroundedAtMs = null;
        return this.isForegroundFresh;
    }

    public final void markSeen() {
        VoicePrefs voicePrefs = VoicePrefs.INSTANCE;
        if (voicePrefs.hasSeenVoiceAnnouncement(this.userSession)) {
            return;
        }
        voicePrefs.setVoiceAnnouncementSeen(this.userSession);
        syncSeenToAccount();
    }

    public final void onControlExposed() {
        if (VoiceGating.INSTANCE.isVoiceAnnouncementControlWithoutLogging()) {
            VoicePrefs.INSTANCE.setVoiceAnnouncementControlExposed(this.userSession);
        }
    }

    public final Object resetOnAccount(HtJ<? super Boolean> htJ) {
        VoicePrefs.INSTANCE.clearVoiceAnnouncementSeen(this.userSession);
        return writeSeen(false, htJ);
    }

    public final class Companion {
        public final VoiceAnnouncementRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (VoiceAnnouncementRepository) abstractC3358CGz.A03(VoiceAnnouncementRepository.class, new VoiceAnnouncementRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public VoiceAnnouncementRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        HzC hzCA0w = C3cH.A0w();
        this.scope = hzCA0w;
        OnDuplicateCall.Join join = OnDuplicateCall.Join.INSTANCE;
        C7384Etj.A0Y(join, 1);
        this.accountSync = new LazyStartSingleFlightImpl(join);
        this.isForegroundFresh = true;
        AnonymousClass001.A1I(AuraDispatchers.mainImmediate, new AnonymousClass1(null), hzCA0w);
    }

    public final Object isDue(HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(null));
    }

    public /* synthetic */ VoiceAnnouncementRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
