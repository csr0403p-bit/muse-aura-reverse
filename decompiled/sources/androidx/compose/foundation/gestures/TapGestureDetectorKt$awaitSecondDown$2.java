package androidx.compose.foundation.gestures;

import X.AbstractC07117nq;
import X.C1299Agk;
import X.G0V;
import X.HtJ;
import X.InterfaceC1074AXb;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderStateMachine;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {HatchLinkOrderStateMachine.MAX_EMAIL_LENGTH}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$awaitSecondDown$2 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super C1299Agk>, Object> {
    public final /* synthetic */ C1299Agk $firstUp;
    public long J$0;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$awaitSecondDown$2(C1299Agk c1299Agk, HtJ<? super TapGestureDetectorKt$awaitSecondDown$2> htJ) {
        super(2, htJ);
        this.$firstUp = c1299Agk;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$2 = new TapGestureDetectorKt$awaitSecondDown$2(this.$firstUp, htJ);
        tapGestureDetectorKt$awaitSecondDown$2.L$0 = obj;
        return tapGestureDetectorKt$awaitSecondDown$2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super C1299Agk> htJ) {
        return ((TapGestureDetectorKt$awaitSecondDown$2) create(interfaceC1074AXb, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003d -> B:6:0x0012). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r7 = 1
            if (r0 == 0) goto L1b
            if (r0 != r7) goto L40
            long r2 = r9.J$0
            java.lang.Object r6 = r9.L$0
            X.AXb r6 = (X.InterfaceC1074AXb) r6
            X.Hwg.A00(r10)
        L12:
            X.Agk r10 = (X.C1299Agk) r10
            long r4 = r10.A0E
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L31
            return r10
        L1b:
            X.Hwg.A00(r10)
            java.lang.Object r6 = r9.L$0
            X.AXb r6 = (X.InterfaceC1074AXb) r6
            X.Agk r0 = r9.$firstUp
            long r2 = r0.A0E
            r0 = r6
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r0
            X.AaN r0 = r0.A04
            X.AbstractC1414Aij.A04(r0)
            r0 = 40
            long r2 = r2 + r0
        L31:
            r9.L$0 = r6
            r9.J$0 = r2
            r9.label = r7
            X.AXj r0 = X.EnumC1080AXj.A04
            java.lang.Object r10 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A04(r6, r0, r9, r7)
            if (r10 != r8) goto L12
            return r8
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
