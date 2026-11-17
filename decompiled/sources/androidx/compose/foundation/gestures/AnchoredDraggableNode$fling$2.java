package androidx.compose.foundation.gestures;

import X.AbstractC07127nr;
import X.AcX;
import X.AnonymousClass001;
import X.BLD;
import X.C1051ASv;
import X.C2307BTh;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.F60;
import X.G0W;
import X.HtJ;
import X.Hwg;
import X.InterfaceC1153Acj;
import com.facebook.aura.auth.credentialmanager.MC;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Add missing generic type declarations: [T] */
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2", f = "AnchoredDraggable.kt", l = {MC.frl_google_credential_manager.__CONFIG__}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class AnchoredDraggableNode$fling$2<T> extends AbstractC07127nr implements G0W<AcX, InterfaceC1153Acj<T>, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1051ASv $leftoverVelocity;
    public final /* synthetic */ float $velocity;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnchoredDraggableNode<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/gestures/AnchoredDraggableNode<TT;>;LX/ASv;FLX/HtJ<-Landroidx/compose/foundation/gestures/AnchoredDraggableNode$fling$2;>;)V */
    public AnchoredDraggableNode$fling$2(AnchoredDraggableNode anchoredDraggableNode, HtJ htJ, C1051ASv c1051ASv, float f) {
        super(3, htJ);
        this.this$0 = anchoredDraggableNode;
        this.$leftoverVelocity = c1051ASv;
        this.$velocity = f;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(AcX acX, Object obj, HtJ<? super Unit> htJ) {
        AnchoredDraggableNode$fling$2 anchoredDraggableNode$fling$2 = new AnchoredDraggableNode$fling$2(this.this$0, htJ, this.$leftoverVelocity, this.$velocity);
        anchoredDraggableNode$fling$2.L$0 = acX;
        return anchoredDraggableNode$fling$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C1051ASv c1051ASv;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            Object obj2 = this.L$0;
            AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
            C2307BTh c2307BTh = new C2307BTh(0, obj2, anchoredDraggableNode);
            BLD bld = anchoredDraggableNode.A01;
            if (bld == null) {
                C7384Etj.A0b("resolvedFlingBehavior");
                throw F60.createAndThrow();
            }
            c1051ASv = this.$leftoverVelocity;
            float f = this.$velocity;
            this.L$0 = c1051ASv;
            this.label = 1;
            obj = bld.AXo(c2307BTh, this, f);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            c1051ASv = (C1051ASv) this.L$0;
            Hwg.A00(obj);
        }
        c1051ASv.element = AnonymousClass001.A02(obj);
        return Unit.INSTANCE;
    }
}
