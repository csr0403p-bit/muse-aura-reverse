package X;

import android.content.Context;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import com.meta.maps.core.MapsSdkProvider;
import com.meta.maps.display.MapsSdkProviderMapLibreExtKt;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BUB extends AbstractC07127nr implements G0U {
    public final int $t;
    public int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BUB(Object obj, SeekableTransitionState<S> seekableTransitionState, S s, AOP<S> aop, HtJ<? super BUB> htJ) {
        super(1, aop);
        this.$t = htJ;
        this.A03 = obj;
        this.A01 = s;
        this.A02 = seekableTransitionState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        Object obj;
        Object obj2;
        int i;
        int i2 = this.$t;
        Object obj3 = this.A03;
        switch (i2) {
            case 0:
                obj2 = this.A01;
                obj = this.A02;
                i = 0;
                break;
            case 1:
                obj = this.A02;
                obj2 = this.A01;
                i = 1;
                break;
            default:
                obj2 = this.A01;
                obj = this.A02;
                i = 2;
                break;
        }
        return new BUB(obj3, obj, obj2, htJ, i);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((BUB) create((HtJ) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        float f;
        switch (this.$t) {
            case 0:
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                if (this.A00 != 0) {
                    Hwg.A00(obj);
                } else {
                    Hwg.A00(obj);
                    SeekableTransitionState seekableTransitionState = (SeekableTransitionState) this.A03;
                    SeekableTransitionState.A05(seekableTransitionState);
                    seekableTransitionState.A01 = Long.MIN_VALUE;
                    C00q c00q = seekableTransitionState.A0A;
                    c00q.AdS(0.0f);
                    Object obj2 = this.A01;
                    if (C7384Etj.areEqual(obj2, seekableTransitionState.A09())) {
                        f = -4.0f;
                    } else {
                        f = -3.0f;
                        if (C7384Etj.areEqual(obj2, seekableTransitionState.A0A())) {
                            f = -5.0f;
                        }
                    }
                    AOP aop = (AOP) this.A02;
                    aop.A0C(obj2);
                    aop.A09(0L);
                    seekableTransitionState.A0C.Af8(obj2);
                    c00q.AdS(0.0f);
                    seekableTransitionState.A08(obj2);
                    aop.A07(f);
                    if (f == -3.0f) {
                        this.A00 = 1;
                        if (SeekableTransitionState.A03(seekableTransitionState, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    }
                }
                ((AOP) this.A02).A05();
                break;
            case 1:
                EnumC10460Hji enumC10460Hji2 = EnumC10460Hji.A02;
                if (this.A00 != 0) {
                    Hwg.A00(obj);
                } else {
                    Hwg.A00(obj);
                    AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) this.A03;
                    anchoredDraggableState.A0B.Af8(this.A02);
                    C2292BSs c2292BSsA00 = C2292BSs.A00(anchoredDraggableState, 23);
                    BUC buc = new BUC(anchoredDraggableState, (HtJ) null, this.A01, (HtJ<? super BUC>) 7);
                    this.A00 = 1;
                    if (AnchoredDraggableKt.A04(this, c2292BSsA00, buc) == enumC10460Hji2) {
                        return enumC10460Hji2;
                    }
                }
                AnchoredDraggableState anchoredDraggableState2 = (AnchoredDraggableState) this.A03;
                G0U<? super T, Boolean> g0u = anchoredDraggableState2.A03;
                Object obj3 = this.A02;
                if (AnonymousClass003.A1X(obj3, g0u)) {
                    anchoredDraggableState2.A06.A9C(C8j4.A0T(anchoredDraggableState2.A09).AYD(obj3), anchoredDraggableState2.A07.AFn());
                    anchoredDraggableState2.A0C.Af8(obj3);
                    anchoredDraggableState2.A0A.Af8(obj3);
                    break;
                }
                break;
            default:
                EnumC10460Hji enumC10460Hji3 = EnumC10460Hji.A02;
                if (this.A00 != 0) {
                    Hwg.A00(obj);
                } else {
                    Hwg.A00(obj);
                    AL9 al9 = (AL9) this.A03;
                    if (!al9.A0b) {
                        MapsSdkProvider.Companion companion = MapsSdkProvider.Companion;
                        Context context = al9.getContext();
                        C7384Etj.A0U(context);
                        this.A00 = 1;
                        GBK gbk = AbstractC9266GBt.A00;
                        if (MapsSdkProviderMapLibreExtKt.initMapLibre(companion, context, HlU.A01, this) == enumC10460Hji3) {
                            return enumC10460Hji3;
                        }
                    }
                }
                AL9 al92 = (AL9) this.A03;
                ALE ale = (ALE) this.A01;
                MapsSdkProvider mapsSdkProvider = (MapsSdkProvider) this.A02;
                if (al92.getWidth() > 0 && al92.getHeight() > 0) {
                    AL9.A06(ale, al92, mapsSdkProvider);
                    break;
                } else if (al92.A02 == null) {
                    AL2 al2 = new AL2(ale, al92, mapsSdkProvider);
                    al92.A02 = al2;
                    al92.addOnLayoutChangeListener(al2);
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
