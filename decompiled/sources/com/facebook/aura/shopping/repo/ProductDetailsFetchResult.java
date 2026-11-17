package com.facebook.aura.shopping.repo;

import X.C06G;
import X.C7384Etj;
import com.facebook.aura.shopping.model.ProductDetailsPresentation;

/* loaded from: classes4.dex */
public interface ProductDetailsFetchResult {

    public final class Failed implements ProductDetailsFetchResult {
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return -32134259;
        }
    }

    public final class StaleQuote extends C06G implements ProductDetailsFetchResult {
        public final ProductDetailsPresentation presentation;

        public StaleQuote(ProductDetailsPresentation productDetailsPresentation) {
            C7384Etj.A0Y(productDetailsPresentation, 0);
            this.presentation = productDetailsPresentation;
        }

        public final StaleQuote copy(ProductDetailsPresentation productDetailsPresentation) {
            C7384Etj.A0Y(productDetailsPresentation, 0);
            return new StaleQuote(productDetailsPresentation);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof StaleQuote) && C7384Etj.areEqual(this.presentation, ((StaleQuote) obj).presentation));
        }

        public static /* synthetic */ StaleQuote copy$default(StaleQuote staleQuote, ProductDetailsPresentation productDetailsPresentation, int i, Object obj) {
            if ((i & 1) != 0) {
                productDetailsPresentation = staleQuote.presentation;
            }
            C7384Etj.A0Y(productDetailsPresentation, 0);
            return new StaleQuote(productDetailsPresentation);
        }

        public final ProductDetailsPresentation component1() {
            return this.presentation;
        }

        public final ProductDetailsPresentation getPresentation() {
            return this.presentation;
        }

        public int hashCode() {
            return this.presentation.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Success extends C06G implements ProductDetailsFetchResult {
        public final ProductDetailsPresentation presentation;

        public Success(ProductDetailsPresentation productDetailsPresentation) {
            C7384Etj.A0Y(productDetailsPresentation, 0);
            this.presentation = productDetailsPresentation;
        }

        public final Success copy(ProductDetailsPresentation productDetailsPresentation) {
            C7384Etj.A0Y(productDetailsPresentation, 0);
            return new Success(productDetailsPresentation);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Success) && C7384Etj.areEqual(this.presentation, ((Success) obj).presentation));
        }

        public static /* synthetic */ Success copy$default(Success success, ProductDetailsPresentation productDetailsPresentation, int i, Object obj) {
            if ((i & 1) != 0) {
                productDetailsPresentation = success.presentation;
            }
            C7384Etj.A0Y(productDetailsPresentation, 0);
            return new Success(productDetailsPresentation);
        }

        public final ProductDetailsPresentation component1() {
            return this.presentation;
        }

        public final ProductDetailsPresentation getPresentation() {
            return this.presentation;
        }

        public int hashCode() {
            return this.presentation.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Unavailable implements ProductDetailsFetchResult {
        public static final Unavailable INSTANCE = new Unavailable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public String toString() {
            return "Unavailable";
        }

        public int hashCode() {
            return 221303552;
        }
    }
}
