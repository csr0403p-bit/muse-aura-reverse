package com.facebook.aura.inappnotification;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C1Cd;
import X.C78N;
import X.G0U;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.inappnotification.api.InAppNotification;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.HatchSidePanelController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchInAppNotificationHostKt$HatchInAppNotificationHost$2$1$3 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ InAppNotification.NotificationArgs $notification;
    public final /* synthetic */ HatchSidePanelController $sidePanelController;
    public final /* synthetic */ MutableState<Boolean> $visible$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInAppNotificationHostKt$HatchInAppNotificationHost$2$1$3(InAppNotification.NotificationArgs notificationArgs, HatchSidePanelController hatchSidePanelController, AuraNavigator auraNavigator, MutableState<Boolean> mutableState) {
        super(3);
        this.$notification = notificationArgs;
        this.$sidePanelController = hatchSidePanelController;
        this.$navigator = auraNavigator;
        this.$visible$delegate = mutableState;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
        invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(C1Cd c1Cd, BFM bfm, int i) {
        Function0 function0;
        int iA1V;
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            InAppNotification.NotificationArgs notificationArgs = this.$notification;
            G0U<AuraNavigator, Unit> g0u = notificationArgs.onClick;
            if (g0u == null) {
                function0 = null;
                iA1V = AnonymousClass004.A1P(bfm, -135105720);
            } else {
                bfm.AgE(-135105719);
                HatchSidePanelController hatchSidePanelController = this.$sidePanelController;
                AuraNavigator auraNavigator = this.$navigator;
                MutableState<Boolean> mutableState = this.$visible$delegate;
                boolean zA1S = AnonymousClass004.A1S(bfm, g0u, auraNavigator, bfm.A67(hatchSidePanelController));
                Object objAaT = bfm.AaT();
                if (zA1S || objAaT == C78N.A00) {
                    objAaT = new HatchInAppNotificationHostKt$HatchInAppNotificationHost$2$1$3$1$1$1(hatchSidePanelController, g0u, auraNavigator, mutableState);
                    bfm.Ai0(objAaT);
                }
                function0 = (Function0) objAaT;
                iA1V = AnonymousClass001.A1V(bfm);
            }
            HatchInAppNotificationHostKt.InAppNotificationBar(notificationArgs, function0, bfm, iA1V);
            return;
        }
        bfm.Afo();
    }
}
