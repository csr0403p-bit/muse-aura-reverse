package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C03X;
import X.C1Cj;
import X.C1V6;
import X.C1VW;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.G2j;
import com.facebook.aura.conversation.view.EmojiGridItem;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchReactionPickerBottomSheetKt$EmojiPickerContent$1$4$1 extends AbstractC7559F3s implements G0U<C1Cj, Unit> {
    public final /* synthetic */ List<EmojiGridItem> $gridItems;
    public final /* synthetic */ G0U<String, Unit> $onEmojiSelected;

    /* renamed from: com.facebook.aura.conversation.view.HatchReactionPickerBottomSheetKt$EmojiPickerContent$1$4$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Integer, Object> {
        public final /* synthetic */ List<EmojiGridItem> $gridItems;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(List<? extends EmojiGridItem> list) {
            super(1);
            this.$gridItems = list;
        }

        public final Object invoke(int i) {
            String str;
            StringBuilder sb;
            EmojiGridItem emojiGridItem = this.$gridItems.get(i);
            if (emojiGridItem instanceof EmojiGridItem.Header) {
                str = ((EmojiGridItem.Header) emojiGridItem).title;
                sb = new StringBuilder("header:");
            } else {
                if (!(emojiGridItem instanceof EmojiGridItem.Emoji)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = ((EmojiGridItem.Emoji) emojiGridItem).emoji;
                sb = new StringBuilder("emoji:");
                sb.append(i);
                sb.append(":");
            }
            return AnonymousClass001.A0v(str, sb);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(AnonymousClass001.A0F(num));
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchReactionPickerBottomSheetKt$EmojiPickerContent$1$4$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<C1V6, Integer, C1VW> {
        public final /* synthetic */ List<EmojiGridItem> $gridItems;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<? extends EmojiGridItem> list) {
            super(2);
            this.$gridItems = list;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ C1VW invoke(C1V6 c1v6, Integer num) {
            return new C1VW(m661invoke_orMbw(c1v6, AnonymousClass001.A0F(num)));
        }

        /* renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m661invoke_orMbw(C1V6 c1v6, int i) {
            int i2;
            EmojiGridItem emojiGridItem = this.$gridItems.get(i);
            if (emojiGridItem instanceof EmojiGridItem.Header) {
                i2 = 8;
            } else {
                if (!(emojiGridItem instanceof EmojiGridItem.Emoji)) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 1;
            }
            return i2;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchReactionPickerBottomSheetKt$EmojiPickerContent$1$4$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<Integer, Object> {
        public final /* synthetic */ List<EmojiGridItem> $gridItems;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(List<? extends EmojiGridItem> list) {
            super(1);
            this.$gridItems = list;
        }

        public final Object invoke(int i) {
            EmojiGridItem emojiGridItem = this.$gridItems.get(i);
            if (emojiGridItem instanceof EmojiGridItem.Header) {
                return "header";
            }
            if (emojiGridItem instanceof EmojiGridItem.Emoji) {
                return "emoji";
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(AnonymousClass001.A0F(num));
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchReactionPickerBottomSheetKt$EmojiPickerContent$1$4$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G2j<C03X, Integer, BFM, Integer, Unit> {
        public final /* synthetic */ List<EmojiGridItem> $gridItems;
        public final /* synthetic */ G0U<String, Unit> $onEmojiSelected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(List<? extends EmojiGridItem> list, G0U<? super String, Unit> g0u) {
            super(4);
            this.$gridItems = list;
            this.$onEmojiSelected = g0u;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0126  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.C03X r31, int r32, X.BFM r33, int r34) {
            /*
                Method dump skipped, instructions count: 372
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchReactionPickerBottomSheetKt$EmojiPickerContent$1$4$1.AnonymousClass4.invoke(X.03X, int, X.BFM, int):void");
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C03X c03x, Integer num, BFM bfm, Integer num2) {
            invoke(c03x, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C1Cj c1Cj) {
        C7384Etj.A0Y(c1Cj, 0);
        int size = this.$gridItems.size();
        List<EmojiGridItem> list = this.$gridItems;
        c1Cj.APM(new AnonymousClass1(list), new AnonymousClass3(list), new AnonymousClass2(list), AnonymousClass001.A0M(new AnonymousClass4(list, this.$onEmojiSelected), -2026641060), size);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchReactionPickerBottomSheetKt$EmojiPickerContent$1$4$1(List<? extends EmojiGridItem> list, G0U<? super String, Unit> g0u) {
        super(1);
        this.$gridItems = list;
        this.$onEmojiSelected = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C1Cj c1Cj) {
        invoke2(c1Cj);
        return Unit.INSTANCE;
    }
}
