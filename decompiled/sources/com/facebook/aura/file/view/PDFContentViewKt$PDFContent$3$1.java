package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.C78T;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.PDFContentViewKt$PDFContent$3$1", f = "PDFContentView.kt", l = {96}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PDFContentViewKt$PDFContent$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ File $file;
    public final /* synthetic */ MutableState<Boolean> $loadError$delegate;
    public final /* synthetic */ MutableState<List<PageSize>> $pageSizes$delegate;
    public final /* synthetic */ PdfRendererHolder $rendererHolder;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.file.view.PDFContentViewKt$PDFContent$3$1$1", f = "PDFContentView.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.PDFContentViewKt$PDFContent$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ File $file;
        public final /* synthetic */ MutableState<Boolean> $loadError$delegate;
        public final /* synthetic */ MutableState<List<PageSize>> $pageSizes$delegate;
        public final /* synthetic */ PdfRendererHolder $rendererHolder;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PdfRendererHolder pdfRendererHolder, File file, MutableState<Boolean> mutableState, MutableState<List<PageSize>> mutableState2, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$rendererHolder = pdfRendererHolder;
            this.$file = file;
            this.$loadError$delegate = mutableState;
            this.$pageSizes$delegate = mutableState2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$rendererHolder, this.$file, this.$loadError$delegate, this.$pageSizes$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            List<PageSize> listOpen = this.$rendererHolder.open(this.$file);
            if (listOpen == null) {
                MutableState.A09(true, this.$loadError$delegate);
            } else {
                this.$pageSizes$delegate.Af8(listOpen);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PDFContentViewKt$PDFContent$3$1(PdfRendererHolder pdfRendererHolder, File file, MutableState<Boolean> mutableState, MutableState<List<PageSize>> mutableState2, HtJ<? super PDFContentViewKt$PDFContent$3$1> htJ) {
        super(2, htJ);
        this.$rendererHolder = pdfRendererHolder;
        this.$file = file;
        this.$loadError$delegate = mutableState;
        this.$pageSizes$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PDFContentViewKt$PDFContent$3$1(this.$rendererHolder, this.$file, this.$loadError$delegate, this.$pageSizes$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            C78T c78tA0s = AnonymousClass002.A0s(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$rendererHolder, this.$file, this.$loadError$delegate, this.$pageSizes$delegate, null);
            this.label = 1;
            if (GAo.A00(this, c78tA0s, anonymousClass1) == enumC10460Hji) {
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
        return ((PDFContentViewKt$PDFContent$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
