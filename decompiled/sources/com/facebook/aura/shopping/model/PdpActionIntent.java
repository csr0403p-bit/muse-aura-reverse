package com.facebook.aura.shopping.model;

import X.C06G;
import X.C7384Etj;
import X.C9hr;
import kotlinx.serialization.Serializable;

@Serializable(with = PdpActionIntentSerializer.class)
/* loaded from: classes4.dex */
public interface PdpActionIntent {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class AddToCart implements PdpActionIntent {
        public static final int $stable = 0;
        public static final AddToCart INSTANCE = new AddToCart();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AddToCart);
        }

        public String toString() {
            return "AddToCart";
        }

        public int hashCode() {
            return 2045868193;
        }
    }

    public final class BuyNow implements PdpActionIntent {
        public static final int $stable = 0;
        public static final BuyNow INSTANCE = new BuyNow();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof BuyNow);
        }

        public String toString() {
            return "BuyNow";
        }

        public int hashCode() {
            return -778913749;
        }
    }

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final C9hr<PdpActionIntent> serializer() {
            return PdpActionIntentSerializer.INSTANCE;
        }
    }

    public final class Deeplink extends C06G implements PdpActionIntent {
        public static final int $stable = 0;
        public final String uri;

        public Deeplink(String str) {
            C7384Etj.A0Y(str, 0);
            this.uri = str;
        }

        public final Deeplink copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Deeplink(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Deeplink) && C7384Etj.areEqual(this.uri, ((Deeplink) obj).uri));
        }

        public static /* synthetic */ Deeplink copy$default(Deeplink deeplink, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deeplink.uri;
            }
            C7384Etj.A0Y(str, 0);
            return new Deeplink(str);
        }

        public final String component1() {
            return this.uri;
        }

        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.uri.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class OpenUrl extends C06G implements PdpActionIntent {
        public static final int $stable = 0;
        public final String url;

        public OpenUrl(String str) {
            C7384Etj.A0Y(str, 0);
            this.url = str;
        }

        public final OpenUrl copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new OpenUrl(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof OpenUrl) && C7384Etj.areEqual(this.url, ((OpenUrl) obj).url));
        }

        public static /* synthetic */ OpenUrl copy$default(OpenUrl openUrl, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = openUrl.url;
            }
            C7384Etj.A0Y(str, 0);
            return new OpenUrl(str);
        }

        public final String component1() {
            return this.url;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
