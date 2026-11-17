package com.facebook.aura.sharesheet;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;

/* loaded from: classes.dex */
public final class HatchShareLogging$rememberShareSheetDismissLogging$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<HatchShareLogContext> $currentContext;
    public final /* synthetic */ HatchShareDismissLogging $dismissLogging;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareLogging$rememberShareSheetDismissLogging$1$1(HatchShareDismissLogging hatchShareDismissLogging, C1BO<HatchShareLogContext> c1bo) {
        super(1);
        this.$dismissLogging = hatchShareDismissLogging;
        this.$currentContext = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final HatchShareDismissLogging hatchShareDismissLogging = this.$dismissLogging;
        final C1BO<HatchShareLogContext> c1bo = this.$currentContext;
        return new C78g() { // from class: com.facebook.aura.sharesheet.HatchShareLogging$rememberShareSheetDismissLogging$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                if (hatchShareDismissLogging.isSuppressed) {
                    return;
                }
                HatchShareLogging.INSTANCE.logDismiss((HatchShareLogContext) c1bo.getValue());
            }
        };
    }
}
