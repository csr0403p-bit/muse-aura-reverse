package com.facebook.aura.library.view;

import X.AbstractC07127nr;
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
import com.facebook.aura.spaces.repo.PinnedItemsRepository;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.library.view.PeerSpaceLibraryItemsKt$PeerSpaceItemContextMenu$4$1$1$1", f = "PeerSpaceLibraryItems.kt", l = {115, 117}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class PeerSpaceLibraryItemsKt$PeerSpaceItemContextMenu$4$1$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $moveFailedMessage;
    public final /* synthetic */ Function0<Unit> $onMoved;
    public final /* synthetic */ PinnedItemsRepository $pinnedItemsRepository;
    public final /* synthetic */ UnifiedArtifactsRepository $repository;
    public final /* synthetic */ ArtifactPlacementRequest $request;
    public final /* synthetic */ String $sidebarFullMessage;
    public final /* synthetic */ View $viewRoot;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerSpaceLibraryItemsKt$PeerSpaceItemContextMenu$4$1$1$1(UnifiedArtifactsRepository unifiedArtifactsRepository, ArtifactPlacementRequest artifactPlacementRequest, PinnedItemsRepository pinnedItemsRepository, Function0<Unit> function0, String str, String str2, View view, HtJ<? super PeerSpaceLibraryItemsKt$PeerSpaceItemContextMenu$4$1$1$1> htJ) {
        super(2, htJ);
        this.$repository = unifiedArtifactsRepository;
        this.$request = artifactPlacementRequest;
        this.$pinnedItemsRepository = pinnedItemsRepository;
        this.$onMoved = function0;
        this.$sidebarFullMessage = str;
        this.$moveFailedMessage = str2;
        this.$viewRoot = view;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PeerSpaceLibraryItemsKt$PeerSpaceItemContextMenu$4$1$1$1(this.$repository, this.$request, this.$pinnedItemsRepository, this.$onMoved, this.$sidebarFullMessage, this.$moveFailedMessage, this.$viewRoot, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
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
                this.$onMoved.invoke();
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
            this.$onMoved.invoke();
            return Unit.INSTANCE;
        }
        if (C7384Etj.areEqual(obj, ArtifactPlacementOutcome.SidebarFull.INSTANCE)) {
            str = this.$sidebarFullMessage;
        } else {
            if (!C7384Etj.areEqual(obj, ArtifactPlacementOutcome.ArtifactChanged.INSTANCE) && !C7384Etj.areEqual(obj, ArtifactPlacementOutcome.Forbidden.INSTANCE) && !C7384Etj.areEqual(obj, ArtifactPlacementOutcome.Unavailable.INSTANCE) && !C7384Etj.areEqual(obj, ArtifactPlacementOutcome.Uncertain.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            str = this.$moveFailedMessage;
        }
        if (str != null) {
            AnonymousClass007.A0n(this.$viewRoot, AuraToast.Companion, str);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((PeerSpaceLibraryItemsKt$PeerSpaceItemContextMenu$4$1$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
