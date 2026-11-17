package com.facebook.aura.library.repo;

import X.AnonymousClass003;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ArtifactItemKt {
    public static final ArtifactItem findSpaceBySlug(List<ArtifactItem> list, String str) {
        ArtifactItem next;
        ArtifactSource artifactSource;
        AnonymousClass003.A0u(list, str);
        Iterator<ArtifactItem> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ArtifactItem artifactItem = next;
            if (str.equals(artifactItem.itemKey) && ((artifactSource = artifactItem.source) == ArtifactSource.SPACE || artifactSource == ArtifactSource.SAVED_SPACE)) {
                break;
            }
        }
        return next;
    }
}
