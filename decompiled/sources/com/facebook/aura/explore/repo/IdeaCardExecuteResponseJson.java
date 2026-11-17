package com.facebook.aura.explore.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class IdeaCardExecuteResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String cardId;
    public final String executionId;
    public final String status;

    public final class Companion {
        public final C9hr<IdeaCardExecuteResponseJson> serializer() {
            return IdeaCardExecuteResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(IdeaCardExecuteResponseJson ideaCardExecuteResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(ideaCardExecuteResponseJson.cardId)) {
            c9j5.AAV(ideaCardExecuteResponseJson.cardId, c9iZ, 0);
        }
        if (zAfR || !"".equals(ideaCardExecuteResponseJson.executionId)) {
            c9j5.AAV(ideaCardExecuteResponseJson.executionId, c9iZ, 1);
        }
        if (zAfR || !"".equals(ideaCardExecuteResponseJson.status)) {
            c9j5.AAV(ideaCardExecuteResponseJson.status, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaCardExecuteResponseJson) {
                IdeaCardExecuteResponseJson ideaCardExecuteResponseJson = (IdeaCardExecuteResponseJson) obj;
                if (!C7384Etj.areEqual(this.cardId, ideaCardExecuteResponseJson.cardId) || !C7384Etj.areEqual(this.executionId, ideaCardExecuteResponseJson.executionId) || !C7384Etj.areEqual(this.status, ideaCardExecuteResponseJson.status)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ IdeaCardExecuteResponseJson copy$default(IdeaCardExecuteResponseJson ideaCardExecuteResponseJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ideaCardExecuteResponseJson.cardId;
        }
        if ((i & 2) != 0) {
            str2 = ideaCardExecuteResponseJson.executionId;
        }
        if ((i & 4) != 0) {
            str3 = ideaCardExecuteResponseJson.status;
        }
        return ideaCardExecuteResponseJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.cardId;
    }

    public final String component2() {
        return this.executionId;
    }

    public final String component3() {
        return this.status;
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final String getExecutionId() {
        return this.executionId;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.status, AnonymousClass005.A0I(this.executionId, AnonymousClass001.A0G(this.cardId)));
    }

    public final IdeaCardExecuteResult toDomain() {
        return new IdeaCardExecuteResult(this.cardId, this.executionId, IdeaCardExecuteStatus.Companion.fromWire(this.status));
    }

    public IdeaCardExecuteResponseJson(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.cardId = str;
        this.executionId = str2;
        this.status = str3;
    }

    public final IdeaCardExecuteResponseJson copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new IdeaCardExecuteResponseJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ IdeaCardExecuteResponseJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public /* synthetic */ IdeaCardExecuteResponseJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.cardId = "";
        } else {
            this.cardId = str;
        }
        if ((i & 2) == 0) {
            this.executionId = "";
        } else {
            this.executionId = str2;
        }
        if ((i & 4) == 0) {
            this.status = "";
        } else {
            this.status = str3;
        }
    }

    public IdeaCardExecuteResponseJson() {
        this("", "", "");
    }
}
