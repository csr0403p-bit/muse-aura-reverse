package com.facebook.aura.conversation.view.richcontent;

import X.AHD;
import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BNt;
import X.C0981AMm;
import X.C1BO;
import X.C7384Etj;
import com.facebook.aura.model.HatchContentViewModelData;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchRichResponseContentKt$HatchRichResponseContent$3$onItemCompleted$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AHD<HatchContentViewModelData> $contentViewModelData;
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnContentCompleted$delegate;
    public final /* synthetic */ int $index;
    public final /* synthetic */ C0981AMm<Integer, Boolean> $renderingCompletedIndices;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchRichResponseContentKt$HatchRichResponseContent$3$onItemCompleted$1$1(C0981AMm<Integer, Boolean> c0981AMm, int i, AHD<? extends HatchContentViewModelData> ahd, C1BO<? extends Function0<Unit>> c1bo) {
        super(0);
        this.$renderingCompletedIndices = c0981AMm;
        this.$index = i;
        this.$contentViewModelData = ahd;
        this.$currentOnContentCompleted$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C0981AMm<Integer, Boolean> c0981AMm = this.$renderingCompletedIndices;
        Integer numValueOf = Integer.valueOf(this.$index);
        Boolean boolA0i = AnonymousClass001.A0i();
        c0981AMm.put(numValueOf, boolA0i);
        Iterable iterableA12 = AbstractC0885AGm.A12(this.$contentViewModelData);
        C0981AMm<Integer, Boolean> c0981AMm2 = this.$renderingCompletedIndices;
        if (!(iterableA12 instanceof Collection) || !((Collection) iterableA12).isEmpty()) {
            Iterator<Integer> it = iterableA12.iterator();
            while (it.hasNext()) {
                if (!C7384Etj.areEqual(c0981AMm2.get(Integer.valueOf(((BNt) it).A00())), boolA0i)) {
                    return;
                }
            }
        }
        Function0 function0A0A = C1BO.A0A(this.$currentOnContentCompleted$delegate);
        if (function0A0A != null) {
            function0A0A.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
