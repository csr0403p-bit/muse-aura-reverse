package com.facebook.aura.vds.compose.card;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.ApQ;
import X.B6A;
import X.BFM;
import X.C06G;
import X.C06H;
import X.C07C;
import X.C0KA;
import X.C7384Etj;
import X.G0V;
import X.G0W;
import com.facebook.aura.vds.compose.card.AuraCardType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraRadioTapOption extends C06G {
    public static final int $stable = AuraCardType.$stable;
    public final float alpha;
    public final boolean callOnClickWhenDisabled;
    public final boolean checked;
    public final boolean delegateStateChange;
    public final boolean enabled;
    public final G0W<C07C, BFM, Integer, Unit> footerComposable;
    public final Integer icon;
    public final String iconContentDescription;
    public final boolean iconFocusable;
    public final B6A iconTint;
    public final G0V<BFM, Integer, Unit> leading;
    public final Function0<Unit> onClick;
    public final ApQ subtitle;
    public final String testTag;
    public final String title;
    public final AuraCardType type;

    public AuraRadioTapOption() {
        this(null, null, null, false, null, null, false, true, 1.0f, null, false, new AuraCardType.Checkbox(null), true, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraRadioTapOption) {
                AuraRadioTapOption auraRadioTapOption = (AuraRadioTapOption) obj;
                if (!C7384Etj.areEqual(this.title, auraRadioTapOption.title) || !C7384Etj.areEqual(this.subtitle, auraRadioTapOption.subtitle) || !C7384Etj.areEqual(this.icon, auraRadioTapOption.icon) || this.iconFocusable != auraRadioTapOption.iconFocusable || !C7384Etj.areEqual(this.iconContentDescription, auraRadioTapOption.iconContentDescription) || !C7384Etj.areEqual(this.iconTint, auraRadioTapOption.iconTint) || this.checked != auraRadioTapOption.checked || this.enabled != auraRadioTapOption.enabled || Float.compare(this.alpha, auraRadioTapOption.alpha) != 0 || !C7384Etj.areEqual(this.onClick, auraRadioTapOption.onClick) || this.callOnClickWhenDisabled != auraRadioTapOption.callOnClickWhenDisabled || !C7384Etj.areEqual(this.type, auraRadioTapOption.type) || this.delegateStateChange != auraRadioTapOption.delegateStateChange || !C7384Etj.areEqual(this.footerComposable, auraRadioTapOption.footerComposable) || !C7384Etj.areEqual(this.leading, auraRadioTapOption.leading) || !C7384Etj.areEqual(this.testTag, auraRadioTapOption.testTag)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: copy-MevLcKo$default, reason: not valid java name */
    public static /* synthetic */ AuraRadioTapOption m2505copyMevLcKo$default(AuraRadioTapOption auraRadioTapOption, String str, ApQ apQ, Integer num, boolean z, String str2, B6A b6a, boolean z2, boolean z3, float f, Function0 function0, boolean z4, AuraCardType auraCardType, boolean z5, G0W g0w, G0V g0v, String str3, int i, Object obj) {
        String str4 = str;
        ApQ apQ2 = apQ;
        Integer num2 = num;
        boolean z6 = z;
        String str5 = str2;
        B6A b6a2 = b6a;
        boolean z7 = z2;
        boolean z8 = z3;
        float f2 = f;
        Function0 function02 = function0;
        boolean z9 = z4;
        AuraCardType auraCardType2 = auraCardType;
        boolean z10 = z5;
        G0W g0w2 = g0w;
        G0V g0v2 = g0v;
        String str6 = str3;
        if ((i & 1) != 0) {
            str4 = auraRadioTapOption.title;
        }
        if ((i & 2) != 0) {
            apQ2 = auraRadioTapOption.subtitle;
        }
        if ((i & 4) != 0) {
            num2 = auraRadioTapOption.icon;
        }
        if ((i & 8) != 0) {
            z6 = auraRadioTapOption.iconFocusable;
        }
        if ((i & 16) != 0) {
            str5 = auraRadioTapOption.iconContentDescription;
        }
        if ((i & 32) != 0) {
            b6a2 = auraRadioTapOption.iconTint;
        }
        if ((i & 64) != 0) {
            z7 = auraRadioTapOption.checked;
        }
        if ((i & 128) != 0) {
            z8 = auraRadioTapOption.enabled;
        }
        if ((i & 256) != 0) {
            f2 = auraRadioTapOption.alpha;
        }
        if ((i & 512) != 0) {
            function02 = auraRadioTapOption.onClick;
        }
        if ((i & 1024) != 0) {
            z9 = auraRadioTapOption.callOnClickWhenDisabled;
        }
        if ((i & 2048) != 0) {
            auraCardType2 = auraRadioTapOption.type;
        }
        if ((i & 4096) != 0) {
            z10 = auraRadioTapOption.delegateStateChange;
        }
        if ((i & 8192) != 0) {
            g0w2 = auraRadioTapOption.footerComposable;
        }
        if ((i & 16384) != 0) {
            g0v2 = auraRadioTapOption.leading;
        }
        if ((i & 32768) != 0) {
            str6 = auraRadioTapOption.testTag;
        }
        boolean z11 = z6;
        return auraRadioTapOption.m2507copyMevLcKo(str4, apQ2, num2, z11, str5, b6a2, z7, z8, f2, function02, z9, auraCardType2, z10, g0w2, g0v2, str6);
    }

    public final String component1() {
        return this.title;
    }

    public final Function0<Unit> component10() {
        return this.onClick;
    }

    public final boolean component11() {
        return this.callOnClickWhenDisabled;
    }

    public final AuraCardType component12() {
        return this.type;
    }

    public final boolean component13() {
        return this.delegateStateChange;
    }

    public final G0W<C07C, BFM, Integer, Unit> component14() {
        return this.footerComposable;
    }

    public final G0V<BFM, Integer, Unit> component15() {
        return this.leading;
    }

    public final String component16() {
        return this.testTag;
    }

    public final ApQ component2() {
        return this.subtitle;
    }

    public final Integer component3() {
        return this.icon;
    }

    public final boolean component4() {
        return this.iconFocusable;
    }

    public final String component5() {
        return this.iconContentDescription;
    }

    /* renamed from: component6-QN2ZGVo, reason: not valid java name */
    public final B6A m2506component6QN2ZGVo() {
        return this.iconTint;
    }

    public final boolean component7() {
        return this.checked;
    }

    public final boolean component8() {
        return this.enabled;
    }

    public final float component9() {
        return this.alpha;
    }

    /* renamed from: copy-MevLcKo, reason: not valid java name */
    public final AuraRadioTapOption m2507copyMevLcKo(String str, ApQ apQ, Integer num, boolean z, String str2, B6A b6a, boolean z2, boolean z3, float f, Function0<Unit> function0, boolean z4, AuraCardType auraCardType, boolean z5, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, G0V<? super BFM, ? super Integer, Unit> g0v, String str3) {
        C7384Etj.A0Y(auraCardType, 11);
        return new AuraRadioTapOption(str, apQ, num, z, str2, b6a, z2, z3, f, function0, z4, auraCardType, z5, g0w, g0v, str3);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final boolean getCallOnClickWhenDisabled() {
        return this.callOnClickWhenDisabled;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final boolean getDelegateStateChange() {
        return this.delegateStateChange;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final G0W<C07C, BFM, Integer, Unit> getFooterComposable() {
        return this.footerComposable;
    }

    public final Integer getIcon() {
        return this.icon;
    }

    public final String getIconContentDescription() {
        return this.iconContentDescription;
    }

    public final boolean getIconFocusable() {
        return this.iconFocusable;
    }

    /* renamed from: getIconTint-QN2ZGVo, reason: not valid java name */
    public final B6A m2508getIconTintQN2ZGVo() {
        return this.iconTint;
    }

    public final G0V<BFM, Integer, Unit> getLeading() {
        return this.leading;
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    public final ApQ getSubtitle() {
        return this.subtitle;
    }

    public final String getTestTag() {
        return this.testTag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final AuraCardType getType() {
        return this.type;
    }

    public int hashCode() {
        return ((((C0KA.A01(AnonymousClass005.A0F(this.type, C0KA.A01((AnonymousClass005.A02(C0KA.A01(C0KA.A01((((C0KA.A01(((((AnonymousClass006.A0G(this.title) * 31) + AnonymousClass006.A0D(this.subtitle)) * 31) + AnonymousClass006.A0D(this.icon)) * 31, this.iconFocusable) + AnonymousClass006.A0G(this.iconContentDescription)) * 31) + AnonymousClass007.A07(this.iconTint)) * 31, this.checked), this.enabled), this.alpha) + AnonymousClass006.A0D(this.onClick)) * 31, this.callOnClickWhenDisabled)), this.delegateStateChange) + AnonymousClass006.A0D(this.footerComposable)) * 31) + AnonymousClass006.A0D(this.leading)) * 31) + AnonymousClass005.A0H(this.testTag);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraRadioTapOption(String str, ApQ apQ, Integer num, boolean z, String str2, B6A b6a, boolean z2, boolean z3, float f, Function0 function0, boolean z4, AuraCardType auraCardType, boolean z5, G0W g0w, G0V g0v, String str3, C06H c06h) {
        this(str, apQ, num, z, str2, b6a, z2, z3, f, function0, z4, auraCardType, z5, g0w, g0v, str3);
    }

    public /* synthetic */ AuraRadioTapOption(String str, ApQ apQ, Integer num, boolean z, String str2, B6A b6a, boolean z2, boolean z3, float f, Function0 function0, boolean z4, AuraCardType auraCardType, boolean z5, G0W g0w, G0V g0v, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : apQ, (i & 4) != 0 ? null : num, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : b6a, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? true : z3, (i & 256) != 0 ? 1.0f : f, (i & 512) != 0 ? null : function0, (i & 1024) == 0 ? z4 : false, (i & 2048) != 0 ? new AuraCardType.Checkbox(null) : auraCardType, (i & 4096) == 0 ? z5 : true, (i & 8192) != 0 ? null : g0w, (i & 16384) != 0 ? null : g0v, (i & 32768) != 0 ? null : str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuraRadioTapOption(String str, ApQ apQ, Integer num, boolean z, String str2, B6A b6a, boolean z2, boolean z3, float f, Function0<Unit> function0, boolean z4, AuraCardType auraCardType, boolean z5, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, G0V<? super BFM, ? super Integer, Unit> g0v, String str3) {
        C7384Etj.A0Y(auraCardType, 11);
        this.title = str;
        this.subtitle = apQ;
        this.icon = num;
        this.iconFocusable = z;
        this.iconContentDescription = str2;
        this.iconTint = b6a;
        this.checked = z2;
        this.enabled = z3;
        this.alpha = f;
        this.onClick = function0;
        this.callOnClickWhenDisabled = z4;
        this.type = auraCardType;
        this.delegateStateChange = z5;
        this.footerComposable = g0w;
        this.leading = g0v;
        this.testTag = str3;
    }
}
