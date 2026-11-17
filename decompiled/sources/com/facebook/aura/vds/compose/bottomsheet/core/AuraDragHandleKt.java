package com.facebook.aura.vds.compose.bottomsheet.core;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C0v5;
import X.C10G;
import X.C15N;
import X.C1D8;
import X.C1YD;
import X.C1b8;
import X.C3U4;
import X.C3Ue;
import X.C78N;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.base.ComponentsKt;
import com.facebook.aura.vds.compose.bouncy.AuraBouncyIndication;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraDragHandleKt {

    /* renamed from: com.facebook.aura.vds.compose.bottomsheet.core.AuraDragHandleKt$AuraDragHandle$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $dismissible;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, boolean z, Function0<Unit> function0, int i) {
            super(2);
            this.$modifier = bRg;
            this.$dismissible = z;
            this.$onDismissRequest = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraDragHandleKt.AuraDragHandle(this.$modifier, this.$dismissible, this.$onDismissRequest, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.bottomsheet.core.AuraDragHandleKt$DragHandle$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, Function0<Unit> function0, int i) {
            super(2);
            this.$modifier = bRg;
            this.$onDismiss = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraDragHandleKt.DragHandle(this.$modifier, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.bottomsheet.core.AuraDragHandleKt$NoDragHandle$1, reason: invalid class name and case insensitive filesystem */
    public final class C142721 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142721(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AuraDragHandleKt.NoDragHandle(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void AuraDragHandle(BRg bRg, boolean z, Function0<Unit> function0, BFM bfm, int i) {
        AnonymousClass002.A1A(bRg, 0, function0);
        bfm.AgG(2035003019);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (z) {
                bfm.AgE(1311684176);
                DragHandle(bRg, function0, bfm, (iA0d & 14) | ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
            } else {
                bfm.AgE(1311759103);
                NoDragHandle(bfm, 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg, z, function0, i);
        }
    }

    public static final void DragHandle(BRg bRg, Function0<Unit> function0, BFM bfm, int i) {
        boolean zA1a = AnonymousClass002.A1a(bRg, function0);
        bfm.AgG(-159650460);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            String strA00 = C15N.A00(bfm, R.string._name_removed__res_0x7f120930);
            BRg bRgA01 = C0v5.A01(new AuraBouncyIndication(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31, null), null, bRg, new C1YD(0), strA00, function0, zA1a);
            boolean zA65 = bfm.A65(strA00);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new AuraDragHandleKt$DragHandle$1$1(strA00);
                bfm.Ai0(objAaT);
            }
            C3Ue.A04(C1b8.A03(C10G.A0C(C3U4.A0C(AnonymousClass001.A0Y(bRgA01, objAaT, false), 0.0f, AuraDimensKt.SpacingXsmall, 0.0f, AuraDimensKt.SpacingXsmallPlusNano), 38.0f, 6.0f), C1D8.A00(8.0f), AnonymousClass002.A0c(bfm).quaternaryText), bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg, function0, i);
        }
    }

    public static final void NoDragHandle(BFM bfm, int i) {
        bfm.AgG(-1682745816);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            ComponentsKt.m2403AuraVerticalSpacer8Feqmps(AuraDimensKt.SpacingLargePlusMicro, bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142721(i);
        }
    }
}
