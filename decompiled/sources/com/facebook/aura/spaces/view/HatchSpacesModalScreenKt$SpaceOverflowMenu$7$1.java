package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import X.C3UX;
import X.G0U;
import android.view.View;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.library.repo.ArtifactsDataSource;
import com.facebook.aura.library.repo.UnifiedArtifactsRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSpacesModalScreenKt$SpaceOverflowMenu$7$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ArtifactsDataSource $artifactsDataSource;
    public final /* synthetic */ UnifiedArtifactsRepository $artifactsRepository;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ G0U<String, Unit> $onRenamed;
    public final /* synthetic */ String $renameBusyMessage;
    public final /* synthetic */ String $renameFailedMessage;
    public final /* synthetic */ MutableState<String> $renameText$delegate;
    public final /* synthetic */ MutableState<Boolean> $showRenameDialog$delegate;
    public final /* synthetic */ String $slug;
    public final /* synthetic */ View $viewRoot;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSpacesModalScreenKt$SpaceOverflowMenu$7$1(MutableState<String> mutableState, C3UX c3ux, UnifiedArtifactsRepository unifiedArtifactsRepository, String str, ArtifactsDataSource artifactsDataSource, G0U<? super String, Unit> g0u, View view, String str2, String str3, MutableState<Boolean> mutableState2) {
        super(0);
        this.$renameText$delegate = mutableState;
        this.$coroutineScope = c3ux;
        this.$artifactsRepository = unifiedArtifactsRepository;
        this.$slug = str;
        this.$artifactsDataSource = artifactsDataSource;
        this.$onRenamed = g0u;
        this.$viewRoot = view;
        this.$renameBusyMessage = str2;
        this.$renameFailedMessage = str3;
        this.$showRenameDialog$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String strA06 = MutableState.A06((MutableState) this.$renameText$delegate);
        if (strA06.length() > 0) {
            HatchSpacesModalScreenKt.SpaceOverflowMenu_WHI4liM$renameSpace(this.$coroutineScope, this.$artifactsRepository, this.$slug, this.$artifactsDataSource, this.$onRenamed, this.$viewRoot, this.$renameBusyMessage, this.$renameFailedMessage, this.$showRenameDialog$delegate, strA06);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
