package com.facebook.aura.nodes.cards;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C78T;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.nodes.cards.NodeCardAppHeaderKt$rememberNodeCardApp$1$1", f = "NodeCardAppHeader.kt", l = {74}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class NodeCardAppHeaderKt$rememberNodeCardApp$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ NodeCardAppKind $kind;
    public final /* synthetic */ MutableState<NodeCardAppResolution> $resolution$delegate;
    public Object L$0;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.nodes.cards.NodeCardAppHeaderKt$rememberNodeCardApp$1$1$1", f = "NodeCardAppHeader.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.nodes.cards.NodeCardAppHeaderKt$rememberNodeCardApp$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super NodeCardAppResolution>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ NodeCardAppKind $kind;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NodeCardAppKind nodeCardAppKind, Context context, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$kind = nodeCardAppKind;
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$kind, this.$context, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return NodeCardAppCache.INSTANCE.resolve(this.$kind, this.$context);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super NodeCardAppResolution> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCardAppHeaderKt$rememberNodeCardApp$1$1(MutableState<NodeCardAppResolution> mutableState, NodeCardAppKind nodeCardAppKind, Context context, HtJ<? super NodeCardAppHeaderKt$rememberNodeCardApp$1$1> htJ) {
        super(2, htJ);
        this.$resolution$delegate = mutableState;
        this.$kind = nodeCardAppKind;
        this.$context = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new NodeCardAppHeaderKt$rememberNodeCardApp$1$1(this.$resolution$delegate, this.$kind, this.$context, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$resolution$delegate.getValue() == null) {
                mutableState = this.$resolution$delegate;
                C78T c78tA0y = AnonymousClass001.A0y();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$kind, this.$context, null);
                this.L$0 = mutableState;
                this.label = 1;
                obj = GAo.A00(this, c78tA0y, anonymousClass1);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        mutableState = (MutableState) this.L$0;
        Hwg.A00(obj);
        mutableState.Af8(obj);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((NodeCardAppHeaderKt$rememberNodeCardApp$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
