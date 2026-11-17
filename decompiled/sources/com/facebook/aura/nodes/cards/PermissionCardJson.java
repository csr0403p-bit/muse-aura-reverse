package com.facebook.aura.nodes.cards;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class PermissionCardJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String highlight;
    public final String label;

    public final class Companion {
        public final C9hr<PermissionCardJson> serializer() {
            return PermissionCardJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_cards_cards(PermissionCardJson permissionCardJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(permissionCardJson.label)) {
            c9j5.AAV(permissionCardJson.label, c9iZ, 0);
        }
        if (zAfR || !"".equals(permissionCardJson.highlight)) {
            c9j5.AAV(permissionCardJson.highlight, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PermissionCardJson) {
                PermissionCardJson permissionCardJson = (PermissionCardJson) obj;
                if (!C7384Etj.areEqual(this.label, permissionCardJson.label) || !C7384Etj.areEqual(this.highlight, permissionCardJson.highlight)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PermissionCardJson copy$default(PermissionCardJson permissionCardJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = permissionCardJson.label;
        }
        if ((i & 2) != 0) {
            str2 = permissionCardJson.highlight;
        }
        AnonymousClass003.A0u(str, str2);
        return new PermissionCardJson(str, str2);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.highlight;
    }

    public final String getHighlight() {
        return this.highlight;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.highlight, AnonymousClass001.A0G(this.label));
    }

    public final PermissionCardData toDomain() {
        String strA0l = AnonymousClass002.A0l(this.label);
        if (strA0l.length() <= 0) {
            return null;
        }
        String strA0l2 = AnonymousClass002.A0l(this.highlight);
        if (strA0l2.length() > 0) {
            return new PermissionCardData(strA0l, strA0l2);
        }
        return null;
    }

    public PermissionCardJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.label = str;
        this.highlight = str2;
    }

    public final PermissionCardJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new PermissionCardJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PermissionCardJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.label = "";
        } else {
            this.label = str;
        }
        if ((i & 2) == 0) {
            this.highlight = "";
        } else {
            this.highlight = str2;
        }
    }

    public /* synthetic */ PermissionCardJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public PermissionCardJson() {
        this("", "");
    }
}
