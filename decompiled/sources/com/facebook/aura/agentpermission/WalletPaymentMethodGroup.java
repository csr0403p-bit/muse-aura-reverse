package com.facebook.aura.agentpermission;

import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import X.F60;
import com.facebook.aura.gateway.WalletPaymentOption;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class WalletPaymentMethodGroup extends C06G {
    public static final int $stable = 0;
    public final String displayName;
    public final String paymentMethod;
    public final AHD<WalletPaymentOption> paymentOptions;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WalletPaymentMethodGroup) {
                WalletPaymentMethodGroup walletPaymentMethodGroup = (WalletPaymentMethodGroup) obj;
                if (!C7384Etj.areEqual(this.paymentMethod, walletPaymentMethodGroup.paymentMethod) || !C7384Etj.areEqual(this.displayName, walletPaymentMethodGroup.displayName) || !C7384Etj.areEqual(this.paymentOptions, walletPaymentMethodGroup.paymentOptions)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletPaymentMethodGroup copy$default(WalletPaymentMethodGroup walletPaymentMethodGroup, String str, String str2, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletPaymentMethodGroup.paymentMethod;
        }
        if ((i & 2) != 0) {
            str2 = walletPaymentMethodGroup.displayName;
        }
        if ((i & 4) != 0) {
            ahd = walletPaymentMethodGroup.paymentOptions;
        }
        return walletPaymentMethodGroup.copy(str, str2, ahd);
    }

    public final String component1() {
        return this.paymentMethod;
    }

    public final String component2() {
        return this.displayName;
    }

    public final AHD<WalletPaymentOption> component3() {
        return this.paymentOptions;
    }

    public final WalletPaymentOption displayOption(WalletOptionKey walletOptionKey) {
        Object obj;
        Object next;
        Iterator it = this.paymentOptions.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (CheckoutWalletSheetViewModelKt.getKey((WalletPaymentOption) next).equals(walletOptionKey)) {
                break;
            }
        }
        WalletPaymentOption walletPaymentOption = (WalletPaymentOption) next;
        if (walletPaymentOption != null) {
            return walletPaymentOption;
        }
        Iterator it2 = this.paymentOptions.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((WalletPaymentOption) next2).isEligible) {
                obj = next2;
                break;
            }
        }
        WalletPaymentOption walletPaymentOption2 = (WalletPaymentOption) obj;
        return walletPaymentOption2 == null ? (WalletPaymentOption) AbstractC0878AGe.A0G(this.paymentOptions) : walletPaymentOption2;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final int getEligibleOptionCount() {
        AHD<WalletPaymentOption> ahd = this.paymentOptions;
        int i = 0;
        if (!(ahd instanceof Collection) || !ahd.isEmpty()) {
            Iterator it = ahd.iterator();
            while (it.hasNext()) {
                if (((WalletPaymentOption) it.next()).isEligible && (i = i + 1) < 0) {
                    AbstractC0885AGm.A13();
                    throw F60.createAndThrow();
                }
            }
        }
        return i;
    }

    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public final AHD<WalletPaymentOption> getPaymentOptions() {
        return this.paymentOptions;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.paymentOptions, (AnonymousClass001.A0G(this.paymentMethod) + AnonymousClass006.A0G(this.displayName)) * 31);
    }

    public final boolean isEligible() {
        AHD<WalletPaymentOption> ahd = this.paymentOptions;
        if (!(ahd instanceof Collection) || !ahd.isEmpty()) {
            Iterator it = ahd.iterator();
            while (it.hasNext()) {
                if (((WalletPaymentOption) it.next()).isEligible) {
                    return true;
                }
            }
        }
        return false;
    }

    public WalletPaymentMethodGroup(String str, String str2, AHD<WalletPaymentOption> ahd) {
        AnonymousClass003.A0v(str, ahd);
        this.paymentMethod = str;
        this.displayName = str2;
        this.paymentOptions = ahd;
    }

    public final WalletPaymentMethodGroup copy(String str, String str2, AHD<WalletPaymentOption> ahd) {
        AnonymousClass003.A0v(str, ahd);
        return new WalletPaymentMethodGroup(str, str2, ahd);
    }

    public String toString() {
        return super.toString();
    }
}
