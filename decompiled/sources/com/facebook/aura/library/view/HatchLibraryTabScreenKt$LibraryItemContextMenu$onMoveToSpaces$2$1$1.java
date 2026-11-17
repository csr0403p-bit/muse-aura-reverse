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
import com.facebook.aura.library.repo.ArtifactPlacementOutcome;
import com.facebook.aura.library.repo.ArtifactPlacementRequest;
import com.facebook.aura.library.repo.UnifiedArtifactsRepository;
import com.facebook.aura.spaces.menu.SpacesSidebarAnalytics;
import com.facebook.aura.spaces.repo.PinnedItemsRepository;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchLibraryTabScreenKt$LibraryItemContextMenu$onMoveToSpaces$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ String $moveFailedMessage;
    public final /* synthetic */ Function0<Unit> $onArtifactDeleted;
    public final /* synthetic */ PinnedItemsRepository $pinnedItemsRepository;
    public final /* synthetic */ UnifiedArtifactsRepository $repository;
    public final /* synthetic */ ArtifactPlacementRequest $request;
    public final /* synthetic */ String $sidebarFullMessage;
    public final /* synthetic */ View $viewRoot;

    @DebugMetadata(c = "com.facebook.aura.library.view.HatchLibraryTabScreenKt$LibraryItemContextMenu$onMoveToSpaces$2$1$1$1", f = "HatchLibraryTabScreen.kt", l = {1031, 1033}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.view.HatchLibraryTabScreenKt$LibraryItemContextMenu$onMoveToSpaces$2$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $moveFailedMessage;
        public final /* synthetic */ Function0<Unit> $onArtifactDeleted;
        public final /* synthetic */ PinnedItemsRepository $pinnedItemsRepository;
        public final /* synthetic */ UnifiedArtifactsRepository $repository;
        public final /* synthetic */ ArtifactPlacementRequest $request;
        public final /* synthetic */ String $sidebarFullMessage;
        public final /* synthetic */ View $viewRoot;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UnifiedArtifactsRepository unifiedArtifactsRepository, ArtifactPlacementRequest artifactPlacementRequest, PinnedItemsRepository pinnedItemsRepository, Function0<Unit> function0, View view, String str, String str2, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$repository = unifiedArtifactsRepository;
            this.$request = artifactPlacementRequest;
            this.$pinnedItemsRepository = pinnedItemsRepository;
            this.$onArtifactDeleted = function0;
            this.$viewRoot = view;
            this.$sidebarFullMessage = str;
            this.$moveFailedMessage = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$repository, this.$request, this.$pinnedItemsRepository, this.$onArtifactDeleted, this.$viewRoot, this.$sidebarFullMessage, this.$moveFailedMessage, htJ);
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
                ArtifactPlacementRequest artifactPlacementRequest = this.$request;
                this.label = 1;
                obj = unifiedArtifactsRepository.setArtifactPlacement(artifactPlacementRequest, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    this.$onArtifactDeleted.invoke();
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            if (C7384Etj.areEqual(obj, ArtifactPlacementOutcome.Moved.INSTANCE)) {
                PinnedItemsRepository pinnedItemsRepository = this.$pinnedItemsRepository;
                this.label = 2;
                if (pinnedItemsRepository.m2183refreshNavigationOrderIoAF18A(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
                this.$onArtifactDeleted.invoke();
                return Unit.INSTANCE;
            }
            if (C7384Etj.areEqual(obj, ArtifactPlacementOutcome.SidebarFull.INSTANCE)) {
                companion = AuraToast.Companion;
                view = this.$viewRoot;
                str = this.$sidebarFullMessage;
            } else {
                if (!C7384Etj.areEqual(obj, ArtifactPlacementOutcome.ArtifactChanged.INSTANCE) && !C7384Etj.areEqual(obj, ArtifactPlacementOutcome.Forbidden.INSTANCE) && !C7384Etj.areEqual(obj, ArtifactPlacementOutcome.Unavailable.INSTANCE) && !C7384Etj.areEqual(obj, ArtifactPlacementOutcome.Uncertain.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                companion = AuraToast.Companion;
                view = this.$viewRoot;
                str = this.$moveFailedMessage;
            }
            AnonymousClass007.A0n(view, companion, str);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLibraryTabScreenKt$LibraryItemContextMenu$onMoveToSpaces$2$1$1(ArtifactPlacementRequest artifactPlacementRequest, C3UX c3ux, UnifiedArtifactsRepository unifiedArtifactsRepository, PinnedItemsRepository pinnedItemsRepository, Function0<Unit> function0, View view, String str, String str2) {
        super(0);
        this.$request = artifactPlacementRequest;
        this.$coroutineScope = c3ux;
        this.$repository = unifiedArtifactsRepository;
        this.$pinnedItemsRepository = pinnedItemsRepository;
        this.$onArtifactDeleted = function0;
        this.$viewRoot = view;
        this.$sidebarFullMessage = str;
        this.$moveFailedMessage = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SpacesSidebarAnalytics.INSTANCE.logMoveFromLibrary(this.$request);
        AnonymousClass001.A1J(new AnonymousClass1(this.$repository, this.$request, this.$pinnedItemsRepository, this.$onArtifactDeleted, this.$viewRoot, this.$sidebarFullMessage, this.$moveFailedMessage, null), this.$coroutineScope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
