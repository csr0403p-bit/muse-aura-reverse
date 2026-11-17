package com.facebook.aura.conversation.view;

import X.AOW;
import X.AT5;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1003AOr;
import X.C20Q;
import X.C20Z;
import X.C2194B9z;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.timespent.config.MC;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchImageOptionPreviewKt$ImageOptionPreviewBackHandler$1$1$1", f = "HatchImageOptionPreview.kt", l = {MC.mwa_time_spent_killswitch.__CONFIG__}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchImageOptionPreviewKt$ImageOptionPreviewBackHandler$1$1$1 extends AbstractC07127nr implements G0V<C20Q<C2194B9z>, HtJ<Unit>, Object> {
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ Function0<Unit> $onBack;
    public final /* synthetic */ AT5<Float, AOW> $progress;
    public float F$0;
    public /* synthetic */ Object L$0;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchImageOptionPreviewKt$ImageOptionPreviewBackHandler$1$1$1$2", f = "HatchImageOptionPreview.kt", l = {HatchMessageShareDocumentRenderer.MIN_CONTENT_HEIGHT_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchImageOptionPreviewKt$ImageOptionPreviewBackHandler$1$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AT5<Float, AOW> $progress;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AT5<Float, AOW> at5, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$progress = at5;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$progress, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AT5<Float, AOW> at5 = this.$progress;
                Float fA0m = AnonymousClass001.A0m();
                C1003AOr c1003AOr = new C1003AOr(null, 0.9f, 400.0f);
                this.label = 1;
                if (AnonymousClass002.A0i(at5, c1003AOr, fA0m, this, null) == enumC10460Hji) {
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
            return new AnonymousClass2(this.$progress, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchImageOptionPreviewKt$ImageOptionPreviewBackHandler$1$1$1(AT5<Float, AOW> at5, Function0<Unit> function0, C3UX c3ux, HtJ<? super HatchImageOptionPreviewKt$ImageOptionPreviewBackHandler$1$1$1> htJ) {
        super(2, htJ);
        this.$progress = at5;
        this.$onBack = function0;
        this.$coroutineScope = c3ux;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchImageOptionPreviewKt$ImageOptionPreviewBackHandler$1$1$1 hatchImageOptionPreviewKt$ImageOptionPreviewBackHandler$1$1$1 = new HatchImageOptionPreviewKt$ImageOptionPreviewBackHandler$1$1$1(this.$progress, this.$onBack, this.$coroutineScope, htJ);
        hatchImageOptionPreviewKt$ImageOptionPreviewBackHandler$1$1$1.L$0 = obj;
        return hatchImageOptionPreviewKt$ImageOptionPreviewBackHandler$1$1$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C20Q c20q = (C20Q) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                final float fA00 = MutableState.A00(this.$progress);
                final AT5<Float, AOW> at5 = this.$progress;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.conversation.view.HatchImageOptionPreviewKt$ImageOptionPreviewBackHandler$1$1$1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((C2194B9z) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(C2194B9z c2194B9z, HtJ<? super Unit> htJ) {
                        Object objA04 = at5.A04(new Float(fA00 * (1.0f - (c2194B9z.A00 * 0.4f))), htJ);
                        if (objA04 != EnumC10460Hji.A02) {
                            return Unit.INSTANCE;
                        }
                        return objA04;
                    }
                };
                this.L$0 = null;
                this.F$0 = fA00;
                this.label = 1;
                if (c20q.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            this.$onBack.invoke();
            return Unit.INSTANCE;
        } catch (CancellationException e) {
            AnonymousClass001.A1J(new AnonymousClass2(this.$progress, null), this.$coroutineScope);
            throw e;
        }
    }

    @Override // X.G0V
    public final Object invoke(C20Q<C2194B9z> c20q, HtJ<Unit> htJ) {
        return ((HatchImageOptionPreviewKt$ImageOptionPreviewBackHandler$1$1$1) create(c20q, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
