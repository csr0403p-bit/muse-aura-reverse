package com.facebook.aura.login.nativeflow;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import java.util.Set;

/* loaded from: classes2.dex */
public final class GroupedSsoRow extends C06G {
    public final Set<String> memberRefs;
    public final NativeLoginSsoAccount selection;
    public final boolean supersedesSavedAccount;
    public final NativeLoginAccountUiModel uiModel;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GroupedSsoRow) {
                GroupedSsoRow groupedSsoRow = (GroupedSsoRow) obj;
                if (!C7384Etj.areEqual(this.uiModel, groupedSsoRow.uiModel) || !C7384Etj.areEqual(this.selection, groupedSsoRow.selection) || !C7384Etj.areEqual(this.memberRefs, groupedSsoRow.memberRefs) || this.supersedesSavedAccount != groupedSsoRow.supersedesSavedAccount) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GroupedSsoRow copy$default(GroupedSsoRow groupedSsoRow, NativeLoginAccountUiModel nativeLoginAccountUiModel, NativeLoginSsoAccount nativeLoginSsoAccount, Set set, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            nativeLoginAccountUiModel = groupedSsoRow.uiModel;
        }
        if ((i & 2) != 0) {
            nativeLoginSsoAccount = groupedSsoRow.selection;
        }
        if ((i & 4) != 0) {
            set = groupedSsoRow.memberRefs;
        }
        if ((i & 8) != 0) {
            z = groupedSsoRow.supersedesSavedAccount;
        }
        AnonymousClass005.A0x(nativeLoginAccountUiModel, nativeLoginSsoAccount, set);
        return new GroupedSsoRow(nativeLoginAccountUiModel, nativeLoginSsoAccount, set, z);
    }

    public final NativeLoginAccountUiModel component1() {
        return this.uiModel;
    }

    public final NativeLoginSsoAccount component2() {
        return this.selection;
    }

    public final Set<String> component3() {
        return this.memberRefs;
    }

    public final boolean component4() {
        return this.supersedesSavedAccount;
    }

    public final Set<String> getMemberRefs() {
        return this.memberRefs;
    }

    public final NativeLoginSsoAccount getSelection() {
        return this.selection;
    }

    public final boolean getSupersedesSavedAccount() {
        return this.supersedesSavedAccount;
    }

    public final NativeLoginAccountUiModel getUiModel() {
        return this.uiModel;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.memberRefs, AnonymousClass005.A0F(this.selection, AnonymousClass005.A0E(this.uiModel))), this.supersedesSavedAccount);
    }

    public GroupedSsoRow(NativeLoginAccountUiModel nativeLoginAccountUiModel, NativeLoginSsoAccount nativeLoginSsoAccount, Set<String> set, boolean z) {
        AnonymousClass005.A0x(nativeLoginAccountUiModel, nativeLoginSsoAccount, set);
        this.uiModel = nativeLoginAccountUiModel;
        this.selection = nativeLoginSsoAccount;
        this.memberRefs = set;
        this.supersedesSavedAccount = z;
    }

    public final GroupedSsoRow copy(NativeLoginAccountUiModel nativeLoginAccountUiModel, NativeLoginSsoAccount nativeLoginSsoAccount, Set<String> set, boolean z) {
        AnonymousClass005.A0x(nativeLoginAccountUiModel, nativeLoginSsoAccount, set);
        return new GroupedSsoRow(nativeLoginAccountUiModel, nativeLoginSsoAccount, set, z);
    }

    public String toString() {
        return super.toString();
    }
}
