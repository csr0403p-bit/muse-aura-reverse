package com.facebook.aura.skills.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C07C;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class SkillReconnectRowKt {

    /* renamed from: com.facebook.aura.skills.view.SkillReconnectRowKt$SkillReconnectRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isReconnecting;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onReconnect;
        public final /* synthetic */ C07C $this_SkillReconnectRow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C07C c07c, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$this_SkillReconnectRow = c07c;
            this.$isReconnecting = z;
            this.$onReconnect = function0;
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
            SkillReconnectRowKt.SkillReconnectRow(this.$this_SkillReconnectRow, this.$isReconnecting, this.$onReconnect, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void SkillReconnectRow(C07C c07c, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        AnonymousClass002.A1A(c07c, 0, function0);
        bfm.AgG(-748305886);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f8d);
            boolean zA1R = AnonymousClass001.A1R(bfm, strA01, AnonymousClass003.A1E(iA0d)) | AnonymousClass003.A1C(iA0d) | ((iA0d & 896) == 256);
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new SkillReconnectRowKt$SkillReconnectRow$1$1(bRg, strA01, z, function0);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0q(c07c, (G0U) objAaT, bfm, iA0d & 14);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(c07c, z, function0, bRg, i, i2);
        }
    }
}
