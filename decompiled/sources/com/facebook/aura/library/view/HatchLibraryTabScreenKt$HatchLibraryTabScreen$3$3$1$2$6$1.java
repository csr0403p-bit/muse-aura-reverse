package com.facebook.aura.library.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass007;
import X.C7384Etj;
import X.G0U;
import X.HxE;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSpaceEntryPoint;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.library.model.ArtifactFile;
import com.facebook.aura.library.repo.ArtifactOpenTarget;
import com.facebook.aura.library.repo.ArtifactSource;
import com.facebook.aura.library.repo.UnifiedArtifactKt;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.PeerSpaceScreenKey;
import com.facebook.aura.navigation.key.SpacesModalScreenKey;
import com.facebook.aura.spaces.menu.SpacesSidebarAnalytics;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3$1$2$6$1 extends AbstractC7559F3s implements G0U<ArtifactFile, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ MutableState<ArtifactFile> $selectedArtifactFile$delegate;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ArtifactFile artifactFile) {
        AuraNavigator auraNavigator;
        AuraNavKey spacesModalScreenKey;
        C7384Etj.A0Y(artifactFile, 0);
        String str = artifactFile.spaceSlug;
        ArtifactOpenTarget.PeerSpace peerSpacePeerSpaceTargetFromItemKey = artifactFile.source == ArtifactSource.PEER_SPACE ? UnifiedArtifactKt.peerSpaceTargetFromItemKey(artifactFile.displayPath) : null;
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.LIBRARY;
        HatchScreen hatchScreen = HatchScreen.LIBRARY_HOME;
        if (peerSpacePeerSpaceTargetFromItemKey != null) {
            hatchInteractionLogger.logClick(hatchSurface, null, hatchScreen, HatchComponent.SPACE_CARD, null, AnonymousClass007.A0c(HatchMetadataKey.ARTIFACT_TYPE, "space"), null);
            auraNavigator = this.$navigator;
            spacesModalScreenKey = new PeerSpaceScreenKey(peerSpacePeerSpaceTargetFromItemKey.hostMuse, peerSpacePeerSpaceTargetFromItemKey.spaceId, artifactFile.name, artifactFile.publisherName, false);
        } else {
            if (str == null) {
                HatchComponent hatchComponent = HatchComponent.LIBRARY_FILE_ITEM;
                HxE hxE = new HxE(HatchMetadataKey.ARTIFACT_TYPE.getValue(), "file");
                String value = HatchMetadataKey.FILE_TYPE.getValue();
                String fileExtension = artifactFile.getFileExtension();
                if (fileExtension.length() == 0) {
                    fileExtension = "html";
                }
                hatchInteractionLogger.logClick(hatchSurface, null, hatchScreen, hatchComponent, null, AnonymousClass007.A0d(value, fileExtension, hxE), null);
                MutableState<ArtifactFile> mutableState = this.$selectedArtifactFile$delegate;
                int i = HatchLibraryTabScreenKt.ARTIFACTS_TAB_INDEX;
                mutableState.Af8(artifactFile);
                return;
            }
            hatchInteractionLogger.logClick(hatchSurface, null, hatchScreen, HatchComponent.SPACE_CARD, null, AnonymousClass007.A0c(HatchMetadataKey.ARTIFACT_TYPE, "space"), null);
            SpacesSidebarAnalytics.INSTANCE.recordOpenOrigin(this.$userSession, str, HatchSpaceEntryPoint.LIBRARY);
            auraNavigator = this.$navigator;
            spacesModalScreenKey = new SpacesModalScreenKey(str, null, false);
        }
        auraNavigator.navigate(spacesModalScreenKey, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3$1$2$6$1(AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, MutableState<ArtifactFile> mutableState) {
        super(1);
        this.$navigator = auraNavigator;
        this.$userSession = abstractC3358CGz;
        this.$selectedArtifactFile$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ArtifactFile artifactFile) {
        invoke2(artifactFile);
        return Unit.INSTANCE;
    }
}
