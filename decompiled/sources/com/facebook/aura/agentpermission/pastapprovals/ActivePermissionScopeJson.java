package com.facebook.aura.agentpermission.pastapprovals;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ActivePermissionScopeJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String display_name;
    public final String idea_scope_id;
    public final String schedule_id;
    public final String scope_type;
    public final String session_scope_id;
    public final String space_slug;

    public final class Companion {
        public final C9hr<ActivePermissionScopeJson> serializer() {
            return ActivePermissionScopeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ ActivePermissionScopeJson copy$default(ActivePermissionScopeJson activePermissionScopeJson, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        if ((i & 1) != 0) {
            str7 = activePermissionScopeJson.scope_type;
        }
        if ((i & 2) != 0) {
            str8 = activePermissionScopeJson.session_scope_id;
        }
        if ((i & 4) != 0) {
            str9 = activePermissionScopeJson.display_name;
        }
        if ((i & 8) != 0) {
            str10 = activePermissionScopeJson.space_slug;
        }
        if ((i & 16) != 0) {
            str11 = activePermissionScopeJson.schedule_id;
        }
        if ((i & 32) != 0) {
            str12 = activePermissionScopeJson.idea_scope_id;
        }
        return new ActivePermissionScopeJson(str7, str8, str9, str10, str11, str12);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_agentpermission_pastapprovals_pastapprovals(ActivePermissionScopeJson activePermissionScopeJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || activePermissionScopeJson.scope_type != null) {
            c9j5.AAP(activePermissionScopeJson.scope_type, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || activePermissionScopeJson.session_scope_id != null) {
            c9j5.AAP(activePermissionScopeJson.session_scope_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || activePermissionScopeJson.display_name != null) {
            c9j5.AAP(activePermissionScopeJson.display_name, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || activePermissionScopeJson.space_slug != null) {
            c9j5.AAP(activePermissionScopeJson.space_slug, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || activePermissionScopeJson.schedule_id != null) {
            c9j5.AAP(activePermissionScopeJson.schedule_id, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || activePermissionScopeJson.idea_scope_id != null) {
            c9j5.AAP(activePermissionScopeJson.idea_scope_id, C07779iq.A01, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivePermissionScopeJson) {
                ActivePermissionScopeJson activePermissionScopeJson = (ActivePermissionScopeJson) obj;
                if (!C7384Etj.areEqual(this.scope_type, activePermissionScopeJson.scope_type) || !C7384Etj.areEqual(this.session_scope_id, activePermissionScopeJson.session_scope_id) || !C7384Etj.areEqual(this.display_name, activePermissionScopeJson.display_name) || !C7384Etj.areEqual(this.space_slug, activePermissionScopeJson.space_slug) || !C7384Etj.areEqual(this.schedule_id, activePermissionScopeJson.schedule_id) || !C7384Etj.areEqual(this.idea_scope_id, activePermissionScopeJson.idea_scope_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActivePermissionScopeType.values().length];
            try {
                AnonymousClass002.A13(ActivePermissionScopeType.SCHEDULE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ActivePermissionScopeType.SPACE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ActivePermissionScopeType.IDEA, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ActivePermissionScopeType.FEED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final String component1() {
        return this.scope_type;
    }

    public final String component2() {
        return this.session_scope_id;
    }

    public final String component3() {
        return this.display_name;
    }

    public final String component4() {
        return this.space_slug;
    }

    public final String component5() {
        return this.schedule_id;
    }

    public final String component6() {
        return this.idea_scope_id;
    }

    public final ActivePermissionScopeJson copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new ActivePermissionScopeJson(str, str2, str3, str4, str5, str6);
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getIdea_scope_id() {
        return this.idea_scope_id;
    }

    public final String getSchedule_id() {
        return this.schedule_id;
    }

    public final String getScope_type() {
        return this.scope_type;
    }

    public final String getSession_scope_id() {
        return this.session_scope_id;
    }

    public final String getSpace_slug() {
        return this.space_slug;
    }

    public int hashCode() {
        return (((((((((AnonymousClass006.A0G(this.scope_type) * 31) + AnonymousClass006.A0G(this.session_scope_id)) * 31) + AnonymousClass006.A0G(this.display_name)) * 31) + AnonymousClass006.A0G(this.space_slug)) * 31) + AnonymousClass006.A0G(this.schedule_id)) * 31) + AnonymousClass005.A0H(this.idea_scope_id);
    }

    public final ActivePermissionScope toDomain() {
        String str;
        String str2;
        String str3;
        ActivePermissionScopeType activePermissionScopeTypeFromWire = ActivePermissionScopeType.Companion.fromWire(this.scope_type);
        String str4 = null;
        if (activePermissionScopeTypeFromWire != null && (str = this.session_scope_id) != null && !C7BY.A0j(str)) {
            int iOrdinal = activePermissionScopeTypeFromWire.ordinal();
            if (iOrdinal == 0) {
                str2 = this.schedule_id;
            } else if (iOrdinal == 1) {
                str2 = this.space_slug;
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw C3cG.A0q();
                    }
                    str3 = this.display_name;
                    if (str3 != null && !C7BY.A0j(str3)) {
                        str4 = str3;
                    }
                    return new ActivePermissionScope(activePermissionScopeTypeFromWire, str, str4);
                }
                str2 = this.idea_scope_id;
            }
            if (str2 == null || C7BY.A0j(str2)) {
                return null;
            }
            str3 = this.display_name;
            if (str3 != null) {
                str4 = str3;
            }
            return new ActivePermissionScope(activePermissionScopeTypeFromWire, str, str4);
        }
        return null;
    }

    public ActivePermissionScopeJson(String str, String str2, String str3, String str4, String str5, String str6) {
        this.scope_type = str;
        this.session_scope_id = str2;
        this.display_name = str3;
        this.space_slug = str4;
        this.schedule_id = str5;
        this.idea_scope_id = str6;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ActivePermissionScopeJson(String str, String str2, String str3, String str4, String str5, String str6, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }

    public /* synthetic */ ActivePermissionScopeJson(int i, String str, String str2, String str3, String str4, String str5, String str6, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.scope_type = null;
        } else {
            this.scope_type = str;
        }
        if ((i & 2) == 0) {
            this.session_scope_id = null;
        } else {
            this.session_scope_id = str2;
        }
        if ((i & 4) == 0) {
            this.display_name = null;
        } else {
            this.display_name = str3;
        }
        if ((i & 8) == 0) {
            this.space_slug = null;
        } else {
            this.space_slug = str4;
        }
        if ((i & 16) == 0) {
            this.schedule_id = null;
        } else {
            this.schedule_id = str5;
        }
        if ((i & 32) == 0) {
            this.idea_scope_id = null;
        } else {
            this.idea_scope_id = str6;
        }
    }

    public ActivePermissionScopeJson() {
        this(null, null, null, null, null, null);
    }
}
