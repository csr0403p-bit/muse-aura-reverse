package com.facebook.aura.nodes.core;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.permissions.defaults.ConfidentialVmSettingsJsonKt;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class NodeHitlMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NodeHitlMode[] $VALUES;
    public static final NodeHitlMode ALLOW;
    public static final NodeHitlMode ASK;
    public static final Companion Companion;
    public static final NodeHitlMode DENY;
    public final String wireValue;

    public final class Companion {
        public final NodeHitlMode defaultFor(NodeHitlAccess nodeHitlAccess) {
            int iA0E = AnonymousClass001.A0E(nodeHitlAccess, 0);
            if (iA0E == 0) {
                return NodeHitlMode.ALLOW;
            }
            if (iA0E == 1) {
                return NodeHitlMode.ASK;
            }
            throw C3cG.A0q();
        }

        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[NodeHitlAccess.values().length];
                try {
                    AnonymousClass002.A13(NodeHitlAccess.READ, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(NodeHitlAccess.WRITE, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final NodeHitlMode fromWire(String str) {
            NodeHitlMode next;
            Iterator<NodeHitlMode> it = NodeHitlMode.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.getWireValue(), str)) {
                    break;
                }
            }
            return next;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        NodeHitlMode nodeHitlMode = new NodeHitlMode("ALLOW", 0, ConfidentialVmSettingsJsonKt.MODE_ALLOW);
        ALLOW = nodeHitlMode;
        NodeHitlMode nodeHitlMode2 = new NodeHitlMode("ASK", 1, "ask");
        ASK = nodeHitlMode2;
        NodeHitlMode nodeHitlMode3 = new NodeHitlMode("DENY", 2, ConfidentialVmSettingsJsonKt.MODE_DENY);
        DENY = nodeHitlMode3;
        NodeHitlMode[] nodeHitlModeArr = {nodeHitlMode, nodeHitlMode2, nodeHitlMode3};
        $VALUES = nodeHitlModeArr;
        $ENTRIES = C3cG.A0w(nodeHitlModeArr);
        Companion = new Companion();
    }

    public static Ey9<NodeHitlMode> getEntries() {
        return $ENTRIES;
    }

    public static NodeHitlMode valueOf(String str) {
        return (NodeHitlMode) Enum.valueOf(NodeHitlMode.class, str);
    }

    public static NodeHitlMode[] values() {
        return (NodeHitlMode[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public NodeHitlMode(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
