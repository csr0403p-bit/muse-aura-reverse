package com.facebook.aura.nodes.snapshot;

import com.facebook.aura.nodes.core.NodeCommandId;

/* loaded from: classes3.dex */
public interface HatchCommandDescriptionResolver {
    String resolveCommand(NodeCommandId nodeCommandId, String str);

    String resolveDataSource(String str, String str2);
}
