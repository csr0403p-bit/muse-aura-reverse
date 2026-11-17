package com.facebook.aura.tabs;

import X.AHD;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchSpaceEntryPoint;
import com.facebook.aura.library.repo.ArtifactItem;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.PeerSpaceScreenKey;
import com.facebook.aura.navigation.key.SpaceTabScreenKey;
import com.facebook.aura.navigation.key.SpacesModalScreenKey;
import com.facebook.aura.spaces.menu.SpacesSidebarAnalytics;
import com.facebook.aura.tabs.AuraTabItem;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSidePanelTabsKt$AuraSidePanelTabs$13$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isOpen;
    public final /* synthetic */ AuraTabItem $item;
    public final /* synthetic */ AHD<String> $itemIds;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onDismissRequest;
    public final /* synthetic */ Function0<Unit> $onMainChatSelected;
    public final /* synthetic */ int $tabCount;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: com.facebook.aura.tabs.AuraSidePanelTabsKt$AuraSidePanelTabs$13$5$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
        @Override // X.G0U
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(com.facebook.aura.navigation.AuraNavKey r1) {
            /*
                r0 = this;
                r0 = 0
                X.C7384Etj.A0Y(r1, r0)
                boolean r0 = r1 instanceof com.facebook.aura.navigation.key.SpacesModalScreenKey
                if (r0 != 0) goto L11
                boolean r0 = r1 instanceof com.facebook.aura.navigation.key.PeerSpaceScreenKey
                if (r0 != 0) goto L11
                boolean r1 = r1 instanceof com.facebook.aura.navigation.key.DemotedTabScreenKey
                r0 = 0
                if (r1 == 0) goto L12
            L11:
                r0 = 1
            L12:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.tabs.AuraSidePanelTabsKt$AuraSidePanelTabs$13$5$1.AnonymousClass1.invoke(com.facebook.aura.navigation.AuraNavKey):java.lang.Boolean");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSidePanelTabsKt$AuraSidePanelTabs$13$5$1(AuraNavigator auraNavigator, AuraTabItem auraTabItem, Function0<Unit> function0, Function0<Unit> function02, boolean z, AHD<String> ahd, int i, AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$navigator = auraNavigator;
        this.$item = auraTabItem;
        this.$onMainChatSelected = function0;
        this.$onDismissRequest = function02;
        this.$isOpen = z;
        this.$itemIds = ahd;
        this.$tabCount = i;
        this.$userSession = abstractC3358CGz;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$navigator.popAll(AnonymousClass1.INSTANCE);
        AuraTabItem auraTabItem = this.$item;
        if (auraTabItem instanceof AuraTabItem.Fixed) {
            AuraTabItem.Fixed fixed = (AuraTabItem.Fixed) auraTabItem;
            FixedTab fixedTab = fixed.tab;
            Function0<Unit> function0 = fixedTab == FixedTab.CHAT ? this.$onMainChatSelected : this.$onDismissRequest;
            AuraFixedNavBarKt.onFixedTabClick(fixedTab, this.$isOpen, this.$navigator, function0, function0, this.$itemIds.indexOf(fixed.getId()) >= this.$tabCount);
            return;
        }
        if (!(auraTabItem instanceof AuraTabItem.Space)) {
            throw new NoWhenBranchMatchedException();
        }
        SpacesSidebarAnalytics spacesSidebarAnalytics = SpacesSidebarAnalytics.INSTANCE;
        spacesSidebarAnalytics.logSidebarSpaceClick(((AuraTabItem.Space) auraTabItem).artifact.spaceId, this.$isOpen);
        this.$onDismissRequest.invoke();
        PeerSpaceScreenKey peerSpaceScreenKey = AuraTabLayoutKt.toPeerSpaceScreenKey(((AuraTabItem.Space) this.$item).artifact);
        if (peerSpaceScreenKey != null) {
            this.$navigator.navigate(peerSpaceScreenKey, LaunchFlag.BRING_TO_FRONT);
            return;
        }
        spacesSidebarAnalytics.recordOpenOrigin(this.$userSession, ((AuraTabItem.Space) this.$item).artifact.itemKey, HatchSpaceEntryPoint.SIDEBAR);
        int iIndexOf = this.$itemIds.indexOf(((AuraTabItem.Space) this.$item).getId());
        int i = this.$tabCount;
        AuraNavigator auraNavigator = this.$navigator;
        ArtifactItem artifactItem = ((AuraTabItem.Space) this.$item).artifact;
        auraNavigator.navigate(iIndexOf < i ? new SpaceTabScreenKey(artifactItem.itemKey) : new SpacesModalScreenKey(artifactItem.itemKey, null, true), LaunchFlag.BRING_TO_FRONT);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
