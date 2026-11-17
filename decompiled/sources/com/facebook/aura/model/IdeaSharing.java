package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class IdeaSharing extends C06G {
    public static final int $stable = 0;
    public final IdeaSharingKind kind;
    public final String targetIdeaId;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {AbstractC5321DgF.A02(C79.A01, IdeaSharing$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<IdeaSharing> serializer() {
            return IdeaSharing$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public IdeaSharing(IdeaSharingKind ideaSharingKind, String str) {
        C7384Etj.A0Y(ideaSharingKind, 0);
        this.kind = ideaSharingKind;
        this.targetIdeaId = str;
    }

    public final IdeaSharing copy(IdeaSharingKind ideaSharingKind, String str) {
        C7384Etj.A0Y(ideaSharingKind, 0);
        return new IdeaSharing(ideaSharingKind, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaSharing) {
                IdeaSharing ideaSharing = (IdeaSharing) obj;
                if (this.kind != ideaSharing.kind || !C7384Etj.areEqual(this.targetIdeaId, ideaSharing.targetIdeaId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ IdeaSharing copy$default(IdeaSharing ideaSharing, IdeaSharingKind ideaSharingKind, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            ideaSharingKind = ideaSharing.kind;
        }
        if ((i & 2) != 0) {
            str = ideaSharing.targetIdeaId;
        }
        C7384Etj.A0Y(ideaSharingKind, 0);
        return new IdeaSharing(ideaSharingKind, str);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(IdeaSharing ideaSharing, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || ideaSharing.kind != IdeaSharingKind.UNAVAILABLE) {
            c9j5.AAQ(ideaSharing.kind, C06G.A0e(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || ideaSharing.targetIdeaId != null) {
            c9j5.AAP(ideaSharing.targetIdeaId, C07779iq.A01, c9iZ, 1);
        }
    }

    public final IdeaSharingKind component1() {
        return this.kind;
    }

    public final String component2() {
        return this.targetIdeaId;
    }

    public final boolean getCanShare() {
        IdeaSharingKind ideaSharingKind = this.kind;
        return ideaSharingKind == IdeaSharingKind.CATALOG || ideaSharingKind == IdeaSharingKind.GENERALIZED || ideaSharingKind == IdeaSharingKind.DIRECT;
    }

    public final IdeaSharingKind getKind() {
        return this.kind;
    }

    public final String getTargetIdeaId() {
        return this.targetIdeaId;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.kind) + AnonymousClass006.A0G(this.targetIdeaId);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ IdeaSharing(IdeaSharingKind ideaSharingKind, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? IdeaSharingKind.UNAVAILABLE : ideaSharingKind, AnonymousClass006.A0s(i, str));
    }

    public /* synthetic */ IdeaSharing(int i, IdeaSharingKind ideaSharingKind, String str, C2hx c2hx) {
        this.kind = (i & 1) == 0 ? IdeaSharingKind.UNAVAILABLE : ideaSharingKind;
        if ((i & 2) == 0) {
            this.targetIdeaId = null;
        } else {
            this.targetIdeaId = str;
        }
    }

    public IdeaSharing() {
        this(IdeaSharingKind.UNAVAILABLE, null);
    }
}
