package com.facebook.aura.agentpermission;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.List;

/* loaded from: classes2.dex */
public interface CheckoutReceiptRow {

    public final class Amount extends C06G implements CheckoutReceiptRow {
        public static final int $stable = 8;
        public final boolean allowsPromo;
        public final CheckoutAmountPresentation data;
        public final boolean summaryAvailable;

        public Amount(CheckoutAmountPresentation checkoutAmountPresentation, boolean z, boolean z2) {
            C7384Etj.A0Y(checkoutAmountPresentation, 0);
            this.data = checkoutAmountPresentation;
            this.summaryAvailable = z;
            this.allowsPromo = z2;
        }

        public final Amount copy(CheckoutAmountPresentation checkoutAmountPresentation, boolean z, boolean z2) {
            C7384Etj.A0Y(checkoutAmountPresentation, 0);
            return new Amount(checkoutAmountPresentation, z, z2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Amount) {
                    Amount amount = (Amount) obj;
                    if (!C7384Etj.areEqual(this.data, amount.data) || this.summaryAvailable != amount.summaryAvailable || this.allowsPromo != amount.allowsPromo) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Amount copy$default(Amount amount, CheckoutAmountPresentation checkoutAmountPresentation, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                checkoutAmountPresentation = amount.data;
            }
            if ((i & 2) != 0) {
                z = amount.summaryAvailable;
            }
            if ((i & 4) != 0) {
                z2 = amount.allowsPromo;
            }
            return amount.copy(checkoutAmountPresentation, z, z2);
        }

        public final CheckoutAmountPresentation component1() {
            return this.data;
        }

        public final boolean component2() {
            return this.summaryAvailable;
        }

        public final boolean component3() {
            return this.allowsPromo;
        }

        public final boolean getAllowsPromo() {
            return this.allowsPromo;
        }

        public final CheckoutAmountPresentation getData() {
            return this.data;
        }

        public final boolean getSummaryAvailable() {
            return this.summaryAvailable;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01(AnonymousClass005.A0E(this.data), this.summaryAvailable), this.allowsPromo);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Contact extends C06G implements CheckoutReceiptRow {
        public static final int $stable = HatchAgentPermissionsRepository.ShopifyCheckoutContact.$stable;
        public final HatchAgentPermissionsRepository.ShopifyCheckoutContact contact;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Contact) && C7384Etj.areEqual(this.contact, ((Contact) obj).contact));
        }

        public static /* synthetic */ Contact copy$default(Contact contact, HatchAgentPermissionsRepository.ShopifyCheckoutContact shopifyCheckoutContact, int i, Object obj) {
            if ((i & 1) != 0) {
                shopifyCheckoutContact = contact.contact;
            }
            return new Contact(shopifyCheckoutContact);
        }

        public final HatchAgentPermissionsRepository.ShopifyCheckoutContact component1() {
            return this.contact;
        }

        public final Contact copy(HatchAgentPermissionsRepository.ShopifyCheckoutContact shopifyCheckoutContact) {
            return new Contact(shopifyCheckoutContact);
        }

        public final HatchAgentPermissionsRepository.ShopifyCheckoutContact getContact() {
            return this.contact;
        }

        public int hashCode() {
            return AnonymousClass006.A0D(this.contact);
        }

