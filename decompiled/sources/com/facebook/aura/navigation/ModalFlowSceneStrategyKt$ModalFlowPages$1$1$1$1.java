package com.facebook.aura.navigation;

import X.ANR;
import X.ANU;
import X.ANi;
import X.APt;
import X.AQI;
import X.AQJ;
import X.ASj;
import X.AbstractC1011APs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BRL;
import X.C05463bs;
import X.C1003AOr;
import X.C7384Etj;
import X.C8j3;
import X.G0U;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes4.dex */
public final class ModalFlowSceneStrategyKt$ModalFlowPages$1$1$1$1<T> extends AbstractC7559F3s implements G0U<ANi<BRL<T>>, ANU> {
    public final /* synthetic */ List<BRL<T>> $flowEntries;

    /* renamed from: com.facebook.aura.navigation.ModalFlowSceneStrategyKt$ModalFlowPages$1$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Integer, Integer> {
        public final /* synthetic */ int $direction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i) {
            super(1);
            this.$direction = i;
        }

        public final Integer invoke(int i) {
            return Integer.valueOf((i / 4) * this.$direction);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(AnonymousClass001.A0F(num));
        }
    }

    /* renamed from: com.facebook.aura.navigation.ModalFlowSceneStrategyKt$ModalFlowPages$1$1$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<Integer, Integer> {
        public final /* synthetic */ int $direction;

        public final Integer invoke(int i) {
            return Integer.valueOf(((-i) / 4) * this.$direction);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(1);
            this.$direction = i;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(AnonymousClass001.A0F(num));
        }
    }

    @Override // X.G0U
    public final ANU invoke(ANi<BRL<T>> aNi) {
        int i;
        C7384Etj.A0Y(aNi, 0);
        List<BRL<T>> list = this.$flowEntries;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = -1;
        } else {
            Iterator<BRL<T>> it = list.iterator();
            while (it.hasNext()) {
                if (C7384Etj.areEqual(it.next().A00, aNi.AGR().A00)) {
                    i = 1;
                    break;
                }
            }
            i = -1;
        }
        ASj<Float> aSj = ModalFlowSceneStrategyKt.pageFadeSpec;
        AQI aqiA04 = AbstractC1011APs.A04(aSj, 0.0f);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i);
        long jA0N = C8j3.A0N();
        AQI aqiA00 = aqiA04.A00(AbstractC1011APs.A08(new C1003AOr(C8j3.A0l(jA0N), 1.0f, 400.0f), anonymousClass1));
        AQJ aqjA0E = AbstractC1011APs.A0E(aSj);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(i);
        C1003AOr c1003AOr = new C1003AOr(C8j3.A0l(jA0N), 1.0f, 400.0f);
        C05463bs c05463bs = new C05463bs(anonymousClass2, 8);
        APt aPt = APt.A00;
        return ANR.A00(aqiA00, aqjA0E.A00(new AQJ(AbstractC1011APs.A0J(c1003AOr, c05463bs))));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalFlowSceneStrategyKt$ModalFlowPages$1$1$1$1(List<BRL<T>> list) {
        super(1);
        this.$flowEntries = list;
    }
}
