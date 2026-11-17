package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C05663ul;
import X.C1BO;
import X.C3UX;
import X.C3pU;
import X.C6v3;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HxE;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$1$1", f = "HatchConversationRestoreAnchor.kt", l = {90}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ ConversationRestoreAnchor $anchor;
    public final /* synthetic */ C1BO<Function0<List<HatchConversationListItem>>> $currentItems$delegate;
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnLost$delegate;
    public final /* synthetic */ LazyListState $listState;
    public int label;

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<HxE<? extends String, ? extends Integer>> {
        public final /* synthetic */ ConversationRestoreAnchor $anchor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConversationRestoreAnchor conversationRestoreAnchor) {
            super(0);
            this.$anchor = conversationRestoreAnchor;
        }

        @Override // kotlin.jvm.functions.Function0
        public final HxE<? extends String, ? extends Integer> invoke() {
            return AnonymousClass002.A0p(MutableState.A05(this.$anchor.restoringKey$delegate), this.$anchor.restoreCount$delegate.AGd());
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$1$1$2", f = "HatchConversationRestoreAnchor.kt", l = {93}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<HxE<? extends String, ? extends Integer>, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ConversationRestoreAnchor $anchor;
        public final /* synthetic */ C1BO<Function0<List<HatchConversationListItem>>> $currentItems$delegate;
        public final /* synthetic */ C1BO<Function0<Unit>> $currentOnLost$delegate;
        public final /* synthetic */ LazyListState $listState;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* renamed from: com.facebook.aura.conversation.view.HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$1$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<HxE<? extends List<? extends HatchConversationListItem>, ? extends String>> {
            public final /* synthetic */ C1BO<Function0<List<HatchConversationListItem>>> $currentItems$delegate;
            public final /* synthetic */ LazyListState $listState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(LazyListState lazyListState, C1BO<? extends Function0<? extends List<? extends HatchConversationListItem>>> c1bo) {
                super(0);
                this.$listState = lazyListState;
                this.$currentItems$delegate = c1bo;
            }

            @Override // kotlin.jvm.functions.Function0
            public final HxE<? extends List<? extends HatchConversationListItem>, ? extends String> invoke() {
                return new HxE<>(C1BO.A0A(this.$currentItems$delegate).invoke(), HatchConversationRestoreAnchorKt.firstLaidOutKey(this.$listState));
            }
        }

        @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$1$1$2$2", f = "HatchConversationRestoreAnchor.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.conversation.view.HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$1$1$2$2, reason: invalid class name and collision with other inner class name */
        public final class C01012 extends AbstractC07127nr implements G0V<HxE<? extends List<? extends HatchConversationListItem>, ? extends String>, HtJ<? super Boolean>, Object> {
            public final /* synthetic */ String $key;
            public /* synthetic */ Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01012(String str, HtJ<? super C01012> htJ) {
                super(2, htJ);
                this.$key = str;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C01012 c01012 = new C01012(this.$key, htJ);
                c01012.L$0 = obj;
                return c01012;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(HxE<? extends List<? extends HatchConversationListItem>, ? extends String> hxE, HtJ<? super Boolean> htJ) {
                return invoke2((HxE<? extends List<? extends HatchConversationListItem>, String>) hxE, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                boolean z;
                HxE hxE = (HxE) this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                List list = (List) hxE.first;
                B b = hxE.second;
                if (list.isEmpty()) {
                    z = false;
                } else {
                    String str = this.$key;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (C7384Etj.areEqual(((HatchConversationListItem) it.next()).getKey(), str)) {
                                if (b == 0 || b.equals(this.$key)) {
                                }
                            }
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(HxE<? extends List<? extends HatchConversationListItem>, String> hxE, HtJ<? super Boolean> htJ) {
                return ((C01012) create(hxE, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(ConversationRestoreAnchor conversationRestoreAnchor, LazyListState lazyListState, C1BO<? extends Function0<? extends List<? extends HatchConversationListItem>>> c1bo, C1BO<? extends Function0<Unit>> c1bo2, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$anchor = conversationRestoreAnchor;
            this.$listState = lazyListState;
            this.$currentItems$delegate = c1bo;
            this.$currentOnLost$delegate = c1bo2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$anchor, this.$listState, this.$currentItems$delegate, this.$currentOnLost$delegate, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(HxE<? extends String, ? extends Integer> hxE, HtJ<? super Unit> htJ) {
            return invoke2((HxE<String, Integer>) hxE, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            HxE hxE = (HxE) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                String str = (String) hxE.first;
                if (str != null) {
                    C05663ul c05663ulA01 = C6v3.A01(new AnonymousClass1(this.$listState, this.$currentItems$delegate));
                    C01012 c01012 = new C01012(str, null);
                    this.L$0 = null;
                    this.L$1 = str;
                    this.label = 1;
                    obj2 = str;
                    if (AbstractC9777Gfy.A00(this, c01012, c05663ulA01) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Object obj3 = this.L$1;
            Hwg.A00(obj);
            obj2 = obj3;
            this.$anchor.stopRestoring();
            Iterable iterable = (Iterable) C1BO.A0A(this.$currentItems$delegate).invoke();
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                C1BO.A0D(this.$currentOnLost$delegate);
            } else {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (C7384Etj.areEqual(((HatchConversationListItem) it.next()).getKey(), obj2)) {
                        break;
                    }
                }
                C1BO.A0D(this.$currentOnLost$delegate);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HxE<String, Integer> hxE, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(hxE, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$1$1(ConversationRestoreAnchor conversationRestoreAnchor, LazyListState lazyListState, C1BO<? extends Function0<? extends List<? extends HatchConversationListItem>>> c1bo, C1BO<? extends Function0<Unit>> c1bo2, HtJ<? super HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$1$1> htJ) {
        super(2, htJ);
        this.$anchor = conversationRestoreAnchor;
        this.$listState = lazyListState;
        this.$currentItems$delegate = c1bo;
        this.$currentOnLost$delegate = c1bo2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$1$1(this.$anchor, this.$listState, this.$currentItems$delegate, this.$currentOnLost$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C05663ul c05663ulA01 = C6v3.A01(new AnonymousClass1(this.$anchor));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$anchor, this.$listState, this.$currentItems$delegate, this.$currentOnLost$delegate, null);
            this.label = 1;
            if (C3pU.A00(this, anonymousClass2, c05663ulA01) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
