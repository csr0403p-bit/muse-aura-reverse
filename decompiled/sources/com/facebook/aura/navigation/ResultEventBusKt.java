package com.facebook.aura.navigation;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0V;
import X.HtJ;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class ResultEventBusKt {

    /* renamed from: com.facebook.aura.navigation.ResultEventBusKt$ResultEffect$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<T, HtJ<? super Unit>, Object> $onResult;
        public final /* synthetic */ ResultEventBus $resultEventBus;
        public final /* synthetic */ String $resultKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, ResultEventBus resultEventBus, G0V<? super T, ? super HtJ<? super Unit>, ? extends Object> g0v, int i, int i2) {
            super(2);
            this.$resultKey = str;
            this.$resultEventBus = resultEventBus;
            this.$onResult = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ResultEventBusKt.ResultEffect(this.$resultKey, this.$resultEventBus, this.$onResult, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final <T> ResultEventBusNavEntryDecorator<T> rememberResultEventBusNavEntryDecorator(ResultEventBus resultEventBus, BFM bfm, int i, int i2) {
        boolean z = true;
        if ((i2 & 1) != 0) {
            resultEventBus = rememberResultEventBus(bfm, 0);
        }
        if ((((i & 14) ^ 6) <= 4 || !bfm.A65(resultEventBus)) && (i & 6) != 4) {
            z = false;
        }
        Object objAaT = bfm.AaT();
        if (z || objAaT == C78N.A00) {
            objAaT = new ResultEventBusNavEntryDecorator(resultEventBus);
            bfm.Ai0(objAaT);
        }
        return (ResultEventBusNavEntryDecorator) objAaT;
    }

    public static final /* synthetic */ <T> void ResultEffect(ResultEventBus resultEventBus, G0V<? super T, ? super HtJ<? super Unit>, ? extends Object> g0v, BFM bfm, int i, int i2) {
        if ((i2 & 1) != 0) {
            LocalResultEventBus.INSTANCE.getCurrent(bfm, 6);
        }
        C7384Etj.A0Q();
        throw F60.createAndThrow();
    }

    public static final ResultEventBus rememberResultEventBus(BFM bfm, int i) {
        Object objAaT = bfm.AaT();
        if (objAaT == C78N.A00) {
            objAaT = new ResultEventBus();
            bfm.Ai0(objAaT);
        }
        return (ResultEventBus) objAaT;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void ResultEffect(java.lang.String r9, com.facebook.aura.navigation.ResultEventBus r10, X.G0V<? super T, ? super X.HtJ<? super kotlin.Unit>, ? extends java.lang.Object> r11, X.BFM r12, int r13, int r14) {
        /*
            r7 = r9
            r8 = r10
            r9 = r11
            X.AnonymousClass003.A0v(r7, r11)
            r0 = -2104208908(0xffffffff829451f4, float:-2.1793684E-37)
            r12.AgG(r0)
            r10 = r13
            r0 = r13 & 6
            if (r0 != 0) goto Lc4
            int r4 = X.AnonymousClass004.A0d(r12, r7)
            r4 = r4 | r13
        L16:
            r0 = r13 & 48
            r5 = 32
            r11 = r14
            if (r0 != 0) goto L2c
            r0 = r14 & 2
            if (r0 != 0) goto L29
            boolean r1 = r12.A65(r8)
            r0 = 32
            if (r1 != 0) goto L2b
        L29:
            r0 = 16
        L2b:
            r4 = r4 | r0
        L2c:
            r0 = r13 & 384(0x180, float:5.38E-43)
            r3 = 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L3b
            boolean r0 = X.AnonymousClass004.A1Z(r9, r12, r13)
            int r0 = X.AnonymousClass003.A05(r0)
            r4 = r4 | r0
        L3b:
            r1 = r4 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            r6 = 0
            boolean r0 = X.AnonymousClass002.A1P(r1, r0)
            boolean r0 = X.AnonymousClass001.A1b(r0, r12, r4)
            if (r0 == 0) goto Lc0
            r12.Afy()
            r0 = r13 & 1
            if (r0 == 0) goto Lb4
            boolean r0 = r12.AEk()
            if (r0 != 0) goto Lb4
            r12.Afo()
            r0 = r14 & 2
            if (r0 == 0) goto L60
        L5e:
            r4 = r4 & (-113(0xffffffffffffff8f, float:NaN))
        L60:
            r12.AAb()
            X.AMm<java.lang.String, X.HzR<java.lang.Object>> r0 = r8.channelMap
            java.lang.Object r2 = r0.get(r7)
            r0 = r4 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            if (r0 <= r5) goto L75
            boolean r0 = r12.A65(r8)
            if (r0 != 0) goto L7a
        L75:
            r1 = r4 & 48
            r0 = 0
            if (r1 != r5) goto L7b
        L7a:
            r0 = 1
        L7b:
            boolean r1 = X.AnonymousClass003.A1B(r4)
            r1 = r1 | r0
            r0 = r4 & 896(0x380, float:1.256E-42)
            if (r0 == r3) goto L8e
            r0 = r4 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L8f
            boolean r0 = r12.A67(r9)
            if (r0 == 0) goto L8f
        L8e:
            r6 = 1
        L8f:
            r1 = r1 | r6
            java.lang.Object r0 = r12.AaT()
            if (r1 != 0) goto L9a
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto La3
        L9a:
            r1 = 0
            com.facebook.aura.navigation.ResultEventBusKt$ResultEffect$1$1 r0 = new com.facebook.aura.navigation.ResultEventBusKt$ResultEffect$1$1
            r0.<init>(r8, r7, r9, r1)
            r12.Ai0(r0)
        La3:
            X.AnonymousClass001.A1A(r12, r0, r7, r2)
        La6:
            X.BBb r0 = r12.AAc()
            if (r0 == 0) goto Lb3
            com.facebook.aura.navigation.ResultEventBusKt$ResultEffect$2 r6 = new com.facebook.aura.navigation.ResultEventBusKt$ResultEffect$2
            r6.<init>(r7, r8, r9, r10, r11)
            r0.A06 = r6
        Lb3:
            return
        Lb4:
            r0 = r14 & 2
            if (r0 == 0) goto L60
            com.facebook.aura.navigation.LocalResultEventBus r1 = com.facebook.aura.navigation.LocalResultEventBus.INSTANCE
            r0 = 6
            com.facebook.aura.navigation.ResultEventBus r8 = r1.getCurrent(r12, r0)
            goto L5e
        Lc0:
            r12.Afo()
            goto La6
        Lc4:
            r4 = r13
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.navigation.ResultEventBusKt.ResultEffect(java.lang.String, com.facebook.aura.navigation.ResultEventBus, X.G0V, X.BFM, int, int):void");
    }
}
