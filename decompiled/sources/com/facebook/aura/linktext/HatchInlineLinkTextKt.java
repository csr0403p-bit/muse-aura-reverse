package com.facebook.aura.linktext;

import X.AbstractC1699Aoe;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.ApQ;
import X.B6A;
import X.BGe;
import X.C1697Aoc;
import X.C1731ApS;
import X.C1736ApY;
import X.C1809ArT;
import X.C1824Aro;
import X.C7384Etj;
import X.C7BY;
import X.G0U;
import X.InterfaceC1702Aoh;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchInlineLinkTextKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* renamed from: buildInlineLinkText-XO-JAsU, reason: not valid java name */
    public static final ApQ m1187buildInlineLinkTextXOJAsU(String str, String str2, long j, String str3, final Function0<Unit> function0) {
        int iA02 = 0;
        C7384Etj.A0Y(str, 0);
        int i = str3;
        AnonymousClass005.A12(str2, i, function0, 1);
        C1736ApY c1736ApY = C1736ApY.A03;
        long j2 = C1809ArT.A01;
        C1824Aro c1824Aro = new C1824Aro(null, null, null, null, null, c1736ApY, null, null, null, null, null, j, j2, j2, B6A.A07);
        int iA0B = C7BY.A0B(str, str2, 0, false);
        C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
        try {
            try {
                if (iA0B < 0) {
                    int iA01 = c1731ApSA0W.A01(new BGe(new InterfaceC1702Aoh() { // from class: com.facebook.aura.linktext.HatchInlineLinkTextKt$buildInlineLinkText$1$1
                        @Override // X.InterfaceC1702Aoh
                        public final void onClick(AbstractC1699Aoe abstractC1699Aoe) {
                            function0.invoke();
                        }
                    }, null, i));
                    iA02 = c1731ApSA0W.A02(c1824Aro);
                    c1731ApSA0W.A0E(str);
                    c1731ApSA0W.A06(iA02);
                } else {
                    AnonymousClass005.A0s(c1731ApSA0W, str, 0, iA0B);
                    int iA012 = c1731ApSA0W.A01(new BGe(new InterfaceC1702Aoh() { // from class: com.facebook.aura.linktext.HatchInlineLinkTextKt$buildInlineLinkText$1$3
                        @Override // X.InterfaceC1702Aoh
                        public final void onClick(AbstractC1699Aoe abstractC1699Aoe) {
                            function0.invoke();
                        }
                    }, null, i));
                    iA02 = c1731ApSA0W.A02(c1824Aro);
                    c1731ApSA0W.A0E(str2);
                    c1731ApSA0W.A06(iA012);
                    c1731ApSA0W.A0E(str.substring(iA0B + str2.length()));
                    i = iA012;
                }
                return c1731ApSA0W.A04();
            } finally {
            }
        } finally {
            c1731ApSA0W.A06(i);
        }
    }

    /* renamed from: buildClauseText-bw27NRU, reason: not valid java name */
    public static final ApQ m1186buildClauseTextbw27NRU(List<HatchClauseRun> list, long j, final G0U<? super String, Unit> g0u) {
        AnonymousClass003.A0v(list, g0u);
        C1697Aoc c1697AocM1191hatchLinkStylesek8zF_U = HatchLinkTextKt.m1191hatchLinkStylesek8zF_U(j, null, null);
        C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
        for (HatchClauseRun hatchClauseRun : list) {
            final String str = hatchClauseRun.token;
            if (str == null) {
                c1731ApSA0W.A0E(hatchClauseRun.text);
            } else {
                int iA01 = c1731ApSA0W.A01(new BGe(new InterfaceC1702Aoh() { // from class: com.facebook.aura.linktext.HatchInlineLinkTextKt$buildClauseText$1$1
                    @Override // X.InterfaceC1702Aoh
                    public final void onClick(AbstractC1699Aoe abstractC1699Aoe) {
                        g0u.invoke(str);
                    }
                }, c1697AocM1191hatchLinkStylesek8zF_U, str));
                try {
                    c1731ApSA0W.A0E(hatchClauseRun.text);
                } finally {
                    c1731ApSA0W.A06(iA01);
                }
            }
        }
        return c1731ApSA0W.A04();
    }
}
