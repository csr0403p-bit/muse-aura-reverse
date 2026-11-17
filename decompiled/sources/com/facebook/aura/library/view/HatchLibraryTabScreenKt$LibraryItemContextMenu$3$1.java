package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.library.model.ArtifactFile;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchLibraryTabScreenKt$LibraryItemContextMenu$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ArtifactFile $artifact;
    public final /* synthetic */ MutableState<String> $renameText$delegate;
    public final /* synthetic */ MutableState<Boolean> $showRenameDialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLibraryTabScreenKt$LibraryItemContextMenu$3$1(ArtifactFile artifactFile, MutableState<String> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.$artifact = artifactFile;
        this.$renameText$delegate = mutableState;
        this.$showRenameDialog$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState<String> mutableState = this.$renameText$delegate;
        String str = this.$artifact.name;
        int i = HatchLibraryTabScreenKt.ARTIFACTS_TAB_INDEX;
        mutableState.Af8(str);
        MutableState.A09(true, this.$showRenameDialog$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
