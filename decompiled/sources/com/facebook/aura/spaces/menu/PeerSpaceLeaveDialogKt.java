package com.facebook.aura.spaces.menu;

import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B1U;
import X.B1V;
import X.BA2;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BRg;
import X.C1BO;
import X.C1er;
import X.C2CK;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.CH0;
import X.FGI;
import X.G0U;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.spaces.menu.PeerSpaceLeaveViewModel;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class PeerSpaceLeaveDialogKt {

    /* renamed from: com.facebook.aura.spaces.menu.PeerSpaceLeaveDialogKt$PeerSpaceLeaveDialog$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $hostMuse;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onLeft;
        public final /* synthetic */ boolean $showing;
        public final /* synthetic */ String $spaceId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$hostMuse = str;
            this.$spaceId = str2;
            this.$showing = z;
            this.$onDismiss = function0;
            this.$onLeft = function02;
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
            PeerSpaceLeaveDialogKt.PeerSpaceLeaveDialog(this.$hostMuse, this.$spaceId, this.$showing, this.$onDismiss, this.$onLeft, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.spaces.menu.PeerSpaceLeaveDialogKt$PeerSpaceLeaveDialog$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelLabel;
        public final /* synthetic */ String $confirmLabel;
        public final /* synthetic */ C1BO<Boolean> $leaving$delegate;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ PeerSpaceLeaveViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, PeerSpaceLeaveViewModel peerSpaceLeaveViewModel, String str2, C1BO<Boolean> c1bo, Function0<Unit> function0) {
            super(2);
            this.$confirmLabel = str;
            this.$viewModel = peerSpaceLeaveViewModel;
            this.$cancelLabel = str2;
            this.$leaving$delegate = c1bo;
            this.$onDismiss = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismiss, AnonymousClass001.A1R(bfm, this.$leaving$delegate, AnonymousClass001.A1R(bfm, this.$cancelLabel, AnonymousClass001.A1T(bfm, this.$viewModel, bfm.A65(this.$confirmLabel)))));
                String str = this.$confirmLabel;
                PeerSpaceLeaveViewModel peerSpaceLeaveViewModel = this.$viewModel;
                String str2 = this.$cancelLabel;
                Function0<Unit> function0 = this.$onDismiss;
                C1BO<Boolean> c1bo = this.$leaving$delegate;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new PeerSpaceLeaveDialogKt$PeerSpaceLeaveDialog$3$1$1(str, peerSpaceLeaveViewModel, str2, function0, c1bo);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.spaces.menu.PeerSpaceLeaveDialogKt$PeerSpaceLeaveDialog$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $hostMuse;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onLeft;
        public final /* synthetic */ boolean $showing;
        public final /* synthetic */ String $spaceId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, String str2, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$hostMuse = str;
            this.$spaceId = str2;
            this.$showing = z;
            this.$onDismiss = function0;
            this.$onLeft = function02;
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
            PeerSpaceLeaveDialogKt.PeerSpaceLeaveDialog(this.$hostMuse, this.$spaceId, this.$showing, this.$onDismiss, this.$onLeft, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void PeerSpaceLeaveDialog(String str, String str2, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass5;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A12(str2, function0, function02, 1);
        bfm.AgG(-771525585);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function02);
        }
        int i3 = i2 & 32;
        if (i3 != 0) {
            iA0d |= 196608;
        } else if ((i & 196608) == 0) {
            iA0d |= AnonymousClass004.A0i(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            String strA0j = FGI.A0j("peer-space-leave:", ((CH0) abstractC3358CGzA0h).A01, ":", str, ":", str2);
            PeerSpaceLeaveViewModel.Factory factory = new PeerSpaceLeaveViewModel.Factory(abstractC3358CGzA0h, str, str2);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            PeerSpaceLeaveViewModel peerSpaceLeaveViewModel = (PeerSpaceLeaveViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), PeerSpaceLeaveViewModel.class, strA0j);
            C1BO c1boA02 = C2CK.A02(bfm, peerSpaceLeaveViewModel.leaving);
            MutableState mutableStateA00 = C1er.A00(bfm, function02);
            boolean zA1N = AnonymousClass003.A1N(bfm, peerSpaceLeaveViewModel, mutableStateA00);
            Object objAaT = bfm.AaT();
            if (zA1N || objAaT == C78N.A00) {
                objAaT = new PeerSpaceLeaveDialogKt$PeerSpaceLeaveDialog$1$1(peerSpaceLeaveViewModel, mutableStateA00, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, peerSpaceLeaveViewModel);
            if (!z && !C1BO.A0F(c1boA02)) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass5 = new AnonymousClass2(str, str2, z, function0, function02, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass5;
                }
                return;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120df0);
            String strA0r = AnonymousClass001.A0r(bfm);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120df2);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120def);
            B1U b1uA00 = B1V.A00(bfm, new AnonymousClass3(strA01, peerSpaceLeaveViewModel, strA0r, c1boA02, function0), 1832459392);
            boolean zA65 = bfm.A65(c1boA02) | AnonymousClass004.A1M(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new PeerSpaceLeaveDialogKt$PeerSpaceLeaveDialog$4$1(function0, c1boA02);
                bfm.Ai0(objAaT2);
            }
            AuraAlertDialogKt.AuraAlertDialog(bRg2, strA012, strA013, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) b1uA00, (Function0<Unit>) objAaT2, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, ((iA0d >> 15) & 14) | 196608, 0, 1944);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass5 = new AnonymousClass5(str, str2, z, function0, function02, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass5;
        }
    }
}
