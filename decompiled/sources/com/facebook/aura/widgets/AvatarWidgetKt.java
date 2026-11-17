package com.facebook.aura.widgets;

import X.AbstractC060773g;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.AnonymousClass722;
import X.BBI;
import X.BBb;
import X.BFM;
import X.C058571g;
import X.C3cG;
import X.C60Q;
import X.C60R;
import X.C71G;
import X.C71J;
import X.C71K;
import X.C72R;
import X.C75U;
import X.C75V;
import X.C76B;
import X.C78N;
import X.C7VW;
import X.G0V;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.datastore.preferences.core.Preferences;
import com.facebook.aura.R;
import com.facebook.aura.common.appname.HatchAppName;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class AvatarWidgetKt {
    public static final String CHAT_DEEPLINK_PATH = "chat";

    /* renamed from: com.facebook.aura.widgets.AvatarWidgetKt$AvatarContent$1, reason: invalid class name */
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
            AvatarWidgetKt.AvatarContent(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.AvatarWidgetKt$AvatarContent$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C76B $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C76B c76b, int i, int i2) {
            super(2);
            this.$modifier = c76b;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AvatarWidgetKt.AvatarContent(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.AvatarWidgetKt$AvatarImage$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C71K $avatar;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ C76B $modifier;
        public final /* synthetic */ C71J $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C71K c71k, String str, C71J c71j, C76B c76b, int i, int i2) {
            super(2);
            this.$avatar = c71k;
            this.$contentDescription = str;
            this.$onClick = c71j;
            this.$modifier = c76b;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AvatarWidgetKt.AvatarImage(this.$avatar, this.$contentDescription, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.widgets.AvatarWidgetKt$AvatarPreview$1, reason: invalid class name and case insensitive filesystem */
    public final class C143811 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C76B $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143811(C76B c76b, int i, int i2) {
            super(2);
            this.$modifier = c76b;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AvatarWidgetKt.AvatarPreview(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void AvatarPreview(C76B c76b, BFM bfm, int i, int i2) {
        C76B c76b2 = c76b;
        bfm.AgG(-1266178642);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c76b) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                c76b2 = C76B.A00;
            }
            AvatarImage(new C058571g(R.drawable.aura_bot_body), null, null, c76b2, bfm, ((iA0d << 9) & 7168) | 432, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C143811(c76b2, i, i2);
        }
    }

    public static final void AvatarContent(C76B c76b, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass3;
        C76B c76b2 = c76b;
        bfm.AgG(1732666333);
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
            boolean zA1P = C3cG.A1P(preferences.A06(AgentWidgetStore.SIGNED_OUT), true);
            Object obj = HatchAppName.value;
            if (zA1P) {
                bfm.AgE(945960361);
                WidgetComponentsKt.WidgetMessage(AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f1206b8), WidgetComponentsKt.widgetContainer(c76b2), WidgetComponentsKt.openAppAction(contextA08), bfm, 0, 0);
                bBbAAc = AnonymousClass001.A0L(bfm, bbiA07);
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(c76b2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass3);
                }
                return;
            }
            bfm.AgE(946171781);
            BBI.A0R(bbiA07, false);
            String str = (String) preferences.A06(AgentWidgetStore.AVATAR_FILE);
            boolean zA65 = bfm.A65(str);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = str != null ? AvatarHomeScreenWidget.INSTANCE.store.loadAvatar(contextA08, str) : null;
                bfm.Ai0(objAaT);
            }
            Bitmap bitmap = (Bitmap) objAaT;
            C71K c71g = bitmap != null ? new C71G(bitmap) : new C058571g(R.drawable.aura_bot_body);
            Object objA06 = preferences.A06(AgentWidgetStore.NAME);
            if (objA06 != null) {
                obj = objA06;
            }
            AvatarImage(c71g, AnonymousClass001.A0t(bfm, obj, R.string._name_removed__res_0x7f1206b7), WidgetComponentsKt.auraDeeplinkAction(contextA08, C60R.A0D("chat"), AvatarHomeScreenWidget.INSTANCE.getKind()), c76b2, bfm, (iA0d << 9) & 7168, 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(c76b2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass3);
        }
    }

    public static final void AvatarImage(C71K c71k, String str, C71J c71j, C76B c76b, BFM bfm, int i, int i2) {
        C76B c76bA00;
        bfm.AgG(-1056419914);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(c71k, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(c71j, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, c76b);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                c76b = C76B.A00;
            }
            C76B c76bAgp = AnonymousClass722.A00(c76b).Agp(new C75U(new C72R(20.0f)));
            if (c71j == null || (c76bA00 = C75V.A00(C76B.A00, c71j)) == null) {
                c76bA00 = C76B.A00;
            }
            AbstractC060773g.A01(bfm, null, c76bAgp.Agp(c76bA00), c71k, str, 0, iA05 & 126, 16);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(c71k, str, c71j, c76b, i, i2);
        }
    }
}
