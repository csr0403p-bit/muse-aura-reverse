package com.facebook.aura.library.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass007;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.view.View;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.library.repo.ArtifactsDataSource;
import com.facebook.aura.library.repo.SpaceRenameOutcome;
import com.facebook.aura.library.repo.SpaceRenameResult;
import com.facebook.aura.library.repo.UnifiedArtifactsRepository;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchLibraryTabScreenKt$LibraryItemContextMenu$6$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ArtifactsDataSource $artifactsDataSource;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ String $renameBusyMessage;
    public final /* synthetic */ String $renameFailedMessage;
    public final /* synthetic */ MutableState<String> $renameText$delegate;
    public final /* synthetic */ UnifiedArtifactsRepository $repository;
    public final /* synthetic */ MutableState<Boolean> $showRenameDialog$delegate;
    public final /* synthetic */ String $slug;
    public final /* synthetic */ View $viewRoot;

    @DebugMetadata(c = "com.facebook.aura.library.view.HatchLibraryTabScreenKt$LibraryItemContextMenu$6$1$1", f = "HatchLibraryTabScreen.kt", l = {1104}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.view.HatchLibraryTabScreenKt$LibraryItemContextMenu$6$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ArtifactsDataSource $artifactsDataSource;
        public final /* synthetic */ String $renameBusyMessage;
        public final /* synthetic */ String $renameFailedMessage;
        public final /* synthetic */ UnifiedArtifactsRepository $repository;
        public final /* synthetic */ String $requestedName;
        public final /* synthetic */ MutableState<Boolean> $showRenameDialog$delegate;
        public final /* synthetic */ String $slug;
        public final /* synthetic */ View $viewRoot;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UnifiedArtifactsRepository unifiedArtifactsRepository, String str, String str2, ArtifactsDataSource artifactsDataSource, View view, String str3, String str4, MutableState<Boolean> mutableState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$repository = unifiedArtifactsRepository;
            this.$slug = str;
            this.$requestedName = str2;
            this.$artifactsDataSource = artifactsDataSource;
            this.$viewRoot = view;
            this.$renameBusyMessage = str3;
            this.$renameFailedMessage = str4;
            this.$showRenameDialog$delegate = mutableState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$repository, this.$slug, this.$requestedName, this.$artifactsDataSource, this.$viewRoot, this.$renameBusyMessage, this.$renameFailedMessage, this.$showRenameDialog$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            AuraToast.Companion companion;
            View view;
            String str;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                UnifiedArtifactsRepository unifiedArtifactsRepository = this.$repository;
                String str2 = this.$slug;
                String str3 = this.$requestedName;
                this.label = 1;
                obj = unifiedArtifactsRepository.renameSpace(str2, str3, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            SpaceRenameOutcome spaceRenameOutcome = (SpaceRenameOutcome) obj;
            if (spaceRenameOutcome instanceof SpaceRenameOutcome.Renamed) {
                ArtifactsDataSource artifactsDataSource = this.$artifactsDataSource;
                SpaceRenameResult spaceRenameResult = ((SpaceRenameOutcome.Renamed) spaceRenameOutcome).result;
                artifactsDataSource.applySpaceRename(spaceRenameResult.slug, spaceRenameResult.name);
                MutableState<Boolean> mutableState = this.$showRenameDialog$delegate;
                int i2 = HatchLibraryTabScreenKt.ARTIFACTS_TAB_INDEX;
                MutableState.A09(false, mutableState);
            } else {
                if (C7384Etj.areEqual(spaceRenameOutcome, SpaceRenameOutcome.Busy.INSTANCE)) {
                    companion = AuraToast.Companion;
                    view = this.$viewRoot;
                    str = this.$renameBusyMessage;
                } else {
                    if (!C7384Etj.areEqual(spaceRenameOutcome, SpaceRenameOutcome.Failed.INSTANCE) && !C7384Etj.areEqual(spaceRenameOutcome, SpaceRenameOutcome.Invalid.INSTANCE) && !C7384Etj.areEqual(spaceRenameOutcome, SpaceRenameOutcome.NotFound.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    companion = AuraToast.Companion;
                    view = this.$viewRoot;
                    str = this.$renameFailedMessage;
                }
                AnonymousClass007.A0n(view, companion, str);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLibraryTabScreenKt$LibraryItemContextMenu$6$1(C3UX c3ux, MutableState<String> mutableState, UnifiedArtifactsRepository unifiedArtifactsRepository, String str, ArtifactsDataSource artifactsDataSource, View view, String str2, String str3, MutableState<Boolean> mutableState2) {
        super(0);
        this.$coroutineScope = c3ux;
        this.$renameText$delegate = mutableState;
        this.$repository = unifiedArtifactsRepository;
        this.$slug = str;
        this.$artifactsDataSource = artifactsDataSource;
        this.$viewRoot = view;
        this.$renameBusyMessage = str2;
        this.$renameFailedMessage = str3;
        this.$showRenameDialog$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState<String> mutableState = this.$renameText$delegate;
        int i = HatchLibraryTabScreenKt.ARTIFACTS_TAB_INDEX;
        String strA06 = MutableState.A06((MutableState) mutableState);
        if (strA06.length() != 0) {
            AnonymousClass001.A1J(new AnonymousClass1(this.$repository, this.$slug, strA06, this.$artifactsDataSource, this.$viewRoot, this.$renameBusyMessage, this.$renameFailedMessage, this.$showRenameDialog$delegate, null), this.$coroutineScope);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
