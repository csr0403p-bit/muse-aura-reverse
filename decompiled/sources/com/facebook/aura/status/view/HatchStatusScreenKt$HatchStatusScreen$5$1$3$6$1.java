package com.facebook.aura.status.view;

import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.key.HatchStatusTab;
import com.facebook.aura.status.api.StatusTabEntry;
import com.facebook.aura.vds.compose.segmentedtabs.AuraTab;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchStatusScreenKt$HatchStatusScreen$5$1$3$6$1 extends AbstractC7559F3s implements G0V<AuraTab, Integer, Unit> {
    public final /* synthetic */ MutableState<Boolean> $isTabSelectionLocked$delegate;
    public final /* synthetic */ MutableState<StatusTabEntry> $selectedTabEntry$delegate;
    public final /* synthetic */ MutableState<String> $selectedTabId$delegate;
    public final /* synthetic */ List<String> $tabIds;
    public final /* synthetic */ AHD<HatchStatusTab> $visibleTabs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchStatusScreenKt$HatchStatusScreen$5$1$3$6$1(AHD<? extends HatchStatusTab> ahd, List<String> list, MutableState<Boolean> mutableState, MutableState<StatusTabEntry> mutableState2, MutableState<String> mutableState3) {
        super(2);
        this.$visibleTabs = ahd;
        this.$tabIds = list;
        this.$isTabSelectionLocked$delegate = mutableState;
        this.$selectedTabEntry$delegate = mutableState2;
        this.$selectedTabId$delegate = mutableState3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(AuraTab auraTab, Integer num) {
        invoke(auraTab, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AuraTab auraTab, int i) {
        HatchStatusTab hatchStatusTab = (HatchStatusTab) AbstractC0878AGe.A0A(i, this.$visibleTabs);
        if (hatchStatusTab != null) {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.STATUS, HatchSubsurface.TAB_BAR, HatchScreen.BOT_SHEET, HatchStatusScreenKt.analyticsComponent(hatchStatusTab), null, null, null);
        }
        MutableState.A09(true, this.$isTabSelectionLocked$delegate);
        this.$selectedTabEntry$delegate.Af8(StatusTabEntry.TAP);
        this.$selectedTabId$delegate.Af8(this.$tabIds.get(i));
    }
}
