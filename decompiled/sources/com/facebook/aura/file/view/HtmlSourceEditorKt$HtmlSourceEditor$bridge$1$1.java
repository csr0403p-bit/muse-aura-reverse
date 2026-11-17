package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HtmlSourceEditorKt$HtmlSourceEditor$bridge$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ C1BO<G0U<String, Unit>> $callbackState;
    public final /* synthetic */ C3UX $scope;

    @DebugMetadata(c = "com.facebook.aura.file.view.HtmlSourceEditorKt$HtmlSourceEditor$bridge$1$1$1", f = "HtmlSourceEditor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.HtmlSourceEditorKt$HtmlSourceEditor$bridge$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C1BO<G0U<String, Unit>> $callbackState;
        public final /* synthetic */ String $text;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C1BO<? extends G0U<? super String, Unit>> c1bo, String str, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$callbackState = c1bo;
            this.$text = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$callbackState, this.$text, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            C1BO.A0B(this.$callbackState).invoke(this.$text);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass001.A1J(new AnonymousClass1(this.$callbackState, str, null), this.$scope);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HtmlSourceEditorKt$HtmlSourceEditor$bridge$1$1(C3UX c3ux, C1BO<? extends G0U<? super String, Unit>> c1bo) {
        super(1);
        this.$scope = c3ux;
        this.$callbackState = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
