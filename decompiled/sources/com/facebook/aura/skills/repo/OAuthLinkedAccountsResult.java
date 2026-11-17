package com.facebook.aura.skills.repo;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class OAuthLinkedAccountsResult extends C06G {
    public final List<OAuthLinkedAccount> accounts;
    public final List<OAuthLinkedAccountGroup> groups;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OAuthLinkedAccountsResult) {
                OAuthLinkedAccountsResult oAuthLinkedAccountsResult = (OAuthLinkedAccountsResult) obj;
                if (!C7384Etj.areEqual(this.accounts, oAuthLinkedAccountsResult.accounts) || !C7384Etj.areEqual(this.groups, oAuthLinkedAccountsResult.groups)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ OAuthLinkedAccountsResult copy$default(OAuthLinkedAccountsResult oAuthLinkedAccountsResult, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = oAuthLinkedAccountsResult.accounts;
        }
        if ((i & 2) != 0) {
            list2 = oAuthLinkedAccountsResult.groups;
        }
        AnonymousClass003.A0u(list, list2);
        return new OAuthLinkedAccountsResult(list, list2);
    }

    public final List<OAuthLinkedAccount> component1() {
        return this.accounts;
    }

    public final List<OAuthLinkedAccountGroup> component2() {
        return this.groups;
    }

    public final List<OAuthLinkedAccount> getAccounts() {
        return this.accounts;
    }

    public final List<OAuthLinkedAccountGroup> getGroups() {
        return this.groups;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.groups, AnonymousClass005.A0E(this.accounts));
    }

    public OAuthLinkedAccountsResult(List<OAuthLinkedAccount> list, List<OAuthLinkedAccountGroup> list2) {
        AnonymousClass003.A0u(list, list2);
        this.accounts = list;
        this.groups = list2;
    }

    public final OAuthLinkedAccountsResult copy(List<OAuthLinkedAccount> list, List<OAuthLinkedAccountGroup> list2) {
        AnonymousClass003.A0u(list, list2);
        return new OAuthLinkedAccountsResult(list, list2);
    }

    public String toString() {
        return super.toString();
    }
}
