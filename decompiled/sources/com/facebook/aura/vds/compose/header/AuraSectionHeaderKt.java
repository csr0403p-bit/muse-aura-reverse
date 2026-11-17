package com.facebook.aura.vds.compose.header;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AcQ;
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
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0A8;
import X.C10G;
import X.C1515AkP;
import X.C2VU;
import X.C3U4;
import X.C7197Ei9;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraSectionHeaderKt {
    public static final float TrailingImageHeight = 12.0f;
    public static final float TrailingImageWidth = 48.0f;

    /* renamed from: com.facebook.aura.vds.compose.header.AuraSectionHeaderKt$AuraSectionHeader$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraDrawableSource $image;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, AuraDrawableSource auraDrawableSource, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$image = auraDrawableSource;
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
            AuraSectionHeaderKt.AuraSectionHeader(this.$title, this.$image, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.header.AuraSectionHeaderKt$AuraSectionHeader$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraDrawableSource $image;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, AuraDrawableSource auraDrawableSource, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$image = auraDrawableSource;
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
            AuraSectionHeaderKt.AuraSectionHeader(this.$title, this.$image, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.facebook.common.callercontext.ContextChain] */
    /* JADX WARN: Type inference failed for: r24v0, types: [X.Ej6] */
    public static final void AuraSectionHeader(String str, AuraDrawableSource auraDrawableSource, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass3;
        BS0 bs0;
        C7197Ei9 c7197Ei9;
        boolean z;
        BRg bRgA0Q = bRg;
        bfm.AgG(-1533210398);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(auraDrawableSource, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            if (str == null && auraDrawableSource == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(str, auraDrawableSource, bRgA0Q, i, i2);
                    bBbAAc.A06 = anonymousClass3;
                }
                return;
            }
            BRg bRgA0B = C3U4.A0B(AnonymousClass001.A0R(bRgA0Q), AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingXsmall);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A04, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            if (str != null) {
                bfm.AgE(-1982885680);
                bs0 = BRg.A00;
                c7197Ei9 = null;
                z = true;
                BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = AuraSectionHeaderKt$AuraSectionHeader$2$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bRgAiP, objAaT, false), C06G.A08(bfm), AnonymousClass002.A0f(bfm).footnoteMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-1982668773);
                bs0 = BRg.A00;
                c7197Ei9 = null;
                z = true;
                C01N.A07(bfm, c90m.AiP(bs0, 1.0f, true));
                BBI.A0R(bbi, false);
            }
            if (auraDrawableSource == null) {
                bfm.AgE(-1982611734);
            } else {
                bfm.AgE(-1982611733);
                AuraImageKt.AuraImage(auraDrawableSource, C10G.A0C(bs0, TrailingImageWidth, TrailingImageHeight), c7197Ei9, c7197Ei9, false, false, c7197Ei9, false, c7197Ei9, bfm, 48, 508);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, z);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(str, auraDrawableSource, bRgA0Q, i, i2);
            bBbAAc.A06 = anonymousClass3;
        }
    }
}
