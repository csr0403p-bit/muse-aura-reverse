package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class DeliveryCheckoutPriceItemJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final DeliveryCheckoutMoneyJson amount;
    public final String kind;

    public final class Companion {
        public final C9hr<DeliveryCheckoutPriceItemJson> serializer() {
            return DeliveryCheckoutPriceItemJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(DeliveryCheckoutPriceItemJson deliveryCheckoutPriceItemJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || deliveryCheckoutPriceItemJson.kind != null) {
            c9j5.AAP(deliveryCheckoutPriceItemJson.kind, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || deliveryCheckoutPriceItemJson.amount != null) {
            c9j5.AAP(deliveryCheckoutPriceItemJson.amount, DeliveryCheckoutMoneyJson$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryCheckoutPriceItemJson) {
                DeliveryCheckoutPriceItemJson deliveryCheckoutPriceItemJson = (DeliveryCheckoutPriceItemJson) obj;
                if (!C7384Etj.areEqual(this.kind, deliveryCheckoutPriceItemJson.kind) || !C7384Etj.areEqual(this.amount, deliveryCheckoutPriceItemJson.amount)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeliveryCheckoutPriceItemJson copy$default(DeliveryCheckoutPriceItemJson deliveryCheckoutPriceItemJson, String str, DeliveryCheckoutMoneyJson deliveryCheckoutMoneyJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deliveryCheckoutPriceItemJson.kind;
        }
        if ((i & 2) != 0) {
            deliveryCheckoutMoneyJson = deliveryCheckoutPriceItemJson.amount;
        }
        return new DeliveryCheckoutPriceItemJson(str, deliveryCheckoutMoneyJson);
    }

    public final String component1() {
        return this.kind;
    }

    public final DeliveryCheckoutMoneyJson component2() {
        return this.amount;
    }

    public final DeliveryCheckoutPriceItemJson copy(String str, DeliveryCheckoutMoneyJson deliveryCheckoutMoneyJson) {
        return new DeliveryCheckoutPriceItemJson(str, deliveryCheckoutMoneyJson);
    }

    public final DeliveryCheckoutMoneyJson getAmount() {
        return this.amount;
    }

    public final String getKind() {
        return this.kind;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.kind) * 31) + C3cH.A02(this.amount);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final DeliveryCheckoutPriceItem toDomainOrNull() {
        DeliveryCheckoutPriceKind deliveryCheckoutPriceKind;
        DeliveryCheckoutMoney domainOrNull;
        String str = this.kind;
        if (str != null) {
            switch (str.hashCode()) {
                case -324219495:
                    if (str.equals("delivery_fare")) {
                        deliveryCheckoutPriceKind = DeliveryCheckoutPriceKind.DELIVERY_FARE;
                        break;
                    }
                    break;
                case 101254:
                    if (str.equals("fee")) {
                        deliveryCheckoutPriceKind = DeliveryCheckoutPriceKind.FEE;
                        break;
                    }
                    break;
                case 114603:
                    if (str.equals("tax")) {
                        deliveryCheckoutPriceKind = DeliveryCheckoutPriceKind.TAX;
                        break;
                    }
                    break;
                case 114843:
                    if (str.equals("tip")) {
                        deliveryCheckoutPriceKind = DeliveryCheckoutPriceKind.TIP;
                        break;
                    }
                    break;
            }
            DeliveryCheckoutMoneyJson deliveryCheckoutMoneyJson = this.amount;
            if (deliveryCheckoutMoneyJson != null && (domainOrNull = deliveryCheckoutMoneyJson.toDomainOrNull()) != null) {
                return new DeliveryCheckoutPriceItem(deliveryCheckoutPriceKind, domainOrNull);
            }
        }
        return null;
    }

    public DeliveryCheckoutPriceItemJson(String str, DeliveryCheckoutMoneyJson deliveryCheckoutMoneyJson) {
        this.kind = str;
        this.amount = deliveryCheckoutMoneyJson;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DeliveryCheckoutPriceItemJson(int i, String str, DeliveryCheckoutMoneyJson deliveryCheckoutMoneyJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.kind = null;
        } else {
            this.kind = str;
        }
        if ((i & 2) == 0) {
            this.amount = null;
        } else {
            this.amount = deliveryCheckoutMoneyJson;
        }
    }

    public /* synthetic */ DeliveryCheckoutPriceItemJson(String str, DeliveryCheckoutMoneyJson deliveryCheckoutMoneyJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : deliveryCheckoutMoneyJson);
    }

    public DeliveryCheckoutPriceItemJson() {
        this(null, null);
    }
}
