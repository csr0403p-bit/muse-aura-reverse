package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class OptionWidgetData extends C06G implements HatchWidgetData {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final OptionWidgetButtonStyle buttonStyle;
    public final String composerHint;
    public final String customInputPlaceholder;
    public final List<String> options;

    public final class Companion {
        public final C9hr<OptionWidgetData> serializer() {
            return OptionWidgetData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1U(num, AbstractC5321DgF.A02(num, OptionWidgetData$Companion$$childSerializers$1.INSTANCE), null, null, OptionWidgetData$Companion$$childSerializers$2.INSTANCE);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OptionWidgetData) {
                OptionWidgetData optionWidgetData = (OptionWidgetData) obj;
                if (!C7384Etj.areEqual(this.options, optionWidgetData.options) || !C7384Etj.areEqual(this.customInputPlaceholder, optionWidgetData.customInputPlaceholder) || !C7384Etj.areEqual(this.composerHint, optionWidgetData.composerHint) || this.buttonStyle != optionWidgetData.buttonStyle) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ OptionWidgetData(int i, List list, String str, String str2, OptionWidgetButtonStyle optionWidgetButtonStyle, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(OptionWidgetData$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.options = list;
        if ((i & 2) == 0) {
            this.customInputPlaceholder = null;
        } else {
            this.customInputPlaceholder = str;
        }
        if ((i & 4) == 0) {
            this.composerHint = null;
        } else {
            this.composerHint = str2;
        }
        if ((i & 8) == 0) {
            this.buttonStyle = OptionWidgetButtonStyle.DOTTED_LINES;
        } else {
            this.buttonStyle = optionWidgetButtonStyle;
        }
    }

    public static /* synthetic */ OptionWidgetData copy$default(OptionWidgetData optionWidgetData, List list, String str, String str2, OptionWidgetButtonStyle optionWidgetButtonStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            list = optionWidgetData.options;
        }
        if ((i & 2) != 0) {
            str = optionWidgetData.customInputPlaceholder;
        }
        if ((i & 4) != 0) {
            str2 = optionWidgetData.composerHint;
        }
        if ((i & 8) != 0) {
            optionWidgetButtonStyle = optionWidgetData.buttonStyle;
        }
        AnonymousClass003.A0w(list, optionWidgetButtonStyle);
        return new OptionWidgetData(list, str, str2, optionWidgetButtonStyle);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(OptionWidgetData optionWidgetData, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAQ(optionWidgetData.options, C3cH.A15(f0cArr, 0), c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || optionWidgetData.customInputPlaceholder != null) {
            c9j5.AAP(optionWidgetData.customInputPlaceholder, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || optionWidgetData.composerHint != null) {
            c9j5.AAP(optionWidgetData.composerHint, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || optionWidgetData.buttonStyle != OptionWidgetButtonStyle.DOTTED_LINES) {
            c9j5.AAQ(optionWidgetData.buttonStyle, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
    }

    public final List<String> component1() {
        return this.options;
    }

    public final String component2() {
        return this.customInputPlaceholder;
    }

    public final String component3() {
        return this.composerHint;
    }

    public final OptionWidgetButtonStyle component4() {
        return this.buttonStyle;
    }

    public final OptionWidgetButtonStyle getButtonStyle() {
        return this.buttonStyle;
    }

    public final String getComposerHint() {
        return this.composerHint;
    }

    public final String getCustomInputPlaceholder() {
        return this.customInputPlaceholder;
    }

    public final List<String> getOptions() {
        return this.options;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.buttonStyle, (((AnonymousClass005.A0E(this.options) + AnonymousClass006.A0G(this.customInputPlaceholder)) * 31) + AnonymousClass005.A0H(this.composerHint)) * 31);
    }

    public final OptionWidgetData copy(List<String> list, String str, String str2, OptionWidgetButtonStyle optionWidgetButtonStyle) {
        AnonymousClass003.A0w(list, optionWidgetButtonStyle);
        return new OptionWidgetData(list, str, str2, optionWidgetButtonStyle);
    }

    public String toString() {
        return super.toString();
    }

    public OptionWidgetData(List<String> list, String str, String str2, OptionWidgetButtonStyle optionWidgetButtonStyle) {
        AnonymousClass003.A0w(list, optionWidgetButtonStyle);
        this.options = list;
        this.customInputPlaceholder = str;
        this.composerHint = str2;
        this.buttonStyle = optionWidgetButtonStyle;
    }

    public /* synthetic */ OptionWidgetData(List list, String str, String str2, OptionWidgetButtonStyle optionWidgetButtonStyle, int i, C06H c06h) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? OptionWidgetButtonStyle.DOTTED_LINES : optionWidgetButtonStyle);
    }
}
