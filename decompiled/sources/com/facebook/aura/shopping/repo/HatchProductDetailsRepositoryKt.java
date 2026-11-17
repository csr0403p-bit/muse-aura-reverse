package com.facebook.aura.shopping.repo;

import X.C7BY;
import X.C8j5;
import com.facebook.aura.json.NetworkException;

/* loaded from: classes4.dex */
public abstract class HatchProductDetailsRepositoryKt {
    public static final int CATALOG_DETAILS_CACHE_SIZE = 64;
    public static final long CATALOG_DETAILS_TIMEOUT_SECONDS = 65;
    public static final String LISTING_NOT_FOUND = "shopping_listing_not_found";
    public static final int MAX_SHOPPING_EVENT_REF_BYTES = 160;
    public static final long PRODUCT_DETAILS_FRESH_CACHE_TTL_MS = 300000;
    public static final long PRODUCT_DETAILS_MAX_CACHE_TTL_MS = 3600000;
    public static final long SHOPPING_CART_READ_TIMEOUT_SECONDS = 100;
    public static final long STALE_QUOTE_RETRY_DELAY_MS = 3000;
    public static final String STEFI_PRODUCT_DETAILS_FAILED = "stefi_product_details_failed";
    public static final String TAG = "HatchProductDetailsRepository";

    public static final boolean isProductGone(NetworkException networkException) {
        String message;
        String str = networkException.errorCode;
        return LISTING_NOT_FOUND.equals(str) || (STEFI_PRODUCT_DETAILS_FAILED.equals(str) && (message = networkException.getMessage()) != null && C7BY.A0q(message, "HTTP 404", false));
    }

    public static final double nowEpochSeconds() {
        return C8j5.A00();
    }
}
