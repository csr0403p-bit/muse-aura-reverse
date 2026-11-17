package com.facebook.aura.library.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass037;
import X.BFM;
import X.C78N;
import X.G0W;
import com.facebook.aura.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$GoalCardList$2$1$1$3 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public final /* synthetic */ boolean $isLoadingMoreTracking;
    public final /* synthetic */ Function0<Unit> $onExpandTopSection;
    public final /* synthetic */ Function0<Unit> $onLoadMoreTracking;
    public final /* synthetic */ int $trackingHiddenCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabScreenKt$GoalCardList$2$1$1$3(boolean z, int i, Function0<Unit> function0, Function0<Unit> function02) {
        super(3);
        this.$isLoadingMoreTracking = z;
        this.$trackingHiddenCount = i;
        this.$onExpandTopSection = function0;
        this.$onLoadMoreTracking = function02;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            bfm.Afo();
            return;
        }
        String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a92);
        boolean z = this.$isLoadingMoreTracking;
        boolean zA1R = AnonymousClass001.A1R(bfm, this.$onLoadMoreTracking, AnonymousClass001.A1R(bfm, this.$onExpandTopSection, bfm.A63(this.$trackingHiddenCount)));
        int i2 = this.$trackingHiddenCount;
        Function0<Unit> function0 = this.$onExpandTopSection;
        Function0<Unit> function02 = this.$onLoadMoreTracking;
        Object objAaT = bfm.AaT();
        if (zA1R || objAaT == C78N.A00) {
            objAaT = new HatchGoalsTabScreenKt$GoalCardList$2$1$1$3$1$1(i2, function0, function02);
            bfm.Ai0(objAaT);
        }
        HatchGoalsTabScreenKt.ShowMoreRow(strA01, z, (Function0) objAaT, null, bfm, 0, 8);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
