package com.facebook.aura.nodes.core;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class NodeHitlAccess {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NodeHitlAccess[] $VALUES;
    public static final NodeHitlAccess READ;
    public static final NodeHitlAccess WRITE;
    public final String displayLabel;
    public final String wireValue;

    static {
        NodeHitlAccess nodeHitlAccess = new NodeHitlAccess("READ", 0, BrowserOperationCatalogKt.READ, BrowserOperationCatalogKt.READ);
        READ = nodeHitlAccess;
        NodeHitlAccess nodeHitlAccess2 = new NodeHitlAccess("WRITE", 1, "write", "write");
        WRITE = nodeHitlAccess2;
        NodeHitlAccess[] nodeHitlAccessArr = {nodeHitlAccess, nodeHitlAccess2};
        $VALUES = nodeHitlAccessArr;
        $ENTRIES = C3cG.A0w(nodeHitlAccessArr);
    }

    public static Ey9<NodeHitlAccess> getEntries() {
        return $ENTRIES;
    }

    public static NodeHitlAccess valueOf(String str) {
        return (NodeHitlAccess) Enum.valueOf(NodeHitlAccess.class, str);
    }

    public static NodeHitlAccess[] values() {
        return (NodeHitlAccess[]) $VALUES.clone();
    }

    public final String getDisplayLabel() {
        return this.displayLabel;
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public NodeHitlAccess(String str, int i, String str2, String str3) {
        this.wireValue = str2;
        this.displayLabel = str3;
    }
}
