package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.C60O;
import X.C7384Etj;
import X.C78T;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.notifications.push.AuraPushNotificationData;
import com.facebook.aura.notifications.push.HatchChatNotificationIds;
import com.facebook.aura.notifications.push.HatchChatNotificationIdsKt;
import com.facebook.aura.notifications.push.PushDataObserver;
import com.facebook.aura.widgets.WidgetSessionReconcileWorkerKt;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class LocalBrowserWakePushObserver implements PushDataObserver {
    public static final int $stable = 0;
    public static final String TAG = "LocalBrowserWakePushObserver";
    public static final LocalBrowserWakePushObserver INSTANCE = new LocalBrowserWakePushObserver();
    public static final C3UX scope = C78T.A00();

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserWakePushObserver$onPushReceived$1", f = "LocalBrowserWakePushObserver.kt", l = {32}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserWakePushObserver$onPushReceived$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $browserTaskId;
        public final /* synthetic */ String $targetDeviceId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$browserTaskId = str;
            this.$targetDeviceId = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$browserTaskId, this.$targetDeviceId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            AbstractC3358CGz abstractC3358CGz;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    AuraSessionManager auraSessionManager = AuraSessionManager.INSTANCE;
                    this.label = 1;
                    obj = auraSessionManager.awaitSettledSession(this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                abstractC3358CGz = (AbstractC3358CGz) obj;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0A(LocalBrowserWakePushObserver.TAG, "Browser wake failed", e2);
                LocalBrowserRuntimeKt.logLocalBrowserWake(this.$browserTaskId, "failed", null, null);
            }
            if (abstractC3358CGz == null) {
                LocalBrowserRuntimeKt.logLocalBrowserWake(this.$browserTaskId, "skipped", WidgetSessionReconcileWorkerKt.KEY_SIGNED_OUT, null);
                return Unit.INSTANCE;
            }
            LocalBrowserRuntime.Companion.getInstance(abstractC3358CGz).wakeForTask(this.$browserTaskId, this.$targetDeviceId);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.facebook.aura.notifications.push.PushDataObserver
    public void onPushReceived(AuraPushNotificationData auraPushNotificationData) {
        C7384Etj.A0Y(auraPushNotificationData, 0);
        if (HatchChatNotificationIdsKt.isBrowserWake(auraPushNotificationData)) {
            String strA0p = C60O.A0p(HatchChatNotificationIds.PARAM_BROWSER_TASK_ID, auraPushNotificationData.params);
            String strA0p2 = C60O.A0p("device_id", auraPushNotificationData.params);
            AnonymousClass001.A1J(new AnonymousClass1(strA0p, strA0p2, null), scope);
        }
    }
}
