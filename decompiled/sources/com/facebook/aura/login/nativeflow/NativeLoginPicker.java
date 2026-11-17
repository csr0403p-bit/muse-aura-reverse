package com.facebook.aura.login.nativeflow;

import X.A3q;
import X.AGH;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C0881AGi;
import X.C3cG;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.HtJ;
import com.facebook.aura.login.credentials.AuraRememberedAccount;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class NativeLoginPicker<S, D> {
    public final int limit;
    public final Object lock;
    public final G0V<NativeLoginPickerRows<S>, D, Unit> publish;
    public volatile List<AuraRememberedAccount> remembered;
    public Map<String, HatchMuseProfile> rememberedMuseProfiles;
    public D siblingDisclosure;
    public volatile List<? extends S> siblings;
    public Set<String> supersededSavedAccountIds;

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginPicker$removeSibling$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ S $sibling;
        public final /* synthetic */ NativeLoginPicker<S, D> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NativeLoginPicker<S, D> nativeLoginPicker, S s) {
            super(0);
            this.this$0 = nativeLoginPicker;
            this.$sibling = s;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            NativeLoginPicker<S, D> nativeLoginPicker = this.this$0;
            nativeLoginPicker.siblings = AbstractC0878AGe.A0b(nativeLoginPicker.siblings, this.$sibling);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginPicker$showRemembered$1, reason: invalid class name and case insensitive filesystem */
    public final class C125551 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ List<AuraRememberedAccount> $remembered;
        public final /* synthetic */ NativeLoginPicker<S, D> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125551(NativeLoginPicker<S, D> nativeLoginPicker, List<AuraRememberedAccount> list) {
            super(0);
            this.this$0 = nativeLoginPicker;
            this.$remembered = list;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.remembered = this.$remembered;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginPicker$showSiblings$1, reason: invalid class name and case insensitive filesystem */
    public final class C125561 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ D $disclosure;
        public final /* synthetic */ List<S> $siblings;
        public final /* synthetic */ Set<String> $supersededSavedAccountIds;
        public final /* synthetic */ NativeLoginPicker<S, D> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C125561(NativeLoginPicker<S, D> nativeLoginPicker, List<? extends S> list, D d, Set<String> set) {
            super(0);
            this.this$0 = nativeLoginPicker;
            this.$siblings = list;
            this.$disclosure = d;
            this.$supersededSavedAccountIds = set;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.siblings = this.$siblings;
            NativeLoginPicker<S, D> nativeLoginPicker = this.this$0;
            nativeLoginPicker.siblingDisclosure = this.$disclosure;
            nativeLoginPicker.supersededSavedAccountIds = this.$supersededSavedAccountIds;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginPicker(int i, G0V<? super NativeLoginPickerRows<S>, ? super D, Unit> g0v) {
        C7384Etj.A0Y(g0v, 1);
        this.limit = i;
        this.publish = g0v;
        this.lock = C3cG.A0T();
        C0881AGi c0881AGi = C0881AGi.A00;
        this.remembered = c0881AGi;
        this.siblings = c0881AGi;
        this.supersededSavedAccountIds = A3q.A00;
        this.rememberedMuseProfiles = AGH.A0E();
    }

    public final void showRemembered(List<AuraRememberedAccount> list) {
        C7384Etj.A0Y(list, 0);
        update(new C125551(this, list));
    }

    public final void showRememberedMuseProfiles(Map<String, HatchMuseProfile> map) {
        C7384Etj.A0Y(map, 0);
        synchronized (this.lock) {
            if (!this.remembered.isEmpty()) {
                update(new NativeLoginPicker$showRememberedMuseProfiles$1$1(this, map));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showSiblings$default(NativeLoginPicker nativeLoginPicker, List list, Object obj, Set set, int i, Object obj2) {
        if ((i & 4) != 0) {
            set = A3q.A00;
        }
        nativeLoginPicker.showSiblings(list, obj, set);
    }

    private final void update(Function0<Unit> function0) {
        synchronized (this.lock) {
            function0.invoke();
            this.publish.invoke(NativeLoginAccountResolver.INSTANCE.pickerRows(this.remembered, this.siblings, this.limit, this.supersededSavedAccountIds, this.rememberedMuseProfiles), this.siblingDisclosure);
        }
    }

    public final void clear() {
        synchronized (this.lock) {
            C0881AGi c0881AGi = C0881AGi.A00;
            this.remembered = c0881AGi;
            this.siblings = c0881AGi;
            this.siblingDisclosure = null;
            this.supersededSavedAccountIds = A3q.A00;
            this.rememberedMuseProfiles = AGH.A0E();
        }
    }

    public final List<AuraRememberedAccount> getRemembered() {
        return this.remembered;
    }

    public final List<S> getSiblings() {
        return this.siblings;
    }

    public final void removeSibling(S s) {
        update(new AnonymousClass1(this, s));
    }

    public final <P> Object showRememberedWhileLoading(List<AuraRememberedAccount> list, G0U<? super HtJ<? super P>, ? extends Object> g0u, HtJ<? super P> htJ) {
        if (!list.isEmpty()) {
            showRemembered(list);
        }
        return g0u.invoke(htJ);
    }

    public final void showSiblings(List<? extends S> list, D d, Set<String> set) {
        AnonymousClass003.A0v(list, set);
        update(new C125561(this, list, d, set));
    }
}
