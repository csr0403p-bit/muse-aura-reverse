package com.facebook.aura.skills.view;

import X.AKQ;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C0v5;
import X.C11U;
import X.C1515AkP;
import X.C1YD;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.vds.compose.input.AuraTextInputDefaults;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchConnectorSearchEntryKt {

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorSearchEntryKt$ConnectorCatalogSearchEntry$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $categoryId;
        public final /* synthetic */ boolean $deviceOnly;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(BRg bRg, String str, boolean z, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$categoryId = str;
            this.$deviceOnly = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConnectorSearchEntryKt.ConnectorCatalogSearchEntry(this.$modifier, this.$categoryId, this.$deviceOnly, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ConnectorCatalogSearchEntry(BRg bRg, String str, boolean z, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        String str2 = str;
        boolean z2 = z;
        bfm.AgG(1377474224);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                str2 = null;
            }
            if (i5 != 0) {
                z2 = false;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ad7);
            BRg bRgA01 = C1b8.A01(C11U.A03(AnonymousClass001.A0R(bRg2), AnonymousClass002.A0e(bfm).pill), C06G.A0J(bfm, AuraColorsKt.LocalAuraColors));
            C1YD c1yd = new C1YD(0);
            boolean zA1D = AnonymousClass003.A1D(iA0d) | AnonymousClass003.A1C(iA0d) | bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1D || objAaT == C78N.A00) {
                objAaT = new HatchConnectorSearchEntryKt$ConnectorCatalogSearchEntry$1$1(auraNavigatorA0b, str2, z2);
                bfm.Ai0(objAaT);
            }
            BRg bRgA04 = C0v5.A04(bRgA01, c1yd, null, (Function0) objAaT, true);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchConnectorSearchEntryKt$ConnectorCatalogSearchEntry$2$1(strA01);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA00 = AbstractC07539Wl.A00(C3U4.A0B(AnonymousClass006.A0O(AnonymousClass001.A0Y(bRgA04, objAaT2, true)), 16.0f, 12.0f), "hatch-connector-search-entry");
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 12.0f);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0V, akqA04, bRgA012, iA0D);
            C90m c90m = C90m.A00;
            AuraTextInputDefaults.INSTANCE.LeadingSearchIcon(null, bfm, 48, 1);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e88), AnonymousClass001.A0O(c90m, BRg.A00, true), C06G.A08(bfm), C06G.A0Z(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(bRg2, str2, z2, i, i2);
        }
    }
}
