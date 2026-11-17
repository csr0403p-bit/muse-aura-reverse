package com.facebook.aura.activation.model;

import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface InviteCodeError {

    public final class Generic implements InviteCodeError {
        public static final Generic INSTANCE = new Generic();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Generic);
        }

        public String toString() {
            return "Generic";
        }

        public int hashCode() {
            return 1723099694;
        }
    }

    public final class Invalid extends C06G implements InviteCodeError {
        public final String serverMessage;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Invalid) && C7384Etj.areEqual(this.serverMessage, ((Invalid) obj).serverMessage));
        }

        public static /* synthetic */ Invalid copy$default(Invalid invalid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = invalid.serverMessage;
            }
            return new Invalid(str);
        }

        public final String component1() {
            return this.serverMessage;
        }

        public final Invalid copy(String str) {
            return new Invalid(str);
        }

        public final String getServerMessage() {
            return this.serverMessage;
        }

        public int hashCode() {
            return AnonymousClass006.A0G(this.serverMessage);
        }

        public Invalid(String str) {
            this.serverMessage = str;
        }

        public String toString() {
            return super.toString();
        }
    }
}
