package com.facebook.aura.skills.model;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.skills.model.Consent;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class Skill extends C06G {
    public final Consent consent;
    public final String description;
    public final String displayName;
    public final ConnectorGroup group;
    public final String iconUrl;
    public final String id;
    public final boolean isCustom;
    public final boolean needsReauth;
    public final SkillState state;
    public final boolean supportsMultipleAccounts;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Skill) {
                Skill skill = (Skill) obj;
                if (!C7384Etj.areEqual(this.id, skill.id) || !C7384Etj.areEqual(this.displayName, skill.displayName) || !C7384Etj.areEqual(this.description, skill.description) || this.state != skill.state || this.supportsMultipleAccounts != skill.supportsMultipleAccounts || !C7384Etj.areEqual(this.iconUrl, skill.iconUrl) || this.isCustom != skill.isCustom || !C7384Etj.areEqual(this.consent, skill.consent) || this.needsReauth != skill.needsReauth || this.group != skill.group) {
                }
            }
            return false;
        }
        return true;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConnectorGroup.values().length];
            try {
                AnonymousClass002.A13(ConnectorGroup.OPTIMIZED_SITES, iArr);
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ Skill(String str, String str2, String str3, SkillState skillState, boolean z, String str4, boolean z2, Consent consent, boolean z3, ConnectorGroup connectorGroup, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? SkillState.DISCONNECTED : skillState, AnonymousClass005.A1Q(i, z), (i & 32) != 0 ? null : str4, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? null : consent, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? null : connectorGroup);
    }

    public static /* synthetic */ Skill copy$default(Skill skill, String str, String str2, String str3, SkillState skillState, boolean z, String str4, boolean z2, Consent consent, boolean z3, ConnectorGroup connectorGroup, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skill.id;
        }
        if ((i & 2) != 0) {
            str2 = skill.displayName;
        }
        if ((i & 4) != 0) {
            str3 = skill.description;
        }
        if ((i & 8) != 0) {
            skillState = skill.state;
        }
        if ((i & 16) != 0) {
            z = skill.supportsMultipleAccounts;
        }
        if ((i & 32) != 0) {
            str4 = skill.iconUrl;
        }
        if ((i & 64) != 0) {
            z2 = skill.isCustom;
        }
        if ((i & 128) != 0) {
            consent = skill.consent;
        }
        if ((i & 256) != 0) {
            z3 = skill.needsReauth;
        }
        if ((i & 512) != 0) {
            connectorGroup = skill.group;
        }
        return skill.copy(str, str2, str3, skillState, z, str4, z2, consent, z3, connectorGroup);
    }

    public final String component1() {
        return this.id;
    }

    public final ConnectorGroup component10() {
        return this.group;
    }

    public final String component2() {
        return this.displayName;
    }

    public final String component3() {
        return this.description;
    }

    public final SkillState component4() {
        return this.state;
    }

    public final boolean component5() {
        return this.supportsMultipleAccounts;
    }

    public final String component6() {
        return this.iconUrl;
    }

    public final boolean component7() {
        return this.isCustom;
    }

    public final Consent component8() {
        return this.consent;
    }

    public final boolean component9() {
        return this.needsReauth;
    }

    public final Consent getConsent() {
        return this.consent;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final ConnectorGroup getGroup() {
        return this.group;
    }

    public final boolean getHasCvmCallout() {
        AHD<String> ahd;
        Consent consent = this.consent;
        Consent.HatchManaged hatchManaged = consent instanceof Consent.HatchManaged ? (Consent.HatchManaged) consent : null;
        return (hatchManaged == null || (ahd = hatchManaged.calloutParagraphs) == null || !(ahd.isEmpty() ^ true)) ? false : true;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getNeedsReauth() {
        return this.needsReauth;
    }

    public final SkillState getState() {
        return this.state;
    }

    public final boolean getSupportsMultipleAccounts() {
        return this.supportsMultipleAccounts;
    }

    public int hashCode() {
        return C0KA.A01((C0KA.A01((C0KA.A01(AnonymousClass005.A0F(this.state, AnonymousClass005.A0I(this.description, AnonymousClass005.A0I(this.displayName, AnonymousClass001.A0G(this.id)))), this.supportsMultipleAccounts) + AnonymousClass006.A0G(this.iconUrl)) * 31, this.isCustom) + AnonymousClass006.A0D(this.consent)) * 31, this.needsReauth) + C06G.A04(this.group);
    }

    public final boolean isCustom() {
        return this.isCustom;
    }

    public final boolean isOptimizedSite() {
        int iOrdinal;
        ConnectorGroup connectorGroup = this.group;
        if (connectorGroup == null || (iOrdinal = connectorGroup.ordinal()) == -1) {
            return false;
        }
        if (iOrdinal != 0) {
            throw new NoWhenBranchMatchedException();
        }
        return true;
    }

    public final Skill copy(String str, String str2, String str3, SkillState skillState, boolean z, String str4, boolean z2, Consent consent, boolean z3, ConnectorGroup connectorGroup) {
        AnonymousClass005.A14(str, str2, str3, skillState);
        return new Skill(str, str2, str3, skillState, z, str4, z2, consent, z3, connectorGroup);
    }

    public String toString() {
        return super.toString();
    }

    public Skill(String str, String str2, String str3, SkillState skillState, boolean z, String str4, boolean z2, Consent consent, boolean z3, ConnectorGroup connectorGroup) {
        AnonymousClass005.A14(str, str2, str3, skillState);
        this.id = str;
        this.displayName = str2;
        this.description = str3;
        this.state = skillState;
        this.supportsMultipleAccounts = z;
        this.iconUrl = str4;
        this.isCustom = z2;
        this.consent = consent;
        this.needsReauth = z3;
        this.group = connectorGroup;
    }
}
