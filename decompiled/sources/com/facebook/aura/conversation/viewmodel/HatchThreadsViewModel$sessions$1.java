package com.facebook.aura.conversation.viewmodel;

import X.AGI;
import X.AHD;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.EnumC10460Hji;
import X.G2j;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.conversation.repo.LoadingState;
import com.facebook.aura.conversation.repo.ThreadsView;
import com.facebook.aura.gateway.HatchSessionItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchThreadsViewModel$sessions$1", f = "HatchThreadsViewModel.kt", l = {R.styleable.maplibre_MapView_maplibre_uiRotateGestures}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchThreadsViewModel$sessions$1 extends AbstractC07127nr implements G2j<AHD<? extends HatchSessionItem>, LoadingState, String, HtJ<? super AHD<? extends HatchSessionItem>>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public int label;
    public final /* synthetic */ HatchThreadsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchThreadsViewModel$sessions$1(HatchThreadsViewModel hatchThreadsViewModel, HtJ<? super HatchThreadsViewModel$sessions$1> htJ) {
        super(4, htJ);
        this.this$0 = hatchThreadsViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(AHD<HatchSessionItem> ahd, LoadingState loadingState, String str, HtJ<? super AHD<HatchSessionItem>> htJ) {
        HatchThreadsViewModel$sessions$1 hatchThreadsViewModel$sessions$1 = new HatchThreadsViewModel$sessions$1(this.this$0, htJ);
        hatchThreadsViewModel$sessions$1.L$0 = ahd;
        hatchThreadsViewModel$sessions$1.L$1 = loadingState;
        hatchThreadsViewModel$sessions$1.L$2 = str;
        return hatchThreadsViewModel$sessions$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        Object obj2 = this.L$1;
        Object obj3 = this.L$2;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.this$0.view != ThreadsView.ACTIVE || !list.isEmpty() || obj2 == LoadingState.SUCCESS) {
                return list;
            }
            HatchThreadsViewModel hatchThreadsViewModel = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = obj3;
            this.label = 1;
            obj = hatchThreadsViewModel.loadCachedThreadsOrEmpty(this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : (Iterable) obj) {
            AnonymousClass006.A1O(((HatchSessionItem) obj4).sessionId, obj3, obj4, arrayList);
        }
        return AGI.A07(arrayList);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Object invoke(AHD<? extends HatchSessionItem> ahd, LoadingState loadingState, String str, HtJ<? super AHD<? extends HatchSessionItem>> htJ) {
        return invoke2((AHD<HatchSessionItem>) ahd, loadingState, str, (HtJ<? super AHD<HatchSessionItem>>) htJ);
    }
}
