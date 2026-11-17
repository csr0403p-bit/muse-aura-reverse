package com.facebook.aura.login.credentials;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class RecordSlot extends C06G {
    public final String abraUserId;
    public final String slot;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecordSlot) {
                RecordSlot recordSlot = (RecordSlot) obj;
                if (!C7384Etj.areEqual(this.slot, recordSlot.slot) || !C7384Etj.areEqual(this.abraUserId, recordSlot.abraUserId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RecordSlot copy$default(RecordSlot recordSlot, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recordSlot.slot;
        }
        if ((i & 2) != 0) {
            str2 = recordSlot.abraUserId;
        }
        AnonymousClass003.A0u(str, str2);
        return new RecordSlot(str, str2);
    }

    public final String component1() {
        return this.slot;
    }

    public final String component2() {
        return this.abraUserId;
    }

    public final String getAbraUserId() {
        return this.abraUserId;
    }

    public final String getSlot() {
        return this.slot;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.abraUserId, AnonymousClass001.A0G(this.slot));
    }

    public RecordSlot(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.slot = str;
        this.abraUserId = str2;
    }

    public final RecordSlot copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new RecordSlot(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
