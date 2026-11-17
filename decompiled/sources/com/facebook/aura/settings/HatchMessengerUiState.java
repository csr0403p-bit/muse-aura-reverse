package com.facebook.aura.settings;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchMessengerUiState extends C06G {
    public static final int $stable = 0;
    public final String agentId;
    public final MessengerConnectPhase connectPhase;
    public final boolean hasFetchedFBAccounts;
    public final boolean isLinked;
    public final boolean isLoading;
    public final LinkedFBAccountInfo linkedFBAccount;
    public final String pairingUrl;
    public final Integer pendingToastResId;
    public final boolean showAccountLinkingUpsell;
    public final boolean showDisconnectDialog;

    public HatchMessengerUiState() {
        this(false, false, MessengerConnectPhase.IDLE, null, false, null, false, false, null, null);
    }

    public final HatchMessengerUiState copy(boolean z, boolean z2, MessengerConnectPhase messengerConnectPhase, String str, boolean z3, LinkedFBAccountInfo linkedFBAccountInfo, boolean z4, boolean z5, String str2, Integer num) {
        C7384Etj.A0Y(messengerConnectPhase, 2);
        return new HatchMessengerUiState(z, z2, messengerConnectPhase, str, z3, linkedFBAccountInfo, z4, z5, str2, num);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchMessengerUiState) {
                HatchMessengerUiState hatchMessengerUiState = (HatchMessengerUiState) obj;
                if (this.isLinked != hatchMessengerUiState.isLinked || this.isLoading != hatchMessengerUiState.isLoading || this.connectPhase != hatchMessengerUiState.connectPhase || !C7384Etj.areEqual(this.pairingUrl, hatchMessengerUiState.pairingUrl) || this.showDisconnectDialog != hatchMessengerUiState.showDisconnectDialog || !C7384Etj.areEqual(this.linkedFBAccount, hatchMessengerUiState.linkedFBAccount) || this.hasFetchedFBAccounts != hatchMessengerUiState.hasFetchedFBAccounts || this.showAccountLinkingUpsell != hatchMessengerUiState.showAccountLinkingUpsell || !C7384Etj.areEqual(this.agentId, hatchMessengerUiState.agentId) || !C7384Etj.areEqual(this.pendingToastResId, hatchMessengerUiState.pendingToastResId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchMessengerUiState copy$default(HatchMessengerUiState hatchMessengerUiState, boolean z, boolean z2, MessengerConnectPhase messengerConnectPhase, String str, boolean z3, LinkedFBAccountInfo linkedFBAccountInfo, boolean z4, boolean z5, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = hatchMessengerUiState.isLinked;
        }
        if ((i & 2) != 0) {
            z2 = hatchMessengerUiState.isLoading;
        }
        if ((i & 4) != 0) {
            messengerConnectPhase = hatchMessengerUiState.connectPhase;
        }
        if ((i & 8) != 0) {
            str = hatchMessengerUiState.pairingUrl;
        }
        if ((i & 16) != 0) {
            z3 = hatchMessengerUiState.showDisconnectDialog;
        }
        if ((i & 32) != 0) {
            linkedFBAccountInfo = hatchMessengerUiState.linkedFBAccount;
        }
        if ((i & 64) != 0) {
            z4 = hatchMessengerUiState.hasFetchedFBAccounts;
        }
        if ((i & 128) != 0) {
            z5 = hatchMessengerUiState.showAccountLinkingUpsell;
        }
        if ((i & 256) != 0) {
            str2 = hatchMessengerUiState.agentId;
        }
        if ((i & 512) != 0) {
            num = hatchMessengerUiState.pendingToastResId;
        }
        return hatchMessengerUiState.copy(z, z2, messengerConnectPhase, str, z3, linkedFBAccountInfo, z4, z5, str2, num);
    }

    public final boolean component1() {
        return this.isLinked;
    }

    public final Integer component10() {
        return this.pendingToastResId;
    }

    public final boolean component2() {
        return this.isLoading;
    }

    public final MessengerConnectPhase component3() {
        return this.connectPhase;
    }

    public final String component4() {
        return this.pairingUrl;
    }

    public final boolean component5() {
        return this.showDisconnectDialog;
    }

    public final LinkedFBAccountInfo component6() {
        return this.linkedFBAccount;
    }

    public final boolean component7() {
        return this.hasFetchedFBAccounts;
    }

    public final boolean component8() {
        return this.showAccountLinkingUpsell;
    }

    public final String component9() {
        return this.agentId;
    }

    public final String getAgentId() {
        return this.agentId;
    }

    public final MessengerConnectPhase getConnectPhase() {
        return this.connectPhase;
    }

    public final boolean getHasFetchedFBAccounts() {
        return this.hasFetchedFBAccounts;
    }

    public final LinkedFBAccountInfo getLinkedFBAccount() {
        return this.linkedFBAccount;
    }

    public final String getPairingUrl() {
        return this.pairingUrl;
    }

    public final Integer getPendingToastResId() {
        return this.pendingToastResId;
    }

    public final boolean getShowAccountLinkingUpsell() {
        return this.showAccountLinkingUpsell;
    }

    public final boolean getShowDisconnectDialog() {
        return this.showDisconnectDialog;
    }

    public int hashCode() {
        return ((C0KA.A01(C0KA.A01((C0KA.A01((AnonymousClass005.A0F(this.connectPhase, C0KA.A01(C0KA.A02(this.isLinked), this.isLoading)) + AnonymousClass006.A0G(this.pairingUrl)) * 31, this.showDisconnectDialog) + AnonymousClass006.A0D(this.linkedFBAccount)) * 31, this.hasFetchedFBAccounts), this.showAccountLinkingUpsell) + AnonymousClass006.A0G(this.agentId)) * 31) + C06G.A04(this.pendingToastResId);
    }

    public final boolean isLinked() {
        return this.isLinked;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchMessengerUiState(boolean z, boolean z2, MessengerConnectPhase messengerConnectPhase, String str, boolean z3, LinkedFBAccountInfo linkedFBAccountInfo, boolean z4, boolean z5, String str2, Integer num, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass001.A1Q(i, z2), (i & 4) != 0 ? MessengerConnectPhase.IDLE : messengerConnectPhase, (i & 8) != 0 ? null : str, AnonymousClass005.A1Q(i, z3), (i & 32) != 0 ? null : linkedFBAccountInfo, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? false : z5, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : num);
    }

    public HatchMessengerUiState(boolean z, boolean z2, MessengerConnectPhase messengerConnectPhase, String str, boolean z3, LinkedFBAccountInfo linkedFBAccountInfo, boolean z4, boolean z5, String str2, Integer num) {
        C7384Etj.A0Y(messengerConnectPhase, 2);
        this.isLinked = z;
        this.isLoading = z2;
        this.connectPhase = messengerConnectPhase;
        this.pairingUrl = str;
        this.showDisconnectDialog = z3;
        this.linkedFBAccount = linkedFBAccountInfo;
        this.hasFetchedFBAccounts = z4;
        this.showAccountLinkingUpsell = z5;
        this.agentId = str2;
        this.pendingToastResId = num;
    }
}
