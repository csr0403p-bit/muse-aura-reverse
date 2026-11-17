package com.facebook.aura.analytics.hatch.caa;

import X.AnonymousClass006;
import X.C3cH;
import X.C3cJ;
import X.C3md;
import X.C3me;
import X.C7384Etj;
import X.C7526EzK;
import X.CFK;
import X.Eu1;

/* loaded from: classes2.dex */
public final class HatchCaaAccountRecoveryLogger {
    public static final HatchCaaAccountRecoveryLogger INSTANCE = new HatchCaaAccountRecoveryLogger();

    public final void logAccountRecoveryStart(String str, HatchCaaLoginEventStep hatchCaaLoginEventStep) {
        C7384Etj.A0Y(hatchCaaLoginEventStep, 1);
        HatchCaaCore hatchCaaCoreCreate = HatchCaaCore.Companion.create(HatchCaaAccountRecoveryEvent.ACCOUNT_RECOVERY_START.getValue(), HatchCaaAccountRecoveryEventCategory.LOGIN.getValue(), HatchCaaEventFlow.ACCOUNT_RECOVERY.getValue(), HatchCaaAccountRecoveryEventStep.PASSWORD_FORM.getValue(), AnonymousClass006.A10("entry_point", hatchCaaLoginEventStep.getValue()), null);
        try {
            Eu1 eu1AcquireEvent = C3cH.A0I().acquireEvent("caa_account_recovery_client_events_rl", C7526EzK.A02);
            if (!eu1AcquireEvent.isSampled()) {
                CFK.A0H("HatchCaaLogging", "dropped, not sampled: %s", hatchCaaCoreCreate.describe());
                return;
            }
            C3md c3md = new C3md();
            C3cJ.A0c(c3md, hatchCaaCoreCreate, str);
            eu1AcquireEvent.A3z(c3md, "core");
            C3me c3me = new C3me();
            c3me.A05("event_source", "login_home_page");
            eu1AcquireEvent.A3z(c3me, "account_recovery_params");
            eu1AcquireEvent.APu();
        } catch (Exception e) {
            C3cH.A1B("failed to log ", hatchCaaCoreCreate.describe(), "HatchCaaLogging", e);
        }
    }
}
