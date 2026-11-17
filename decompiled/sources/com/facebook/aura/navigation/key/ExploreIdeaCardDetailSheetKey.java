package com.facebook.aura.navigation.key;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ExploreIdeaCardDetailSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final String ideaCardId;

    public final class Companion {
        public final C9hr<ExploreIdeaCardDetailSheetKey> serializer() {
            return ExploreIdeaCardDetailSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ExploreIdeaCardDetailSheetKey copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new ExploreIdeaCardDetailSheetKey(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ExploreIdeaCardDetailSheetKey) && C7384Etj.areEqual(this.ideaCardId, ((ExploreIdeaCardDetailSheetKey) obj).ideaCardId));
    }

    public /* synthetic */ ExploreIdeaCardDetailSheetKey(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ExploreIdeaCardDetailSheetKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.ideaCardId = str;
    }

    public static /* synthetic */ ExploreIdeaCardDetailSheetKey copy$default(ExploreIdeaCardDetailSheetKey exploreIdeaCardDetailSheetKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = exploreIdeaCardDetailSheetKey.ideaCardId;
        }
        C7384Etj.A0Y(str, 0);
        return new ExploreIdeaCardDetailSheetKey(str);
    }

    public final String component1() {
        return this.ideaCardId;
    }

    public final String getIdeaCardId() {
        return this.ideaCardId;
    }

    public int hashCode() {
        return this.ideaCardId.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public ExploreIdeaCardDetailSheetKey(String str) {
        C7384Etj.A0Y(str, 0);
        this.ideaCardId = str;
    }
}
