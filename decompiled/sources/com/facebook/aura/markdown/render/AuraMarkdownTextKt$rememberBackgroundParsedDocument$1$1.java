package com.facebook.aura.markdown.render;

import X.AbstractC05623ug;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.markdown.render.AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1", f = "AuraMarkdownText.kt", l = {122}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<String> $latestSource;
    public final /* synthetic */ MutableState<ParsedSource> $parsed;
    public int label;

    /* renamed from: com.facebook.aura.markdown.render.AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1$3, reason: invalid class name */
    public final class AnonymousClass3<T> implements C20Z {
        public final /* synthetic */ MutableState<ParsedSource> $parsed;

        @DebugMetadata(c = "com.facebook.aura.markdown.render.AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1$3$1", f = "AuraMarkdownText.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.markdown.render.AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ParsedSource>, Object> {
            public final /* synthetic */ String $next;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.$next = str;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.$next, htJ);
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super ParsedSource> htJ) {
                return new AnonymousClass1(this.$next, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return AuraMarkdownTextKt.parse(this.$next);
            }
        }

        public AnonymousClass3(MutableState<ParsedSource> mutableState) {
            this.$parsed = mutableState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.String r8, X.HtJ<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.facebook.aura.markdown.render.AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1$3$emit$1
                if (r0 == 0) goto L46
                r6 = r9
                com.facebook.aura.markdown.render.AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1$3$emit$1 r6 = (com.facebook.aura.markdown.render.AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1$3$emit$1) r6
                int r2 = r6.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L46
                int r2 = r2 - r1
                r6.label = r2
            L12:
                java.lang.Object r0 = r6.result
                X.Hji r5 = X.EnumC10460Hji.A02
                int r1 = r6.label
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 != r4) goto L4c
                java.lang.Object r3 = r6.L$1
                androidx.compose.runtime.MutableState r3 = (androidx.compose.runtime.MutableState) r3
                X.Hwg.A00(r0)
            L24:
                r3.Af8(r0)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L2a:
                X.Hwg.A00(r0)
                androidx.compose.runtime.MutableState<com.facebook.aura.markdown.render.ParsedSource> r3 = r7.$parsed
                X.78T r2 = X.C3cG.A0v()
                r1 = 0
                com.facebook.aura.markdown.render.AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1$3$1 r0 = new com.facebook.aura.markdown.render.AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1$3$1
                r0.<init>(r8, r1)
                r6.L$0 = r1
                r6.L$1 = r3
                r6.label = r4
                java.lang.Object r0 = X.GAo.A00(r6, r2, r0)
                if (r0 != r5) goto L24
                return r5
            L46:
                com.facebook.aura.markdown.render.AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1$3$emit$1 r6 = new com.facebook.aura.markdown.render.AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1$3$emit$1
                r6.<init>(r7, r9)
                goto L12
            L4c:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.markdown.render.AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1.AnonymousClass3.emit(java.lang.String, X.HtJ):java.lang.Object");
        }

        @Override // X.C20Z
        public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
            return emit((String) obj, (HtJ<? super Unit>) htJ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1(C1BO<String> c1bo, MutableState<ParsedSource> mutableState, HtJ<? super AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1> htJ) {
        super(2, htJ);
        this.$latestSource = c1bo;
        this.$parsed = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1(this.$latestSource, this.$parsed, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            final C1BO<String> c1bo = this.$latestSource;
            C20Q c20qA01 = AbstractC05623ug.A01(new AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1$invokeSuspend$$inlined$filter$1(C6v3.A01(new Function0() { // from class: com.facebook.aura.markdown.render.AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c1bo.getValue();
                }
            }), this.$parsed));
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$parsed);
            this.label = 1;
            if (c20qA01.collect(anonymousClass3, this) == enumC10460Hji) {
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
        return ((AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
