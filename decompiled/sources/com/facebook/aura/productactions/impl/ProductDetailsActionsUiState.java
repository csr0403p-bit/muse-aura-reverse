package com.facebook.aura.productactions.impl;

import X.AHD;
import X.AHI;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import com.facebook.aura.conversation.viewmodel.ReplyContext;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ProductDetailsActionsUiState {
    public static final int $stable = ReplyContext.$stable;
    public final boolean actionsEnabled;
    public final Boolean isSaved;
    public final AHD<String> mediaActionIds;
    public final Map<String, String> mediaAnalyticsMetadata;
    public final String productId;
    public final ReplyContext replyContext;
    public final String shareUrl;

    public ProductDetailsActionsUiState(ReplyContext replyContext, String str, boolean z, String str2, Map<String, String> map, AHD<String> ahd, Boolean bool) {
        C7384Etj.A0Y(str2, 3);
        AnonymousClass003.A0y(map, ahd);
        this.replyContext = replyContext;
        this.shareUrl = str;
        this.actionsEnabled = z;
        this.productId = str2;
        this.mediaAnalyticsMetadata = map;
        this.mediaActionIds = ahd;
        this.isSaved = bool;
    }

    public final ProductDetailsActionsUiState copy(ReplyContext replyContext, String str, boolean z, String str2, Map<String, String> map, AHD<String> ahd, Boolean bool) {
        C7384Etj.A0Y(str2, 3);
        AnonymousClass003.A0y(map, ahd);
        return new ProductDetailsActionsUiState(replyContext, str, z, str2, map, ahd, bool);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductDetailsActionsUiState) {
                ProductDetailsActionsUiState productDetailsActionsUiState = (ProductDetailsActionsUiState) obj;
                if (!C7384Etj.areEqual(this.replyContext, productDetailsActionsUiState.replyContext) || !C7384Etj.areEqual(this.shareUrl, productDetailsActionsUiState.shareUrl) || this.actionsEnabled != productDetailsActionsUiState.actionsEnabled || !C7384Etj.areEqual(this.productId, productDetailsActionsUiState.productId) || !C7384Etj.areEqual(this.mediaAnalyticsMetadata, productDetailsActionsUiState.mediaAnalyticsMetadata) || !C7384Etj.areEqual(this.mediaActionIds, productDetailsActionsUiState.mediaActionIds) || !C7384Etj.areEqual(this.isSaved, productDetailsActionsUiState.isSaved)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductDetailsActionsUiState copy$default(ProductDetailsActionsUiState productDetailsActionsUiState, ReplyContext replyContext, String str, boolean z, String str2, Map map, AHD ahd, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            replyContext = productDetailsActionsUiState.replyContext;
        }
        if ((i & 2) != 0) {
            str = productDetailsActionsUiState.shareUrl;
        }
        if ((i & 4) != 0) {
            z = productDetailsActionsUiState.actionsEnabled;
        }
        if ((i & 8) != 0) {
            str2 = productDetailsActionsUiState.productId;
        }
        if ((i & 16) != 0) {
            map = productDetailsActionsUiState.mediaAnalyticsMetadata;
        }
        if ((i & 32) != 0) {
            ahd = productDetailsActionsUiState.mediaActionIds;
        }
        if ((i & 64) != 0) {
            bool = productDetailsActionsUiState.isSaved;
        }
        return productDetailsActionsUiState.copy(replyContext, str, z, str2, map, ahd, bool);
    }

    public final ReplyContext component1() {
        return this.replyContext;
    }

    public final String component2() {
        return this.shareUrl;
    }

    public final boolean component3() {
        return this.actionsEnabled;
    }

    public final String component4() {
        return this.productId;
    }

    public final Map<String, String> component5() {
        return this.mediaAnalyticsMetadata;
    }

    public final AHD<String> component6() {
        return this.mediaActionIds;
    }

    public final Boolean component7() {
        return this.isSaved;
    }

    public final boolean getActionsEnabled() {
        return this.actionsEnabled;
    }

    public final AHD<String> getMediaActionIds() {
        return this.mediaActionIds;
    }

    public final Map<String, String> getMediaAnalyticsMetadata() {
        return this.mediaAnalyticsMetadata;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final ReplyContext getReplyContext() {
        return this.replyContext;
    }

    public final String getShareUrl() {
        return this.shareUrl;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.mediaActionIds, AnonymousClass005.A0F(this.mediaAnalyticsMetadata, AnonymousClass005.A0I(this.productId, C0KA.A01(((AnonymousClass006.A0D(this.replyContext) * 31) + AnonymousClass006.A0G(this.shareUrl)) * 31, this.actionsEnabled)))) + C3cH.A02(this.isSaved);
    }

    public final Boolean isSaved() {
        return this.isSaved;
    }

    public String toString() {
        ReplyContext replyContext = this.replyContext;
        String str = this.shareUrl;
        boolean z = this.actionsEnabled;
        String str2 = this.productId;
        Map<String, String> map = this.mediaAnalyticsMetadata;
        AHD<String> ahd = this.mediaActionIds;
        Boolean bool = this.isSaved;
        StringBuilder sbA0f = C3cG.A0f(replyContext, "ProductDetailsActionsUiState(replyContext=");
        sbA0f.append(", shareUrl=");
        sbA0f.append(str);
        sbA0f.append(", actionsEnabled=");
        sbA0f.append(z);
        sbA0f.append(", productId=");
        sbA0f.append(str2);
        sbA0f.append(", mediaAnalyticsMetadata=");
        sbA0f.append(map);
        sbA0f.append(", mediaActionIds=");
        sbA0f.append(ahd);
        return C3cJ.A0L(bool, ", isSaved=", sbA0f);
    }

    public /* synthetic */ ProductDetailsActionsUiState(ReplyContext replyContext, String str, boolean z, String str2, Map map, AHD ahd, Boolean bool, int i, C06H c06h) {
        this(replyContext, str, z, str2, map, (i & 32) != 0 ? AHI.A01 : ahd, (i & 64) != 0 ? null : bool);
    }
}
