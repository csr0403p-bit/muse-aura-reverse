package com.facebook.aura.settings;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchTelegramUiState extends C06G {
    public static final int $stable = 0;
    public final String botUsername;
    public final TelegramConnectPhase connectPhase;
    public final boolean isLinked;
    public final boolean isLoading;
    public final boolean showDisconnectDialog;
    public final boolean showOnboarding;

    public HatchTelegramUiState() {
        this(false, false, TelegramConnectPhase.IDLE, false, false, null);
    }

    public final HatchTelegramUiState copy(boolean z, boolean z2, TelegramConnectPhase telegramConnectPhase, boolean z3, boolean z4, String str) {
        C7384Etj.A0Y(telegramConnectPhase, 2);
        return new HatchTelegramUiState(z, z2, telegramConnectPhase, z3, z4, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchTelegramUiState) {
                HatchTelegramUiState hatchTelegramUiState = (HatchTelegramUiState) obj;
                if (this.isLinked != hatchTelegramUiState.isLinked || this.isLoading != hatchTelegramUiState.isLoading || this.connectPhase != hatchTelegramUiState.connectPhase || this.showOnboarding != hatchTelegramUiState.showOnboarding || this.showDisconnectDialog != hatchTelegramUiState.showDisconnectDialog || !C7384Etj.areEqual(this.botUsername, hatchTelegramUiState.botUsername)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchTelegramUiState copy$default(HatchTelegramUiState hatchTelegramUiState, boolean z, boolean z2, TelegramConnectPhase telegramConnectPhase, boolean z3, boolean z4, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = hatchTelegramUiState.isLinked;
        }
        if ((i & 2) != 0) {
            z2 = hatchTelegramUiState.isLoading;
        }
        if ((i & 4) != 0) {
            telegramConnectPhase = hatchTelegramUiState.connectPhase;
        }
        if ((i & 8) != 0) {
            z3 = hatchTelegramUiState.showOnboarding;
        }
        if ((i & 16) != 0) {
            z4 = hatchTelegramUiState.showDisconnectDialog;
        }
        if ((i & 32) != 0) {
            str = hatchTelegramUiState.botUsername;
        }
        return hatchTelegramUiState.copy(z, z2, telegramConnectPhase, z3, z4, str);
    }

    public final boolean component1() {
        return this.isLinked;
    }

    public final boolean component2() {
        return this.isLoading;
    }

    public final TelegramConnectPhase component3() {
        return this.connectPhase;
    }

    public final boolean component4() {
        return this.showOnboarding;
    }

    public final boolean component5() {
        return this.showDisconnectDialog;
    }

    public final String component6() {
        return this.botUsername;
    }

    public final String getBotUsername() {
        return this.botUsername;
    }

    public final TelegramConnectPhase getConnectPhase() {
        return this.connectPhase;
    }

    public final boolean getShowDisconnectDialog() {
        return this.showDisconnectDialog;
    }

    public final boolean getShowOnboarding() {
        return this.showOnboarding;
    }

    public int hashCode() {
        return C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.connectPhase, C0KA.A01(C0KA.A02(this.isLinked), this.isLoading)), this.showOnboarding), this.showDisconnectDialog) + AnonymousClass006.A0G(this.botUsername);
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

    public /* synthetic */ HatchTelegramUiState(boolean z, boolean z2, TelegramConnectPhase telegramConnectPhase, boolean z3, boolean z4, String str, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass001.A1Q(i, z2), (i & 4) != 0 ? TelegramConnectPhase.IDLE : telegramConnectPhase, AnonymousClass005.A1P(i, z3), AnonymousClass005.A1Q(i, z4), (i & 32) != 0 ? null : str);
    }

    public HatchTelegramUiState(boolean z, boolean z2, TelegramConnectPhase telegramConnectPhase, boolean z3, boolean z4, String str) {
        C7384Etj.A0Y(telegramConnectPhase, 2);
        this.isLinked = z;
        this.isLoading = z2;
        this.connectPhase = telegramConnectPhase;
        this.showOnboarding = z3;
        this.showDisconnectDialog = z4;
        this.botUsername = str;
    }
}
