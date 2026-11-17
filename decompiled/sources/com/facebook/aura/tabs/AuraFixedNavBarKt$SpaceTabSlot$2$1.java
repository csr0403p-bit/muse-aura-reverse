package com.facebook.aura.tabs;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C0dx;
import com.facebook.aura.analytics.hatch.HatchSpaceEntryPoint;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.PeerSpaceScreenKey;
import com.facebook.aura.spaces.menu.SpacesSidebarAnalytics;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraFixedNavBarKt$SpaceTabSlot$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C0dx $haptic;
    public final /* synthetic */ boolean $isSelected;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onOtherTabSelected;
    public final /* synthetic */ Function0<Unit> $onTabReselected;
    public final /* synthetic */ PeerSpaceScreenKey $peerSpaceKey;
    public final /* synthetic */ String $slug;
    public final /* synthetic */ String $spaceId;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraFixedNavBarKt$SpaceTabSlot$2$1(C0dx c0dx, PeerSpaceScreenKey peerSpaceScreenKey, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, String str, String str2, boolean z, Function0<Unit> function0, Function0<Unit> function02) {
        super(0);
        this.$haptic = c0dx;
        this.$peerSpaceKey = peerSpaceScreenKey;
        this.$navigator = auraNavigator;
        this.$userSession = abstractC3358CGz;
        this.$slug = str;
        this.$spaceId = str2;
        this.$isSelected = z;
        this.$onTabReselected = function0;
        this.$onOtherTabSelected = function02;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$haptic.AXr(AuraHaptics.SEGMENT_SWITCH);
        PeerSpaceScreenKey peerSpaceScreenKey = this.$peerSpaceKey;
        if (peerSpaceScreenKey != null) {
            this.$navigator.navigate(peerSpaceScreenKey, LaunchFlag.BRING_TO_FRONT);
        } else {
            SpacesSidebarAnalytics.INSTANCE.recordOpenOrigin(this.$userSession, this.$slug, HatchSpaceEntryPoint.TAB);
            AuraFixedNavBarKt.onSpaceTabClick(this.$slug, this.$spaceId, this.$isSelected, this.$navigator, this.$onTabReselected, this.$onOtherTabSelected);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
