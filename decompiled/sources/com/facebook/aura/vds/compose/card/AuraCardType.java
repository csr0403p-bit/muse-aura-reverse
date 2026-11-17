package com.facebook.aura.vds.compose.card;

import X.AVy;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.B6A;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.vds.compose.button.AuraButtonStyle;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;

/* loaded from: classes.dex */
public abstract class AuraCardType {
    public static final int $stable = 8;

    public final class Button extends AuraCardType {
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

    public final class Checkbox extends AuraCardType {
        public static final int $stable = 0;
        public final B6A checkedTint;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Checkbox) && C7384Etj.areEqual(this.checkedTint, ((Checkbox) obj).checkedTint));
        }

        /* renamed from: copy-Y2TPw74$default, reason: not valid java name */
        public static /* synthetic */ Checkbox m2501copyY2TPw74$default(Checkbox checkbox, B6A b6a, int i, Object obj) {
            if ((i & 1) != 0) {
                b6a = checkbox.checkedTint;
            }
            return new Checkbox(b6a);
        }

        /* renamed from: component1-QN2ZGVo, reason: not valid java name */
        public final B6A m2502component1QN2ZGVo() {
            return this.checkedTint;
        }

        /* renamed from: copy-Y2TPw74, reason: not valid java name */
        public final Checkbox m2503copyY2TPw74(B6A b6a) {
            return new Checkbox(b6a);
        }

        /* renamed from: getCheckedTint-QN2ZGVo, reason: not valid java name */
        public final B6A m2504getCheckedTintQN2ZGVo() {
            return this.checkedTint;
        }

        public int hashCode() {
            return AnonymousClass007.A07(this.checkedTint);
        }

        public /* synthetic */ Checkbox(B6A b6a, C06H c06h) {
            this(b6a);
        }

        public String toString() {
            return super.toString();
        }

        public Checkbox(B6A b6a) {
            this.checkedTint = b6a;
        }

        public /* synthetic */ Checkbox(B6A b6a, int i, C06H c06h) {
            this((i & 1) != 0 ? null : b6a);
        }

        public Checkbox() {
            this(null);
        }
    }

    public final class ChevronNavigation extends AuraCardType {
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

    public final class Clickable extends AuraCardType {
        public static final int $stable = 0;
        public static final Clickable INSTANCE = new Clickable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Clickable);
        }

        public String toString() {
            return "Clickable";
        }

        public int hashCode() {
            return 503870314;
        }
    }

    public final class ExternalNavigation extends AuraCardType {
        public static final int $stable = 0;
        public static final ExternalNavigation INSTANCE = new ExternalNavigation();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ExternalNavigation);
        }

        public String toString() {
            return "ExternalNavigation";
        }

        public int hashCode() {
            return -869546825;
        }
    }

    public final class IconButton extends AuraCardType {
        public static final int $stable = 0;
        public final String contentDescription;
        public final AVy painter;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof IconButton) {
                    IconButton iconButton = (IconButton) obj;
                    if (!C7384Etj.areEqual(this.painter, iconButton.painter) || !C7384Etj.areEqual(this.contentDescription, iconButton.contentDescription)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ IconButton copy$default(IconButton iconButton, AVy aVy, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                aVy = iconButton.painter;
            }
            if ((i & 2) != 0) {
                str = iconButton.contentDescription;
            }
            AnonymousClass003.A0u(aVy, str);
            return new IconButton(aVy, str);
        }

        public final AVy component1() {
            return this.painter;
        }

        public final String component2() {
            return this.contentDescription;
        }

        public final String getContentDescription() {
            return this.contentDescription;
        }

        public final AVy getPainter() {
            return this.painter;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.contentDescription, AnonymousClass005.A0E(this.painter));
        }

        public IconButton(AVy aVy, String str) {
            AnonymousClass003.A0u(aVy, str);
            this.painter = aVy;
            this.contentDescription = str;
        }

        public final IconButton copy(AVy aVy, String str) {
            AnonymousClass003.A0u(aVy, str);
            return new IconButton(aVy, str);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class IconToggleButton extends AuraCardType {
        public static final int $stable = 0;
        public final AVy painter;

        public IconToggleButton(AVy aVy) {
            C7384Etj.A0Y(aVy, 0);
            this.painter = aVy;
        }

        public final IconToggleButton copy(AVy aVy) {
            C7384Etj.A0Y(aVy, 0);
            return new IconToggleButton(aVy);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof IconToggleButton) && C7384Etj.areEqual(this.painter, ((IconToggleButton) obj).painter));
        }

        public static /* synthetic */ IconToggleButton copy$default(IconToggleButton iconToggleButton, AVy aVy, int i, Object obj) {
            if ((i & 1) != 0) {
                aVy = iconToggleButton.painter;
            }
            C7384Etj.A0Y(aVy, 0);
            return new IconToggleButton(aVy);
        }

        public final AVy component1() {
            return this.painter;
        }

        public final AVy getPainter() {
            return this.painter;
        }

        public int hashCode() {
            return this.painter.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Image extends AuraCardType {
        public static final int $stable = 0;
        public final String contentDescription;
        public final AuraDrawableSource source;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Image) {
                    Image image = (Image) obj;
                    if (!C7384Etj.areEqual(this.source, image.source) || !C7384Etj.areEqual(this.contentDescription, image.contentDescription)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Image copy$default(Image image, AuraDrawableSource auraDrawableSource, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                auraDrawableSource = image.source;
            }
            if ((i & 2) != 0) {
                str = image.contentDescription;
            }
            return new Image(auraDrawableSource, str);
        }

        public final AuraDrawableSource component1() {
            return this.source;
        }

        public final String component2() {
            return this.contentDescription;
        }

        public final Image copy(AuraDrawableSource auraDrawableSource, String str) {
            return new Image(auraDrawableSource, str);
        }

        public final String getContentDescription() {
            return this.contentDescription;
        }

        public final AuraDrawableSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return (AnonymousClass006.A0D(this.source) * 31) + AnonymousClass005.A0H(this.contentDescription);
        }

        public Image(AuraDrawableSource auraDrawableSource, String str) {
            this.source = auraDrawableSource;
            this.contentDescription = str;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Image(AuraDrawableSource auraDrawableSource, String str, int i, C06H c06h) {
            this(auraDrawableSource, AnonymousClass006.A0s(i, str));
        }
    }

    public final class None extends AuraCardType {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public String toString() {
            return "None";
        }

        public int hashCode() {
            return 371383728;
        }
    }

    public final class Radio extends AuraCardType {
        public static final int $stable = 0;
        public static final Radio INSTANCE = new Radio();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Radio);
        }

        public String toString() {
            return "Radio";
        }

        public int hashCode() {
            return -1368738685;
        }
    }

    public final class TextInput extends AuraCardType {
        public static final int $stable = 0;
        public final int maxLines;
        public final String placeholder;
        public final String value;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof TextInput) {
                    TextInput textInput = (TextInput) obj;
                    if (!C7384Etj.areEqual(this.value, textInput.value) || !C7384Etj.areEqual(this.placeholder, textInput.placeholder) || this.maxLines != textInput.maxLines) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ TextInput copy$default(TextInput textInput, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = textInput.value;
            }
            if ((i2 & 2) != 0) {
                str2 = textInput.placeholder;
            }
            if ((i2 & 4) != 0) {
                i = textInput.maxLines;
            }
            return textInput.copy(str, str2, i);
        }

        public final String component1() {
            return this.value;
        }

        public final String component2() {
            return this.placeholder;
        }

        public final int component3() {
            return this.maxLines;
        }

        public final int getMaxLines() {
            return this.maxLines;
        }

        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return AnonymousClass005.A0I(this.placeholder, AnonymousClass001.A0G(this.value)) + this.maxLines;
        }

        public TextInput(String str, String str2, int i) {
            AnonymousClass003.A0u(str, str2);
            this.value = str;
            this.placeholder = str2;
            this.maxLines = i;
        }

        public final TextInput copy(String str, String str2, int i) {
            AnonymousClass003.A0u(str, str2);
            return new TextInput(str, str2, i);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ TextInput(String str, String str2, int i, int i2, C06H c06h) {
            this(str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? Integer.MAX_VALUE : i);
        }
    }

    public final class Toggle extends AuraCardType {
        public static final int $stable = 0;
        public static final Toggle INSTANCE = new Toggle();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Toggle);
        }

        public String toString() {
            return "Toggle";
        }

        public int hashCode() {
            return 589048780;
        }
    }

    public /* synthetic */ AuraCardType(C06H c06h) {
    }

    public AuraCardType() {
    }
}
