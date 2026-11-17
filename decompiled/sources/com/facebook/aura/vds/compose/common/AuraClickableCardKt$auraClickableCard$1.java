package com.facebook.aura.vds.compose.common;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.BRg;
import X.C0dx;
import X.C0v5;
import X.C1YD;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import X.InterfaceC1072AWd;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraClickableCardKt$auraClickableCard$1 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, BRg> {
    public final /* synthetic */ InterfaceC1072AWd $interactionSource;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ Function0<Unit> $onLongClick;
    public final /* synthetic */ int $role;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraClickableCardKt$auraClickableCard$1(Function0<Unit> function0, Function0<Unit> function02, InterfaceC1072AWd interfaceC1072AWd, int i) {
        super(3);
        this.$onClick = function0;
        this.$onLongClick = function02;
        this.$interactionSource = interfaceC1072AWd;
        this.$role = i;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ BRg invoke(BRg bRg, BFM bfm, Integer num) {
        return invoke(bRg, bfm, AnonymousClass001.A0F(num));
    }

    public final BRg invoke(BRg bRg, BFM bfm, int i) {
        BRg bRgA01;
        C7384Etj.A0Y(bRg, 0);
        bfm.AgE(993810773);
        C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
        boolean zA1R = AnonymousClass001.A1R(bfm, this.$onClick, bfm.A67(c0dxA0T));
        Function0<Unit> function0 = this.$onClick;
        Object objAaT = bfm.AaT();
        if (zA1R || objAaT == C78N.A00) {
            objAaT = new AuraClickableCardKt$auraClickableCard$1$tapWithHaptic$1$1(c0dxA0T, function0);
            bfm.Ai0(objAaT);
        }
        Function0 function02 = (Function0) objAaT;
        Function0<Unit> function03 = this.$onLongClick;
        InterfaceC1072AWd interfaceC1072AWd = this.$interactionSource;
        C1YD c1yd = new C1YD(this.$role);
        if (function03 != null) {
            bRgA01 = C0v5.A00(null, interfaceC1072AWd, bRg, c1yd, null, null, function03, function02, true);
        } else {
            bRgA01 = C0v5.A01(null, interfaceC1072AWd, bRg, c1yd, null, function02, true);
        }
        AnonymousClass001.A1D(bfm);
        return bRgA01;
    }
}
