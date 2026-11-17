package com.facebook.aura.conversation.view;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.explore.repo.IdeaCardDetail;

/* loaded from: classes.dex */
public final class SeededIdeaDetail extends C06G {
    public static final int $stable = 8;
    public final IdeaCardDetail detail;
    public final boolean isExecutable;

    public SeededIdeaDetail(IdeaCardDetail ideaCardDetail, boolean z) {
        C7384Etj.A0Y(ideaCardDetail, 0);
        this.detail = ideaCardDetail;
        this.isExecutable = z;
    }

    public final SeededIdeaDetail copy(IdeaCardDetail ideaCardDetail, boolean z) {
        C7384Etj.A0Y(ideaCardDetail, 0);
        return new SeededIdeaDetail(ideaCardDetail, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SeededIdeaDetail) {
                SeededIdeaDetail seededIdeaDetail = (SeededIdeaDetail) obj;
                if (!C7384Etj.areEqual(this.detail, seededIdeaDetail.detail) || this.isExecutable != seededIdeaDetail.isExecutable) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SeededIdeaDetail copy$default(SeededIdeaDetail seededIdeaDetail, IdeaCardDetail ideaCardDetail, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            ideaCardDetail = seededIdeaDetail.detail;
        }
        if ((i & 2) != 0) {
            z = seededIdeaDetail.isExecutable;
        }
        C7384Etj.A0Y(ideaCardDetail, 0);
        return new SeededIdeaDetail(ideaCardDetail, z);
    }

    public final IdeaCardDetail component1() {
        return this.detail;
    }

    public final boolean component2() {
        return this.isExecutable;
    }

    public final IdeaCardDetail getDetail() {
        return this.detail;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0E(this.detail), this.isExecutable);
    }

    public final boolean isExecutable() {
        return this.isExecutable;
    }

    public String toString() {
        return super.toString();
    }
}
