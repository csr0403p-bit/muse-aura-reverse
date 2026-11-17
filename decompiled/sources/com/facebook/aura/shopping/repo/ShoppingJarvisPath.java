package com.facebook.aura.shopping.repo;

import X.C06G;
import X.C7384Etj;
import X.FGI;
import android.net.Uri;
import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes4.dex */
public interface ShoppingJarvisPath extends JarvisPath.Extension {

    public final class SavedDefault implements ShoppingJarvisPath {
        public static final SavedDefault INSTANCE = new SavedDefault();
        public static final String value = "api/saved/default";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SavedDefault);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SavedDefault";
        }

        public int hashCode() {
            return 2065315568;
        }
    }

    public final class SavedItem extends C06G implements ShoppingJarvisPath {
        public final String itemId;

        public SavedItem(String str) {
            C7384Etj.A0Y(str, 0);
            this.itemId = str;
        }

        public final SavedItem copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new SavedItem(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SavedItem) && C7384Etj.areEqual(this.itemId, ((SavedItem) obj).itemId));
        }

        public static /* synthetic */ SavedItem copy$default(SavedItem savedItem, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = savedItem.itemId;
            }
            C7384Etj.A0Y(str, 0);
            return new SavedItem(str);
        }

        public final String component1() {
            return this.itemId;
        }

        public final String getItemId() {
            return this.itemId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0M("api/saved/items/", Uri.encode(this.itemId));
        }

        public int hashCode() {
            return this.itemId.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Shopping implements ShoppingJarvisPath {
        public static final Shopping INSTANCE = new Shopping();
        public static final String value = "api/shopping";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Shopping);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "Shopping";
        }

        public int hashCode() {
            return -571192930;
        }
    }

    public final class ShoppingCart implements ShoppingJarvisPath {
        public static final ShoppingCart INSTANCE = new ShoppingCart();
        public static final String value = "api/shopping/cart";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ShoppingCart);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ShoppingCart";
        }

        public int hashCode() {
            return -780518946;
        }
    }

    public final class ShoppingEvents implements ShoppingJarvisPath {
        public static final ShoppingEvents INSTANCE = new ShoppingEvents();
        public static final String value = "api/shopping/events";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ShoppingEvents);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ShoppingEvents";
        }

        public int hashCode() {
            return 1616832599;
        }
    }
}
