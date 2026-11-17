package com.facebook.aura.analytics.hatch;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C06H;
import X.C7384Etj;
import X.C7BY;
import X.C8fD;
import X.F2V;
import android.content.Context;
import android.content.Intent;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.secure.receiver.FamilyStaticBroadcastReceiver;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchXInstallReferrerReceiver extends FamilyStaticBroadcastReceiver {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String TAG = "HatchXInstallReferrerReceiver";
    public final Function0<Boolean> isEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchXInstallReferrerReceiver(Function0<Boolean> function0) {
        super(HatchXInstallReferrerReceiverKt.trustedSenders);
        C7384Etj.A0Y(function0, 0);
        this.isEnabled = function0;
    }

    @Override // com.facebook.secure.receiver.StaticBroadcastReceiverBase
    public void doReceive(Context context, Intent intent, C8fD c8fD) {
        C7384Etj.A0Y(intent, 1);
        handleHandoff$fbandroid_express_aura_java_com_facebook_aura_analytics_hatch_hatch(intent);
    }

    public final void handleHandoff$fbandroid_express_aura_java_com_facebook_aura_analytics_hatch_hatch(Intent intent) {
        C7384Etj.A0Y(intent, 0);
        if (AnonymousClass003.A1Y(this.isEnabled)) {
            F2V f2vA00 = F2V.A00(intent.getBundleExtra("utm"));
            HatchDeferredUtmStore.INSTANCE.capture(f2vA00, System.currentTimeMillis());
            String str = f2vA00.A02;
            if (str == null || C7BY.A0j(str)) {
                return;
            }
            HatchDeferredDeeplinkStore.INSTANCE.captureFromAppManagerCustomData(str, System.currentTimeMillis());
            HatchDeferredInviteCodeStore.INSTANCE.captureFromReferrer(str, System.currentTimeMillis());
        }
    }

    /* renamed from: com.facebook.aura.analytics.hatch.HatchXInstallReferrerReceiver$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(HatchXInstallReferrerReceiverKt.isXInstallReferrerHandoffEnabled());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(HatchXInstallReferrerReceiverKt.isXInstallReferrerHandoffEnabled());
        }
    }

    @Override // com.facebook.secure.receiver.StaticBroadcastReceiverBase
    public Executor getAsyncExecutor() {
        return AuraExecutors.INSTANCE.getBackgroundThreadExecutor();
    }

    @Override // com.facebook.secure.receiver.StaticBroadcastReceiverBase
    public boolean shouldProcessAsync() {
        return true;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchXInstallReferrerReceiver() {
        this(AnonymousClass1.INSTANCE);
    }
}