        public Contact(HatchAgentPermissionsRepository.ShopifyCheckoutContact shopifyCheckoutContact) {
            this.contact = shopifyCheckoutContact;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Delivery extends C06G implements CheckoutReceiptRow {
        public static final int $stable = HatchAgentPermissionsRepository.ShopifyCheckoutShippingAddress.$stable | HatchAgentPermissionsRepository.ShopifyCheckoutDelivery.$stable;
        public final HatchAgentPermissionsRepository.ShopifyCheckoutShippingAddress address;
        public final HatchAgentPermissionsRepository.ShopifyCheckoutDelivery delivery;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Delivery) {
                    Delivery delivery = (Delivery) obj;
                    if (!C7384Etj.areEqual(this.delivery, delivery.delivery) || !C7384Etj.areEqual(this.address, delivery.address)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Delivery copy$default(Delivery delivery, HatchAgentPermissionsRepository.ShopifyCheckoutDelivery shopifyCheckoutDelivery, HatchAgentPermissionsRepository.ShopifyCheckoutShippingAddress shopifyCheckoutShippingAddress, int i, Object obj) {
            if ((i & 1) != 0) {
                shopifyCheckoutDelivery = delivery.delivery;
            }
            if ((i & 2) != 0) {
                shopifyCheckoutShippingAddress = delivery.address;
            }
            return new Delivery(shopifyCheckoutDelivery, shopifyCheckoutShippingAddress);
        }

        public final HatchAgentPermissionsRepository.ShopifyCheckoutDelivery component1() {
            return this.delivery;
        }

        public final HatchAgentPermissionsRepository.ShopifyCheckoutShippingAddress component2() {
            return this.address;
        }

        public final Delivery copy(HatchAgentPermissionsRepository.ShopifyCheckoutDelivery shopifyCheckoutDelivery, HatchAgentPermissionsRepository.ShopifyCheckoutShippingAddress shopifyCheckoutShippingAddress) {
            return new Delivery(shopifyCheckoutDelivery, shopifyCheckoutShippingAddress);
        }

        public final HatchAgentPermissionsRepository.ShopifyCheckoutShippingAddress getAddress() {
            return this.address;
        }

        public final HatchAgentPermissionsRepository.ShopifyCheckoutDelivery getDelivery() {
            return this.delivery;
        }

        public int hashCode() {
            return (AnonymousClass006.A0D(this.delivery) * 31) + C3cH.A02(this.address);
        }

        public Delivery(HatchAgentPermissionsRepository.ShopifyCheckoutDelivery shopifyCheckoutDelivery, HatchAgentPermissionsRepository.ShopifyCheckoutShippingAddress shopifyCheckoutShippingAddress) {
            this.delivery = shopifyCheckoutDelivery;
            this.address = shopifyCheckoutShippingAddress;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Divider implements CheckoutReceiptRow {
        public static final int $stable = 0;
        public static final Divider INSTANCE = new Divider();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Divider);
        }

        public String toString() {
            return "Divider";
        }

        public int hashCode() {
            return -372156611;
        }
    }

    public final class Item extends C06G implements CheckoutReceiptRow {
        public static final int $stable = HatchAgentPermissionsRepository.ShopifyCheckoutItem.$stable;
        public final HatchAgentPermissionsRepository.ShopifyCheckoutItem item;

        public Item(HatchAgentPermissionsRepository.ShopifyCheckoutItem shopifyCheckoutItem) {
            C7384Etj.A0Y(shopifyCheckoutItem, 0);
            this.item = shopifyCheckoutItem;
        }

        public final Item copy(HatchAgentPermissionsRepository.ShopifyCheckoutItem shopifyCheckoutItem) {
            C7384Etj.A0Y(shopifyCheckoutItem, 0);
            return new Item(shopifyCheckoutItem);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Item) && C7384Etj.areEqual(this.item, ((Item) obj).item));
        }

        public static /* synthetic */ Item copy$default(Item item, HatchAgentPermissionsRepository.ShopifyCheckoutItem shopifyCheckoutItem, int i, Object obj) {
            if ((i & 1) != 0) {
                shopifyCheckoutItem = item.item;
            }
            C7384Etj.A0Y(shopifyCheckoutItem, 0);
            return new Item(shopifyCheckoutItem);
        }

        public final HatchAgentPermissionsRepository.ShopifyCheckoutItem component1() {
            return this.item;
        }

        public final HatchAgentPermissionsRepository.ShopifyCheckoutItem getItem() {
            return this.item;
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ItemsSummary extends C06G implements CheckoutReceiptRow {
        public static final int $stable = 8;
        public final List<HatchAgentPermissionsRepository.ShopifyCheckoutItem> items;
        public final String names;

        public ItemsSummary(List<HatchAgentPermissionsRepository.ShopifyCheckoutItem> list, String str) {
            C7384Etj.A0Y(list, 0);
            this.items = list;
            this.names = str;
        }

        public final ItemsSummary copy(List<HatchAgentPermissionsRepository.ShopifyCheckoutItem> list, String str) {
            C7384Etj.A0Y(list, 0);
            return new ItemsSummary(list, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ItemsSummary) {
                    ItemsSummary itemsSummary = (ItemsSummary) obj;
                    if (!C7384Etj.areEqual(this.items, itemsSummary.items) || !C7384Etj.areEqual(this.names, itemsSummary.names)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ItemsSummary copy$default(ItemsSummary itemsSummary, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = itemsSummary.items;
            }
            if ((i & 2) != 0) {
                str = itemsSummary.names;
            }
            C7384Etj.A0Y(list, 0);
            return new ItemsSummary(list, str);
        }

        public final List<HatchAgentPermissionsRepository.ShopifyCheckoutItem> component1() {
            return this.items;
        }

        public final String component2() {
            return this.names;
        }

        public final List<HatchAgentPermissionsRepository.ShopifyCheckoutItem> getItems() {
            return this.items;
        }

        public final String getNames() {
            return this.names;
        }

        public int hashCode() {
            return AnonymousClass005.A0E(this.items) + AnonymousClass006.A0G(this.names);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class LodgingPrice extends C06G implements CheckoutReceiptRow {
        public static final int $stable = 8;
        public final List<LodgingPriceLine> lines;

        public LodgingPrice(List<LodgingPriceLine> list) {
            C7384Etj.A0Y(list, 0);
            this.lines = list;
        }

        public final LodgingPrice copy(List<LodgingPriceLine> list) {
            C7384Etj.A0Y(list, 0);
            return new LodgingPrice(list);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof LodgingPrice) && C7384Etj.areEqual(this.lines, ((LodgingPrice) obj).lines));
        }

        public static /* synthetic */ LodgingPrice copy$default(LodgingPrice lodgingPrice, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = lodgingPrice.lines;
            }
            C7384Etj.A0Y(list, 0);
            return new LodgingPrice(list);
        }

        public final List<LodgingPriceLine> component1() {
            return this.lines;
        }

        public final List<LodgingPriceLine> getLines() {
            return this.lines;
        }

        public int hashCode() {
            return this.lines.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Payment extends C06G implements CheckoutReceiptRow {
        public static final int $stable = 0;
        public final CheckoutPaymentPresentation data;

        public Payment(CheckoutPaymentPresentation checkoutPaymentPresentation) {
            C7384Etj.A0Y(checkoutPaymentPresentation, 0);
            this.data = checkoutPaymentPresentation;
        }

        public final Payment copy(CheckoutPaymentPresentation checkoutPaymentPresentation) {
            C7384Etj.A0Y(checkoutPaymentPresentation, 0);
            return new Payment(checkoutPaymentPresentation);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Payment) && C7384Etj.areEqual(this.data, ((Payment) obj).data));
        }

        public static /* synthetic */ Payment copy$default(Payment payment, CheckoutPaymentPresentation checkoutPaymentPresentation, int i, Object obj) {
            if ((i & 1) != 0) {
                checkoutPaymentPresentation = payment.data;
            }
            C7384Etj.A0Y(checkoutPaymentPresentation, 0);
            return new Payment(checkoutPaymentPresentation);
        }

        public final CheckoutPaymentPresentation component1() {
            return this.data;
        }

        public final CheckoutPaymentPresentation getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Text extends C06G implements CheckoutReceiptRow {
        public static final int $stable = 0;
        public final String subtitle;
        public final String title;

        public Text(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            this.title = str;
            this.subtitle = str2;
        }

        public final Text copy(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            return new Text(str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Text) {
                    Text text = (Text) obj;
                    if (!C7384Etj.areEqual(this.title, text.title) || !C7384Etj.areEqual(this.subtitle, text.subtitle)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Text copy$default(Text text, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.title;
            }
            if ((i & 2) != 0) {
                str2 = text.subtitle;
            }
            C7384Etj.A0Y(str, 0);
            return new Text(str, str2);
        }

        public final String component1() {
            return this.title;
        }

        public final String component2() {
            return this.subtitle;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return AnonymousClass001.A0G(this.title) + AnonymousClass006.A0G(this.subtitle);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Text(String str, String str2, int i, C06H c06h) {
            this(str, AnonymousClass006.A0s(i, str2));
        }
    }
}
