package com.facebook.aura.feed.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1110AYw;
import X.C1805ArO;
import X.C1958Aux;
import X.C3UX;
import X.G0U;
import X.G0V;
import X.HtJ;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.feed.view.FeedInstructionsEditorKt$FeedInstructionsPromptField$1$1", f = "FeedInstructionsEditor.kt", l = {165, 176}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class FeedInstructionsEditorKt$FeedInstructionsPromptField$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ int $contentPadPx;
    public final /* synthetic */ C1110AYw $scrollState;
    public final /* synthetic */ C1805ArO $text;
    public final /* synthetic */ MutableState<C1958Aux> $textLayout$delegate;
    public final /* synthetic */ int $viewportPx;
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* renamed from: com.facebook.aura.feed.view.FeedInstructionsEditorKt$FeedInstructionsPromptField$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Long, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            return AnonymousClass001.A0x(l);
        }

        public final void invoke(long j) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedInstructionsEditorKt$FeedInstructionsPromptField$1$1(C1805ArO c1805ArO, int i, C1110AYw c1110AYw, int i2, MutableState<C1958Aux> mutableState, HtJ<? super FeedInstructionsEditorKt$FeedInstructionsPromptField$1$1> htJ) {
        super(2, htJ);
        this.$text = c1805ArO;
        this.$contentPadPx = i;
        this.$scrollState = c1110AYw;
        this.$viewportPx = i2;
        this.$textLayout$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FeedInstructionsEditorKt$FeedInstructionsPromptField$1$1(this.$text, this.$contentPadPx, this.$scrollState, this.$viewportPx, this.$textLayout$delegate, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r10.label
            r9 = 0
            r8 = 2
            r2 = 1
            if (r0 == 0) goto L13
            if (r0 == r2) goto L5d
            if (r0 != r8) goto Lb5
            X.Hwg.A00(r11)
        L10:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L13:
            X.Hwg.A00(r11)
            androidx.compose.runtime.MutableState<X.Aux> r0 = r10.$textLayout$delegate
            java.lang.Object r3 = r0.getValue()
            X.Aux r3 = (X.C1958Aux) r3
            if (r3 == 0) goto L10
            X.ArO r0 = r10.$text
            long r0 = r0.A00
            int r1 = X.AnonymousClass002.A09(r0)
            X.Ask r0 = r3.A04
            X.ApQ r0 = r0.A03
            int r0 = r0.length()
            int r0 = X.ATD.A04(r1, r9, r0)
            X.AaC r1 = r3.A06(r0)
            int r7 = r10.$contentPadPx
            float r0 = r1.A03
            int r0 = X.Ab3.A01(r0)
            int r6 = r7 + r0
            float r0 = r1.A00
            int r0 = X.Ab3.A01(r0)
            int r7 = r7 + r0
            com.facebook.aura.feed.view.FeedInstructionsEditorKt$FeedInstructionsPromptField$1$1$1 r1 = com.facebook.aura.feed.view.FeedInstructionsEditorKt$FeedInstructionsPromptField$1$1.AnonymousClass1.INSTANCE
            r0 = 0
            r10.L$0 = r0
            r10.L$1 = r0
            r10.I$0 = r6
            r10.I$1 = r7
            r10.label = r2
            java.lang.Object r0 = X.AvW.A01(r1, r10)
            if (r0 != r4) goto L64
            return r4
        L5d:
            int r7 = r10.I$1
            int r6 = r10.I$0
            X.Hwg.A00(r11)
        L64:
            X.AYw r0 = r10.$scrollState
            X.00r r0 = r0.A04
            int r5 = r0.AGd()
            int r1 = r10.$viewportPx
            int r3 = r5 + r1
            int r2 = r10.$contentPadPx
            int r0 = r3 - r2
            if (r7 <= r0) goto Lae
            int r1 = r7 - r1
            int r1 = r1 + r2
        L79:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            X.AYw r2 = r10.$scrollState
            int r1 = r0.intValue()
            X.00r r0 = r2.A01
            int r0 = r0.AGd()
            int r1 = X.ATD.A04(r1, r9, r0)
            r0 = 0
            r10.L$0 = r0
            r10.L$1 = r0
            r10.L$2 = r0
            r10.I$0 = r6
            r10.I$1 = r7
            r10.I$2 = r5
            r10.I$3 = r3
            r10.label = r8
            X.00r r0 = r2.A04
            int r0 = r0.AGd()
            int r1 = r1 - r0
            float r0 = (float) r1
            java.lang.Object r0 = androidx.compose.foundation.gestures.ScrollExtensionsKt.A02(r2, r10, r0)
            if (r0 != r4) goto L10
            return r4
        Lae:
            int r0 = r5 + r2
            if (r6 >= r0) goto L10
            int r1 = r6 - r2
            goto L79
        Lb5:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.view.FeedInstructionsEditorKt$FeedInstructionsPromptField$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((FeedInstructionsEditorKt$FeedInstructionsPromptField$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
