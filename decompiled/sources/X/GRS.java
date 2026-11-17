package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class GRS extends C7438Evz implements G0U<Object, Object> {
    public final /* synthetic */ C10543Hqv<List<Function0<Unit>>> $currentListeners;
    public final /* synthetic */ C10543Hqv<G0V<State, Object, State>> $currentReducer;
    public final /* synthetic */ C10543Hqv<State> $currentState;
    public final /* synthetic */ F1F $isDispatching;
    public final /* synthetic */ C10543Hqv<List<Function0<Unit>>> $nextListeners;

    @Override // X.G0U
    public final Object invoke(Object obj) {
        C7384Etj.A0Y(obj, 0);
        GRO.A01(obj, this.$isDispatching, this.$currentState, this.$currentReducer, this.$nextListeners, this.$currentListeners);
        return obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GRS(F1F f1f, C10543Hqv<State> c10543Hqv, C10543Hqv<G0V<State, Object, State>> c10543Hqv2, C10543Hqv<List<Function0<Unit>>> c10543Hqv3, C10543Hqv<List<Function0<Unit>>> c10543Hqv4) {
        super(1, C2yI.class, "dispatch", "createStore$dispatch(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        this.$isDispatching = f1f;
        this.$currentState = c10543Hqv;
        this.$currentReducer = c10543Hqv2;
        this.$nextListeners = c10543Hqv3;
        this.$currentListeners = c10543Hqv4;
    }
}
