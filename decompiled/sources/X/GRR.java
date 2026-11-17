package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: Add missing generic type declarations: [State] */
/* loaded from: classes6.dex */
public final /* synthetic */ class GRR<State> extends C7438Evz implements G0U<G0V<? super State, ? super Object, ? extends State>, Unit> {
    public final /* synthetic */ C10543Hqv<List<Function0<Unit>>> $currentListeners;
    public final /* synthetic */ C10543Hqv<G0V<State, Object, State>> $currentReducer;
    public final /* synthetic */ C10543Hqv<State> $currentState;
    public final /* synthetic */ F1F $isDispatching;
    public final /* synthetic */ C10543Hqv<List<Function0<Unit>>> $nextListeners;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        C7384Etj.A0Y(obj, 0);
        C10543Hqv<G0V<State, Object, State>> c10543Hqv = this.$currentReducer;
        F1F f1f = this.$isDispatching;
        C10543Hqv<State> c10543Hqv2 = this.$currentState;
        C10543Hqv<List<Function0<Unit>>> c10543Hqv3 = this.$nextListeners;
        C10543Hqv<List<Function0<Unit>>> c10543Hqv4 = this.$currentListeners;
        c10543Hqv.element = obj;
        GRO.A01(GSK.A00, f1f, c10543Hqv2, c10543Hqv, c10543Hqv3, c10543Hqv4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/Hqv<LX/G0V<TState;Ljava/lang/Object;TState;>;>;LX/F1F;LX/Hqv<TState;>;LX/Hqv<Ljava/util/List<Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;>;>;LX/Hqv<Ljava/util/List<Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;>;>;)V */
    public GRR(F1F f1f, C10543Hqv c10543Hqv, C10543Hqv c10543Hqv2, C10543Hqv c10543Hqv3, C10543Hqv c10543Hqv4) {
        super(1, C2yI.class, "replaceReducer", "createStore$replaceReducer(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/functions/Function2;)V", 0);
        this.$currentReducer = c10543Hqv;
        this.$isDispatching = f1f;
        this.$currentState = c10543Hqv2;
        this.$nextListeners = c10543Hqv3;
        this.$currentListeners = c10543Hqv4;
    }
}
