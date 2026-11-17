package com.facebook.rsys.screenshare.gen;

import X.BV8;
import X.C60O;
import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes6.dex */
public class PeerScreenShareStates {
    public static G50<PeerScreenShareStates> CONVERTER = C8922Fte.A00(17);
    public static long sMcfTypeId;
    public final HashSet<String> screenSharingPeers;
    public final Map<String, Integer> screenSharingSourcePerUserId;

    public static native PeerScreenShareStates createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerScreenShareStates) {
                PeerScreenShareStates peerScreenShareStates = (PeerScreenShareStates) obj;
                if (this.screenSharingPeers.equals(peerScreenShareStates.screenSharingPeers)) {
                    Map<String, Integer> map = this.screenSharingSourcePerUserId;
                    Map<String, Integer> map2 = peerScreenShareStates.screenSharingSourcePerUserId;
                    if (map != null ? !map.equals(map2) : map2 != null) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int iA09 = BV8.A09(this.screenSharingPeers);
        Map<String, Integer> map = this.screenSharingSourcePerUserId;
        return iA09 + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("PeerScreenShareStates{screenSharingPeers=");
        sbA0x.append(this.screenSharingPeers);
        sbA0x.append(",screenSharingSourcePerUserId=");
        return BV8.A0v(this.screenSharingSourcePerUserId, sbA0x);
    }

    public PeerScreenShareStates(HashSet<String> hashSet, Map<String, Integer> map) {
        hashSet.getClass();
        this.screenSharingPeers = hashSet;
        this.screenSharingSourcePerUserId = map;
    }
}
