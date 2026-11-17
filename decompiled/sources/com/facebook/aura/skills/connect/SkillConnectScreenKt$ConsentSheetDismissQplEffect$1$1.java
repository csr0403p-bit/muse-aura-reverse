package com.facebook.aura.skills.connect;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import android.app.Activity;
import com.facebook.aura.perf.HatchConnectorAuthTraceId;
import com.facebook.aura.perf.HatchConnectorQplLogger;

/* loaded from: classes.dex */
public final class SkillConnectScreenKt$ConsentSheetDismissQplEffect$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<Activity> $hostActivity$delegate;
    public final /* synthetic */ HatchConnectorAuthTraceId $traceId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SkillConnectScreenKt$ConsentSheetDismissQplEffect$1$1(HatchConnectorAuthTraceId hatchConnectorAuthTraceId, C1BO<? extends Activity> c1bo) {
        super(1);
        this.$traceId = hatchConnectorAuthTraceId;
        this.$hostActivity$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final HatchConnectorAuthTraceId hatchConnectorAuthTraceId = this.$traceId;
        final C1BO<Activity> c1bo = this.$hostActivity$delegate;
        return new C78g() { // from class: com.facebook.aura.skills.connect.SkillConnectScreenKt$ConsentSheetDismissQplEffect$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                Activity activity;
                Activity activity2 = (Activity) c1bo.getValue();
                boolean z = true;
                if ((activity2 == null || !activity2.isFinishing()) && ((activity = (Activity) c1bo.getValue()) == null || !activity.isChangingConfigurations())) {
                    z = false;
                }
                HatchConnectorAuthTraceId hatchConnectorAuthTraceId2 = hatchConnectorAuthTraceId;
                if (hatchConnectorAuthTraceId2 == null || z) {
                    return;
                }
                HatchConnectorQplLogger.INSTANCE.endAuthDismissedBeforeConsent(hatchConnectorAuthTraceId2);
            }
        };
    }
}
