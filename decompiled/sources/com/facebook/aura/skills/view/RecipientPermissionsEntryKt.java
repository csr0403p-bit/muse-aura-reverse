package com.facebook.aura.skills.view;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BRg;
import X.C00x;
import X.C01N;
import X.C1515AkP;
import X.C1BO;
import X.C2CK;
import X.C5wL;
import X.C78N;
import X.C7bA;
import X.C90l;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.skills.viewmodel.RecipientPermissionsAvailabilityViewModel;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class RecipientPermissionsEntryKt {

    /* renamed from: com.facebook.aura.skills.view.RecipientPermissionsEntryKt$RecipientPermissionsEntry$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ String $connectorName;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$connectorId = str;
            this.$connectorName = str2;
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
            RecipientPermissionsEntryKt.RecipientPermissionsEntry(this.$connectorId, this.$connectorName, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.RecipientPermissionsEntryKt$RecipientPermissionsEntry$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ String $connectorName;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$connectorId = str;
            this.$connectorName = str2;
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
            RecipientPermissionsEntryKt.RecipientPermissionsEntry(this.$connectorId, this.$connectorName, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void RecipientPermissionsEntry(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass4;
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        bfm.AgG(-1053601494);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA0M = FGI.A0M("RecipientPermissionsAvailability:", str);
            RecipientPermissionsAvailabilityViewModel.Factory factory = new RecipientPermissionsAvailabilityViewModel.Factory(AnonymousClass002.A0h(bfm), str);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            RecipientPermissionsAvailabilityViewModel recipientPermissionsAvailabilityViewModel = (RecipientPermissionsAvailabilityViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), RecipientPermissionsAvailabilityViewModel.class, strA0M);
            boolean zA67 = bfm.A67(recipientPermissionsAvailabilityViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new RecipientPermissionsEntryKt$RecipientPermissionsEntry$1$1(recipientPermissionsAvailabilityViewModel);
                bfm.Ai0(objAaT);
            }
            C7bA.A05(bfm, null, recipientPermissionsAvailabilityViewModel, (G0U) objAaT, 0, 2);
            if (!C1BO.A0F(C2CK.A02(bfm, recipientPermissionsAvailabilityViewModel.isVisible))) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass4 = new AnonymousClass2(str, str2, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass4;
                }
                return;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, i4);
            C90l c90l = C90l.A00;
            boolean zA672 = bfm.A67(auraNavigatorA0b) | AnonymousClass003.A1B(iA0d) | AnonymousClass003.A1C(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new RecipientPermissionsEntryKt$RecipientPermissionsEntry$3$1$1(auraNavigatorA0b, str, str2);
                bfm.Ai0(objAaT2);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT2, bfm, 6, 7);
            C01N.A04(bfm, bbi, BRg.A00, AuraDimensKt.SpacingMedium, zA1a);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(str, str2, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass4;
        }
    }
}
