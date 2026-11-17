package com.facebook.aura.file.view;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0A8;
import X.C0CD;
import X.C10G;
import X.C1515AkP;
import X.C1736ApY;
import X.C1822Arm;
import X.C1DI;
import X.C1OM;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.F60;
import X.G0U;
import X.G2j;
import X.HDi;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.file.spreadsheet.SpreadsheetSheet;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpreadsheetContentViewKt$SpreadsheetContent$4$2$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ SpreadsheetSheet $currentSheet;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        final List<List<String>> list = this.$currentSheet.rows;
        c0cd.APL(null, new G0U<Integer, Object>() { // from class: com.facebook.aura.file.view.SpreadsheetContentViewKt$SpreadsheetContent$4$2$1$1$invoke$$inlined$itemsIndexed$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                list.get(AnonymousClass001.A0F(num));
                return null;
            }

            public final Object invoke(int i) {
                list.get(i);
                return null;
            }
        }, AnonymousClass001.A0M(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.file.view.SpreadsheetContentViewKt$SpreadsheetContent$4$2$1$1$invoke$$inlined$itemsIndexed$default$3
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                BBI bbiA0M;
                BRg bRgA00;
                C1822Arm c1822ArmA00;
                int iA0d = (i2 & 6) == 0 ? i2 | AnonymousClass004.A0d(bfm, anonymousClass037) : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                List list2 = (List) list.get(i);
                bfm.AgE(22265924);
                boolean zA1M = AnonymousClass002.A1M(i);
                BS0 bs0 = BRg.A00;
                if (zA1M) {
                    bRgA00 = C1b8.A00(bs0, 0.08f, AnonymousClass003.A0c(bfm, 22375787).secondaryText);
                    bbiA0M = (BBI) bfm;
                    BBI.A0R(bbiA0M, false);
                } else {
                    bbiA0M = AnonymousClass002.A0M(bfm, 22576109);
                    bRgA00 = bs0;
                }
                long jA08 = C06G.A08(bfm);
                BRg bRgA02 = C1DI.A02(bRgA00, C1OM.A00, 0.5f, HxS.A04(HDi.A0O[(int) (jA08 & 63)], B6A.A03(jA08), B6A.A02(jA08), B6A.A01(jA08), 0.2f));
                float f = AuraDimensKt.SpacingXsmall;
                BRg bRgA0B = C3U4.A0B(bRgA02, f, f);
                InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A05, 0);
                int iA0J = AnonymousClass003.A0J(bbiA0M);
                AKQ akqA04 = BBI.A04(bbiA0M);
                BRg bRgA01 = AxM.A01(bfm, bRgA0B);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbiA0M.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbiA0M, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                Iterator itA0w = AnonymousClass001.A0w(bfm, list2, -694182577);
                while (itA0w.hasNext()) {
                    String strA0j = AnonymousClass005.A0j(itA0w);
                    if (zA1M) {
                        c1822ArmA00 = C1822Arm.A00(null, AnonymousClass006.A0k(bfm, -272490457).footnoteEmphasized, null, null, C1736ApY.A01, null, null, null, null, null, 0, 0, 0, 16777211, 0L, 0L, 0L, 0L);
                        BBI.A0R(bbiA0M, false);
                    } else {
                        c1822ArmA00 = AnonymousClass006.A0k(bfm, -272358707).footnoteRegular;
                        BBI.A0R(bbiA0M, false);
                    }
                    AuraTextKt.m2639AuraTextUY9GdpU(strA0j, C3U4.A0C(C10G.A0D(bs0, 80.0f, 200.0f), 0.0f, 0.0f, AuraDimensKt.SpacingSmall, 0.0f), C06G.A0C(bfm), c1822ArmA00, null, null, null, false, 0, 3, 2, null, null, null, bfm, 805306368, 6, 14832);
                }
                AnonymousClass003.A0q(bbiA0M);
                BBI.A0R(bbiA0M, false);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 2039820996), list.size());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpreadsheetContentViewKt$SpreadsheetContent$4$2$1$1(SpreadsheetSheet spreadsheetSheet) {
        super(1);
        this.$currentSheet = spreadsheetSheet;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
