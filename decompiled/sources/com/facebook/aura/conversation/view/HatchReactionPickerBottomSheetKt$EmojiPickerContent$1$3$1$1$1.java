package com.facebook.aura.conversation.view;

import X.AFs;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BU9;
import X.C00r;
import X.C3UX;
import X.C3UY;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchReactionPickerBottomSheetKt$EmojiPickerContent$1$3$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ LazyGridState $gridState;
    public final /* synthetic */ List<Integer> $headerIndices;
    public final /* synthetic */ int $index;
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ C00r $selectedCategoryIndex$delegate;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchReactionPickerBottomSheetKt$EmojiPickerContent$1$3$1$1$1$1", f = "HatchReactionPickerBottomSheet.kt", l = {299}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchReactionPickerBottomSheetKt$EmojiPickerContent$1$3$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ LazyGridState $gridState;
        public final /* synthetic */ int $headerIndex;
        public final /* synthetic */ List<Integer> $headerIndices;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyGridState lazyGridState, List<Integer> list, int i, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$gridState = lazyGridState;
            this.$headerIndices = list;
            this.$headerIndex = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$gridState, this.$headerIndices, this.$headerIndex, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LazyGridState lazyGridState = this.$gridState;
                int iA0F = AnonymousClass001.A0F(this.$headerIndices.get(this.$headerIndex));
                this.label = 1;
                AFs<LazyGridState, ?> aFs = LazyGridState.A0O;
                Object objAcF = lazyGridState.AcF(C3UY.A02, this, new BU9(lazyGridState, null, iA0F, 0, 1));
                if (objAcF != enumC10460Hji) {
                    objAcF = Unit.INSTANCE;
                }
                if (objAcF == enumC10460Hji) {
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

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchReactionPickerBottomSheetKt$EmojiPickerContent$1$3$1$1$1(boolean z, Map<String, String> map, int i, List<Integer> list, C3UX c3ux, C00r c00r, LazyGridState lazyGridState) {
        super(0);
        this.$isPrimaryThread = z;
        this.$threadLogMetadata = map;
        this.$index = i;
        this.$headerIndices = list;
        this.$coroutineScope = c3ux;
        this.$selectedCategoryIndex$delegate = c00r;
        this.$gridState = lazyGridState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchReactionPickerBottomSheetKt.logCategoryTabClick(this.$isPrimaryThread, this.$threadLogMetadata);
        this.$selectedCategoryIndex$delegate.AdX(this.$index);
        int i = this.$index + 1;
        if (i < this.$headerIndices.size()) {
            AnonymousClass001.A1J(new AnonymousClass1(this.$gridState, this.$headerIndices, i, null), this.$coroutineScope);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
