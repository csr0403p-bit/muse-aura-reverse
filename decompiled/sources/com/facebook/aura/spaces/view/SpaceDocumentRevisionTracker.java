package com.facebook.aura.spaces.view;

import X.AbstractC3358CGz;
import X.C06H;
import X.C7384Etj;
import X.InterfaceC7549F2g;
import com.facebook.aura.model.SpaceConstructionStatus;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class SpaceDocumentRevisionTracker implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final Map<String, Revision> revisions = new LinkedHashMap();

    public final class Revision {
        public SpaceConstructionStatus constructionStatus;
        public long value;

        public final SpaceConstructionStatus getConstructionStatus() {
            return this.constructionStatus;
        }

        public final long getValue() {
            return this.value;
        }

        public Revision(SpaceConstructionStatus spaceConstructionStatus, long j) {
            this.constructionStatus = spaceConstructionStatus;
            this.value = j;
        }

        public final void setConstructionStatus(SpaceConstructionStatus spaceConstructionStatus) {
            this.constructionStatus = spaceConstructionStatus;
        }

        public final void setValue(long j) {
            this.value = j;
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        synchronized (this) {
            this.revisions.clear();
        }
    }

    public final synchronized long currentRevision(String str) {
        Revision revision;
        C7384Etj.A0Y(str, 0);
        revision = this.revisions.get(str);
        return revision != null ? revision.value : 0L;
    }

    public final synchronized long recordConstructionStatus(String str, SpaceConstructionStatus spaceConstructionStatus) {
        long j;
        C7384Etj.A0Y(str, 0);
        Revision revision = this.revisions.get(str);
        if (revision == null) {
            j = 0;
            this.revisions.put(str, new Revision(spaceConstructionStatus, 0L));
        } else {
            if (revision.constructionStatus != spaceConstructionStatus) {
                revision.constructionStatus = spaceConstructionStatus;
                revision.value++;
            }
            j = revision.value;
        }
        return j;
    }

    public final class Companion {
        public final SpaceDocumentRevisionTracker getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (SpaceDocumentRevisionTracker) abstractC3358CGz.A03(SpaceDocumentRevisionTracker.class, SpaceDocumentRevisionTracker$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
