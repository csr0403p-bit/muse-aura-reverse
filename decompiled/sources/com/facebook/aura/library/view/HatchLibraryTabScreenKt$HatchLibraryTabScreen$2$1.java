package com.facebook.aura.library.view;

import X.AFs;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.library.view.HatchLibraryTabScreenKt$HatchLibraryTabScreen$2$1", f = "HatchLibraryTabScreen.kt", l = {HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchLibraryTabScreenKt$HatchLibraryTabScreen$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<String> $lastSortTabKey$delegate;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ String $sortTabKey;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLibraryTabScreenKt$HatchLibraryTabScreen$2$1(String str, LazyListState lazyListState, MutableState<String> mutableState, HtJ<? super HatchLibraryTabScreenKt$HatchLibraryTabScreen$2$1> htJ) {
        super(2, htJ);
        this.$sortTabKey = str;
        this.$listState = lazyListState;
        this.$lastSortTabKey$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchLibraryTabScreenKt$HatchLibraryTabScreen$2$1(this.$sortTabKey, this.$listState, this.$lastSortTabKey$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            String str = this.$sortTabKey;
            MutableState<String> mutableState = this.$lastSortTabKey$delegate;
            int i2 = HatchLibraryTabScreenKt.ARTIFACTS_TAB_INDEX;
            if (!MutableState.A0B(mutableState, str)) {
                this.$lastSortTabKey$delegate.Af8(this.$sortTabKey);
                LazyListState lazyListState = this.$listState;
                this.label = 1;
                AFs<LazyListState, ?> aFs = LazyListState.A0Q;
                if (lazyListState.A06(0, 0, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchLibraryTabScreenKt$HatchLibraryTabScreen$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
