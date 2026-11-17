package com.facebook.aura.shopping.view;

import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface ProductImagePreview {

    public final class NotRequested implements ProductImagePreview {
        public static final int $stable = 0;
        public static final NotRequested INSTANCE = new NotRequested();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NotRequested);
        }

        public String toString() {
            return "NotRequested";
        }

        public int hashCode() {
            return 1203875456;
        }
    }

    public final class Pending implements ProductImagePreview {
        public static final int $stable = 0;
        public static final Pending INSTANCE = new Pending();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Pending);
        }

        public String toString() {
            return "Pending";
        }

        public int hashCode() {
            return -819047982;
        }
    }

    public final class Resolved extends C06G implements ProductImagePreview {
        public static final int $stable = 0;
        public final String url;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Resolved) && C7384Etj.areEqual(this.url, ((Resolved) obj).url));
        }

        public static /* synthetic */ Resolved copy$default(Resolved resolved, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = resolved.url;
            }
            return new Resolved(str);
        }

        public final String component1() {
            return this.url;
        }

        public final Resolved copy(String str) {
            return new Resolved(str);
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return AnonymousClass006.A0G(this.url);
        }

        public Resolved(String str) {
            this.url = str;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Unavailable implements ProductImagePreview {
        public static final int $stable = 0;
        public static final Unavailable INSTANCE = new Unavailable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public String toString() {
            return "Unavailable";
        }

        public int hashCode() {
            return -1622209781;
        }
    }
}
