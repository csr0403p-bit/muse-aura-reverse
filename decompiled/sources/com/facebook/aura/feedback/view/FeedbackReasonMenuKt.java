package com.facebook.aura.feedback.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.feedback.FeedbackReason;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class FeedbackReasonMenuKt {
    public static final int MENU_DISLIKE = 3;
    public static final int MENU_DIVIDER = 5;
    public static final int MENU_HIDE = 4;
    public static final int MENU_NOT_RELEVANT = 0;
    public static final int MENU_TOO_REPETITIVE = 1;
    public static final int MENU_TOO_SPECIFIC = 2;
    public static final int MENU_WRITE = 6;

    /* renamed from: com.facebook.aura.feedback.view.FeedbackReasonMenuKt$FeedbackReasonMenu$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ G0V<FeedbackReason, String, Unit> $onReason;
        public final /* synthetic */ Function0<Unit> $onWriteSomething;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function0<Unit> function0, G0V<? super FeedbackReason, ? super String, Unit> g0v, Function0<Unit> function02, BRg bRg, Function0<Unit> function03, int i, int i2) {
            super(2);
            this.$onDismiss = function0;
            this.$onReason = g0v;
            this.$onWriteSomething = function02;
            this.$modifier = bRg;
            this.$onDismissRequest = function03;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedbackReasonMenuKt.FeedbackReasonMenu(this.$onDismiss, this.$onReason, this.$onWriteSomething, this.$modifier, this.$onDismissRequest, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FeedbackReasonMenu(kotlin.jvm.functions.Function0<kotlin.Unit> r27, X.G0V<? super com.facebook.aura.feedback.FeedbackReason, ? super java.lang.String, kotlin.Unit> r28, kotlin.jvm.functions.Function0<kotlin.Unit> r29, X.BRg r30, kotlin.jvm.functions.Function0<kotlin.Unit> r31, X.BFM r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feedback.view.FeedbackReasonMenuKt.FeedbackReasonMenu(kotlin.jvm.functions.Function0, X.G0V, kotlin.jvm.functions.Function0, X.BRg, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }

    public static final FeedbackReason reasonForMenuId(int i) {
        if (i == 0) {
            return FeedbackReason.NOT_RELEVANT;
        }
        if (i == 1) {
            return FeedbackReason.TOO_REPETITIVE;
        }
        if (i == 2) {
            return FeedbackReason.TOO_SPECIFIC;
        }
        if (i == 3) {
            return FeedbackReason.DISLIKE;
        }
        if (i != 4) {
            return null;
        }
        return FeedbackReason.HIDE;
    }
}
