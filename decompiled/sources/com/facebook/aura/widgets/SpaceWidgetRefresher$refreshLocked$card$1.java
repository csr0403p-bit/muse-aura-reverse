package com.facebook.aura.widgets;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.spaces.repo.HatchSpacesDataSource;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.widgets.SpaceWidgetRefresher$refreshLocked$card$1", f = "SpaceWidgetRefresher.kt", l = {151}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class SpaceWidgetRefresher$refreshLocked$card$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchSpacesDataSource $dataSource;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceWidgetRefresher$refreshLocked$card$1(HatchSpacesDataSource hatchSpacesDataSource, HtJ<? super SpaceWidgetRefresher$refreshLocked$card$1> htJ) {
        super(2, htJ);
        this.$dataSource = hatchSpacesDataSource;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SpaceWidgetRefresher$refreshLocked$card$1(this.$dataSource, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new SpaceWidgetRefresher$refreshLocked$card$1(this.$dataSource, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchSpacesDataSource hatchSpacesDataSource = this.$dataSource;
            this.label = 1;
            if (hatchSpacesDataSource.loadSpacesData(false, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }
}
