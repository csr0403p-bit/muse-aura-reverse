package com.facebook.aura.status.view;

import X.AbstractC07127nr;
import X.AbstractC1996Aw5;
import X.AnonymousClass001;
import X.C2K7;
import X.C3UX;
import X.C78T;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.executors.AuraDispatchers;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.status.view.HatchStatusPillKt$PreloadStatusLineFont$1$1", f = "HatchStatusPill.kt", l = {672}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchStatusPillKt$PreloadStatusLineFont$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C2K7 $fontFamilyResolver;
    public final /* synthetic */ AbstractC1996Aw5 $statusLineFont;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.status.view.HatchStatusPillKt$PreloadStatusLineFont$1$1$1", f = "HatchStatusPill.kt", l = {672}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.view.HatchStatusPillKt$PreloadStatusLineFont$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C2K7 $fontFamilyResolver;
        public final /* synthetic */ AbstractC1996Aw5 $statusLineFont;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C2K7 c2k7, AbstractC1996Aw5 abstractC1996Aw5, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$fontFamilyResolver = c2k7;
            this.$statusLineFont = abstractC1996Aw5;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$fontFamilyResolver, this.$statusLineFont, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C2K7 c2k7 = this.$fontFamilyResolver;
                AbstractC1996Aw5 abstractC1996Aw5 = this.$statusLineFont;
                this.label = 1;
                if (c2k7.AYM(abstractC1996Aw5, this) == enumC10460Hji) {
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
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillKt$PreloadStatusLineFont$1$1(AbstractC1996Aw5 abstractC1996Aw5, C2K7 c2k7, HtJ<? super HatchStatusPillKt$PreloadStatusLineFont$1$1> htJ) {
        super(2, htJ);
        this.$statusLineFont = abstractC1996Aw5;
        this.$fontFamilyResolver = c2k7;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchStatusPillKt$PreloadStatusLineFont$1$1(this.$statusLineFont, this.$fontFamilyResolver, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$statusLineFont != null) {
                C78T c78tM764default = AuraDispatchers.INSTANCE.m764default();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$fontFamilyResolver, this.$statusLineFont, null);
                this.label = 1;
                if (GAo.A00(this, c78tM764default, anonymousClass1) == enumC10460Hji) {
                    return enumC10460Hji;
                }
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
        return ((HatchStatusPillKt$PreloadStatusLineFont$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
