package com.facebook.aura.library.model;

import X.AbstractC3358CGz;
import X.FGI;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.library.repo.ArtifactSource;

/* loaded from: classes3.dex */
public abstract class ArtifactsViewModelKt {
    public static final ArtifactFile toArtifactFile(HatchFileOperations.LibraryEntry libraryEntry, AbstractC3358CGz abstractC3358CGz) {
        String strA0M = FGI.A0M("artifact_", libraryEntry.getNormalizedPath());
        return new ArtifactFile(strA0M, HatchFileUIUtils.INSTANCE.displayNameForPath(libraryEntry.getNormalizedPath()), libraryEntry.getNormalizedPath(), libraryEntry.getSizeOrNull(), libraryEntry.getModifiedAtIso(), WorkspaceUriResolver.INSTANCE.resolveRawAssetUrl(libraryEntry.getNormalizedPath(), abstractC3358CGz), null, null, null, false, null, 0L, false, false, false, ArtifactSource.LIBRARY, strA0M, null, null, null, null, null, true);
    }
}
