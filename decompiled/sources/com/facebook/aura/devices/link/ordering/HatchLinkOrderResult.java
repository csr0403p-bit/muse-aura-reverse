package com.facebook.aura.devices.link.ordering;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface HatchLinkOrderResult {

    /* loaded from: classes4.dex */
    public final class Blocked extends C06G implements HatchLinkOrderResult {
        public static final int $stable = 0;
        public final HatchLinkOrderBlockReason reason;

        public Blocked(HatchLinkOrderBlockReason hatchLinkOrderBlockReason) {
            C7384Etj.A0Y(hatchLinkOrderBlockReason, 0);
            this.reason = hatchLinkOrderBlockReason;
        }

        public final Blocked copy(HatchLinkOrderBlockReason hatchLinkOrderBlockReason) {
            C7384Etj.A0Y(hatchLinkOrderBlockReason, 0);
            return new Blocked(hatchLinkOrderBlockReason);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Blocked) && this.reason == ((Blocked) obj).reason);
        }

        public static /* synthetic */ Blocked copy$default(Blocked blocked, HatchLinkOrderBlockReason hatchLinkOrderBlockReason, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchLinkOrderBlockReason = blocked.reason;
            }
            C7384Etj.A0Y(hatchLinkOrderBlockReason, 0);
            return new Blocked(hatchLinkOrderBlockReason);
        }

        public final HatchLinkOrderBlockReason component1() {
            return this.reason;
        }

        public final HatchLinkOrderBlockReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes4.dex */
    public final class Failed extends C06G implements HatchLinkOrderResult {
        public static final int $stable = 0;
        public final HatchLinkOrderSubmitError error;
        public final String message;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Failed) {
                    Failed failed = (Failed) obj;
                    if (!C7384Etj.areEqual(this.message, failed.message) || this.error != failed.error) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, String str, HatchLinkOrderSubmitError hatchLinkOrderSubmitError, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failed.message;
            }
            if ((i & 2) != 0) {
                hatchLinkOrderSubmitError = failed.error;
            }
            AnonymousClass003.A0u(str, hatchLinkOrderSubmitError);
            return new Failed(str, hatchLinkOrderSubmitError);
        }

        public final String component1() {
            return this.message;
        }

        public final HatchLinkOrderSubmitError component2() {
            return this.error;
        }

        public final HatchLinkOrderSubmitError getError() {
            return this.error;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.error, AnonymousClass001.A0G(this.message));
        }

        public Failed(String str, HatchLinkOrderSubmitError hatchLinkOrderSubmitError) {
            AnonymousClass003.A0u(str, hatchLinkOrderSubmitError);
            this.message = str;
            this.error = hatchLinkOrderSubmitError;
        }

        public final Failed copy(String str, HatchLinkOrderSubmitError hatchLinkOrderSubmitError) {
            AnonymousClass003.A0u(str, hatchLinkOrderSubmitError);
            return new Failed(str, hatchLinkOrderSubmitError);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Failed(String str, HatchLinkOrderSubmitError hatchLinkOrderSubmitError, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? HatchLinkOrderSubmitError.GENERIC : hatchLinkOrderSubmitError);
        }
    }

    /* loaded from: classes4.dex */
    public final class Rejected extends C06G implements HatchLinkOrderResult {
        public static final int $stable = 0;
        public final String detail;
        public final HatchLinkOrderSubmitError error;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Rejected) {
                    Rejected rejected = (Rejected) obj;
                    if (!C7384Etj.areEqual(this.detail, rejected.detail) || this.error != rejected.error) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Rejected copy$default(Rejected rejected, String str, HatchLinkOrderSubmitError hatchLinkOrderSubmitError, int i, Object obj) {
            if ((i & 1) != 0) {
                str = rejected.detail;
            }
            if ((i & 2) != 0) {
                hatchLinkOrderSubmitError = rejected.error;
            }
            AnonymousClass003.A0u(str, hatchLinkOrderSubmitError);
            return new Rejected(str, hatchLinkOrderSubmitError);
        }

        public final String component1() {
            return this.detail;
        }

        public final HatchLinkOrderSubmitError component2() {
            return this.error;
        }

        public final String getDetail() {
            return this.detail;
        }

        public final HatchLinkOrderSubmitError getError() {
            return this.error;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.error, AnonymousClass001.A0G(this.detail));
        }

        public Rejected(String str, HatchLinkOrderSubmitError hatchLinkOrderSubmitError) {
            AnonymousClass003.A0u(str, hatchLinkOrderSubmitError);
            this.detail = str;
            this.error = hatchLinkOrderSubmitError;
        }

        public final Rejected copy(String str, HatchLinkOrderSubmitError hatchLinkOrderSubmitError) {
            AnonymousClass003.A0u(str, hatchLinkOrderSubmitError);
            return new Rejected(str, hatchLinkOrderSubmitError);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Rejected(String str, HatchLinkOrderSubmitError hatchLinkOrderSubmitError, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? HatchLinkOrderSubmitError.GENERIC : hatchLinkOrderSubmitError);
        }
    }

    /* loaded from: classes4.dex */
    public final class Success extends C06G implements HatchLinkOrderResult {
        public static final int $stable = 0;
        public final HatchLinkOrder order;

        public Success(HatchLinkOrder hatchLinkOrder) {
            C7384Etj.A0Y(hatchLinkOrder, 0);
            this.order = hatchLinkOrder;
        }

        public final Success copy(HatchLinkOrder hatchLinkOrder) {
            C7384Etj.A0Y(hatchLinkOrder, 0);
            return new Success(hatchLinkOrder);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Success) && C7384Etj.areEqual(this.order, ((Success) obj).order));
        }

        public static /* synthetic */ Success copy$default(Success success, HatchLinkOrder hatchLinkOrder, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchLinkOrder = success.order;
            }
            C7384Etj.A0Y(hatchLinkOrder, 0);
            return new Success(hatchLinkOrder);
        }

        public final HatchLinkOrder component1() {
            return this.order;
        }

        public final HatchLinkOrder getOrder() {
            return this.order;
        }

        public int hashCode() {
            return this.order.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
