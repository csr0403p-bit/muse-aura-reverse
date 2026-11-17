package com.facebook.aura.settings;

import X.AGI;
import X.AnonymousClass003;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class AuraChannelsViewModelKt {
    public static final AuraChannelsUiState withItems(AuraChannelsUiState auraChannelsUiState, List<ChannelUiItem> list) {
        AnonymousClass003.A0u(auraChannelsUiState, list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ChannelUiItem channelUiItem : list) {
            ChannelUiItem channelUiItem2 = channelUiItem;
            if (channelUiItem2.linked || channelUiItem2.needsAttention) {
                arrayList.add(channelUiItem);
            } else {
                arrayList2.add(channelUiItem);
            }
        }
        return auraChannelsUiState.copy(AGI.A07(arrayList), AGI.A07(arrayList2), auraChannelsUiState.isLoadingChannels);
    }
}
