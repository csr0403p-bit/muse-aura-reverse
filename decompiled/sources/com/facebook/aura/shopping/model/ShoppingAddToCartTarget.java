package com.facebook.aura.shopping.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C9hq;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9uG;
import X.F60;
import java.lang.annotation.Annotation;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public interface ShoppingAddToCartTarget {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Serializable
    public final class Citation extends C06G implements ShoppingAddToCartTarget {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final String citationId;
        public final String messageId;

        public final class Companion {
            public final C9hr<Citation> serializer() {
                return ShoppingAddToCartTarget$Citation$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(Citation citation, C9j5 c9j5, C9iZ c9iZ) {
            c9j5.AAV(citation.messageId, c9iZ, 0);
            c9j5.AAV(citation.citationId, c9iZ, 1);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Citation) {
                    Citation citation = (Citation) obj;
                    if (!C7384Etj.areEqual(this.messageId, citation.messageId) || !C7384Etj.areEqual(this.citationId, citation.citationId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Citation copy$default(Citation citation, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = citation.messageId;
            }
            if ((i & 2) != 0) {
                str2 = citation.citationId;
            }
            AnonymousClass003.A0u(str, str2);
            return new Citation(str, str2);
        }

        public final String component1() {
            return this.messageId;
        }

        public final String component2() {
            return this.citationId;
        }

        public final String getCitationId() {
            return this.citationId;
        }

        public final String getMessageId() {
            return this.messageId;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.citationId, AnonymousClass001.A0G(this.messageId));
        }

        public Citation(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.messageId = str;
            this.citationId = str2;
        }

        public final Citation copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new Citation(str, str2);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Citation(int i, String str, String str2, C2hx c2hx) {
            if (3 != (i & 3)) {
                C9iI.A00(ShoppingAddToCartTarget$Citation$$serializer.descriptor, i, 3);
                throw F60.createAndThrow();
            }
            this.messageId = str;
            this.citationId = str2;
        }
    }

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final C9hr<ShoppingAddToCartTarget> serializer() {
            return new C9hq("com.facebook.aura.shopping.model.ShoppingAddToCartTarget", C3cG.A0x(ShoppingAddToCartTarget.class), new Annotation[0], new C9uG[]{C3cG.A0x(Citation.class), C3cG.A0x(Widget.class)}, new C9hr[]{ShoppingAddToCartTarget$Citation$$serializer.INSTANCE, ShoppingAddToCartTarget$Widget$$serializer.INSTANCE});
        }
    }

    @Serializable
    public final class Widget extends C06G implements ShoppingAddToCartTarget {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final String productId;
        public final String widgetId;

        public final class Companion {
            public final C9hr<Widget> serializer() {
                return ShoppingAddToCartTarget$Widget$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(Widget widget, C9j5 c9j5, C9iZ c9iZ) {
            c9j5.AAV(widget.widgetId, c9iZ, 0);
            c9j5.AAV(widget.productId, c9iZ, 1);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Widget) {
                    Widget widget = (Widget) obj;
                    if (!C7384Etj.areEqual(this.widgetId, widget.widgetId) || !C7384Etj.areEqual(this.productId, widget.productId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Widget copy$default(Widget widget, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = widget.widgetId;
            }
            if ((i & 2) != 0) {
                str2 = widget.productId;
            }
            AnonymousClass003.A0u(str, str2);
            return new Widget(str, str2);
        }

        public final String component1() {
            return this.widgetId;
        }

        public final String component2() {
            return this.productId;
        }

        public final String getProductId() {
            return this.productId;
        }

        public final String getWidgetId() {
            return this.widgetId;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.productId, AnonymousClass001.A0G(this.widgetId));
        }

        public Widget(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.widgetId = str;
            this.productId = str2;
        }

        public final Widget copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new Widget(str, str2);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Widget(int i, String str, String str2, C2hx c2hx) {
            if (3 != (i & 3)) {
                C9iI.A00(ShoppingAddToCartTarget$Widget$$serializer.descriptor, i, 3);
                throw F60.createAndThrow();
            }
            this.widgetId = str;
            this.productId = str2;
        }
    }
}
