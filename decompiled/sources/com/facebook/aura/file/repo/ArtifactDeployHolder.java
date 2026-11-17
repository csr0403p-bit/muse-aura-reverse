package com.facebook.aura.file.repo;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.C06H;
import X.C7384Etj;
import X.InterfaceC7549F2g;
import com.facebook.aura.gateway.HatchFileOperations;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class ArtifactDeployHolder implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final ConcurrentHashMap<String, HatchFileOperations.FetchArtifactUrlResult> deployStatusCache;
    public final Set<String> edited;
    public final Map<String, String> publishedUrls;
    public final Set<String> unpublished;
    public final AbstractC3358CGz userSession;

    public ArtifactDeployHolder(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.publishedUrls = new LinkedHashMap();
        this.unpublished = new LinkedHashSet();
        this.edited = new LinkedHashSet();
        this.deployStatusCache = new ConcurrentHashMap<>();
    }

    public final synchronized ArtifactDeploySnapshot consumeAll(String str) {
        ArtifactDeploySnapshot artifactDeploySnapshot;
        C7384Etj.A0Y(str, 0);
        artifactDeploySnapshot = new ArtifactDeploySnapshot(this.publishedUrls.remove(str), this.unpublished.remove(str), this.edited.remove(str));
        applySnapshotToCache(str, artifactDeploySnapshot);
        return artifactDeploySnapshot;
    }

    public final void invalidateCachedStatus(String str) {
        C7384Etj.A0Y(str, 0);
        this.deployStatusCache.remove(str);
    }

    public final synchronized void onEdited(String str) {
        C7384Etj.A0Y(str, 0);
        this.publishedUrls.remove(str);
        this.edited.add(str);
        this.deployStatusCache.remove(str);
    }

    public final synchronized void onPublished(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.publishedUrls.put(str, str2);
        this.unpublished.remove(str);
        this.edited.remove(str);
        this.deployStatusCache.put(str, new HatchFileOperations.FetchArtifactUrlResult.Success(str2, null));
    }

    public final synchronized void onUnpublished(String str) {
        C7384Etj.A0Y(str, 0);
        this.unpublished.add(str);
        this.publishedUrls.remove(str);
        this.edited.remove(str);
        this.deployStatusCache.remove(str);
    }

    public final synchronized ArtifactDeploySnapshot peekAll(String str) {
        C7384Etj.A0Y(str, 0);
        return new ArtifactDeploySnapshot(this.publishedUrls.get(str), this.unpublished.contains(str), this.edited.contains(str));
    }

    public final HatchFileOperations.FetchArtifactUrlResult peekCachedStatus(String str) {
        C7384Etj.A0Y(str, 0);
        return this.deployStatusCache.get(str);
    }

    public final boolean reserveFetch(String str) {
        C7384Etj.A0Y(str, 0);
        return this.deployStatusCache.putIfAbsent(str, new HatchFileOperations.FetchArtifactUrlResult.Failed("")) == null;
    }

    private final void applySnapshotToCache(String str, ArtifactDeploySnapshot artifactDeploySnapshot) {
        String str2 = artifactDeploySnapshot.publishedUrl;
        if (str2 != null) {
            this.deployStatusCache.put(str, new HatchFileOperations.FetchArtifactUrlResult.Success(str2, null));
        } else if (artifactDeploySnapshot.unpublished || artifactDeploySnapshot.edited) {
            this.deployStatusCache.remove(str);
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.publishedUrls.clear();
        this.unpublished.clear();
        this.edited.clear();
        this.deployStatusCache.clear();
    }

    /* loaded from: classes3.dex */
    public final class Companion {
        public final ArtifactDeployHolder getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ArtifactDeployHolder) abstractC3358CGz.A03(ArtifactDeployHolder.class, new ArtifactDeployHolder$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final void cacheStatus(String str, HatchFileOperations.FetchArtifactUrlResult fetchArtifactUrlResult) {
        AnonymousClass003.A0u(str, fetchArtifactUrlResult);
        this.deployStatusCache.put(str, fetchArtifactUrlResult);
    }
}
