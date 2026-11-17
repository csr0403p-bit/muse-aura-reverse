package com.facebook.aura.partners.voice.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class VoicePreviewKey extends C06G {
    public static final int $stable = 0;
    public final String ownerId;
    public final String rowId;
    public final String voiceId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoicePreviewKey) {
                VoicePreviewKey voicePreviewKey = (VoicePreviewKey) obj;
                if (!C7384Etj.areEqual(this.ownerId, voicePreviewKey.ownerId) || !C7384Etj.areEqual(this.rowId, voicePreviewKey.rowId) || !C7384Etj.areEqual(this.voiceId, voicePreviewKey.voiceId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoicePreviewKey copy$default(VoicePreviewKey voicePreviewKey, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voicePreviewKey.ownerId;
        }
        if ((i & 2) != 0) {
            str2 = voicePreviewKey.rowId;
        }
        if ((i & 4) != 0) {
            str3 = voicePreviewKey.voiceId;
        }
        return voicePreviewKey.copy(str, str2, str3);
    }

    public final String component1() {
        return this.ownerId;
    }

    public final String component2() {
        return this.rowId;
    }

    public final String component3() {
        return this.voiceId;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final String getRowId() {
        return this.rowId;
    }

    public final String getVoiceId() {
        return this.voiceId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.voiceId, AnonymousClass005.A0I(this.rowId, AnonymousClass001.A0G(this.ownerId)));
    }

    public VoicePreviewKey(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.ownerId = str;
        this.rowId = str2;
        this.voiceId = str3;
    }

    public final VoicePreviewKey copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new VoicePreviewKey(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }
}
