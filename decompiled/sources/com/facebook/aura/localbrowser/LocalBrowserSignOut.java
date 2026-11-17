package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC9245GAx;
import X.AnonymousClass001;
import X.C3UX;
import X.C6ys;
import X.EnumC10460Hji;
import X.G0V;
import X.GAX;
import X.GAo;
import X.GBK;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.auth.signout.PreSignOutTask;
import com.facebook.aura.executors.AuraDispatchers;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class LocalBrowserSignOut implements PreSignOutTask {
    public static final int $stable = 0;
    public static final LocalBrowserSignOut INSTANCE = new LocalBrowserSignOut();

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserSignOut$execute$1", f = "LocalBrowserLifecycle.kt", l = {20}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserSignOut$execute$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserSignOut$execute$1$1", f = "LocalBrowserLifecycle.kt", l = {21, 24}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserSignOut$execute$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02141 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ AbstractC3358CGz $userSession;
            public int label;

            @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserSignOut$execute$1$1$1", f = "LocalBrowserLifecycle.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.localbrowser.LocalBrowserSignOut$execute$1$1$1, reason: invalid class name and collision with other inner class name */
            public final class C02151 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
                public final /* synthetic */ AbstractC3358CGz $userSession;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C02151(AbstractC3358CGz abstractC3358CGz, HtJ<? super C02151> htJ) {
                    super(2, htJ);
                    this.$userSession = abstractC3358CGz;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    return new C02151(this.$userSession, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    if (this.label != 0) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    LocalBrowserRuntime.Companion.getInstance(this.$userSession).endpoint.stopOwnedTasks(LocalBrowserTaskOutcome.STOPPED);
                    return Unit.INSTANCE;
                }

                @Override // X.G0V
                public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                    return new C02151(this.$userSession, htJ).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02141(AbstractC3358CGz abstractC3358CGz, HtJ<? super C02141> htJ) {
                super(2, htJ);
                this.$userSession = abstractC3358CGz;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C02141(this.$userSession, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    GBK gbk = AuraDispatchers.mainImmediate;
                    C02151 c02151 = new C02151(this.$userSession, null);
                    this.label = 1;
                    if (GAo.A00(this, gbk, c02151) == enumC10460Hji) {
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
                LocalBrowserTaskRegistry companion = LocalBrowserTaskRegistry.Companion.getInstance(this.$userSession);
                this.label = 2;
                if (companion.prepareSignOut(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return new C02141(this.$userSession, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C02141 c02141 = new C02141(this.$userSession, null);
                this.label = 1;
                obj = GAX.A01(this, c02141, 5000L);
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
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass1(this.$userSession, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.facebook.aura.auth.signout.PreSignOutTask
    public void execute() throws Throwable {
        AbstractC3358CGz currentSession = AuraSessionManager.INSTANCE.getCurrentSession();
        if (currentSession != null) {
            AbstractC9245GAx.A00(C6ys.A00, new AnonymousClass1(currentSession, null));
        }
    }
}
