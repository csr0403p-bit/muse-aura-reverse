package com.facebook.aura.vmbrowser.runtime;

import X.AnonymousClass006;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes2.dex */
public interface BrowserDeviceCopyResult {

    public final class Available implements BrowserDeviceCopyResult {
        public static final int $stable = 0;
        public final String text;

        public Available(String str) {
            C7384Etj.A0Y(str, 0);
            this.text = str;
        }

        public final String getText() {
            return this.text;
        }
    }

    public final class Blocked implements BrowserDeviceCopyResult {
        public static final int $stable = 0;
        public static final Blocked INSTANCE = new Blocked();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Blocked);
        }

        public String toString() {
            return "Blocked";
        }

        public int hashCode() {
            return 744841579;
        }
    }

    public final class OutcomeUnknown implements BrowserDeviceCopyResult {
        public static final int $stable = 0;
        public static final OutcomeUnknown INSTANCE = new OutcomeUnknown();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof OutcomeUnknown);
        }

        public String toString() {
            return "OutcomeUnknown";
        }

        public int hashCode() {
            return -203907015;
        }
    }

    public final class TryAgain implements BrowserDeviceCopyResult {
        public static final int $stable = 0;
        public static final TryAgain INSTANCE = new TryAgain();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof TryAgain);
        }

        public String toString() {
            return "TryAgain";
        }

        public int hashCode() {
            return -89076026;
        }
    }

    public final class Unavailable implements BrowserDeviceCopyResult {
        public static final int $stable = 0;
        public final BrowserClipboardUnavailableReason reason;
        public final BrowserClipboardReasonDetail reasonDetail;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Unavailable) {
                    Unavailable unavailable = (Unavailable) obj;
                    if (this.reason != unavailable.reason || this.reasonDetail != unavailable.reasonDetail) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Unavailable copy$default(Unavailable unavailable, BrowserClipboardUnavailableReason browserClipboardUnavailableReason, BrowserClipboardReasonDetail browserClipboardReasonDetail, int i, Object obj) {
            if ((i & 1) != 0) {
                browserClipboardUnavailableReason = unavailable.reason;
            }
            if ((i & 2) != 0) {
                browserClipboardReasonDetail = unavailable.reasonDetail;
            }
            return new Unavailable(browserClipboardUnavailableReason, browserClipboardReasonDetail);
        }

        public final BrowserClipboardUnavailableReason component1() {
            return this.reason;
        }

        public final BrowserClipboardReasonDetail component2() {
            return this.reasonDetail;
        }

        public final Unavailable copy(BrowserClipboardUnavailableReason browserClipboardUnavailableReason, BrowserClipboardReasonDetail browserClipboardReasonDetail) {
            return new Unavailable(browserClipboardUnavailableReason, browserClipboardReasonDetail);
        }

        public final BrowserClipboardUnavailableReason getReason() {
            return this.reason;
        }

        public final BrowserClipboardReasonDetail getReasonDetail() {
            return this.reasonDetail;
        }

        public int hashCode() {
            return (AnonymousClass006.A0D(this.reason) * 31) + C3cH.A02(this.reasonDetail);
        }

        public String toString() {
            return C3cJ.A0L(this.reasonDetail, ", reasonDetail=", C3cG.A0f(this.reason, "Unavailable(reason="));
        }

        public Unavailable(BrowserClipboardUnavailableReason browserClipboardUnavailableReason, BrowserClipboardReasonDetail browserClipboardReasonDetail) {
            this.reason = browserClipboardUnavailableReason;
            this.reasonDetail = browserClipboardReasonDetail;
        }

        public /* synthetic */ Unavailable(BrowserClipboardUnavailableReason browserClipboardUnavailableReason, BrowserClipboardReasonDetail browserClipboardReasonDetail, int i, C06H c06h) {
            this((i & 1) != 0 ? null : browserClipboardUnavailableReason, (i & 2) != 0 ? null : browserClipboardReasonDetail);
        }

        public Unavailable() {
            this(null, null);
        }
    }
}
