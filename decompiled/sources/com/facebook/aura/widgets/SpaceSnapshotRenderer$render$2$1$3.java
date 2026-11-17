package com.facebook.aura.widgets;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C6t6;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAX;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.widgets.SpaceSnapshotRenderer$render$2$1$3", f = "SpaceSnapshotRenderer.kt", l = {122}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class SpaceSnapshotRenderer$render$2$1$3 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
    public final /* synthetic */ C6t6 $webView;
    public int label;
    public final /* synthetic */ SpaceSnapshotRenderer this$0;

    @DebugMetadata(c = "com.facebook.aura.widgets.SpaceSnapshotRenderer$render$2$1$3$1", f = "SpaceSnapshotRenderer.kt", l = {122}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.widgets.SpaceSnapshotRenderer$render$2$1$3$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ C6t6 $webView;
        public int label;
        public final /* synthetic */ SpaceSnapshotRenderer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SpaceSnapshotRenderer spaceSnapshotRenderer, C6t6 c6t6, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.this$0 = spaceSnapshotRenderer;
            this.$webView = c6t6;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.this$0, this.$webView, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SpaceSnapshotRenderer spaceSnapshotRenderer = this.this$0;
                C6t6 c6t6 = this.$webView;
                this.label = 1;
                obj = spaceSnapshotRenderer.hasVisibleContent(c6t6, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceSnapshotRenderer$render$2$1$3(SpaceSnapshotRenderer spaceSnapshotRenderer, C6t6 c6t6, HtJ<? super SpaceSnapshotRenderer$render$2$1$3> htJ) {
        super(1, htJ);
        this.this$0 = spaceSnapshotRenderer;
        this.$webView = c6t6;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new SpaceSnapshotRenderer$render$2$1$3(this.this$0, this.$webView, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$webView, null);
            this.label = 1;
            obj = GAX.A01(this, anonymousClass1, 600L);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Boolean.valueOf(C3cG.A1P(obj, true));
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super Boolean> htJ) {
        return ((SpaceSnapshotRenderer$render$2$1$3) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
