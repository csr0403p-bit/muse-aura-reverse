package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C05663ul;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.view.View;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchImageOptionPreviewKt$ImageOptionPreviewBackdropBlur$2$1", f = "HatchImageOptionPreview.kt", l = {325}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchImageOptionPreviewKt$ImageOptionPreviewBackdropBlur$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ View $hostView;
    public final /* synthetic */ float $maxRadiusPx;
    public final /* synthetic */ Function0<Float> $progress;
    public int label;

    /* renamed from: com.facebook.aura.conversation.view.HatchImageOptionPreviewKt$ImageOptionPreviewBackdropBlur$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Float> {
        public final /* synthetic */ float $maxRadiusPx;
        public final /* synthetic */ Function0<Float> $progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Float> function0, float f) {
            super(0);
            this.$progress = function0;
            this.$maxRadiusPx = f;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(AnonymousClass003.A00(AnonymousClass003.A04(this.$progress)) * this.$maxRadiusPx);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchImageOptionPreviewKt$ImageOptionPreviewBackdropBlur$2$1(Function0<Float> function0, float f, View view, HtJ<? super HatchImageOptionPreviewKt$ImageOptionPreviewBackdropBlur$2$1> htJ) {
        super(2, htJ);
        this.$progress = function0;
        this.$maxRadiusPx = f;
        this.$hostView = view;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchImageOptionPreviewKt$ImageOptionPreviewBackdropBlur$2$1(this.$progress, this.$maxRadiusPx, this.$hostView, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C05663ul c05663ulA01 = C6v3.A01(new AnonymousClass1(this.$progress, this.$maxRadiusPx));
            final View view = this.$hostView;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.conversation.view.HatchImageOptionPreviewKt$ImageOptionPreviewBackdropBlur$2$1.2
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit(AnonymousClass001.A02(obj2), (HtJ<? super Unit>) htJ);
                }

                public final Object emit(float f, HtJ<? super Unit> htJ) {
                    RenderEffect renderEffectCreateBlurEffect;
                    View view2 = view;
                    if (f > 0.0f) {
                        renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(f, f, Shader.TileMode.MIRROR);
                    } else {
                        renderEffectCreateBlurEffect = null;
                    }
                    view2.setRenderEffect(renderEffectCreateBlurEffect);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c05663ulA01.collect(c20z, this) == enumC10460Hji) {
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
        return ((HatchImageOptionPreviewKt$ImageOptionPreviewBackdropBlur$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
