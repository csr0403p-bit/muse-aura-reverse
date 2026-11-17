package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.conversation.view.EmojiGridItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchReactionPickerBottomSheetKt$EmojiPickerContent$1$4$1$4$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ EmojiGridItem $item;
    public final /* synthetic */ G0U<String, Unit> $onEmojiSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchReactionPickerBottomSheetKt$EmojiPickerContent$1$4$1$4$1$1(G0U<? super String, Unit> g0u, EmojiGridItem emojiGridItem) {
        super(0);
        this.$onEmojiSelected = g0u;
        this.$item = emojiGridItem;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onEmojiSelected.invoke(((EmojiGridItem.Emoji) this.$item).emoji);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
