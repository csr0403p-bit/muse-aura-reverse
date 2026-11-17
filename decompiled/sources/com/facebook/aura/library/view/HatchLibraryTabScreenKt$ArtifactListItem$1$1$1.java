package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.library.model.ArtifactFile;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchLibraryTabScreenKt$ArtifactListItem$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ArtifactFile $artifact;
    public final /* synthetic */ G0U<ArtifactFile, Unit> $onArtifactClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchLibraryTabScreenKt$ArtifactListItem$1$1$1(G0U<? super ArtifactFile, Unit> g0u, ArtifactFile artifactFile) {
        super(0);
        this.$onArtifactClick = g0u;
        this.$artifact = artifactFile;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onArtifactClick.invoke(this.$artifact);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
