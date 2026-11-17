package com.facebook.aura.whatsapp.viewmodel;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class WhatsAppCompanionUiState extends C06G {
    public final WhatsAppCompanionErrorType errorType;
    public final boolean isConnected;
    public final boolean isPolling;
    public final String linkCode;
    public final WhatsAppCompanionFlowPhase phase;

    public final WhatsAppCompanionUiState copy(WhatsAppCompanionFlowPhase whatsAppCompanionFlowPhase, String str, boolean z, boolean z2, WhatsAppCompanionErrorType whatsAppCompanionErrorType) {
        C7384Etj.A0Y(whatsAppCompanionFlowPhase, 0);
        return new WhatsAppCompanionUiState(whatsAppCompanionFlowPhase, str, z, z2, whatsAppCompanionErrorType);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WhatsAppCompanionUiState) {
                WhatsAppCompanionUiState whatsAppCompanionUiState = (WhatsAppCompanionUiState) obj;
                if (this.phase != whatsAppCompanionUiState.phase || !C7384Etj.areEqual(this.linkCode, whatsAppCompanionUiState.linkCode) || this.isPolling != whatsAppCompanionUiState.isPolling || this.isConnected != whatsAppCompanionUiState.isConnected || this.errorType != whatsAppCompanionUiState.errorType) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ WhatsAppCompanionUiState(WhatsAppCompanionFlowPhase whatsAppCompanionFlowPhase, String str, boolean z, boolean z2, WhatsAppCompanionErrorType whatsAppCompanionErrorType, int i, C06H c06h) {
        this((i & 1) != 0 ? WhatsAppCompanionFlowPhase.PHONE_INPUT : whatsAppCompanionFlowPhase, (i & 2) != 0 ? null : str, AnonymousClass005.A1O(i, z), AnonymousClass005.A1P(i, z2), (i & 16) != 0 ? null : whatsAppCompanionErrorType);
    }

    public static /* synthetic */ WhatsAppCompanionUiState copy$default(WhatsAppCompanionUiState whatsAppCompanionUiState, WhatsAppCompanionFlowPhase whatsAppCompanionFlowPhase, String str, boolean z, boolean z2, WhatsAppCompanionErrorType whatsAppCompanionErrorType, int i, Object obj) {
        if ((i & 1) != 0) {
            whatsAppCompanionFlowPhase = whatsAppCompanionUiState.phase;
        }
        if ((i & 2) != 0) {
            str = whatsAppCompanionUiState.linkCode;
        }
        if ((i & 4) != 0) {
            z = whatsAppCompanionUiState.isPolling;
        }
        if ((i & 8) != 0) {
            z2 = whatsAppCompanionUiState.isConnected;
        }
        if ((i & 16) != 0) {
            whatsAppCompanionErrorType = whatsAppCompanionUiState.errorType;
        }
        return whatsAppCompanionUiState.copy(whatsAppCompanionFlowPhase, str, z, z2, whatsAppCompanionErrorType);
    }

    public final WhatsAppCompanionFlowPhase component1() {
        return this.phase;
    }

    public final String component2() {
        return this.linkCode;
    }

    public final boolean component3() {
        return this.isPolling;
    }

    public final boolean component4() {
        return this.isConnected;
    }

    public final WhatsAppCompanionErrorType component5() {
        return this.errorType;
    }

    public final WhatsAppCompanionErrorType getErrorType() {
        return this.errorType;
    }

    public final String getLinkCode() {
        return this.linkCode;
    }

    public final WhatsAppCompanionFlowPhase getPhase() {
        return this.phase;
    }

    public int hashCode() {
        return C0KA.A01(C0KA.A01((AnonymousClass005.A0E(this.phase) + AnonymousClass006.A0G(this.linkCode)) * 31, this.isPolling), this.isConnected) + C3cH.A02(this.errorType);
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public final boolean isPolling() {
        return this.isPolling;
    }

    public String toString() {
        return super.toString();
    }

    public WhatsAppCompanionUiState(WhatsAppCompanionFlowPhase whatsAppCompanionFlowPhase, String str, boolean z, boolean z2, WhatsAppCompanionErrorType whatsAppCompanionErrorType) {
        C7384Etj.A0Y(whatsAppCompanionFlowPhase, 0);
        this.phase = whatsAppCompanionFlowPhase;
        this.linkCode = str;
        this.isPolling = z;
        this.isConnected = z2;
        this.errorType = whatsAppCompanionErrorType;
    }

    public WhatsAppCompanionUiState() {
        this(WhatsAppCompanionFlowPhase.PHONE_INPUT, null, false, false, null);
    }
}
