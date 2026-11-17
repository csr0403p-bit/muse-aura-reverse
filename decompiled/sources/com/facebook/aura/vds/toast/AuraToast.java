package com.facebook.aura.vds.toast;

import X.AbstractC8508FfF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.B6A;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C8403FdK;
import X.CFK;
import X.Ey9;
import X.FGI;
import X.FVe;
import X.FW1;
import X.FW5;
import X.FW8;
import X.FWG;
import X.Hm3;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class AuraToast {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final int TAB_BAR_HEIGHT = 56;
    public static final String TAG = "AuraToast";
    public final Hm3 snackbar;

    /* loaded from: classes4.dex */
    public final class Companion {
        public final ViewGroup getSnackbarTargetParent(View view) {
            C7384Etj.A0Y(view, 0);
            ViewGroup viewGroup = null;
            while (!(view instanceof CoordinatorLayout)) {
                if (view instanceof FrameLayout) {
                    if (view.getId() == 16908290) {
                        break;
                    }
                    viewGroup = (ViewGroup) view;
                }
                Object parent = view.getParent();
                if (!(parent instanceof View) || (view = (View) parent) == null) {
                    return viewGroup;
                }
            }
            return (ViewGroup) view;
        }

        public final boolean verifyTargetParent(String str, View view) {
            boolean zA1a = AnonymousClass002.A1a(str, view);
            ViewGroup snackbarTargetParent = getSnackbarTargetParent(view);
            if (snackbarTargetParent == null) {
                CFK.A06(AuraToast.TAG, FGI.A0U("No suitable parent found for Toast '", str, "'"));
                return false;
            }
            if (!(snackbarTargetParent instanceof C8403FdK)) {
                return zA1a;
            }
            CFK.A07(AuraToast.TAG, FGI.A0M("Target parent is a FragmentContainerView for Toast ", str));
            return false;
        }

        /* loaded from: classes6.dex */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Duration.values().length];
                try {
                    AnonymousClass002.A13(Duration.SHORT, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(Duration.LONG, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(Duration.INDEFINITE, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    AnonymousClass002.A16(Duration.CUSTOMIZED, iArr);
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final AuraToast make(View view, ToastArgs toastArgs, Function0<Unit> function0) {
            AnonymousClass005.A0x(view, toastArgs, function0);
            return m3114makeKDArT4I(view, toastArgs.title, toastArgs.subtitle, toastArgs.duration, toastArgs.leadingIcon, toastArgs.type, toastArgs.onClickListener, toastArgs.dismissOnClick, toastArgs.forTestingOnlyUseLightMode, toastArgs.themeMode, toastArgs.customizedDuration, toastArgs.anchorView, toastArgs.dismissOnAnchorViewDetached, toastArgs.showOnTop, new AuraToast$Companion$make$1(function0, toastArgs), toastArgs.overrideElevation, toastArgs.bottomPadding, toastArgs.leadingIconSize, toastArgs.leadingIconTint);
        }

        private final float imeInsetBottomPx(View view) {
            if (AbstractC8508FfF.A00(view) == null) {
                return 0.0f;
            }
            return r0.A00.A04(8).A00;
        }

        private final int toSnackbarDuration(Duration duration, Integer num) {
            int iOrdinal = duration.ordinal();
            if (iOrdinal == 0) {
                return -1;
            }
            if (iOrdinal == 1) {
                return 0;
            }
            if (iOrdinal == 2) {
                return -2;
            }
            if (iOrdinal != 3) {
                throw C3cG.A0q();
            }
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
        /* renamed from: make-KDArT4I, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.facebook.aura.vds.toast.AuraToast m3114makeKDArT4I(android.view.View r18, java.lang.String r19, java.lang.String r20, com.facebook.aura.vds.toast.AuraToast.Duration r21, java.lang.Integer r22, com.facebook.aura.vds.compose.toast.AuraToastOption r23, android.view.View.OnClickListener r24, boolean r25, java.lang.Boolean r26, com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode r27, java.lang.Integer r28, final android.view.View r29, boolean r30, boolean r31, kotlin.jvm.functions.Function0<kotlin.Unit> r32, java.lang.Float r33, java.lang.Integer r34, com.facebook.aura.vds.compose.icons.AuraIconSize r35, X.B6A r36) {
            /*
                Method dump skipped, instructions count: 360
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.toast.AuraToast.Companion.m3114makeKDArT4I(android.view.View, java.lang.String, java.lang.String, com.facebook.aura.vds.toast.AuraToast$Duration, java.lang.Integer, com.facebook.aura.vds.compose.toast.AuraToastOption, android.view.View$OnClickListener, boolean, java.lang.Boolean, com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode, java.lang.Integer, android.view.View, boolean, boolean, kotlin.jvm.functions.Function0, java.lang.Float, java.lang.Integer, com.facebook.aura.vds.compose.icons.AuraIconSize, X.B6A):com.facebook.aura.vds.toast.AuraToast");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: make-KDArT4I$default, reason: not valid java name */
        public static /* synthetic */ AuraToast m3113makeKDArT4I$default(Companion companion, View view, String str, String str2, Duration duration, Integer num, AuraToastOption auraToastOption, View.OnClickListener onClickListener, boolean z, Boolean bool, AuraThemeMode auraThemeMode, Integer num2, View view2, boolean z2, boolean z3, Function0 function0, Float f, Integer num3, AuraIconSize auraIconSize, B6A b6a, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                duration = Duration.SHORT;
            }
            if ((i & 16) != 0) {
                num = null;
            }
            if ((i & 32) != 0) {
                auraToastOption = AuraToastOption.None.INSTANCE;
            }
            if ((i & 64) != 0) {
                onClickListener = null;
            }
            boolean zA1N = C3cH.A1N(i, z);
            if ((i & 256) != 0) {
                bool = null;
            }
            if ((i & 512) != 0) {
                auraThemeMode = AuraThemeMode.DEFAULT;
            }
            if ((i & 1024) != 0) {
                num2 = null;
            }
            if ((i & 2048) != 0) {
                view2 = null;
            }
            boolean zA1K = C3cG.A1K(i & 4096, z2);
            boolean zA1K2 = C3cG.A1K(i & 8192, z3);
            if ((i & 16384) != 0) {
                function0 = null;
            }
            if ((32768 & i) != 0) {
                f = null;
            }
            if ((65536 & i) != 0) {
                num3 = null;
            }
            if ((131072 & i) != 0) {
                auraIconSize = AuraIconSize.MEDIUM;
            }
            if ((i & 262144) != 0) {
                b6a = null;
            }
            return companion.m3114makeKDArT4I(view, str, str2, duration, num, auraToastOption, onClickListener, zA1N, bool, auraThemeMode, num2, view2, zA1K, zA1K2, function0, f, num3, auraIconSize, b6a);
        }

        public Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Duration {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Duration[] $VALUES;
        public static final Duration CUSTOMIZED;
        public static final Duration INDEFINITE;
        public static final Duration LONG;
        public static final Duration SHORT;

        static {
            Duration duration = new Duration("SHORT", 0);
            SHORT = duration;
            Duration duration2 = new Duration("LONG", 1);
            LONG = duration2;
            Duration duration3 = new Duration("INDEFINITE", 2);
            INDEFINITE = duration3;
            Duration duration4 = new Duration("CUSTOMIZED", 3);
            CUSTOMIZED = duration4;
            Duration[] durationArr = {duration, duration2, duration3, duration4};
            $VALUES = durationArr;
            $ENTRIES = C3cG.A0w(durationArr);
        }

        public static Ey9<Duration> getEntries() {
            return $ENTRIES;
        }

        public static Duration valueOf(String str) {
            return (Duration) Enum.valueOf(Duration.class, str);
        }

        public static Duration[] values() {
            return (Duration[]) $VALUES.clone();
        }

        public Duration(String str, int i) {
        }
    }

    /* loaded from: classes.dex */
    public final class ToastArgs extends C06G {
        public static final int $stable = 8;
        public final View anchorView;
        public final Integer bottomPadding;
        public final Integer customizedDuration;
        public final boolean dismissOnAnchorViewDetached;
        public final boolean dismissOnClick;
        public final Duration duration;
        public final Boolean forTestingOnlyUseLightMode;
        public final Integer leadingIcon;
        public final AuraIconSize leadingIconSize;
        public final B6A leadingIconTint;
        public final View.OnClickListener onClickListener;
        public final Function0<Unit> onDismiss;
        public final Float overrideElevation;
        public final boolean showOnTop;
        public final String subtitle;
        public final AuraThemeMode themeMode;
        public final String title;
        public final AuraToastOption type;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ToastArgs) {
                    ToastArgs toastArgs = (ToastArgs) obj;
                    if (!C7384Etj.areEqual(this.title, toastArgs.title) || !C7384Etj.areEqual(this.subtitle, toastArgs.subtitle) || this.duration != toastArgs.duration || !C7384Etj.areEqual(this.leadingIcon, toastArgs.leadingIcon) || !C7384Etj.areEqual(this.type, toastArgs.type) || !C7384Etj.areEqual(this.onClickListener, toastArgs.onClickListener) || this.dismissOnClick != toastArgs.dismissOnClick || !C7384Etj.areEqual(this.forTestingOnlyUseLightMode, toastArgs.forTestingOnlyUseLightMode) || this.themeMode != toastArgs.themeMode || !C7384Etj.areEqual(this.customizedDuration, toastArgs.customizedDuration) || !C7384Etj.areEqual(this.anchorView, toastArgs.anchorView) || this.dismissOnAnchorViewDetached != toastArgs.dismissOnAnchorViewDetached || this.showOnTop != toastArgs.showOnTop || !C7384Etj.areEqual(this.onDismiss, toastArgs.onDismiss) || !C7384Etj.areEqual(this.overrideElevation, toastArgs.overrideElevation) || !C7384Etj.areEqual(this.bottomPadding, toastArgs.bottomPadding) || this.leadingIconSize != toastArgs.leadingIconSize || !C7384Etj.areEqual(this.leadingIconTint, toastArgs.leadingIconTint)) {
                    }
                }
                return false;
            }
            return true;
        }

        public /* synthetic */ ToastArgs(String str, String str2, Duration duration, Integer num, AuraToastOption auraToastOption, View.OnClickListener onClickListener, boolean z, Boolean bool, AuraThemeMode auraThemeMode, Integer num2, View view, boolean z2, boolean z3, Function0 function0, Float f, Integer num3, AuraIconSize auraIconSize, B6A b6a, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? Duration.SHORT : duration, (i & 8) != 0 ? null : num, (i & 16) != 0 ? AuraToastOption.None.INSTANCE : auraToastOption, (i & 32) != 0 ? null : onClickListener, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? AuraThemeMode.DEFAULT : auraThemeMode, (i & 512) != 0 ? null : num2, (i & 1024) != 0 ? null : view, (i & 2048) != 0 ? false : z2, (i & 4096) != 0 ? false : z3, (i & 8192) != 0 ? null : function0, (i & 16384) != 0 ? null : f, (32768 & i) != 0 ? null : num3, (65536 & i) != 0 ? AuraIconSize.MEDIUM : auraIconSize, (i & 131072) != 0 ? null : b6a);
        }

        /* renamed from: copy-n6x4wmo$default, reason: not valid java name */
        public static /* synthetic */ ToastArgs m3115copyn6x4wmo$default(ToastArgs toastArgs, String str, String str2, Duration duration, Integer num, AuraToastOption auraToastOption, View.OnClickListener onClickListener, boolean z, Boolean bool, AuraThemeMode auraThemeMode, Integer num2, View view, boolean z2, boolean z3, Function0 function0, Float f, Integer num3, AuraIconSize auraIconSize, B6A b6a, int i, Object obj) {
            String str3 = str;
            String str4 = str2;
            Duration duration2 = duration;
            Integer num4 = num;
            AuraToastOption auraToastOption2 = auraToastOption;
            View.OnClickListener onClickListener2 = onClickListener;
            boolean z4 = z;
            Boolean bool2 = bool;
            AuraThemeMode auraThemeMode2 = auraThemeMode;
            Integer num5 = num2;
            View view2 = view;
            boolean z5 = z2;
            boolean z6 = z3;
            Function0 function02 = function0;
            Float f2 = f;
            Integer num6 = num3;
            AuraIconSize auraIconSize2 = auraIconSize;
            B6A b6a2 = b6a;
            if ((i & 1) != 0) {
                str3 = toastArgs.title;
            }
            if ((i & 2) != 0) {
                str4 = toastArgs.subtitle;
            }
            if ((i & 4) != 0) {
                duration2 = toastArgs.duration;
            }
            if ((i & 8) != 0) {
                num4 = toastArgs.leadingIcon;
            }
            if ((i & 16) != 0) {
                auraToastOption2 = toastArgs.type;
            }
            if ((i & 32) != 0) {
                onClickListener2 = toastArgs.onClickListener;
            }
            if ((i & 64) != 0) {
                z4 = toastArgs.dismissOnClick;
            }
            if ((i & 128) != 0) {
                bool2 = toastArgs.forTestingOnlyUseLightMode;
            }
            if ((i & 256) != 0) {
                auraThemeMode2 = toastArgs.themeMode;
            }
            if ((i & 512) != 0) {
                num5 = toastArgs.customizedDuration;
            }
            if ((i & 1024) != 0) {
                view2 = toastArgs.anchorView;
            }
            if ((i & 2048) != 0) {
                z5 = toastArgs.dismissOnAnchorViewDetached;
            }
            if ((i & 4096) != 0) {
                z6 = toastArgs.showOnTop;
            }
            if ((i & 8192) != 0) {
                function02 = toastArgs.onDismiss;
            }
            if ((i & 16384) != 0) {
                f2 = toastArgs.overrideElevation;
            }
            if ((i & 32768) != 0) {
                num6 = toastArgs.bottomPadding;
            }
            if ((i & 65536) != 0) {
                auraIconSize2 = toastArgs.leadingIconSize;
            }
            if ((i & 131072) != 0) {
                b6a2 = toastArgs.leadingIconTint;
            }
            View.OnClickListener onClickListener3 = onClickListener2;
            boolean z7 = z4;
            Boolean bool3 = bool2;
            return toastArgs.m3117copyn6x4wmo(str3, str4, duration2, num4, auraToastOption2, onClickListener3, z7, bool3, auraThemeMode2, num5, view2, z5, z6, function02, f2, num6, auraIconSize2, b6a2);
        }

        public final String component1() {
            return this.title;
        }

        public final Integer component10() {
            return this.customizedDuration;
        }

        public final View component11() {
            return this.anchorView;
        }

        public final boolean component12() {
            return this.dismissOnAnchorViewDetached;
        }

        public final boolean component13() {
            return this.showOnTop;
        }

        public final Function0<Unit> component14() {
            return this.onDismiss;
        }

        public final Float component15() {
            return this.overrideElevation;
        }

        public final Integer component16() {
            return this.bottomPadding;
        }

        public final AuraIconSize component17() {
            return this.leadingIconSize;
        }

        /* renamed from: component18-QN2ZGVo, reason: not valid java name */
        public final B6A m3116component18QN2ZGVo() {
            return this.leadingIconTint;
        }

        public final String component2() {
            return this.subtitle;
        }

        public final Duration component3() {
            return this.duration;
        }

        public final Integer component4() {
            return this.leadingIcon;
        }

        public final AuraToastOption component5() {
            return this.type;
        }

        public final View.OnClickListener component6() {
            return this.onClickListener;
        }

        public final boolean component7() {
            return this.dismissOnClick;
        }

        public final Boolean component8() {
            return this.forTestingOnlyUseLightMode;
        }

        public final AuraThemeMode component9() {
            return this.themeMode;
        }

        public final View getAnchorView() {
            return this.anchorView;
        }

        public final Integer getBottomPadding() {
            return this.bottomPadding;
        }

        public final Integer getCustomizedDuration() {
            return this.customizedDuration;
        }

        public final boolean getDismissOnAnchorViewDetached() {
            return this.dismissOnAnchorViewDetached;
        }

        public final boolean getDismissOnClick() {
            return this.dismissOnClick;
        }

        public final Duration getDuration() {
            return this.duration;
        }

        public final Boolean getForTestingOnlyUseLightMode() {
            return this.forTestingOnlyUseLightMode;
        }

        public final Integer getLeadingIcon() {
            return this.leadingIcon;
        }

        public final AuraIconSize getLeadingIconSize() {
            return this.leadingIconSize;
        }

        /* renamed from: getLeadingIconTint-QN2ZGVo, reason: not valid java name */
        public final B6A m3118getLeadingIconTintQN2ZGVo() {
            return this.leadingIconTint;
        }

        public final View.OnClickListener getOnClickListener() {
            return this.onClickListener;
        }

        public final Function0<Unit> getOnDismiss() {
            return this.onDismiss;
        }

        public final Float getOverrideElevation() {
            return this.overrideElevation;
        }

        public final boolean getShowOnTop() {
            return this.showOnTop;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final AuraThemeMode getThemeMode() {
            return this.themeMode;
        }

        public final String getTitle() {
            return this.title;
        }

        public final AuraToastOption getType() {
            return this.type;
        }

        public int hashCode() {
            int iA0F = AnonymousClass005.A0F(this.leadingIconSize, (((((C0KA.A01(C0KA.A01((((AnonymousClass005.A0F(this.themeMode, (C0KA.A01((AnonymousClass005.A0F(this.type, (AnonymousClass005.A0F(this.duration, (AnonymousClass001.A0G(this.title) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0D(this.leadingIcon)) * 31) + AnonymousClass006.A0D(this.onClickListener)) * 31, this.dismissOnClick) + AnonymousClass006.A0D(this.forTestingOnlyUseLightMode)) * 31) + AnonymousClass006.A0D(this.customizedDuration)) * 31) + AnonymousClass006.A0D(this.anchorView)) * 31, this.dismissOnAnchorViewDetached), this.showOnTop) + AnonymousClass006.A0D(this.onDismiss)) * 31) + AnonymousClass006.A0D(this.overrideElevation)) * 31) + AnonymousClass006.A0D(this.bottomPadding)) * 31);
            B6A b6a = this.leadingIconTint;
            return iA0F + (b6a != null ? AnonymousClass002.A0A(b6a.A00) : 0);
        }

        /* renamed from: copy-n6x4wmo, reason: not valid java name */
        public final ToastArgs m3117copyn6x4wmo(String str, String str2, Duration duration, Integer num, AuraToastOption auraToastOption, View.OnClickListener onClickListener, boolean z, Boolean bool, AuraThemeMode auraThemeMode, Integer num2, View view, boolean z2, boolean z3, Function0<Unit> function0, Float f, Integer num3, AuraIconSize auraIconSize, B6A b6a) {
            AnonymousClass003.A0v(str, duration);
            C7384Etj.A0Y(auraToastOption, 4);
            C7384Etj.A0Y(auraThemeMode, 8);
            C7384Etj.A0Y(auraIconSize, 16);
            return new ToastArgs(str, str2, duration, num, auraToastOption, onClickListener, z, bool, auraThemeMode, num2, view, z2, z3, function0, f, num3, auraIconSize, b6a);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ ToastArgs(String str, String str2, Duration duration, Integer num, AuraToastOption auraToastOption, View.OnClickListener onClickListener, boolean z, Boolean bool, AuraThemeMode auraThemeMode, Integer num2, View view, boolean z2, boolean z3, Function0 function0, Float f, Integer num3, AuraIconSize auraIconSize, B6A b6a, C06H c06h) {
            this(str, str2, duration, num, auraToastOption, onClickListener, z, bool, auraThemeMode, num2, view, z2, z3, function0, f, num3, auraIconSize, b6a);
        }

        public ToastArgs(String str, String str2, Duration duration, Integer num, AuraToastOption auraToastOption, View.OnClickListener onClickListener, boolean z, Boolean bool, AuraThemeMode auraThemeMode, Integer num2, View view, boolean z2, boolean z3, Function0<Unit> function0, Float f, Integer num3, AuraIconSize auraIconSize, B6A b6a) {
            AnonymousClass003.A0v(str, duration);
            C7384Etj.A0Y(auraToastOption, 4);
            C7384Etj.A0Y(auraThemeMode, 8);
            C7384Etj.A0Y(auraIconSize, 16);
            this.title = str;
            this.subtitle = str2;
            this.duration = duration;
            this.leadingIcon = num;
            this.type = auraToastOption;
            this.onClickListener = onClickListener;
            this.dismissOnClick = z;
            this.forTestingOnlyUseLightMode = bool;
            this.themeMode = auraThemeMode;
            this.customizedDuration = num2;
            this.anchorView = view;
            this.dismissOnAnchorViewDetached = z2;
            this.showOnTop = z3;
            this.onDismiss = function0;
            this.overrideElevation = f;
            this.bottomPadding = num3;
            this.leadingIconSize = auraIconSize;
            this.leadingIconTint = b6a;
        }
    }

    /* renamed from: com.facebook.aura.vds.toast.AuraToast$addOnDismissCallback$1, reason: invalid class name */
    public final class AnonymousClass1 extends FWG {
        public final /* synthetic */ Function0<Unit> $callback;

        public AnonymousClass1(Function0<Unit> function0) {
            this.$callback = function0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // X.FWG
        public void onDismissed(Hm3 hm3, int i) {
            this.$callback.invoke();
        }

        @Override // X.FWG, X.FWH
        public /* bridge */ /* synthetic */ void onDismissed(Hm3 hm3, int i) {
            this.$callback.invoke();
        }
    }

    public final void addOnDismissCallback(Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        Hm3 hm3 = this.snackbar;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(function0);
        List listA0h = hm3.A08;
        if (listA0h == null) {
            listA0h = C3cG.A0h();
            hm3.A08 = listA0h;
        }
        listA0h.add(anonymousClass1);
    }

    public final void dismiss() {
        this.snackbar.A04(3);
    }

    public final Hm3 getSnackbar() {
        return this.snackbar;
    }

    public final AuraToast setPadding(int i, int i2) {
        this.snackbar.A0E.setPadding(i, i2, i, i2);
        return this;
    }

    public final AuraToast setTranslationY(float f) {
        this.snackbar.A0E.setTranslationY(f);
        return this;
    }

    public final AuraToast setTranslationZ(float f) {
        this.snackbar.A0E.setTranslationZ(f);
        return this;
    }

    public final void show() {
        Hm3 hm3 = this.snackbar;
        FW5 fw5A00 = FW5.A00();
        int i = ((FW1) hm3).A00;
        int recommendedTimeoutMillis = i != -2 ? hm3.A00.getRecommendedTimeoutMillis(i, 3) : -2;
        FVe fVe = hm3.A07;
        synchronized (fw5A00.A03) {
            if (FW5.A03(fVe, fw5A00)) {
                FW8 fw8 = fw5A00.A00;
                fw8.A00 = recommendedTimeoutMillis;
                fw5A00.A02.removeCallbacksAndMessages(fw8);
                FW5.A01(fw5A00.A00, fw5A00);
            } else {
                FW8 fw82 = fw5A00.A01;
                if (fw82 == null || fVe == null || fw82.A02.get() != fVe) {
                    fw5A00.A01 = new FW8(fVe, recommendedTimeoutMillis);
                } else {
                    fw82.A00 = recommendedTimeoutMillis;
                }
                FW8 fw83 = fw5A00.A00;
                if (fw83 == null || !FW5.A04(fw83, fw5A00, 4)) {
                    fw5A00.A00 = null;
                    FW5.A02(fw5A00);
                }
            }
        }
    }

    public AuraToast(Hm3 hm3) {
        this.snackbar = hm3;
    }

    public static /* synthetic */ AuraToast setPadding$default(AuraToast auraToast, int i, int i2, int i3, Object obj) {
        int iA00 = C3cI.A00(i3, i);
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        auraToast.setPadding(iA00, i2);
        return auraToast;
    }

    public /* synthetic */ AuraToast(Hm3 hm3, C06H c06h) {
        this(hm3);
    }
}
