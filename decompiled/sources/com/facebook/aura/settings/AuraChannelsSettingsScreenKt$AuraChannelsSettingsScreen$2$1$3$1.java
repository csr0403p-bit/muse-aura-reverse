package com.facebook.aura.settings;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraChannelsSettingsScreenKt$AuraChannelsSettingsScreen$2$1$3$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ G0U<ChannelUiItem, Unit> $navigateToChannel;
    public final /* synthetic */ AuraChannelsUiState $uiState;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AHD<ChannelUiItem> ahd = this.$uiState.availableChannels;
        G0U<ChannelUiItem, Unit> g0u = this.$navigateToChannel;
        boolean z = this.$enabled;
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            AnonymousClass006.A1E(hatchSectionScope, new AuraChannelsSettingsScreenKt$AuraChannelsSettingsScreen$2$1$3$1$1$1((ChannelUiItem) it.next(), g0u, z), 37785928);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraChannelsSettingsScreenKt$AuraChannelsSettingsScreen$2$1$3$1(AuraChannelsUiState auraChannelsUiState, G0U<? super ChannelUiItem, Unit> g0u, boolean z) {
        super(1);
        this.$uiState = auraChannelsUiState;
        this.$navigateToChannel = g0u;
        this.$enabled = z;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
