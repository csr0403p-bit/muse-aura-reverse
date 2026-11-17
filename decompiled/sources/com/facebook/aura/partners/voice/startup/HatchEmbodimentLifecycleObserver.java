package com.facebook.aura.partners.voice.startup;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass602;
import X.C06H;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cH;
import X.C3cI;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.GDB;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.InterfaceC7549F2g;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider;
import com.facebook.aura.partners.voice.avatar.HatchVoiceAvatarStore;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchEmbodimentLifecycleObserver implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final HatchGatewayConnection gateway;
    public final HatchAvatarReferenceImageProvider provider;
    public final C3UX scope;
    public final AtomicBoolean started;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.startup.HatchEmbodimentLifecycleObserver$start$2", f = "HatchEmbodimentPrewarmStartupJob.kt", l = {121}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.startup.HatchEmbodimentLifecycleObserver$start$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchVoiceAvatarStore $avatarStore;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchVoiceAvatarStore hatchVoiceAvatarStore, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$avatarStore = hatchVoiceAvatarStore;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchEmbodimentLifecycleObserver.this.new AnonymousClass2(this.$avatarStore, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q c20qA01 = GDB.A01(AnonymousClass602.A00(AuraAppLifecycleManager.isAppInForegroundImmediateFlow));
                final HatchEmbodimentLifecycleObserver hatchEmbodimentLifecycleObserver = HatchEmbodimentLifecycleObserver.this;
                final HatchVoiceAvatarStore hatchVoiceAvatarStore = this.$avatarStore;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.startup.HatchEmbodimentLifecycleObserver.start.2.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        if (z && AuraSessionManager.INSTANCE.isCurrentSession(hatchEmbodimentLifecycleObserver.userSession)) {
                            hatchVoiceAvatarStore.restartCurrentAvatarDownloadIfUnavailable();
                            hatchEmbodimentLifecycleObserver.provider.retryIncompletePrewarm();
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
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.startup.HatchEmbodimentLifecycleObserver$start$3", f = "HatchEmbodimentPrewarmStartupJob.kt", l = {133}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.startup.HatchEmbodimentLifecycleObserver$start$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchVoiceAvatarStore $avatarStore;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchVoiceAvatarStore hatchVoiceAvatarStore, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$avatarStore = hatchVoiceAvatarStore;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchEmbodimentLifecycleObserver.this.new AnonymousClass3(this.$avatarStore, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final HatchEmbodimentLifecycleObserver hatchEmbodimentLifecycleObserver = HatchEmbodimentLifecycleObserver.this;
                C20Q c20qA01 = GDB.A01(AnonymousClass602.A00(new HatchEmbodimentLifecycleObserver$start$3$invokeSuspend$$inlined$map$1(hatchEmbodimentLifecycleObserver.gateway.gatewayState)));
                final HatchVoiceAvatarStore hatchVoiceAvatarStore = this.$avatarStore;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.startup.HatchEmbodimentLifecycleObserver.start.3.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HxE<Boolean, Integer>) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(HxE<Boolean, Integer> hxE, HtJ<? super Unit> htJ) {
                        if (AnonymousClass001.A1X(hxE.first) && AuraSessionManager.INSTANCE.isCurrentSession(hatchEmbodimentLifecycleObserver.userSession)) {
                            hatchVoiceAvatarStore.restartCurrentAvatarDownloadIfUnavailable();
                            if (AuraAppLifecycleManager.INSTANCE.isAppInForeground()) {
                                hatchEmbodimentLifecycleObserver.provider.retryIncompletePrewarm();
                            }
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
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Hxb.A03(null, this.scope);
    }

    public final void start() {
        if (AuraSessionManager.INSTANCE.isCurrentSession(this.userSession) && AnonymousClass002.A1Y(VoiceGating.INSTANCE.getEmbodimentOffReason()) && C3cI.A1W(this.started)) {
            HatchVoiceAvatarStore companion = HatchVoiceAvatarStore.Companion.getInstance(this.userSession);
            this.provider.startPrewarming(new HatchEmbodimentLifecycleObserver$start$$inlined$map$1(companion.currentAvatarUri, this));
            this.provider.startCallIdleRestore();
            C3UX c3ux = this.scope;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(companion, null);
            C6ys c6ys = C6ys.A00;
            Integer num = C79.A00;
            GAo.A02(num, c6ys, anonymousClass2, c3ux);
            GAo.A02(num, c6ys, new AnonymousClass3(companion, null), this.scope);
        }
    }

    public final class Companion {
        public final HatchEmbodimentLifecycleObserver getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchEmbodimentLifecycleObserver) abstractC3358CGz.A03(HatchEmbodimentLifecycleObserver.class, new HatchEmbodimentLifecycleObserver$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchEmbodimentLifecycleObserver(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.started = new AtomicBoolean(false);
        this.scope = C3cH.A0x(AnonymousClass001.A0y());
        this.provider = HatchAvatarReferenceImageProvider.Companion.getInstance(abstractC3358CGz);
        this.gateway = HatchGatewayConnection.Companion.getInstance(abstractC3358CGz);
    }

    public /* synthetic */ HatchEmbodimentLifecycleObserver(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
