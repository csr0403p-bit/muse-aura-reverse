package com.facebook.aura.settings;

/* loaded from: classes6.dex */
public abstract class HatchWhatsAppViewModelKt {
    public static final HatchWhatsAppUiState withStatus(HatchWhatsAppUiState hatchWhatsAppUiState, ChannelJson channelJson, boolean z) {
        if (channelJson == null) {
            return HatchWhatsAppUiState.copy$default(hatchWhatsAppUiState, false, false, false, null, null, false, null, false, false, false, null, 2043, null);
        }
        boolean z2 = channelJson.linked;
        return hatchWhatsAppUiState.copy(z2, channelJson.needsAttention() || (z && !z2 && channelJson.requiresUnlink()), false, hatchWhatsAppUiState.connectPhase, hatchWhatsAppUiState.pairingUrl, hatchWhatsAppUiState.showDisconnectDialog, hatchWhatsAppUiState.replacePhase, hatchWhatsAppUiState.statusLoaded, hatchWhatsAppUiState.isHandoff, false, hatchWhatsAppUiState.disclosure);
    }
}
