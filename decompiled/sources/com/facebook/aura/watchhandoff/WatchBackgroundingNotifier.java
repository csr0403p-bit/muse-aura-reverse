package com.facebook.aura.watchhandoff;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass602;
import X.C06H;
import X.C20Z;
import X.C3UX;
import X.C3cH;
import X.C7384Etj;
import X.C78W;
import X.C8eO;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzC;
import X.InterfaceC7549F2g;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.partners.voice.prefs.VoicePrefs;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public final class WatchBackgroundingNotifier implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final C3UX scope;

    @DebugMetadata(c = "com.facebook.aura.watchhandoff.WatchBackgroundingNotifier$1", f = "WatchBackgroundingNotifier.kt", l = {30}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.watchhandoff.WatchBackgroundingNotifier$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AbstractC3358CGz $session;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$session = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$session, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AnonymousClass602 anonymousClass602A00 = AnonymousClass602.A00(VoicePrefs.INSTANCE.observeBackgroundingEnabled(this.$session));
                final AbstractC3358CGz abstractC3358CGz = this.$session;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.watchhandoff.WatchBackgroundingNotifier.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        WatchSessionHandoffLink.INSTANCE.notifyLinkedWatch(abstractC3358CGz);
                        return Unit.INSTANCE;
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        WatchSessionHandoffLink.INSTANCE.notifyLinkedWatch(abstractC3358CGz);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (anonymousClass602A00.collect(c20z, this) == enumC10460Hji) {
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
            return new AnonymousClass1(this.$session, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Hxb.A03(null, this.scope);
    }

    public final class Companion {
        public final void start(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            WatchBackgroundingNotifier watchBackgroundingNotifier = (WatchBackgroundingNotifier) abstractC3358CGz.A03(WatchBackgroundingNotifier.class, new WatchBackgroundingNotifier$Companion$start$notifier$1(abstractC3358CGz));
            if (AuraSessionManager.INSTANCE.isCurrentSession(abstractC3358CGz)) {
                return;
            }
            watchBackgroundingNotifier.clearUserData();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public WatchBackgroundingNotifier(AbstractC3358CGz abstractC3358CGz) {
        HzC hzCA0y = C3cH.A0y(C78W.A02(new C8eO(null), AnonymousClass001.A0y()), new WatchBackgroundingNotifier$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key));
        this.scope = hzCA0y;
        AnonymousClass001.A1J(new AnonymousClass1(abstractC3358CGz, null), hzCA0y);
    }

    public /* synthetic */ WatchBackgroundingNotifier(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
