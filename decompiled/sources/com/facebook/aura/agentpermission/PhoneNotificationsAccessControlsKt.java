package com.facebook.aura.agentpermission;

import X.A3q;
import X.AKQ;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B18;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C07C;
import X.C0881AGi;
import X.C0953AJg;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C14P;
import X.C1515AkP;
import X.C1822Arm;
import X.C1YL;
import X.C3Ue;
import X.C3cG;
import X.C3cH;
import X.C4Ax;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.gateway.store.PhoneNotificationsAccessMode;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.header.AuraSectionHeaderKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class PhoneNotificationsAccessControlsKt {

    /* renamed from: com.facebook.aura.agentpermission.PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessAppList$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Set<String> $blockedApps;
        public final /* synthetic */ List<C4Ax> $installedApps;
        public final /* synthetic */ G0V<String, Boolean, Unit> $onToggle;
        public final /* synthetic */ C07C $this_PhoneNotificationsAccessAppList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(C07C c07c, List<C4Ax> list, Set<String> set, G0V<? super String, ? super Boolean, Unit> g0v, int i) {
            super(2);
            this.$this_PhoneNotificationsAccessAppList = c07c;
            this.$installedApps = list;
            this.$blockedApps = set;
            this.$onToggle = g0v;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            PhoneNotificationsAccessControlsKt.PhoneNotificationsAccessAppList(this.$this_PhoneNotificationsAccessAppList, this.$installedApps, this.$blockedApps, this.$onToggle, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessAppRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C108502 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<Drawable> $icon$delegate;
        public final /* synthetic */ BRg $iconModifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108502(BRg bRg, MutableState<Drawable> mutableState) {
            super(2);
            this.$iconModifier = bRg;
            this.$icon$delegate = mutableState;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                Drawable value = this.$icon$delegate.getValue();
                if (value != null) {
                    bfm.AgE(-50981956);
                    AuraImageKt.AuraImage(value, this.$iconModifier, B18.A00, null, false, bfm, 384, 24);
                } else {
                    bfm.AgE(-50867783);
                    C3Ue.A04(this.$iconModifier, bfm, 0);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessAppRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ C4Ax $app;
        public final /* synthetic */ boolean $isEnabled;
        public final /* synthetic */ G0U<Boolean, Unit> $onToggle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(C4Ax c4Ax, boolean z, G0U<? super Boolean, Unit> g0u, int i) {
            super(2);
            this.$app = c4Ax;
            this.$isEnabled = z;
            this.$onToggle = g0u;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            PhoneNotificationsAccessControlsKt.PhoneNotificationsAccessAppRow(this.$app, this.$isEnabled, this.$onToggle, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessControls$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ C07C $this_PhoneNotificationsAccessControls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C07C c07c, int i) {
            super(2);
            this.$this_PhoneNotificationsAccessControls = c07c;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            PhoneNotificationsAccessControlsKt.PhoneNotificationsAccessControls(this.$this_PhoneNotificationsAccessControls, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessModeSection$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ C07C $this_PhoneNotificationsAccessModeSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(C07C c07c, int i) {
            super(2);
            this.$this_PhoneNotificationsAccessModeSection = c07c;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            PhoneNotificationsAccessControlsKt.PhoneNotificationsAccessModeSection(this.$this_PhoneNotificationsAccessModeSection, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void PhoneNotificationsAccessControls(C07C c07c, BFM bfm, int i) {
        C7384Etj.A0Y(c07c, 0);
        bfm.AgG(188557526);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            AuraSectionHeaderKt.AuraSectionHeader(AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120f3a), null, null, bfm, 48, 4);
            PhoneNotificationsAccessModeSection(c07c, bfm, iA0d & 14);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(c07c, i);
        }
    }

    public static final void PhoneNotificationsAccessAppList(C07C c07c, List<C4Ax> list, Set<String> set, G0V<? super String, ? super Boolean, Unit> g0v, BFM bfm, int i) {
        bfm.AgG(-1768945241);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(list, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass003.A05(AnonymousClass004.A1Z(set, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            boolean z = ((iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0d & 64) != 0 && bfm.A67(list))) | ((iA0d & 896) == 256 || ((iA0d & 512) != 0 && bfm.A67(set))) | ((iA0d & 7168) == 2048);
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessAppList$1$1(list, set, g0v);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, false, null, 0L, (G0U) objAaT, bfm, iA0d & 14, 7);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(c07c, list, set, g0v, i);
        }
    }

    public static final void PhoneNotificationsAccessAppRow(C4Ax c4Ax, boolean z, G0U<? super Boolean, Unit> g0u, BFM bfm, int i) {
        bfm.AgG(-617272781);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, c4Ax) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, g0u);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            String str = c4Ax.A01;
            boolean zA65 = bfm.A65(str);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT;
            boolean zA1O = C3cH.A1O(bfm, mutableState, contextA0H, c4Ax);
            Object objAaT2 = bfm.AaT();
            if (zA1O || objAaT2 == C78N.A00) {
                objAaT2 = new PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessAppRow$1$1(contextA0H, c4Ax, mutableState, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, str);
            BRg bRgA01 = C11U.A01(C10G.A07(BRg.A00, 32.0f), 8.0f);
            AuraCardType.Toggle toggle = AuraCardType.Toggle.INSTANCE;
            C1062ATq c1062ATq = C10G.A02;
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
            String str2 = c4Ax.A00;
            C0953AJg c0953AJgA00 = C0953AJg.A00();
            long j = B6A.A07;
            int i2 = iA0T << 18;
            AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, new AuraCardContent(str2, auraIconAndHeadlineStyle, (BO6<String, C14P>) c0953AJgA00, (B6A) null, (ApQ) null, (G0U<? super String, Unit>) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null, true, true, (String) null, (C1822Arm) null, j, j, (C1YL) null), toggle, B1V.A00(bfm, new C108502(bRgA01, mutableState), -1325932841), null, null, Boolean.valueOf(z), g0u, null, false, false, null, null, 0L, false, null, null, bfm, (29360128 & i2) | 27654 | (i2 & 234881024), 0, 261728);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(c4Ax, z, g0u, i);
        }
    }

    public static final void PhoneNotificationsAccessModeSection(C07C c07c, BFM bfm, int i) {
        bfm.AgG(196421762);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            Context contextA0O = AnonymousClass003.A0O(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            HatchGatewayPrefsStore hatchGatewayPrefsStoreA0D = C3cG.A0D(abstractC3358CGzA0h);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AnonymousClass004.A11(bfm, PhoneNotificationsAccessMode.ALL);
            }
            MutableState mutableState = (MutableState) objAaT;
            boolean zA652 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = AnonymousClass004.A11(bfm, A3q.A00);
            }
            MutableState mutableState2 = (MutableState) objAaT2;
            Object objAaT3 = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState3 = (MutableState) AnonymousClass005.A0g(bfm, objAaT3, obj, true);
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = AnonymousClass004.A11(bfm, C0881AGi.A00);
            }
            MutableState mutableState4 = (MutableState) objAaT4;
            boolean zA1X = AnonymousClass005.A1X(bfm, mutableState2, contextA0O, bfm.A65(mutableState), bfm.A67(hatchGatewayPrefsStoreA0D));
            Object objAaT5 = bfm.AaT();
            if (zA1X || objAaT5 == obj) {
                objAaT5 = new PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessModeSection$1$1(hatchGatewayPrefsStoreA0D, contextA0O, mutableState, mutableState2, mutableState4, mutableState3, null);
                bfm.Ai0(objAaT5);
            }
            AnonymousClass001.A18(bfm, objAaT5, abstractC3358CGzA0h);
            boolean zA1O = C3cH.A1O(bfm, mutableState, hatchGatewayPrefsStoreA0D, contextA0O);
            Object objAaT6 = bfm.AaT();
            if (zA1O || objAaT6 == obj) {
                objAaT6 = new PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessModeSection$2$1(mutableState, hatchGatewayPrefsStoreA0D, contextA0O);
                bfm.Ai0(objAaT6);
            }
            int i2 = iA0d & 14;
            HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, false, null, 0L, (G0U) objAaT6, bfm, i2, 7);
            if (mutableState.getValue() == PhoneNotificationsAccessMode.SELECTED) {
                BS0 bs0A09 = C3cG.A09(bfm, 1858807068);
                float f = AuraDimensKt.SpacingSmall;
                C01N.A08(bfm, bs0A09, f);
                if (MutableState.A0A(mutableState3)) {
                    bfm.AgE(1858845415);
                    C1062ATq c1062ATq = C10G.A02;
                    InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                    BBI bbi = (BBI) bfm;
                    int iA0J = AnonymousClass003.A0J(bbi);
                    AKQ akqA04 = BBI.A04(bbi);
                    BRg bRgA01 = AxM.A01(bfm, c1062ATq);
                    Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                    if (bbi.A0V == null) {
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
                    AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C10G.A07(bs0A09, 24.0f), null, 0L, bfm, 6, 6);
                    BBI.A0R(bbi, true);
                } else {
                    bfm.AgE(1859022828);
                    List list = (List) mutableState4.getValue();
                    Set set = (Set) mutableState2.getValue();
                    boolean zA1O2 = C3cH.A1O(bfm, mutableState2, hatchGatewayPrefsStoreA0D, contextA0O);
                    Object objAaT7 = bfm.AaT();
                    if (zA1O2 || objAaT7 == obj) {
                        objAaT7 = new PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessModeSection$4$1(hatchGatewayPrefsStoreA0D, contextA0O, mutableState2);
                        bfm.Ai0(objAaT7);
                    }
                    PhoneNotificationsAccessAppList(c07c, list, set, (G0V) objAaT7, bfm, i2);
                }
                AnonymousClass001.A1D(bfm);
                C01N.A08(bfm, bs0A09, f);
            } else {
                bfm.AgE(1859825728);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(c07c, i);
        }
    }

    public static final /* synthetic */ Drawable access$PhoneNotificationsAccessAppRow$lambda$1(MutableState mutableState) {
        return (Drawable) mutableState.getValue();
    }

    public static final /* synthetic */ PhoneNotificationsAccessMode access$PhoneNotificationsAccessModeSection$lambda$1(MutableState mutableState) {
        return (PhoneNotificationsAccessMode) mutableState.getValue();
    }

    public static final /* synthetic */ Set access$PhoneNotificationsAccessModeSection$lambda$4(MutableState mutableState) {
        return (Set) mutableState.getValue();
    }
}
