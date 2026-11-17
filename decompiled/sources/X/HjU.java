package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: Add missing generic type declarations: [State] */
/* loaded from: classes6.dex */
public final /* synthetic */ class HjU<State> extends C7438Evz implements Function0<State> {
    public final /* synthetic */ C10543Hqv<State> $currentState;
    public final /* synthetic */ F1F $isDispatching;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HjU(F1F f1f, C10543Hqv<State> c10543Hqv) {
        super(0, C2yI.class, "getState", "createStore$getState(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$ObjectRef;)Ljava/lang/Object;", 0);
        this.$isDispatching = f1f;
        this.$currentState = c10543Hqv;
    }

    @Override // kotlin.jvm.functions.Function0
    public final State invoke() {
        F1F f1f = this.$isDispatching;
        C10543Hqv<State> c10543Hqv = this.$currentState;
        if (f1f.element) {
            throw C3cG.A0Q("You may not call store.getState() while the reducer is executing.\nThe reducer has already received the state as an argument.\nPass it down from the top reducer instead of reading it from the \nstore.\nYou may be accessing getState while dispatching from another\nthread.  Try createThreadSafeStore().\nhttps://reduxkotlin.org/introduction/threading");
        }
        return c10543Hqv.element;
    }
}
