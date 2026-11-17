package com.facebook.aura.shopping.view;

import X.AKQ;
import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C1515AkP;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ShoppingLinkMenuButtonKt {

    /* renamed from: com.facebook.aura.shopping.view.ShoppingLinkMenuButtonKt$ShoppingLinkMenuButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onOpen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$label = str;
            this.$onOpen = function0;
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
            ShoppingLinkMenuButtonKt.ShoppingLinkMenuButton(this.$label, this.$onOpen, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ShoppingLinkMenuButton(String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(str, function0);
        bfm.AgG(-1232651159);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.arrowexport_outline_24_wght600, 0);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, i4);
            AVy aVyA002 = BOf.A00(bfm, R.drawable.ellipsis_wght400_outline_24, 0);
            String strA0i = AnonymousClass005.A0i(bfm);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = new ShoppingLinkMenuButtonKt$ShoppingLinkMenuButton$1$1$1(mutableState);
                bfm.Ai0(objAaT2);
            }
            AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(aVyA002, strA0i, (Function0) objAaT2, null, false, 0.0f, null, null, null, false, false, bfm, AVy.$stable | 384, 0, 2040);
            boolean zA0A = MutableState.A0A(mutableState);
            boolean zA1N = AnonymousClass001.A1N(iA0d);
            Object objAaT3 = bfm.AaT();
            if (zA1N || objAaT3 == obj) {
                objAaT3 = new ShoppingLinkMenuButtonKt$ShoppingLinkMenuButton$1$2$1(function0, mutableState);
                bfm.Ai0(objAaT3);
            }
            G0U g0u = (G0U) objAaT3;
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = new ShoppingLinkMenuButtonKt$ShoppingLinkMenuButton$1$3$1(mutableState);
                bfm.Ai0(objAaT4);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(null, g0u, (Function0) objAaT4, zA0A, null, 0L, null, false, new ShoppingLinkMenuButtonKt$ShoppingLinkMenuButton$1$4(str, aVyA00), false, null, null, null, false, bfm, 384, 0, 16113);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, function0, bRg2, i, i2);
        }
    }
}
