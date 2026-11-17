package com.facebook.aura.vds.toolbar;

import X.AGE;
import X.AbstractC7559F3s;
import X.AbstractC8276Fb0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.B1U;
import X.B6A;
import X.BDa;
import X.BFM;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C10449Hii;
import X.C3TH;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.C8318Fbk;
import X.C8j4;
import X.F60;
import X.G0V;
import X.HxS;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.ext.ViewExtKt;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraToolbarAgent {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final AndroidComponent component;
    public final MutableState<Config> config;
    public final MutableState<G0V<BFM, Integer, Unit>> content;
    public final MutableState<String> subtitleText;
    public final MutableState<String> titleText;
    public Toolbar toolbar;
    public final int toolbarId;

    public interface AndroidComponent {
        AppCompatActivity getActivity();

        Context getContext();

        void setHasOptionsMenu(boolean z);
    }

    /* loaded from: classes.dex */
    public final class Config extends C06G {
        public static final int $stable = 8;
        public final boolean addGradient;
        public final List<EndButtonConfig> endButtons;
        public final boolean focusOnTitle;
        public final B6A iconTint;
        public final boolean isOptionsEnabled;
        public final Boolean lightTheme;
        public final B6A navIconBackground;
        public final String navIconContentDescription;
        public final boolean navIconShadow;
        public final NavIconType navIconType;
        public final Function0<Unit> navigationOnClickListener;
        public final View nextViewToFocus;
        public final boolean overrideSystemBackButtonClick;
        public final boolean shouldShowNavIcon;
        public final boolean shouldUseFlatStyle;
        public final C3TH titleHorizontalAlignmentOverride;
        public final boolean useTransparentBackground;
        public final boolean useWrapContentHeight;

        /* renamed from: copy-W8C4Oug, reason: not valid java name */
        public final Config m3127copyW8C4Oug(boolean z, NavIconType navIconType, Boolean bool, boolean z2, Function0<Unit> function0, boolean z3, List<EndButtonConfig> list, boolean z4, View view, String str, boolean z5, B6A b6a, boolean z6, B6A b6a2, boolean z7, C3TH c3th, boolean z8, boolean z9) {
            AnonymousClass002.A1E(navIconType, 1, list);
            return new Config(z, navIconType, bool, z2, function0, z3, list, z4, view, str, z5, b6a, z6, b6a2, z7, c3th, z8, z9);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Config) {
                    Config config = (Config) obj;
                    if (this.shouldShowNavIcon != config.shouldShowNavIcon || !C7384Etj.areEqual(this.navIconType, config.navIconType) || !C7384Etj.areEqual(this.lightTheme, config.lightTheme) || this.useTransparentBackground != config.useTransparentBackground || !C7384Etj.areEqual(this.navigationOnClickListener, config.navigationOnClickListener) || this.addGradient != config.addGradient || !C7384Etj.areEqual(this.endButtons, config.endButtons) || this.focusOnTitle != config.focusOnTitle || !C7384Etj.areEqual(this.nextViewToFocus, config.nextViewToFocus) || !C7384Etj.areEqual(this.navIconContentDescription, config.navIconContentDescription) || this.overrideSystemBackButtonClick != config.overrideSystemBackButtonClick || !C7384Etj.areEqual(this.navIconBackground, config.navIconBackground) || this.navIconShadow != config.navIconShadow || !C7384Etj.areEqual(this.iconTint, config.iconTint) || this.isOptionsEnabled != config.isOptionsEnabled || !C7384Etj.areEqual(this.titleHorizontalAlignmentOverride, config.titleHorizontalAlignmentOverride) || this.shouldUseFlatStyle != config.shouldUseFlatStyle || this.useWrapContentHeight != config.useWrapContentHeight) {
                    }
                }
                return false;
            }
            return true;
        }

        public /* synthetic */ Config(boolean z, NavIconType navIconType, Boolean bool, boolean z2, Function0 function0, boolean z3, List list, boolean z4, View view, String str, boolean z5, B6A b6a, boolean z6, B6A b6a2, boolean z7, C3TH c3th, boolean z8, boolean z9, int i, C06H c06h) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? NavIconType.Back.INSTANCE : navIconType, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : function0, AnonymousClass002.A1R(i, z3), (i & 64) != 0 ? C0881AGi.A00 : list, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? null : view, (i & 512) != 0 ? null : str, (i & 1024) != 0 ? false : z5, (i & 2048) != 0 ? null : b6a, (i & 4096) != 0 ? false : z6, (i & 8192) != 0 ? null : b6a2, (i & 16384) != 0 ? true : z7, (i & 32768) != 0 ? null : c3th, C06G.A0o(i, 65536, z8), C06G.A0o(i, 131072, z9));
        }

        /* renamed from: copy-W8C4Oug$default, reason: not valid java name */
        public static /* synthetic */ Config m3124copyW8C4Oug$default(Config config, boolean z, NavIconType navIconType, Boolean bool, boolean z2, Function0 function0, boolean z3, List list, boolean z4, View view, String str, boolean z5, B6A b6a, boolean z6, B6A b6a2, boolean z7, C3TH c3th, boolean z8, boolean z9, int i, Object obj) {
            boolean z10 = z;
            NavIconType navIconType2 = navIconType;
            Boolean bool2 = bool;
            boolean z11 = z2;
            Function0 function02 = function0;
            boolean z12 = z3;
            List list2 = list;
            boolean z13 = z4;
            View view2 = view;
            String str2 = str;
            boolean z14 = z5;
            B6A b6a3 = b6a;
            boolean z15 = z6;
            B6A b6a4 = b6a2;
            boolean z16 = z7;
            C3TH c3th2 = c3th;
            boolean z17 = z8;
            boolean z18 = z9;
            if ((i & 1) != 0) {
                z10 = config.shouldShowNavIcon;
            }
            if ((i & 2) != 0) {
                navIconType2 = config.navIconType;
            }
            if ((i & 4) != 0) {
                bool2 = config.lightTheme;
            }
            if ((i & 8) != 0) {
                z11 = config.useTransparentBackground;
            }
            if ((i & 16) != 0) {
                function02 = config.navigationOnClickListener;
            }
            if ((i & 32) != 0) {
                z12 = config.addGradient;
            }
            if ((i & 64) != 0) {
                list2 = config.endButtons;
            }
            if ((i & 128) != 0) {
                z13 = config.focusOnTitle;
            }
            if ((i & 256) != 0) {
                view2 = config.nextViewToFocus;
            }
            if ((i & 512) != 0) {
                str2 = config.navIconContentDescription;
            }
            if ((i & 1024) != 0) {
                z14 = config.overrideSystemBackButtonClick;
            }
            if ((i & 2048) != 0) {
                b6a3 = config.navIconBackground;
            }
            if ((i & 4096) != 0) {
                z15 = config.navIconShadow;
            }
            if ((i & 8192) != 0) {
                b6a4 = config.iconTint;
            }
            if ((i & 16384) != 0) {
                z16 = config.isOptionsEnabled;
            }
            if ((i & 32768) != 0) {
                c3th2 = config.titleHorizontalAlignmentOverride;
            }
            if ((i & 65536) != 0) {
                z17 = config.shouldUseFlatStyle;
            }
            if ((i & 131072) != 0) {
                z18 = config.useWrapContentHeight;
            }
            boolean z19 = z12;
            List list3 = list2;
            boolean z20 = z13;
            return config.m3127copyW8C4Oug(z10, navIconType2, bool2, z11, function02, z19, list3, z20, view2, str2, z14, b6a3, z15, b6a4, z16, c3th2, z17, z18);
        }

        @Deprecated(message = "Please use a content composable instead, this API does scale well for all of the use cases we might have")
        public static /* synthetic */ void getEndButtons$annotations() {
        }

        public final boolean component1() {
            return this.shouldShowNavIcon;
        }

        public final String component10() {
            return this.navIconContentDescription;
        }

        public final boolean component11() {
            return this.overrideSystemBackButtonClick;
        }

        /* renamed from: component12-QN2ZGVo, reason: not valid java name */
        public final B6A m3125component12QN2ZGVo() {
            return this.navIconBackground;
        }

        public final boolean component13() {
            return this.navIconShadow;
        }

        /* renamed from: component14-QN2ZGVo, reason: not valid java name */
        public final B6A m3126component14QN2ZGVo() {
            return this.iconTint;
        }

        public final boolean component15() {
            return this.isOptionsEnabled;
        }

        public final C3TH component16() {
            return this.titleHorizontalAlignmentOverride;
        }

        public final boolean component17() {
            return this.shouldUseFlatStyle;
        }

        public final boolean component18() {
            return this.useWrapContentHeight;
        }

        public final NavIconType component2() {
            return this.navIconType;
        }

        public final Boolean component3() {
            return this.lightTheme;
        }

        public final boolean component4() {
            return this.useTransparentBackground;
        }

        public final Function0<Unit> component5() {
            return this.navigationOnClickListener;
        }

        public final boolean component6() {
            return this.addGradient;
        }

        public final List<EndButtonConfig> component7() {
            return this.endButtons;
        }

        public final boolean component8() {
            return this.focusOnTitle;
        }

        public final View component9() {
            return this.nextViewToFocus;
        }

        public final boolean getAddGradient() {
            return this.addGradient;
        }

        public final List<EndButtonConfig> getEndButtons() {
            return this.endButtons;
        }

        public final boolean getFocusOnTitle() {
            return this.focusOnTitle;
        }

        /* renamed from: getIconTint-QN2ZGVo, reason: not valid java name */
        public final B6A m3128getIconTintQN2ZGVo() {
            return this.iconTint;
        }

        public final Boolean getLightTheme() {
            return this.lightTheme;
        }

        /* renamed from: getNavIconBackground-QN2ZGVo, reason: not valid java name */
        public final B6A m3129getNavIconBackgroundQN2ZGVo() {
            return this.navIconBackground;
        }

        public final String getNavIconContentDescription() {
            return this.navIconContentDescription;
        }

        public final boolean getNavIconShadow() {
            return this.navIconShadow;
        }

        public final NavIconType getNavIconType() {
            return this.navIconType;
        }

        public final Function0<Unit> getNavigationOnClickListener() {
            return this.navigationOnClickListener;
        }

        public final View getNextViewToFocus() {
            return this.nextViewToFocus;
        }

        public final boolean getOverrideSystemBackButtonClick() {
            return this.overrideSystemBackButtonClick;
        }

        public final boolean getShouldShowNavIcon() {
            return this.shouldShowNavIcon;
        }

        public final boolean getShouldUseFlatStyle() {
            return this.shouldUseFlatStyle;
        }

        public final C3TH getTitleHorizontalAlignmentOverride() {
            return this.titleHorizontalAlignmentOverride;
        }

        public final boolean getUseTransparentBackground() {
            return this.useTransparentBackground;
        }

        public final boolean getUseWrapContentHeight() {
            return this.useWrapContentHeight;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01((C0KA.A01((C0KA.A01((C0KA.A01((((C0KA.A01(AnonymousClass005.A0F(this.endButtons, C0KA.A01((C0KA.A01((AnonymousClass005.A0F(this.navIconType, C0KA.A02(this.shouldShowNavIcon)) + AnonymousClass006.A0D(this.lightTheme)) * 31, this.useTransparentBackground) + AnonymousClass006.A0D(this.navigationOnClickListener)) * 31, this.addGradient)), this.focusOnTitle) + AnonymousClass006.A0D(this.nextViewToFocus)) * 31) + AnonymousClass006.A0G(this.navIconContentDescription)) * 31, this.overrideSystemBackButtonClick) + AnonymousClass007.A07(this.navIconBackground)) * 31, this.navIconShadow) + AnonymousClass007.A07(this.iconTint)) * 31, this.isOptionsEnabled) + C06G.A04(this.titleHorizontalAlignmentOverride)) * 31, this.shouldUseFlatStyle), this.useWrapContentHeight);
        }

        public final boolean isOptionsEnabled() {
            return this.isOptionsEnabled;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Config(boolean z, NavIconType navIconType, Boolean bool, boolean z2, Function0 function0, boolean z3, List list, boolean z4, View view, String str, boolean z5, B6A b6a, boolean z6, B6A b6a2, boolean z7, C3TH c3th, boolean z8, boolean z9, C06H c06h) {
            this(z, navIconType, bool, z2, function0, z3, list, z4, view, str, z5, b6a, z6, b6a2, z7, c3th, z8, z9);
        }

        public Config(boolean z, NavIconType navIconType, Boolean bool, boolean z2, Function0<Unit> function0, boolean z3, List<EndButtonConfig> list, boolean z4, View view, String str, boolean z5, B6A b6a, boolean z6, B6A b6a2, boolean z7, C3TH c3th, boolean z8, boolean z9) {
            AnonymousClass002.A1E(navIconType, 1, list);
            this.shouldShowNavIcon = z;
            this.navIconType = navIconType;
            this.lightTheme = bool;
            this.useTransparentBackground = z2;
            this.navigationOnClickListener = function0;
            this.addGradient = z3;
            this.endButtons = list;
            this.focusOnTitle = z4;
            this.nextViewToFocus = view;
            this.navIconContentDescription = str;
            this.overrideSystemBackButtonClick = z5;
            this.navIconBackground = b6a;
            this.navIconShadow = z6;
            this.iconTint = b6a2;
            this.isOptionsEnabled = z7;
            this.titleHorizontalAlignmentOverride = c3th;
            this.shouldUseFlatStyle = z8;
            this.useWrapContentHeight = z9;
        }

        public Config() {
            this(true, NavIconType.Back.INSTANCE, null, false, null, false, C0881AGi.A00, false, null, null, false, null, false, null, true, null, false, false);
        }
    }

    @Deprecated(message = "Please use a content composable instead, this API does scale well for all of the use cases we might have")
    /* loaded from: classes.dex */
    public final class EndButtonConfig extends C06G {
        public static final int $stable = 0;
        public final boolean addCircleBackground;
        public final Integer contentDescriptionRes;
        public final Integer icon;
        public final Function0<Unit> listener;
        public final Integer stringRes;
        public final boolean usePrimaryColorStyle;

        /* renamed from: com.facebook.aura.vds.toolbar.AuraToolbarAgent$EndButtonConfig$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        public EndButtonConfig() {
            this(null, null, null, false, false, AnonymousClass1.INSTANCE);
        }

        public final EndButtonConfig copy(Integer num, Integer num2, Integer num3, boolean z, boolean z2, Function0<Unit> function0) {
            C7384Etj.A0Y(function0, 5);
            return new EndButtonConfig(num, num2, num3, z, z2, function0);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof EndButtonConfig) {
                    EndButtonConfig endButtonConfig = (EndButtonConfig) obj;
                    if (!C7384Etj.areEqual(this.icon, endButtonConfig.icon) || !C7384Etj.areEqual(this.stringRes, endButtonConfig.stringRes) || !C7384Etj.areEqual(this.contentDescriptionRes, endButtonConfig.contentDescriptionRes) || this.addCircleBackground != endButtonConfig.addCircleBackground || this.usePrimaryColorStyle != endButtonConfig.usePrimaryColorStyle || !C7384Etj.areEqual(this.listener, endButtonConfig.listener)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EndButtonConfig copy$default(EndButtonConfig endButtonConfig, Integer num, Integer num2, Integer num3, boolean z, boolean z2, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                num = endButtonConfig.icon;
            }
            if ((i & 2) != 0) {
                num2 = endButtonConfig.stringRes;
            }
            if ((i & 4) != 0) {
                num3 = endButtonConfig.contentDescriptionRes;
            }
            if ((i & 8) != 0) {
                z = endButtonConfig.addCircleBackground;
            }
            if ((i & 16) != 0) {
                z2 = endButtonConfig.usePrimaryColorStyle;
            }
            if ((i & 32) != 0) {
                function0 = endButtonConfig.listener;
            }
            return endButtonConfig.copy(num, num2, num3, z, z2, function0);
        }

        public final Integer component1() {
            return this.icon;
        }

        public final Integer component2() {
            return this.stringRes;
        }

        public final Integer component3() {
            return this.contentDescriptionRes;
        }

        public final boolean component4() {
            return this.addCircleBackground;
        }

        public final boolean component5() {
            return this.usePrimaryColorStyle;
        }

        public final Function0<Unit> component6() {
            return this.listener;
        }

        public final boolean getAddCircleBackground() {
            return this.addCircleBackground;
        }

        public final Integer getContentDescriptionRes() {
            return this.contentDescriptionRes;
        }

        public final Integer getIcon() {
            return this.icon;
        }

        public final Function0<Unit> getListener() {
            return this.listener;
        }

        public final Integer getStringRes() {
            return this.stringRes;
        }

        public final boolean getUsePrimaryColorStyle() {
            return this.usePrimaryColorStyle;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.listener, C0KA.A01(C0KA.A01(((((AnonymousClass006.A0D(this.icon) * 31) + AnonymousClass006.A0D(this.stringRes)) * 31) + C06G.A04(this.contentDescriptionRes)) * 31, this.addCircleBackground), this.usePrimaryColorStyle));
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ EndButtonConfig(Integer num, Integer num2, Integer num3, boolean z, boolean z2, Function0 function0, int i, C06H c06h) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, AnonymousClass005.A1P(i, z), AnonymousClass005.A1Q(i, z2), (i & 32) != 0 ? AnonymousClass1.INSTANCE : function0);
        }

        public EndButtonConfig(Integer num, Integer num2, Integer num3, boolean z, boolean z2, Function0<Unit> function0) {
            C7384Etj.A0Y(function0, 5);
            this.icon = num;
            this.stringRes = num2;
            this.contentDescriptionRes = num3;
            this.addCircleBackground = z;
            this.usePrimaryColorStyle = z2;
            this.listener = function0;
        }
    }

    /* loaded from: classes.dex */
    public abstract class NavIconType {
        public static final int $stable = 8;
        public final int navIcon;
        public final int stringDescr;

        public final class Back extends NavIconType {
            public static final int $stable = 0;
            public static final Back INSTANCE = new Back();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Back);
            }

            public String toString() {
                return "Back";
            }

            public Back() {
                super(R.drawable.meta_ai_icons_chevron_left_regular_cropped, R.string._name_removed__res_0x7f1206ba);
            }

            public int hashCode() {
                return 1813379060;
            }
        }

        public final class Close extends NavIconType {
            public static final int $stable = 0;
            public static final Close INSTANCE = new Close();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Close);
            }

            public String toString() {
                return "Close";
            }

            public Close() {
                super(R.drawable.meta_ai_icons_cross_regular_cropped, R.string._name_removed__res_0x7f1206ec);
            }

            public int hashCode() {
                return 381439115;
            }
        }

        public final class Search extends NavIconType {
            public static final int $stable = 0;
            public static final Search INSTANCE = new Search();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Search);
            }

            public String toString() {
                return "Search";
            }

            public Search() {
                super(R.drawable.ic_magnifying_glass, R.string._name_removed__res_0x7f120e7f);
            }

            public int hashCode() {
                return -609105547;
            }
        }

        public final class Settings extends NavIconType {
            public static final int $stable = 0;
            public static final Settings INSTANCE = new Settings();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Settings);
            }

            public String toString() {
                return "Settings";
            }

            public Settings() {
                super(R.drawable.ic_gear, R.string._name_removed__res_0x7f1206c3);
            }

            public int hashCode() {
                return -688889680;
            }
        }

        public final class Sidebar extends NavIconType {
            public static final int $stable = 0;
            public static final Sidebar INSTANCE = new Sidebar();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Sidebar);
            }

            public String toString() {
                return "Sidebar";
            }

            public Sidebar() {
                super(R.drawable.menu_2_lines_regular_cropped, R.string._name_removed__res_0x7f120ce4);
            }

            public int hashCode() {
                return -1585503953;
            }
        }

        public final int getNavIcon() {
            return this.navIcon;
        }

        public final int getStringDescr() {
            return this.stringDescr;
        }

        public NavIconType(int i, int i2) {
            this.navIcon = i;
            this.stringDescr = i2;
        }

        public /* synthetic */ NavIconType(int i, int i2, C06H c06h) {
            this(i, i2);
        }
    }

    /* renamed from: com.facebook.aura.vds.toolbar.AuraToolbarAgent$getToolbarView$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C143091 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public C143091() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1, types: [int] */
        /* JADX WARN: Type inference failed for: r13v3 */
        /* JADX WARN: Type inference failed for: r13v4 */
        public final void invoke(BFM bfm, int i) {
            int iA1V;
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                if (AuraToolbarAgent.this.config.getValue().addGradient) {
                    bfm.AgE(-548708043);
                    Toolbar toolbar = AuraToolbarAgent.this.toolbar;
                    if (toolbar == null) {
                        C7384Etj.A0b("toolbar");
                        throw F60.createAndThrow();
                    }
                    toolbar.setBackground(AnonymousClass002.A0H(bfm).getDrawable(R.drawable.toolbar_gradient));
                    iA1V = AnonymousClass001.A1V(bfm);
                } else {
                    boolean zA1P = AnonymousClass004.A1P(bfm, -548591855);
                    Toolbar toolbar2 = AuraToolbarAgent.this.toolbar;
                    if (toolbar2 == null) {
                        C7384Etj.A0b("toolbar");
                        throw F60.createAndThrow();
                    }
                    toolbar2.setBackgroundColor(HxS.A01(B6A.A06));
                    iA1V = zA1P;
                }
                boolean z = AuraToolbarAgent.this.config.getValue().shouldShowNavIcon;
                String value = AuraToolbarAgent.this.titleText.getValue();
                String value2 = AuraToolbarAgent.this.subtitleText.getValue();
                G0V<BFM, Integer, Unit> value3 = AuraToolbarAgent.this.content.getValue();
                boolean z2 = AuraToolbarAgent.this.config.getValue().focusOnTitle;
                NavIconType navIconType = AuraToolbarAgent.this.config.getValue().navIconType;
                String str = AuraToolbarAgent.this.config.getValue().navIconContentDescription;
                Config value4 = AuraToolbarAgent.this.config.getValue();
                boolean zA67 = bfm.A67(AuraToolbarAgent.this);
                AuraToolbarAgent auraToolbarAgent = AuraToolbarAgent.this;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new AuraToolbarAgent$getToolbarView$1$1$1(auraToolbarAgent);
                    bfm.Ai0(objAaT);
                }
                AuraTitleBarKt.AuraTitleBar(null, z, (Function0) objAaT, z2, value4, value, value2, navIconType, str, value3, null, bfm, iA1V, iA1V, 1025);
                return;
            }
            bfm.Afo();
        }
    }

    public AuraToolbarAgent(final AppCompatActivity appCompatActivity) {
        C7384Etj.A0Y(appCompatActivity, 0);
        this.toolbarId = View.generateViewId();
        Config config = new Config(true, NavIconType.Back.INSTANCE, null, false, null, false, C0881AGi.A00, false, null, null, false, null, false, null, true, null, false, false);
        AGE age = AGE.A00;
        this.config = C3cG.A08(age, config);
        this.titleText = C3cG.A08(age, null);
        this.subtitleText = C3cG.A08(age, null);
        this.content = C3cG.A08(age, null);
        this.component = new AndroidComponent() { // from class: com.facebook.aura.vds.toolbar.AuraToolbarAgent.1
            @Override // com.facebook.aura.vds.toolbar.AuraToolbarAgent.AndroidComponent
            public void setHasOptionsMenu(boolean z) {
            }

            @Override // com.facebook.aura.vds.toolbar.AuraToolbarAgent.AndroidComponent
            public AppCompatActivity getActivity() {
                return appCompatActivity;
            }

            @Override // com.facebook.aura.vds.toolbar.AuraToolbarAgent.AndroidComponent
            public Context getContext() {
                return appCompatActivity;
            }
        };
    }

    public final void setContent(G0V<? super BFM, ? super Integer, Unit> g0v) {
        C7384Etj.A0Y(g0v, 0);
        this.content.Af8(g0v);
    }

    public final void updateConfig(Config config) {
        C7384Etj.A0Y(config, 0);
        this.config.Af8(config);
        applyConfig();
    }

    private final void applyConfig() {
        AppCompatActivity activity = this.component.getActivity();
        Toolbar toolbar = this.toolbar;
        if (toolbar == null) {
            C7384Etj.A0b("toolbar");
            throw F60.createAndThrow();
        }
        activity.setSupportActionBar(toolbar);
        AbstractC8276Fb0 supportActionBar = activity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A04();
        }
        ensureToolbar();
        Toolbar toolbar2 = this.toolbar;
        if (toolbar2 == null) {
            C7384Etj.A0b("toolbar");
            throw F60.createAndThrow();
        }
        toolbar2.setNavigationIcon((Drawable) null);
        Toolbar toolbar3 = this.toolbar;
        if (toolbar3 == null) {
            C7384Etj.A0b("toolbar");
            throw F60.createAndThrow();
        }
        toolbar3.setNavigationContentDescription((CharSequence) null);
        Toolbar toolbar4 = this.toolbar;
        if (toolbar4 == null) {
            C7384Etj.A0b("toolbar");
            throw F60.createAndThrow();
        }
        C10449Hii c10449Hii = toolbar4.A0B;
        if (c10449Hii == null) {
            c10449Hii = new C10449Hii();
            toolbar4.A0B = c10449Hii;
        }
        c10449Hii.A06 = false;
        c10449Hii.A01 = 0;
        c10449Hii.A03 = 0;
        c10449Hii.A02 = 0;
        c10449Hii.A04 = 0;
        toolbar4.setTouchscreenBlocksFocus(false);
    }

    public static /* synthetic */ void doOnCreateView$default(AuraToolbarAgent auraToolbarAgent, Toolbar toolbar, Config config, int i, Object obj) {
        Config config2 = config;
        if ((i & 2) != 0) {
            config2 = new Config(true, NavIconType.Back.INSTANCE, null, false, null, false, C0881AGi.A00, false, null, null, false, null, false, null, true, null, false, false);
        }
        auraToolbarAgent.doOnCreateView(toolbar, config2);
    }

    private final void ensureToolbar() {
        Toolbar toolbar = this.toolbar;
        if (toolbar == null) {
            C7384Etj.A0b("toolbar");
            throw F60.createAndThrow();
        }
        if (toolbar.findViewById(this.toolbarId) == null) {
            Toolbar toolbar2 = this.toolbar;
            if (toolbar2 == null) {
                C7384Etj.A0b("toolbar");
                throw F60.createAndThrow();
            }
            toolbar2.addView(getToolbarView());
        }
    }

    private final View getToolbarView() {
        ComposeView composeViewAuraComposeView = ViewExtKt.auraComposeView(this.component.getContext(), Companion.getModeOverride(C8j4.A0m(this)), BDa.A00, null, B1U.A02(new C143091(), -933518915));
        composeViewAuraComposeView.setId(this.toolbarId);
        composeViewAuraComposeView.setLayoutParams(new C8318Fbk(-1));
        return composeViewAuraComposeView;
    }

    private final void onDefaultNavigationClicked() {
        this.component.getActivity().getOnBackPressedDispatcher().A01.A03();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateConfig$default(AuraToolbarAgent auraToolbarAgent, Boolean bool, NavIconType navIconType, Boolean bool2, Boolean bool3, Function0 function0, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            navIconType = null;
        }
        if ((i & 4) != 0) {
            bool2 = null;
        }
        if ((i & 8) != 0) {
            bool3 = null;
        }
        if ((i & 16) != 0) {
            function0 = null;
        }
        if ((i & 32) != 0) {
            list = null;
        }
        auraToolbarAgent.updateConfig(bool, navIconType, bool2, bool3, function0, list);
    }

    public final void doOnDestroyView() {
        AppCompatActivity activity = this.component.getActivity();
        AbstractC8276Fb0 supportActionBar = activity.getSupportActionBar();
        Toolbar toolbar = this.toolbar;
        if (toolbar == null) {
            C7384Etj.A0b("toolbar");
            throw F60.createAndThrow();
        }
        if (C7384Etj.areEqual(supportActionBar, toolbar)) {
            activity.setSupportActionBar(null);
        }
    }

    public final void setSubtitle(int i) {
        this.subtitleText.Af8(this.component.getContext().getResources().getString(i));
    }

    public final void setTitle(int i) {
        this.titleText.Af8(this.component.getContext().getResources().getString(i));
    }

    /* loaded from: classes.dex */
    public final class Companion {
        public final AuraThemeMode getModeOverride(Config config) {
            C7384Etj.A0Y(config, 0);
            if (!config.addGradient) {
                Boolean bool = config.lightTheme;
                if (bool == null) {
                    return AuraThemeMode.DEFAULT;
                }
                if (bool.booleanValue()) {
                    return AuraThemeMode.LIGHT;
                }
            }
            return AuraThemeMode.DARK;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNavigationClick() {
        if (C8j4.A0m(this).navigationOnClickListener == null) {
            onDefaultNavigationClicked();
            return;
        }
        Function0<Unit> function0 = C8j4.A0m(this).navigationOnClickListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void doOnCreateView(Toolbar toolbar, Config config) {
        AnonymousClass003.A0u(toolbar, config);
        this.toolbar = toolbar;
        this.config.Af8(config);
        applyConfig();
        this.component.setHasOptionsMenu(config.isOptionsEnabled);
    }

    public AuraToolbarAgent(final Fragment fragment) {
        C7384Etj.A0Y(fragment, 0);
        this.toolbarId = View.generateViewId();
        Config config = new Config(true, NavIconType.Back.INSTANCE, null, false, null, false, C0881AGi.A00, false, null, null, false, null, false, null, true, null, false, false);
        AGE age = AGE.A00;
        this.config = C3cG.A08(age, config);
        this.titleText = C3cG.A08(age, null);
        this.subtitleText = C3cG.A08(age, null);
        this.content = C3cG.A08(age, null);
        this.component = new AndroidComponent() { // from class: com.facebook.aura.vds.toolbar.AuraToolbarAgent.2
            @Override // com.facebook.aura.vds.toolbar.AuraToolbarAgent.AndroidComponent
            public AppCompatActivity getActivity() {
                FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
                C7384Etj.A0Z(fragmentActivityRequireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                return (AppCompatActivity) fragmentActivityRequireActivity;
            }

            @Override // com.facebook.aura.vds.toolbar.AuraToolbarAgent.AndroidComponent
            public Context getContext() {
                Context contextRequireContext = fragment.requireContext();
                C7384Etj.A0U(contextRequireContext);
                return contextRequireContext;
            }

            @Override // com.facebook.aura.vds.toolbar.AuraToolbarAgent.AndroidComponent
            public void setHasOptionsMenu(boolean z) {
                fragment.setHasOptionsMenu(z);
            }
        };
    }

    public final void setSubtitle(String str) {
        this.subtitleText.Af8(str);
    }

    public final void setTitle(String str) {
        this.titleText.Af8(str);
    }

    public final void updateConfig(Boolean bool, NavIconType navIconType, Boolean bool2, Boolean bool3, Function0<Unit> function0, List<EndButtonConfig> list) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        NavIconType navIconType2 = navIconType;
        Boolean bool4 = bool2;
        Function0<Unit> function02 = function0;
        List<EndButtonConfig> list2 = list;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = C8j4.A0m(this).shouldShowNavIcon;
        }
        if (navIconType == null) {
            navIconType2 = C8j4.A0m(this).navIconType;
        }
        if (bool2 == null) {
            bool4 = C8j4.A0m(this).lightTheme;
        }
        if (bool3 != null) {
            zBooleanValue2 = bool3.booleanValue();
        } else {
            zBooleanValue2 = C8j4.A0m(this).useTransparentBackground;
        }
        if (function0 == null) {
            function02 = C8j4.A0m(this).navigationOnClickListener;
        }
        if (list == null) {
            list2 = C8j4.A0m(this).endButtons;
        }
        updateConfig(new Config(zBooleanValue, navIconType2, bool4, zBooleanValue2, function02, false, list2, false, null, null, false, null, false, null, true, null, false, false));
    }
}
