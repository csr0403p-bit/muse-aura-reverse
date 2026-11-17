package com.facebook.aura.settings;

import X.AKH;
import X.AKQ;
import X.AbstractC2271BQs;
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
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C1515AkP;
import X.C1b8;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.confidentialvm.session.ConfidentialSessionGate;
import com.facebook.aura.linktext.HatchInlineLinkTextKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class WhatsAppUpdateNoteKt {
    public static final String UPDATE_LINK_TAG = "whatsapp_update";

    /* renamed from: com.facebook.aura.settings.WhatsAppUpdateNoteKt$WhatsAppUpdateNote$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onShown;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onShown = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            WhatsAppUpdateNoteKt.WhatsAppUpdateNote(this.$onShown, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.WhatsAppUpdateNoteKt$WhatsAppUpdateNote$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onShown;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onShown = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            WhatsAppUpdateNoteKt.WhatsAppUpdateNote(this.$onShown, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final Function0<Unit> rememberWhatsAppUpdateNoteViewLogger(BFM bfm, int i) {
        Object[] objArr = new Object[0];
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            objAaT = WhatsAppUpdateNoteKt$rememberWhatsAppUpdateNoteViewLogger$isViewLogged$1$1.INSTANCE;
            bfm.Ai0(objAaT);
        }
        MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT, objArr);
        boolean zA65 = bfm.A65(mutableStateA0N);
        Object objAaT2 = bfm.AaT();
        if (zA65 || objAaT2 == obj) {
            objAaT2 = new WhatsAppUpdateNoteKt$rememberWhatsAppUpdateNoteViewLogger$1$1(mutableStateA0N);
            bfm.Ai0(objAaT2);
        }
        return (Function0) objAaT2;
    }

    public static final void WhatsAppUpdateNote(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass4;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(-1221734886);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (!ConfidentialSessionGate.Companion.rememberIsConfidentialVm(bfm, 6)) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass4 = new AnonymousClass1(function0, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass4;
                }
                return;
            }
            Unit unit = Unit.INSTANCE;
            boolean zA1B = AnonymousClass003.A1B(iA0T);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new WhatsAppUpdateNoteKt$WhatsAppUpdateNote$2$1(function0);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, unit);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12117a);
            String strA0t = AnonymousClass001.A0t(bfm, strA01, R.string._name_removed__res_0x7f121179);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            long j = AnonymousClass001.A0f(bfm, akh).link;
            boolean zA1W = AnonymousClass002.A1W(bfm, contextA0H, AnonymousClass003.A1K(bfm, strA0t, strA01), bfm.A64(j));
            Object objAaT2 = bfm.AaT();
            if (zA1W || objAaT2 == C78N.A00) {
                objAaT2 = HatchInlineLinkTextKt.m1187buildInlineLinkTextXOJAsU(strA0t, strA01, j, UPDATE_LINK_TAG, new WhatsAppUpdateNoteKt$WhatsAppUpdateNote$text$1$1(contextA0H));
                bfm.Ai0(objAaT2);
            }
            ApQ apQ = (ApQ) objAaT2;
            BRg bRgA09 = C3U4.A09(C1b8.A03(AnonymousClass001.A0R(bRg2), AnonymousClass002.A0e(bfm).banner, AnonymousClass001.A0f(bfm, akh).card), AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, AuraDimensKt.SpacingSmall, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0S, akqA04, bRgA01, iA0J);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.circle_info_wght400_outline_24, 0), AuraIconSize.X_SMALL, null, C06G.A0A(bfm), null, bfm, AnonymousClass001.A04(), 33);
            AuraTextKt.m2640AuraTextVmYn7U0(apQ, null, C06G.A0C(bfm), C06G.A0Z(bfm), null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32754);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(function0, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass4;
        }
    }
}
