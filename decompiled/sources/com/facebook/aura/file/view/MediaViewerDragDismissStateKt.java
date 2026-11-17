package com.facebook.aura.file.view;

import X.AaM;
import X.AbstractC07117nq;
import X.AbstractC1396AiR;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BRg;
import X.BRr;
import X.C1b8;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.InterfaceC1074AXb;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.navigation.HatchDragDismissState;
import com.facebook.aura.navigation.HatchDragDismissStateKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import org.maplibre.android.R;

/* loaded from: classes.dex */
public abstract class MediaViewerDragDismissStateKt {

    /* renamed from: com.facebook.aura.file.view.MediaViewerDragDismissStateKt$mediaViewerDragDismissFade$1, reason: invalid class name and case insensitive filesystem */
    public final class C119861 extends AbstractC7559F3s implements G0U<C2av, Unit> {
        public final /* synthetic */ HatchDragDismissState $state;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C2av c2av) {
            C7384Etj.A0Y(c2av, 0);
            c2av.Acj(this.$state.getSurroundingContentAlpha());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119861(HatchDragDismissState hatchDragDismissState) {
            super(1);
            this.$state = hatchDragDismissState;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
            invoke2(c2av);
            return Unit.INSTANCE;
        }
    }

    public static final BRg mediaViewerDismissGesture(BRg bRg, final Function0<? extends MediaViewerDismissGestureMode> function0, final HatchDragDismissState hatchDragDismissState, final Function0<Unit> function02) {
        AnonymousClass005.A14(bRg, function0, hatchDragDismissState, function02);
        return AaM.A01(bRg, new PointerInputEventHandler() { // from class: com.facebook.aura.file.view.MediaViewerDragDismissStateKt.mediaViewerDismissGesture.1

            @DebugMetadata(c = "com.facebook.aura.file.view.MediaViewerDragDismissStateKt$mediaViewerDismissGesture$1$1", f = "MediaViewerDragDismissState.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight, R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.file.view.MediaViewerDragDismissStateKt$mediaViewerDismissGesture$1$1, reason: invalid class name and collision with other inner class name */
            public final class C01601 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
                public final /* synthetic */ float $dismissDistancePx;
                public final /* synthetic */ float $dismissFlingDistancePx;
                public final /* synthetic */ float $dismissFlingVelocityPx;
                public final /* synthetic */ Function0<MediaViewerDismissGestureMode> $mode;
                public final /* synthetic */ Function0<Unit> $onStaticSwipeDownDismiss;
                public final /* synthetic */ HatchDragDismissState $state;
                public int I$0;
                public long J$0;
                public /* synthetic */ Object L$0;
                public Object L$1;
                public Object L$2;
                public Object L$3;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C01601(Function0<? extends MediaViewerDismissGestureMode> function0, HatchDragDismissState hatchDragDismissState, float f, float f2, float f3, Function0<Unit> function02, HtJ<? super C01601> htJ) {
                    super(2, htJ);
                    this.$mode = function0;
                    this.$state = hatchDragDismissState;
                    this.$dismissDistancePx = f;
                    this.$dismissFlingDistancePx = f2;
                    this.$dismissFlingVelocityPx = f3;
                    this.$onStaticSwipeDownDismiss = function02;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C01601 c01601 = new C01601(this.$mode, this.$state, this.$dismissDistancePx, this.$dismissFlingDistancePx, this.$dismissFlingVelocityPx, this.$onStaticSwipeDownDismiss, htJ);
                    c01601.L$0 = obj;
                    return c01601;
                }

                /* JADX WARN: Removed duplicated region for block: B:100:0x01a5  */
                /* JADX WARN: Removed duplicated region for block: B:115:0x00a1 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x008d A[Catch: all -> 0x019f, TRY_LEAVE, TryCatch #2 {all -> 0x019f, blocks: (B:21:0x007a, B:22:0x007d, B:23:0x0087, B:25:0x008d, B:30:0x00a2, B:32:0x00a6, B:34:0x00c3, B:36:0x00ca, B:37:0x00cf, B:18:0x0060, B:40:0x00d5, B:42:0x00d9, B:44:0x00df, B:46:0x00e5, B:60:0x010c, B:64:0x0131, B:68:0x013a, B:70:0x013e, B:72:0x0146, B:49:0x00ec, B:50:0x00f1, B:52:0x00f7, B:54:0x0101, B:91:0x0194, B:92:0x019b, B:93:0x019c), top: B:114:0x007a }] */
                /* JADX WARN: Removed duplicated region for block: B:32:0x00a6 A[Catch: all -> 0x019f, TryCatch #2 {all -> 0x019f, blocks: (B:21:0x007a, B:22:0x007d, B:23:0x0087, B:25:0x008d, B:30:0x00a2, B:32:0x00a6, B:34:0x00c3, B:36:0x00ca, B:37:0x00cf, B:18:0x0060, B:40:0x00d5, B:42:0x00d9, B:44:0x00df, B:46:0x00e5, B:60:0x010c, B:64:0x0131, B:68:0x013a, B:70:0x013e, B:72:0x0146, B:49:0x00ec, B:50:0x00f1, B:52:0x00f7, B:54:0x0101, B:91:0x0194, B:92:0x019b, B:93:0x019c), top: B:114:0x007a }] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0076 -> B:22:0x007d). Please report as a decompilation issue!!! */
                @Override // X.AbstractC8884Fsp
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instructions count: 446
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.MediaViewerDragDismissStateKt.AnonymousClass1.C01601.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // X.G0V
                public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
                    return ((C01601) create(interfaceC1074AXb, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                return AnonymousClass006.A0l(bRr, htJ, new C01601(function0, hatchDragDismissState, bRr.Ah4(HatchDragDismissStateKt.HatchDragDismissDistance), bRr.Ah4(HatchDragDismissStateKt.HatchDragDismissFlingDistance), bRr.Ah4(HatchDragDismissStateKt.HatchDragDismissFlingVelocity), function02, null));
            }
        }, hatchDragDismissState, function02);
    }

    /* renamed from: mediaViewerDragDismissBackground-mxwnekA, reason: not valid java name */
    public static final BRg m921mediaViewerDragDismissBackgroundmxwnekA(BRg bRg, HatchDragDismissState hatchDragDismissState, long j) {
        AnonymousClass003.A0u(bRg, hatchDragDismissState);
        return C1b8.A01(AbstractC1396AiR.A00(bRg, new MediaViewerDragDismissStateKt$mediaViewerDragDismissBackground$1(hatchDragDismissState)), j);
    }

    public static final BRg mediaViewerDragDismissFade(BRg bRg, HatchDragDismissState hatchDragDismissState) {
        AnonymousClass003.A0u(bRg, hatchDragDismissState);
        return AbstractC1396AiR.A00(bRg, new C119861(hatchDragDismissState));
    }
}
