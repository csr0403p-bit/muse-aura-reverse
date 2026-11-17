package com.facebook.aura.spaces.view;

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

@DebugMetadata(c = "com.facebook.aura.spaces.view.HatchSpacesModalScreenKt$SpaceOverflowMenu$moveSpace$2", f = "HatchSpacesModalScreen.kt", l = {707, 709}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchSpacesModalScreenKt$SpaceOverflowMenu$moveSpace$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ UnifiedArtifactsRepository $artifactsRepository;
    public final /* synthetic */ String $moveFailedMessage;
    public final /* synthetic */ PinnedItemsRepository $pinnedItemsRepository;
    public final /* synthetic */ ArtifactPlacementRequest $request;
    public final /* synthetic */ String $sidebarFullMessage;
    public final /* synthetic */ View $viewRoot;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSpacesModalScreenKt$SpaceOverflowMenu$moveSpace$2(UnifiedArtifactsRepository unifiedArtifactsRepository, ArtifactPlacementRequest artifactPlacementRequest, PinnedItemsRepository pinnedItemsRepository, View view, String str, String str2, HtJ<? super HatchSpacesModalScreenKt$SpaceOverflowMenu$moveSpace$2> htJ) {
        super(2, htJ);
        this.$artifactsRepository = unifiedArtifactsRepository;
        this.$request = artifactPlacementRequest;
        this.$pinnedItemsRepository = pinnedItemsRepository;
        this.$viewRoot = view;
        this.$sidebarFullMessage = str;
        this.$moveFailedMessage = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchSpacesModalScreenKt$SpaceOverflowMenu$moveSpace$2(this.$artifactsRepository, this.$request, this.$pinnedItemsRepository, this.$viewRoot, this.$sidebarFullMessage, this.$moveFailedMessage, htJ);
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
            UnifiedArtifactsRepository unifiedArtifactsRepository = this.$artifactsRepository;
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
        } else {
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
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchSpacesModalScreenKt$SpaceOverflowMenu$moveSpace$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
