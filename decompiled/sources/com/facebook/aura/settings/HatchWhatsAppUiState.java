package com.facebook.aura.settings;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.settings.WhatsAppConnectDisclosure;

/* loaded from: classes6.dex */
public final class HatchWhatsAppUiState extends C06G {
    public static final int $stable = 8;
    public final boolean awaitingStatusAfterDisconnect;
    public final WhatsAppConnectPhase connectPhase;
    public final WhatsAppConnectDisclosure disclosure;
    public final boolean isHandoff;
    public final boolean isLinked;
    public final boolean isLoading;
    public final boolean needsAttention;
    public final String pairingUrl;
    public final WhatsAppReplacePhase replacePhase;
    public final boolean showDisconnectDialog;
    public final boolean statusLoaded;

    public HatchWhatsAppUiState() {
        this(false, false, false, WhatsAppConnectPhase.IDLE, null, false, WhatsAppReplacePhase.IDLE, false, false, false, WhatsAppConnectDisclosure.Loading.INSTANCE);
    }

    public final HatchWhatsAppUiState copy(boolean z, boolean z2, boolean z3, WhatsAppConnectPhase whatsAppConnectPhase, String str, boolean z4, WhatsAppReplacePhase whatsAppReplacePhase, boolean z5, boolean z6, boolean z7, WhatsAppConnectDisclosure whatsAppConnectDisclosure) {
        AnonymousClass002.A1E(whatsAppConnectPhase, 3, whatsAppReplacePhase);
        C7384Etj.A0Y(whatsAppConnectDisclosure, 10);
        return new HatchWhatsAppUiState(z, z2, z3, whatsAppConnectPhase, str, z4, whatsAppReplacePhase, z5, z6, z7, whatsAppConnectDisclosure);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchWhatsAppUiState) {
                HatchWhatsAppUiState hatchWhatsAppUiState = (HatchWhatsAppUiState) obj;
                if (this.isLinked != hatchWhatsAppUiState.isLinked || this.needsAttention != hatchWhatsAppUiState.needsAttention || this.isLoading != hatchWhatsAppUiState.isLoading || this.connectPhase != hatchWhatsAppUiState.connectPhase || !C7384Etj.areEqual(this.pairingUrl, hatchWhatsAppUiState.pairingUrl) || this.showDisconnectDialog != hatchWhatsAppUiState.showDisconnectDialog || this.replacePhase != hatchWhatsAppUiState.replacePhase || this.statusLoaded != hatchWhatsAppUiState.statusLoaded || this.isHandoff != hatchWhatsAppUiState.isHandoff || this.awaitingStatusAfterDisconnect != hatchWhatsAppUiState.awaitingStatusAfterDisconnect || !C7384Etj.areEqual(this.disclosure, hatchWhatsAppUiState.disclosure)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchWhatsAppUiState copy$default(HatchWhatsAppUiState hatchWhatsAppUiState, boolean z, boolean z2, boolean z3, WhatsAppConnectPhase whatsAppConnectPhase, String str, boolean z4, WhatsAppReplacePhase whatsAppReplacePhase, boolean z5, boolean z6, boolean z7, WhatsAppConnectDisclosure whatsAppConnectDisclosure, int i, Object obj) {
        if ((i & 1) != 0) {
            z = hatchWhatsAppUiState.isLinked;
        }
        if ((i & 2) != 0) {
            z2 = hatchWhatsAppUiState.needsAttention;
        }
        if ((i & 4) != 0) {
            z3 = hatchWhatsAppUiState.isLoading;
        }
        if ((i & 8) != 0) {
            whatsAppConnectPhase = hatchWhatsAppUiState.connectPhase;
        }
        if ((i & 16) != 0) {
            str = hatchWhatsAppUiState.pairingUrl;
        }
        if ((i & 32) != 0) {
            z4 = hatchWhatsAppUiState.showDisconnectDialog;
        }
        if ((i & 64) != 0) {
            whatsAppReplacePhase = hatchWhatsAppUiState.replacePhase;
        }
        if ((i & 128) != 0) {
            z5 = hatchWhatsAppUiState.statusLoaded;
        }
        if ((i & 256) != 0) {
            z6 = hatchWhatsAppUiState.isHandoff;
        }
        if ((i & 512) != 0) {
            z7 = hatchWhatsAppUiState.awaitingStatusAfterDisconnect;
        }
        if ((i & 1024) != 0) {
            whatsAppConnectDisclosure = hatchWhatsAppUiState.disclosure;
        }
        return hatchWhatsAppUiState.copy(z, z2, z3, whatsAppConnectPhase, str, z4, whatsAppReplacePhase, z5, z6, z7, whatsAppConnectDisclosure);
    }

    public final boolean component1() {
        return this.isLinked;
    }

    public final boolean component10() {
        return this.awaitingStatusAfterDisconnect;
    }

    public final WhatsAppConnectDisclosure component11() {
        return this.disclosure;
    }

    public final boolean component2() {
        return this.needsAttention;
    }

    public final boolean component3() {
        return this.isLoading;
    }

    public final WhatsAppConnectPhase component4() {
        return this.connectPhase;
    }

    public final String component5() {
        return this.pairingUrl;
    }

    public final boolean component6() {
        return this.showDisconnectDialog;
    }

    public final WhatsAppReplacePhase component7() {
        return this.replacePhase;
    }

    public final boolean component8() {
        return this.statusLoaded;
    }

    public final boolean component9() {
        return this.isHandoff;
    }

    public final boolean getAwaitingStatusAfterDisconnect() {
        return this.awaitingStatusAfterDisconnect;
    }

    public final WhatsAppConnectPhase getConnectPhase() {
        return this.connectPhase;
    }

    public final WhatsAppConnectDisclosure getDisclosure() {
        return this.disclosure;
    }

    public final boolean getNeedsAttention() {
        return this.needsAttention;
    }

    public final String getPairingUrl() {
        return this.pairingUrl;
    }

    public final WhatsAppReplacePhase getReplacePhase() {
        return this.replacePhase;
    }

    public final boolean getShowDisconnectDialog() {
        return this.showDisconnectDialog;
    }

    public final boolean getStatusLoaded() {
        return this.statusLoaded;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.disclosure, C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.replacePhase, C0KA.A01((AnonymousClass005.A0F(this.connectPhase, C0KA.A01(C0KA.A01(C0KA.A02(this.isLinked), this.needsAttention), this.isLoading)) + AnonymousClass006.A0G(this.pairingUrl)) * 31, this.showDisconnectDialog)), this.statusLoaded), this.isHandoff), this.awaitingStatusAfterDisconnect));
    }

    public final boolean isHandoff() {
        return this.isHandoff;
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

    public /* synthetic */ HatchWhatsAppUiState(boolean z, boolean z2, boolean z3, WhatsAppConnectPhase whatsAppConnectPhase, String str, boolean z4, WhatsAppReplacePhase whatsAppReplacePhase, boolean z5, boolean z6, boolean z7, WhatsAppConnectDisclosure whatsAppConnectDisclosure, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass001.A1Q(i, z2), AnonymousClass005.A1O(i, z3), (i & 8) != 0 ? WhatsAppConnectPhase.IDLE : whatsAppConnectPhase, (i & 16) != 0 ? null : str, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? WhatsAppReplacePhase.IDLE : whatsAppReplacePhase, (i & 128) != 0 ? false : z5, (i & 256) != 0 ? false : z6, (i & 512) != 0 ? false : z7, (i & 1024) != 0 ? WhatsAppConnectDisclosure.Loading.INSTANCE : whatsAppConnectDisclosure);
    }

    public HatchWhatsAppUiState(boolean z, boolean z2, boolean z3, WhatsAppConnectPhase whatsAppConnectPhase, String str, boolean z4, WhatsAppReplacePhase whatsAppReplacePhase, boolean z5, boolean z6, boolean z7, WhatsAppConnectDisclosure whatsAppConnectDisclosure) {
        AnonymousClass002.A1E(whatsAppConnectPhase, 3, whatsAppReplacePhase);
        C7384Etj.A0Y(whatsAppConnectDisclosure, 10);
        this.isLinked = z;
        this.needsAttention = z2;
        this.isLoading = z3;
        this.connectPhase = whatsAppConnectPhase;
        this.pairingUrl = str;
        this.showDisconnectDialog = z4;
        this.replacePhase = whatsAppReplacePhase;
        this.statusLoaded = z5;
        this.isHandoff = z6;
        this.awaitingStatusAfterDisconnect = z7;
        this.disclosure = whatsAppConnectDisclosure;
    }
}
