package com.facebook.aura.gateway;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C60Q;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchClientCvmChipBudget;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.common.HatchCvmChipPinPurpose;
import com.facebook.aura.gateway.store.HatchCvmChipDraw;
import com.facebook.aura.gateway.store.HatchCvmChipSelectionBudget;

/* loaded from: classes4.dex */
public final class ChipBudgetLogging {
    public final boolean logsBudgetStop;
    public final HatchCvmChipPinPurpose purpose;
    public final HatchCvmChipBidTrigger trigger;
    public final String vmId;

    public final void submitted(ResolvedChipClaim resolvedChipClaim) {
        C7384Etj.A0Y(resolvedChipClaim, 0);
        HatchCvmChipDraw hatchCvmChipDraw = resolvedChipClaim.draw;
        HatchClientCvmEventLogger hatchClientCvmEventLogger = HatchClientCvmEventLogger.INSTANCE;
        HatchClientCvmChipBudget hatchClientCvmChipBudgetBudget = budget(hatchCvmChipDraw != null ? Integer.valueOf(hatchCvmChipDraw.spentCount) : null);
        hatchClientCvmEventLogger.logCvmReplacementChipSubmitted(hatchClientCvmChipBudgetBudget.copy(hatchClientCvmChipBudgetBudget.budgetType, hatchClientCvmChipBudgetBudget.budgetChipsSpent, hatchClientCvmChipBudgetBudget.budgetChipsLimit, hatchClientCvmChipBudgetBudget.isTryAgain, C60Q.A0W(resolvedChipClaim.claim.chipIds), Integer.valueOf(hatchCvmChipDraw != null ? hatchCvmChipDraw.drawnCount : 0), Boolean.valueOf(hatchCvmChipDraw != null ? hatchCvmChipDraw.isOverBudget : false), Boolean.valueOf(resolvedChipClaim.isRebid), hatchClientCvmChipBudgetBudget.rememberedChipsCount), null);
    }

    private final HatchClientCvmChipBudget budget(Integer num) {
        HatchCvmChipPinPurpose hatchCvmChipPinPurpose = this.purpose;
        return new HatchClientCvmChipBudget(hatchCvmChipPinPurpose, num != null ? num.intValue() : HatchCvmChipSelectionBudget.INSTANCE.spentCount(hatchCvmChipPinPurpose, this.vmId), 10, AnonymousClass002.A1Z(this.trigger, HatchCvmChipBidTrigger.TRY_AGAIN), null, null, null, null, null);
    }

    private final String internalBuildVmId() {
        return null;
    }

    public final void budgetExhausted(Integer num) {
        if (this.logsBudgetStop) {
            HatchClientCvmEventLogger.INSTANCE.logCvmReplacementChipBudgetExhausted(HatchClientCvmChipBudget.copy$default(budget(null), null, 0, 0, false, null, null, null, null, num, 255, null), null);
        }
    }

    public ChipBudgetLogging(HatchCvmChipPinPurpose hatchCvmChipPinPurpose, String str, HatchCvmChipBidTrigger hatchCvmChipBidTrigger, boolean z) {
        AnonymousClass005.A0x(hatchCvmChipPinPurpose, str, hatchCvmChipBidTrigger);
        this.purpose = hatchCvmChipPinPurpose;
        this.vmId = str;
        this.trigger = hatchCvmChipBidTrigger;
        this.logsBudgetStop = z;
    }
}
