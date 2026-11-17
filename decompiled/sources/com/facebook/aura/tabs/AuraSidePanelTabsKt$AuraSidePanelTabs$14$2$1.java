package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import X.C3UX;
import android.view.View;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.library.repo.ArtifactsDataSource;
import com.facebook.aura.library.repo.UnifiedArtifactsRepository;
import com.facebook.aura.tabs.AuraTabItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSidePanelTabsKt$AuraSidePanelTabs$14$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ArtifactsDataSource $artifactsDataSource;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ String $renameBusyMessage;
    public final /* synthetic */ String $renameFailedMessage;
    public final /* synthetic */ MutableState<AuraTabItem.Space> $renameTarget$delegate;
    public final /* synthetic */ MutableState<String> $renameText$delegate;
    public final /* synthetic */ AuraTabItem.Space $target;
    public final /* synthetic */ UnifiedArtifactsRepository $unifiedArtifactsRepository;
    public final /* synthetic */ View $viewRoot;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSidePanelTabsKt$AuraSidePanelTabs$14$2$1(AuraTabItem.Space space, MutableState<String> mutableState, C3UX c3ux, UnifiedArtifactsRepository unifiedArtifactsRepository, ArtifactsDataSource artifactsDataSource, View view, String str, String str2, MutableState<AuraTabItem.Space> mutableState2) {
        super(0);
        this.$target = space;
        this.$renameText$delegate = mutableState;
        this.$coroutineScope = c3ux;
        this.$unifiedArtifactsRepository = unifiedArtifactsRepository;
        this.$artifactsDataSource = artifactsDataSource;
        this.$viewRoot = view;
        this.$renameBusyMessage = str;
        this.$renameFailedMessage = str2;
        this.$renameTarget$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String strA06 = MutableState.A06((MutableState) this.$renameText$delegate);
        if (strA06.length() > 0) {
            AuraSidePanelTabsKt.AuraSidePanelTabs$renameSpace(this.$coroutineScope, this.$unifiedArtifactsRepository, this.$artifactsDataSource, this.$viewRoot, this.$renameBusyMessage, this.$renameFailedMessage, this.$renameTarget$delegate, this.$target.artifact.itemKey, strA06);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
