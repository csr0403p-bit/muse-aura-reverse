package com.facebook.aura.skills.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class OAuthLinkedAccountGroup extends C06G {
    public final List<OAuthLinkedAccount> accounts;
    public final OAuthLinkedAccountGroupIcon icon;
    public final String key;
    public final String label;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OAuthLinkedAccountGroup) {
                OAuthLinkedAccountGroup oAuthLinkedAccountGroup = (OAuthLinkedAccountGroup) obj;
                if (!C7384Etj.areEqual(this.key, oAuthLinkedAccountGroup.key) || this.icon != oAuthLinkedAccountGroup.icon || !C7384Etj.areEqual(this.label, oAuthLinkedAccountGroup.label) || !C7384Etj.areEqual(this.accounts, oAuthLinkedAccountGroup.accounts)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OAuthLinkedAccountGroup copy$default(OAuthLinkedAccountGroup oAuthLinkedAccountGroup, String str, OAuthLinkedAccountGroupIcon oAuthLinkedAccountGroupIcon, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oAuthLinkedAccountGroup.key;
        }
        if ((i & 2) != 0) {
            oAuthLinkedAccountGroupIcon = oAuthLinkedAccountGroup.icon;
        }
        if ((i & 4) != 0) {
            str2 = oAuthLinkedAccountGroup.label;
        }
        if ((i & 8) != 0) {
            list = oAuthLinkedAccountGroup.accounts;
        }
        return oAuthLinkedAccountGroup.copy(str, oAuthLinkedAccountGroupIcon, str2, list);
    }

    public final String component1() {
        return this.key;
    }

    public final OAuthLinkedAccountGroupIcon component2() {
        return this.icon;
    }

    public final String component3() {
        return this.label;
    }

    public final List<OAuthLinkedAccount> component4() {
        return this.accounts;
    }

    public final List<OAuthLinkedAccount> getAccounts() {
        return this.accounts;
    }

    public final OAuthLinkedAccountGroupIcon getIcon() {
        return this.icon;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.accounts, AnonymousClass005.A0I(this.label, AnonymousClass005.A0F(this.icon, AnonymousClass001.A0G(this.key))));
    }

    public OAuthLinkedAccountGroup(String str, OAuthLinkedAccountGroupIcon oAuthLinkedAccountGroupIcon, String str2, List<OAuthLinkedAccount> list) {
        AnonymousClass005.A14(str, oAuthLinkedAccountGroupIcon, str2, list);
        this.key = str;
        this.icon = oAuthLinkedAccountGroupIcon;
        this.label = str2;
        this.accounts = list;
    }

    public final OAuthLinkedAccountGroup copy(String str, OAuthLinkedAccountGroupIcon oAuthLinkedAccountGroupIcon, String str2, List<OAuthLinkedAccount> list) {
        AnonymousClass005.A14(str, oAuthLinkedAccountGroupIcon, str2, list);
        return new OAuthLinkedAccountGroup(str, oAuthLinkedAccountGroupIcon, str2, list);
    }

    public String toString() {
        return super.toString();
    }
}
