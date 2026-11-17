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
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.C058571g;
import X.C059672t;
import X.C062775h;
import X.C062875i;
import X.C1DG;
import X.C3cG;
import X.C60Q;
import X.C6JZ;
import X.C71G;
import X.C71J;
import X.C71K;
import X.C71L;
import X.C72F;
import X.C72G;
import X.C72N;
import X.C72R;
import X.C72S;
import X.C72T;
import X.C72U;
import X.C72V;
import X.C72Y;
import X.C72Z;
import X.C72d;
import X.C72e;
import X.C7384Etj;
import X.C73O;
import X.C75U;
import X.C75V;
import X.C75X;
import X.C76B;
import X.C76C;
import X.C78N;
import X.C7BY;
import X.C7VW;
import X.G0U;
import X.G0V;
import X.G0W;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.datastore.preferences.core.Preferences;
import com.facebook.aura.R;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.conversation.api.ComposerLaunchAction;
import com.facebook.aura.identity.provider.HatchIconKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.tabs.AuraFixedNavBarKt;
import com.facebook.aura.tabs.FixedTab;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class AskBarWidgetKt {
    public static final List<FixedTab> ASK_BAR_PREVIEW_TABS;
    public static final int ASK_BAR_TAB_CAPACITY = 5;
    public static final float ASK_BAR_CONTROL_SIZE = 44.0f;
    public static final float ASK_BAR_ICON_SIZE = 24.0f;
    public static final float ASK_BAR_SPACING = 12.0f;
    public static final float ASK_BAR_HORIZONTAL_PADDING = 20.0f;
    public static final float ASK_BAR_TOP_PADDING = 18.0f;
    public static final float ASK_BAR_BOTTOM_PADDING = 17.0f;
    public static final float ASK_BAR_TAB_BAR_HEIGHT = 61.0f;
    public static final float ASK_BAR_HEIGHT_WITH_TABS = 161.0f;
    public static final float ASK_BAR_MIN_HEIGHT_WITH_TABS = 140.0f;
    public static final float ASK_BAR_MIN_NAME_WIDTH = 48.0f;

    /* renamed from: com.facebook.aura.widgets.AskBarWidgetKt$AskBarCircleButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ int $iconRes;
        public final /* synthetic */ C76B $modifier;
        public final /* synthetic */ C71J $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, String str, C71J c71j, C76B c76b, int i2, int i3) {
            super(2);
            this.$iconRes = i;
            this.$contentDescription = str;
            this.$onClick = c71j;
            this.$modifier = c76b;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            AskBarWidgetKt.AskBarCircleButton(this.$iconRes, this.$contentDescription, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.AskBarWidgetKt$AskBarContent$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C76B $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C76B c76b, int i, int i2) {
            super(2);
            this.$modifier = c76b;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AskBarWidgetKt.AskBarContent(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.AskBarWidgetKt$AskBarContent$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C76B $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(C76B c76b, int i, int i2) {
            super(2);
            this.$modifier = c76b;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AskBarWidgetKt.AskBarContent(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.AskBarWidgetKt$AskBarHeader$1, reason: invalid class name and case insensitive filesystem */
    public final class C143731 extends AbstractC7559F3s implements G0W<C72d, BFM, Integer, Unit> {
        public final /* synthetic */ C71K $avatar;
        public final /* synthetic */ int $buttonCount;
        public final /* synthetic */ String $name;
        public final /* synthetic */ C71J $onDictate;
        public final /* synthetic */ C71J $onNewSideChat;
        public final /* synthetic */ C71J $onVoiceCall;
        public final /* synthetic */ long $size;

        public final void invoke(C72d c72d, BFM bfm, int i) {
            C7384Etj.A0Y(c72d, 0);
            int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(c72d, bfm, i) ? 1 : 0) | i : i;
            if (!AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
                bfm.Afo();
                return;
            }
            String str = this.$name;
            C71K c71k = this.$avatar;
            float fA03 = AnonymousClass003.A03(this.$size) - (AskBarWidgetKt.ASK_BAR_HORIZONTAL_PADDING * 2.0f);
            float f = AskBarWidgetKt.ASK_BAR_CONTROL_SIZE;
            float f2 = this.$buttonCount + 1;
            float f3 = AskBarWidgetKt.ASK_BAR_SPACING;
            float f4 = (fA03 - (f * f2)) - (f2 * f3);
            C76C c76c = C76B.A00;
            AskBarWidgetKt.m3156AskBarAgent942rkJo(str, c71k, f4, new C062875i(C72T.A00), bfm, 0, 0);
            if (this.$onVoiceCall != null) {
                bfm.AgE(1072661321);
                AskBarWidgetKt.AskBarCircleButton(R.drawable.phone_handset_wght400_outline_24, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12016f), this.$onVoiceCall, null, bfm, 0, 8);
                C72N.A00(bfm, c76c, f3);
            } else {
                bfm.AgE(1072939050);
            }
            AnonymousClass001.A1D(bfm);
            AskBarWidgetKt.AskBarCircleButton(R.drawable.microphone_wght400_outline_24, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12016a), this.$onDictate, null, bfm, 0, 8);
            C72N.A00(bfm, c76c, f3);
            AskBarWidgetKt.AskBarCircleButton(R.drawable.compose_wght400_outline_24, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12016c), this.$onNewSideChat, null, bfm, 0, 8);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143731(String str, C71K c71k, long j, int i, C71J c71j, C71J c71j2, C71J c71j3) {
            super(3);
            this.$name = str;
            this.$avatar = c71k;
            this.$size = j;
            this.$buttonCount = i;
            this.$onVoiceCall = c71j;
            this.$onDictate = c71j2;
            this.$onNewSideChat = c71j3;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C72d c72d, BFM bfm, Integer num) {
            invoke(c72d, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.AskBarWidgetKt$AskBarHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C143742 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C71K $avatar;
        public final /* synthetic */ C76B $modifier;
        public final /* synthetic */ String $name;
        public final /* synthetic */ C71J $onDictate;
        public final /* synthetic */ C71J $onNewSideChat;
        public final /* synthetic */ C71J $onVoiceCall;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143742(String str, C71K c71k, C71J c71j, C71J c71j2, C71J c71j3, C76B c76b, int i, int i2) {
            super(2);
            this.$name = str;
            this.$avatar = c71k;
            this.$onVoiceCall = c71j;
            this.$onDictate = c71j2;
            this.$onNewSideChat = c71j3;
            this.$modifier = c76b;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AskBarWidgetKt.AskBarHeader(this.$name, this.$avatar, this.$onVoiceCall, this.$onDictate, this.$onNewSideChat, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.AskBarWidgetKt$AskBarPanel$1, reason: invalid class name and case insensitive filesystem */
    public final class C143751 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ C71K $avatar;
        public final /* synthetic */ float $height;
        public final /* synthetic */ String $name;
        public final /* synthetic */ C71J $onDictate;
        public final /* synthetic */ C71J $onNewSideChat;
        public final /* synthetic */ C71J $onOpenChat;
        public final /* synthetic */ C71J $onVoiceCall;
        public final /* synthetic */ boolean $showsTabs;
        public final /* synthetic */ G0U<FixedTab, C71J> $tabAction;
        public final /* synthetic */ List<FixedTab> $tabs;

        /* renamed from: com.facebook.aura.widgets.AskBarWidgetKt$AskBarPanel$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C71L, BFM, Integer, Unit> {
            public final /* synthetic */ C71K $avatar;
            public final /* synthetic */ String $name;
            public final /* synthetic */ C71J $onDictate;
            public final /* synthetic */ C71J $onNewSideChat;
            public final /* synthetic */ C71J $onVoiceCall;
            public final /* synthetic */ boolean $showsTabs;
            public final /* synthetic */ G0U<FixedTab, C71J> $tabAction;
            public final /* synthetic */ List<FixedTab> $tabs;

            public final void invoke(C71L c71l, BFM bfm, int i) {
                C7384Etj.A0Y(c71l, 0);
                int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(c71l, bfm, i) ? 1 : 0) | i : i;
                if (!AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
                    bfm.Afo();
                    return;
                }
                AskBarWidgetKt.AskBarHeader(this.$name, this.$avatar, this.$onVoiceCall, this.$onDictate, this.$onNewSideChat, null, bfm, 0, 32);
                if (this.$showsTabs) {
                    bfm.AgE(-1380756938);
                    C72N.A01(new C062775h(C72T.A00), bfm, 0, 0);
                    AskBarWidgetKt.AskBarTabRow(this.$tabs, this.$tabAction, null, bfm, 0, 4);
                } else {
                    bfm.AgE(-1380637774);
                }
                AnonymousClass001.A1D(bfm);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(String str, C71K c71k, C71J c71j, C71J c71j2, C71J c71j3, boolean z, List<? extends FixedTab> list, G0U<? super FixedTab, ? extends C71J> g0u) {
                super(3);
                this.$name = str;
                this.$avatar = c71k;
                this.$onVoiceCall = c71j;
                this.$onDictate = c71j2;
                this.$onNewSideChat = c71j3;
                this.$showsTabs = z;
                this.$tabs = list;
                this.$tabAction = g0u;
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Unit invoke(C71L c71l, BFM bfm, Integer num) {
                invoke(c71l, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C143751(boolean z, float f, C71J c71j, String str, C71K c71k, C71J c71j2, C71J c71j3, C71J c71j4, List<? extends FixedTab> list, G0U<? super FixedTab, ? extends C71J> g0u) {
            super(2);
            this.$showsTabs = z;
            this.$height = f;
            this.$onOpenChat = c71j;
            this.$name = str;
            this.$avatar = c71k;
            this.$onVoiceCall = c71j2;
            this.$onDictate = c71j3;
            this.$onNewSideChat = c71j4;
            this.$tabs = list;
            this.$tabAction = g0u;
        }

        public final void invoke(BFM bfm, int i) {
            float f;
            float f2;
            C76B c76bA00;
            if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            C76C c76c = C76B.A00;
            C76B c76bA002 = C72e.A00(c76c);
            boolean z = this.$showsTabs;
            float f3 = this.$height;
            if (z) {
                C1DG c1dg = new C1DG(f3);
                C1DG c1dg2 = new C1DG(AskBarWidgetKt.ASK_BAR_HEIGHT_WITH_TABS);
                if (c1dg.compareTo(c1dg2) <= 0) {
                    c1dg2 = c1dg;
                }
                f3 = c1dg2.A00;
            }
            C76B c76bAgp = c76bA002.Agp(new C062775h(new C72R(f3))).Agp(new C75U(new C72R(20.0f))).Agp(new C75X(WidgetComponentsKt.widgetBackgroundColor));
            float f4 = AskBarWidgetKt.ASK_BAR_HORIZONTAL_PADDING;
            if (z) {
                f = AskBarWidgetKt.ASK_BAR_TOP_PADDING;
                f2 = AskBarWidgetKt.ASK_BAR_BOTTOM_PADDING;
            } else {
                f = 0.0f;
                f2 = 0.0f;
            }
            C76B c76bA03 = AbstractC059772w.A03(c76bAgp, f4, f, f4, f2);
            C71J c71j = this.$onOpenChat;
            if (c71j == null || (c76bA00 = C75V.A00(c76c, c71j)) == null) {
                c76bA00 = c76c;
            }
            C72Y.A00(bfm, c76bA03.Agp(c76bA00), B1V.A00(bfm, new AnonymousClass2(this.$name, this.$avatar, this.$onVoiceCall, this.$onDictate, this.$onNewSideChat, z, this.$tabs, this.$tabAction), -1248702384), z ? 0 : 1, 0, 3072, 4);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.AskBarWidgetKt$AskBarPanel$2, reason: invalid class name and case insensitive filesystem */
    public final class C143762 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C71K $avatar;
        public final /* synthetic */ C76B $modifier;
        public final /* synthetic */ String $name;
        public final /* synthetic */ C71J $onDictate;
        public final /* synthetic */ C71J $onNewSideChat;
        public final /* synthetic */ C71J $onOpenChat;
        public final /* synthetic */ C71J $onVoiceCall;
        public final /* synthetic */ G0U<FixedTab, C71J> $tabAction;
        public final /* synthetic */ List<FixedTab> $tabs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C143762(String str, C71K c71k, List<? extends FixedTab> list, C71J c71j, C71J c71j2, C71J c71j3, C71J c71j4, G0U<? super FixedTab, ? extends C71J> g0u, C76B c76b, int i, int i2) {
            super(2);
            this.$name = str;
            this.$avatar = c71k;
            this.$tabs = list;
            this.$onOpenChat = c71j;
            this.$onVoiceCall = c71j2;
            this.$onDictate = c71j3;
            this.$onNewSideChat = c71j4;
            this.$tabAction = g0u;
            this.$modifier = c76b;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AskBarWidgetKt.AskBarPanel(this.$name, this.$avatar, this.$tabs, this.$onOpenChat, this.$onVoiceCall, this.$onDictate, this.$onNewSideChat, this.$tabAction, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.AskBarWidgetKt$AskBarPreview$2, reason: invalid class name and case insensitive filesystem */
    public final class C143772 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C76B $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143772(C76B c76b, int i, int i2) {
            super(2);
            this.$modifier = c76b;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AskBarWidgetKt.AskBarPreview(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.AskBarWidgetKt$AskBarSignedOut$2, reason: invalid class name and case insensitive filesystem */
    public final class C143782 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C76B $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143782(C76B c76b, int i, int i2) {
            super(2);
            this.$modifier = c76b;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AskBarWidgetKt.AskBarSignedOut(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.AskBarWidgetKt$AskBarTabRow$1, reason: invalid class name and case insensitive filesystem */
    public final class C143791 extends AbstractC7559F3s implements G0W<C72d, BFM, Integer, Unit> {
        public final /* synthetic */ G0U<FixedTab, C71J> $tabAction;
        public final /* synthetic */ List<FixedTab> $tabs;

        public final void invoke(C72d c72d, BFM bfm, int i) {
            C76B c76bA00;
            int iA05 = i;
            C7384Etj.A0Y(c72d, 0);
            if ((iA05 & 6) == 0) {
                iA05 |= AnonymousClass002.A05(AnonymousClass004.A1X(c72d, bfm, iA05) ? 1 : 0);
            }
            if (!AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
                bfm.Afo();
                return;
            }
            List<FixedTab> list = this.$tabs;
            G0U<FixedTab, C71J> g0u = this.$tabAction;
            for (FixedTab fixedTab : list) {
                C76C c76c = C76B.A00;
                C76B c76bAgp = new C062875i(C72T.A00).Agp(new C062775h(C72U.A00));
                C71J c71jInvoke = g0u.invoke(fixedTab);
                if (c71jInvoke == null || (c76bA00 = C75V.A00(c76c, c71jInvoke)) == null) {
                    c76bA00 = c76c;
                }
                C72G.A00(bfm, c76bAgp.Agp(c76bA00), C059672t.A02, B1V.A00(bfm, new AskBarWidgetKt$AskBarTabRow$1$1$2(fixedTab), -1840298682), 384, 0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C143791(List<? extends FixedTab> list, G0U<? super FixedTab, ? extends C71J> g0u) {
            super(3);
            this.$tabs = list;
            this.$tabAction = g0u;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C72d c72d, BFM bfm, Integer num) {
            invoke(c72d, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.AskBarWidgetKt$AskBarTabRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C143802 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C76B $modifier;
        public final /* synthetic */ G0U<FixedTab, C71J> $tabAction;
        public final /* synthetic */ List<FixedTab> $tabs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C143802(List<? extends FixedTab> list, G0U<? super FixedTab, ? extends C71J> g0u, C76B c76b, int i, int i2) {
            super(2);
            this.$tabs = list;
            this.$tabAction = g0u;
            this.$modifier = c76b;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AskBarWidgetKt.AskBarTabRow(this.$tabs, this.$tabAction, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: AskBarAgent-942rkJo, reason: not valid java name */
    public static final void m3156AskBarAgent942rkJo(String str, C71K c71k, float f, C76B c76b, BFM bfm, int i, int i2) {
        C76B c76b2 = c76b;
        bfm.AgG(-458820778);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(c71k, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A06(bfm, f);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, c76b);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                c76b2 = C76B.A00;
            }
            C72Z.A00(bfm, c76b2, B1V.A00(bfm, new AskBarWidgetKt$AskBarAgent$1(c71k, f, str), 463393138), 0, 1, ((iA0d >> 9) & 14) | 3072, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AskBarWidgetKt$AskBarAgent$2(str, c71k, f, c76b2, i, i2);
        }
    }

    public static final void AskBarCircleButton(int i, String str, C71J c71j, C76B c76b, BFM bfm, int i2, int i3) {
        C76B c76bA00;
        C76B c76b2 = c76b;
        bfm.AgG(1655238204);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass003.A05(AnonymousClass004.A1Z(c71j, bfm, i2) ? 1 : 0);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0D |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, c76b);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0D), bfm, iA0D)) {
            if (i4 != 0) {
                c76b2 = C76B.A00;
            }
            C058571g c058571g = new C058571g(i);
            C72S c72s = new C72S(new C72V(WidgetComponentsKt.widgetPrimaryIconColor));
            float f = ASK_BAR_CONTROL_SIZE;
            C76B c76bA01 = AbstractC059772w.A01(C72F.A00(AnonymousClass722.A01(c76b2, f), f / 2.0f), (f - ASK_BAR_ICON_SIZE) / 2.0f);
            if (c71j == null || (c76bA00 = C75V.A00(C76B.A00, c71j)) == null) {
                c76bA00 = C76B.A00;
            }
            AbstractC060773g.A01(bfm, c72s, c76bA01.Agp(c76bA00), c058571g, str, 0, (iA0D & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 32768, 8);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i, str, c71j, c76b2, i2, i3);
        }
    }

    public static final List<FixedTab> askBarDefaultTabs() {
        List<FixedTab> listEnabledFixedTabs = AuraFixedNavBarKt.enabledFixedTabs(false, false);
        ArrayList arrayListA0h = C3cG.A0h();
        for (FixedTab fixedTab : listEnabledFixedTabs) {
            if (deeplinkPath(fixedTab) != null) {
                arrayListA0h.add(fixedTab);
            }
        }
        return arrayListA0h;
    }

    public static final String deeplinkPath(FixedTab fixedTab) {
        C7384Etj.A0Y(fixedTab, 0);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (fixedTab.ordinal()) {
            case 0:
                return "chat";
            case 1:
                return "feed";
            case 2:
                return "explore";
            case 3:
                return "goals";
            case 4:
                return null;
            case 5:
                return "library";
            default:
                throw C3cG.A0q();
        }
    }

    /* loaded from: classes.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FixedTab.values().length];
            try {
                AnonymousClass002.A13(FixedTab.CHAT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(FixedTab.FEED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(FixedTab.IDEAS, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(FixedTab.GOALS, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(FixedTab.LIBRARY, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(FixedTab.CONNECTIONS, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        List<FixedTab> listEnabledFixedTabs = AuraFixedNavBarKt.enabledFixedTabs(true, false);
        ArrayList arrayListA0h = C3cG.A0h();
        for (FixedTab fixedTab : listEnabledFixedTabs) {
            if (deeplinkPath(fixedTab) != null) {
                arrayListA0h.add(fixedTab);
            }
        }
        ASK_BAR_PREVIEW_TABS = arrayListA0h;
    }

    public static final void AskBarContent(C76B c76b, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass5;
        C76B c76b2 = c76b;
        bfm.AgG(-1763653827);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c76b2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                c76b2 = C76B.A00;
            }
            Context contextA08 = C60Q.A08(bfm);
            bfm.AgF(-534706435);
            Object objA6v = bfm.A6v(C7VW.A03);
            if (objA6v == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences");
            }
            Preferences preferences = (Preferences) objA6v;
            BBI bbiA07 = C3cG.A07(bfm);
            if (C7384Etj.areEqual(preferences.A06(AgentWidgetStore.SIGNED_OUT), true)) {
                bfm.AgE(-676036297);
                AskBarSignedOut(c76b2, bfm, iA0d & 14, 0);
                bBbAAc = AnonymousClass001.A0L(bfm, bbiA07);
                if (bBbAAc != null) {
                    anonymousClass5 = new AnonymousClass1(c76b2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass5);
                }
                return;
            }
            bfm.AgE(-675992091);
            BBI.A0R(bbiA07, false);
            String str = (String) preferences.A06(AgentWidgetStore.AVATAR_FILE);
            boolean zA65 = bfm.A65(str);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = str != null ? AskBarHomeScreenWidget.INSTANCE.store.loadAvatar(contextA08, str) : null;
                bfm.Ai0(objAaT);
            }
            Bitmap bitmap = (Bitmap) objAaT;
            C6JZ<String> c6jz = AgentWidgetStore.TABS;
            boolean zA652 = bfm.A65(preferences.A06(c6jz));
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = askBarTabs((String) preferences.A06(c6jz));
                bfm.Ai0(objAaT2);
            }
            List list = (List) objAaT2;
            String str2 = (String) preferences.A06(AgentWidgetStore.NAME);
            if (str2 == null) {
                str2 = HatchAppName.value;
            }
            C71K c71g = bitmap != null ? new C71G(bitmap) : new C058571g(HatchIconKt.HATCH_DEFAULT_AVATAR_RES);
            ComposerLaunchAction composerLaunchAction = ComposerLaunchAction.KEYBOARD;
            AskBarHomeScreenWidget askBarHomeScreenWidget = AskBarHomeScreenWidget.INSTANCE;
            C71J c71jComposerLaunchAction = WidgetComponentsKt.composerLaunchAction(contextA08, composerLaunchAction, askBarHomeScreenWidget.getKind());
            C71J c71jVoiceCallAction = Preferences.A03(AgentWidgetStore.CALL_SUPPORTED, preferences, true) ? WidgetComponentsKt.voiceCallAction(contextA08, askBarHomeScreenWidget.getKind()) : null;
            C71J c71jComposerLaunchAction2 = WidgetComponentsKt.composerLaunchAction(contextA08, ComposerLaunchAction.DICTATION, askBarHomeScreenWidget.getKind());
            C71J c71jNewSideChatAction = WidgetComponentsKt.newSideChatAction(contextA08, askBarHomeScreenWidget.getKind());
            boolean zA67 = bfm.A67(contextA08);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == C78N.A00) {
                objAaT3 = new AskBarWidgetKt$AskBarContent$4$1(contextA08);
                bfm.Ai0(objAaT3);
            }
            AskBarPanel(str2, c71g, list, c71jComposerLaunchAction, c71jVoiceCallAction, c71jComposerLaunchAction2, c71jNewSideChatAction, (G0U) objAaT3, c76b2, bfm, (iA0d << 24) & 234881024, 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass5 = new AnonymousClass5(c76b2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass5);
        }
    }

    public static final void AskBarHeader(String str, C71K c71k, C71J c71j, C71J c71j2, C71J c71j3, C76B c76b, BFM bfm, int i, int i2) {
        C76B c76b2 = c76b;
        bfm.AgG(1727234900);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(c71k, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass003.A05(AnonymousClass004.A1Z(c71j, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass002.A00(AnonymousClass004.A1a(c71j2, bfm, i) ? 1 : 0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass002.A04(AnonymousClass004.A1R(bfm, c71j3, 32768, i) ? 1 : 0);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, c76b2);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                c76b2 = C76B.A00;
            }
            C72Z.A00(bfm, C72e.A00(c76b2), B1V.A00(bfm, new C143731(str, c71k, C73O.A00(bfm), c71j != null ? 3 : 2, c71j, c71j2, c71j3), -197765192), 0, 1, 3072, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C143742(str, c71k, c71j, c71j2, c71j3, c76b2, i, i2);
        }
    }

    public static final void AskBarPanel(String str, C71K c71k, List<? extends FixedTab> list, C71J c71j, C71J c71j2, C71J c71j3, C71J c71j4, G0U<? super FixedTab, ? extends C71J> g0u, C76B c76b, BFM bfm, int i, int i2) {
        C76B c76b2 = c76b;
        bfm.AgG(1308630264);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(c71k, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass003.A05(AnonymousClass004.A1Z(list, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass002.A00(AnonymousClass004.A1a(c71j, bfm, i) ? 1 : 0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass002.A04(AnonymousClass004.A1R(bfm, c71j2, 32768, i) ? 1 : 0);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass002.A02(AnonymousClass004.A1R(bfm, c71j3, 262144, i) ? 1 : 0);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A1R(bfm, c71j4, 2097152, i) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0a(bfm, g0u);
        }
        int i3 = i2 & 256;
        int iA0l = 100663296;
        if (i3 != 0) {
            iA0d |= iA0l;
        } else if ((100663296 & i) == 0) {
            iA0l = AnonymousClass004.A0l(bfm, c76b2);
            iA0d |= iA0l;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(38347923 & iA0d, 38347922), bfm, iA0d)) {
            if (i3 != 0) {
                c76b2 = C76B.A00;
            }
            float fIntBitsToFloat = Float.intBitsToFloat(AnonymousClass002.A09(C73O.A00(bfm)));
            C72G.A00(bfm, AnonymousClass722.A00(c76b2), C059672t.A02, B1V.A00(bfm, new C143751(C1DG.A01(fIntBitsToFloat, ASK_BAR_MIN_HEIGHT_WITH_TABS) >= 0, fIntBitsToFloat, c71j, str, c71k, c71j2, c71j3, c71j4, list, g0u), -2143726502), 384, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C143762(str, c71k, list, c71j, c71j2, c71j3, c71j4, g0u, c76b2, i, i2);
        }
    }

    public static final List<FixedTab> askBarTabs(String str) {
        List listA0e;
        if (str != null && (listA0e = C7BY.A0e(str, ",")) != null) {
            ArrayList arrayListA0h = C3cG.A0h();
            for (Object obj : listA0e) {
                Iterator<FixedTab> it = FixedTab.getEntries().iterator();
                while (true) {
                    if (it.hasNext()) {
                        FixedTab next = it.next();
                        if (C7384Etj.areEqual(next.getNavigationId(), obj)) {
                            if (next != null) {
                                arrayListA0h.add(next);
                            }
                        }
                    }
                }
            }
            if (!arrayListA0h.isEmpty()) {
                return arrayListA0h;
            }
        }
        return askBarDefaultTabs();
    }

    public static final void AskBarPreview(C76B c76b, BFM bfm, int i, int i2) {
        bfm.AgG(-467531506);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c76b) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                c76b = C76B.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12016d);
            C058571g c058571g = new C058571g(HatchIconKt.HATCH_DEFAULT_AVATAR_RES);
            List<FixedTab> list = ASK_BAR_PREVIEW_TABS;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = AskBarWidgetKt$AskBarPreview$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AskBarPanel(strA01, c058571g, list, null, null, null, null, (G0U) objAaT, c76b, bfm, ((iA0d << 24) & 234881024) | 14380032, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C143772(c76b, i, i2);
        }
    }

    public static final void AskBarSignedOut(C76B c76b, BFM bfm, int i, int i2) {
        C76B c76bA00;
        bfm.AgG(773658884);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c76b) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                c76b = C76B.A00;
            }
            Context contextA08 = C60Q.A08(bfm);
            C76B c76bA01 = AbstractC059772w.A01(WidgetComponentsKt.widgetContainer(c76b), ASK_BAR_HORIZONTAL_PADDING);
            C71J c71jOpenAppAction = WidgetComponentsKt.openAppAction(contextA08);
            if (c71jOpenAppAction == null || (c76bA00 = C75V.A00(C76B.A00, c71jOpenAppAction)) == null) {
                c76bA00 = C76B.A00;
            }
            C72G.A00(bfm, c76bA01.Agp(c76bA00), C059672t.A02, ComposableSingletons$AskBarWidgetKt.lambda$1043062630, 384, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C143782(c76b, i, i2);
        }
    }

    public static final void AskBarTabRow(List<? extends FixedTab> list, G0U<? super FixedTab, ? extends C71J> g0u, C76B c76b, BFM bfm, int i, int i2) {
        bfm.AgG(-1250236468);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, c76b);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                c76b = C76B.A00;
            }
            C76B c76bA00 = C72e.A00(c76b);
            float f = ASK_BAR_TAB_BAR_HEIGHT;
            C72Z.A00(bfm, AbstractC059772w.A02(C72F.A00(c76bA00.Agp(new C062775h(new C72R(f))), f / 2.0f), ASK_BAR_SPACING, 0.0f), B1V.A00(bfm, new C143791(list, g0u), -1588551192), 0, 1, 3072, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C143802(list, g0u, c76b, i, i2);
        }
    }
}
