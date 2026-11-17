package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class IdeaSharingJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String kind;
    public final String targetIdeaId;

    /* loaded from: classes3.dex */
    public final class Companion {
        public final C9hr<IdeaSharingJson> serializer() {
            return IdeaSharingJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public IdeaSharingJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.kind = str;
        this.targetIdeaId = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(IdeaSharingJson ideaSharingJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(ideaSharingJson.kind)) {
            c9j5.AAV(ideaSharingJson.kind, c9iZ, 0);
        }
        if (zAfR || ideaSharingJson.targetIdeaId != null) {
            c9j5.AAP(ideaSharingJson.targetIdeaId, C07779iq.A01, c9iZ, 1);
        }
    }

    public final IdeaSharingJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new IdeaSharingJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaSharingJson) {
                IdeaSharingJson ideaSharingJson = (IdeaSharingJson) obj;
                if (!C7384Etj.areEqual(this.kind, ideaSharingJson.kind) || !C7384Etj.areEqual(this.targetIdeaId, ideaSharingJson.targetIdeaId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ IdeaSharingJson copy$default(IdeaSharingJson ideaSharingJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ideaSharingJson.kind;
        }
        if ((i & 2) != 0) {
            str2 = ideaSharingJson.targetIdeaId;
        }
        C7384Etj.A0Y(str, 0);
        return new IdeaSharingJson(str, str2);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.targetIdeaId;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getTargetIdeaId() {
        return this.targetIdeaId;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.kind) + AnonymousClass006.A0G(this.targetIdeaId);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.model.IdeaSharing toDomain() {
        /*
            r4 = this;
            java.lang.String r2 = r4.kind
            int r1 = r2.hashCode()
            r0 = -1331586071(0xffffffffb0a19be9, float:-1.1758604E-9)
            if (r1 == r0) goto L3d
            r0 = 555704345(0x211f6019, float:5.399848E-19)
            if (r1 == r0) goto L32
            r0 = 879486584(0x346be678, float:2.1969925E-7)
            if (r1 != r0) goto L48
            java.lang.String r0 = "generalized"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L48
            com.facebook.aura.model.IdeaSharingKind r3 = com.facebook.aura.model.IdeaSharingKind.GENERALIZED
        L1f:
            java.lang.String r2 = r4.targetIdeaId
            r1 = 0
            if (r2 == 0) goto L30
            boolean r0 = X.C7BY.A0j(r2)
            if (r0 != 0) goto L30
        L2a:
            com.facebook.aura.model.IdeaSharing r0 = new com.facebook.aura.model.IdeaSharing
            r0.<init>(r3, r2)
            return r0
        L30:
            r2 = r1
            goto L2a
        L32:
            java.lang.String r0 = "catalog"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L48
            com.facebook.aura.model.IdeaSharingKind r3 = com.facebook.aura.model.IdeaSharingKind.CATALOG
            goto L1f
        L3d:
            java.lang.String r0 = "direct"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L48
            com.facebook.aura.model.IdeaSharingKind r3 = com.facebook.aura.model.IdeaSharingKind.DIRECT
            goto L1f
        L48:
            com.facebook.aura.model.IdeaSharingKind r3 = com.facebook.aura.model.IdeaSharingKind.UNAVAILABLE
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.IdeaSharingJson.toDomain():com.facebook.aura.model.IdeaSharing");
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ IdeaSharingJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, AnonymousClass006.A0s(i, str2));
    }

    public /* synthetic */ IdeaSharingJson(int i, String str, String str2, C2hx c2hx) {
        this.kind = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.targetIdeaId = null;
        } else {
            this.targetIdeaId = str2;
        }
    }

    public IdeaSharingJson() {
        this("", null);
    }
}
