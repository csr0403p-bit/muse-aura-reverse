package com.facebook.aura.vds.compose.bottomsheet.model;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import X.Ey9;
import X.F3w;
import com.facebook.aura.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraBottomSheetHeaderConfig extends C06G {
    public final AccessoryButton leadingButton;
    public final LabeledAccessoryButton leadingLabeledButton;
    public final AccessoryButton secondaryTrailingButton;
    public final Style style;
    public final String subtitle;
    public final String title;
    public final AccessoryButton trailingButton;

    public final class AccessoryButton extends C06G {
        public static final Companion Companion = new Companion();
        public final int contentDescription;
        public final int icon;
        public final Function0<Unit> onClick;

        public AccessoryButton(int i, int i2, Function0<Unit> function0) {
            C7384Etj.A0Y(function0, 2);
            this.icon = i;
            this.contentDescription = i2;
            this.onClick = function0;
        }

        public final AccessoryButton copy(int i, int i2, Function0<Unit> function0) {
            C7384Etj.A0Y(function0, 2);
            return new AccessoryButton(i, i2, function0);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AccessoryButton) {
                    AccessoryButton accessoryButton = (AccessoryButton) obj;
                    if (this.icon != accessoryButton.icon || this.contentDescription != accessoryButton.contentDescription || !C7384Etj.areEqual(this.onClick, accessoryButton.onClick)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AccessoryButton copy$default(AccessoryButton accessoryButton, int i, int i2, Function0 function0, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = accessoryButton.icon;
            }
            if ((i3 & 2) != 0) {
                i2 = accessoryButton.contentDescription;
            }
            if ((i3 & 4) != 0) {
                function0 = accessoryButton.onClick;
            }
            return accessoryButton.copy(i, i2, function0);
        }

        public final int component1() {
            return this.icon;
        }

        public final int component2() {
            return this.contentDescription;
        }

        public final Function0<Unit> component3() {
            return this.onClick;
        }

        public final int getContentDescription() {
            return this.contentDescription;
        }

        public final int getIcon() {
            return this.icon;
        }

        public final Function0<Unit> getOnClick() {
            return this.onClick;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.onClick, ((this.icon * 31) + this.contentDescription) * 31);
        }

        public final class Companion {
            public final AccessoryButton back(Function0<Unit> function0) {
                C7384Etj.A0Y(function0, 0);
                return new AccessoryButton(R.drawable.caret_left, R.string._name_removed__res_0x7f1206bb, function0);
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class LabeledAccessoryButton extends C06G {
        public final int contentDescription;
        public final int label;
        public final Function0<Unit> onClick;

        public LabeledAccessoryButton(int i, int i2, Function0<Unit> function0) {
            C7384Etj.A0Y(function0, 2);
            this.label = i;
            this.contentDescription = i2;
            this.onClick = function0;
        }

        public final LabeledAccessoryButton copy(int i, int i2, Function0<Unit> function0) {
            C7384Etj.A0Y(function0, 2);
            return new LabeledAccessoryButton(i, i2, function0);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof LabeledAccessoryButton) {
                    LabeledAccessoryButton labeledAccessoryButton = (LabeledAccessoryButton) obj;
                    if (this.label != labeledAccessoryButton.label || this.contentDescription != labeledAccessoryButton.contentDescription || !C7384Etj.areEqual(this.onClick, labeledAccessoryButton.onClick)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LabeledAccessoryButton copy$default(LabeledAccessoryButton labeledAccessoryButton, int i, int i2, Function0 function0, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = labeledAccessoryButton.label;
            }
            if ((i3 & 2) != 0) {
                i2 = labeledAccessoryButton.contentDescription;
            }
            if ((i3 & 4) != 0) {
                function0 = labeledAccessoryButton.onClick;
            }
            return labeledAccessoryButton.copy(i, i2, function0);
        }

        public final int component1() {
            return this.label;
        }

        public final int component2() {
            return this.contentDescription;
        }

        public final Function0<Unit> component3() {
            return this.onClick;
        }

        public final int getContentDescription() {
            return this.contentDescription;
        }

        public final int getLabel() {
            return this.label;
        }

        public final Function0<Unit> getOnClick() {
            return this.onClick;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.onClick, ((this.label * 31) + this.contentDescription) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Style {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Style[] $VALUES;
        public static final Style DEFAULT;
        public static final Style LARGE_START_ALIGNED;

        static {
            Style style = new Style("DEFAULT", 0);
            DEFAULT = style;
            Style style2 = new Style("LARGE_START_ALIGNED", 1);
            LARGE_START_ALIGNED = style2;
            Style[] styleArr = {style, style2};
            $VALUES = styleArr;
            $ENTRIES = new F3w(styleArr);
        }

        public static Ey9<Style> getEntries() {
            return $ENTRIES;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }

        public Style(String str, int i) {
        }
    }

    public AuraBottomSheetHeaderConfig(String str, String str2, AccessoryButton accessoryButton, AccessoryButton accessoryButton2, AccessoryButton accessoryButton3, Style style, LabeledAccessoryButton labeledAccessoryButton) {
        AnonymousClass002.A1D(str, 0, style);
        this.title = str;
        this.subtitle = str2;
        this.leadingButton = accessoryButton;
        this.trailingButton = accessoryButton2;
        this.secondaryTrailingButton = accessoryButton3;
        this.style = style;
        this.leadingLabeledButton = labeledAccessoryButton;
    }

    public final AuraBottomSheetHeaderConfig copy(String str, String str2, AccessoryButton accessoryButton, AccessoryButton accessoryButton2, AccessoryButton accessoryButton3, Style style, LabeledAccessoryButton labeledAccessoryButton) {
        AnonymousClass002.A1D(str, 0, style);
        return new AuraBottomSheetHeaderConfig(str, str2, accessoryButton, accessoryButton2, accessoryButton3, style, labeledAccessoryButton);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraBottomSheetHeaderConfig) {
                AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig = (AuraBottomSheetHeaderConfig) obj;
                if (!C7384Etj.areEqual(this.title, auraBottomSheetHeaderConfig.title) || !C7384Etj.areEqual(this.subtitle, auraBottomSheetHeaderConfig.subtitle) || !C7384Etj.areEqual(this.leadingButton, auraBottomSheetHeaderConfig.leadingButton) || !C7384Etj.areEqual(this.trailingButton, auraBottomSheetHeaderConfig.trailingButton) || !C7384Etj.areEqual(this.secondaryTrailingButton, auraBottomSheetHeaderConfig.secondaryTrailingButton) || this.style != auraBottomSheetHeaderConfig.style || !C7384Etj.areEqual(this.leadingLabeledButton, auraBottomSheetHeaderConfig.leadingLabeledButton)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuraBottomSheetHeaderConfig copy$default(AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig, String str, String str2, AccessoryButton accessoryButton, AccessoryButton accessoryButton2, AccessoryButton accessoryButton3, Style style, LabeledAccessoryButton labeledAccessoryButton, int i, Object obj) {
        if ((i & 1) != 0) {
            str = auraBottomSheetHeaderConfig.title;
        }
        if ((i & 2) != 0) {
            str2 = auraBottomSheetHeaderConfig.subtitle;
        }
        if ((i & 4) != 0) {
            accessoryButton = auraBottomSheetHeaderConfig.leadingButton;
        }
        if ((i & 8) != 0) {
            accessoryButton2 = auraBottomSheetHeaderConfig.trailingButton;
        }
        if ((i & 16) != 0) {
            accessoryButton3 = auraBottomSheetHeaderConfig.secondaryTrailingButton;
        }
        if ((i & 32) != 0) {
            style = auraBottomSheetHeaderConfig.style;
        }
        if ((i & 64) != 0) {
            labeledAccessoryButton = auraBottomSheetHeaderConfig.leadingLabeledButton;
        }
        return auraBottomSheetHeaderConfig.copy(str, str2, accessoryButton, accessoryButton2, accessoryButton3, style, labeledAccessoryButton);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final AccessoryButton component3() {
        return this.leadingButton;
    }

    public final AccessoryButton component4() {
        return this.trailingButton;
    }

    public final AccessoryButton component5() {
        return this.secondaryTrailingButton;
    }

    public final Style component6() {
        return this.style;
    }

    public final LabeledAccessoryButton component7() {
        return this.leadingLabeledButton;
    }

    public final AccessoryButton getLeadingButton() {
        return this.leadingButton;
    }

    public final LabeledAccessoryButton getLeadingLabeledButton() {
        return this.leadingLabeledButton;
    }

    public final AccessoryButton getSecondaryTrailingButton() {
        return this.secondaryTrailingButton;
    }

    public final Style getStyle() {
        return this.style;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final AccessoryButton getTrailingButton() {
        return this.trailingButton;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.style, (((((((AnonymousClass001.A0G(this.title) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0D(this.leadingButton)) * 31) + AnonymousClass006.A0D(this.trailingButton)) * 31) + AnonymousClass006.A0D(this.secondaryTrailingButton)) * 31) + C06G.A04(this.leadingLabeledButton);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraBottomSheetHeaderConfig(String str, String str2, AccessoryButton accessoryButton, AccessoryButton accessoryButton2, AccessoryButton accessoryButton3, Style style, LabeledAccessoryButton labeledAccessoryButton, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : accessoryButton, (i & 8) != 0 ? null : accessoryButton2, (i & 16) != 0 ? null : accessoryButton3, (i & 32) != 0 ? Style.DEFAULT : style, (i & 64) != 0 ? null : labeledAccessoryButton);
    }
}
