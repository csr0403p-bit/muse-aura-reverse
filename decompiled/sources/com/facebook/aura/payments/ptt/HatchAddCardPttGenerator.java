package com.facebook.aura.payments.ptt;

import X.HtJ;
import android.content.Context;
import java.util.List;

/* loaded from: classes4.dex */
public final class HatchAddCardPttGenerator {
    public static final HatchAddCardPttGenerator INSTANCE = new HatchAddCardPttGenerator();

    /* renamed from: generate-5p_uFSQ$default, reason: not valid java name */
    public static /* synthetic */ Object m1845generate5p_uFSQ$default(HatchAddCardPttGenerator hatchAddCardPttGenerator, Context context, List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, HtJ htJ, int i, Object obj) {
        if ((i & 512) != 0) {
            l = null;
        }
        return hatchAddCardPttGenerator.m1846generate5p_uFSQ(context, list, str, str2, str3, str4, str5, str6, str7, l, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* renamed from: generate-5p_uFSQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1846generate5p_uFSQ(android.content.Context r9, java.util.List<java.lang.String> r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Long r18, X.HtJ<? super X.HsJ<java.lang.String>> r19) {
        /*
            r8 = this;
            r3 = r19
            boolean r0 = r3 instanceof com.facebook.aura.payments.ptt.HatchAddCardPttGenerator$generate$1
            if (r0 == 0) goto L5f
            r4 = r3
            com.facebook.aura.payments.ptt.HatchAddCardPttGenerator$generate$1 r4 = (com.facebook.aura.payments.ptt.HatchAddCardPttGenerator$generate$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r4.label = r2
        L14:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L70
            X.Hwg.A00(r3)
        L22:
            X.HsJ r3 = (X.HsJ) r3
            if (r3 == 0) goto L65
            java.lang.Object r0 = r3.value
            return r0
        L29:
            X.Hwg.A00(r3)
            r0 = 0
            com.facebook.aura.payments.ptt.HatchAddCardPttGenerator$generate$2 r5 = new com.facebook.aura.payments.ptt.HatchAddCardPttGenerator$generate$2
            r6 = r9
            r9 = r11
            r8 = r12
            r7 = r13
            r11 = r14
            r12 = r15
            r13 = r16
            r14 = r17
            r15 = r18
            r16 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4.L$0 = r0
            r4.L$1 = r0
            r4.L$2 = r0
            r4.L$3 = r0
            r4.L$4 = r0
            r4.L$5 = r0
            r4.L$6 = r0
            r4.L$7 = r0
            r4.L$8 = r0
            r4.L$9 = r0
            r4.label = r1
            r0 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r3 = X.GAX.A01(r4, r5, r0)
            if (r3 != r2) goto L22
            return r2
        L5f:
            com.facebook.aura.payments.ptt.HatchAddCardPttGenerator$generate$1 r4 = new com.facebook.aura.payments.ptt.HatchAddCardPttGenerator$generate$1
            r4.<init>(r8, r3)
            goto L14
        L65:
            java.lang.String r0 = "PTT generation timed out"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            X.Hud r0 = X.C3cG.A0s(r0)
            return r0
        L70:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.payments.ptt.HatchAddCardPttGenerator.m1846generate5p_uFSQ(android.content.Context, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, X.HtJ):java.lang.Object");
    }
}
