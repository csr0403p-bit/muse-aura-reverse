package com.facebook.aura.vds.compose.toast;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.vds.compose.button.AuraButtonStyle;

/* loaded from: classes.dex */
public interface AuraToastOption {

    public final class Button extends C06G implements AuraToastOption {
        public static final int $stable = 0;
        public final AuraButtonStyle buttonStyle;
        public final String buttonText;
        public final boolean enabled;
        public final boolean loading;

        public Button(String str, AuraButtonStyle auraButtonStyle, boolean z, boolean z2) {
            C7384Etj.A0Y(str, 0);
            this.buttonText = str;
            this.buttonStyle = auraButtonStyle;
            this.loading = z;
            this.enabled = z2;
        }

        public final Button copy(String str, AuraButtonStyle auraButtonStyle, boolean z, boolean z2) {
            C7384Etj.A0Y(str, 0);
            return new Button(str, auraButtonStyle, z, z2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Button) {
                    Button button = (Button) obj;
                    if (!C7384Etj.areEqual(this.buttonText, button.buttonText) || this.buttonStyle != button.buttonStyle || this.loading != button.loading || this.enabled != button.enabled) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Button copy$default(Button button, String str, AuraButtonStyle auraButtonStyle, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = button.buttonText;
            }
            if ((i & 2) != 0) {
                auraButtonStyle = button.buttonStyle;
            }
            if ((i & 4) != 0) {
                z = button.loading;
            }
            if ((i & 8) != 0) {
                z2 = button.enabled;
            }
            C7384Etj.A0Y(str, 0);
            return new Button(str, auraButtonStyle, z, z2);
        }

        public final String component1() {
            return this.buttonText;
        }

        public final AuraButtonStyle component2() {
            return this.buttonStyle;
        }

        public final boolean component3() {
            return this.loading;
        }

        public final boolean component4() {
            return this.enabled;
        }

        public final AuraButtonStyle getButtonStyle() {
            return this.buttonStyle;
        }

        public final String getButtonText() {
            return this.buttonText;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final boolean getLoading() {
            return this.loading;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01((AnonymousClass001.A0G(this.buttonText) + AnonymousClass006.A0D(this.buttonStyle)) * 31, this.loading), this.enabled);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Button(String str, AuraButtonStyle auraButtonStyle, boolean z, boolean z2, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? null : auraButtonStyle, AnonymousClass005.A1O(i, z), (i & 8) != 0 ? true : z2);
        }
    }

    public final class ChevronNavigation extends C06G implements AuraToastOption {
        public static final int $stable = 0;
        public final String contentDescription;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ChevronNavigation) && C7384Etj.areEqual(this.contentDescription, ((ChevronNavigation) obj).contentDescription));
        }

        public static /* synthetic */ ChevronNavigation copy$default(ChevronNavigation chevronNavigation, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = chevronNavigation.contentDescription;
            }
            return new ChevronNavigation(str);
        }

        public final String component1() {
            return this.contentDescription;
        }

        public final ChevronNavigation copy(String str) {
            return new ChevronNavigation(str);
        }

        public final String getContentDescription() {
            return this.contentDescription;
        }

        public int hashCode() {
            return AnonymousClass006.A0G(this.contentDescription);
        }

        public /* synthetic */ ChevronNavigation(String str, int i, C06H c06h) {
            this(AnonymousClass006.A0r(i, str));
        }

        public String toString() {
            return super.toString();
        }

        public ChevronNavigation(String str) {
            this.contentDescription = str;
        }

        public ChevronNavigation() {
            this(null);
        }
    }

    public final class Close extends C06G implements AuraToastOption {
        public static final int $stable = 0;
        public final String contentDescription;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Close) && C7384Etj.areEqual(this.contentDescription, ((Close) obj).contentDescription));
        }

        public static /* synthetic */ Close copy$default(Close close, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = close.contentDescription;
            }
            return new Close(str);
        }

        public final String component1() {
            return this.contentDescription;
        }

        public final Close copy(String str) {
            return new Close(str);
        }

        public final String getContentDescription() {
            return this.contentDescription;
        }

        public int hashCode() {
            return AnonymousClass006.A0G(this.contentDescription);
        }

        public /* synthetic */ Close(String str, int i, C06H c06h) {
            this(AnonymousClass006.A0r(i, str));
        }

        public String toString() {
            return super.toString();
        }

        public Close(String str) {
            this.contentDescription = str;
        }

        public Close() {
            this(null);
        }
    }

    public final class None implements AuraToastOption {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public String toString() {
            return "None";
        }

        public int hashCode() {
            return 1962794121;
        }
    }
}
