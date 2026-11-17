package com.facebook.aura.markdown.render;

import X.AKQ;
import X.AYU;
import X.AZE;
import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C0v5;
import X.C11U;
import X.C1515AkP;
import X.C1736ApY;
import X.C1822Arm;
import X.C19U;
import X.C2VU;
import X.C3Ue;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AuraExpandableMarkdownTextKt {
    public static final long MarkdownBodyLineHeight = C19U.A03(24);
    public static final String SLOT_CONTENT = "content";
    public static final String SLOT_PROBE = "probe";
    public static final String SLOT_SEE_MORE = "seeMore";

    /* JADX WARN: Removed duplicated region for block: B:9:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC1134Abi AuraExpandableMarkdownText_FV1VA1c$lambda$4$0(final X.C1822Arm r17, int r18, final java.lang.String r19, final X.B6A r20, final androidx.compose.runtime.MutableState r21, final kotlin.jvm.functions.Function0 r22, X.C3Su r23, androidx.compose.ui.unit.Constraints r24) {
        /*
            r0 = 6
            r8 = r23
            X.C7384Etj.A0Y(r8, r0)
            r0 = r24
            long r4 = r0.A00
            r12 = 0
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r11 = androidx.compose.ui.unit.Constraints.A03(r4)
            int r7 = androidx.compose.ui.unit.Constraints.A01(r4)
            long r1 = androidx.compose.ui.unit.Constraints.A05(r11, r7, r12, r0)
            com.facebook.aura.markdown.render.AuraExpandableMarkdownTextKt$$ExternalSyntheticLambda2 r3 = new com.facebook.aura.markdown.render.AuraExpandableMarkdownTextKt$$ExternalSyntheticLambda2
            r6 = r19
            r0 = r20
            r9 = r17
            r3.<init>()
            r0 = -1489055905(0xffffffffa73ecf5f, float:-2.6480213E-15)
            r13 = 1
            X.B1U r6 = X.B1U.A03(r3, r0, r13)
            X.Arh r0 = r9.A00
            long r9 = r0.A04
            long r16 = X.C1809ArT.A01(r9)
            r14 = 4294967296(0x100000000, double:2.121995791E-314)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            boolean r0 = X.AnonymousClass002.A1M(r0)
            r3 = 0
            if (r0 != 0) goto L45
            long r9 = com.facebook.aura.markdown.render.AuraExpandableMarkdownTextKt.MarkdownBodyLineHeight
        L45:
            float r9 = r8.Ah3(r9)
            r0 = r18
            float r0 = (float) r0
            int r10 = X.Ab3.A02(r9, r0)
            java.lang.String r0 = "probe"
            java.util.List r0 = r8.AgZ(r0, r6)
            java.lang.Object r0 = X.AbstractC0878AGe.A0F(r0)
            X.3TG r0 = (X.C3TG) r0
            X.AZE r0 = r0.AQW(r1)
            int r14 = r0.A00
            r9 = r21
            boolean r15 = androidx.compose.runtime.MutableState.A0A(r9)
            r0 = 0
            if (r15 != 0) goto L6e
            r15 = 1
            if (r14 > r10) goto L6f
        L6e:
            r15 = 0
        L6f:
            com.facebook.aura.markdown.render.AuraExpandableMarkdownTextKt$$ExternalSyntheticLambda3 r14 = new com.facebook.aura.markdown.render.AuraExpandableMarkdownTextKt$$ExternalSyntheticLambda3
            r14.<init>()
            r6 = -1361750498(0xffffffffaed5561e, float:-9.701416E-11)
            X.B1U r14 = X.B1U.A03(r14, r6, r13)
            java.lang.String r6 = "content"
            java.util.List r6 = r8.AgZ(r6, r14)
            java.lang.Object r6 = X.AbstractC0878AGe.A0F(r6)
            X.3TG r6 = (X.C3TG) r6
            if (r15 == 0) goto L8d
            long r1 = androidx.compose.ui.unit.Constraints.A05(r11, r7, r12, r10)
        L8d:
            X.AZE r6 = r6.AQW(r1)
            if (r15 == 0) goto Lb9
            com.facebook.aura.markdown.render.AuraExpandableMarkdownTextKt$$ExternalSyntheticLambda4 r2 = new com.facebook.aura.markdown.render.AuraExpandableMarkdownTextKt$$ExternalSyntheticLambda4
            r1 = r22
            r2.<init>()
            r1 = 2078442376(0x7be28388, float:2.3522537E36)
            X.B1U r2 = X.B1U.A03(r2, r1, r13)
            java.lang.String r1 = "seeMore"
            java.util.List r1 = r8.AgZ(r1, r2)
            java.lang.Object r3 = X.AbstractC0878AGe.A0F(r1)
            X.3TG r3 = (X.C3TG) r3
            int r1 = androidx.compose.ui.unit.Constraints.A00(r4)
            long r1 = androidx.compose.ui.unit.Constraints.A05(r11, r7, r12, r1)
            X.AZE r3 = r3.AQW(r1)
        Lb9:
            boolean r1 = androidx.compose.ui.unit.Constraints.A0A(r4)
            if (r1 != 0) goto Lc1
            int r7 = r6.A01
        Lc1:
            int r1 = r6.A00
            if (r3 == 0) goto Lc7
            int r0 = r3.A00
        Lc7:
            int r1 = r1 + r0
            com.facebook.aura.markdown.render.AuraExpandableMarkdownTextKt$$ExternalSyntheticLambda5 r0 = new com.facebook.aura.markdown.render.AuraExpandableMarkdownTextKt$$ExternalSyntheticLambda5
            r0.<init>()
            X.Abi r0 = X.AXY.A01(r8, r0, r7, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.markdown.render.AuraExpandableMarkdownTextKt.AuraExpandableMarkdownText_FV1VA1c$lambda$4$0(X.Arm, int, java.lang.String, X.B6A, androidx.compose.runtime.MutableState, kotlin.jvm.functions.Function0, X.3Su, androidx.compose.ui.unit.Constraints):X.Abi");
    }

    public static final Unit AuraExpandableMarkdownText_FV1VA1c$lambda$4$0$4(AZE aze, AZE aze2, AYU ayu) {
        C7384Etj.A0Y(ayu, 2);
        ayu.A0A(aze, 0.0f, 0, 0);
        if (aze2 != null) {
            ayu.A0A(aze2, 0.0f, 0, aze.A00);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e3  */
    /* renamed from: AuraExpandableMarkdownText-FV1VA1c, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1365AuraExpandableMarkdownTextFV1VA1c(final java.lang.String r21, final kotlin.jvm.functions.Function0<kotlin.Unit> r22, X.BRg r23, int r24, X.C1822Arm r25, X.B6A r26, X.BFM r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.markdown.render.AuraExpandableMarkdownTextKt.m1365AuraExpandableMarkdownTextFV1VA1c(java.lang.String, kotlin.jvm.functions.Function0, X.BRg, int, X.Arm, X.B6A, X.BFM, int, int):void");
    }

    public static final Unit AuraExpandableMarkdownText_FV1VA1c$lambda$4$0$0(String str, C1822Arm c1822Arm, B6A b6a, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AuraMarkdownTextKt.m1368AuraMarkdownTextrAaX7yc(str, null, c1822Arm, false, null, null, b6a, null, null, false, false, null, bfm, 0, 0, 4026);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AuraExpandableMarkdownText_FV1VA1c$lambda$4$0$2(G0V g0v, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            BRg bRgA00 = C11U.A00(BRg.A00);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            AnonymousClass001.A1H(bfm, g0v, 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AuraExpandableMarkdownText_FV1VA1c$lambda$4$0$3(final Function0 function0, final MutableState mutableState, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            boolean zA1K = AnonymousClass003.A1K(bfm, function0, mutableState);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = new Function0() { // from class: com.facebook.aura.markdown.render.AuraExpandableMarkdownTextKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AuraExpandableMarkdownTextKt.AuraExpandableMarkdownText_FV1VA1c$lambda$4$0$3$0$0(function0, mutableState);
                    }
                };
                BBI.A0T(bfm, objAaT);
            }
            SeeMoreLabel((Function0) objAaT, null, bfm, 0, 2);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final void SeeMoreLabel(final Function0<Unit> function0, BRg bRg, BFM bfm, final int i, final int i2) {
        final BRg bRg2 = bRg;
        bfm.AgG(1351810073);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA04 = C0v5.A04(AnonymousClass006.A0O(bRg2), C3cG.A0A(0), null, function0, true);
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A0B, false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120cd7);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, C1736ApY.A05, null, false, 0, 0, 0, null, null, null, bfm, 196608, 0, 16338);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.markdown.render.AuraExpandableMarkdownTextKt$$ExternalSyntheticLambda0
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    Function0 function03 = function0;
                    BRg bRg3 = bRg2;
                    int i4 = i;
                    int i5 = i2;
                    String str = AuraExpandableMarkdownTextKt.SLOT_CONTENT;
                    AuraExpandableMarkdownTextKt.SeeMoreLabel(function03, bRg3, (BFM) obj, AnonymousClass011.A00(i4), i5);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit AuraExpandableMarkdownText_FV1VA1c$lambda$0(String str, Function0 function0, BRg bRg, int i, C1822Arm c1822Arm, B6A b6a, int i2, int i3, BFM bfm, int i4) {
        m1365AuraExpandableMarkdownTextFV1VA1c(str, function0, bRg, i, c1822Arm, b6a, bfm, AnonymousClass011.A00(i2), i3);
        return Unit.INSTANCE;
    }

    public static final Unit AuraExpandableMarkdownText_FV1VA1c$lambda$4$0$3$0$0(Function0 function0, MutableState mutableState) {
        function0.invoke();
        MutableState.A09(true, mutableState);
        return Unit.INSTANCE;
    }

    public static final Unit AuraExpandableMarkdownText_FV1VA1c$lambda$5(String str, Function0 function0, BRg bRg, int i, C1822Arm c1822Arm, B6A b6a, int i2, int i3, BFM bfm, int i4) {
        m1365AuraExpandableMarkdownTextFV1VA1c(str, function0, bRg, i, c1822Arm, b6a, bfm, AnonymousClass011.A00(i2), i3);
        return Unit.INSTANCE;
    }

    public static final Unit SeeMoreLabel$lambda$1(Function0 function0, BRg bRg, int i, int i2, BFM bfm, int i3) {
        SeeMoreLabel(function0, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}
