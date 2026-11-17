package com.facebook.aura.explore.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class IdeaCardExecuteRequestJson extends C06G {
    public final List<String> itemIds;
    public final String mode;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, AbstractC5321DgF.A02(C79.A01, IdeaCardExecuteRequestJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final IdeaCardExecuteRequestJson full() {
            return new IdeaCardExecuteRequestJson("full", null);
        }

        public final IdeaCardExecuteRequestJson selectedItems(List<String> list) {
            C7384Etj.A0Y(list, 0);
            return new IdeaCardExecuteRequestJson("selectedItems", list);
        }

        public final C9hr<IdeaCardExecuteRequestJson> serializer() {
            return IdeaCardExecuteRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public IdeaCardExecuteRequestJson(String str, List<String> list) {
        C7384Etj.A0Y(str, 0);
        this.mode = str;
        this.itemIds = list;
    }

    public final IdeaCardExecuteRequestJson copy(String str, List<String> list) {
        C7384Etj.A0Y(str, 0);
        return new IdeaCardExecuteRequestJson(str, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaCardExecuteRequestJson) {
                IdeaCardExecuteRequestJson ideaCardExecuteRequestJson = (IdeaCardExecuteRequestJson) obj;
                if (!C7384Etj.areEqual(this.mode, ideaCardExecuteRequestJson.mode) || !C7384Etj.areEqual(this.itemIds, ideaCardExecuteRequestJson.itemIds)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ IdeaCardExecuteRequestJson copy$default(IdeaCardExecuteRequestJson ideaCardExecuteRequestJson, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ideaCardExecuteRequestJson.mode;
        }
        if ((i & 2) != 0) {
            list = ideaCardExecuteRequestJson.itemIds;
        }
        C7384Etj.A0Y(str, 0);
        return new IdeaCardExecuteRequestJson(str, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(IdeaCardExecuteRequestJson ideaCardExecuteRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(ideaCardExecuteRequestJson.mode, c9iZ, 0);
        if (c9j5.AfR() || ideaCardExecuteRequestJson.itemIds != null) {
            c9j5.AAP(ideaCardExecuteRequestJson.itemIds, C06G.A0e(f0cArr, 1), c9iZ, 1);
        }
    }

    public final String component1() {
        return this.mode;
    }

    public final List<String> component2() {
        return this.itemIds;
    }

    public final List<String> getItemIds() {
        return this.itemIds;
    }

    public final String getMode() {
        return this.mode;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.mode) + AnonymousClass006.A0D(this.itemIds);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ IdeaCardExecuteRequestJson(String str, List list, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : list);
    }

    public /* synthetic */ IdeaCardExecuteRequestJson(int i, String str, List list, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(IdeaCardExecuteRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.mode = str;
        this.itemIds = (i & 2) == 0 ? null : list;
    }
}
