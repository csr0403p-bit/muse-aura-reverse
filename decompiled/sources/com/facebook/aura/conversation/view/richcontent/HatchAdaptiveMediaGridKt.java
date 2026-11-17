package com.facebook.aura.conversation.view.richcontent;

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
import X.BRg;
import X.C00x;
import X.C06G;
import X.C0v5;
import X.C11U;
import X.C1515AkP;
import X.C1D3;
import X.C1D8;
import X.C1YD;
import X.C1b8;
import X.C78N;
import X.F60;
import X.G0V;
import X.G2k;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchAdaptiveMediaGridKt {
    public static final int HATCH_MEDIA_GRID_MAX_TILES = 4;
    public static final C1D3 HatchMediaGridCellShape = C1D8.A00(6.0f);
    public static final int MEDIA_GRID_SINGLE_ROW_MAX = 3;

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchAdaptiveMediaGridKt$HatchAdaptiveMediaGrid$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G2k<Integer, BRg, Boolean, BFM, Integer, Unit> $cell;
        public final /* synthetic */ int $count;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $overflowDescription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(int i, String str, BRg bRg, G2k<? super Integer, ? super BRg, ? super Boolean, ? super BFM, ? super Integer, Unit> g2k, int i2, int i3) {
            super(2);
            this.$count = i;
            this.$overflowDescription = str;
            this.$modifier = bRg;
            this.$cell = g2k;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAdaptiveMediaGridKt.HatchAdaptiveMediaGrid(this.$count, this.$overflowDescription, this.$modifier, this.$cell, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchAdaptiveMediaGridKt$MediaGridOverflow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $description;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ int $overflowCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i, String str, Function0<Unit> function0, BRg bRg, int i2, int i3) {
            super(2);
            this.$overflowCount = i;
            this.$description = str;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAdaptiveMediaGridKt.MediaGridOverflow(this.$overflowCount, this.$description, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01a7 A[LOOP:2: B:52:0x018f->B:58:0x01a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0269 A[EDGE_INSN: B:87:0x0269->B:74:0x0269 BREAK  A[LOOP:2: B:52:0x018f->B:58:0x01a7], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchAdaptiveMediaGrid(int r34, java.lang.String r35, X.BRg r36, X.G2k<? super java.lang.Integer, ? super X.BRg, ? super java.lang.Boolean, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r37, X.BFM r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.richcontent.HatchAdaptiveMediaGridKt.HatchAdaptiveMediaGrid(int, java.lang.String, X.BRg, X.G2k, X.BFM, int, int):void");
    }

    public static final void MediaGridOverflow(int i, String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-606014540);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0V(bfm, function0);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0D |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0D), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA04 = C0v5.A04(C1b8.A01(C11U.A03(bRg2, HatchMediaGridCellShape), AnonymousClass002.A0c(bfm).scrim), new C1YD(0), null, function0, true);
            boolean zA1C = AnonymousClass003.A1C(iA0D);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new HatchAdaptiveMediaGridKt$MediaGridOverflow$1$1(str);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA04, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0D2);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, Integer.valueOf(i), R.string._name_removed__res_0x7f120872), null, AnonymousClass002.A0c(bfm).onMedia, C06G.A0U(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(i, str, function0, bRg2, i2, i3);
        }
    }

    public static final C1D3 getHatchMediaGridCellShape() {
        return HatchMediaGridCellShape;
    }
}
