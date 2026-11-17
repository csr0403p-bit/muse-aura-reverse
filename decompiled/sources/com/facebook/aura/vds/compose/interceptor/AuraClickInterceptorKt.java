package com.facebook.aura.vds.compose.interceptor;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import X.InterfaceC05011Yg;
import X.InterfaceC1072AWd;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraClickInterceptorKt {

    /* renamed from: com.facebook.aura.vds.compose.interceptor.AuraClickInterceptorKt$AuraClickInterceptor$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ InterfaceC05011Yg $indication;
        public final /* synthetic */ InterfaceC1072AWd $interactionSource;
        public final /* synthetic */ boolean $interceptOnClick;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $onClickLabel;
        public final /* synthetic */ Function0<Unit> $onLongClick;
        public final /* synthetic */ String $onLongClickLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(boolean z, Function0<Unit> function0, BRg bRg, boolean z2, String str, Function0<Unit> function02, String str2, InterfaceC1072AWd interfaceC1072AWd, InterfaceC05011Yg interfaceC05011Yg, String str3, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2, int i3) {
            super(2);
            this.$interceptOnClick = z;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$enabled = z2;
            this.$onClickLabel = str;
            this.$onLongClick = function02;
            this.$onLongClickLabel = str2;
            this.$interactionSource = interfaceC1072AWd;
            this.$indication = interfaceC05011Yg;
            this.$contentDescription = str3;
            this.$content = g0v;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraClickInterceptorKt.AuraClickInterceptor(this.$interceptOnClick, this.$onClick, this.$modifier, this.$enabled, this.$onClickLabel, this.$onLongClick, this.$onLongClickLabel, this.$interactionSource, this.$indication, this.$contentDescription, this.$content, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraClickInterceptor(boolean r28, kotlin.jvm.functions.Function0<kotlin.Unit> r29, X.BRg r30, boolean r31, java.lang.String r32, kotlin.jvm.functions.Function0<kotlin.Unit> r33, java.lang.String r34, X.InterfaceC1072AWd r35, X.InterfaceC05011Yg r36, java.lang.String r37, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r38, X.BFM r39, int r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.interceptor.AuraClickInterceptorKt.AuraClickInterceptor(boolean, kotlin.jvm.functions.Function0, X.BRg, boolean, java.lang.String, kotlin.jvm.functions.Function0, java.lang.String, X.AWd, X.1Yg, java.lang.String, X.G0V, X.BFM, int, int, int):void");
    }
}
