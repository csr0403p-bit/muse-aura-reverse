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
public interface ShoppingSaveTarget {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Serializable
    public final class Citation extends C06G implements ShoppingSaveTarget {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final String citationId;
        public final String messageId;

        public final class Companion {
            public final C9hr<Citation> serializer() {
                return ShoppingSaveTarget$Citation$$serializer.INSTANCE;
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
                C9iI.A00(ShoppingSaveTarget$Citation$$serializer.descriptor, i, 3);
                throw F60.createAndThrow();
            }
            this.messageId = str;
            this.citationId = str2;
        }
    }

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final C9hr<ShoppingSaveTarget> serializer() {
            return new C9hq("com.facebook.aura.shopping.model.ShoppingSaveTarget", C3cG.A0x(ShoppingSaveTarget.class), new Annotation[0], new C9uG[]{C3cG.A0x(Citation.class), C3cG.A0x(WidgetCitation.class), C3cG.A0x(WidgetProduct.class)}, new C9hr[]{ShoppingSaveTarget$Citation$$serializer.INSTANCE, ShoppingSaveTarget$WidgetCitation$$serializer.INSTANCE, ShoppingSaveTarget$WidgetProduct$$serializer.INSTANCE});
        }
    }

    @Serializable
    public final class WidgetCitation extends C06G implements ShoppingSaveTarget {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final String citationId;
        public final String widgetId;

        public final class Companion {
            public final C9hr<WidgetCitation> serializer() {
                return ShoppingSaveTarget$WidgetCitation$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(WidgetCitation widgetCitation, C9j5 c9j5, C9iZ c9iZ) {
            c9j5.AAV(widgetCitation.widgetId, c9iZ, 0);
            c9j5.AAV(widgetCitation.citationId, c9iZ, 1);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof WidgetCitation) {
                    WidgetCitation widgetCitation = (WidgetCitation) obj;
                    if (!C7384Etj.areEqual(this.widgetId, widgetCitation.widgetId) || !C7384Etj.areEqual(this.citationId, widgetCitation.citationId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ WidgetCitation copy$default(WidgetCitation widgetCitation, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = widgetCitation.widgetId;
            }
            if ((i & 2) != 0) {
                str2 = widgetCitation.citationId;
            }
            AnonymousClass003.A0u(str, str2);
            return new WidgetCitation(str, str2);
        }

        public final String component1() {
            return this.widgetId;
        }

        public final String component2() {
            return this.citationId;
        }

        public final String getCitationId() {
            return this.citationId;
        }

        public final String getWidgetId() {
            return this.widgetId;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.citationId, AnonymousClass001.A0G(this.widgetId));
        }

        public WidgetCitation(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.widgetId = str;
            this.citationId = str2;
        }

        public final WidgetCitation copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new WidgetCitation(str, str2);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ WidgetCitation(int i, String str, String str2, C2hx c2hx) {
            if (3 != (i & 3)) {
                C9iI.A00(ShoppingSaveTarget$WidgetCitation$$serializer.descriptor, i, 3);
                throw F60.createAndThrow();
            }
            this.widgetId = str;
            this.citationId = str2;
        }
    }

    @Serializable
    public final class WidgetProduct extends C06G implements ShoppingSaveTarget {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final String productId;
        public final String widgetId;

        public final class Companion {
            public final C9hr<WidgetProduct> serializer() {
                return ShoppingSaveTarget$WidgetProduct$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(WidgetProduct widgetProduct, C9j5 c9j5, C9iZ c9iZ) {
            c9j5.AAV(widgetProduct.widgetId, c9iZ, 0);
            c9j5.AAV(widgetProduct.productId, c9iZ, 1);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof WidgetProduct) {
                    WidgetProduct widgetProduct = (WidgetProduct) obj;
                    if (!C7384Etj.areEqual(this.widgetId, widgetProduct.widgetId) || !C7384Etj.areEqual(this.productId, widgetProduct.productId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ WidgetProduct copy$default(WidgetProduct widgetProduct, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = widgetProduct.widgetId;
            }
            if ((i & 2) != 0) {
                str2 = widgetProduct.productId;
            }
            AnonymousClass003.A0u(str, str2);
            return new WidgetProduct(str, str2);
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

        public WidgetProduct(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.widgetId = str;
            this.productId = str2;
        }

        public final WidgetProduct copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new WidgetProduct(str, str2);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ WidgetProduct(int i, String str, String str2, C2hx c2hx) {
            if (3 != (i & 3)) {
                C9iI.A00(ShoppingSaveTarget$WidgetProduct$$serializer.descriptor, i, 3);
                throw F60.createAndThrow();
            }
            this.widgetId = str;
            this.productId = str2;
        }
    }
}
