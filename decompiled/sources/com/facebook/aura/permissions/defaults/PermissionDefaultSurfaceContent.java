package com.facebook.aura.permissions.defaults;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C06G;
import X.C3cG;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class PermissionDefaultSurfaceContent extends C06G {
    public final PermissionDefaultOptionContent alwaysAsk;
    public final PermissionDefaultOptionContent autoAllow;
    public final String heading;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PermissionDefaultSurfaceContent) {
                PermissionDefaultSurfaceContent permissionDefaultSurfaceContent = (PermissionDefaultSurfaceContent) obj;
                if (!C7384Etj.areEqual(this.heading, permissionDefaultSurfaceContent.heading) || !C7384Etj.areEqual(this.autoAllow, permissionDefaultSurfaceContent.autoAllow) || !C7384Etj.areEqual(this.alwaysAsk, permissionDefaultSurfaceContent.alwaysAsk)) {
                }
            }
            return false;
        }
        return true;
    }

    public final PermissionDefaultOptionContent optionFor(PermissionDefaultMode permissionDefaultMode) {
        int iA0E = AnonymousClass001.A0E(permissionDefaultMode, 0);
        if (iA0E == 0) {
            return this.autoAllow;
        }
        if (iA0E == 1) {
            return this.alwaysAsk;
        }
        throw C3cG.A0q();
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PermissionDefaultMode.values().length];
            try {
                AnonymousClass002.A13(PermissionDefaultMode.AUTO_ALLOW, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(PermissionDefaultMode.ALWAYS_ASK, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ PermissionDefaultSurfaceContent copy$default(PermissionDefaultSurfaceContent permissionDefaultSurfaceContent, String str, PermissionDefaultOptionContent permissionDefaultOptionContent, PermissionDefaultOptionContent permissionDefaultOptionContent2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = permissionDefaultSurfaceContent.heading;
        }
        if ((i & 2) != 0) {
            permissionDefaultOptionContent = permissionDefaultSurfaceContent.autoAllow;
        }
        if ((i & 4) != 0) {
            permissionDefaultOptionContent2 = permissionDefaultSurfaceContent.alwaysAsk;
        }
        return permissionDefaultSurfaceContent.copy(str, permissionDefaultOptionContent, permissionDefaultOptionContent2);
    }

    public final String component1() {
        return this.heading;
    }

    public final PermissionDefaultOptionContent component2() {
        return this.autoAllow;
    }

    public final PermissionDefaultOptionContent component3() {
        return this.alwaysAsk;
    }

    public final PermissionDefaultOptionContent getAlwaysAsk() {
        return this.alwaysAsk;
    }

    public final PermissionDefaultOptionContent getAutoAllow() {
        return this.autoAllow;
    }

    public final String getHeading() {
        return this.heading;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.alwaysAsk, AnonymousClass005.A0F(this.autoAllow, AnonymousClass001.A0G(this.heading)));
    }

    public PermissionDefaultSurfaceContent(String str, PermissionDefaultOptionContent permissionDefaultOptionContent, PermissionDefaultOptionContent permissionDefaultOptionContent2) {
        AnonymousClass005.A0x(str, permissionDefaultOptionContent, permissionDefaultOptionContent2);
        this.heading = str;
        this.autoAllow = permissionDefaultOptionContent;
        this.alwaysAsk = permissionDefaultOptionContent2;
    }

    public final PermissionDefaultSurfaceContent copy(String str, PermissionDefaultOptionContent permissionDefaultOptionContent, PermissionDefaultOptionContent permissionDefaultOptionContent2) {
        AnonymousClass005.A0x(str, permissionDefaultOptionContent, permissionDefaultOptionContent2);
        return new PermissionDefaultSurfaceContent(str, permissionDefaultOptionContent, permissionDefaultOptionContent2);
    }

    public String toString() {
        return super.toString();
    }
}
