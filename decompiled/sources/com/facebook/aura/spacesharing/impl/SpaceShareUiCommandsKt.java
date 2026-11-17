package com.facebook.aura.spacesharing.impl;

import X.AbstractC3358CGz;
import com.facebook.aura.library.repo.ArtifactSource;
import com.facebook.aura.library.repo.UnifiedArtifact;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.utils.HatchUtils;

/* loaded from: classes.dex */
public abstract class SpaceShareUiCommandsKt {
    public static final String ERROR_CODE_NOT_FOUND = "not_found";
    public static final String ERROR_CODE_UNAVAILABLE = "unavailable";
    public static final String ERROR_CODE_UNSUPPORTED = "unsupported";
    public static final String SPACE_SLUG_PARAM = "space_slug";
    public static final String UI_NAVIGATE_SPACE_SHARE = "ui.navigate.space.share";

    public static final boolean canOpenShareSettings(UnifiedArtifact unifiedArtifact, AbstractC3358CGz abstractC3358CGz) {
        if (unifiedArtifact.source != ArtifactSource.SAVED_SPACE && unifiedArtifact.canShare) {
            HatchUtil hatchUtil = HatchUtil.INSTANCE;
            if (hatchUtil.isArtifactSharingEnabled() && !HatchUtils.INSTANCE.hidesSpaceSharingWithPeople(abstractC3358CGz) && hatchUtil.isConnectionsTabEnabled()) {
                return true;
            }
        }
        return false;
    }
}
