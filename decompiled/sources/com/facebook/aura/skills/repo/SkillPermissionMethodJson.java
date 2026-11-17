package com.facebook.aura.skills.repo;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.G0U;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import com.facebook.aura.json.WireEnumOptionsKt;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class SkillPermissionMethodJson extends C06G {
    public final String key;
    public final String label;
    public final String mode;
    public final List<String> mode_options;
    public final boolean restricted;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, AbstractC5321DgF.A02(C79.A01, SkillPermissionMethodJson$Companion$$childSerializers$1.INSTANCE), null, null};

    public final class Companion {
        public final C9hr<SkillPermissionMethodJson> serializer() {
            return SkillPermissionMethodJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* renamed from: com.facebook.aura.skills.repo.SkillPermissionMethodJson$toDomain$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<String, ConnectorPermissionMode> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final ConnectorPermissionMode invoke(String str) {
            ConnectorPermissionMode next;
            C7384Etj.A0Y(str, 0);
            Iterator<ConnectorPermissionMode> it = ConnectorPermissionMode.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (str.equals(next.getWireValue())) {
                    break;
                }
            }
            return next;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SkillPermissionMethodJson) {
                SkillPermissionMethodJson skillPermissionMethodJson = (SkillPermissionMethodJson) obj;
                if (!C7384Etj.areEqual(this.key, skillPermissionMethodJson.key) || !C7384Etj.areEqual(this.mode, skillPermissionMethodJson.mode) || !C7384Etj.areEqual(this.mode_options, skillPermissionMethodJson.mode_options) || !C7384Etj.areEqual(this.label, skillPermissionMethodJson.label) || this.restricted != skillPermissionMethodJson.restricted) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkillPermissionMethodJson copy$default(SkillPermissionMethodJson skillPermissionMethodJson, String str, String str2, List list, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skillPermissionMethodJson.key;
        }
        if ((i & 2) != 0) {
            str2 = skillPermissionMethodJson.mode;
        }
        if ((i & 4) != 0) {
            list = skillPermissionMethodJson.mode_options;
        }
        if ((i & 8) != 0) {
            str3 = skillPermissionMethodJson.label;
        }
        if ((i & 16) != 0) {
            z = skillPermissionMethodJson.restricted;
        }
        return skillPermissionMethodJson.copy(str, str2, list, str3, z);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(SkillPermissionMethodJson skillPermissionMethodJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(skillPermissionMethodJson.key)) {
            c9j5.AAV(skillPermissionMethodJson.key, c9iZ, 0);
        }
        if (zAfR || skillPermissionMethodJson.mode != null) {
            c9j5.AAP(skillPermissionMethodJson.mode, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || skillPermissionMethodJson.mode_options != null) {
            c9j5.AAP(skillPermissionMethodJson.mode_options, C06G.A0e(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || !"".equals(skillPermissionMethodJson.label)) {
            c9j5.AAV(skillPermissionMethodJson.label, c9iZ, 3);
        }
        if (zAfR || skillPermissionMethodJson.restricted) {
            c9j5.AA7(c9iZ, 4, skillPermissionMethodJson.restricted);
        }
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.mode;
    }

    public final List<String> component3() {
        return this.mode_options;
    }

    public final String component4() {
        return this.label;
    }

    public final boolean component5() {
        return this.restricted;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getMode() {
        return this.mode;
    }

    public final List<String> getMode_options() {
        return this.mode_options;
    }

    public final boolean getRestricted() {
        return this.restricted;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0I(this.label, (((AnonymousClass001.A0G(this.key) + AnonymousClass006.A0G(this.mode)) * 31) + C06G.A04(this.mode_options)) * 31), this.restricted);
    }

    public final SkillPermissionMethod toDomain() {
        String strA0l = AnonymousClass002.A0l(this.key);
        if (strA0l.length() <= 0) {
            return null;
        }
        ConnectorPermissionMode connectorPermissionModeFromWire = ConnectorPermissionMode.Companion.fromWire(this.mode);
        List listWireEnumOptions = WireEnumOptionsKt.wireEnumOptions(this.mode_options, connectorPermissionModeFromWire, ConnectorPermissionMode.getEntries(), AnonymousClass1.INSTANCE);
        String strA0l2 = AnonymousClass002.A0l(this.label);
        String str = strA0l;
        if (strA0l2.length() > 0) {
            str = strA0l2;
        }
        return new SkillPermissionMethod(strA0l, connectorPermissionModeFromWire, listWireEnumOptions, str, this.restricted);
    }

    public SkillPermissionMethodJson(String str, String str2, List<String> list, String str3, boolean z) {
        AnonymousClass003.A0w(str, str3);
        this.key = str;
        this.mode = str2;
        this.mode_options = list;
        this.label = str3;
        this.restricted = z;
    }

    public final SkillPermissionMethodJson copy(String str, String str2, List<String> list, String str3, boolean z) {
        AnonymousClass003.A0w(str, str3);
        return new SkillPermissionMethodJson(str, str2, list, str3, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SkillPermissionMethodJson(String str, String str2, List list, String str3, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? false : z);
    }

    public /* synthetic */ SkillPermissionMethodJson(int i, String str, String str2, List list, String str3, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.key = "";
        } else {
            this.key = str;
        }
        if ((i & 2) == 0) {
            this.mode = null;
        } else {
            this.mode = str2;
        }
        if ((i & 4) == 0) {
            this.mode_options = null;
        } else {
            this.mode_options = list;
        }
        if ((i & 8) == 0) {
            this.label = "";
        } else {
            this.label = str3;
        }
        if ((i & 16) == 0) {
            this.restricted = false;
        } else {
            this.restricted = z;
        }
    }

    public SkillPermissionMethodJson() {
        this("", null, null, "", false);
    }
}
