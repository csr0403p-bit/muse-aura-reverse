package com.facebook.aura.nodes.core;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.gateway.service.NodeCommandFallbackWorker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class NodeHitlRequestKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NodeHitlRequestKind[] $VALUES;
    public static final NodeHitlRequestKind COMMAND;
    public static final NodeHitlRequestKind DATA_SOURCE_BACKFILL;
    public static final NodeHitlRequestKind PROACTIVE_SYNC;
    public final String displayLabel;

    static {
        NodeHitlRequestKind nodeHitlRequestKind = new NodeHitlRequestKind("COMMAND", 0, NodeCommandFallbackWorker.KEY_COMMAND);
        COMMAND = nodeHitlRequestKind;
        NodeHitlRequestKind nodeHitlRequestKind2 = new NodeHitlRequestKind("DATA_SOURCE_BACKFILL", 1, "data source backfill");
        DATA_SOURCE_BACKFILL = nodeHitlRequestKind2;
        NodeHitlRequestKind nodeHitlRequestKind3 = new NodeHitlRequestKind("PROACTIVE_SYNC", 2, "proactive sync");
        PROACTIVE_SYNC = nodeHitlRequestKind3;
        NodeHitlRequestKind[] nodeHitlRequestKindArr = {nodeHitlRequestKind, nodeHitlRequestKind2, nodeHitlRequestKind3};
        $VALUES = nodeHitlRequestKindArr;
        $ENTRIES = C3cG.A0w(nodeHitlRequestKindArr);
    }

    public static Ey9<NodeHitlRequestKind> getEntries() {
        return $ENTRIES;
    }

    public static NodeHitlRequestKind valueOf(String str) {
        return (NodeHitlRequestKind) Enum.valueOf(NodeHitlRequestKind.class, str);
    }

    public static NodeHitlRequestKind[] values() {
        return (NodeHitlRequestKind[]) $VALUES.clone();
    }

    public final String getDisplayLabel() {
        return this.displayLabel;
    }

    public NodeHitlRequestKind(String str, int i, String str2) {
        this.displayLabel = str2;
    }
}
