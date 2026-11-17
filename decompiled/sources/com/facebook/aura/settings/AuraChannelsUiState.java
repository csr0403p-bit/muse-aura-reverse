package com.facebook.aura.settings;

import X.AHD;
import X.AHI;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class AuraChannelsUiState extends C06G {
    public static final int $stable = 0;
    public final AHD<ChannelUiItem> availableChannels;
    public final AHD<ChannelUiItem> connectedChannels;
    public final boolean isLoadingChannels;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraChannelsUiState) {
                AuraChannelsUiState auraChannelsUiState = (AuraChannelsUiState) obj;
                if (!C7384Etj.areEqual(this.connectedChannels, auraChannelsUiState.connectedChannels) || !C7384Etj.areEqual(this.availableChannels, auraChannelsUiState.availableChannels) || this.isLoadingChannels != auraChannelsUiState.isLoadingChannels) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuraChannelsUiState copy$default(AuraChannelsUiState auraChannelsUiState, AHD ahd, AHD ahd2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = auraChannelsUiState.connectedChannels;
        }
        if ((i & 2) != 0) {
            ahd2 = auraChannelsUiState.availableChannels;
        }
        if ((i & 4) != 0) {
            z = auraChannelsUiState.isLoadingChannels;
        }
        return auraChannelsUiState.copy(ahd, ahd2, z);
    }

    public final AHD<ChannelUiItem> component1() {
        return this.connectedChannels;
    }

    public final AHD<ChannelUiItem> component2() {
        return this.availableChannels;
    }

    public final boolean component3() {
        return this.isLoadingChannels;
    }

    public final AHD<ChannelUiItem> getAvailableChannels() {
        return this.availableChannels;
    }

    public final AHD<ChannelUiItem> getConnectedChannels() {
        return this.connectedChannels;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.availableChannels, AnonymousClass005.A0E(this.connectedChannels)), this.isLoadingChannels);
    }

    public final boolean isLoadingChannels() {
        return this.isLoadingChannels;
    }

    public AuraChannelsUiState(AHD<ChannelUiItem> ahd, AHD<ChannelUiItem> ahd2, boolean z) {
        AnonymousClass003.A0u(ahd, ahd2);
        this.connectedChannels = ahd;
        this.availableChannels = ahd2;
        this.isLoadingChannels = z;
    }

    public final AuraChannelsUiState copy(AHD<ChannelUiItem> ahd, AHD<ChannelUiItem> ahd2, boolean z) {
        AnonymousClass003.A0u(ahd, ahd2);
        return new AuraChannelsUiState(ahd, ahd2, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraChannelsUiState(AHD ahd, AHD ahd2, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? AHI.A01 : ahd, (i & 2) != 0 ? AHI.A01 : ahd2, AnonymousClass005.A1O(i, z));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AuraChannelsUiState() {
        AHI ahi = AHI.A01;
        this(ahi, ahi, false);
    }
}
