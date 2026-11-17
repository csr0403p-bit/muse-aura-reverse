package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import com.facebook.aura.library.model.ArtifactFile;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchLibraryTabScreenKt$LibraryItemContextMenu$8$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ArtifactFile $artifact;
    public final /* synthetic */ Function0<Unit> $togglePin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLibraryTabScreenKt$LibraryItemContextMenu$8$1$1(ArtifactFile artifactFile, Function0<Unit> function0) {
        super(0);
        this.$artifact = artifactFile;
        this.$togglePin = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchLibraryTabScreenKt.logLibraryFilePinClick(this.$artifact);
        this.$togglePin.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
