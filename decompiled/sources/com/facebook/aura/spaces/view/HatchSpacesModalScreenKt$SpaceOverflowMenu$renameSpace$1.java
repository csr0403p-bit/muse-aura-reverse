package com.facebook.aura.spaces.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass007;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
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

@DebugMetadata(c = "com.facebook.aura.spaces.view.HatchSpacesModalScreenKt$SpaceOverflowMenu$renameSpace$1", f = "HatchSpacesModalScreen.kt", l = {734}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchSpacesModalScreenKt$SpaceOverflowMenu$renameSpace$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ ArtifactsDataSource $artifactsDataSource;
    public final /* synthetic */ UnifiedArtifactsRepository $artifactsRepository;
    public final /* synthetic */ String $name;
    public final /* synthetic */ G0U<String, Unit> $onRenamed;
    public final /* synthetic */ String $renameBusyMessage;
    public final /* synthetic */ String $renameFailedMessage;
    public final /* synthetic */ MutableState<Boolean> $showRenameDialog$delegate;
    public final /* synthetic */ String $slug;
    public final /* synthetic */ View $viewRoot;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSpacesModalScreenKt$SpaceOverflowMenu$renameSpace$1(UnifiedArtifactsRepository unifiedArtifactsRepository, String str, String str2, ArtifactsDataSource artifactsDataSource, G0U<? super String, Unit> g0u, View view, String str3, String str4, MutableState<Boolean> mutableState, HtJ<? super HatchSpacesModalScreenKt$SpaceOverflowMenu$renameSpace$1> htJ) {
        super(2, htJ);
        this.$artifactsRepository = unifiedArtifactsRepository;
        this.$slug = str;
        this.$name = str2;
        this.$artifactsDataSource = artifactsDataSource;
        this.$onRenamed = g0u;
        this.$viewRoot = view;
        this.$renameBusyMessage = str3;
        this.$renameFailedMessage = str4;
        this.$showRenameDialog$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchSpacesModalScreenKt$SpaceOverflowMenu$renameSpace$1(this.$artifactsRepository, this.$slug, this.$name, this.$artifactsDataSource, this.$onRenamed, this.$viewRoot, this.$renameBusyMessage, this.$renameFailedMessage, this.$showRenameDialog$delegate, htJ);
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
            String str2 = this.$slug;
            String str3 = this.$name;
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
            SpaceRenameOutcome.Renamed renamed = (SpaceRenameOutcome.Renamed) spaceRenameOutcome;
            SpaceRenameResult spaceRenameResult = renamed.result;
            artifactsDataSource.applySpaceRename(spaceRenameResult.slug, spaceRenameResult.name);
            this.$onRenamed.invoke(renamed.result.name);
            MutableState.A09(false, this.$showRenameDialog$delegate);
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
        return ((HatchSpacesModalScreenKt$SpaceOverflowMenu$renameSpace$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
