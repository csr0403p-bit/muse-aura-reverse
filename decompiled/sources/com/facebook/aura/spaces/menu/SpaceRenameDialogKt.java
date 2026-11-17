package com.facebook.aura.spaces.menu;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.ui.HatchRenameDialogKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class SpaceRenameDialogKt {

    /* renamed from: com.facebook.aura.spaces.menu.SpaceRenameDialogKt$SpaceRenameDialog$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $currentName;
        public final /* synthetic */ SpaceMenuLogOrigin $logOrigin;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ G0U<String, Unit> $onNameChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, SpaceMenuLogOrigin spaceMenuLogOrigin, int i, int i2) {
            super(2);
            this.$currentName = str;
            this.$onNameChange = g0u;
            this.$onConfirm = function0;
            this.$onDismiss = function02;
            this.$modifier = bRg;
            this.$logOrigin = spaceMenuLogOrigin;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceRenameDialogKt.SpaceRenameDialog(this.$currentName, this.$onNameChange, this.$onConfirm, this.$onDismiss, this.$modifier, this.$logOrigin, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void SpaceRenameDialog(String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, SpaceMenuLogOrigin spaceMenuLogOrigin, BFM bfm, int i, int i2) {
        SpaceMenuLogOrigin spaceMenuLogOrigin2 = spaceMenuLogOrigin;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A11(g0u, function0, function02, 1);
        bfm.AgG(-233602740);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function02);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        int i4 = i2 & 32;
        int iA0i = 196608;
        if (i4 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, spaceMenuLogOrigin2);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                spaceMenuLogOrigin2 = null;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12060c);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12060e);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12060f);
            String strA0r = AnonymousClass001.A0r(bfm);
            int i5 = iA0d & 458752;
            boolean zA1Q = AnonymousClass002.A1Q(i5, 131072) | AnonymousClass004.A1K(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = new SpaceRenameDialogKt$SpaceRenameDialog$1$1(spaceMenuLogOrigin2, function0);
                bfm.Ai0(objAaT);
            }
            Function0 function03 = (Function0) objAaT;
            int i6 = iA0d & 7168;
            boolean zA1Q2 = AnonymousClass002.A1Q(i5, 131072) | AnonymousClass002.A1Q(i6, 2048);
            Object objAaT2 = bfm.AaT();
            if (zA1Q2 || objAaT2 == C78N.A00) {
                objAaT2 = new SpaceRenameDialogKt$SpaceRenameDialog$2$1(spaceMenuLogOrigin2, function02);
                bfm.Ai0(objAaT2);
            }
            Function0 function04 = (Function0) objAaT2;
            boolean zA1Q3 = AnonymousClass002.A1Q(i5, 131072) | (i6 == 2048);
            Object objAaT3 = bfm.AaT();
            if (zA1Q3 || objAaT3 == C78N.A00) {
                objAaT3 = new SpaceRenameDialogKt$SpaceRenameDialog$3$1(spaceMenuLogOrigin2, function02);
                bfm.Ai0(objAaT3);
            }
            int i7 = iA0d & 14;
            int i8 = iA0d << 12;
            HatchRenameDialogKt.HatchRenameDialog(str, strA01, strA012, strA013, strA0r, g0u, function03, function04, bRg2, false, 0, null, true, (Function0) objAaT3, bfm, AnonymousClass001.A09(i8, i7 | (i8 & 458752)), 384, 3584);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(str, g0u, function0, function02, bRg2, spaceMenuLogOrigin2, i, i2);
        }
    }
}
