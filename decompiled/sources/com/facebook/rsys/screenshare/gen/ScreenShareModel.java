package com.facebook.rsys.screenshare.gen;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C60O;
import X.C60R;
import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.HashSet;

/* loaded from: classes6.dex */
public class ScreenShareModel {
    public static G50<ScreenShareModel> CONVERTER = C8922Fte.A00(19);
    public static long sMcfTypeId;
    public final boolean audioFeatureEnabled;
    public final long maxParticipants;
    public final PeerScreenShareStates peerStates;
    public final int screenShareAvailability;
    public final boolean screenShareInitiateSharing;
    public final boolean screenShareIntendedOn;
    public final int screenSharePlayerCurrentIndex;
    public final int screenSharePlayerMediaQueueCount;
    public final int screenShareSourceType;
    public final int screenShareState;
    public final boolean screenShareStopSharing;
    public final int screenShareStopSharingActionSource;
    public final HashSet<Long> selfRemoteScreenShareChannelIds;

    public static native ScreenShareModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ScreenShareModel) {
                ScreenShareModel screenShareModel = (ScreenShareModel) obj;
                if (this.screenShareInitiateSharing == screenShareModel.screenShareInitiateSharing && this.screenShareState == screenShareModel.screenShareState && this.screenShareIntendedOn == screenShareModel.screenShareIntendedOn && this.screenShareSourceType == screenShareModel.screenShareSourceType && this.screenShareAvailability == screenShareModel.screenShareAvailability && this.screenShareStopSharing == screenShareModel.screenShareStopSharing && this.screenShareStopSharingActionSource == screenShareModel.screenShareStopSharingActionSource) {
                    PeerScreenShareStates peerScreenShareStates = this.peerStates;
                    PeerScreenShareStates peerScreenShareStates2 = screenShareModel.peerStates;
                    if (peerScreenShareStates != null ? peerScreenShareStates.equals(peerScreenShareStates2) : peerScreenShareStates2 == null) {
                        if (this.maxParticipants != screenShareModel.maxParticipants || this.audioFeatureEnabled != screenShareModel.audioFeatureEnabled || this.screenSharePlayerMediaQueueCount != screenShareModel.screenSharePlayerMediaQueueCount || this.screenSharePlayerCurrentIndex != screenShareModel.screenSharePlayerCurrentIndex || !this.selfRemoteScreenShareChannelIds.equals(screenShareModel.selfRemoteScreenShareChannelIds)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.selfRemoteScreenShareChannelIds, (((((C60R.A00(this.maxParticipants, (((((((((((((((527 + (this.screenShareInitiateSharing ? 1 : 0)) * 31) + this.screenShareState) * 31) + (this.screenShareIntendedOn ? 1 : 0)) * 31) + this.screenShareSourceType) * 31) + this.screenShareAvailability) * 31) + (this.screenShareStopSharing ? 1 : 0)) * 31) + this.screenShareStopSharingActionSource) * 31) + AnonymousClass006.A0D(this.peerStates)) * 31) + (this.audioFeatureEnabled ? 1 : 0)) * 31) + this.screenSharePlayerMediaQueueCount) * 31) + this.screenSharePlayerCurrentIndex) * 31);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("ScreenShareModel{screenShareInitiateSharing=");
        sbA0x.append(this.screenShareInitiateSharing);
        sbA0x.append(",screenShareState=");
        sbA0x.append(this.screenShareState);
        sbA0x.append(",screenShareIntendedOn=");
        sbA0x.append(this.screenShareIntendedOn);
        sbA0x.append(",screenShareSourceType=");
        sbA0x.append(this.screenShareSourceType);
        sbA0x.append(",screenShareAvailability=");
        sbA0x.append(this.screenShareAvailability);
        sbA0x.append(",screenShareStopSharing=");
        sbA0x.append(this.screenShareStopSharing);
        sbA0x.append(",screenShareStopSharingActionSource=");
        sbA0x.append(this.screenShareStopSharingActionSource);
        sbA0x.append(",peerStates=");
        sbA0x.append(this.peerStates);
        sbA0x.append(",maxParticipants=");
        sbA0x.append(this.maxParticipants);
        sbA0x.append(",audioFeatureEnabled=");
        sbA0x.append(this.audioFeatureEnabled);
        sbA0x.append(",screenSharePlayerMediaQueueCount=");
        sbA0x.append(this.screenSharePlayerMediaQueueCount);
        sbA0x.append(",screenSharePlayerCurrentIndex=");
        sbA0x.append(this.screenSharePlayerCurrentIndex);
        sbA0x.append(",selfRemoteScreenShareChannelIds=");
        return BV8.A0v(this.selfRemoteScreenShareChannelIds, sbA0x);
    }

    public ScreenShareModel(boolean z, int i, boolean z2, int i2, int i3, boolean z3, int i4, PeerScreenShareStates peerScreenShareStates, long j, boolean z4, int i5, int i6, HashSet<Long> hashSet) {
        hashSet.getClass();
        this.screenShareInitiateSharing = z;
        this.screenShareState = i;
        this.screenShareIntendedOn = z2;
        this.screenShareSourceType = i2;
        this.screenShareAvailability = i3;
        this.screenShareStopSharing = z3;
        this.screenShareStopSharingActionSource = i4;
        this.peerStates = peerScreenShareStates;
        this.maxParticipants = j;
        this.audioFeatureEnabled = z4;
        this.screenSharePlayerMediaQueueCount = i5;
        this.screenSharePlayerCurrentIndex = i6;
        this.selfRemoteScreenShareChannelIds = hashSet;
    }
}
