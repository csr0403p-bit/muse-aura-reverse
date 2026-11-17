package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C3UX;
import X.C7BY;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentTypeDetector;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.library.repo.ArtifactOpenTarget;
import com.facebook.aura.library.repo.UnifiedArtifactsRepository;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.SpacesModalScreenKey;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchMessageItemKt$HatchMessageItem$10$2$1", f = "HatchMessageItem.kt", l = {697}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchMessageItemKt$HatchMessageItem$10$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<String> $inlineFileViewerUrl$delegate;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $url;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageItemKt$HatchMessageItem$10$2$1(String str, AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator, HatchMessageUiModel hatchMessageUiModel, MutableState<String> mutableState, HtJ<? super HatchMessageItemKt$HatchMessageItem$10$2$1> htJ) {
        super(2, htJ);
        this.$url = str;
        this.$userSession = abstractC3358CGz;
        this.$navigator = auraNavigator;
        this.$message = hatchMessageUiModel;
        this.$inlineFileViewerUrl$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchMessageItemKt$HatchMessageItem$10$2$1 hatchMessageItemKt$HatchMessageItem$10$2$1 = new HatchMessageItemKt$HatchMessageItem$10$2$1(this.$url, this.$userSession, this.$navigator, this.$message, this.$inlineFileViewerUrl$delegate, htJ);
        hatchMessageItemKt$HatchMessageItem$10$2$1.L$0 = obj;
        return hatchMessageItemKt$HatchMessageItem$10$2$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        String strResolvePreviewPathFromUrl;
        Object objOpenTargetForOriginalFilePath = obj;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(objOpenTargetForOriginalFilePath);
            strResolvePreviewPathFromUrl = HatchFileUIUtils.INSTANCE.resolvePreviewPathFromUrl(this.$url);
            if (strResolvePreviewPathFromUrl == null) {
                this.$inlineFileViewerUrl$delegate.Af8(null);
                return Unit.INSTANCE;
            }
            UnifiedArtifactsRepository companion = UnifiedArtifactsRepository.Companion.getInstance(this.$userSession);
            this.L$0 = null;
            this.L$1 = strResolvePreviewPathFromUrl;
            this.label = 1;
            objOpenTargetForOriginalFilePath = companion.openTargetForOriginalFilePath(strResolvePreviewPathFromUrl, this);
            if (objOpenTargetForOriginalFilePath == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            strResolvePreviewPathFromUrl = (String) this.L$1;
            Hwg.A00(objOpenTargetForOriginalFilePath);
        }
        ArtifactOpenTarget artifactOpenTarget = (ArtifactOpenTarget) objOpenTargetForOriginalFilePath;
        if (artifactOpenTarget instanceof ArtifactOpenTarget.Space) {
            this.$navigator.navigate(new SpacesModalScreenKey(((ArtifactOpenTarget.Space) artifactOpenTarget).slug, null, false), LaunchFlag.BRING_TO_FRONT);
            this.$inlineFileViewerUrl$delegate.Af8(null);
            return Unit.INSTANCE;
        }
        if (artifactOpenTarget instanceof ArtifactOpenTarget.SavedSpace) {
            this.$navigator.navigate(new SpacesModalScreenKey(((ArtifactOpenTarget.SavedSpace) artifactOpenTarget).shortcode, null, false), LaunchFlag.BRING_TO_FRONT);
            this.$inlineFileViewerUrl$delegate.Af8(null);
            return Unit.INSTANCE;
        }
        AnonymousClass006.A1C(new ContentItem(C7BY.A0V(strResolvePreviewPathFromUrl, CustomConnectorRegisterRepositoryKt.ROOT_PATH, strResolvePreviewPathFromUrl), ContentTypeDetector.INSTANCE.fromFileName(strResolvePreviewPathFromUrl), strResolvePreviewPathFromUrl, WorkspaceUriResolver.INSTANCE.resolveRawAssetUrl(strResolvePreviewPathFromUrl, this.$userSession), null, null, this.$message.id, null, null, false, null, null, null, null, null), this.$navigator);
        this.$inlineFileViewerUrl$delegate.Af8(null);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchMessageItemKt$HatchMessageItem$10$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
