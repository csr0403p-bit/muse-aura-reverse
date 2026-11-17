package com.facebook.aura.pairs;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.network.api.StefiMusePath;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PeerInvitesPath implements StefiMusePath.Extension {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PeerInvitesPath[] $VALUES;
    public static final PeerInvitesPath Cancel;
    public static final PeerInvitesPath Decline;
    public static final PeerInvitesPath MarkDelivered;
    public static final PeerInvitesPath Pending;
    public static final PeerInvitesPath PhotoUpload;
    public static final PeerInvitesPath Send;
    public static final PeerInvitesPath Status;
    public final String value;

    static {
        PeerInvitesPath peerInvitesPath = new PeerInvitesPath("Send", 0, "/peer_invites/send");
        Send = peerInvitesPath;
        PeerInvitesPath peerInvitesPath2 = new PeerInvitesPath("Pending", 1, "/peer_invites/pending");
        Pending = peerInvitesPath2;
        PeerInvitesPath peerInvitesPath3 = new PeerInvitesPath("Status", 2, "/peer_invites/status");
        Status = peerInvitesPath3;
        PeerInvitesPath peerInvitesPath4 = new PeerInvitesPath("Cancel", 3, "/peer_invites/cancel");
        Cancel = peerInvitesPath4;
        PeerInvitesPath peerInvitesPath5 = new PeerInvitesPath("MarkDelivered", 4, "/peer_invites/mark_delivered");
        MarkDelivered = peerInvitesPath5;
        PeerInvitesPath peerInvitesPath6 = new PeerInvitesPath("Decline", 5, "/peer_invites/decline");
        Decline = peerInvitesPath6;
        PeerInvitesPath peerInvitesPath7 = new PeerInvitesPath("PhotoUpload", 6, "/peer_invite_photos/upload");
        PhotoUpload = peerInvitesPath7;
        PeerInvitesPath[] peerInvitesPathArr = {peerInvitesPath, peerInvitesPath2, peerInvitesPath3, peerInvitesPath4, peerInvitesPath5, peerInvitesPath6, peerInvitesPath7};
        $VALUES = peerInvitesPathArr;
        $ENTRIES = C3cG.A0w(peerInvitesPathArr);
    }

    public static Ey9<PeerInvitesPath> getEntries() {
        return $ENTRIES;
    }

    public static PeerInvitesPath valueOf(String str) {
        return (PeerInvitesPath) Enum.valueOf(PeerInvitesPath.class, str);
    }

    public static PeerInvitesPath[] values() {
        return (PeerInvitesPath[]) $VALUES.clone();
    }

    @Override // com.facebook.aura.network.api.StefiPath
    public String getValue() {
        return this.value;
    }

    public PeerInvitesPath(String str, int i, String str2) {
        this.value = str2;
    }
}
