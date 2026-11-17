package com.facebook.aura.skills.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class RecipientPermissionJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String connector;
    public final String connector_action;
    public final RecipientPermissionDisplayJson display;
    public final String kind;
    public final String label;
    public final String mode;
    public final String permission_id;
    public final boolean revocable;
    public final String source;
    public final RecipientPermissionTargetJson target;

    public final class Companion {
        public final C9hr<RecipientPermissionJson> serializer() {
            return RecipientPermissionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ RecipientPermissionJson copy$default(RecipientPermissionJson recipientPermissionJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, RecipientPermissionDisplayJson recipientPermissionDisplayJson, RecipientPermissionTargetJson recipientPermissionTargetJson, int i, Object obj) {
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        boolean z2 = z;
        RecipientPermissionDisplayJson recipientPermissionDisplayJson2 = recipientPermissionDisplayJson;
        RecipientPermissionTargetJson recipientPermissionTargetJson2 = recipientPermissionTargetJson;
        if ((i & 1) != 0) {
            str8 = recipientPermissionJson.permission_id;
        }
        if ((i & 2) != 0) {
            str9 = recipientPermissionJson.kind;
        }
        if ((i & 4) != 0) {
            str10 = recipientPermissionJson.label;
        }
        if ((i & 8) != 0) {
            str11 = recipientPermissionJson.connector;
        }
        if ((i & 16) != 0) {
            str12 = recipientPermissionJson.connector_action;
        }
        if ((i & 32) != 0) {
            str13 = recipientPermissionJson.mode;
        }
        if ((i & 64) != 0) {
            str14 = recipientPermissionJson.source;
        }
        if ((i & 128) != 0) {
            z2 = recipientPermissionJson.revocable;
        }
        if ((i & 256) != 0) {
            recipientPermissionDisplayJson2 = recipientPermissionJson.display;
        }
        if ((i & 512) != 0) {
            recipientPermissionTargetJson2 = recipientPermissionJson.target;
        }
        AnonymousClass005.A0x(str8, str9, str10);
        return new RecipientPermissionJson(str8, str9, str10, str11, str12, str13, str14, z2, recipientPermissionDisplayJson2, recipientPermissionTargetJson2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(RecipientPermissionJson recipientPermissionJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(recipientPermissionJson.permission_id)) {
            c9j5.AAV(recipientPermissionJson.permission_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(recipientPermissionJson.kind)) {
            c9j5.AAV(recipientPermissionJson.kind, c9iZ, 1);
        }
        if (zAfR || !"".equals(recipientPermissionJson.label)) {
            c9j5.AAV(recipientPermissionJson.label, c9iZ, 2);
        }
        if (zAfR || recipientPermissionJson.connector != null) {
            c9j5.AAP(recipientPermissionJson.connector, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || recipientPermissionJson.connector_action != null) {
            c9j5.AAP(recipientPermissionJson.connector_action, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || recipientPermissionJson.mode != null) {
            c9j5.AAP(recipientPermissionJson.mode, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || recipientPermissionJson.source != null) {
            c9j5.AAP(recipientPermissionJson.source, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || recipientPermissionJson.revocable) {
            c9j5.AA7(c9iZ, 7, recipientPermissionJson.revocable);
        }
        if (zAfR || recipientPermissionJson.display != null) {
            c9j5.AAP(recipientPermissionJson.display, RecipientPermissionDisplayJson$$serializer.INSTANCE, c9iZ, 8);
        }
        if (zAfR || recipientPermissionJson.target != null) {
            c9j5.AAP(recipientPermissionJson.target, RecipientPermissionTargetJson$$serializer.INSTANCE, c9iZ, 9);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecipientPermissionJson) {
                RecipientPermissionJson recipientPermissionJson = (RecipientPermissionJson) obj;
                if (!C7384Etj.areEqual(this.permission_id, recipientPermissionJson.permission_id) || !C7384Etj.areEqual(this.kind, recipientPermissionJson.kind) || !C7384Etj.areEqual(this.label, recipientPermissionJson.label) || !C7384Etj.areEqual(this.connector, recipientPermissionJson.connector) || !C7384Etj.areEqual(this.connector_action, recipientPermissionJson.connector_action) || !C7384Etj.areEqual(this.mode, recipientPermissionJson.mode) || !C7384Etj.areEqual(this.source, recipientPermissionJson.source) || this.revocable != recipientPermissionJson.revocable || !C7384Etj.areEqual(this.display, recipientPermissionJson.display) || !C7384Etj.areEqual(this.target, recipientPermissionJson.target)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.skills.repo.RecipientPermission toDomain(java.lang.String r14) {
        /*
            r13 = this;
            r0 = 0
            X.C7384Etj.A0Y(r14, r0)
            java.lang.String r1 = r13.source
            java.lang.String r0 = "recipient_permission"
            boolean r1 = r0.equals(r1)
            r0 = 0
            if (r1 == 0) goto La6
            java.lang.String r1 = r13.connector
            boolean r1 = r14.equals(r1)
            if (r1 == 0) goto La6
            java.lang.String r1 = r13.permission_id
            java.lang.String r5 = com.facebook.aura.skills.repo.RecipientPermissionsRepositoryJsonKt.nonBlank(r1)
            if (r5 == 0) goto La6
            java.lang.String r1 = r13.kind
            java.lang.String r6 = com.facebook.aura.skills.repo.RecipientPermissionsRepositoryJsonKt.nonBlank(r1)
            if (r6 == 0) goto La6
            java.lang.String r1 = r13.label
            java.lang.String r4 = com.facebook.aura.skills.repo.RecipientPermissionsRepositoryJsonKt.nonBlank(r1)
            if (r4 == 0) goto La6
            java.lang.String r1 = r13.connector_action
            java.lang.String r7 = com.facebook.aura.skills.repo.RecipientPermissionsRepositoryJsonKt.nonBlank(r1)
            if (r7 != 0) goto L39
            java.lang.String r7 = ""
        L39:
            com.facebook.aura.skills.repo.RecipientPermissionTargetJson r1 = r13.target
            if (r1 == 0) goto La4
            com.facebook.aura.skills.repo.RecipientPermissionConnectorJson r1 = r1.connector
            if (r1 == 0) goto La4
            java.util.List<com.facebook.aura.skills.repo.RecipientPermissionActionJson> r1 = r1.actions
            if (r1 == 0) goto La4
            java.util.Iterator r3 = r1.iterator()
        L49:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto La2
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.facebook.aura.skills.repo.RecipientPermissionActionJson r1 = (com.facebook.aura.skills.repo.RecipientPermissionActionJson) r1
            java.lang.String r1 = r1.key
            java.lang.String r1 = com.facebook.aura.skills.repo.RecipientPermissionsRepositoryJsonKt.nonBlank(r1)
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L49
        L62:
            com.facebook.aura.skills.repo.RecipientPermissionActionJson r2 = (com.facebook.aura.skills.repo.RecipientPermissionActionJson) r2
            if (r2 == 0) goto La4
            java.lang.String r1 = r2.display_label
        L68:
            java.lang.String r8 = com.facebook.aura.skills.repo.RecipientPermissionsRepositoryJsonKt.nonBlank(r1)
            if (r8 != 0) goto L6f
            r8 = r4
        L6f:
            com.facebook.aura.skills.repo.RecipientPermissionDisplayJson r1 = r13.display
            if (r1 == 0) goto La0
            java.lang.String r1 = r1.summary_title
        L75:
            java.lang.String r9 = com.facebook.aura.skills.repo.RecipientPermissionsRepositoryJsonKt.nonBlank(r1)
            if (r9 != 0) goto L7c
            r9 = r4
        L7c:
            com.facebook.aura.skills.repo.RecipientPermissionDisplayJson r1 = r13.display
            if (r1 == 0) goto L9e
            java.lang.String r1 = r1.permission_caption
        L82:
            java.lang.String r10 = com.facebook.aura.skills.repo.RecipientPermissionsRepositoryJsonKt.nonBlank(r1)
            java.lang.String r1 = r13.mode
            java.lang.String r11 = com.facebook.aura.skills.repo.RecipientPermissionsRepositoryJsonKt.nonBlank(r1)
            com.facebook.aura.skills.repo.RecipientPermissionDisplayJson r1 = r13.display
            if (r1 == 0) goto L92
            java.lang.String r0 = r1.mode_label
        L92:
            java.lang.String r12 = com.facebook.aura.skills.repo.RecipientPermissionsRepositoryJsonKt.nonBlank(r0)
            boolean r13 = r13.revocable
            com.facebook.aura.skills.repo.RecipientPermission r4 = new com.facebook.aura.skills.repo.RecipientPermission
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r4
        L9e:
            r1 = r0
            goto L82
        La0:
            r1 = r0
            goto L75
        La2:
            r2 = r0
            goto L62
        La4:
            r1 = r0
            goto L68
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.repo.RecipientPermissionJson.toDomain(java.lang.String):com.facebook.aura.skills.repo.RecipientPermission");
    }

    public final String component1() {
        return this.permission_id;
    }

    public final RecipientPermissionTargetJson component10() {
        return this.target;
    }

    public final String component2() {
        return this.kind;
    }

    public final String component3() {
        return this.label;
    }

    public final String component4() {
        return this.connector;
    }

    public final String component5() {
        return this.connector_action;
    }

    public final String component6() {
        return this.mode;
    }

    public final String component7() {
        return this.source;
    }

    public final boolean component8() {
        return this.revocable;
    }

    public final RecipientPermissionDisplayJson component9() {
        return this.display;
    }

    public final String getConnector() {
        return this.connector;
    }

    public final String getConnector_action() {
        return this.connector_action;
    }

    public final RecipientPermissionDisplayJson getDisplay() {
        return this.display;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getPermission_id() {
        return this.permission_id;
    }

    public final boolean getRevocable() {
        return this.revocable;
    }

    public final String getSource() {
        return this.source;
    }

    public final RecipientPermissionTargetJson getTarget() {
        return this.target;
    }

    public int hashCode() {
        return ((C0KA.A01((((((((AnonymousClass005.A0I(this.label, AnonymousClass005.A0I(this.kind, AnonymousClass001.A0G(this.permission_id))) + AnonymousClass006.A0G(this.connector)) * 31) + AnonymousClass006.A0G(this.connector_action)) * 31) + AnonymousClass006.A0G(this.mode)) * 31) + AnonymousClass006.A0G(this.source)) * 31, this.revocable) + AnonymousClass006.A0D(this.display)) * 31) + C3cH.A02(this.target);
    }

    public RecipientPermissionJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, RecipientPermissionDisplayJson recipientPermissionDisplayJson, RecipientPermissionTargetJson recipientPermissionTargetJson) {
        AnonymousClass005.A0x(str, str2, str3);
        this.permission_id = str;
        this.kind = str2;
        this.label = str3;
        this.connector = str4;
        this.connector_action = str5;
        this.mode = str6;
        this.source = str7;
        this.revocable = z;
        this.display = recipientPermissionDisplayJson;
        this.target = recipientPermissionTargetJson;
    }

    public final RecipientPermissionJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, RecipientPermissionDisplayJson recipientPermissionDisplayJson, RecipientPermissionTargetJson recipientPermissionTargetJson) {
        AnonymousClass005.A0x(str, str2, str3);
        return new RecipientPermissionJson(str, str2, str3, str4, str5, str6, str7, z, recipientPermissionDisplayJson, recipientPermissionTargetJson);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RecipientPermissionJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, RecipientPermissionDisplayJson recipientPermissionDisplayJson, RecipientPermissionTargetJson recipientPermissionTargetJson, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : recipientPermissionDisplayJson, (i & 512) != 0 ? null : recipientPermissionTargetJson);
    }

    public /* synthetic */ RecipientPermissionJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, RecipientPermissionDisplayJson recipientPermissionDisplayJson, RecipientPermissionTargetJson recipientPermissionTargetJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.permission_id = "";
        } else {
            this.permission_id = str;
        }
        if ((i & 2) == 0) {
            this.kind = "";
        } else {
            this.kind = str2;
        }
        if ((i & 4) == 0) {
            this.label = "";
        } else {
            this.label = str3;
        }
        if ((i & 8) == 0) {
            this.connector = null;
        } else {
            this.connector = str4;
        }
        if ((i & 16) == 0) {
            this.connector_action = null;
        } else {
            this.connector_action = str5;
        }
        if ((i & 32) == 0) {
            this.mode = null;
        } else {
            this.mode = str6;
        }
        if ((i & 64) == 0) {
            this.source = null;
        } else {
            this.source = str7;
        }
        if ((i & 128) == 0) {
            this.revocable = false;
        } else {
            this.revocable = z;
        }
        if ((i & 256) == 0) {
            this.display = null;
        } else {
            this.display = recipientPermissionDisplayJson;
        }
        if ((i & 512) == 0) {
            this.target = null;
        } else {
            this.target = recipientPermissionTargetJson;
        }
    }

    public RecipientPermissionJson() {
        this("", "", "", null, null, null, null, false, null, null);
    }
}
