package com.facebook.aura.globaleffects;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BLG;
import X.BzK;
import X.C06H;
import X.C1BN;
import X.C20Q;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C4oT;
import X.C7384Etj;
import X.C78W;
import X.C8eO;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.InterfaceC7549F2g;
import android.app.Activity;
import android.app.ActivityManager;
import com.facebook.aura.common.prefs.HatchPrefsStore;
import com.facebook.aura.common.restart.HatchAppRestarter;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.maplibre.android.R;

/* loaded from: classes2.dex */
public final class HatchVmRestartRequest implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final BLG<Boolean> _isPending;
    public final C1BN<Boolean> isPending;
    public final C3UX scope;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.globaleffects.HatchVmRestartRequest$request$2", f = "HatchVmRestartRequest.kt", l = {R.styleable.maplibre_MapView_maplibre_uiRotateGestures}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.globaleffects.HatchVmRestartRequest$request$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.globaleffects.HatchVmRestartRequest$request$2$1", f = "HatchVmRestartRequest.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.globaleffects.HatchVmRestartRequest$request$2$1, reason: invalid class name */
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
                return Boolean.valueOf(!z);
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
                return invoke(AnonymousClass001.A1X(bool), htJ);
            }

            public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
                return ((AnonymousClass1) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchVmRestartRequest.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q<Boolean> c20q = AuraAppLifecycleManager.isAppInForegroundImmediateFlow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                if (AbstractC9777Gfy.A00(this, anonymousClass1, c20q) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchVmRestartRequest.this.exitQuietly();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchVmRestartRequest.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void restart(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        BzK bzKA9q = HatchPrefsStore.INSTANCE.userPrefs(this.userSession).A9q();
        bzKA9q.AYp(HatchVmRestartRequestKt.KEY_RESTARTED_AT_MS, System.currentTimeMillis());
        bzKA9q.commit();
        HatchGatewayPrefsStore.Companion.getInstance(this.userSession).clearIdentity(HatchVmRestartRequestKt.RESTART_REASON, activity, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void exitQuietly() {
        List<ActivityManager.AppTask> appTasks;
        HatchGatewayPrefsStore.Companion.getInstance(this.userSession).clearLocalData();
        ActivityManager activityManager = (ActivityManager) C3cG.A06().getSystemService(ActivityManager.class);
        if (activityManager != null && (appTasks = activityManager.getAppTasks()) != null) {
            Iterator<ActivityManager.AppTask> it = appTasks.iterator();
            while (it.hasNext()) {
                try {
                    it.next().finishAndRemoveTask();
                } catch (Throwable th) {
                    C3cG.A0s(th);
                }
            }
        }
        HatchAppRestarter.INSTANCE.exitApp("Expected application exit: Gateway recovery moved to another VM in the background");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Hxb.A03(null, this.scope);
        AnonymousClass003.A14(this._isPending, false);
    }

    public final boolean consumeRestartedMarker() {
        C4oT c4oTUserPrefs = HatchPrefsStore.INSTANCE.userPrefs(this.userSession);
        long j = c4oTUserPrefs.getLong(HatchVmRestartRequestKt.KEY_RESTARTED_AT_MS, 0L);
        if (j == 0) {
            return false;
        }
        BzK bzKA9q = c4oTUserPrefs.A9q();
        bzKA9q.Aae(HatchVmRestartRequestKt.KEY_RESTARTED_AT_MS);
        bzKA9q.apply();
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        return 0 <= jCurrentTimeMillis && jCurrentTimeMillis < 300001;
    }

    public final C1BN<Boolean> isPending() {
        return this.isPending;
    }

    public final void request() {
        Boolean value;
        Boolean bool;
        BLG<Boolean> blg = this._isPending;
        do {
            value = blg.getValue();
            bool = value;
        } while (!blg.A6e(value, AnonymousClass001.A0i()));
        if (bool.booleanValue()) {
            return;
        }
        AnonymousClass001.A1J(new AnonymousClass2(null), this.scope);
    }

    public final class Companion {
        public final HatchVmRestartRequest getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchVmRestartRequest) abstractC3358CGz.A03(HatchVmRestartRequest.class, new HatchVmRestartRequest$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchVmRestartRequest(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.scope = C3cH.A0y(C78W.A02(new C8eO(null), AuraDispatchers.main), new HatchVmRestartRequest$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key));
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(false);
        this._isPending = c9286GCnA0v;
        this.isPending = C3cG.A11(c9286GCnA0v);
    }

    public /* synthetic */ HatchVmRestartRequest(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
