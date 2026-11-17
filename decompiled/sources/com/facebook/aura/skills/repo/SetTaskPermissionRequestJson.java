package com.facebook.aura.skills.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SetTaskPermissionRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String connector;
    public final String display_name;
    public final String expected_revision;
    public final String method;
    public final String mode;

    public final class Companion {
        public final C9hr<SetTaskPermissionRequestJson> serializer() {
            return SetTaskPermissionRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(SetTaskPermissionRequestJson setTaskPermissionRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(setTaskPermissionRequestJson.expected_revision, c9iZ, 0);
        c9j5.AAV(setTaskPermissionRequestJson.connector, c9iZ, 1);
        c9j5.AAV(setTaskPermissionRequestJson.method, c9iZ, 2);
        c9j5.AAP(setTaskPermissionRequestJson.mode, C07779iq.A01, c9iZ, 3);
        c9j5.AAV(setTaskPermissionRequestJson.display_name, c9iZ, 4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SetTaskPermissionRequestJson) {
                SetTaskPermissionRequestJson setTaskPermissionRequestJson = (SetTaskPermissionRequestJson) obj;
                if (!C7384Etj.areEqual(this.expected_revision, setTaskPermissionRequestJson.expected_revision) || !C7384Etj.areEqual(this.connector, setTaskPermissionRequestJson.connector) || !C7384Etj.areEqual(this.method, setTaskPermissionRequestJson.method) || !C7384Etj.areEqual(this.mode, setTaskPermissionRequestJson.mode) || !C7384Etj.areEqual(this.display_name, setTaskPermissionRequestJson.display_name)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SetTaskPermissionRequestJson copy$default(SetTaskPermissionRequestJson setTaskPermissionRequestJson, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setTaskPermissionRequestJson.expected_revision;
        }
        if ((i & 2) != 0) {
            str2 = setTaskPermissionRequestJson.connector;
        }
        if ((i & 4) != 0) {
            str3 = setTaskPermissionRequestJson.method;
        }
        if ((i & 8) != 0) {
            str4 = setTaskPermissionRequestJson.mode;
        }
        if ((i & 16) != 0) {
            str5 = setTaskPermissionRequestJson.display_name;
        }
        return setTaskPermissionRequestJson.copy(str, str2, str3, str4, str5);
    }

    public final String component1() {
        return this.expected_revision;
    }

    public final String component2() {
        return this.connector;
    }

    public final String component3() {
        return this.method;
    }

    public final String component4() {
        return this.mode;
    }

    public final String component5() {
        return this.display_name;
    }

    public final String getConnector() {
        return this.connector;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getExpected_revision() {
        return this.expected_revision;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getMode() {
        return this.mode;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.display_name, (AnonymousClass005.A0I(this.method, AnonymousClass005.A0I(this.connector, AnonymousClass001.A0G(this.expected_revision))) + AnonymousClass006.A0G(this.mode)) * 31);
    }

    public SetTaskPermissionRequestJson(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(str5, 4);
        this.expected_revision = str;
        this.connector = str2;
        this.method = str3;
        this.mode = str4;
        this.display_name = str5;
    }

    public final SetTaskPermissionRequestJson copy(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(str5, 4);
        return new SetTaskPermissionRequestJson(str, str2, str3, str4, str5);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SetTaskPermissionRequestJson(int i, String str, String str2, String str3, String str4, String str5, C2hx c2hx) {
        if (31 != (i & 31)) {
            C9iI.A00(SetTaskPermissionRequestJson$$serializer.descriptor, i, 31);
            throw F60.createAndThrow();
        }
        this.expected_revision = str;
        this.connector = str2;
        this.method = str3;
        this.mode = str4;
        this.display_name = str5;
    }
}
