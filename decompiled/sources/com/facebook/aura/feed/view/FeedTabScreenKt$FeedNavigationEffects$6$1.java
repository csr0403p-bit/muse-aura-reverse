package com.facebook.aura.feed.view;

import X.AFs;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.feed.repo.FeedUnit;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.feed.view.FeedTabScreenKt$FeedNavigationEffects$6$1", f = "FeedTabScreen.kt", l = {601}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedNavigationEffects$6$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ SnapshotStateList<FeedUnit> $feedItems;
    public final /* synthetic */ MutableState<Integer> $handledScrollToUnitToken$delegate;
    public final /* synthetic */ int $headerItemCount;
    public final /* synthetic */ SnapshotStateList<FeedUnit> $infiniteItems;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ String $scrollToUnitId;
    public final /* synthetic */ int $scrollToUnitToken;
    public int I$0;
    public int I$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedNavigationEffects$6$1(int i, SnapshotStateList<FeedUnit> snapshotStateList, SnapshotStateList<FeedUnit> snapshotStateList2, LazyListState lazyListState, int i2, MutableState<Integer> mutableState, String str, HtJ<? super FeedTabScreenKt$FeedNavigationEffects$6$1> htJ) {
        super(2, htJ);
        this.$scrollToUnitToken = i;
        this.$feedItems = snapshotStateList;
        this.$infiniteItems = snapshotStateList2;
        this.$listState = lazyListState;
        this.$headerItemCount = i2;
        this.$handledScrollToUnitToken$delegate = mutableState;
        this.$scrollToUnitId = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FeedTabScreenKt$FeedNavigationEffects$6$1(this.$scrollToUnitToken, this.$feedItems, this.$infiniteItems, this.$listState, this.$headerItemCount, this.$handledScrollToUnitToken$delegate, this.$scrollToUnitId, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int size;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$scrollToUnitToken > MutableState.A02((MutableState) this.$handledScrollToUnitToken$delegate)) {
                MutableState.A07(this.$scrollToUnitToken, this.$handledScrollToUnitToken$delegate);
                SnapshotStateList<FeedUnit> snapshotStateList = this.$feedItems;
                String str = this.$scrollToUnitId;
                Iterator it = snapshotStateList.iterator();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    if (!C7384Etj.areEqual(((FeedUnit) it.next()).getId(), str)) {
                        i3++;
                    } else if (i3 >= 0) {
                        size = i3;
                    }
                }
                SnapshotStateList<FeedUnit> snapshotStateList2 = this.$infiniteItems;
                String str2 = this.$scrollToUnitId;
                Iterator it2 = snapshotStateList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (C7384Etj.areEqual(((FeedUnit) it2.next()).getId(), str2)) {
                        break;
                    }
                    i2++;
                }
                SnapshotStateList<FeedUnit> snapshotStateList3 = this.$feedItems;
                if (i2 >= 0 && (size = snapshotStateList3.size() + i2) >= 0) {
                    LazyListState lazyListState = this.$listState;
                    int i4 = this.$headerItemCount + size;
                    this.I$0 = i3;
                    this.I$1 = size;
                    this.label = 1;
                    AFs<LazyListState, ?> aFs = LazyListState.A0Q;
                    if (lazyListState.A06(i4, 0, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
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
        return ((FeedTabScreenKt$FeedNavigationEffects$6$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
