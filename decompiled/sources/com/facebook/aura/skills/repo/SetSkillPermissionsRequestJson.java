package com.facebook.aura.skills.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
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
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class SetSkillPermissionsRequestJson extends C06G {
    public final Map<String, String> actions;
    public final String connector;
    public final String reason;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, AbstractC5321DgF.A02(C79.A01, SetSkillPermissionsRequestJson$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<SetSkillPermissionsRequestJson> serializer() {
            return SetSkillPermissionsRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SetSkillPermissionsRequestJson) {
                SetSkillPermissionsRequestJson setSkillPermissionsRequestJson = (SetSkillPermissionsRequestJson) obj;
                if (!C7384Etj.areEqual(this.connector, setSkillPermissionsRequestJson.connector) || !C7384Etj.areEqual(this.actions, setSkillPermissionsRequestJson.actions) || !C7384Etj.areEqual(this.reason, setSkillPermissionsRequestJson.reason)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SetSkillPermissionsRequestJson copy$default(SetSkillPermissionsRequestJson setSkillPermissionsRequestJson, String str, Map map, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setSkillPermissionsRequestJson.connector;
        }
        if ((i & 2) != 0) {
            map = setSkillPermissionsRequestJson.actions;
        }
        if ((i & 4) != 0) {
            str2 = setSkillPermissionsRequestJson.reason;
        }
        return setSkillPermissionsRequestJson.copy(str, map, str2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(SetSkillPermissionsRequestJson setSkillPermissionsRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(setSkillPermissionsRequestJson.connector, c9iZ, 0);
        c9j5.AAQ(setSkillPermissionsRequestJson.actions, C06G.A0e(f0cArr, 1), c9iZ, 1);
        if (c9j5.AfR() || !"settings_permissions_connector_update".equals(setSkillPermissionsRequestJson.reason)) {
            c9j5.AAV(setSkillPermissionsRequestJson.reason, c9iZ, 2);
        }
    }

    public final String component1() {
        return this.connector;
    }

    public final Map<String, String> component2() {
        return this.actions;
    }

    public final String component3() {
        return this.reason;
    }

    public final Map<String, String> getActions() {
        return this.actions;
    }

    public final String getConnector() {
        return this.connector;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.reason, AnonymousClass005.A0F(this.actions, AnonymousClass001.A0G(this.connector)));
    }

    public SetSkillPermissionsRequestJson(String str, Map<String, String> map, String str2) {
        AnonymousClass005.A0x(str, map, str2);
        this.connector = str;
        this.actions = map;
        this.reason = str2;
    }

    public final SetSkillPermissionsRequestJson copy(String str, Map<String, String> map, String str2) {
        AnonymousClass005.A0x(str, map, str2);
        return new SetSkillPermissionsRequestJson(str, map, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SetSkillPermissionsRequestJson(String str, Map map, String str2, int i, C06H c06h) {
        this(str, map, (i & 4) != 0 ? "settings_permissions_connector_update" : str2);
    }

    public /* synthetic */ SetSkillPermissionsRequestJson(int i, String str, Map map, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(SetSkillPermissionsRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.connector = str;
        this.actions = map;
        this.reason = (i & 4) == 0 ? "settings_permissions_connector_update" : str2;
    }
}
