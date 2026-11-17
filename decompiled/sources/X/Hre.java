package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class Hre extends C7438Evz implements G0U<Function0<? extends Unit>, Function0<? extends Unit>> {
    public final /* synthetic */ C10543Hqv<List<Function0<Unit>>> $currentListeners;
    public final /* synthetic */ F1F $isDispatching;
    public final /* synthetic */ C10543Hqv<List<Function0<Unit>>> $nextListeners;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hre(F1F f1f, C10543Hqv<List<Function0<Unit>>> c10543Hqv, C10543Hqv<List<Function0<Unit>>> c10543Hqv2) {
        super(1, C2yI.class, "subscribe", "createStore$subscribe(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;", 0);
        this.$isDispatching = f1f;
        this.$nextListeners = c10543Hqv;
        this.$currentListeners = c10543Hqv2;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.util.ArrayList] */
    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Function0<? extends Unit> invoke(Function0<? extends Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        F1F f1f = this.$isDispatching;
        C10543Hqv<List<Function0<Unit>>> c10543Hqv = this.$nextListeners;
        C10543Hqv<List<Function0<Unit>>> c10543Hqv2 = this.$currentListeners;
        if (f1f.element) {
            throw C3cG.A0Q("You may not call store.subscribe() while the reducer is executing.\nIf you would like to be notified after the store has been updated, \nsubscribe from a component and invoke store.getState() in the \ncallback to access the latest state. See \nhttps://www.reduxkotlin.org/api/store#subscribelistener-storesubscriber\nfor more details.\nYou may be seeing this due accessing the store from multiplethreads.\nTry createThreadSafeStore()\nhttps://reduxkotlin.org/introduction/threading");
        }
        F1F f1f2 = new F1F();
        f1f2.element = true;
        List<Function0<Unit>> list = c10543Hqv.element;
        List<Function0<Unit>> list2 = c10543Hqv2.element;
        List<Function0<Unit>> list3 = list;
        if (list == list2) {
            ?? A0R = AbstractC0878AGe.A0R(list2);
            c10543Hqv.element = A0R;
            list3 = A0R;
        }
        list3.add(function0);
        return new C8183FYa(c10543Hqv2, f1f2, c10543Hqv, f1f, function0, 1);
    }
}
