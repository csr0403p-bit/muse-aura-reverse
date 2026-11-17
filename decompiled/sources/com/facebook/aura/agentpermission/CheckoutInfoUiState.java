package com.facebook.aura.agentpermission;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.agentpermission.CheckoutInfoTitle;
import com.facebook.aura.gateway.CheckoutInfo;

/* loaded from: classes2.dex */
public interface CheckoutInfoUiState {

    public final class Content extends C06G implements CheckoutInfoUiState {
        public static final int $stable = CheckoutInfo.$stable;
        public final CheckoutInfo info;
        public final String paymentMethod;
        public final CheckoutInfoTitle title;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Content) {
                    Content content = (Content) obj;
                    if (!C7384Etj.areEqual(this.info, content.info) || !C7384Etj.areEqual(this.paymentMethod, content.paymentMethod)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Content copy$default(Content content, CheckoutInfo checkoutInfo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                checkoutInfo = content.info;
            }
            if ((i & 2) != 0) {
                str = content.paymentMethod;
            }
            AnonymousClass003.A0u(checkoutInfo, str);
            return new Content(checkoutInfo, str);
        }

        public final CheckoutInfo component1() {
            return this.info;
        }

        public final String component2() {
            return this.paymentMethod;
        }

        public final CheckoutInfo getInfo() {
            return this.info;
        }

        @Override // com.facebook.aura.agentpermission.CheckoutInfoUiState
        public String getPaymentMethod() {
            return this.paymentMethod;
        }

        @Override // com.facebook.aura.agentpermission.CheckoutInfoUiState
        public CheckoutInfoTitle getTitle() {
            return this.title;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.paymentMethod, AnonymousClass005.A0E(this.info));
        }

        public Content(CheckoutInfo checkoutInfo, String str) {
            AnonymousClass003.A0u(checkoutInfo, str);
            this.info = checkoutInfo;
            this.paymentMethod = str;
            this.title = new CheckoutInfoTitle.Server(checkoutInfo.title);
        }

        public final Content copy(CheckoutInfo checkoutInfo, String str) {
            AnonymousClass003.A0u(checkoutInfo, str);
            return new Content(checkoutInfo, str);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Error extends C06G implements CheckoutInfoUiState {
        public static final int $stable = 8;
        public final boolean canRetry;
        public final String paymentMethod;
        public final CheckoutInfoTitle title;

        public Error(String str, CheckoutInfoTitle checkoutInfoTitle, boolean z) {
            C7384Etj.A0Y(checkoutInfoTitle, 1);
            this.paymentMethod = str;
            this.title = checkoutInfoTitle;
            this.canRetry = z;
        }

        public final Error copy(String str, CheckoutInfoTitle checkoutInfoTitle, boolean z) {
            C7384Etj.A0Y(checkoutInfoTitle, 1);
            return new Error(str, checkoutInfoTitle, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Error) {
                    Error error = (Error) obj;
                    if (!C7384Etj.areEqual(this.paymentMethod, error.paymentMethod) || !C7384Etj.areEqual(this.title, error.title) || this.canRetry != error.canRetry) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, CheckoutInfoTitle checkoutInfoTitle, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.paymentMethod;
            }
            if ((i & 2) != 0) {
                checkoutInfoTitle = error.title;
            }
            if ((i & 4) != 0) {
                z = error.canRetry;
            }
            return error.copy(str, checkoutInfoTitle, z);
        }

        public final String component1() {
            return this.paymentMethod;
        }

        public final CheckoutInfoTitle component2() {
            return this.title;
        }

        public final boolean component3() {
            return this.canRetry;
        }

        public final boolean getCanRetry() {
            return this.canRetry;
        }

        @Override // com.facebook.aura.agentpermission.CheckoutInfoUiState
        public String getPaymentMethod() {
            return this.paymentMethod;
        }

        @Override // com.facebook.aura.agentpermission.CheckoutInfoUiState
        public CheckoutInfoTitle getTitle() {
            return this.title;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0F(this.title, AnonymousClass006.A0G(this.paymentMethod) * 31), this.canRetry);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Loading extends C06G implements CheckoutInfoUiState {
        public static final int $stable = 8;
        public final String paymentMethod;
        public final CheckoutInfoTitle title;

        public Loading(String str, CheckoutInfoTitle checkoutInfoTitle) {
            C7384Etj.A0Y(checkoutInfoTitle, 1);
            this.paymentMethod = str;
            this.title = checkoutInfoTitle;
        }

        public final Loading copy(String str, CheckoutInfoTitle checkoutInfoTitle) {
            C7384Etj.A0Y(checkoutInfoTitle, 1);
            return new Loading(str, checkoutInfoTitle);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Loading) {
                    Loading loading = (Loading) obj;
                    if (!C7384Etj.areEqual(this.paymentMethod, loading.paymentMethod) || !C7384Etj.areEqual(this.title, loading.title)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Loading copy$default(Loading loading, String str, CheckoutInfoTitle checkoutInfoTitle, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loading.paymentMethod;
            }
            if ((i & 2) != 0) {
                checkoutInfoTitle = loading.title;
            }
            C7384Etj.A0Y(checkoutInfoTitle, 1);
            return new Loading(str, checkoutInfoTitle);
        }

        public final String component1() {
            return this.paymentMethod;
        }

        public final CheckoutInfoTitle component2() {
            return this.title;
        }

        @Override // com.facebook.aura.agentpermission.CheckoutInfoUiState
        public String getPaymentMethod() {
            return this.paymentMethod;
        }

        @Override // com.facebook.aura.agentpermission.CheckoutInfoUiState
        public CheckoutInfoTitle getTitle() {
            return this.title;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.title, AnonymousClass006.A0G(this.paymentMethod) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    String getPaymentMethod();

    CheckoutInfoTitle getTitle();
}
