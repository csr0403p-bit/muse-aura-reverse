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
/* loaded from: classes.dex */
public final class IdeaWidgetDetailSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final String ideaId;

    public final class Companion {
        public final C9hr<IdeaWidgetDetailSheetKey> serializer() {
            return IdeaWidgetDetailSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final IdeaWidgetDetailSheetKey copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new IdeaWidgetDetailSheetKey(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof IdeaWidgetDetailSheetKey) && C7384Etj.areEqual(this.ideaId, ((IdeaWidgetDetailSheetKey) obj).ideaId));
    }

    public /* synthetic */ IdeaWidgetDetailSheetKey(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(IdeaWidgetDetailSheetKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.ideaId = str;
    }

    public static /* synthetic */ IdeaWidgetDetailSheetKey copy$default(IdeaWidgetDetailSheetKey ideaWidgetDetailSheetKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ideaWidgetDetailSheetKey.ideaId;
        }
        C7384Etj.A0Y(str, 0);
        return new IdeaWidgetDetailSheetKey(str);
    }

    public final String component1() {
        return this.ideaId;
    }

    public final String getIdeaId() {
        return this.ideaId;
    }

    public int hashCode() {
        return this.ideaId.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public IdeaWidgetDetailSheetKey(String str) {
        C7384Etj.A0Y(str, 0);
        this.ideaId = str;
    }
}
