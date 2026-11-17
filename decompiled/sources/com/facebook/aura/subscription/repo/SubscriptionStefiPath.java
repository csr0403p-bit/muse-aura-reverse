package com.facebook.aura.subscription.repo;

import X.AbstractC0878AGe;
import X.AnonymousClass006;
import X.BFI;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import android.net.Uri;
import com.facebook.aura.network.api.StefiHatchPath;
import com.facebook.aura.opengraph.HatchOpenGraphRepository;

/* loaded from: classes4.dex */
public interface SubscriptionStefiPath extends StefiHatchPath.Extension {

    public final class CreditDrain implements SubscriptionStefiPath {
        public static final int $stable = 0;
        public static final CreditDrain INSTANCE = new CreditDrain();
        public static final String value = "/hatch/credit/drain";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CreditDrain);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "CreditDrain";
        }

        public int hashCode() {
            return 1682152261;
        }
    }

    public final class SetViewerName implements SubscriptionStefiPath {
        public static final int $stable = 0;
        public static final SetViewerName INSTANCE = new SetViewerName();
        public static final String value = "/hatch/viewer/name";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SetViewerName);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SetViewerName";
        }

        public int hashCode() {
            return -1581810427;
        }
    }

    public final class ViewerCatalog extends C06G implements SubscriptionStefiPath {
        public static final int $stable = 0;
        public final boolean isCvm;
        public final String storeCountry;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ViewerCatalog) {
                    ViewerCatalog viewerCatalog = (ViewerCatalog) obj;
                    if (!C7384Etj.areEqual(this.storeCountry, viewerCatalog.storeCountry) || this.isCvm != viewerCatalog.isCvm) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ViewerCatalog copy$default(ViewerCatalog viewerCatalog, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = viewerCatalog.storeCountry;
            }
            if ((i & 2) != 0) {
                z = viewerCatalog.isCvm;
            }
            return new ViewerCatalog(str, z);
        }

        public final String component1() {
            return this.storeCountry;
        }

        public final boolean component2() {
            return this.isCvm;
        }

        public final ViewerCatalog copy(String str, boolean z) {
            return new ViewerCatalog(str, z);
        }

        public final String getStoreCountry() {
            return this.storeCountry;
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            String str = this.storeCountry;
            String strA0L = AbstractC0878AGe.A0L("&", "", "", BFI.A0F(new String[]{(str == null || C7BY.A0j(str)) ? null : FGI.A0M("store_country=", Uri.encode(str)), this.isCvm ? "is_cvm=true" : null}), null);
            return FGI.A0M("/hatch/subscription/catalog", strA0L.length() > 0 ? FGI.A0M(HatchOpenGraphRepository.UNKNOWN_HOST, strA0L) : "");
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass006.A0G(this.storeCountry) * 31, this.isCvm);
        }

        public final boolean isCvm() {
            return this.isCvm;
        }

        public ViewerCatalog(String str, boolean z) {
            this.storeCountry = str;
            this.isCvm = z;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ViewerChange extends C06G implements SubscriptionStefiPath {
        public static final int $stable = 0;
        public final boolean isIacBilling;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ViewerChange) && this.isIacBilling == ((ViewerChange) obj).isIacBilling);
        }

        public static /* synthetic */ ViewerChange copy$default(ViewerChange viewerChange, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = viewerChange.isIacBilling;
            }
            return new ViewerChange(z);
        }

        public final boolean component1() {
            return this.isIacBilling;
        }

        public final ViewerChange copy(boolean z) {
            return new ViewerChange(z);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return FGI.A0M("/hatch/subscription/change?", SubscriptionStefiPathKt.paymentType(this.isIacBilling));
        }

        public int hashCode() {
            return this.isIacBilling ? 1231 : 1237;
        }

        public final boolean isIacBilling() {
            return this.isIacBilling;
        }

        public ViewerChange(boolean z) {
            this.isIacBilling = z;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ViewerPaymentPortal implements SubscriptionStefiPath {
        public static final int $stable = 0;
        public static final ViewerPaymentPortal INSTANCE = new ViewerPaymentPortal();
        public static final String value = "/hatch/subscription/payment-portal";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewerPaymentPortal);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ViewerPaymentPortal";
        }

        public int hashCode() {
            return 696883174;
        }
    }
}
