package com.facebook.aura.devices.link.ordering.impl;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C31u;
import X.C7384Etj;
import X.C9hr;
import X.F0C;
import X.InterfaceC7359EnW;
import com.facebook.aura.R;
import com.facebook.aura.devices.intf.SubscriptionAddOnEntry;
import com.facebook.aura.devices.intf.SubscriptionAddOnIntegration;
import com.facebook.aura.devices.intf.SubscriptionAddOnManagementAction;
import com.facebook.aura.devices.intf.SubscriptionCheckoutAddOnUi;
import com.facebook.aura.devices.link.ordering.HatchLinkSubscriptionAddOnUi;
import com.facebook.aura.devices.link.ordering.impl.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.HatchLinkOrderEntryPoint;
import com.facebook.aura.navigation.key.HatchLinkOrderSheetKey;
import com.facebook.aura.utils.HatchUtil;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class HatchLinkSubscriptionAddOnIntegration implements SubscriptionAddOnIntegration {
    public static final String catalogType = "META_HOME_LINK";
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(HatchLinkSubscriptionAddOnIntegration.class, "checkoutAddOnEnabled", "getCheckoutAddOnEnabled()Z");
    public static final HatchLinkSubscriptionAddOnIntegration INSTANCE = new HatchLinkSubscriptionAddOnIntegration();
    public static final C31u checkoutAddOnEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_link.checkout_add_on_enabled);

    @Override // com.facebook.aura.devices.intf.SubscriptionAddOnIntegration
    public boolean isPrePurchaseClaim(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        return (auraNavKey instanceof HatchLinkOrderSheetKey) && ((HatchLinkOrderSheetKey) auraNavKey).entryPoint != HatchLinkOrderEntryPoint.POST_PURCHASE;
    }

    @Override // com.facebook.aura.devices.intf.SubscriptionAddOnIntegration
    public SubscriptionAddOnManagementAction managementAction(SubscriptionAddOnEntry subscriptionAddOnEntry) {
        HatchLinkOrderEntryPoint hatchLinkOrderEntryPoint;
        C7384Etj.A0Y(subscriptionAddOnEntry, 0);
        F0C<C9hr<Object>>[] f0cArr = HatchLinkOrderSheetKey.$childSerializers;
        int iOrdinal = subscriptionAddOnEntry.ordinal();
        if (iOrdinal == 0) {
            hatchLinkOrderEntryPoint = HatchLinkOrderEntryPoint.MANAGE_SUBSCRIPTION;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            hatchLinkOrderEntryPoint = HatchLinkOrderEntryPoint.SETTINGS_DEVICES;
        }
        return new SubscriptionAddOnManagementAction(R.drawable.meta_icons_2_0_vector_housesignalfan_outline_24_wght400, new HatchLinkOrderSheetKey(hatchLinkOrderEntryPoint));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubscriptionAddOnEntry.values().length];
            try {
                AnonymousClass002.A13(SubscriptionAddOnEntry.MANAGE_SUBSCRIPTION, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(SubscriptionAddOnEntry.DEVICE_SETTINGS, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean getCheckoutAddOnEnabled() {
        return C31u.A01(this, checkoutAddOnEnabled$delegate, $$delegatedProperties, 0);
    }

    @Override // com.facebook.aura.devices.intf.SubscriptionAddOnIntegration
    public String getCatalogType() {
        return catalogType;
    }

    @Override // com.facebook.aura.devices.intf.SubscriptionAddOnIntegration
    public boolean isEnabled() {
        return HatchUtil.INSTANCE.isLinkDeviceOrderingEnabled();
    }

    @Override // com.facebook.aura.devices.intf.SubscriptionAddOnIntegration
    public SubscriptionCheckoutAddOnUi ui() {
        return HatchLinkSubscriptionAddOnUi.INSTANCE;
    }

    @Override // com.facebook.aura.devices.intf.SubscriptionAddOnIntegration
    public boolean isCheckoutEnabled() {
        return isEnabled() && getCheckoutAddOnEnabled();
    }
}
