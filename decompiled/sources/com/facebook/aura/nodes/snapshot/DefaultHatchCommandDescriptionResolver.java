package com.facebook.aura.nodes.snapshot;

import com.facebook.aura.nodes.core.NodeCommandId;

/* loaded from: classes3.dex */
public final class DefaultHatchCommandDescriptionResolver implements HatchCommandDescriptionResolver {
    public static final DefaultHatchCommandDescriptionResolver INSTANCE = new DefaultHatchCommandDescriptionResolver();

    @Override // com.facebook.aura.nodes.snapshot.HatchCommandDescriptionResolver
    public String resolveCommand(NodeCommandId nodeCommandId, String str) {
        return str;
    }

    @Override // com.facebook.aura.nodes.snapshot.HatchCommandDescriptionResolver
    public String resolveDataSource(String str, String str2) {
        return str2;
    }
}
