package com.facebook.aura.widgets;

import X.AbstractC059772w;
import X.AbstractC060773g;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AnonymousClass722;
import X.AnonymousClass763;
import X.B1V;
import X.B6A;
import X.BBb;
import X.BFM;
import X.C058571g;
import X.C059372q;
import X.C059672t;
import X.C062875i;
import X.C60Q;
import X.C60R;
import X.C71J;
import X.C71L;
import X.C72F;
import X.C72G;
import X.C72N;
import X.C72R;
import X.C72S;
import X.C72T;
import X.C72V;
import X.C72Y;
import X.C72Z;
import X.C72d;
import X.C72e;
import X.C72k;
import X.C7384Etj;
import X.C73O;
import X.C75U;
import X.C75V;
import X.C75X;
import X.C76B;
import X.C76C;
import X.C76X;
import X.G0V;
import X.G0W;
import X.HDi;
import X.HxS;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.format.DateUtils;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchWidgetKind;
import com.facebook.aura.analytics.hatch.HatchWidgetTelemetry;
import com.facebook.aura.common.url.HatchUrl;
import com.facebook.aura.conversation.api.ComposerLaunchAction;
import com.facebook.aura.main.api.AuraWidgetLaunch;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class WidgetComponentsKt {
    public static final String AURA_DEEPLINK_HANDLER_ACTIVITY_CLASS = "com.facebook.aura.main.AuraDeeplinkHandlerActivity";
    public static final String CHAT_DEEPLINK_PATH = "chat";
    public static final float HEADER_RESERVED_WIDTH = 76.0f;
    public static final String NEW_THREAD_PATH = "new";
    public static final String START_PATH = "start";
    public static final String THREAD_DEEPLINK_HOST = "thread";
    public static final String VOICE_DEEPLINK_HOST = "voice";
    public static final C76X widgetBackgroundColor;
    public static final C76X widgetButtonColor;
    public static final C76X widgetElevatedColor;
    public static final C76X widgetPrimaryIconColor;
    public static final C76X widgetPrimaryTextColor;
    public static final C76X widgetScrimColor;
    public static final C76X widgetSecondaryTextColor;

    /* renamed from: com.facebook.aura.widgets.WidgetComponentsKt$WidgetHeader$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C72d, BFM, Integer, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ boolean $isRefreshing;
        public final /* synthetic */ C71J $onRefresh;
        public final /* synthetic */ C71J $onTitleClick;
        public final /* synthetic */ String $title;
        public final /* synthetic */ Long $updatedAtMs;

        public final void invoke(C72d c72d, BFM bfm, int i) {
            String strA0t;
            C76B c76bA00;
            C7384Etj.A0Y(c72d, 0);
            int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(c72d, bfm, i) ? 1 : 0) | i : i;
            if (!AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
                bfm.Afo();
                return;
            }
            String str = this.$title;
            Long l = this.$updatedAtMs;
            if (l == null) {
                AnonymousClass003.A0l(bfm, -1197951891);
                strA0t = null;
            } else {
                bfm.AgE(-1197951890);
                strA0t = AnonymousClass001.A0t(bfm, WidgetComponentsKt.formatUpdatedAt(this.$context, l.longValue()), R.string._name_removed__res_0x7f12117d);
                AnonymousClass001.A1D(bfm);
            }
            C76C c76c = C76B.A00;
            C062875i c062875i = new C062875i(C72T.A00);
            C71J c71j = this.$onTitleClick;
            if (c71j == null || (c76bA00 = C75V.A00(c76c, c71j)) == null) {
                c76bA00 = c76c;
            }
            WidgetComponentsKt.WidgetHeaderText(str, strA0t, c062875i.Agp(c76bA00), bfm, 0, 0);
            C72N.A00(bfm, c76c, 12.0f);
            WidgetComponentsKt.WidgetRefreshButton(this.$isRefreshing, this.$onRefresh, null, bfm, 0, 4);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Long l, C71J c71j, boolean z, C71J c71j2, Context context) {
            super(3);
            this.$title = str;
            this.$updatedAtMs = l;
            this.$onTitleClick = c71j;
            this.$isRefreshing = z;
            this.$onRefresh = c71j2;
            this.$context = context;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C72d c72d, BFM bfm, Integer num) {
            invoke(c72d, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.WidgetComponentsKt$WidgetHeader$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isRefreshing;
        public final /* synthetic */ C76B $modifier;
        public final /* synthetic */ C71J $onRefresh;
        public final /* synthetic */ C71J $onTitleClick;
        public final /* synthetic */ String $title;
        public final /* synthetic */ Long $updatedAtMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Long l, boolean z, C71J c71j, C76B c76b, C71J c71j2, int i, int i2) {
            super(2);
            this.$title = str;
            this.$updatedAtMs = l;
            this.$isRefreshing = z;
            this.$onRefresh = c71j;
            this.$modifier = c76b;
            this.$onTitleClick = c71j2;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            WidgetComponentsKt.WidgetHeader(this.$title, this.$updatedAtMs, this.$isRefreshing, this.$onRefresh, this.$modifier, this.$onTitleClick, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.WidgetComponentsKt$WidgetHeaderText$1, reason: invalid class name and case insensitive filesystem */
    public final class C144201 extends AbstractC7559F3s implements G0W<C71L, BFM, Integer, Unit> {
        public final /* synthetic */ float $maxWidth;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        public final void invoke(C71L c71l, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass005.A1N(i, c71l), bfm, i)) {
                bfm.Afo();
                return;
            }
            WidgetTextKt.m3163WidgetTextb7W0Lw(this.$title, WidgetTextStyle.TITLE, WidgetComponentsKt.widgetPrimaryTextColor, this.$maxWidth, null, 0, false, bfm, 48, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            if (this.$subtitle != null) {
                bfm.AgE(1136732794);
                WidgetTextKt.m3163WidgetTextb7W0Lw(this.$subtitle, WidgetTextStyle.SUBTITLE, WidgetComponentsKt.widgetSecondaryTextColor, this.$maxWidth, AbstractC059772w.A03(C76B.A00, 0.0f, 4.0f, 0.0f, 0.0f), 0, false, bfm, 48, 96);
            } else {
                bfm.AgE(1136959590);
            }
            AnonymousClass001.A1D(bfm);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144201(String str, float f, String str2) {
            super(3);
            this.$title = str;
            this.$maxWidth = f;
            this.$subtitle = str2;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C71L c71l, BFM bfm, Integer num) {
            invoke(c71l, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.WidgetComponentsKt$WidgetHeaderText$2, reason: invalid class name and case insensitive filesystem */
    public final class C144212 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C76B $modifier;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144212(String str, String str2, C76B c76b, int i, int i2) {
            super(2);
            this.$title = str;
            this.$subtitle = str2;
            this.$modifier = c76b;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            WidgetComponentsKt.WidgetHeaderText(this.$title, this.$subtitle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.WidgetComponentsKt$WidgetMessage$2, reason: invalid class name and case insensitive filesystem */
    public final class C144222 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144222(String str) {
            super(2);
            this.$text = str;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                WidgetTextKt.m3163WidgetTextb7W0Lw(this.$text, WidgetTextStyle.SUBTITLE, WidgetComponentsKt.widgetSecondaryTextColor, AnonymousClass003.A03(C73O.A00(bfm)) - 32.0f, null, 4, true, bfm, 1769520, 16);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.WidgetComponentsKt$WidgetMessage$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C76B $modifier;
        public final /* synthetic */ C71J $onClick;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, C76B c76b, C71J c71j, int i, int i2) {
            super(2);
            this.$text = str;
            this.$modifier = c76b;
            this.$onClick = c71j;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            WidgetComponentsKt.WidgetMessage(this.$text, this.$modifier, this.$onClick, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.WidgetComponentsKt$WidgetRefreshButton$2, reason: invalid class name and case insensitive filesystem */
    public final class C144232 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isRefreshing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144232(boolean z) {
            super(2);
            this.$isRefreshing = z;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                bfm.Afo();
                return;
            }
            if (this.$isRefreshing) {
                bfm.AgE(-944183896);
                C72k.A00(bfm, AnonymousClass722.A01(C76B.A00, 18.0f), WidgetComponentsKt.widgetSecondaryTextColor, 0, 0);
            } else {
                bfm.AgE(-944025641);
                AbstractC060773g.A01(bfm, new C72S(new C72V(WidgetComponentsKt.widgetPrimaryIconColor)), AnonymousClass722.A01(C76B.A00, 20.0f), new C058571g(R.drawable.arrowsrefresh_outline_24_wght400), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12117b), 0, 32768, 8);
            }
            AnonymousClass001.A1D(bfm);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.WidgetComponentsKt$WidgetRefreshButton$3, reason: invalid class name and case insensitive filesystem */
    public final class C144243 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isRefreshing;
        public final /* synthetic */ C76B $modifier;
        public final /* synthetic */ C71J $onRefresh;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144243(boolean z, C71J c71j, C76B c76b, int i, int i2) {
            super(2);
            this.$isRefreshing = z;
            this.$onRefresh = c71j;
            this.$modifier = c76b;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            WidgetComponentsKt.WidgetRefreshButton(this.$isRefreshing, this.$onRefresh, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.WidgetComponentsKt$WidgetRefreshingOverlay$1, reason: invalid class name and case insensitive filesystem */
    public final class C144251 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C76B $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144251(C76B c76b, int i, int i2) {
            super(2);
            this.$modifier = c76b;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            WidgetComponentsKt.WidgetRefreshingOverlay(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void WidgetHeaderText(String str, String str2, C76B c76b, BFM bfm, int i, int i2) {
        C76B c76b2 = c76b;
        bfm.AgG(418673574);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c76b);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                c76b2 = C76B.A00;
            }
            C72Y.A00(bfm, c76b2, B1V.A00(bfm, new C144201(str, AnonymousClass003.A03(C73O.A00(bfm)) - HEADER_RESERVED_WIDTH, str2), 1363453468), 0, 0, ((iA0d >> 6) & 14) | 3072, 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C144212(str, str2, c76b2, i, i2);
        }
    }

    public static final void WidgetMessage(String str, C76B c76b, C71J c71j, BFM bfm, int i, int i2) {
        C76B c76bA00;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-469962962);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, c76b);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass003.A05(AnonymousClass004.A1Z(c71j, bfm, i) ? 1 : 0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                c76b = C76B.A00;
            }
            if (i4 != 0) {
                c71j = null;
            }
            C76B c76bA01 = AbstractC059772w.A01(c76b, 16.0f);
            if (c71j == null || (c76bA00 = C75V.A00(C76B.A00, c71j)) == null) {
                c76bA00 = C76B.A00;
            }
            C72G.A00(bfm, c76bA01.Agp(c76bA00), C059672t.A02, B1V.A00(bfm, new C144222(str), 1522971024), 384, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, c76b, c71j, i, i2);
        }
    }

    public static final Uri.Builder auraUri(String... strArr) {
        C7384Etj.A0Y(strArr, 0);
        Uri.Builder builderAuthority = new Uri.Builder().scheme("https").authority(HatchUrl.DOMAIN);
        for (String str : strArr) {
            builderAuthority.appendPath(str);
        }
        C7384Etj.A0U(builderAuthority);
        return builderAuthority;
    }

    public static final C71J openAppAction(Context context) {
        C7384Etj.A0Y(context, 0);
        Intent intentA08 = C60R.A08(context);
        if (intentA08 != null) {
            return AnonymousClass763.A00(intentA08);
        }
        return null;
    }

    public static final C76B widgetContainer(C76B c76b) {
        C7384Etj.A0Y(c76b, 0);
        return AnonymousClass722.A00(c76b).Agp(new C75U(new C72R(20.0f))).Agp(new C75X(widgetBackgroundColor));
    }

    static {
        AuraColors auraColors = AuraColorsKt.auraColorsLight;
        long j = auraColors.card;
        AuraColors auraColors2 = AuraColorsKt.auraColorsDark;
        long j2 = auraColors2.card;
        widgetBackgroundColor = new C059372q(j, j2);
        widgetElevatedColor = new C059372q(auraColors.elevated, auraColors2.elevated);
        widgetPrimaryTextColor = new C059372q(auraColors.primaryText, auraColors2.primaryText);
        widgetSecondaryTextColor = new C059372q(auraColors.secondaryText, auraColors2.secondaryText);
        widgetPrimaryIconColor = new C059372q(auraColors.primaryIcon.enabled, auraColors2.primaryIcon.enabled);
        widgetScrimColor = new C059372q(HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.85f), HxS.A04(HDi.A0O[(int) (j2 & 63)], B6A.A03(j2), B6A.A02(j2), B6A.A01(j2), 0.85f));
        widgetButtonColor = new C059372q(auraColors.secondaryButtonBackground, auraColors2.secondaryButtonBackground);
    }

    public static final void WidgetHeader(String str, Long l, boolean z, C71J c71j, C76B c76b, C71J c71j2, BFM bfm, int i, int i2) {
        C71J c71j3 = c71j2;
        C76B c76b2 = c76b;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(583808354);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, l);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass002.A00(AnonymousClass004.A1a(c71j, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, c76b2);
        }
        int i4 = i2 & 32;
        int iA02 = 196608;
        if (i4 != 0) {
            iA0d |= iA02;
        } else if ((196608 & i) == 0) {
            iA02 = AnonymousClass002.A02(AnonymousClass004.A1R(bfm, c71j3, 262144, i) ? 1 : 0);
            iA0d |= iA02;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                c76b2 = C76B.A00;
            }
            if (i4 != 0) {
                c71j3 = null;
            }
            C72Z.A00(bfm, AbstractC059772w.A03(C72e.A00(c76b2), 16.0f, 12.0f, 12.0f, 12.0f), B1V.A00(bfm, new AnonymousClass1(str, l, c71j3, z, c71j, C60Q.A08(bfm)), 1766906822), 0, 1, 3072, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, l, z, c71j, c76b2, c71j3, i, i2);
        }
    }

    public static final C76X getWidgetBackgroundColor() {
        return widgetBackgroundColor;
    }

    public static final C76X getWidgetButtonColor() {
        return widgetButtonColor;
    }

    public static final C76X getWidgetElevatedColor() {
        return widgetElevatedColor;
    }

    public static final C76X getWidgetPrimaryIconColor() {
        return widgetPrimaryIconColor;
    }

    public static final C76X getWidgetPrimaryTextColor() {
        return widgetPrimaryTextColor;
    }

    public static final C76X getWidgetSecondaryTextColor() {
        return widgetSecondaryTextColor;
    }

    public static final Intent widgetLaunchIntent(Context context, Uri uri) {
        return auraActivityIntent(context, uri, AuraWidgetLaunch.ACTIVITY_CLASS);
    }

    public static final void WidgetRefreshButton(boolean z, C71J c71j, C76B c76b, BFM bfm, int i, int i2) {
        C76B c76bA00;
        bfm.AgG(216710639);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass002.A06(AnonymousClass004.A1Y(c71j, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, c76b);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0n), bfm, iA0n)) {
            if (i3 != 0) {
                c76b = C76B.A00;
            }
            C71J c71j2 = null;
            if (c71j != null && !z) {
                c71j2 = c71j;
            }
            C76B c76bA002 = C72F.A00(AnonymousClass722.A01(c76b, 36.0f), 18.0f);
            if (c71j2 == null || (c76bA00 = C75V.A00(C76B.A00, c71j2)) == null) {
                c76bA00 = C76B.A00;
            }
            C72G.A00(bfm, c76bA002.Agp(c76bA00), C059672t.A02, B1V.A00(bfm, new C144232(z), 2050353485), 384, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C144243(z, c71j, c76b, i, i2);
        }
    }

    public static final void WidgetRefreshingOverlay(C76B c76b, BFM bfm, int i, int i2) {
        bfm.AgG(-611348805);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c76b) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                c76b = C76B.A00;
            }
            C72Y.A00(bfm, AnonymousClass722.A00(c76b).Agp(new C75X(widgetScrimColor)), ComposableSingletons$WidgetComponentsKt.f314lambda$891054843, 1, 1, 3072, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C144251(c76b, i, i2);
        }
    }

    public static final Intent auraActivityIntent(Context context, Uri uri, String str) {
        Intent intentAddFlags = C60Q.A09(uri).setComponent(new ComponentName(context.getPackageName(), str)).addFlags(872415232);
        C7384Etj.A0U(intentAddFlags);
        return intentAddFlags;
    }

    public static final C71J auraDeeplinkAction(Context context, Uri uri, HatchWidgetKind hatchWidgetKind) {
        AnonymousClass005.A0x(context, uri, hatchWidgetKind);
        return AnonymousClass763.A00(auraActivityIntent(context, HatchWidgetTelemetry.INSTANCE.attribute(uri, hatchWidgetKind), "com.facebook.aura.main.AuraDeeplinkHandlerActivity"));
    }

    public static final C71J composerLaunchAction(Context context, ComposerLaunchAction composerLaunchAction, HatchWidgetKind hatchWidgetKind) {
        AnonymousClass005.A0x(context, composerLaunchAction, hatchWidgetKind);
        Intent intentAuraActivityIntent = auraActivityIntent(context, HatchWidgetTelemetry.INSTANCE.attribute(C60R.A0D("chat"), hatchWidgetKind), AuraWidgetLaunch.ACTIVITY_CLASS);
        String strName = composerLaunchAction.name();
        Intent identifier = intentAuraActivityIntent.putExtra(ComposerLaunchAction.EXTRA, strName).setIdentifier(strName);
        C7384Etj.A0U(identifier);
        return AnonymousClass763.A00(identifier);
    }

    public static final String formatUpdatedAt(Context context, long j) {
        String dateTime = DateUtils.formatDateTime(context, j, DateUtils.isToday(j) ? 1 : 65553);
        C7384Etj.A0U(dateTime);
        return dateTime;
    }

    public static final C71J newSideChatAction(Context context, HatchWidgetKind hatchWidgetKind) {
        AnonymousClass003.A0u(context, hatchWidgetKind);
        HatchWidgetTelemetry hatchWidgetTelemetry = HatchWidgetTelemetry.INSTANCE;
        Uri uriBuild = new Uri.Builder().scheme("hatch").authority("thread").appendPath("new").build();
        C7384Etj.A0U(uriBuild);
        return AnonymousClass763.A00(auraActivityIntent(context, hatchWidgetTelemetry.attribute(uriBuild, hatchWidgetKind), AuraWidgetLaunch.ACTIVITY_CLASS));
    }

    public static final C71J voiceCallAction(Context context, HatchWidgetKind hatchWidgetKind) {
        AnonymousClass003.A0u(context, hatchWidgetKind);
        HatchWidgetTelemetry hatchWidgetTelemetry = HatchWidgetTelemetry.INSTANCE;
        Uri uriBuild = new Uri.Builder().scheme("hatch").authority("voice").appendPath(START_PATH).build();
        C7384Etj.A0U(uriBuild);
        return AnonymousClass763.A00(auraActivityIntent(context, hatchWidgetTelemetry.attribute(uriBuild, hatchWidgetKind), AuraWidgetLaunch.ACTIVITY_CLASS));
    }
}
