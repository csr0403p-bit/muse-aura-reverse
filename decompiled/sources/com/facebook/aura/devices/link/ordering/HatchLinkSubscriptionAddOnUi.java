package com.facebook.aura.devices.link.ordering;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C1515AkP;
import X.C3U4;
import X.C78N;
import X.C90l;
import X.C9hr;
import X.F0C;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.devices.intf.SubscriptionCheckoutAddOnUi;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.HatchLinkOrderEntryPoint;
import com.facebook.aura.navigation.key.HatchLinkOrderSheetKey;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchLinkSubscriptionAddOnUi implements SubscriptionCheckoutAddOnUi {
    public static final int $stable = 0;
    public static final HatchLinkSubscriptionAddOnUi INSTANCE = new HatchLinkSubscriptionAddOnUi();

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkSubscriptionAddOnUi$Offer$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onSelectedChange;
        public final /* synthetic */ String $subtitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, String str2, boolean z, G0U<? super Boolean, Unit> g0u, BRg bRg, int i) {
            super(2);
            this.$label = str;
            this.$subtitle = str2;
            this.$isSelected = z;
            this.$onSelectedChange = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLinkSubscriptionAddOnUi.this.Offer(this.$label, this.$subtitle, this.$isSelected, this.$onSelectedChange, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    @Override // com.facebook.aura.devices.intf.SubscriptionCheckoutAddOnUi
    public void Offer(String str, String str2, boolean z, G0U<? super Boolean, Unit> g0u, BRg bRg, BFM bfm, int i) {
        AnonymousClass002.A0D(g0u, bRg, 3);
        bfm.AgG(300506917);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            BRg bRgA0B = C3U4.A0B(AnonymousClass001.A0R(bRg), AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingSmall);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, i2);
            C90l c90l = C90l.A00;
            boolean zA1B = AnonymousClass003.A1B(iA0d) | AnonymousClass003.A1C(iA0d) | AnonymousClass004.A1M(iA0d) | AnonymousClass004.A1K(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new HatchLinkSubscriptionAddOnUi$Offer$1$1$1(str, str2, g0u, z);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0q(c90l, (G0U) objAaT, bfm, 6);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, z, g0u, bRg, i);
        }
    }

    @Override // com.facebook.aura.devices.intf.SubscriptionCheckoutAddOnUi
    public AuraNavKey purchaseSuccessDestination() {
        F0C<C9hr<Object>>[] f0cArr = HatchLinkOrderSheetKey.$childSerializers;
        return new HatchLinkOrderSheetKey(HatchLinkOrderEntryPoint.POST_PURCHASE);
    }
}
