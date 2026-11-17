package com.facebook.aura.productactions.impl;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.C8j5;
import com.facebook.aura.shopping.model.ShoppingProductSource;
import com.facebook.aura.shopping.model.ShoppingResultProduct;

/* loaded from: classes4.dex */
public final class ConversationItemActionContext {
    public static final int $stable = ShoppingProductSource.$stable | ShoppingResultProduct.$stable;
    public final String hostMessageId;
    public final boolean isChip;
    public final boolean isGrid;
    public final Integer position;
    public final ShoppingResultProduct product;
    public final String sessionId;
    public final ShoppingProductSource source;

    public ConversationItemActionContext(ShoppingResultProduct shoppingResultProduct, ShoppingProductSource shoppingProductSource, String str, String str2, boolean z, boolean z2, Integer num) {
        C7384Etj.A0Y(shoppingResultProduct, 0);
        this.product = shoppingResultProduct;
        this.source = shoppingProductSource;
        this.sessionId = str;
        this.hostMessageId = str2;
        this.isGrid = z;
        this.isChip = z2;
        this.position = num;
    }

    public final ConversationItemActionContext copy(ShoppingResultProduct shoppingResultProduct, ShoppingProductSource shoppingProductSource, String str, String str2, boolean z, boolean z2, Integer num) {
        C7384Etj.A0Y(shoppingResultProduct, 0);
        return new ConversationItemActionContext(shoppingResultProduct, shoppingProductSource, str, str2, z, z2, num);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConversationItemActionContext) {
                ConversationItemActionContext conversationItemActionContext = (ConversationItemActionContext) obj;
                if (!C7384Etj.areEqual(this.product, conversationItemActionContext.product) || !C7384Etj.areEqual(this.source, conversationItemActionContext.source) || !C7384Etj.areEqual(this.sessionId, conversationItemActionContext.sessionId) || !C7384Etj.areEqual(this.hostMessageId, conversationItemActionContext.hostMessageId) || this.isGrid != conversationItemActionContext.isGrid || this.isChip != conversationItemActionContext.isChip || !C7384Etj.areEqual(this.position, conversationItemActionContext.position)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConversationItemActionContext copy$default(ConversationItemActionContext conversationItemActionContext, ShoppingResultProduct shoppingResultProduct, ShoppingProductSource shoppingProductSource, String str, String str2, boolean z, boolean z2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            shoppingResultProduct = conversationItemActionContext.product;
        }
        if ((i & 2) != 0) {
            shoppingProductSource = conversationItemActionContext.source;
        }
        if ((i & 4) != 0) {
            str = conversationItemActionContext.sessionId;
        }
        if ((i & 8) != 0) {
            str2 = conversationItemActionContext.hostMessageId;
        }
        if ((i & 16) != 0) {
            z = conversationItemActionContext.isGrid;
        }
        if ((i & 32) != 0) {
            z2 = conversationItemActionContext.isChip;
        }
        if ((i & 64) != 0) {
            num = conversationItemActionContext.position;
        }
        return conversationItemActionContext.copy(shoppingResultProduct, shoppingProductSource, str, str2, z, z2, num);
    }

    public final ShoppingResultProduct component1() {
        return this.product;
    }

    public final ShoppingProductSource component2() {
        return this.source;
    }

    public final String component3() {
        return this.sessionId;
    }

    public final String component4() {
        return this.hostMessageId;
    }

    public final boolean component5() {
        return this.isGrid;
    }

    public final boolean component6() {
        return this.isChip;
    }

    public final Integer component7() {
        return this.position;
    }

    public final String getHostMessageId() {
        return this.hostMessageId;
    }

    public final Integer getPosition() {
        return this.position;
    }

    public final ShoppingResultProduct getProduct() {
        return this.product;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final ShoppingProductSource getSource() {
        return this.source;
    }

    public int hashCode() {
        return C0KA.A01(C0KA.A01((((((AnonymousClass005.A0E(this.product) + AnonymousClass006.A0D(this.source)) * 31) + AnonymousClass006.A0G(this.sessionId)) * 31) + AnonymousClass006.A0G(this.hostMessageId)) * 31, this.isGrid), this.isChip) + C3cH.A02(this.position);
    }

    public final boolean isChip() {
        return this.isChip;
    }

    public final boolean isGrid() {
        return this.isGrid;
    }

    public String toString() {
        ShoppingResultProduct shoppingResultProduct = this.product;
        ShoppingProductSource shoppingProductSource = this.source;
        String str = this.sessionId;
        String str2 = this.hostMessageId;
        boolean z = this.isGrid;
        boolean z2 = this.isChip;
        Integer num = this.position;
        StringBuilder sbA0f = C3cG.A0f(shoppingResultProduct, "ConversationItemActionContext(product=");
        C8j5.A0m(shoppingProductSource, ", source=", str, str2, sbA0f);
        sbA0f.append(", isGrid=");
        sbA0f.append(z);
        sbA0f.append(", isChip=");
        sbA0f.append(z2);
        return C3cJ.A0L(num, ", position=", sbA0f);
    }

    public /* synthetic */ ConversationItemActionContext(ShoppingResultProduct shoppingResultProduct, ShoppingProductSource shoppingProductSource, String str, String str2, boolean z, boolean z2, Integer num, int i, C06H c06h) {
        this(shoppingResultProduct, shoppingProductSource, str, str2, AnonymousClass005.A1Q(i, z), (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : num);
    }
}
