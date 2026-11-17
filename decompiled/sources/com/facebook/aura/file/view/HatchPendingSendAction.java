package com.facebook.aura.file.view;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchPendingSendAction {
    public static final int $stable = 0;
    public static final HatchPendingSendAction INSTANCE = new HatchPendingSendAction();
    public static PendingSend pendingAction;

    public final class PendingSend extends C06G {
        public static final int $stable = 0;
        public final String mediaReference;
        public final String messageId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PendingSend) {
                    PendingSend pendingSend = (PendingSend) obj;
                    if (!C7384Etj.areEqual(this.messageId, pendingSend.messageId) || !C7384Etj.areEqual(this.mediaReference, pendingSend.mediaReference)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ PendingSend copy$default(PendingSend pendingSend, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pendingSend.messageId;
            }
            if ((i & 2) != 0) {
                str2 = pendingSend.mediaReference;
            }
            return new PendingSend(str, str2);
        }

        public final String component1() {
            return this.messageId;
        }

        public final String component2() {
            return this.mediaReference;
        }

        public final PendingSend copy(String str, String str2) {
            return new PendingSend(str, str2);
        }

        public final String getMediaReference() {
            return this.mediaReference;
        }

        public final String getMessageId() {
            return this.messageId;
        }

        public int hashCode() {
            return (AnonymousClass006.A0G(this.messageId) * 31) + AnonymousClass005.A0H(this.mediaReference);
        }

        public PendingSend(String str, String str2) {
            this.messageId = str;
            this.mediaReference = str2;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final synchronized PendingSend consume() {
        PendingSend pendingSend;
        pendingSend = pendingAction;
        pendingAction = null;
        return pendingSend;
    }

    public final synchronized void set(String str, String str2) {
        pendingAction = new PendingSend(str, str2);
    }
}
