package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.C78T;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.file.docx.DocxParser;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.DocxContentViewKt$DocxContent$3$1", f = "DocxContentView.kt", l = {115}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class DocxContentViewKt$DocxContent$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ File $file;
    public final /* synthetic */ MutableState<Boolean> $parseError$delegate;
    public final /* synthetic */ MutableState<DocxParser.PreviewResult> $preview$delegate;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.file.view.DocxContentViewKt$DocxContent$3$1$1", f = "DocxContentView.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.DocxContentViewKt$DocxContent$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ File $file;
        public final /* synthetic */ MutableState<Boolean> $parseError$delegate;
        public final /* synthetic */ MutableState<DocxParser.PreviewResult> $preview$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(File file, MutableState<DocxParser.PreviewResult> mutableState, MutableState<Boolean> mutableState2, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$file = file;
            this.$preview$delegate = mutableState;
            this.$parseError$delegate = mutableState2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$file, this.$preview$delegate, this.$parseError$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                this.$preview$delegate.Af8(DocxParser.INSTANCE.parse(this.$file));
            } catch (Exception e) {
                CFK.A08(DocxContentViewKt.DOCX_TAG, FGI.A0M("Failed to parse .docx: ", e.getMessage()), e);
                MutableState.A09(true, this.$parseError$delegate);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocxContentViewKt$DocxContent$3$1(File file, MutableState<DocxParser.PreviewResult> mutableState, MutableState<Boolean> mutableState2, HtJ<? super DocxContentViewKt$DocxContent$3$1> htJ) {
        super(2, htJ);
        this.$file = file;
        this.$preview$delegate = mutableState;
        this.$parseError$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new DocxContentViewKt$DocxContent$3$1(this.$file, this.$preview$delegate, this.$parseError$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            C78T c78tA0s = AnonymousClass002.A0s(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$file, this.$preview$delegate, this.$parseError$delegate, null);
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
        return ((DocxContentViewKt$DocxContent$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
