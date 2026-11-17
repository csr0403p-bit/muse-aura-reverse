package com.facebook.aura.partners.voice.runtime;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C1BN;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.GAX;
import X.GAo;
import X.GB9;
import X.GDB;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.HzC;
import X.InterfaceC7549F2g;
import android.content.Context;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.partners.voice.api.HatchSystemPipRuntime;
import com.facebook.aura.partners.voice.api.VoiceCallManager;
import com.facebook.aura.partners.voice.api.VoiceSystemPipEvent;
import com.facebook.aura.partners.voice.intf.BackgroundVoiceCall;
import com.facebook.aura.partners.voice.intf.VoiceCallPhase;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoiceCallUiState;
import com.facebook.aura.partners.voice.session.impl.HatchVoiceSessionControllerProvider;
import com.facebook.aura.partners.voice.shortcut.VoiceCallShortcutHook;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class VoiceCallSessionOwner implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public boolean isCleared;
    public Session session;

    public final class Session {
        public HxE<Long, ? extends C1BN<VoiceCallUiState>> backgroundState;
        public final VoiceCallStateHolder holder;
        public final VoiceCallManager manager;
        public final C3UX scope;
        public int viewModelCount;

        public final HxE<Long, C1BN<VoiceCallUiState>> getBackgroundState() {
            return this.backgroundState;
        }

        public final VoiceCallStateHolder getHolder() {
            return this.holder;
        }

        public final VoiceCallManager getManager() {
            return this.manager;
        }

        public final C3UX getScope() {
            return this.scope;
        }

        public final int getViewModelCount() {
            return this.viewModelCount;
        }

        public final void setBackgroundState(HxE<Long, ? extends C1BN<VoiceCallUiState>> hxE) {
            this.backgroundState = hxE;
        }

        public final void setViewModelCount(int i) {
            this.viewModelCount = i;
        }

        public Session(VoiceCallManager voiceCallManager, VoiceCallStateHolder voiceCallStateHolder, C3UX c3ux) {
            boolean zA1Z = AnonymousClass005.A1Z(voiceCallManager, voiceCallStateHolder, c3ux);
            this.manager = voiceCallManager;
            this.holder = voiceCallStateHolder;
            this.scope = c3ux;
            this.viewModelCount = zA1Z ? 1 : 0;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.runtime.VoiceCallSessionOwner$acquireUntilEnded$1", f = "VoiceCallSessionOwner.kt", l = {128, 132}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.runtime.VoiceCallSessionOwner$acquireUntilEnded$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ VoiceCallManager $manager;
        public int I$0;
        public int label;
        public final /* synthetic */ VoiceCallSessionOwner this$0;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.runtime.VoiceCallSessionOwner$acquireUntilEnded$1$1", f = "VoiceCallSessionOwner.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.runtime.VoiceCallSessionOwner$acquireUntilEnded$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02951 extends AbstractC07127nr implements G0V<VoiceCallUiState, HtJ<? super Boolean>, Object> {
            public /* synthetic */ Object L$0;
            public int label;

            public C02951(HtJ<? super C02951> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C02951 c02951 = new C02951(htJ);
                c02951.L$0 = obj;
                return c02951;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                VoiceCallUiState voiceCallUiState = (VoiceCallUiState) this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Boolean.valueOf(AnonymousClass002.A1Z(voiceCallUiState.phase, VoiceCallPhase.ENDED));
            }

            @Override // X.G0V
            public final Object invoke(VoiceCallUiState voiceCallUiState, HtJ<? super Boolean> htJ) {
                C02951 c02951 = new C02951(htJ);
                c02951.L$0 = voiceCallUiState;
                return c02951.invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VoiceCallManager voiceCallManager, VoiceCallSessionOwner voiceCallSessionOwner, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$manager = voiceCallManager;
            this.this$0 = voiceCallSessionOwner;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$manager, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    VoiceCallSessionOwner$acquireUntilEnded$1$started$1 voiceCallSessionOwner$acquireUntilEnded$1$started$1 = new VoiceCallSessionOwner$acquireUntilEnded$1$started$1(this.$manager, null);
                    this.label = 1;
                    obj = GAX.A01(this, voiceCallSessionOwner$acquireUntilEnded$1$started$1, 30000L);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                        this.this$0.release(this.$manager);
                        return Unit.INSTANCE;
                    }
                    Hwg.A00(obj);
                }
                int i2 = obj == null ? 0 : 1;
                VoiceCallManager voiceCallManager = this.$manager;
                if (i2 != 0) {
                    C1BN<VoiceCallUiState> callState = voiceCallManager.getCallState();
                    C02951 c02951 = new C02951(null);
                    this.I$0 = i2;
                    this.label = 2;
                    if (AbstractC9777Gfy.A00(this, c02951, callState) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    voiceCallManager.endCall();
                }
                this.this$0.release(this.$manager);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.this$0.release(this.$manager);
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.runtime.VoiceCallSessionOwner$closeWhenSpeechSettles$1", f = "VoiceCallSessionOwner.kt", l = {203}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.runtime.VoiceCallSessionOwner$closeWhenSpeechSettles$1, reason: invalid class name and case insensitive filesystem */
    public final class C131501 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Session $current;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.runtime.VoiceCallSessionOwner$closeWhenSpeechSettles$1$1", f = "VoiceCallSessionOwner.kt", l = {HatchWidgetWebViewKt.HTTP_NO_CONTENT}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.runtime.VoiceCallSessionOwner$closeWhenSpeechSettles$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02961 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ Session $current;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02961(Session session, HtJ<? super C02961> htJ) {
                super(2, htJ);
                this.$current = session;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C02961(this.$current, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    VoiceCallStateHolder voiceCallStateHolder = this.$current.holder;
                    this.label = 1;
                    if (voiceCallStateHolder.awaitUndeliveredSpeechSettled(this) == enumC10460Hji) {
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
                return new C02961(this.$current, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131501(Session session, HtJ<? super C131501> htJ) {
            super(2, htJ);
            this.$current = session;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceCallSessionOwner.this.new C131501(this.$current, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C02961 c02961 = new C02961(this.$current, null);
                this.label = 1;
                if (GAX.A01(this, c02961, 8000L) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            VoiceCallSessionOwner voiceCallSessionOwner = VoiceCallSessionOwner.this;
            Session session = this.$current;
            synchronized (voiceCallSessionOwner) {
                if (voiceCallSessionOwner.session == session && session.viewModelCount == 0 && session.manager.getCallState().getValue().phase == VoiceCallPhase.ENDED) {
                    voiceCallSessionOwner.closeSession(session);
                }
                unit = Unit.INSTANCE;
            }
            return unit;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C131501) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.runtime.VoiceCallSessionOwner$createSession$1", f = "VoiceCallSessionOwner.kt", l = {161}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.runtime.VoiceCallSessionOwner$createSession$1, reason: invalid class name and case insensitive filesystem */
    public final class C131511 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Session $current;
        public final /* synthetic */ VoiceCallManager $manager;
        public int label;
        public final /* synthetic */ VoiceCallSessionOwner this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131511(VoiceCallManager voiceCallManager, VoiceCallSessionOwner voiceCallSessionOwner, Session session, HtJ<? super C131511> htJ) {
            super(2, htJ);
            this.$manager = voiceCallManager;
            this.this$0 = voiceCallSessionOwner;
            this.$current = session;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C131511(this.$manager, this.this$0, this.$current, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                VoiceCallSessionOwner$createSession$1$invokeSuspend$$inlined$filter$1 voiceCallSessionOwner$createSession$1$invokeSuspend$$inlined$filter$1 = new VoiceCallSessionOwner$createSession$1$invokeSuspend$$inlined$filter$1(GDB.A01(new VoiceCallSessionOwner$createSession$1$invokeSuspend$$inlined$map$1(this.$manager.getCallState())));
                final VoiceCallSessionOwner voiceCallSessionOwner = this.this$0;
                final Session session = this.$current;
                C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.runtime.VoiceCallSessionOwner.createSession.1.3
                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        voiceCallSessionOwner.onCallEnded(session);
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        voiceCallSessionOwner.onCallEnded(session);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (voiceCallSessionOwner$createSession$1$invokeSuspend$$inlined$filter$1.collect(c20z, this) == enumC10460Hji) {
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
            return ((C131511) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.runtime.VoiceCallSessionOwner$createSession$2", f = "VoiceCallSessionOwner.kt", l = {165}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.runtime.VoiceCallSessionOwner$createSession$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ Session $current;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;
        public final /* synthetic */ VoiceCallSessionOwner this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Session session, VoiceCallSessionOwner voiceCallSessionOwner, Context context, AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$current = session;
            this.this$0 = voiceCallSessionOwner;
            this.$context = context;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$current, this.this$0, this.$context, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<Long> c22i = this.$current.holder.callStarted;
                final VoiceCallSessionOwner voiceCallSessionOwner = this.this$0;
                final Context context = this.$context;
                final AbstractC3358CGz abstractC3358CGz = this.$userSession;
                C20Z<? super Long> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.runtime.VoiceCallSessionOwner.createSession.2.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(C3cG.A05(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(long j, HtJ<? super Unit> htJ) {
                        voiceCallSessionOwner.notifyCallStarted(context, abstractC3358CGz, j);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeSession(Session session) {
        this.session = null;
        HatchSystemPipRuntime hatchSystemPipRuntime = HatchSystemPipRuntime.INSTANCE;
        hatchSystemPipRuntime.dismissForCallEnd();
        hatchSystemPipRuntime.unregisterManager(session.manager);
        session.manager.endCall();
        session.manager.close();
        Hxb.A03(null, session.scope);
    }

    private final Session createSession(Context context, AbstractC3358CGz abstractC3358CGz) throws Exception {
        int i = new int[]{0}[0];
        HzC hzCA02 = Hxb.A02(C3cH.A0u());
        try {
            if (i != 0) {
                throw new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i)));
            }
            VoiceCallManager voiceCallManagerCreate = HatchVoiceSessionControllerProvider.INSTANCE.create(context, hzCA02, abstractC3358CGz);
            Session session = new Session(voiceCallManagerCreate, C3cG.A0K(abstractC3358CGz), hzCA02);
            this.session = session;
            HatchSystemPipRuntime.INSTANCE.registerManager(voiceCallManagerCreate);
            GB9 gb9 = AuraDispatchers.main;
            AnonymousClass001.A1I(gb9, new C131511(voiceCallManagerCreate, this, session, null), hzCA02);
            GAo.A02(C79.A0K, gb9, new AnonymousClass2(session, this, context, abstractC3358CGz, null), hzCA02);
            return session;
        } catch (Exception e) {
            Hxb.A03(null, hzCA02);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void onCallEnded(Session session) {
        if (this.session == session && session.manager.getCallState().getValue().phase == VoiceCallPhase.ENDED) {
            HatchSystemPipRuntime.INSTANCE.dismissForCallEnd();
            if (session.viewModelCount == 0) {
                closeWhenSpeechSettles(session);
            }
        }
    }

    public final synchronized VoiceCallManager acquire(Context context, AbstractC3358CGz abstractC3358CGz) {
        VoiceCallManager voiceCallManager;
        AnonymousClass003.A0u(context, abstractC3358CGz);
        voiceCallManager = null;
        if (!this.isCleared) {
            Session session = this.session;
            if (session == null) {
                voiceCallManager = createSession(AnonymousClass001.A0I(context), abstractC3358CGz).manager;
            } else {
                session.viewModelCount++;
                voiceCallManager = session.manager;
            }
        }
        return voiceCallManager;
    }

    public final synchronized VoiceCallManager acquireUntilEnded(Context context, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass003.A0u(context, abstractC3358CGz);
        VoiceCallManager voiceCallManagerAcquire = acquire(context, abstractC3358CGz);
        if (voiceCallManagerAcquire == null) {
            return null;
        }
        Session session = this.session;
        if (session != null) {
            AnonymousClass001.A1J(new AnonymousClass1(voiceCallManagerAcquire, this, null), session.scope);
        }
        return voiceCallManagerAcquire;
    }

    @Override // X.InterfaceC7549F2g
    public synchronized void clearUserData() {
        this.isCleared = true;
        Session session = this.session;
        if (session != null) {
            session.manager.logSystemPipEvent(VoiceSystemPipEvent.SESSION_CLEARED);
            closeSession(session);
        }
    }

    public final synchronized VoiceCallManager currentManager$fbandroid_express_aura_java_com_facebook_aura_partners_voice_runtime_runtime() {
        Session session;
        session = this.session;
        return session != null ? session.manager : null;
    }

    public final synchronized void release(VoiceCallManager voiceCallManager) {
        C7384Etj.A0Y(voiceCallManager, 0);
        Session session = this.session;
        if (session != null && session.manager == voiceCallManager) {
            int i = session.viewModelCount - 1;
            session.viewModelCount = i;
            if (i == 0) {
                voiceCallManager.logSystemPipEvent(VoiceSystemPipEvent.UI_RELEASED);
                if (voiceCallManager.getCallState().getValue().phase == VoiceCallPhase.ENDED) {
                    closeWhenSpeechSettles(session);
                }
            }
        }
    }

    public final synchronized boolean sendInput(long j, String str) {
        Session session;
        VoiceCallManager voiceCallManager;
        C7384Etj.A0Y(str, 1);
        session = this.session;
        return (session == null || (voiceCallManager = session.manager) == null) ? false : voiceCallManager.sendInput(j, str);
    }

    private final void closeWhenSpeechSettles(Session session) {
        AnonymousClass001.A1J(new C131501(session, null), session.scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyCallStarted(Context context, AbstractC3358CGz abstractC3358CGz, long j) {
        BackgroundVoiceCall backgroundVoiceCallCallFor$fbandroid_express_aura_java_com_facebook_aura_partners_voice_runtime_runtime = VoiceCallRuntime.INSTANCE.callFor$fbandroid_express_aura_java_com_facebook_aura_partners_voice_runtime_runtime(abstractC3358CGz, j);
        if (backgroundVoiceCallCallFor$fbandroid_express_aura_java_com_facebook_aura_partners_voice_runtime_runtime == null) {
            CFK.A03(Long.valueOf(j), VoiceCallSessionOwnerKt.TAG, "Call %d ended before its started hooks ran");
            return;
        }
        int i = new int[]{0}[0];
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        VoiceCallShortcutHook.INSTANCE.onCallStarted(context, abstractC3358CGz, backgroundVoiceCallCallFor$fbandroid_express_aura_java_com_facebook_aura_partners_voice_runtime_runtime);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d6 A[Catch: all -> 0x0105, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000f, B:10:0x0017, B:12:0x001d, B:16:0x002a, B:17:0x0030, B:19:0x004a, B:21:0x0050, B:23:0x0056, B:24:0x0079, B:25:0x00ae, B:28:0x00d6), top: B:34:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized X.C1BN<com.facebook.aura.partners.voice.intf.VoiceCallUiState> observeCallState$fbandroid_express_aura_java_com_facebook_aura_partners_voice_runtime_runtime(com.facebook.aura.partners.voice.api.VoiceCallManager r30, com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r31, long r32) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.runtime.VoiceCallSessionOwner.observeCallState$fbandroid_express_aura_java_com_facebook_aura_partners_voice_runtime_runtime(com.facebook.aura.partners.voice.api.VoiceCallManager, com.facebook.aura.partners.voice.intf.VoiceCallStateHolder, long):X.1BN");
    }

    public final class Companion {
        public final VoiceCallSessionOwner getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (VoiceCallSessionOwner) abstractC3358CGz.A03(VoiceCallSessionOwner.class, VoiceCallSessionOwner$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ VoiceCallSessionOwner(C06H c06h) {
    }

    public VoiceCallSessionOwner() {
    }
}
