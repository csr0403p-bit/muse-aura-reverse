package com.facebook.aura.nodes.json;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C06H;
import X.C3cG;
import X.Ey9;
import com.facebook.aura.pairs.PairsInviteMailboxKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class NodePairingStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NodePairingStatus[] $VALUES;
    public static final Companion Companion;
    public static final NodePairingStatus OK;
    public static final NodePairingStatus REVOKED;
    public static final NodePairingStatus SELF_REVOKED;
    public final String wireValue;

    static {
        NodePairingStatus nodePairingStatus = new NodePairingStatus("OK", 0, PairsInviteMailboxKt.OUTCOME_OK);
        OK = nodePairingStatus;
        NodePairingStatus nodePairingStatus2 = new NodePairingStatus("REVOKED", 1, "revoked");
        REVOKED = nodePairingStatus2;
        NodePairingStatus nodePairingStatus3 = new NodePairingStatus("SELF_REVOKED", 2, "self_revoked");
        SELF_REVOKED = nodePairingStatus3;
        NodePairingStatus[] nodePairingStatusArr = {nodePairingStatus, nodePairingStatus2, nodePairingStatus3};
        $VALUES = nodePairingStatusArr;
        $ENTRIES = C3cG.A0w(nodePairingStatusArr);
        Companion = new Companion();
    }

    public static Ey9<NodePairingStatus> getEntries() {
        return $ENTRIES;
    }

    public static NodePairingStatus valueOf(String str) {
        return (NodePairingStatus) Enum.valueOf(NodePairingStatus.class, str);
    }

    public static NodePairingStatus[] values() {
        return (NodePairingStatus[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public final class Companion {
        public final NodePairingStatus fromWire(String str) {
            String strA0l;
            if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null) {
                String strA0u = AnonymousClass001.A0u(strA0l);
                for (NodePairingStatus nodePairingStatus : NodePairingStatus.values()) {
                    if (strA0u.equals(nodePairingStatus.getWireValue())) {
                        return nodePairingStatus;
                    }
                }
            }
            return null;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public NodePairingStatus(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
