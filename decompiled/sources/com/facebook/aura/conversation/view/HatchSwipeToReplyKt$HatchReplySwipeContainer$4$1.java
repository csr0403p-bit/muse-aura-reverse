package com.facebook.aura.conversation.view;

import X.AbstractC07117nq;
import X.AbstractC1439Aj8;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BRr;
import X.C00q;
import X.C0dx;
import X.C10543Hqv;
import X.C1BO;
import X.C3UX;
import X.G0U;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.InterfaceC1074AXb;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchSwipeToReplyKt$HatchReplySwipeContainer$4$1 implements PointerInputEventHandler {
    public final /* synthetic */ C1BO<HatchMessageUiModel> $currentMessage$delegate;
    public final /* synthetic */ C1BO<G0U<HatchMessageUiModel, Unit>> $currentOnReply$delegate;
    public final /* synthetic */ C1BO<Map<String, String>> $currentThreadLogMetadata$delegate;
    public final /* synthetic */ C0dx $haptics;
    public final /* synthetic */ C1BO<Boolean> $isListScrolling;
    public final /* synthetic */ ReplySwipeMetrics $metrics;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ MutableState<Boolean> $textSelectionActive;
    public final /* synthetic */ float $towardsReply;
    public final /* synthetic */ C00q $translationPx;

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchSwipeToReplyKt$HatchReplySwipeContainer$4$1$1", f = "HatchSwipeToReply.kt", l = {198, 212}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchSwipeToReplyKt$HatchReplySwipeContainer$4$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
        public final /* synthetic */ float $activationPx;
        public final /* synthetic */ C1BO<HatchMessageUiModel> $currentMessage$delegate;
        public final /* synthetic */ C1BO<G0U<HatchMessageUiModel, Unit>> $currentOnReply$delegate;
        public final /* synthetic */ C1BO<Map<String, String>> $currentThreadLogMetadata$delegate;
        public final /* synthetic */ C0dx $haptics;
        public final /* synthetic */ C1BO<Boolean> $isListScrolling;
        public final /* synthetic */ ReplySwipeMetrics $metrics;
        public final /* synthetic */ float $postArmReleasePx;
        public final /* synthetic */ C3UX $scope;
        public final /* synthetic */ C10543Hqv<HoC> $settleJob;
        public final /* synthetic */ MutableState<Boolean> $textSelectionActive;
        public final /* synthetic */ float $towardsReply;
        public final /* synthetic */ C00q $translationPx;
        public final /* synthetic */ float $verticalVetoPx;
        public float F$0;
        public float F$1;
        public int I$0;
        public int I$1;
        public int I$2;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C1BO<Boolean> c1bo, MutableState<Boolean> mutableState, float f, float f2, float f3, C10543Hqv<HoC> c10543Hqv, float f4, ReplySwipeMetrics replySwipeMetrics, C00q c00q, C0dx c0dx, C1BO<? extends G0U<? super HatchMessageUiModel, Unit>> c1bo2, C1BO<HatchMessageUiModel> c1bo3, C1BO<? extends Map<String, String>> c1bo4, C3UX c3ux, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$isListScrolling = c1bo;
            this.$textSelectionActive = mutableState;
            this.$towardsReply = f;
            this.$verticalVetoPx = f2;
            this.$activationPx = f3;
            this.$settleJob = c10543Hqv;
            this.$postArmReleasePx = f4;
            this.$metrics = replySwipeMetrics;
            this.$translationPx = c00q;
            this.$haptics = c0dx;
            this.$currentOnReply$delegate = c1bo2;
            this.$currentMessage$delegate = c1bo3;
            this.$currentThreadLogMetadata$delegate = c1bo4;
            this.$scope = c3ux;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isListScrolling, this.$textSelectionActive, this.$towardsReply, this.$verticalVetoPx, this.$activationPx, this.$settleJob, this.$postArmReleasePx, this.$metrics, this.$translationPx, this.$haptics, this.$currentOnReply$delegate, this.$currentMessage$delegate, this.$currentThreadLogMetadata$delegate, this.$scope, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[Catch: all -> 0x0175, TRY_LEAVE, TryCatch #0 {all -> 0x0175, blocks: (B:24:0x0073, B:25:0x0076, B:26:0x007e, B:28:0x0084, B:33:0x0099, B:35:0x009d, B:37:0x00a3, B:40:0x00ab, B:42:0x00d0, B:44:0x00de, B:21:0x0057, B:55:0x0107, B:58:0x0114, B:60:0x011d, B:62:0x012b, B:50:0x00f3, B:52:0x00fe, B:66:0x013a, B:68:0x0148), top: B:81:0x0073 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x009d A[Catch: all -> 0x0175, TryCatch #0 {all -> 0x0175, blocks: (B:24:0x0073, B:25:0x0076, B:26:0x007e, B:28:0x0084, B:33:0x0099, B:35:0x009d, B:37:0x00a3, B:40:0x00ab, B:42:0x00d0, B:44:0x00de, B:21:0x0057, B:55:0x0107, B:58:0x0114, B:60:0x011d, B:62:0x012b, B:50:0x00f3, B:52:0x00fe, B:66:0x013a, B:68:0x0148), top: B:81:0x0073 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ab A[Catch: all -> 0x0175, TryCatch #0 {all -> 0x0175, blocks: (B:24:0x0073, B:25:0x0076, B:26:0x007e, B:28:0x0084, B:33:0x0099, B:35:0x009d, B:37:0x00a3, B:40:0x00ab, B:42:0x00d0, B:44:0x00de, B:21:0x0057, B:55:0x0107, B:58:0x0114, B:60:0x011d, B:62:0x012b, B:50:0x00f3, B:52:0x00fe, B:66:0x013a, B:68:0x0148), top: B:81:0x0073 }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x017b  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0098 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v12, types: [T, X.HoC] */
        /* JADX WARN: Type inference failed for: r0v6, types: [T, X.HoC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006f -> B:25:0x0076). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 397
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchSwipeToReplyKt$HatchReplySwipeContainer$4$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(interfaceC1074AXb, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final HoC invoke$launchSettleBack(C3UX c3ux, C00q c00q) {
        return AnonymousClass001.A11(new HatchSwipeToReplyKt$HatchReplySwipeContainer$4$1$launchSettleBack$1(c00q, null), c3ux);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchSwipeToReplyKt$HatchReplySwipeContainer$4$1(C1BO<Boolean> c1bo, MutableState<Boolean> mutableState, float f, ReplySwipeMetrics replySwipeMetrics, C00q c00q, C0dx c0dx, C1BO<? extends G0U<? super HatchMessageUiModel, Unit>> c1bo2, C1BO<HatchMessageUiModel> c1bo3, C1BO<? extends Map<String, String>> c1bo4, C3UX c3ux) {
        this.$isListScrolling = c1bo;
        this.$textSelectionActive = mutableState;
        this.$towardsReply = f;
        this.$metrics = replySwipeMetrics;
        this.$translationPx = c00q;
        this.$haptics = c0dx;
        this.$currentOnReply$delegate = c1bo2;
        this.$currentMessage$delegate = c1bo3;
        this.$currentThreadLogMetadata$delegate = c1bo4;
        this.$scope = c3ux;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
        AbstractC1439Aj8 abstractC1439Aj8 = (AbstractC1439Aj8) bRr;
        float fA01 = AnonymousClass006.A01(abstractC1439Aj8) * 2.0f;
        float fA012 = AnonymousClass006.A01(abstractC1439Aj8) * 0.75f;
        float fA013 = AnonymousClass006.A01(abstractC1439Aj8) * 2.5f;
        return AnonymousClass006.A0l(bRr, htJ, new AnonymousClass1(this.$isListScrolling, this.$textSelectionActive, this.$towardsReply, fA012, fA01, new C10543Hqv(), fA013, this.$metrics, this.$translationPx, this.$haptics, this.$currentOnReply$delegate, this.$currentMessage$delegate, this.$currentThreadLogMetadata$delegate, this.$scope, null));
    }
}
