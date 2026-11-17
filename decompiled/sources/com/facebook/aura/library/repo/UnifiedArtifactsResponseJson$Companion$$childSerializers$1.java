package com.facebook.aura.library.repo;

import X.A64;
import X.AbstractC7559F3s;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class UnifiedArtifactsResponseJson$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends ArtifactEdgeJson>>> {
    public static final UnifiedArtifactsResponseJson$Companion$$childSerializers$1 INSTANCE = new UnifiedArtifactsResponseJson$Companion$$childSerializers$1();

    public UnifiedArtifactsResponseJson$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends ArtifactEdgeJson>> invoke() {
        return new A64(ArtifactEdgeJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends ArtifactEdgeJson>> invoke() {
        return new A64(ArtifactEdgeJson$$serializer.INSTANCE);
    }
}
